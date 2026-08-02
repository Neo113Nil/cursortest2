package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC2053Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C2058Sx A01;

    public CallableC2053Ss(C2058Sx c2058Sx, C2054St c2054St) {
        this.A01 = c2058Sx;
        new Handler(Looper.getMainLooper()).post(new C2655gl(this, c2058Sx, c2054St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C2054St c2054St) {
        T8 t8;
        T8 t82;
        long currentTimeMillis = System.currentTimeMillis();
        t8 = this.A01.A04;
        C2583fb A06 = C2583fb.A06(t8.A02());
        Uri A00 = XB.A00(c2054St.A08);
        long j = c2054St.A00;
        if (j == -1) {
            t82 = this.A01.A04;
            j = C2102Up.A0S(t82);
        }
        A06.A0I(A00, new C2654gk(this, c2054St, j, currentTimeMillis), j);
    }
}
