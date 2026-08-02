package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C8004n;
import m0.D0;
import m0.H;
import m0.V;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/D0$b;", "", "Lm0/H;", "", "invoke", "(Lm0/D0$b;LS0/k;I)Lm0/H;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2 extends AbstractC7737t implements InterfaceC6511n<D0.b<Boolean>, InterfaceC3967k, Integer, H<Float>> {
    public static final ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2 INSTANCE = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2();

    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ H<Float> invoke(D0.b<Boolean> bVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(bVar, interfaceC3967k, num.intValue());
    }

    public final H<Float> invoke(D0.b<Boolean> animateFloat, InterfaceC3967k interfaceC3967k, int i11) {
        V b11;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        interfaceC3967k.o(662892085);
        if (animateFloat.b().booleanValue()) {
            interfaceC3967k.o(-1276639107);
            interfaceC3967k.o(-318275717);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2$1$1.INSTANCE;
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            b11 = C8004n.b((Function1) C11);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1276182787);
            interfaceC3967k.o(-318260997);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2$2$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            b11 = C8004n.b((Function1) C12);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return b11;
    }
}
