package ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.data.GeotrackingBottomButtonConfig;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.presentation.GeotrackingBottomButtonOverlapMapper;

/* loaded from: classes6.dex */
public final class GeotrackingBottomButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(GeotrackingBottomButtonWidgetModule geotrackingBottomButtonWidgetModule, GeotrackingBottomButtonConfig geotrackingBottomButtonConfig, GeotrackingBottomButtonOverlapMapper geotrackingBottomButtonOverlapMapper) {
        Widget2 provideWidget = geotrackingBottomButtonWidgetModule.provideWidget(geotrackingBottomButtonConfig, geotrackingBottomButtonOverlapMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
