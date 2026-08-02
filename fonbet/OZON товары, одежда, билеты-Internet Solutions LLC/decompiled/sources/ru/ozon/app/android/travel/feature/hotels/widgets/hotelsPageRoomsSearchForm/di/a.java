package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.di;

import kotlin.Unit;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.data.HotelsPageRoomsSearchFormEmptyResponse;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements AsyncWidgetStateMapper {
    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    public final Object mapAsyncState(Object obj) {
        Unit invoke$lambda$1$lambda$0;
        invoke$lambda$1$lambda$0 = HotelsPageRoomsSearchFormComponent$widgetViewModelProvider$2.invoke$lambda$1$lambda$0((HotelsPageRoomsSearchFormEmptyResponse) obj);
        return invoke$lambda$1$lambda$0;
    }
}
