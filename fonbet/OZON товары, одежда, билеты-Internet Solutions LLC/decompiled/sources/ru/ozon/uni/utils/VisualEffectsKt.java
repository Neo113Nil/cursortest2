package ru.ozon.uni.utils;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import n0.C8392m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a=\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\u000e\u001a/\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/e;", "Lkotlin/Function0;", "", "isPressed", "isEnabled", "Ll1/Z;", "hoverColor", "", "alpha", "hoverEffect-8wvRk98", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;ZLl1/Z;F)Landroidx/compose/ui/e;", "hoverEffect", "Ll1/Q;", "hoverBrush", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;ZLl1/Q;F)Landroidx/compose/ui/e;", "LZ1/h;", "borderWidth", "borderColor", "cornerRadius", "modifier", "", "ThreeSideBorder-a_Az1LM", "(FJFLandroidx/compose/ui/e;LS0/k;I)V", "ThreeSideBorder", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VisualEffectsKt {
    /* renamed from: ThreeSideBorder-a_Az1LM, reason: not valid java name */
    public static final void m3267ThreeSideBordera_Az1LM(float f7, long j11, float f11, @NotNull e modifier, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(-1238117301);
        if ((i11 & 6) == 0) {
            i12 = (u11.q(f7) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(modifier) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.o(-233854282);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new VisualEffectsKt$ThreeSideBorder$1$1(f7, f11, j11);
                u11.x(C11);
            }
            u11.k();
            C8392m.a(modifier, (Function1) C11, u11, (i12 >> 9) & 14);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VisualEffectsKt$ThreeSideBorder$2(f7, j11, f11, modifier, i11));
        }
    }

    @NotNull
    public static final e hoverEffect(@NotNull e eVar, @NotNull Function0<Boolean> isPressed, boolean z11, AbstractC7799Q abstractC7799Q, float f7) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(isPressed, "isPressed");
        return z11 ? abstractC7799Q != null ? c.d(eVar, new VisualEffectsKt$hoverEffect$3(isPressed, abstractC7799Q, f7)) : a.a(eVar, new VisualEffectsKt$hoverEffect$4(isPressed, f7)) : eVar;
    }

    public static /* synthetic */ e hoverEffect$default(e eVar, Function0 function0, boolean z11, AbstractC7799Q abstractC7799Q, float f7, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            f7 = 0.1f;
        }
        return hoverEffect(eVar, function0, z11, abstractC7799Q, f7);
    }

    @NotNull
    /* renamed from: hoverEffect-8wvRk98, reason: not valid java name */
    public static final e m3268hoverEffect8wvRk98(@NotNull e hoverEffect, @NotNull Function0<Boolean> isPressed, boolean z11, C7807Z c7807z, float f7) {
        Intrinsics.checkNotNullParameter(hoverEffect, "$this$hoverEffect");
        Intrinsics.checkNotNullParameter(isPressed, "isPressed");
        return z11 ? c7807z != null ? c.d(hoverEffect, new VisualEffectsKt$hoverEffect$1(isPressed, c7807z, f7)) : a.a(hoverEffect, new VisualEffectsKt$hoverEffect$2(isPressed, f7)) : hoverEffect;
    }

    /* renamed from: hoverEffect-8wvRk98$default, reason: not valid java name */
    public static /* synthetic */ e m3269hoverEffect8wvRk98$default(e eVar, Function0 function0, boolean z11, C7807Z c7807z, float f7, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            f7 = 0.1f;
        }
        return m3268hoverEffect8wvRk98(eVar, function0, z11, c7807z, f7);
    }
}
