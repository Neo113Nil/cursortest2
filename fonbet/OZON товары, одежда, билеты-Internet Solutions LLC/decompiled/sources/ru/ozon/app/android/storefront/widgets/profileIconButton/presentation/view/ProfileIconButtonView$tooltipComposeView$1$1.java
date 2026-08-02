package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import S0.InterfaceC3967k;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.reflect.h;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProfileIconButtonView$tooltipComposeView$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ProfileIconButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonView$tooltipComposeView$1$1(ProfileIconButtonView profileIconButtonView) {
        super(2);
        this.this$0 = profileIconButtonView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TooltipDTO tooltipDto;
        Integer tooltipAutohideDelaySeconds;
        IconButtonV3View iconButtonV3View;
        boolean isTooltipVisible;
        boolean richTooltipAnimationEnabled;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        tooltipDto = this.this$0.getTooltipDto();
        tooltipAutohideDelaySeconds = this.this$0.getTooltipAutohideDelaySeconds();
        iconButtonV3View = this.this$0.iconButtonView;
        isTooltipVisible = this.this$0.isTooltipVisible();
        richTooltipAnimationEnabled = this.this$0.getRichTooltipAnimationEnabled();
        C6041S c6041s = new C6041S(9, true, true);
        ProfileIconButtonView profileIconButtonView = this.this$0;
        interfaceC3967k.o(-1224156762);
        boolean F11 = interfaceC3967k.F(profileIconButtonView);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ProfileIconButtonView$tooltipComposeView$1$1$1$1(profileIconButtonView);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Function0 function0 = (Function0) ((h) C11);
        interfaceC3967k.o(-1224155173);
        boolean F12 = interfaceC3967k.F(this.this$0);
        ProfileIconButtonView profileIconButtonView2 = this.this$0;
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new ProfileIconButtonView$tooltipComposeView$1$1$2$1(profileIconButtonView2);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        ProfileIconButtonTooltipKt.ProfileIconButtonTooltip(tooltipDto, tooltipAutohideDelaySeconds, iconButtonV3View, isTooltipVisible, richTooltipAnimationEnabled, c6041s, function0, (Function0) C12, interfaceC3967k, 196608 | TooltipDTO.$stable | (IconButtonV3View.$stable << 6));
    }
}
