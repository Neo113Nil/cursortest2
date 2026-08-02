package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/p0;", "", "invoke", "()LS0/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderRawBlock$shouldBlur$2$1 extends AbstractC7737t implements Function0<InterfaceC3978p0<Boolean>> {
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ NavigationSliderV2VO.NavigationItemV2 $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderComposableKt$NavigationSliderRawBlock$shouldBlur$2$1(AdultHandler adultHandler, NavigationSliderV2VO.NavigationItemV2 navigationItemV2) {
        super(0);
        this.$adultHandler = adultHandler;
        this.$item = navigationItemV2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC3978p0<Boolean> invoke() {
        C3991w0 f7;
        f7 = n1.f(Boolean.valueOf(this.$adultHandler.isUserAnAdult() && this.$item.getShouldBlur()), D1.f25195a);
        return f7;
    }
}
