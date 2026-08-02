package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.data.CouponGoalsV2Config;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalsV2ViewMapper;

/* loaded from: classes6.dex */
public final class CouponGoalsV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CouponGoalsV2WidgetModule couponGoalsV2WidgetModule, CouponGoalsV2Config couponGoalsV2Config, CouponGoalsV2ViewMapper couponGoalsV2ViewMapper) {
        Widget2 provideWidget = couponGoalsV2WidgetModule.provideWidget(couponGoalsV2Config, couponGoalsV2ViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
