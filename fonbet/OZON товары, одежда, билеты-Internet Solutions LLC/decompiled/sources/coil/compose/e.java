package coil.compose;

import B1.InterfaceC2547p;
import D1.InterfaceC2801g;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.s;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5239d1;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.c2;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7829k0;
import m5.C8078a;
import m5.C8080c;
import m5.C8086i;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import r1.C9156d;
import v5.C10234h;
import w5.C10432d;
import w5.C10435g;
import w5.InterfaceC10436h;

/* loaded from: classes8.dex */
public final class e {
    public static final void a(Object obj, @NotNull l5.g gVar, androidx.compose.ui.e eVar, Function1 function1, Function1 function12, e1.d dVar, InterfaceC2547p interfaceC2547p, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        C10234h a11;
        InterfaceC10436h interfaceC10436h;
        C3969l u11 = interfaceC3967k.u(-1423043153);
        int i13 = C8086i.f74462b;
        if (obj instanceof C10234h) {
            a11 = (C10234h) obj;
        } else {
            C10234h.a aVar = new C10234h.a((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
            aVar.b(obj);
            a11 = aVar.a();
        }
        u11.B(-1553384610);
        if (a11.q().m() == null) {
            if (interfaceC2547p.equals(InterfaceC2547p.a.f())) {
                interfaceC10436h = new C10432d(C10435g.f103580c);
            } else {
                u11.B(-3687241);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = new C8080c();
                    u11.x(C11);
                }
                u11.K();
                interfaceC10436h = (InterfaceC10436h) C11;
            }
            C10234h.a Q11 = C10234h.Q(a11);
            Q11.g(interfaceC10436h);
            a11 = Q11.a();
        }
        u11.K();
        int i14 = i11 >> 9;
        int i15 = 57344 & i14;
        u11.B(294036008);
        Object m11 = a11.m();
        if (m11 instanceof C10234h.a) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (m11 instanceof InterfaceC7829k0) {
            g.b("ImageBitmap");
            throw null;
        }
        if (m11 instanceof C9156d) {
            g.b("ImageVector");
            throw null;
        }
        if (m11 instanceof AbstractC8972b) {
            g.b("Painter");
            throw null;
        }
        if (a11.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        u11.B(-3687241);
        Object C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new AsyncImagePainter(a11, gVar);
            u11.x(C12);
        }
        u11.K();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) C12;
        asyncImagePainter.r(function1);
        asyncImagePainter.o(function12);
        asyncImagePainter.l(interfaceC2547p);
        asyncImagePainter.m();
        asyncImagePainter.p(((Boolean) u11.m(C5239d1.a())).booleanValue());
        asyncImagePainter.n(gVar);
        asyncImagePainter.q(a11);
        asyncImagePainter.b();
        u11.K();
        InterfaceC10436h K11 = a11.K();
        c(K11 instanceof C8080c ? eVar.l0((androidx.compose.ui.e) K11) : eVar, asyncImagePainter, dVar, interfaceC2547p, u11, i15 | (i14 & 7168) | 384 | (458752 & i14) | (i14 & 3670016));
        J0 m02 = u11.m0();
        if (m02 == null) {
            return;
        }
        m02.G(new b(obj, gVar, eVar, function1, function12, dVar, interfaceC2547p, i11, i12));
    }

    public static final void b(String str, @NotNull l5.g gVar, androidx.compose.ui.e eVar, Function1 function1, Function1 function12, e1.d dVar, InterfaceC2547p.a.b bVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function1 function13;
        C3969l u11 = interfaceC3967k.u(-1423045674);
        int i13 = C8086i.f74462b;
        function13 = AsyncImagePainter.f57212p;
        int i14 = i12 << 18;
        a(str, gVar, eVar, function13, (function1 == null && function12 == null) ? null : new h(function1, function12), dVar, bVar, u11, (i11 & 7168) | 568 | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i12 >> 12) & 14);
        J0 m02 = u11.m0();
        if (m02 == null) {
            return;
        }
        m02.G(new a(str, gVar, eVar, function1, function12, dVar, bVar, i11, i12));
    }

    public static final void c(@NotNull androidx.compose.ui.e eVar, @NotNull AsyncImagePainter asyncImagePainter, @NotNull e1.d dVar, @NotNull InterfaceC2547p interfaceC2547p, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-341425049);
        androidx.compose.ui.e l02 = C6988h.b(eVar).l0(new ContentPainterModifier(asyncImagePainter, dVar, interfaceC2547p));
        c cVar = c.f57270a;
        u11.B(1376091099);
        Z1.d dVar2 = (Z1.d) u11.m(K0.e());
        s sVar = (s) u11.m(K0.k());
        c2 c2Var = (c2) u11.m(K0.r());
        androidx.compose.ui.e d11 = androidx.compose.ui.c.d(u11, l02);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        u11.B(1546164872);
        u11.i();
        if (u11.t()) {
            u11.H(new C8078a(a11));
        } else {
            u11.e();
        }
        u11.d0();
        F1.b(u11, cVar, InterfaceC2801g.a.e());
        F1.b(u11, dVar2, InterfaceC2801g.a.c());
        F1.b(u11, sVar, InterfaceC2801g.a.d());
        F1.b(u11, c2Var, InterfaceC2801g.a.h());
        F1.b(u11, d11, InterfaceC2801g.a.f());
        u11.h0();
        u11.f();
        u11.K();
        u11.K();
        J0 m02 = u11.m0();
        if (m02 == null) {
            return;
        }
        m02.G(new d(eVar, asyncImagePainter, dVar, interfaceC2547p, i11));
    }
}
