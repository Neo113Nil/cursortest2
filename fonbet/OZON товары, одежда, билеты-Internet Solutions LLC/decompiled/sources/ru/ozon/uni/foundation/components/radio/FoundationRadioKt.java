package ru.ozon.uni.foundation.components.radio;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.i;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.selection.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import m0.D0;
import m0.H0;
import m0.T0;
import m0.U0;
import m0.W0;
import m1.AbstractC8032c;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.utils.AnimationFactory;
import t0.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u001aÇ\u0001\u0010 \u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&¨\u0006(²\u0006\f\u0010#\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "iconModifier", "Lkotlin/Function0;", "", "onClick", "", "selected", "enabled", "hasError", "Lq1/b;", "icon", "Ll1/Z;", "iconColor", "LZ1/h;", "size", "iconSize", "sizeOffset", "margin", "Lt0/q;", "interactionSource", "disabledBackgroundColor", "selectedErrorBackgroundColor", "selectedErrorBorderColor", "selectedEnabledBackgroundColor", "selectedEnabledBorderColor", "errorBackgroundColor", "errorBorderColor", "enabledBackgroundColor", "enabledBorderColor", "FoundationRadio-YYtx3bQ", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;ZZZLq1/b;JFFFFLt0/q;JJJJJJJJJLS0/k;III)V", "FoundationRadio", "showBorder", "borderWidth", "backgroundColor", "borderColor", "borderToBackground-cwJlQlQ", "(Landroidx/compose/ui/e;ZFJJ)Landroidx/compose/ui/e;", "borderToBackground", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationRadioKt {
    /* renamed from: FoundationRadio-YYtx3bQ, reason: not valid java name */
    public static final void m3026FoundationRadioYYtx3bQ(@NotNull e modifier, @NotNull e iconModifier, Function0<Unit> function0, boolean z11, boolean z12, boolean z13, @NotNull AbstractC8972b icon, long j11, float f7, float f11, float f12, float f13, @NotNull q interactionSource, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        C3969l c3969l;
        e eVar;
        e eVar2;
        C3969l c3969l2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        C3969l u11 = interfaceC3967k.u(1634960007);
        if ((i11 & 6) == 0) {
            i14 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= u11.n(iconModifier) ? 32 : 16;
        }
        int i17 = i11 & 384;
        int i18 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 == 0) {
            i14 |= u11.F(function0) ? 256 : 128;
        }
        int i19 = i11 & 3072;
        int i21 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
            i14 |= u11.p(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 |= u11.p(z13) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.n(icon) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= u11.s(j11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= u11.q(f7) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.q(f11) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = (u11.q(f12) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.q(f13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.n(interactionSource)) {
                i18 = 256;
            }
            i15 |= i18;
        }
        if ((i12 & 3072) == 0) {
            if (u11.s(j12)) {
                i21 = 2048;
            }
            i15 |= i21;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.s(j13) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.s(j14) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.s(j15) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= u11.s(j16) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= u11.s(j17) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= u11.s(j18) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.s(j19) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.s(j21) ? 32 : 16;
        }
        int i22 = i15;
        if ((i14 & 306783379) == 306783378 && (i22 & 306783379) == 306783378 && (i16 & 19) == 18 && u11.b()) {
            u11.j();
            eVar2 = modifier;
            c3969l2 = u11;
        } else {
            int i23 = (i14 >> 9) & 14;
            D0 g10 = H0.g(Boolean.valueOf(z11), "Radio", u11, i23 | 48);
            T0<h> easeOutCircDp$uni_release = z11 ? AnimationFactory.INSTANCE.easeOutCircDp$uni_release() : AnimationFactory.INSTANCE.easeInCircDp$uni_release();
            T0<C7807Z> easeOutCircColor$uni_release = z11 ? AnimationFactory.INSTANCE.easeOutCircColor$uni_release() : AnimationFactory.INSTANCE.easeInCircColor$uni_release();
            FoundationRadioKt$FoundationRadio$backgroundColor$2 foundationRadioKt$FoundationRadio$backgroundColor$2 = new FoundationRadioKt$FoundationRadio$backgroundColor$2(easeOutCircColor$uni_release);
            boolean booleanValue = ((Boolean) g10.n()).booleanValue();
            u11.o(-50945358);
            long j22 = z13 ? booleanValue ? j13 : j17 : z12 ? booleanValue ? j15 : j19 : j12;
            u11.k();
            AbstractC8032c s11 = C7807Z.s(j22);
            boolean n11 = u11.n(s11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = (U0) M.a().invoke(s11);
                u11.x(C11);
            }
            U0 u02 = (U0) C11;
            boolean booleanValue2 = ((Boolean) g10.h()).booleanValue();
            u11.o(-50945358);
            long j23 = z13 ? booleanValue2 ? j13 : j17 : z12 ? booleanValue2 ? j15 : j19 : j12;
            u11.k();
            C7807Z m11 = C7807Z.m(j23);
            boolean booleanValue3 = ((Boolean) g10.n()).booleanValue();
            u11.o(-50945358);
            long j24 = z13 ? booleanValue3 ? j13 : j17 : z12 ? booleanValue3 ? j15 : j19 : j12;
            u11.k();
            D0.d d11 = H0.d(g10, m11, C7807Z.m(j24), foundationRadioKt$FoundationRadio$backgroundColor$2.invoke((FoundationRadioKt$FoundationRadio$backgroundColor$2) g10.m(), (D0.b) u11, (C3969l) 0), u02, u11, 196608);
            FoundationRadioKt$FoundationRadio$borderColor$2 foundationRadioKt$FoundationRadio$borderColor$2 = new FoundationRadioKt$FoundationRadio$borderColor$2(easeOutCircColor$uni_release);
            boolean booleanValue4 = ((Boolean) g10.n()).booleanValue();
            u11.o(1009522352);
            long j25 = z13 ? booleanValue4 ? j14 : j18 : booleanValue4 ? j16 : j21;
            u11.k();
            AbstractC8032c s12 = C7807Z.s(j25);
            boolean n12 = u11.n(s12);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = (U0) M.a().invoke(s12);
                u11.x(C12);
            }
            U0 u03 = (U0) C12;
            boolean booleanValue5 = ((Boolean) g10.h()).booleanValue();
            u11.o(1009522352);
            long j26 = z13 ? booleanValue5 ? j14 : j18 : booleanValue5 ? j16 : j21;
            u11.k();
            C7807Z m12 = C7807Z.m(j26);
            boolean booleanValue6 = ((Boolean) g10.n()).booleanValue();
            u11.o(1009522352);
            long j27 = z13 ? booleanValue6 ? j14 : j18 : booleanValue6 ? j16 : j21;
            u11.k();
            D0.d d12 = H0.d(g10, m12, C7807Z.m(j27), foundationRadioKt$FoundationRadio$borderColor$2.invoke((FoundationRadioKt$FoundationRadio$borderColor$2) g10.m(), (D0.b) u11, (C3969l) 0), u03, u11, 196608);
            FoundationRadioKt$FoundationRadio$borderWidth$2 foundationRadioKt$FoundationRadio$borderWidth$2 = new FoundationRadioKt$FoundationRadio$borderWidth$2(easeOutCircDp$uni_release);
            U0 e11 = W0.e();
            boolean booleanValue7 = ((Boolean) g10.h()).booleanValue();
            u11.o(-2023648151);
            float f14 = booleanValue7 ? (f7 / 2) - f12 : 1;
            u11.k();
            h a11 = h.a(f14);
            boolean booleanValue8 = ((Boolean) g10.n()).booleanValue();
            u11.o(-2023648151);
            float f15 = booleanValue8 ? (f7 / 2) - f12 : 1;
            u11.k();
            D0.d d13 = H0.d(g10, a11, h.a(f15), foundationRadioKt$FoundationRadio$borderWidth$2.invoke((FoundationRadioKt$FoundationRadio$borderWidth$2) g10.m(), (D0.b) u11, (C3969l) 0), e11, u11, 196608);
            if (function0 != null) {
                c3969l = u11;
                eVar = c.a(e.f40358c0, z11, interactionSource, null, z12, i.a(3), function0);
            } else {
                c3969l = u11;
                eVar = e.f40358c0;
            }
            eVar2 = modifier;
            e m3027borderToBackgroundcwJlQlQ = m3027borderToBackgroundcwJlQlQ(C6988h.a(a0.n(T.f(eVar2.l0(eVar), f13), f7), A0.h.e()), z12, FoundationRadio_YYtx3bQ$lambda$5(d13), FoundationRadio_YYtx3bQ$lambda$1(d11), FoundationRadio_YYtx3bQ$lambda$3(d12));
            V f16 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = c3969l.I();
            A0 d14 = c3969l.d();
            e f17 = androidx.compose.ui.c.f(c3969l, m3027borderToBackgroundcwJlQlQ);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, c3969l);
            if (c3969l.t()) {
                c3969l.H(a12);
            } else {
                c3969l.e();
            }
            Function2 f18 = E.f(c3969l, f16, c3969l, d14);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                a.d(I11, c3969l, I11, f18);
            }
            F1.b(c3969l, f17, InterfaceC2801g.a.f());
            AnimationFactory animationFactory = AnimationFactory.INSTANCE;
            C3969l c3969l3 = c3969l;
            G.c(z11, null, animationFactory.animShowIcon$uni_release(), animationFactory.animHideIcon$uni_release(), null, a1.c.c(639847013, new FoundationRadioKt$FoundationRadio$1$1(iconModifier, f11, icon, j11), c3969l), c3969l3, i23 | 196608, 18);
            c3969l2 = c3969l3;
            c3969l2.f();
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new FoundationRadioKt$FoundationRadio$2(eVar2, iconModifier, function0, z11, z12, z13, icon, j11, f7, f11, f12, f13, interactionSource, j12, j13, j14, j15, j16, j17, j18, j19, j21, i11, i12, i13));
        }
    }

    private static final long FoundationRadio_YYtx3bQ$lambda$1(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    private static final long FoundationRadio_YYtx3bQ$lambda$3(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    private static final float FoundationRadio_YYtx3bQ$lambda$5(A1<h> a12) {
        return a12.getValue().d();
    }

    /* renamed from: borderToBackground-cwJlQlQ, reason: not valid java name */
    private static final e m3027borderToBackgroundcwJlQlQ(e eVar, boolean z11, float f7, long j11, long j12) {
        return z11 ? eVar.l0(androidx.compose.foundation.e.b(C8385f.c(f7, j12, e.f40358c0, A0.h.e()), j11, A0.h.e())) : eVar.l0(androidx.compose.foundation.e.b(e.f40358c0, j11, A0.h.e()));
    }
}
