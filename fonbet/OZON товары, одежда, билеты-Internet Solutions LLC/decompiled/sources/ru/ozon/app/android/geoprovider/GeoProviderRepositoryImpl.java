package ru.ozon.app.android.geoprovider;

import He.b;
import Ly.RunnableC3601a;
import Sc.o;
import ae0.AbstractC5006b;
import ae0.C5008d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ie0.C7064a;
import je0.C7415j;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
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
import xe.U;
import xe.X0;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/geoprovider/GeoProviderRepositoryImpl;", "Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lje0/j;", "getProvidersForTabs", "(Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/Handler;", "startUpdateTimer", "()Landroid/os/Handler;", "", "locationUid", "", "checkApiKeyProvided", "(Ljava/lang/String;)Z", "", "fetchGeoProvider", "(Ljava/lang/String;)V", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "fetchGeoProviderWithResult", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "actualBXTab", "getGeoProviderConfig", "(Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "allProvidersLoaded", "()Z", "Landroid/content/Context;", "tabsGeoProviderConfigs", "Lje0/j;", "currentLocationUid", "Ljava/lang/String;", "Lxe/M;", "coroutineScope", "Lxe/M;", "Lxe/B0;", "getProviderJob", "Lxe/B0;", "Lxe/U;", "getAndReturnProviderJob", "Lxe/U;", "getApiKeyJob", "timerHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "timerRunnable", "Ljava/lang/Runnable;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeoProviderRepositoryImpl implements GeoProviderRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final M coroutineScope;
    private String currentLocationUid;
    private U<GeoProviderConfig> getAndReturnProviderJob;
    private B0 getApiKeyJob;
    private B0 getProviderJob;
    private C7415j tabsGeoProviderConfigs;

    @NotNull
    private Handler timerHandler;

    @NotNull
    private Runnable timerRunnable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geoprovider/GeoProviderRepositoryImpl$Companion;", "", "<init>", "()V", "UPDATE_GEO_PROVIDERS_DELAY", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActualBXTab.values().length];
            try {
                iArr[ActualBXTab.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActualBXTab.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActualBXTab.COURIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GeoProviderRepositoryImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("GeoProviderRepositoryImpl", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("GeoProviderRepositoryImpl")).plus(new GeoProviderRepositoryImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.timerHandler = new Handler(Looper.getMainLooper());
        this.timerRunnable = new RunnableC3601a(this, 0);
    }

    private final boolean checkApiKeyProvided(String locationUid) {
        if (C5008d.f36629d.f()) {
            AbstractC5006b.a.f36625d.getClass();
            return true;
        }
        this.getApiKeyJob = C10727i.c(this.coroutineScope, null, null, new GeoProviderRepositoryImpl$checkApiKeyProvided$1(this, locationUid, null), 3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getProvidersForTabs(Context context, d<? super C7415j> dVar) {
        return C7064a.f66281a.l(this.currentLocationUid, context, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler startUpdateTimer() {
        Handler handler = this.timerHandler;
        handler.removeCallbacks(this.timerRunnable);
        handler.postDelayed(this.timerRunnable, 540000L);
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timerRunnable$lambda$1(GeoProviderRepositoryImpl geoProviderRepositoryImpl) {
        geoProviderRepositoryImpl.fetchGeoProvider(geoProviderRepositoryImpl.currentLocationUid);
    }

    @Override // ru.ozon.app.android.geoprovider.GeoProviderRepository
    public boolean allProvidersLoaded() {
        return this.tabsGeoProviderConfigs != null;
    }

    @Override // ru.ozon.app.android.geoprovider.GeoProviderRepository
    public void fetchGeoProvider(String locationUid) {
        B0 b02 = this.getProviderJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (checkApiKeyProvided(locationUid)) {
            if (!Intrinsics.d(this.currentLocationUid, locationUid)) {
                this.currentLocationUid = locationUid;
            }
            this.getProviderJob = C10727i.c(this.coroutineScope, null, null, new GeoProviderRepositoryImpl$fetchGeoProvider$1(this, null), 3);
        }
    }

    @Override // ru.ozon.app.android.geoprovider.GeoProviderRepository
    @NotNull
    public GeoProviderConfig fetchGeoProviderWithResult(String locationUid) {
        U<GeoProviderConfig> u11 = this.getAndReturnProviderJob;
        if (u11 != null) {
            u11.j(null);
        }
        if (!Intrinsics.d(this.currentLocationUid, locationUid)) {
            this.currentLocationUid = locationUid;
        }
        U<GeoProviderConfig> a11 = C10727i.a(this.coroutineScope, null, null, new GeoProviderRepositoryImpl$fetchGeoProviderWithResult$job$1(this, locationUid, null), 3);
        this.getAndReturnProviderJob = a11;
        return (GeoProviderConfig) C10727i.d(g.f71771a, new GeoProviderRepositoryImpl$fetchGeoProviderWithResult$1(a11, null));
    }

    @Override // ru.ozon.app.android.geoprovider.GeoProviderRepository
    public GeoProviderConfig getGeoProviderConfig(@NotNull ActualBXTab actualBXTab) {
        Intrinsics.checkNotNullParameter(actualBXTab, "actualBXTab");
        int i11 = WhenMappings.$EnumSwitchMapping$0[actualBXTab.ordinal()];
        if (i11 == 1) {
            C7415j c7415j = this.tabsGeoProviderConfigs;
            if (c7415j != null) {
                return c7415j.c();
            }
            return null;
        }
        if (i11 == 2) {
            C7415j c7415j2 = this.tabsGeoProviderConfigs;
            if (c7415j2 != null) {
                return c7415j2.b();
            }
            return null;
        }
        if (i11 != 3) {
            throw new o();
        }
        C7415j c7415j3 = this.tabsGeoProviderConfigs;
        if (c7415j3 != null) {
            return c7415j3.a();
        }
        return null;
    }
}
