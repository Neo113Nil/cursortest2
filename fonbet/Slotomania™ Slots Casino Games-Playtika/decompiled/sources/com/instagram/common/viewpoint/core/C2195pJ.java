package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2195pJ implements C4X {
    public static final List<C2196pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C2195pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C2196pK A00() {
        C2196pK c2196pK;
        synchronized (A01) {
            c2196pK = A01.isEmpty() ? new C2196pK() : A01.remove(A01.size() - 1);
        }
        return c2196pK;
    }

    public static void A01(C2196pK c2196pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2196pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean A9n(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2196pK ACg(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2196pK ACh(int i, int i2, int i3) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2196pK ACi(int i, int i2, int i3, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2196pK ACj(int i, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final void AIT(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJA(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJB(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C2196pK) c4w).A03(this.A00);
    }
}
