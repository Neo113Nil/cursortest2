package r1;

import S0.InterfaceC3967k;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.K0;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import l1.C7795M;
import l1.C7809a0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o {
    @NotNull
    public static final void a(@NotNull C9155c c9155c, @NotNull l lVar) {
        int size = lVar.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            n c11 = lVar.c(i11);
            if (c11 instanceof p) {
                f fVar = new f();
                p pVar = (p) c11;
                fVar.i(pVar.e());
                fVar.j(pVar.h());
                fVar.c();
                fVar.g(pVar.b());
                fVar.h(pVar.c());
                fVar.k(pVar.i());
                fVar.l(pVar.k());
                fVar.p(pVar.o());
                fVar.m(pVar.l());
                fVar.n(pVar.m());
                fVar.o(pVar.n());
                fVar.s(pVar.s());
                fVar.q(pVar.q());
                fVar.r(pVar.r());
                c9155c.g(i11, fVar);
            } else if (c11 instanceof l) {
                C9155c c9155c2 = new C9155c();
                l lVar2 = (l) c11;
                c9155c2.l(lVar2.h());
                c9155c2.o(lVar2.l());
                c9155c2.p(lVar2.m());
                c9155c2.q(lVar2.n());
                c9155c2.r(lVar2.o());
                c9155c2.s(lVar2.q());
                c9155c2.m(lVar2.i());
                c9155c2.n(lVar2.k());
                c9155c2.k(lVar2.e());
                a(c9155c2, lVar2);
                c9155c.g(i11, c9155c2);
            }
        }
    }

    @NotNull
    public static final VectorPainter b(@NotNull C9156d c9156d, InterfaceC3967k interfaceC3967k) {
        Z1.d dVar = (Z1.d) interfaceC3967k.m(K0.e());
        float d11 = c9156d.d();
        boolean s11 = interfaceC3967k.s((Float.floatToRawIntBits(dVar.g()) & 4294967295L) | (Float.floatToRawIntBits(d11) << 32));
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            C9155c c9155c = new C9155c();
            a(c9155c, c9156d.f());
            Unit unit = Unit.f71690a;
            long a11 = C7465k.a(dVar.v1(c9156d.c()), dVar.v1(c9156d.b()));
            float j11 = c9156d.j();
            float i11 = c9156d.i();
            if (Float.isNaN(j11)) {
                j11 = C7464j.f(a11);
            }
            if (Float.isNaN(i11)) {
                i11 = C7464j.d(a11);
            }
            long a12 = C7465k.a(j11, i11);
            VectorPainter vectorPainter = new VectorPainter(c9155c);
            String e11 = c9156d.e();
            long h11 = c9156d.h();
            C7795M a13 = h11 != 16 ? C7809a0.a.a(c9156d.g(), h11) : null;
            boolean a14 = c9156d.a();
            vectorPainter.j(a11);
            vectorPainter.g(a14);
            vectorPainter.h(a13);
            vectorPainter.k(a12);
            vectorPainter.i(e11);
            interfaceC3967k.x(vectorPainter);
            C11 = vectorPainter;
        }
        return (VectorPainter) C11;
    }
}
