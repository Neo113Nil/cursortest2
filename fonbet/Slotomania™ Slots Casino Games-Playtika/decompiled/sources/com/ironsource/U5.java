package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class U5 extends Handler {
    private final ConcurrentHashMap<String, Nc> a;

    public U5(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(String str, Nc nc) {
        if (str == null || nc == null) {
            return;
        }
        this.a.put(str, nc);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C2757y8 c2757y8 = (C2757y8) message.obj;
            String path = c2757y8.getPath();
            Nc nc = this.a.get(path);
            if (nc == null) {
                return;
            }
            if (a(message.what)) {
                nc.a(c2757y8);
            } else {
                int i = message.what;
                nc.a(c2757y8, new C2596p8(i, C2639rg.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
