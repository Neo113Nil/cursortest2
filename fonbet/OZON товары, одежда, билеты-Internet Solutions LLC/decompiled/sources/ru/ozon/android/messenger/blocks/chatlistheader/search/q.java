package ru.ozon.android.messenger.blocks.chatlistheader.search;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import I0.C3173b;
import Q1.K;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import b1.C5503f;
import b1.C5517t;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;

/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84827b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f84828c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Integer f84829d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f84830e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f84831f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ IconDTO f84832g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ TextDTO f84833h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Integer f84834i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84835j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84836k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84837l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    q(androidx.compose.ui.e eVar, String str, Integer num, boolean z11, ButtonV3DTO buttonV3DTO, IconDTO iconDTO, TextDTO textDTO, Integer num2, Function1<? super K, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.f84827b = eVar;
        this.f84828c = str;
        this.f84829d = num;
        this.f84830e = z11;
        this.f84831f = buttonV3DTO;
        this.f84832g = iconDTO;
        this.f84833h = textDTO;
        this.f84834i = num2;
        this.f84835j = function1;
        this.f84836k = function0;
        this.f84837l = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        C5517t c5517t;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, this.f84827b);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            interfaceC3967k2.o(1370077846);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new j1.r();
                interfaceC3967k2.x(C11);
            }
            j1.r rVar = (j1.r) C11;
            interfaceC3967k2.k();
            Object[] objArr = new Object[0];
            c5517t = x.f84870a;
            interfaceC3967k2.o(1370084087);
            String str = this.f84828c;
            boolean n11 = interfaceC3967k2.n(str);
            Object C12 = interfaceC3967k2.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new p(str);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            InterfaceC3978p0 b11 = C5503f.b(objArr, c5517t, (Function0) C12, interfaceC3967k2);
            Integer num2 = this.f84829d;
            int intValue = num2 != null ? num2.intValue() : 12;
            boolean z11 = this.f84830e;
            Boolean valueOf = Boolean.valueOf(z11);
            interfaceC3967k2.o(1370090098);
            boolean p11 = interfaceC3967k2.p(z11);
            Object C13 = interfaceC3967k2.C();
            if (p11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new h(z11, rVar, null);
                interfaceC3967k2.x(C13);
            }
            interfaceC3967k2.k();
            Q.e(interfaceC3967k2, valueOf, (Function2) C13);
            interfaceC3967k2.o(1370095440);
            boolean n12 = interfaceC3967k2.n(str) | interfaceC3967k2.n(b11);
            Object C14 = interfaceC3967k2.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new i(str, b11, null);
                interfaceC3967k2.x(C14);
            }
            interfaceC3967k2.k();
            Q.e(interfaceC3967k2, str, (Function2) C14);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(androidx.compose.animation.a.a(a0.u(aVar, 3), null, 3), 1.0f);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I12 = interfaceC3967k2.I();
            A0 d13 = interfaceC3967k2.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f13 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d13);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(f13, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f12, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            androidx.compose.ui.e b13 = androidx.compose.foundation.e.b(c9891d.a(a0.f(c9891d.b(aVar, InterfaceC6250b.a.i()), 40), 1.0f, true), UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getBgPrimary(), A0.h.b(intValue));
            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = interfaceC3967k2.I();
            A0 d14 = interfaceC3967k2.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(interfaceC3967k2, b13);
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a13);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d15 = C2454a.d(interfaceC3967k2, f14, interfaceC3967k2, d14);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                Nk.a.d(d15, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f15, InterfaceC2801g.a.f());
            androidx.compose.ui.e b14 = C5187j.f39515a.b(aVar);
            Y b15 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k2, 0);
            int I14 = interfaceC3967k2.I();
            A0 d16 = interfaceC3967k2.d();
            androidx.compose.ui.e f16 = androidx.compose.ui.c.f(interfaceC3967k2, b14);
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a14);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f17 = C3173b.f(interfaceC3967k2, b15, interfaceC3967k2, d16);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I14))) {
                Nk.a.d(f17, I14, interfaceC3967k2, I14);
            }
            F1.b(interfaceC3967k2, f16, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(this.f84832g, T.f(c9891d.b(aVar, InterfaceC6250b.a.i()), 12), interfaceC3967k2, IconDTO.$stable, 0);
            androidx.compose.ui.e a15 = androidx.compose.ui.focus.i.a(a0.e(c9891d.b(aVar, InterfaceC6250b.a.i()), 1.0f), rVar);
            K k11 = (K) b11.getValue();
            interfaceC3967k2.o(-376601573);
            Integer num3 = this.f84834i;
            boolean n13 = interfaceC3967k2.n(num3) | interfaceC3967k2.n(b11);
            Function1<K, Unit> function1 = this.f84835j;
            boolean n14 = n13 | interfaceC3967k2.n(function1);
            Object C15 = interfaceC3967k2.C();
            if (n14 || C15 == InterfaceC3967k.a.a()) {
                C15 = new j(num3, function1, b11);
                interfaceC3967k2.x(C15);
            }
            Function1 function12 = (Function1) C15;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-376561801);
            Function0<Unit> function0 = this.f84836k;
            boolean n15 = interfaceC3967k2.n(function0) | interfaceC3967k2.n(b11) | interfaceC3967k2.n(function1);
            Object C16 = interfaceC3967k2.C();
            if (n15 || C16 == InterfaceC3967k.a.a()) {
                C16 = new k(function0, function1, b11);
                interfaceC3967k2.x(C16);
            }
            interfaceC3967k2.k();
            x.b(a15, k11, z11, this.f84833h, function12, (Function0) C16, interfaceC3967k2, 0);
            interfaceC3967k2.f();
            interfaceC3967k2.f();
            interfaceC3967k2.o(1637556216);
            ButtonV3DTO buttonV3DTO = this.f84831f;
            if (buttonV3DTO != null) {
                androidx.compose.ui.e b16 = c9891d.b(aVar, InterfaceC6250b.a.i());
                androidx.compose.animation.q c11 = androidx.compose.animation.b.h(null, 3).c(androidx.compose.animation.b.e());
                interfaceC3967k2.o(-2070618371);
                Object C17 = interfaceC3967k2.C();
                if (C17 == InterfaceC3967k.a.a()) {
                    C17 = l.f84821b;
                    interfaceC3967k2.x(C17);
                }
                interfaceC3967k2.k();
                androidx.compose.animation.q c12 = c11.c(androidx.compose.animation.b.o((Function1) C17));
                androidx.compose.animation.s c13 = androidx.compose.animation.b.i(null, 3).c(androidx.compose.animation.b.l());
                interfaceC3967k2.o(-2070614787);
                Object C18 = interfaceC3967k2.C();
                if (C18 == InterfaceC3967k.a.a()) {
                    C18 = m.f84822b;
                    interfaceC3967k2.x(C18);
                }
                interfaceC3967k2.k();
                l0.G.d(z11, b16, c12, c13.c(androidx.compose.animation.b.q((Function1) C18)), null, a1.c.c(-1380565266, new o(this.f84837l, buttonV3DTO), interfaceC3967k2), interfaceC3967k2, 1600518, 16);
                Unit unit = Unit.f71690a;
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
