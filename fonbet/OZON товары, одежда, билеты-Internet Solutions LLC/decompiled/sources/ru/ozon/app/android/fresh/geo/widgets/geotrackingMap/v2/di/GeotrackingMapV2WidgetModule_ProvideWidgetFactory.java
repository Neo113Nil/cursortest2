package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingMapV2Config;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewMapper;

/* loaded from: classes6.dex */
public final class GeotrackingMapV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(GeotrackingMapV2WidgetModule geotrackingMapV2WidgetModule, GeotrackingMapV2Config geotrackingMapV2Config, GeotrackingMapV2ViewMapper geotrackingMapV2ViewMapper) {
        Widget2 provideWidget = geotrackingMapV2WidgetModule.provideWidget(geotrackingMapV2Config, geotrackingMapV2ViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
