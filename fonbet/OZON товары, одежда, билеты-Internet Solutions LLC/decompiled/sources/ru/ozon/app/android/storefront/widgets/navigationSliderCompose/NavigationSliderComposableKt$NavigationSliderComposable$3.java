package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderComposable$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> $adapterCallback;
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ NavigationSliderV2VO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavigationSliderComposableKt$NavigationSliderComposable$3(NavigationSliderV2VO navigationSliderV2VO, ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> itemAdapterCallback, AdultHandler adultHandler, int i11) {
        super(2);
        this.$item = navigationSliderV2VO;
        this.$adapterCallback = itemAdapterCallback;
        this.$adultHandler = adultHandler;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        NavigationSliderComposableKt.NavigationSliderComposable(this.$item, this.$adapterCallback, this.$adultHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
