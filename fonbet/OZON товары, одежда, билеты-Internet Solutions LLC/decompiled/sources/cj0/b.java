package cj0;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import K1.A;
import P0.E;
import P0.p2;
import P0.u2;
import P0.v2;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import cj0.c;
import cj0.d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import t0.p;
import t0.q;

/* loaded from: classes3.dex */
public final class b {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f57193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f57194c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<c.a, Unit> f57195d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f57196e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f57197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f57198g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, e eVar, Function1<? super c.a, Unit> function1, Function0<Unit> function0, int i11, int i12) {
            super(2);
            this.f57193b = str;
            this.f57194c = eVar;
            this.f57195d = function1;
            this.f57196e = function0;
            this.f57197f = i11;
            this.f57198g = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f57197f | 1);
            String str = this.f57193b;
            e eVar = this.f57194c;
            b.a(str, eVar, this.f57195d, this.f57196e, interfaceC3967k, e11, this.f57198g);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull String label, e eVar, Function1<? super c.a, Unit> function1, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function0<Unit> function02;
        int i14;
        C5839a c5839a;
        Function0<Unit> function03;
        e eVar2;
        e b11;
        Function0<Unit> function04;
        Intrinsics.checkNotNullParameter(label, "label");
        C3969l u11 = interfaceC3967k.u(1168471040);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(label) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i12 & 8;
        if (i15 != 0) {
            i14 = i13 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i14 = i13 | (u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        }
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
            function04 = function02;
        } else {
            Function0<Unit> function05 = i15 != 0 ? null : function02;
            c.a aVar = new c.a();
            function1.invoke(aVar);
            c a11 = aVar.a();
            float f7 = !a11.a() ? 8 : 2;
            d b12 = a11.b();
            b12.getClass();
            u11.o(-1305089656);
            aj0.d dVar = (aj0.d) u11.m(Zi0.a.b());
            if (b12.equals(d.a.f57203a)) {
                c5839a = new C5839a(dVar.b(), dVar.f());
            } else if (b12.equals(d.b.f57204a)) {
                c5839a = new C5839a(dVar.b(), dVar.g());
            } else if (b12.equals(d.C0869d.f57206a)) {
                c5839a = new C5839a(dVar.c(), dVar.e());
            } else {
                if (!b12.equals(d.c.f57205a)) {
                    throw new o();
                }
                c5839a = new C5839a(dVar.a(), dVar.e());
            }
            C5839a c5839a2 = c5839a;
            Object b13 = h.b(u11, 1977855223);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = p.a();
                u11.x(b13);
            }
            q qVar = (q) b13;
            u11.k();
            if (function05 != null) {
                e.a aVar2 = e.f40358c0;
                Intrinsics.f(function05);
                function03 = function05;
                eVar2 = eVar.l0(i.b(aVar2, qVar, null, false, null, null, function05, 28));
            } else {
                function03 = function05;
                eVar2 = eVar;
            }
            float f11 = 8;
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(eVar2, 24), A0.h.b(f11)), c5839a2.a(), y0.a());
            float f12 = 2;
            e i16 = T.i(b11, f11, f12, f7, f12);
            Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = androidx.compose.ui.c.f(u11, i16);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b14, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            e.a aVar3 = e.f40358c0;
            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(InterfaceC6250b.a.i());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            p2.b(label, verticalAlignElement.l0(new LayoutWeightElement(1.0f, false)), c5839a2.b(), 0L, 0L, null, 0L, 2, false, 1, 0, K1.T.c(((u2) u11.m(v2.a())).j(), 0L, 0L, null, null, null, 0L, null, null, 0L, new A(), null, 16252927), u11, i14 & 14, 3120, 55288);
            u11 = u11;
            u11.o(801199722);
            if (a11.a()) {
                E.b(K0.b.a(), null, a0.n(T.j(aVar3, f12, 0.0f, 0.0f, 0.0f, 14), 16), c5839a2.b(), u11, 432, 0);
            }
            u11.k();
            u11.f();
            function04 = function03;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(label, eVar, function1, function04, i11, i12));
        }
    }
}
