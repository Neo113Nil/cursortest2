package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes13.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;
    private static volatile RequestManager b;
    private static Handler c;
    private static final Object a = new Object();
    private static Queue<HuaweiApi.RequestHandler> d = new ConcurrentLinkedQueue();
    private static Map<String, HuaweiApi.RequestHandler> e = new LinkedHashMap();

    private RequestManager(Looper looper) {
        c = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        d.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        Handler handler = c;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.e.put(str, requestHandler);
            }
        });
    }

    private void b() {
        while (!d.isEmpty()) {
            HuaweiApi.RequestHandler poll = d.poll();
            if (poll != null) {
                Object client = poll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    poll.onConnected();
                }
            }
        }
    }

    private void c() {
        while (!d.isEmpty()) {
            d.poll().onConnectionSuspended(1);
        }
        d();
    }

    private void d() {
        e.size();
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it = e.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e2) {
                e2.getMessage();
            }
            it.remove();
        }
    }

    public static Handler getHandler() {
        return c;
    }

    public static RequestManager getInstance() {
        synchronized (a) {
            try {
                if (b == null) {
                    HandlerThread handlerThread = new HandlerThread("RequestManager");
                    handlerThread.start();
                    b = new RequestManager(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static void removeReqByTransId(final String str) {
        Handler handler = c;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.e.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        switch (message.what) {
            case NOTIFY_CONNECT_SUCCESS /* 10011 */:
                b();
                break;
            case NOTIFY_CONNECT_FAILED /* 10012 */:
                a(message);
                break;
            case NOTIFY_CONNECT_SUSPENDED /* 10013 */:
                c();
                break;
        }
        return false;
    }

    private void a(Message message) {
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            d.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e2) {
            e2.getMessage();
        }
    }
}
