package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;

/* compiled from: PlatformVelocityTracker.kt */
/* loaded from: classes11.dex */
public final class a {
    public final VelocityTracker1D a;
    public final VelocityTracker1D b;
    public long c;

    public a() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
        this.a = new VelocityTracker1D(false, strategy);
        this.b = new VelocityTracker1D(false, strategy);
    }

    public final void a(long j, long j2) {
        this.a.a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        this.b.a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }
}
