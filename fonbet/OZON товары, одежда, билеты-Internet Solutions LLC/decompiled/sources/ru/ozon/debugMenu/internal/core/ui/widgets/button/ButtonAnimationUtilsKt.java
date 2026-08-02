package ru.ozon.debugMenu.internal.core.ui.widgets.button;

import S0.A1;
import S0.C0;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lm0/D0;", "", "enabled", "", "enabledAlpha", "pressedAlpha", "disabledAlpha", "LS0/A1;", "animateButtonTitleAlpha", "(Lm0/D0;ZFFFLS0/k;I)LS0/A1;", "animateButtonIconColor", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonAnimationUtilsKt {
    @NotNull
    public static final A1<Float> animateButtonIconColor(@NotNull D0<Boolean> d02, boolean z11, float f7, float f11, float f12, InterfaceC3967k interfaceC3967k, int i11) {
        InterfaceC3967k interfaceC3967k2;
        A1<Float> a12;
        Intrinsics.checkNotNullParameter(d02, "<this>");
        interfaceC3967k.o(-528890060);
        if (z11) {
            interfaceC3967k.o(-1547524970);
            ButtonAnimationUtilsKt$animateButtonIconColor$1 buttonAnimationUtilsKt$animateButtonIconColor$1 = ButtonAnimationUtilsKt$animateButtonIconColor$1.INSTANCE;
            U0 b11 = W0.b();
            int i12 = (((i11 & 14) | 384) & 14) | 3072;
            boolean booleanValue = d02.h().booleanValue();
            interfaceC3967k.o(-979550303);
            float f13 = booleanValue ? f11 * f7 : f7;
            interfaceC3967k.k();
            Float valueOf = Float.valueOf(f13);
            boolean booleanValue2 = d02.n().booleanValue();
            interfaceC3967k.o(-979550303);
            if (booleanValue2) {
                f7 *= f11;
            }
            interfaceC3967k.k();
            interfaceC3967k2 = interfaceC3967k;
            a12 = H0.d(d02, valueOf, Float.valueOf(f7), buttonAnimationUtilsKt$animateButtonIconColor$1.invoke((ButtonAnimationUtilsKt$animateButtonIconColor$1) d02.m(), (D0.b<Boolean>) interfaceC3967k, (InterfaceC3967k) 0), b11, interfaceC3967k2, (i12 & 14) | 196608);
            interfaceC3967k2.k();
        } else {
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.o(-1547271545);
            interfaceC3967k2.o(365730315);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C0.a(f12 * f7);
                interfaceC3967k2.x(C11);
            }
            a12 = (InterfaceC3970l0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.k();
        }
        interfaceC3967k2.k();
        return a12;
    }

    @NotNull
    public static final A1<Float> animateButtonTitleAlpha(@NotNull D0<Boolean> d02, boolean z11, float f7, float f11, float f12, InterfaceC3967k interfaceC3967k, int i11) {
        InterfaceC3967k interfaceC3967k2;
        A1<Float> a12;
        Intrinsics.checkNotNullParameter(d02, "<this>");
        interfaceC3967k.o(-265531288);
        if (z11) {
            interfaceC3967k.o(1209652415);
            ButtonAnimationUtilsKt$animateButtonTitleAlpha$1 buttonAnimationUtilsKt$animateButtonTitleAlpha$1 = ButtonAnimationUtilsKt$animateButtonTitleAlpha$1.INSTANCE;
            U0 b11 = W0.b();
            int i12 = (((i11 & 14) | 384) & 14) | 3072;
            boolean booleanValue = d02.h().booleanValue();
            interfaceC3967k.o(-1351096933);
            float f13 = booleanValue ? f11 * f7 : f7;
            interfaceC3967k.k();
            Float valueOf = Float.valueOf(f13);
            boolean booleanValue2 = d02.n().booleanValue();
            interfaceC3967k.o(-1351096933);
            if (booleanValue2) {
                f7 *= f11;
            }
            interfaceC3967k.k();
            interfaceC3967k2 = interfaceC3967k;
            a12 = H0.d(d02, valueOf, Float.valueOf(f7), buttonAnimationUtilsKt$animateButtonTitleAlpha$1.invoke((ButtonAnimationUtilsKt$animateButtonTitleAlpha$1) d02.m(), (D0.b<Boolean>) interfaceC3967k, (InterfaceC3967k) 0), b11, interfaceC3967k2, (i12 & 14) | 196608);
            interfaceC3967k2.k();
        } else {
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.o(1209906801);
            interfaceC3967k2.o(1563050209);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C0.a(f12 * f7);
                interfaceC3967k2.x(C11);
            }
            a12 = (InterfaceC3970l0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.k();
        }
        interfaceC3967k2.k();
        return a12;
    }
}
