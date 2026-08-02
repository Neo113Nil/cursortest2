package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.NodeClient;
import com.google.android.gms.wearable.internal.zzba;
import defpackage.qfn;
import defpackage.r8p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class WearableListenerService extends Service implements DataApi.DataListener, MessageApi.MessageListener, NodeClient.OnNodeMigratedListener, CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, MessageClient.RpcService {
    public ComponentName a;
    public r8p b;
    public qfn c;
    public Intent d;
    public HandlerThread e;
    public boolean g;
    public final Object f = new Object();
    public final zzba h = new zzba(new c(this));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.NODE_MIGRATED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        return r2.c;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IBinder onBind(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -1487371046:
                break;
            case -1140095138:
                break;
            case -786751258:
                break;
            case 705066793:
                break;
            case 915816236:
                break;
            case 1003809169:
                break;
            case 1460975593:
                break;
            default:
                if (!Log.isLoggable("WearableLS", 3)) {
                    return null;
                }
                new StringBuilder(intent.toString().length() + 46);
                return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            "onCreate: ".concat(String.valueOf(this.a));
        }
        HandlerThread handlerThread = this.e;
        if (handlerThread == null) {
            handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.e = handlerThread;
        }
        this.b = new r8p(this, handlerThread.getLooper());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.c = new qfn(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            "onDestroy: ".concat(String.valueOf(this.a));
        }
        synchronized (this.f) {
            this.g = true;
            r8p r8pVar = this.b;
            if (r8pVar == null) {
                String valueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(valueOf.length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            WearableListenerService wearableListenerService = r8pVar.c;
            HandlerThread handlerThread = wearableListenerService.e;
            if (handlerThread == null) {
                r8pVar.getLooper().quit();
            } else {
                handlerThread.quitSafely();
                try {
                    wearableListenerService.e.join();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                wearableListenerService.e = null;
            }
            r8pVar.b("quit");
        }
        super.onDestroy();
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void b(CapabilityInfo capabilityInfo) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void d(Channel channel) {
    }

    public void g(MessageEvent messageEvent) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void a(Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void c(Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void e(Channel channel, int i, int i2) {
    }
}
