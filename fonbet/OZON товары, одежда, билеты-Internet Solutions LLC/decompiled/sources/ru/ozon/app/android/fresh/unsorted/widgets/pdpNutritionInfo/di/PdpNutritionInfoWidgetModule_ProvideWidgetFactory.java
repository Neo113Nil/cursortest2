package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoViewMapper;

/* loaded from: classes6.dex */
public final class PdpNutritionInfoWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PdpNutritionInfoWidgetModule pdpNutritionInfoWidgetModule, PdpNutritionInfoConfig pdpNutritionInfoConfig, PdpNutritionInfoViewMapper pdpNutritionInfoViewMapper) {
        Widget2 provideWidget = pdpNutritionInfoWidgetModule.provideWidget(pdpNutritionInfoConfig, pdpNutritionInfoViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
