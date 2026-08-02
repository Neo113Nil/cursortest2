package ru.ozon.app.android.travel.map.storage;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.location.Location;
import androidx.recyclerview.widget.LinearLayoutManager;
import ie0.C7064a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import we0.m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\t\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\u0017J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\nR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorageV1Impl;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "<init>", "()V", "Lwe0/m;", "locationPoint", "Landroid/content/Context;", "context", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "addProvider", "(Lwe0/m;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "appName", "", "setAppName", "(Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "", "isNewStorage", "()Z", "", "", "(Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getProviderByPoint", "Ljava/util/concurrent/ConcurrentHashMap;", "cachedProviders", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/String;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelGeoProvidersStorageV1Impl implements TravelGeoProvidersStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ConcurrentHashMap<m, GeoProviderConfig> cachedProviders = new ConcurrentHashMap<>();

    @NotNull
    private String appName = "";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorageV1Impl$Companion;", "", "<init>", "()V", "MIN_DISTANCE_FOR_SAME_PROVIDER", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage
    public Object addProvider(@NotNull List<Double> list, @NotNull Context context, @NotNull d<? super Unit> dVar) {
        Object addProvider = addProvider(new m(list.get(0).doubleValue(), list.get(1).doubleValue()), context, (d<? super GeoProviderConfig>) dVar);
        return addProvider == a.COROUTINE_SUSPENDED ? addProvider : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage
    @NotNull
    public String getAppName() {
        return this.appName;
    }

    @Override // ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage
    public Object getProviderByPoint(@NotNull m mVar, @NotNull Context context, @NotNull d<? super GeoProviderConfig> dVar) {
        GeoProviderConfig geoProviderConfig = this.cachedProviders.get(mVar);
        if (geoProviderConfig != null) {
            return geoProviderConfig;
        }
        Location location = new Location("startPoint");
        location.setLatitude(mVar.getLatitude());
        location.setLongitude(mVar.getLongitude());
        Location location2 = new Location("endPoint");
        for (Map.Entry<m, GeoProviderConfig> entry : this.cachedProviders.entrySet()) {
            m key = entry.getKey();
            GeoProviderConfig value = entry.getValue();
            location2.setLatitude(key.getLatitude());
            location2.setLongitude(key.getLongitude());
            if (location.distanceTo(location2) < 5000.0f) {
                return value;
            }
        }
        Object addProvider = addProvider(mVar, context, dVar);
        return addProvider == a.COROUTINE_SUSPENDED ? addProvider : (GeoProviderConfig) addProvider;
    }

    @Override // ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage
    public boolean isNewStorage() {
        return false;
    }

    @Override // ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage
    public void setAppName(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        if (Intrinsics.d(this.appName, appName)) {
            return;
        }
        this.cachedProviders.clear();
        this.appName = appName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addProvider(m mVar, Context context, d<? super GeoProviderConfig> dVar) {
        TravelGeoProvidersStorageV1Impl$addProvider$2 travelGeoProvidersStorageV1Impl$addProvider$2;
        int i11;
        TravelGeoProvidersStorageV1Impl travelGeoProvidersStorageV1Impl;
        if (dVar instanceof TravelGeoProvidersStorageV1Impl$addProvider$2) {
            travelGeoProvidersStorageV1Impl$addProvider$2 = (TravelGeoProvidersStorageV1Impl$addProvider$2) dVar;
            int i12 = travelGeoProvidersStorageV1Impl$addProvider$2.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                travelGeoProvidersStorageV1Impl$addProvider$2.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                TravelGeoProvidersStorageV1Impl$addProvider$2 travelGeoProvidersStorageV1Impl$addProvider$22 = travelGeoProvidersStorageV1Impl$addProvider$2;
                Object obj = travelGeoProvidersStorageV1Impl$addProvider$22.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = travelGeoProvidersStorageV1Impl$addProvider$22.label;
                if (i11 != 0) {
                    s.b(obj);
                    GeoProviderConfig geoProviderConfig = this.cachedProviders.get(mVar);
                    if (geoProviderConfig != null) {
                        return geoProviderConfig;
                    }
                    C7064a c7064a = C7064a.f66281a;
                    Double d11 = new Double(mVar.getLatitude());
                    Double d12 = new Double(mVar.getLongitude());
                    travelGeoProvidersStorageV1Impl$addProvider$22.L$0 = this;
                    travelGeoProvidersStorageV1Impl$addProvider$22.L$1 = mVar;
                    travelGeoProvidersStorageV1Impl$addProvider$22.label = 1;
                    obj = c7064a.k(context, null, d11, d12, ActualBXTab.NONE, null, travelGeoProvidersStorageV1Impl$addProvider$22);
                    if (obj == aVar) {
                        return aVar;
                    }
                    travelGeoProvidersStorageV1Impl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (m) travelGeoProvidersStorageV1Impl$addProvider$22.L$1;
                    travelGeoProvidersStorageV1Impl = (TravelGeoProvidersStorageV1Impl) travelGeoProvidersStorageV1Impl$addProvider$22.L$0;
                    s.b(obj);
                }
                GeoProviderConfig geoProviderConfig2 = (GeoProviderConfig) obj;
                travelGeoProvidersStorageV1Impl.cachedProviders.put(mVar, geoProviderConfig2);
                return geoProviderConfig2;
            }
        }
        travelGeoProvidersStorageV1Impl$addProvider$2 = new TravelGeoProvidersStorageV1Impl$addProvider$2(this, dVar);
        TravelGeoProvidersStorageV1Impl$addProvider$2 travelGeoProvidersStorageV1Impl$addProvider$222 = travelGeoProvidersStorageV1Impl$addProvider$2;
        Object obj2 = travelGeoProvidersStorageV1Impl$addProvider$222.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = travelGeoProvidersStorageV1Impl$addProvider$222.label;
        if (i11 != 0) {
        }
        GeoProviderConfig geoProviderConfig22 = (GeoProviderConfig) obj2;
        travelGeoProvidersStorageV1Impl.cachedProviders.put(mVar, geoProviderConfig22);
        return geoProviderConfig22;
    }
}
