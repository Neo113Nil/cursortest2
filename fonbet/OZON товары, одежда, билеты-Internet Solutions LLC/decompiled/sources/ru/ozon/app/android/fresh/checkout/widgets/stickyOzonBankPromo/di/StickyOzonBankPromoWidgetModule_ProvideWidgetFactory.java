package ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.data.StickyOzonBankPromoConfig;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation.StickyOzonBankPromoOverlayViewMapper;

/* loaded from: classes6.dex */
public final class StickyOzonBankPromoWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(StickyOzonBankPromoConfig stickyOzonBankPromoConfig, StickyOzonBankPromoOverlayViewMapper stickyOzonBankPromoOverlayViewMapper) {
        Widget2 provideWidget = StickyOzonBankPromoWidgetModule.INSTANCE.provideWidget(stickyOzonBankPromoConfig, stickyOzonBankPromoOverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
