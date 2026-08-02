package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3BodyViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3Config;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3GradientHeaderViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3HeaderViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.core.OldHammersV3BodyViewMapper;

/* loaded from: classes6.dex */
public final class HammersV3WidgetModule_ProvideHammersWidgetFactory implements e<Widget2> {
    public static Widget2 provideHammersWidget(HammersV3Config hammersV3Config, HammersV3HeaderViewMapper hammersV3HeaderViewMapper, HammersV3BodyViewMapper hammersV3BodyViewMapper, OldHammersV3BodyViewMapper oldHammersV3BodyViewMapper, HammersV3GradientHeaderViewMapper hammersV3GradientHeaderViewMapper) {
        Widget2 provideHammersWidget = HammersV3WidgetModule.INSTANCE.provideHammersWidget(hammersV3Config, hammersV3HeaderViewMapper, hammersV3BodyViewMapper, oldHammersV3BodyViewMapper, hammersV3GradientHeaderViewMapper);
        j.d(provideHammersWidget);
        return provideHammersWidget;
    }
}
