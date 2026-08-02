package ru.ozon.uni.ozi.utils.internal;

import S0.A1;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\b\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lm0/D0;", "", "", "enabledAlpha", "pressedAlpha", "LS0/A1;", "animateClickAlpha", "(Lm0/D0;FFLS0/k;II)LS0/A1;", "horizontal", "vertical", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimationUtilsKt {
    @NotNull
    public static final A1<Float> animateClickAlpha(@NotNull D0<Boolean> d02, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(d02, "<this>");
        interfaceC3967k.o(1572498031);
        if ((i12 & 1) != 0) {
            f7 = 1.0f;
        }
        if ((i12 & 2) != 0) {
            f11 = 0.4f;
        }
        AnimationUtilsKt$animateClickAlpha$1 animationUtilsKt$animateClickAlpha$1 = AnimationUtilsKt$animateClickAlpha$1.INSTANCE;
        U0 b11 = W0.b();
        int i13 = (((i11 & 14) | 384) & 14) | 3072;
        boolean booleanValue = d02.h().booleanValue();
        interfaceC3967k.o(1627031319);
        float f12 = booleanValue ? f11 * f7 : f7;
        interfaceC3967k.k();
        Float valueOf = Float.valueOf(f12);
        boolean booleanValue2 = d02.n().booleanValue();
        interfaceC3967k.o(1627031319);
        if (booleanValue2) {
            f7 *= f11;
        }
        interfaceC3967k.k();
        D0.d d11 = H0.d(d02, valueOf, Float.valueOf(f7), animationUtilsKt$animateClickAlpha$1.invoke((AnimationUtilsKt$animateClickAlpha$1) d02.m(), (D0.b<Boolean>) interfaceC3967k, (InterfaceC3967k) 0), b11, interfaceC3967k, (i13 & 14) | 196608);
        interfaceC3967k.k();
        return d11;
    }
}
