package ru.ozon.app.android.travel.feature.hotels.map.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.HotelsMapCardV1WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.HotelsMapInfoV2WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.HotelsMapInfoV4WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.HotelsMapInfoV5WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.HotelsPageMapPreviewV1WidgetKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.HotelsPageMapPreviewV2WidgetKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/di/TravelHotelsMapWidgetV2Module;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$map_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelHotelsMapWidgetV2Module {
    @NotNull
    public final Set<i> provideWidgets$map_prodGoogleAllVendorsRelease() {
        i[] elements = {HotelsMapCardV1WidgetKt.HotelsMapCardV1Widget(), HotelsMapInfoV2WidgetKt.HotelsMapInfoV2Widget(), HotelsMapInfoV4WidgetKt.HotelsMapInfoV4Widget(), HotelsMapInfoV5WidgetKt.HotelsMapInfoV5Widget(), HotelsPageMapPreviewV1WidgetKt.HotelsPageMapPreviewV1Widget(), HotelsPageMapPreviewV1WidgetKt.HotelsPageMapPreviewV1ForToursWidget(), HotelsPageMapPreviewV2WidgetKt.HotelsPageMapPreviewV2Widget()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
