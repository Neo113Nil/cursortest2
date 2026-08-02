package ru.ozon.mapsdk.common.geoproxy.data.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GeoProviderConfig$SdkType$Companion$fromName$select$1 extends AbstractC7737t implements Function1<String, GeoProviderConfig.SdkType> {
    public static final GeoProviderConfig$SdkType$Companion$fromName$select$1 INSTANCE = new GeoProviderConfig$SdkType$Companion$fromName$select$1();

    GeoProviderConfig$SdkType$Companion$fromName$select$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final GeoProviderConfig.SdkType invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GeoProviderConfig.SdkType.Yandex yandex = GeoProviderConfig.SdkType.Yandex.INSTANCE;
        if (Intrinsics.d(it, yandex.getName$mapsdk_fullFirebaseOpenglRelease())) {
            return yandex;
        }
        GeoProviderConfig.SdkType.MapLibre mapLibre = GeoProviderConfig.SdkType.MapLibre.INSTANCE;
        if (Intrinsics.d(it, mapLibre.getName$mapsdk_fullFirebaseOpenglRelease())) {
            return mapLibre;
        }
        return null;
    }
}
