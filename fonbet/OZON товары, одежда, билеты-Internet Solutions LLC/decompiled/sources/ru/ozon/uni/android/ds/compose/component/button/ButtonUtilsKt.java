package ru.ozon.uni.android.ds.compose.component.button;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.S;
import S0.m1;
import S0.n1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import l1.C7807Z;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import m0.Y;
import org.jetbrains.annotations.NotNull;
import t0.o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lt0/o;", "Lkotlin/time/b;", "delayToReset", "debounce", "Lm0/D0;", "", "rememberIndicationTransition-FbhrOv8", "(Lt0/o;JJLS0/k;II)Lm0/D0;", "rememberIndicationTransition", "", "enabledAlpha", "pressedAlpha", "LS0/S;", "animateBackgroundAlpha", "(Lm0/D0;FFLS0/k;I)LS0/S;", "Ll1/Z;", "enabled", "updateAlpha-DxMtmZc", "(JZ)J", "updateAlpha", "needReset", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonUtilsKt {
    @NotNull
    public static final S animateBackgroundAlpha(@NotNull D0<Boolean> d02, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(d02, "<this>");
        interfaceC3967k.o(895077586);
        ButtonUtilsKt$animateBackgroundAlpha$1 buttonUtilsKt$animateBackgroundAlpha$1 = ButtonUtilsKt$animateBackgroundAlpha$1.INSTANCE;
        U0 b11 = W0.b();
        int i12 = (((i11 & 14) | 384) & 14) | 3072;
        boolean booleanValue = d02.h().booleanValue();
        interfaceC3967k.o(-689464012);
        float f12 = booleanValue ? f11 : f7;
        interfaceC3967k.k();
        Float valueOf = Float.valueOf(f12);
        boolean booleanValue2 = d02.n().booleanValue();
        interfaceC3967k.o(-689464012);
        if (booleanValue2) {
            f7 = f11;
        }
        interfaceC3967k.k();
        S a11 = m1.a(H0.d(d02, valueOf, Float.valueOf(f7), buttonUtilsKt$animateBackgroundAlpha$1.invoke((ButtonUtilsKt$animateBackgroundAlpha$1) d02.m(), (D0.b<Boolean>) interfaceC3967k, (InterfaceC3967k) 0), b11, interfaceC3967k, (i12 & 14) | 196608));
        interfaceC3967k.k();
        return a11;
    }

    @NotNull
    /* renamed from: rememberIndicationTransition-FbhrOv8, reason: not valid java name */
    public static final D0<Boolean> m1680rememberIndicationTransitionFbhrOv8(@NotNull o rememberIndicationTransition, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        long j13;
        long j14;
        Intrinsics.checkNotNullParameter(rememberIndicationTransition, "$this$rememberIndicationTransition");
        interfaceC3967k.o(-309682721);
        if ((i12 & 1) != 0) {
            b.INSTANCE.getClass();
            j13 = 0;
        } else {
            j13 = j11;
        }
        if ((i12 & 2) != 0) {
            b.INSTANCE.getClass();
            j14 = 0;
        } else {
            j14 = j12;
        }
        interfaceC3967k.o(1951356646);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Boolean.FALSE, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(1951358446);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new Y(Boolean.FALSE);
            interfaceC3967k.x(C12);
        }
        Y y11 = (Y) C12;
        interfaceC3967k.k();
        interfaceC3967k.o(1951362692);
        boolean z11 = true;
        boolean F11 = interfaceC3967k.F(y11) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.s(j13)) || (i11 & 48) == 32);
        Object C13 = interfaceC3967k.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            Object buttonUtilsKt$rememberIndicationTransition$1$1 = new ButtonUtilsKt$rememberIndicationTransition$1$1(y11, interfaceC3978p0, j13, null);
            interfaceC3967k.x(buttonUtilsKt$rememberIndicationTransition$1$1);
            C13 = buttonUtilsKt$rememberIndicationTransition$1$1;
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, rememberIndicationTransition, (Function2) C13);
        interfaceC3967k.o(1951378110);
        boolean z12 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(rememberIndicationTransition)) || (i11 & 6) == 4;
        if ((((i11 & 896) ^ 384) <= 256 || !interfaceC3967k.s(j14)) && (i11 & 384) != 256) {
            z11 = false;
        }
        boolean F12 = z12 | z11 | interfaceC3967k.F(y11);
        Object C14 = interfaceC3967k.C();
        if (F12 || C14 == InterfaceC3967k.a.a()) {
            Object buttonUtilsKt$rememberIndicationTransition$2$1 = new ButtonUtilsKt$rememberIndicationTransition$2$1(rememberIndicationTransition, j14, y11, interfaceC3978p0, null);
            interfaceC3967k.x(buttonUtilsKt$rememberIndicationTransition$2$1);
            C14 = buttonUtilsKt$rememberIndicationTransition$2$1;
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, rememberIndicationTransition, (Function2) C14);
        D0<Boolean> h11 = H0.h(y11, interfaceC3967k);
        interfaceC3967k.k();
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIndicationTransition_FbhrOv8$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberIndicationTransition_FbhrOv8$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: updateAlpha-DxMtmZc, reason: not valid java name */
    public static final long m1681updateAlphaDxMtmZc(long j11, boolean z11) {
        return !z11 ? C7807Z.o(0.4f, j11) : j11;
    }
}
