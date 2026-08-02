package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1096Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1101Sx A01;

    public CallableC1096Ss(C1101Sx c1101Sx, C1097St c1097St) {
        this.A01 = c1101Sx;
        new Handler(Looper.getMainLooper()).post(new C1698gl(this, c1101Sx, c1097St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1097St c1097St) {
        T8 t8;
        T8 t82;
        long currentTimeMillis = System.currentTimeMillis();
        t8 = this.A01.A04;
        C1626fb A06 = C1626fb.A06(t8.A02());
        Uri A00 = XB.A00(c1097St.A08);
        long j = c1097St.A00;
        if (j == -1) {
            t82 = this.A01.A04;
            j = C1145Up.A0S(t82);
        }
        A06.A0I(A00, new C1697gk(this, c1097St, j, currentTimeMillis), j);
    }
}
