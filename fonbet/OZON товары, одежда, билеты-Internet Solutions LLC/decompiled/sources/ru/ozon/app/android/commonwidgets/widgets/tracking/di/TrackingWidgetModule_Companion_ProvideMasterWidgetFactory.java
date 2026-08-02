package ru.ozon.app.android.commonwidgets.widgets.tracking.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.tracking.core.TrackingConfig;
import ru.ozon.app.android.commonwidgets.widgets.tracking.core.TrackingViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class TrackingWidgetModule_Companion_ProvideMasterWidgetFactory implements e<Widget> {
    public static Widget provideMasterWidget(TrackingConfig trackingConfig, TrackingViewMapper trackingViewMapper) {
        Widget provideMasterWidget = TrackingWidgetModule.INSTANCE.provideMasterWidget(trackingConfig, trackingViewMapper);
        j.d(provideMasterWidget);
        return provideMasterWidget;
    }
}
