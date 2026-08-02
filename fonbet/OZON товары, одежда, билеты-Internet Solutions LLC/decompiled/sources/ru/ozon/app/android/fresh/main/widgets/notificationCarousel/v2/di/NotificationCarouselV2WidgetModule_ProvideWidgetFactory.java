package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2Config;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewMapper;

/* loaded from: classes6.dex */
public final class NotificationCarouselV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(NotificationCarouselV2WidgetModule notificationCarouselV2WidgetModule, NotificationCarouselV2Config notificationCarouselV2Config, NotificationCarouselV2ViewMapper notificationCarouselV2ViewMapper) {
        Widget2 provideWidget = notificationCarouselV2WidgetModule.provideWidget(notificationCarouselV2Config, notificationCarouselV2ViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
