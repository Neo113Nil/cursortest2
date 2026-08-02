package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C8004n;
import m0.D0;
import m0.G;
import m0.H;
import m0.T0;
import ru.ozon.fintech.ui.input.CounterView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/D0$b;", "", "Lm0/H;", "", "invoke", "(Lm0/D0$b;LS0/k;I)Lm0/H;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2 extends AbstractC7737t implements InterfaceC6511n<D0.b<Boolean>, InterfaceC3967k, Integer, H<Float>> {
    final /* synthetic */ boolean $isRichAnimationEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2(boolean z11) {
        super(3);
        this.$isRichAnimationEnabled = z11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ H<Float> invoke(D0.b<Boolean> bVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(bVar, interfaceC3967k, num.intValue());
    }

    public final H<Float> invoke(D0.b<Boolean> animateFloat, InterfaceC3967k interfaceC3967k, int i11) {
        T0 d11;
        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
        interfaceC3967k.o(458958274);
        if (animateFloat.b().booleanValue()) {
            d11 = new T0(CounterView.COUNTER_MAX_DEFAULT, this.$isRichAnimationEnabled ? 1000 : 500, G.a());
        } else {
            d11 = C8004n.d(CounterView.COUNTER_MAX_DEFAULT, 0, G.a(), 2);
        }
        interfaceC3967k.k();
        return d11;
    }
}
