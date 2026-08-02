package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class W5 extends Handler {
    private final ConcurrentHashMap<String, Oc> a;

    public W5(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C4671z8 c4671z8 = (C4671z8) message.obj;
            String path = c4671z8.getPath();
            Oc oc = this.a.get(path);
            if (oc == null) {
                return;
            }
            if (a(message.what)) {
                oc.a(c4671z8);
            } else {
                int i = message.what;
                oc.a(c4671z8, new C4510q8(i, C4643xg.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a(String str, Oc oc) {
        if (str == null || oc == null) {
            return;
        }
        this.a.put(str, oc);
    }
}
