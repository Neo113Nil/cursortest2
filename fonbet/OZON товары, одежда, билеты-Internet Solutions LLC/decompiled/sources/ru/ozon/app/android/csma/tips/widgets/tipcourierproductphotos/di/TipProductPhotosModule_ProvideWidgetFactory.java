package ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.data.TipProductPhotosConfig;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.TipProductPhotosViewMapper;

/* loaded from: classes6.dex */
public final class TipProductPhotosModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TipProductPhotosModule tipProductPhotosModule, TipProductPhotosConfig tipProductPhotosConfig, TipProductPhotosViewMapper tipProductPhotosViewMapper) {
        Widget2 provideWidget = tipProductPhotosModule.provideWidget(tipProductPhotosConfig, tipProductPhotosViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
