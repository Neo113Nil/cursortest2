package ru.ozon.app.android.geo.map.presentation.utils;

import He.b;
import P4.f;
import Sc.o;
import android.content.Context;
import ie0.C7064a;
import je0.C7415j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geoprovider.GeoProviderRepository;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/AddressEditMapGeoProviderDelegateImpl;", "Lru/ozon/app/android/geo/map/presentation/utils/AddressEditMapGeoProviderDelegate;", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "geoProviderRepository", "<init>", "(Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/geoprovider/GeoProviderRepository;)V", "Landroid/content/Context;", "context", "Lje0/j;", "getGeoProviders", "(Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "doOnComplete", "fetchGeoProviders", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "clearGeoProviderJob", "()V", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "currentGeoProviderConfig", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getCurrentGeoProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "setCurrentGeoProviderConfig", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)V", "", "contextLocationUid", "Ljava/lang/String;", "getContextLocationUid", "()Ljava/lang/String;", "setContextLocationUid", "(Ljava/lang/String;)V", "sessionId", "getSessionId", "setSessionId", "Lxe/B0;", "getProviderJob", "Lxe/B0;", "Lxe/M;", "coroutineScope", "Lxe/M;", "tabsGeoProviderConfigs", "Lje0/j;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapGeoProviderDelegateImpl implements AddressEditMapGeoProviderDelegate {

    @NotNull
    private final AreaLocalStore areaLocalStore;
    private String contextLocationUid;

    @NotNull
    private final M coroutineScope;
    private GeoProviderConfig currentGeoProviderConfig;

    @NotNull
    private final GeoProviderRepository geoProviderRepository;
    private B0 getProviderJob;

    @NotNull
    private String sessionId;
    private C7415j tabsGeoProviderConfigs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressEditMapDTO.Selector.Type.values().length];
            try {
                iArr[AddressEditMapDTO.Selector.Type.TYPE_COURIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressEditMapDTO.Selector.Type.TYPE_PICKUP_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressEditMapDTO.Selector.Type.TYPE_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AddressEditMapGeoProviderDelegateImpl(@NotNull AreaLocalStore areaLocalStore, @NotNull GeoProviderRepository geoProviderRepository) {
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(geoProviderRepository, "geoProviderRepository");
        this.areaLocalStore = areaLocalStore;
        this.geoProviderRepository = geoProviderRepository;
        this.sessionId = f.b("toString(...)");
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("AddressEditMapGeoProviderDelegateImpl", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("AddressEditMapGeoProviderDelegateImpl")).plus(new AddressEditMapGeoProviderDelegateImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getGeoProviders(Context context, d<? super C7415j> dVar) {
        return C7064a.f66281a.l(this.areaLocalStore.getLocationUid(), context, dVar);
    }

    public void clearGeoProviderJob() {
        B0 b02 = this.getProviderJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.getProviderJob = null;
    }

    public void fetchGeoProviders(@NotNull Context context, @NotNull Function0<Unit> doOnComplete) {
        B0 b02;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(doOnComplete, "doOnComplete");
        if (this.geoProviderRepository.allProvidersLoaded()) {
            doOnComplete.invoke();
            return;
        }
        B0 b03 = this.getProviderJob;
        if (b03 != null && b03.isActive() && (b02 = this.getProviderJob) != null) {
            b02.j(null);
        }
        this.getProviderJob = C10727i.c(this.coroutineScope, null, null, new AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1(this, context, doOnComplete, null), 3);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public String getContextLocationUid() {
        String str = this.contextLocationUid;
        return str == null ? this.areaLocalStore.getLocationUid() : str;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public GeoProviderConfig getCurrentGeoProviderConfig() {
        return this.currentGeoProviderConfig;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public GeoProviderConfig getGeoProviderConfig(@NotNull AddressEditMapDTO.Selector.Type type) {
        ActualBXTab actualBXTab;
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.geoProviderRepository.allProvidersLoaded()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i11 == 1) {
                actualBXTab = ActualBXTab.COURIER;
            } else if (i11 == 2) {
                actualBXTab = ActualBXTab.PICKUP;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                actualBXTab = ActualBXTab.NONE;
            }
            setCurrentGeoProviderConfig(this.geoProviderRepository.getGeoProviderConfig(actualBXTab));
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            GeoProviderConfig geoProviderConfig = null;
            if (i12 == 1) {
                C7415j c7415j = this.tabsGeoProviderConfigs;
                if (c7415j != null) {
                    geoProviderConfig = c7415j.a();
                }
            } else if (i12 == 2) {
                C7415j c7415j2 = this.tabsGeoProviderConfigs;
                if (c7415j2 != null) {
                    geoProviderConfig = c7415j2.b();
                }
            } else {
                if (i12 != 3) {
                    throw new o();
                }
                C7415j c7415j3 = this.tabsGeoProviderConfigs;
                if (c7415j3 != null) {
                    geoProviderConfig = c7415j3.c();
                }
            }
            setCurrentGeoProviderConfig(geoProviderConfig);
        }
        return getCurrentGeoProviderConfig();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate
    public void setContextLocationUid(String str) {
        this.contextLocationUid = str;
    }

    public void setCurrentGeoProviderConfig(GeoProviderConfig geoProviderConfig) {
        this.currentGeoProviderConfig = geoProviderConfig;
    }
}
