package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavigationSliderComposeViewHolder$content$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ NavigationSliderV2VO $item;
    final /* synthetic */ NavigationSliderComposeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderComposeViewHolder$content$1(NavigationSliderV2VO navigationSliderV2VO, NavigationSliderComposeViewHolder navigationSliderComposeViewHolder) {
        super(2);
        this.$item = navigationSliderV2VO;
        this.this$0 = navigationSliderComposeViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        NavigationSliderComposeViewHolder$adapterCallback$1 navigationSliderComposeViewHolder$adapterCallback$1;
        AdultHandler adultHandler;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        NavigationSliderV2VO navigationSliderV2VO = this.$item;
        navigationSliderComposeViewHolder$adapterCallback$1 = this.this$0.adapterCallback;
        adultHandler = this.this$0.adultHandler;
        NavigationSliderComposableKt.NavigationSliderComposable(navigationSliderV2VO, navigationSliderComposeViewHolder$adapterCallback$1, adultHandler, interfaceC3967k, 0);
    }
}
