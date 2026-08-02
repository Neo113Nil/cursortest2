package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class T5 extends Handler {
    private final ConcurrentHashMap<String, Nc> a;

    public T5(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C4376w8 c4376w8 = (C4376w8) message.obj;
            String path = c4376w8.getPath();
            Nc nc = this.a.get(path);
            if (nc == null) {
                return;
            }
            if (a(message.what)) {
                nc.a(c4376w8);
            } else {
                int i = message.what;
                nc.a(c4376w8, new C4215n8(i, C4348ug.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a(String str, Nc nc) {
        if (str == null || nc == null) {
            return;
        }
        this.a.put(str, nc);
    }
}
