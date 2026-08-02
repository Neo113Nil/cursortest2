package ru.ozon.uni.foundation.components.toggle;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.j;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l0.h0;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.utils.AnimationFactory;
import ru.ozon.uni.foundation.utils.ModifierUtilsKt;
import t0.q;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u00ad\u0001\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a[\u0010&\u001a\u00020\n*\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0003¢\u0006\u0004\b$\u0010%¨\u0006)²\u0006\f\u0010'\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "knobModifier", "iconModifier", "", "status", "isEnabled", "Lt0/q;", "interactionSource", "Lkotlin/Function1;", "", "onCheckedChange", "isKnobIconVisible", "Ll1/Z;", "knobBackgroundColor", "Lq1/b;", "knobIcon", "knobIconColor", "LZ1/j;", "size", "LZ1/h;", "verticalPadding", "knobSize", "knobPadding", "untoggledBackgroundColor", "untoggledDisabledBbackgroundColor", "toggledBackgroundColor", "FoundationToggle-McPsvjw", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZZLt0/q;Lkotlin/jvm/functions/Function1;ZJLq1/b;JJFFFJJJLS0/k;II)V", "FoundationToggle", "Lu0/b;", "Le1/b;", "alignment", "isIconVisible", "icon", "iconColor", "Knob-7BdGs9g", "(Lu0/b;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Le1/b;ZLq1/b;JJFFLS0/k;I)V", "Knob", "backgroundColorState", "state", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationToggleKt {
    /* renamed from: FoundationToggle-McPsvjw, reason: not valid java name */
    public static final void m3039FoundationToggleMcPsvjw(@NotNull e modifier, @NotNull e knobModifier, @NotNull e iconModifier, boolean z11, boolean z12, @NotNull q interactionSource, Function1<? super Boolean, Unit> function1, boolean z13, long j11, @NotNull AbstractC8972b knobIcon, long j12, long j13, float f7, float f11, float f12, long j14, long j15, long j16, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        int i17;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(knobModifier, "knobModifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(knobIcon, "knobIcon");
        C3969l u11 = interfaceC3967k.u(-570729832);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(knobModifier) ? 32 : 16;
        }
        int i18 = i11 & 384;
        int i19 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 == 0) {
            i13 |= u11.n(iconModifier) ? 256 : 128;
        }
        int i21 = i11 & 3072;
        int i22 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i21 == 0) {
            i13 |= u11.p(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= u11.n(interactionSource) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.F(function1) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.p(z13) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 = 196608;
            i13 |= u11.s(j11) ? 67108864 : 33554432;
        } else {
            i14 = 196608;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.n(knobIcon) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.s(j12) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.s(j13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.q(f7)) {
                i19 = 256;
            }
            i15 |= i19;
        }
        if ((i12 & 3072) == 0) {
            if (u11.q(f11)) {
                i22 = 2048;
            }
            i15 |= i22;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.q(f12) ? 16384 : 8192;
        }
        if ((i12 & i14) == 0) {
            i15 |= u11.s(j14) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.s(j15) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= u11.s(j16) ? 8388608 : 4194304;
        }
        if ((i13 & 306783379) == 306783378 && (i15 & 4793491) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            A1 a11 = h0.a((z11 || !z12) ? (z11 || z12) ? j16 : j15 : j14, AnimationFactory.INSTANCE.easeInOutCircColor$uni_release(), "BackgroundColorAnimation", u11, 384, 8);
            u11.o(-1890006665);
            e h11 = T.h(modifier, 0.0f, f7, 1);
            int i23 = a0.f39446j;
            e b11 = androidx.compose.foundation.e.b(a0.k(h11, j.c(j13), j.b(j13)), FoundationToggle_McPsvjw$lambda$0(a11), h.e());
            if (function1 != null) {
                e.a aVar = e.f40358c0;
                u11.o(948075439);
                i16 = 3670016;
                boolean z15 = ((i13 & 3670016) == 1048576) | ((i13 & 7168) == 2048);
                Object C11 = u11.C();
                if (z15 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new FoundationToggleKt$FoundationToggle$1$1$1(function1, z11);
                    u11.x(C11);
                }
                u11.k();
                i17 = i13;
                z14 = false;
                b11 = b11.l0(i.b(aVar, interactionSource, null, z12, null, null, (Function0) C11, 24));
            } else {
                i16 = 3670016;
                z14 = false;
                i17 = i13;
            }
            u11.k();
            V f13 = C5185h.f(InterfaceC6250b.a.o(), z14);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            int i24 = i15 << 15;
            c3969l = u11;
            m3040Knob7BdGs9g(C5187j.f39515a, knobModifier, iconModifier, z11 ? InterfaceC6250b.a.f() : InterfaceC6250b.a.h(), z13, knobIcon, j11, j12, f11, f12, c3969l, 6 | (i17 & 112) | (i17 & 896) | ((i17 >> 9) & 57344) | ((i17 >> 12) & 458752) | ((i17 >> 6) & i16) | ((i15 << 21) & 29360128) | (234881024 & i24) | (i24 & 1879048192));
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationToggleKt$FoundationToggle$3(modifier, knobModifier, iconModifier, z11, z12, interactionSource, function1, z13, j11, knobIcon, j12, j13, f7, f11, f12, j14, j15, j16, i11, i12));
        }
    }

    private static final long FoundationToggle_McPsvjw$lambda$0(A1<C7807Z> a12) {
        return a12.getValue().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Knob-7BdGs9g, reason: not valid java name */
    public static final void m3040Knob7BdGs9g(InterfaceC9893b interfaceC9893b, e eVar, e eVar2, InterfaceC6250b interfaceC6250b, boolean z11, AbstractC8972b abstractC8972b, long j11, long j12, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        C3969l u11 = interfaceC3967k.u(1887233042);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(interfaceC6250b) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 16384 : 8192;
        } else {
            z12 = z11;
        }
        if ((i11 & 196608) == 0) {
            i12 |= u11.n(abstractC8972b) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.s(j11) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.s(j12) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.q(f7) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= u11.q(f11) ? 536870912 : 268435456;
        }
        C3969l c3969l = u11;
        if ((306783379 & i12) == 306783378 && c3969l.b()) {
            c3969l.j();
        } else {
            AnimationFactory animationFactory = AnimationFactory.INSTANCE;
            e a11 = interfaceC9893b.a(androidx.compose.foundation.e.b(a0.j(T.f(eVar, f11), f7), j11, h.e()), ModifierUtilsKt.animateAlignmentAsState(interfaceC6250b, animationFactory.easeInOutCircFloat$uni_release(), "KnobAlignmentAnimation", c3969l, ((i12 >> 9) & 14) | 384, 0));
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = c3969l.I();
            A0 d11 = c3969l.d();
            e f13 = c.f(c3969l, a11);
            int i13 = i12;
            Function0 a12 = g.a(InterfaceC2801g.f5440U, c3969l);
            if (c3969l.t()) {
                c3969l.H(a12);
            } else {
                c3969l.e();
            }
            Function2 f14 = E.f(c3969l, f12, c3969l, d11);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                a.d(I11, c3969l, I11, f14);
            }
            F1.b(c3969l, f13, InterfaceC2801g.a.f());
            G.c(z12, C5187j.f39515a.a(e.f40358c0, InterfaceC6250b.a.e()), animationFactory.animShowIcon$uni_release(), animationFactory.animHideIcon$uni_release(), null, a1.c.c(30289908, new FoundationToggleKt$Knob$1$1(eVar2, abstractC8972b, j12), c3969l), c3969l, ((i13 >> 12) & 14) | 196608, 16);
            c3969l = c3969l;
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationToggleKt$Knob$2(interfaceC9893b, eVar, eVar2, interfaceC6250b, z11, abstractC8972b, j11, j12, f7, f11, i11));
        }
    }
}
