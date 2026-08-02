package ru.ozon.app.android.travel.map.storage;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import we0.m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "", "", "appName", "", "setAppName", "(Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "", "isNewStorage", "()Z", "", "", "locationPoint", "Landroid/content/Context;", "context", "addProvider", "(Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lwe0/m;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getProviderByPoint", "(Lwe0/m;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TravelGeoProvidersStorage {
    Object addProvider(@NotNull List<Double> list, @NotNull Context context, @NotNull d<? super Unit> dVar);

    @NotNull
    String getAppName();

    Object getProviderByPoint(@NotNull m mVar, @NotNull Context context, @NotNull d<? super GeoProviderConfig> dVar);

    boolean isNewStorage();

    void setAppName(@NotNull String appName);
}
