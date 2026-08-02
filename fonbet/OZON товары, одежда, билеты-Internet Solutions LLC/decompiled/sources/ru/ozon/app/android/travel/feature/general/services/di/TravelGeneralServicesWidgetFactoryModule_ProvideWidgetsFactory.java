package ru.ozon.app.android.travel.feature.general.services.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes7.dex */
public final class TravelGeneralServicesWidgetFactoryModule_ProvideWidgetsFactory implements e<Set<i>> {
    public static Set<i> provideWidgets(JsonParser jsonParser) {
        Set<i> provideWidgets = TravelGeneralServicesWidgetFactoryModule.INSTANCE.provideWidgets(jsonParser);
        j.d(provideWidgets);
        return provideWidgets;
    }
}
