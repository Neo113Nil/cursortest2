package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class HandlerC4274d5 extends Handler {
    private static final String b = "DownloadHandler";
    Oc a;

    public HandlerC4274d5(Looper looper) {
        super(looper);
    }

    public void a(Oc oc) {
        if (oc == null) {
            throw new IllegalArgumentException();
        }
        this.a = oc;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Oc oc = this.a;
        if (oc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                oc.a((C4671z8) message.obj);
            } else {
                this.a.a((C4671z8) message.obj, new C4510q8(i, C4643xg.a(i)));
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.a = null;
    }
}
