package n0;

import android.view.View;
import android.widget.Magnifier;
import hd.C6915b;
import k1.C7459e;
import k1.C7464j;
import n0.Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a0 implements Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f76146a = new a0();

    public static final class a extends Z.a {
        @Override // n0.Z.a, n0.X
        public final void b(long j11, long j12, float f7) {
            if (!Float.isNaN(f7)) {
                d().setZoom(f7);
            }
            if (P9.a.d(j12)) {
                d().show(C7459e.g(j11), C7459e.h(j11), C7459e.g(j12), C7459e.h(j12));
            } else {
                d().show(C7459e.g(j11), C7459e.h(j11));
            }
        }
    }

    @Override // n0.Y
    public final boolean a() {
        return true;
    }

    @Override // n0.Y
    public final X b(View view, boolean z11, long j11, float f7, float f11, boolean z12, Z1.d dVar, float f12) {
        if (z11) {
            return new a(new Magnifier(view));
        }
        long D02 = dVar.D0(j11);
        float v12 = dVar.v1(f7);
        float v13 = dVar.v1(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (D02 != 9205357640488583168L) {
            builder.setSize(C6915b.c(C7464j.f(D02)), C6915b.c(C7464j.d(D02)));
        }
        if (!Float.isNaN(v12)) {
            builder.setCornerRadius(v12);
        }
        if (!Float.isNaN(v13)) {
            builder.setElevation(v13);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z12);
        return new a(builder.build());
    }
}
