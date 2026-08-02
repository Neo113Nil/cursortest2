package ru.ozon.uni.ozi.components.button.utils;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H;
import m0.T0;
import ru.ozon.uni.foundation.utils.AnimationFactory;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/D0$b;", "", "Lm0/H;", "", "invoke", "(Lm0/D0$b;LS0/k;I)Lm0/H;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class ButtonAnimationUtilsKt$animateButtonIconColor$1 extends AbstractC7737t implements InterfaceC6511n<D0.b<Boolean>, InterfaceC3967k, Integer, H<Float>> {
    public static final ButtonAnimationUtilsKt$animateButtonIconColor$1 INSTANCE = new ButtonAnimationUtilsKt$animateButtonIconColor$1();

    ButtonAnimationUtilsKt$animateButtonIconColor$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ H<Float> invoke(D0.b<Boolean> bVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(bVar, interfaceC3967k, num.intValue());
    }

    public final H<Float> invoke(D0.b<Boolean> animateFloat, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        interfaceC3967k.o(532873208);
        T0<Float> easeInCircFloat$uni_release = AnimationFactory.INSTANCE.easeInCircFloat$uni_release();
        interfaceC3967k.k();
        return easeInCircFloat$uni_release;
    }
}
