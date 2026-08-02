package ru.ozon.debugMenu.internal.core.ui.widgets.radio;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import I1.i;
import Nk.a;
import S0.A0;
import S0.A1;
import S0.F1;
import S0.InterfaceC3967k;
import Z1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.selection.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l0.M;
import l1.C7807Z;
import m0.C8004n;
import m0.D0;
import m0.F;
import m0.H0;
import m0.T0;
import m0.U0;
import m0.W0;
import m1.AbstractC8032c;
import m3.C8060b;
import n0.C8385f;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import t0.p;
import t0.q;
import y20.C10833a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\n\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "", "selected", "Landroidx/compose/ui/e;", "modifier", "enabled", "Lt0/q;", "interactionSource", "DebugMenuRadio", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/e;ZLt0/q;LS0/k;II)V", "showBorder", "LZ1/h;", "borderWidth", "Ll1/Z;", "backgroundColor", "borderColor", "borderToBackground-cwJlQlQ", "(Landroidx/compose/ui/e;ZFJJ)Landroidx/compose/ui/e;", "borderToBackground", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuRadioKt {
    public static final void DebugMenuRadio(Function0<Unit> function0, boolean z11, e eVar, boolean z12, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        long d11;
        long d12;
        long d13;
        long e11;
        long e12;
        long e13;
        long f7;
        boolean z13;
        long j11;
        int i13;
        e eVar2;
        interfaceC3967k.o(-1339250723);
        e eVar3 = (i12 & 4) != 0 ? e.f40358c0 : eVar;
        boolean z14 = (i12 & 8) != 0 ? true : z12;
        if ((i12 & 16) != 0) {
            interfaceC3967k.o(644253097);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            qVar2 = (q) C11;
        } else {
            qVar2 = qVar;
        }
        int i14 = (i11 >> 3) & 14;
        D0 g10 = H0.g(Boolean.valueOf(z11), "Radio", interfaceC3967k, i14 | 48);
        T0 d14 = z11 ? C8004n.d(100, 0, F.f(), 2) : C8004n.d(100, 0, F.b(), 2);
        T0 d15 = z11 ? C8004n.d(100, 0, F.f(), 2) : C8004n.d(100, 0, F.b(), 2);
        DebugMenuRadioKt$DebugMenuRadio$backgroundColor$2 debugMenuRadioKt$DebugMenuRadio$backgroundColor$2 = new DebugMenuRadioKt$DebugMenuRadio$backgroundColor$2(d15);
        boolean booleanValue = ((Boolean) g10.n()).booleanValue();
        interfaceC3967k.o(1605042120);
        if (z14) {
            interfaceC3967k.o(-550884345);
            if (booleanValue) {
                interfaceC3967k.o(1921893744);
                d11 = C10833a.a(interfaceC3967k).b();
            } else {
                interfaceC3967k.o(1921895122);
                d11 = C10833a.a(interfaceC3967k).c();
            }
            interfaceC3967k.k();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-550759043);
            d11 = C10833a.a(interfaceC3967k).d();
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        AbstractC8032c s11 = C7807Z.s(d11);
        boolean n11 = interfaceC3967k.n(s11);
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            C12 = (U0) M.a().invoke(s11);
            interfaceC3967k.x(C12);
        }
        U0 u02 = (U0) C12;
        boolean booleanValue2 = ((Boolean) g10.h()).booleanValue();
        interfaceC3967k.o(1605042120);
        if (z14) {
            interfaceC3967k.o(-550884345);
            if (booleanValue2) {
                interfaceC3967k.o(1921893744);
                d12 = C10833a.a(interfaceC3967k).b();
            } else {
                interfaceC3967k.o(1921895122);
                d12 = C10833a.a(interfaceC3967k).c();
            }
            interfaceC3967k.k();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-550759043);
            d12 = C10833a.a(interfaceC3967k).d();
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        C7807Z m11 = C7807Z.m(d12);
        boolean booleanValue3 = ((Boolean) g10.n()).booleanValue();
        interfaceC3967k.o(1605042120);
        if (z14) {
            interfaceC3967k.o(-550884345);
            if (booleanValue3) {
                interfaceC3967k.o(1921893744);
                d13 = C10833a.a(interfaceC3967k).b();
            } else {
                interfaceC3967k.o(1921895122);
                d13 = C10833a.a(interfaceC3967k).c();
            }
            interfaceC3967k.k();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-550759043);
            d13 = C10833a.a(interfaceC3967k).d();
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        D0.d d16 = H0.d(g10, m11, C7807Z.m(d13), debugMenuRadioKt$DebugMenuRadio$backgroundColor$2.invoke((DebugMenuRadioKt$DebugMenuRadio$backgroundColor$2) g10.m(), (D0.b) interfaceC3967k, (InterfaceC3967k) 0), u02, interfaceC3967k, 196608);
        DebugMenuRadioKt$DebugMenuRadio$borderColor$2 debugMenuRadioKt$DebugMenuRadio$borderColor$2 = new DebugMenuRadioKt$DebugMenuRadio$borderColor$2(d15);
        boolean booleanValue4 = ((Boolean) g10.n()).booleanValue();
        interfaceC3967k.o(545088838);
        if (booleanValue4) {
            interfaceC3967k.o(1921904848);
            e11 = C10833a.a(interfaceC3967k).b();
        } else {
            interfaceC3967k.o(1921906234);
            e11 = C10833a.a(interfaceC3967k).e();
        }
        interfaceC3967k.k();
        interfaceC3967k.k();
        AbstractC8032c s12 = C7807Z.s(e11);
        boolean n12 = interfaceC3967k.n(s12);
        Object C13 = interfaceC3967k.C();
        if (n12 || C13 == InterfaceC3967k.a.a()) {
            C13 = (U0) M.a().invoke(s12);
            interfaceC3967k.x(C13);
        }
        U0 u03 = (U0) C13;
        boolean booleanValue5 = ((Boolean) g10.h()).booleanValue();
        interfaceC3967k.o(545088838);
        if (booleanValue5) {
            interfaceC3967k.o(1921904848);
            e12 = C10833a.a(interfaceC3967k).b();
        } else {
            interfaceC3967k.o(1921906234);
            e12 = C10833a.a(interfaceC3967k).e();
        }
        interfaceC3967k.k();
        interfaceC3967k.k();
        C7807Z m12 = C7807Z.m(e12);
        boolean booleanValue6 = ((Boolean) g10.n()).booleanValue();
        interfaceC3967k.o(545088838);
        if (booleanValue6) {
            interfaceC3967k.o(1921904848);
            e13 = C10833a.a(interfaceC3967k).b();
        } else {
            interfaceC3967k.o(1921906234);
            e13 = C10833a.a(interfaceC3967k).e();
        }
        interfaceC3967k.k();
        interfaceC3967k.k();
        D0.d d17 = H0.d(g10, m12, C7807Z.m(e13), debugMenuRadioKt$DebugMenuRadio$borderColor$2.invoke((DebugMenuRadioKt$DebugMenuRadio$borderColor$2) g10.m(), (D0.b) interfaceC3967k, (InterfaceC3967k) 0), u03, interfaceC3967k, 196608);
        if (z14) {
            interfaceC3967k.o(-1501895675);
            f7 = C10833a.a(interfaceC3967k).j();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1501831040);
            f7 = C10833a.a(interfaceC3967k).f();
            interfaceC3967k.k();
        }
        long j12 = f7;
        DebugMenuRadioKt$DebugMenuRadio$borderWidth$2 debugMenuRadioKt$DebugMenuRadio$borderWidth$2 = new DebugMenuRadioKt$DebugMenuRadio$borderWidth$2(d14);
        U0 e14 = W0.e();
        boolean booleanValue7 = ((Boolean) g10.h()).booleanValue();
        interfaceC3967k.o(-1152884673);
        float f11 = booleanValue7 ? 6 : 1;
        interfaceC3967k.k();
        h a11 = h.a(f11);
        boolean booleanValue8 = ((Boolean) g10.n()).booleanValue();
        interfaceC3967k.o(-1152884673);
        float f12 = booleanValue8 ? 6 : 1;
        interfaceC3967k.k();
        D0.d d18 = H0.d(g10, a11, h.a(f12), debugMenuRadioKt$DebugMenuRadio$borderWidth$2.invoke((DebugMenuRadioKt$DebugMenuRadio$borderWidth$2) g10.m(), (D0.b) interfaceC3967k, (InterfaceC3967k) 0), e14, interfaceC3967k, 196608);
        if (function0 != null) {
            j11 = j12;
            i13 = 2;
            z13 = false;
            eVar2 = c.a(e.f40358c0, z11, qVar2, null, z14, i.a(3), function0);
        } else {
            z13 = false;
            j11 = j12;
            i13 = 2;
            eVar2 = e.f40358c0;
        }
        e m1640borderToBackgroundcwJlQlQ = m1640borderToBackgroundcwJlQlQ(C6988h.a(a0.n(T.f(b.a(eVar3, DebugMenuRadioTestTags.Container).l0(eVar2), i13), 20), A0.h.e()), false, DebugMenuRadio$lambda$6(d18), DebugMenuRadio$lambda$2(d16), DebugMenuRadio$lambda$4(d17));
        V f13 = C5185h.f(InterfaceC6250b.a.e(), z13);
        int I11 = interfaceC3967k.I();
        A0 d19 = interfaceC3967k.d();
        e f14 = androidx.compose.ui.c.f(interfaceC3967k, m1640borderToBackgroundcwJlQlQ);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 d21 = C2454a.d(interfaceC3967k, f13, interfaceC3967k, d19);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d21, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f14, InterfaceC2801g.a.f());
        G.c(z11, null, A20.a.b(), A20.a.a(), null, a1.c.c(-963020485, new DebugMenuRadioKt$DebugMenuRadio$2$1(j11), interfaceC3967k), interfaceC3967k, i14 | 196608, 18);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    private static final long DebugMenuRadio$lambda$2(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    private static final long DebugMenuRadio$lambda$4(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    private static final float DebugMenuRadio$lambda$6(A1<h> a12) {
        return a12.getValue().d();
    }

    /* renamed from: borderToBackground-cwJlQlQ, reason: not valid java name */
    private static final e m1640borderToBackgroundcwJlQlQ(e eVar, boolean z11, float f7, long j11, long j12) {
        return z11 ? eVar.l0(androidx.compose.foundation.e.b(C8385f.c(f7, j12, e.f40358c0, A0.h.e()), j11, A0.h.e())) : eVar.l0(androidx.compose.foundation.e.b(e.f40358c0, j11, A0.h.e()));
    }
}
