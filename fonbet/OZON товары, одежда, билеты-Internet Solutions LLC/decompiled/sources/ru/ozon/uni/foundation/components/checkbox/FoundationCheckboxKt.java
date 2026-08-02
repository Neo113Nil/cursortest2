package ru.ozon.uni.foundation.components.checkbox;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import I1.i;
import J1.a;
import K1.T;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u001aó\u0001\u0010(\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0001¢\u0006\u0004\b&\u0010'\u001a;\u0010/\u001a\u00020\u0000*\u00020\u00002\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010.¨\u00060²\u0006\f\u0010+\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "iconModifier", "Lkotlin/Function0;", "", "onClick", "LJ1/a;", "state", "", "enabled", "hasError", "Lq1/b;", "selectedIcon", "indeterminateIcon", "", "quantity", "LK1/T;", "quantityTextStyle", "Ll1/Z;", "iconColor", "LZ1/h;", "size", "iconSize", "sizeOffset", "cornerRadius", "margin", "Lt0/q;", "interactionSource", "disabledBackgroundColor", "disabledSelectedBackgroundColor", "selectedErrorBackgroundColor", "selectedErrorBorderColor", "selectedEnabledBackgroundColor", "selectedEnabledBorderColor", "errorBackgroundColor", "errorBorderColor", "enabledBackgroundColor", "enabledBorderColor", "FoundationCheckbox--Os-3FA", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LJ1/a;ZZLq1/b;Lq1/b;Ljava/lang/Integer;LK1/T;JFFFFFLt0/q;JJJJJJJJJJLS0/k;III)V", "FoundationCheckbox", "showBorder", "borderWidth", "backgroundColor", "borderColor", "borderToBackground-ftHGHZg", "(Landroidx/compose/ui/e;ZFFJJ)Landroidx/compose/ui/e;", "borderToBackground", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FoundationCheckboxKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0486  */
    /* renamed from: FoundationCheckbox--Os-3FA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2987FoundationCheckboxOs3FA(@NotNull e modifier, @NotNull e iconModifier, Function0<Unit> function0, @NotNull a state, boolean z11, boolean z12, @NotNull AbstractC8972b selectedIcon, @NotNull AbstractC8972b indeterminateIcon, Integer num, T t2, long j11, float f7, float f11, float f12, float f13, float f14, @NotNull q interactionSource, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        float f15;
        int i18;
        float f16;
        D0.d dVar;
        boolean z13;
        C3969l c3969l;
        e eVar;
        int I11;
        Object C11;
        C3969l c3969l2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectedIcon, "selectedIcon");
        Intrinsics.checkNotNullParameter(indeterminateIcon, "indeterminateIcon");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        C3969l u11 = interfaceC3967k.u(663863889);
        if ((i11 & 6) == 0) {
            i14 = i11 | (u11.n(modifier) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= u11.n(iconModifier) ? 32 : 16;
        }
        int i19 = i11 & 384;
        int i21 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 == 0) {
            i14 |= u11.F(function0) ? 256 : 128;
        }
        int i22 = i11 & 3072;
        int i23 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 == 0) {
            i14 |= u11.n(state) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 |= u11.p(z12) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.n(selectedIcon) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= u11.n(indeterminateIcon) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= u11.n(num) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.n(t2) ? 536870912 : 268435456;
        }
        int i24 = i14;
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.s(j11) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.q(f7) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= u11.q(f11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= u11.q(f12) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.q(f13) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.q(f14) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.n(interactionSource) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= u11.s(j12) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= u11.s(j13) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= u11.s(j14) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.s(j15) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.s(j16) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (u11.s(j17)) {
                i21 = 256;
            }
            i16 |= i21;
        }
        if ((i13 & 3072) == 0) {
            if (u11.s(j18)) {
                i23 = 2048;
            }
            i16 |= i23;
        }
        if ((i13 & 24576) == 0) {
            i16 |= u11.s(j19) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i16 |= u11.s(j21) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= u11.s(j22) ? 1048576 : 524288;
        }
        if ((i24 & 306783379) == 306783378 && (i15 & 306783379) == 306783378 && (i16 & 599187) == 599186 && u11.b()) {
            u11.j();
            c3969l2 = u11;
        } else {
            D0 g10 = H0.g(state, "Checkbox", u11, ((i24 >> 9) & 14) | 48);
            a aVar = a.Off;
            T0<h> easeOutCircDp$uni_release = state != aVar ? AnimationFactory.INSTANCE.easeOutCircDp$uni_release() : AnimationFactory.INSTANCE.easeInCircDp$uni_release();
            T0<C7807Z> easeOutCircColor$uni_release = state != aVar ? AnimationFactory.INSTANCE.easeOutCircColor$uni_release() : AnimationFactory.INSTANCE.easeInCircColor$uni_release();
            FoundationCheckboxKt$FoundationCheckbox$backgroundColor$2 foundationCheckboxKt$FoundationCheckbox$backgroundColor$2 = new FoundationCheckboxKt$FoundationCheckbox$backgroundColor$2(easeOutCircColor$uni_release);
            a aVar2 = (a) g10.n();
            u11.o(-488530943);
            boolean z14 = aVar2 != aVar;
            long j23 = z12 ? z14 ? j14 : j18 : z11 ? z14 ? j16 : j21 : z14 ? j13 : j12;
            u11.k();
            AbstractC8032c s11 = C7807Z.s(j23);
            boolean n11 = u11.n(s11);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = (U0) M.a().invoke(s11);
                u11.x(C12);
            }
            U0 u02 = (U0) C12;
            a aVar3 = (a) g10.h();
            u11.o(-488530943);
            boolean z15 = aVar3 != aVar;
            long j24 = z12 ? z15 ? j14 : j18 : z11 ? z15 ? j16 : j21 : z15 ? j13 : j12;
            u11.k();
            C7807Z m11 = C7807Z.m(j24);
            a aVar4 = (a) g10.n();
            u11.o(-488530943);
            boolean z16 = aVar4 != aVar;
            long j25 = z12 ? z16 ? j14 : j18 : z11 ? z16 ? j16 : j21 : z16 ? j13 : j12;
            u11.k();
            D0.d d11 = H0.d(g10, m11, C7807Z.m(j25), foundationCheckboxKt$FoundationCheckbox$backgroundColor$2.invoke((FoundationCheckboxKt$FoundationCheckbox$backgroundColor$2) g10.m(), (D0.b) u11, (C3969l) 0), u02, u11, 196608);
            FoundationCheckboxKt$FoundationCheckbox$borderColor$2 foundationCheckboxKt$FoundationCheckbox$borderColor$2 = new FoundationCheckboxKt$FoundationCheckbox$borderColor$2(easeOutCircColor$uni_release);
            a aVar5 = (a) g10.n();
            u11.o(120088191);
            boolean z17 = aVar5 != aVar;
            long j26 = z12 ? z17 ? j15 : j19 : z17 ? j17 : j22;
            u11.k();
            AbstractC8032c s12 = C7807Z.s(j26);
            boolean n12 = u11.n(s12);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = (U0) M.a().invoke(s12);
                u11.x(C13);
            }
            U0 u03 = (U0) C13;
            a aVar6 = (a) g10.h();
            u11.o(120088191);
            boolean z18 = aVar6 != aVar;
            long j27 = z12 ? z18 ? j15 : j19 : z18 ? j17 : j22;
            u11.k();
            C7807Z m12 = C7807Z.m(j27);
            a aVar7 = (a) g10.n();
            u11.o(120088191);
            boolean z19 = aVar7 != aVar;
            long j28 = z12 ? z19 ? j15 : j19 : z19 ? j17 : j22;
            u11.k();
            D0.d d12 = H0.d(g10, m12, C7807Z.m(j28), foundationCheckboxKt$FoundationCheckbox$borderColor$2.invoke((FoundationCheckboxKt$FoundationCheckbox$borderColor$2) g10.m(), (D0.b) u11, (C3969l) 0), u03, u11, 196608);
            FoundationCheckboxKt$FoundationCheckbox$borderWidth$2 foundationCheckboxKt$FoundationCheckbox$borderWidth$2 = new FoundationCheckboxKt$FoundationCheckbox$borderWidth$2(easeOutCircDp$uni_release);
            U0 e11 = W0.e();
            a aVar8 = (a) g10.h();
            u11.o(565335544);
            if (!z11) {
                i17 = 0;
            } else if (aVar8 != aVar) {
                f15 = (f7 / 2) - f12;
                u11.k();
                h a11 = h.a(f15);
                a aVar9 = (a) g10.n();
                u11.o(565335544);
                if (z11) {
                    i18 = 0;
                    f16 = 0;
                } else {
                    f16 = aVar9 != aVar ? (f7 / 2) - f12 : 1;
                    i18 = 0;
                }
                u11.k();
                D0.d d13 = H0.d(g10, a11, h.a(f16), foundationCheckboxKt$FoundationCheckbox$borderWidth$2.invoke((FoundationCheckboxKt$FoundationCheckbox$borderWidth$2) g10.m(), (D0.b) u11, (C3969l) Integer.valueOf(i18)), e11, u11, 196608);
                if (function0 == null) {
                    dVar = d13;
                    z13 = i18;
                    c3969l = u11;
                    eVar = androidx.compose.foundation.selection.e.b(e.f40358c0, state, interactionSource, z11, i.a(1), function0);
                } else {
                    dVar = d13;
                    z13 = i18;
                    c3969l = u11;
                    eVar = e.f40358c0;
                }
                e m2988borderToBackgroundftHGHZg = m2988borderToBackgroundftHGHZg(C6988h.a(a0.n(androidx.compose.foundation.layout.T.f(modifier.l0(eVar), f14), f7), A0.h.b(f13)), z11, FoundationCheckbox__Os_3FA$lambda$5(dVar), f13, FoundationCheckbox__Os_3FA$lambda$1(d11), FoundationCheckbox__Os_3FA$lambda$3(d12));
                V f17 = C5185h.f(InterfaceC6250b.a.e(), z13);
                I11 = c3969l.I();
                A0 d14 = c3969l.d();
                e f18 = c.f(c3969l, m2988borderToBackgroundftHGHZg);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, c3969l);
                if (c3969l.t()) {
                    c3969l.e();
                } else {
                    c3969l.H(a12);
                }
                Function2 f19 = E.f(c3969l, f17, c3969l, d14);
                if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, c3969l, I11, f19);
                }
                F1.b(c3969l, f18, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                Pair pair = new Pair(state, num);
                d e12 = InterfaceC6250b.a.e();
                c3969l.o(-1805519940);
                C11 = c3969l.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = FoundationCheckboxKt$FoundationCheckbox$1$1$1.INSTANCE;
                    c3969l.x(C11);
                }
                c3969l.k();
                C3969l c3969l3 = c3969l;
                C7770n.a(pair, iconModifier, (Function1) C11, e12, null, null, a1.c.c(128525962, new FoundationCheckboxKt$FoundationCheckbox$1$2(t2, c5187j, indeterminateIcon, selectedIcon, j11, f11), c3969l), c3969l3, (i24 & 112) | 1576320, 48);
                c3969l2 = c3969l3;
                c3969l2.f();
            } else {
                i17 = 1;
            }
            f15 = i17;
            u11.k();
            h a112 = h.a(f15);
            a aVar92 = (a) g10.n();
            u11.o(565335544);
            if (z11) {
            }
            u11.k();
            D0.d d132 = H0.d(g10, a112, h.a(f16), foundationCheckboxKt$FoundationCheckbox$borderWidth$2.invoke((FoundationCheckboxKt$FoundationCheckbox$borderWidth$2) g10.m(), (D0.b) u11, (C3969l) Integer.valueOf(i18)), e11, u11, 196608);
            if (function0 == null) {
            }
            e m2988borderToBackgroundftHGHZg2 = m2988borderToBackgroundftHGHZg(C6988h.a(a0.n(androidx.compose.foundation.layout.T.f(modifier.l0(eVar), f14), f7), A0.h.b(f13)), z11, FoundationCheckbox__Os_3FA$lambda$5(dVar), f13, FoundationCheckbox__Os_3FA$lambda$1(d11), FoundationCheckbox__Os_3FA$lambda$3(d12));
            V f172 = C5185h.f(InterfaceC6250b.a.e(), z13);
            I11 = c3969l.I();
            A0 d142 = c3969l.d();
            e f182 = c.f(c3969l, m2988borderToBackgroundftHGHZg2);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, c3969l);
            if (c3969l.t()) {
            }
            Function2 f192 = E.f(c3969l, f172, c3969l, d142);
            if (!c3969l.t()) {
            }
            Ep.a.d(I11, c3969l, I11, f192);
            F1.b(c3969l, f182, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            Pair pair2 = new Pair(state, num);
            d e122 = InterfaceC6250b.a.e();
            c3969l.o(-1805519940);
            C11 = c3969l.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            c3969l.k();
            C3969l c3969l32 = c3969l;
            C7770n.a(pair2, iconModifier, (Function1) C11, e122, null, null, a1.c.c(128525962, new FoundationCheckboxKt$FoundationCheckbox$1$2(t2, c5187j2, indeterminateIcon, selectedIcon, j11, f11), c3969l), c3969l32, (i24 & 112) | 1576320, 48);
            c3969l2 = c3969l32;
            c3969l2.f();
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new FoundationCheckboxKt$FoundationCheckbox$2(modifier, iconModifier, function0, state, z11, z12, selectedIcon, indeterminateIcon, num, t2, j11, f7, f11, f12, f13, f14, interactionSource, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, i11, i12, i13));
        }
    }

    private static final long FoundationCheckbox__Os_3FA$lambda$1(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    private static final long FoundationCheckbox__Os_3FA$lambda$3(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    private static final float FoundationCheckbox__Os_3FA$lambda$5(A1<h> a12) {
        return a12.getValue().d();
    }

    /* renamed from: borderToBackground-ftHGHZg, reason: not valid java name */
    private static final e m2988borderToBackgroundftHGHZg(e eVar, boolean z11, float f7, float f11, long j11, long j12) {
        return z11 ? eVar.l0(androidx.compose.foundation.e.b(C8385f.c(f7, j12, e.f40358c0, A0.h.b(f11)), j11, A0.h.b(f11))) : eVar.l0(androidx.compose.foundation.e.b(e.f40358c0, j11, A0.h.b(f11)));
    }
}
