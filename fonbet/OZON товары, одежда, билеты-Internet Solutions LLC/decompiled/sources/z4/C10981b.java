package z4;

import B1.InterfaceC2547p;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import B1.s0;
import S0.InterfaceC3967k;
import Z1.d;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import fd.InterfaceC6511n;
import hd.C6915b;
import k1.C7464j;
import k1.C7465k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10981b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [S0.k] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.e] */
    @NotNull
    public static final e a(@NotNull e.a resizeWithContentScale, @NotNull final InterfaceC2547p contentScale, C7464j c7464j, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(resizeWithContentScale, "$this$resizeWithContentScale");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        interfaceC3967k.o(-363477779);
        final d dVar = (d) interfaceC3967k.m(K0.e());
        e.a aVar = e.f40358c0;
        e.a aVar2 = null;
        e v11 = a0.v(a0.d(aVar), null, 3);
        if (c7464j != null) {
            final long i12 = c7464j.i();
            interfaceC3967k.o(-1859173560);
            boolean z11 = true;
            boolean s11 = ((((i11 & 7168) ^ 3072) > 2048 && interfaceC3967k.n(dVar)) || (i11 & 3072) == 2048) | interfaceC3967k.s(i12);
            if ((((i11 & 112) ^ 48) <= 32 || !interfaceC3967k.n(contentScale)) && (i11 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = s11 | z11;
            Object C11 = interfaceC3967k.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new InterfaceC6511n() { // from class: z4.a
                    @Override // fd.InterfaceC6511n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        W z02;
                        Y layout = (Y) obj;
                        U measurable = (U) obj2;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        long j11 = i12;
                        float f7 = C7464j.f(j11);
                        d dVar2 = d.this;
                        long a11 = C7465k.a(dVar2.v1(f7), dVar2.v1(C7464j.d(j11)));
                        long a12 = contentScale.a(a11, C7465k.a(Z1.b.k(r14.p()), Z1.b.j(r14.p())));
                        m0 a02 = measurable.a0(Z1.b.c(0, C6915b.c(s0.a(a12) * C7464j.f(a11)), 0, C6915b.c(s0.b(a12) * C7464j.d(a11)), 5, ((Z1.b) obj3).p()));
                        z02 = layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new y4.b(a02, 1));
                        return z02;
                    }
                };
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            aVar2 = androidx.compose.ui.layout.b.a((InterfaceC6511n) C11, aVar);
        }
        if (aVar2 != null) {
            aVar = aVar2;
        }
        e l02 = v11.l0(aVar);
        interfaceC3967k.k();
        return l02;
    }
}
