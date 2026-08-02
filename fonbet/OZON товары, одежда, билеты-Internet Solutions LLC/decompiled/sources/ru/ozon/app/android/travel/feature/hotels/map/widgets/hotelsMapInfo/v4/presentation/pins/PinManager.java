package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoSyncVoHelper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VOKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import we0.i;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001RB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Ji\u0010!\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u001e\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u0004\u0018\u00010\u00152\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00010\u00152\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b(\u0010)J)\u0010,\u001a\u0004\u0018\u00010\u00152\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\nJ\u001d\u00101\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\b¢\u0006\u0004\b7\u0010\nR\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010.\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "performClustering", "()V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "settings", "setPriorityPinsInCluster", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;)V", "", "isEnabled", "toggleIndivisibleClusters", "(Z)V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pins", "Lwe0/i;", "area", "", "latitudeCellPxSize", "longitudeCellPxSize", "", "zoom", "Lkotlin/Function1;", "", "onFinish", "clustering", "(Ljava/util/concurrent/ConcurrentHashMap;Lwe0/i;IILjava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "vo", "pin", "selectPin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "unselectPin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "sku", "isFavorite", "setPinFavoriteStatus", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Ljava/lang/String;Z)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "previousSelectedPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "resetSelectedPin", "onMapReady", "(Lwe0/i;F)V", "currentVisibleArea", "currentZoom", "detectLargeMove", "(Lwe0/i;F)Z", "onCleared", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/GeoHashAlgorithm;", "algorithm", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/GeoHashAlgorithm;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoSyncVoHelper;", "voSyncHelper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoSyncVoHelper;", "clusteredPins", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "clusteringJob", "Lxe/B0;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/ClusteringTask;", "clusteringTasks", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "prevVisibleArea", "Lwe0/i;", "prevZoom", "F", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PinManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final GeoHashAlgorithm algorithm;

    @NotNull
    private final ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> clusteredPins;
    private B0 clusteringJob;

    @NotNull
    private final ConcurrentLinkedDeque<ClusteringTask> clusteringTasks;

    @NotNull
    private final CoroutineContext coroutineContext;
    private i prevVisibleArea;
    private float prevZoom;
    private HotelsMapInfoV4VO.Pin previousSelectedPin;

    @NotNull
    private final M scope;

    @NotNull
    private final HotelsMapInfoSyncVoHelper voSyncHelper;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PinManager$Companion;", "", "<init>", "()V", "CLUSTERING_TASKS_CAPACITY", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PinManager(@NotNull Context context, @NotNull CoroutineDispatcherProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.algorithm = new GeoHashAlgorithm(context);
        this.voSyncHelper = new HotelsMapInfoSyncVoHelper();
        this.clusteredPins = new ConcurrentHashMap<>();
        CoroutineContext d11 = CoroutineContext.Element.a.d(dispatchersProvider.getDefault(), (H0) X0.b());
        this.coroutineContext = d11;
        this.scope = N.a(d11);
        this.clusteringTasks = new ConcurrentLinkedDeque<>();
        performClustering();
    }

    private final void performClustering() {
        C10727i.c(this.scope, null, null, new PinManager$performClustering$1(this, null), 3);
    }

    public final void clustering(@NotNull ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins, i area, int latitudeCellPxSize, int longitudeCellPxSize, Float zoom, @NotNull Function1<? super Map<String, HotelsMapInfoV4VO.Pin>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if (this.clusteringTasks.size() >= 1) {
            this.clusteringTasks.pollFirst();
        }
        if (area == null && (area = this.prevVisibleArea) == null) {
            return;
        }
        this.clusteringTasks.addLast(new ClusteringTask(pins, latitudeCellPxSize, longitudeCellPxSize, area, zoom != null ? zoom.floatValue() : this.prevZoom, onFinish));
    }

    public final boolean detectLargeMove(@NotNull i currentVisibleArea, float currentZoom) {
        Intrinsics.checkNotNullParameter(currentVisibleArea, "currentVisibleArea");
        if (Math.abs(this.prevZoom - currentZoom) >= 0.8f) {
            this.prevZoom = currentZoom;
            this.prevVisibleArea = currentVisibleArea;
            return true;
        }
        i iVar = this.prevVisibleArea;
        if (iVar == null) {
            this.prevVisibleArea = currentVisibleArea;
            return true;
        }
        double d11 = 0.5f;
        double abs = Math.abs(iVar.d().getLongitude() - iVar.e().getLongitude()) * d11;
        if (Math.abs(iVar.d().getLatitude() - currentVisibleArea.d().getLatitude()) <= Math.abs(iVar.f().getLatitude() - iVar.d().getLatitude()) * d11 && Math.abs(iVar.d().getLongitude() - currentVisibleArea.d().getLongitude()) <= abs) {
            return false;
        }
        this.prevVisibleArea = currentVisibleArea;
        return true;
    }

    public final void onCleared() {
        N.c(this.scope, null);
        this.clusteringJob = null;
    }

    public final void onMapReady(@NotNull i area, float zoom) {
        Intrinsics.checkNotNullParameter(area, "area");
        this.prevVisibleArea = area;
        this.prevZoom = zoom;
    }

    /* renamed from: previousSelectedPin, reason: from getter */
    public final HotelsMapInfoV4VO.Pin getPreviousSelectedPin() {
        return this.previousSelectedPin;
    }

    public final void resetSelectedPin() {
        this.previousSelectedPin = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        r1 = r4.copy((r35 & 1) != 0 ? r4.id : null, (r35 & 2) != 0 ? r4.rank : 0.0f, (r35 & 4) != 0 ? r4.coords : null, (r35 & 8) != 0 ? r4.geohash : 0, (r35 & 16) != 0 ? r4.title : null, (r35 & 32) != 0 ? r4.price : null, (r35 & 64) != 0 ? r4.hasDiscount : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.isFavorite : false, (r35 & 256) != 0 ? r4.isViewed : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.isSelected : true, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.isTop : false, (r35 & 2048) != 0 ? r4.sku : null, (r35 & 4096) != 0 ? r4.rightIconId : null, (r35 & 8192) != 0 ? r4.leftIconId : null, (r35 & 16384) != 0 ? r4.isIndivisiblePin : false, (r35 & 32768) != 0 ? r4.innerIds : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HotelsMapInfoV4VO.Pin selectPin(HotelsMapInfoV4VO vo, @NotNull HotelsMapInfoV4VO.Pin pin) {
        HotelsMapInfoV4VO.Pin copy;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (vo == null) {
            return null;
        }
        this.voSyncHelper.selectPin(vo, pin.getId(), true);
        HotelsMapInfoV4VO.Pin pin2 = this.clusteredPins.get(pin.getId());
        if (pin2 == null || copy == null) {
            return null;
        }
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap = this.clusteredPins;
        String id2 = pin.getId();
        HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(copy);
        concurrentHashMap.put(id2, copy);
        this.previousSelectedPin = copy;
        return copy;
    }

    public final HotelsMapInfoV4VO.Pin setPinFavoriteStatus(HotelsMapInfoV4VO vo, @NotNull String sku, boolean isFavorite) {
        HotelsMapInfoV4VO.Pin pinFavoriteStatus;
        boolean z11;
        HotelsMapInfoV4VO.Pin copy;
        HotelsMapInfoV4VO.Pin copy2;
        Intrinsics.checkNotNullParameter(sku, "sku");
        if (vo == null || (pinFavoriteStatus = this.voSyncHelper.setPinFavoriteStatus(vo, sku, isFavorite)) == null) {
            return null;
        }
        HotelsMapInfoV4VO.Pin pin = this.clusteredPins.get(pinFavoriteStatus.getId());
        if (pin != null && !pin.getIsIndivisiblePin()) {
            copy2 = pin.copy((r35 & 1) != 0 ? pin.id : null, (r35 & 2) != 0 ? pin.rank : 0.0f, (r35 & 4) != 0 ? pin.coords : null, (r35 & 8) != 0 ? pin.geohash : 0L, (r35 & 16) != 0 ? pin.title : null, (r35 & 32) != 0 ? pin.price : null, (r35 & 64) != 0 ? pin.hasDiscount : false, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pin.isFavorite : isFavorite, (r35 & 256) != 0 ? pin.isViewed : false, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pin.isSelected : false, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pin.isTop : false, (r35 & 2048) != 0 ? pin.sku : null, (r35 & 4096) != 0 ? pin.rightIconId : null, (r35 & 8192) != 0 ? pin.leftIconId : null, (r35 & 16384) != 0 ? pin.isIndivisiblePin : false, (r35 & 32768) != 0 ? pin.innerIds : null);
            ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap = this.clusteredPins;
            String id2 = copy2.getId();
            HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(copy2);
            concurrentHashMap.put(id2, copy2);
            return copy2;
        }
        for (HotelsMapInfoV4VO.Pin pin2 : this.clusteredPins.values()) {
            Intrinsics.checkNotNullExpressionValue(pin2, "next(...)");
            HotelsMapInfoV4VO.Pin pin3 = pin2;
            if (pin3.getIsIndivisiblePin()) {
                Iterator<HotelsMapInfoV4VO.Pin.InnerPin> it = pin3.getInnerIds().iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (Intrinsics.d(it.next().getId(), pinFavoriteStatus.getId())) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                    List<HotelsMapInfoV4VO.Pin.InnerPin> innerIds = pin3.getInnerIds();
                    if (!(innerIds instanceof Collection) || !innerIds.isEmpty()) {
                        Iterator<T> it2 = innerIds.iterator();
                        while (it2.hasNext()) {
                            HotelsMapInfoV4VO.Pin pin4 = vo.getPins().get(((HotelsMapInfoV4VO.Pin.InnerPin) it2.next()).getId());
                            if (pin4 != null && pin4.getIsFavorite()) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    copy = pin3.copy((r35 & 1) != 0 ? pin3.id : null, (r35 & 2) != 0 ? pin3.rank : 0.0f, (r35 & 4) != 0 ? pin3.coords : null, (r35 & 8) != 0 ? pin3.geohash : 0L, (r35 & 16) != 0 ? pin3.title : null, (r35 & 32) != 0 ? pin3.price : null, (r35 & 64) != 0 ? pin3.hasDiscount : false, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pin3.isFavorite : z11, (r35 & 256) != 0 ? pin3.isViewed : false, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pin3.isSelected : false, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pin3.isTop : false, (r35 & 2048) != 0 ? pin3.sku : null, (r35 & 4096) != 0 ? pin3.rightIconId : null, (r35 & 8192) != 0 ? pin3.leftIconId : null, (r35 & 16384) != 0 ? pin3.isIndivisiblePin : false, (r35 & 32768) != 0 ? pin3.innerIds : null);
                    ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap2 = this.clusteredPins;
                    String id3 = pin3.getId();
                    HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(copy);
                    concurrentHashMap2.put(id3, copy);
                    return copy;
                }
            }
        }
        return null;
    }

    public final void setPriorityPinsInCluster(@NotNull HotelsMapInfoV4VO.PinsDisplaySettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.algorithm.setPriorityPinsInCluster(settings);
    }

    public final void toggleIndivisibleClusters(boolean isEnabled) {
        this.algorithm.toggleIndivisibleClusters(isEnabled);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = r4.copy((r35 & 1) != 0 ? r4.id : null, (r35 & 2) != 0 ? r4.rank : 0.0f, (r35 & 4) != 0 ? r4.coords : null, (r35 & 8) != 0 ? r4.geohash : 0, (r35 & 16) != 0 ? r4.title : null, (r35 & 32) != 0 ? r4.price : null, (r35 & 64) != 0 ? r4.hasDiscount : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.isFavorite : false, (r35 & 256) != 0 ? r4.isViewed : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.isSelected : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.isTop : false, (r35 & 2048) != 0 ? r4.sku : null, (r35 & 4096) != 0 ? r4.rightIconId : null, (r35 & 8192) != 0 ? r4.leftIconId : null, (r35 & 16384) != 0 ? r4.isIndivisiblePin : false, (r35 & 32768) != 0 ? r4.innerIds : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HotelsMapInfoV4VO.Pin unselectPin(HotelsMapInfoV4VO vo) {
        HotelsMapInfoV4VO.Pin pin;
        String id2;
        HotelsMapInfoV4VO.Pin copy;
        if (vo != null && (pin = this.previousSelectedPin) != null && (id2 = pin.getId()) != null) {
            this.voSyncHelper.selectPin(vo, id2, false);
            HotelsMapInfoV4VO.Pin pin2 = this.clusteredPins.get(id2);
            if (pin2 != null && copy != null) {
                ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> concurrentHashMap = this.clusteredPins;
                HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(copy);
                concurrentHashMap.put(id2, copy);
                this.previousSelectedPin = null;
                return copy;
            }
        }
        return null;
    }
}
