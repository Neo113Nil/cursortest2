package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class G1 extends Handler {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(Looper looper) {
        super(looper);
        looper.getClass();
        this.a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        int i = message.what;
        if (i == 1001 && this.a) {
            this.a = false;
            I1.a(false);
        } else {
            if (i != 1002 || this.a) {
                return;
            }
            this.a = true;
            I1.a(true);
        }
    }
}
