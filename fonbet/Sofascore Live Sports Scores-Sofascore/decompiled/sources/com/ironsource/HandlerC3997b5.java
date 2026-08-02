package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class HandlerC3997b5 extends Handler {
    private static final String b = "DownloadHandler";
    Nc a;

    public HandlerC3997b5(Looper looper) {
        super(looper);
    }

    public void a(Nc nc) {
        if (nc != null) {
            this.a = nc;
        } else {
            ilg.c();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Nc nc = this.a;
        if (nc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                nc.a((C4376w8) message.obj);
            } else {
                this.a.a((C4376w8) message.obj, new C4215n8(i, C4348ug.a(i)));
            }
        } catch (Throwable th) {
            C4157k4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.a = null;
    }
}
