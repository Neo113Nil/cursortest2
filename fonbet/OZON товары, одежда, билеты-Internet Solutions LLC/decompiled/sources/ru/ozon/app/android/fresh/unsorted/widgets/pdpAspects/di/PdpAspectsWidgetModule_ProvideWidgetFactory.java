package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.data.PdpAspectsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.PdpAspectsViewMapper;

/* loaded from: classes6.dex */
public final class PdpAspectsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PdpAspectsWidgetModule pdpAspectsWidgetModule, PdpAspectsConfig pdpAspectsConfig, PdpAspectsViewMapper pdpAspectsViewMapper) {
        Widget2 provideWidget = pdpAspectsWidgetModule.provideWidget(pdpAspectsConfig, pdpAspectsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
