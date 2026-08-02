package ru.ozon.app.android.travel.feature.hotels.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

/* loaded from: classes7.dex */
public final class TravelHotelsWidgetFactoryModule_ProvideWidgets$hotels_prodGoogleAllVendorsReleaseFactory implements e<Set<i>> {
    public static Set<i> provideWidgets$hotels_prodGoogleAllVendorsRelease(ListTrackingViewMapper listTrackingViewMapper, JsonParser jsonParser) {
        Set<i> provideWidgets$hotels_prodGoogleAllVendorsRelease = TravelHotelsWidgetFactoryModule.INSTANCE.provideWidgets$hotels_prodGoogleAllVendorsRelease(listTrackingViewMapper, jsonParser);
        j.d(provideWidgets$hotels_prodGoogleAllVendorsRelease);
        return provideWidgets$hotels_prodGoogleAllVendorsRelease;
    }
}
