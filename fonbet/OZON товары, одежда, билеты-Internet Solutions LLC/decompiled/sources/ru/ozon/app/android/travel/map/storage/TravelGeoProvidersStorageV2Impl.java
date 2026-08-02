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
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.travel.map.flags.TravelOzonMapClientName;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import we0.m;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u000b\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\u0019J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001a\u0010\fR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorageV2Impl;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "Lwe0/m;", "locationPoint", "Landroid/content/Context;", "context", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "addProvider", "(Lwe0/m;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "appName", "", "setAppName", "(Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "", "isNewStorage", "()Z", "", "", "(Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getProviderByPoint", "Ljava/util/concurrent/ConcurrentHashMap;", "cachedProviders", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/String;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelGeoProvidersStorageV2Impl implements TravelGeoProvidersStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private String appName;

    @NotNull
    private final ConcurrentHashMap<m, GeoProviderConfig> cachedProviders;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorageV2Impl$Companion;", "", "<init>", "()V", "MIN_DISTANCE_FOR_SAME_PROVIDER", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TravelGeoProvidersStorageV2Impl(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.cachedProviders = new ConcurrentHashMap<>();
        this.appName = featureService.getStringKey(TravelOzonMapClientName.INSTANCE);
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
        return true;
    }

    @Override // ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage
    public void setAppName(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.appName = appName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addProvider(m mVar, Context context, d<? super GeoProviderConfig> dVar) {
        TravelGeoProvidersStorageV2Impl$addProvider$2 travelGeoProvidersStorageV2Impl$addProvider$2;
        int i11;
        TravelGeoProvidersStorageV2Impl travelGeoProvidersStorageV2Impl;
        if (dVar instanceof TravelGeoProvidersStorageV2Impl$addProvider$2) {
            travelGeoProvidersStorageV2Impl$addProvider$2 = (TravelGeoProvidersStorageV2Impl$addProvider$2) dVar;
            int i12 = travelGeoProvidersStorageV2Impl$addProvider$2.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                travelGeoProvidersStorageV2Impl$addProvider$2.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                TravelGeoProvidersStorageV2Impl$addProvider$2 travelGeoProvidersStorageV2Impl$addProvider$22 = travelGeoProvidersStorageV2Impl$addProvider$2;
                Object obj = travelGeoProvidersStorageV2Impl$addProvider$22.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = travelGeoProvidersStorageV2Impl$addProvider$22.label;
                if (i11 != 0) {
                    s.b(obj);
                    GeoProviderConfig geoProviderConfig = this.cachedProviders.get(mVar);
                    if (geoProviderConfig != null) {
                        return geoProviderConfig;
                    }
                    C7064a c7064a = C7064a.f66281a;
                    ActualBXTab actualBXTab = ActualBXTab.NONE;
                    double latitude = mVar.getLatitude();
                    double longitude = mVar.getLongitude();
                    String str = this.appName;
                    Double d11 = new Double(latitude);
                    Double d12 = new Double(longitude);
                    travelGeoProvidersStorageV2Impl$addProvider$22.L$0 = this;
                    travelGeoProvidersStorageV2Impl$addProvider$22.L$1 = mVar;
                    travelGeoProvidersStorageV2Impl$addProvider$22.label = 1;
                    obj = c7064a.k(context, null, d11, d12, actualBXTab, str, travelGeoProvidersStorageV2Impl$addProvider$22);
                    if (obj == aVar) {
                        return aVar;
                    }
                    travelGeoProvidersStorageV2Impl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (m) travelGeoProvidersStorageV2Impl$addProvider$22.L$1;
                    travelGeoProvidersStorageV2Impl = (TravelGeoProvidersStorageV2Impl) travelGeoProvidersStorageV2Impl$addProvider$22.L$0;
                    s.b(obj);
                }
                GeoProviderConfig geoProviderConfig2 = (GeoProviderConfig) obj;
                travelGeoProvidersStorageV2Impl.cachedProviders.put(mVar, geoProviderConfig2);
                return geoProviderConfig2;
            }
        }
        travelGeoProvidersStorageV2Impl$addProvider$2 = new TravelGeoProvidersStorageV2Impl$addProvider$2(this, dVar);
        TravelGeoProvidersStorageV2Impl$addProvider$2 travelGeoProvidersStorageV2Impl$addProvider$222 = travelGeoProvidersStorageV2Impl$addProvider$2;
        Object obj2 = travelGeoProvidersStorageV2Impl$addProvider$222.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = travelGeoProvidersStorageV2Impl$addProvider$222.label;
        if (i11 != 0) {
        }
        GeoProviderConfig geoProviderConfig22 = (GeoProviderConfig) obj2;
        travelGeoProvidersStorageV2Impl.cachedProviders.put(mVar, geoProviderConfig22);
        return geoProviderConfig22;
    }
}
