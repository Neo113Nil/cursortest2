package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class HandlerC2378d5 extends Handler {
    private static final String b = "DownloadHandler";
    Nc a;

    public HandlerC2378d5(Looper looper) {
        super(looper);
    }

    public void a(Nc nc) {
        if (nc == null) {
            throw new IllegalArgumentException();
        }
        this.a = nc;
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
                nc.a((C2757y8) message.obj);
            } else {
                this.a.a((C2757y8) message.obj, new C2596p8(i, C2639rg.a(i)));
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.a = null;
    }
}
