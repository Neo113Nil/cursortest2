package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderRawBlock$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ NavigationSliderV2VO.NavigationItemV2 $item;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $textPrimaryColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderComposableKt$NavigationSliderRawBlock$3(NavigationSliderV2VO.NavigationItemV2 navigationItemV2, AdultHandler adultHandler, long j11, e eVar, int i11, int i12) {
        super(2);
        this.$item = navigationItemV2;
        this.$adultHandler = adultHandler;
        this.$textPrimaryColor = j11;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        NavigationSliderComposableKt.m1049NavigationSliderRawBlockcf5BqRc(this.$item, this.$adultHandler, this.$textPrimaryColor, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
