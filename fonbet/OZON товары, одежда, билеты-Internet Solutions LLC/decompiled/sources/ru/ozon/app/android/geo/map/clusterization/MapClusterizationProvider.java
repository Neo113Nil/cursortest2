package ru.ozon.app.android.geo.map.clusterization;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.s;
import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Wc.a;
import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import de0.C6193b;
import de0.d;
import de0.e;
import ee0.InterfaceC6350a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModelKt;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.NonHierarchicalViewBasedAlgorithm;
import we0.InterfaceC10542A;
import we0.m;
import we0.t;
import we0.u;
import we0.z;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 i2\u00020\u0001:\u0001iBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b/\u0010\u0015J\u001e\u00100\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b2\u0010\u0015J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0017J\u0018\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010!J\u001f\u0010;\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00120=H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010C\u001a\u0004\u0018\u00010B2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120@H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010G\u001a\u00020F2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u0002090_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010f¨\u0006j"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/MapClusterizationProvider;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Lkotlin/Function1;", "", "", "onPinClicked", "", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "bitmapProvider", "Lkotlin/Function0;", "onClusterizationFinished", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/mapcommon/map/OzonMapController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "Lwe0/u;", "placemarks", "clusterize", "(Ljava/util/List;)V", "updateClusterizationState", "()V", "onCameraEndMoveAction", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "item", "configureMapClusterization", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;)V", "onCameraCentered", "setupBaseLinks", "id", "selectPlacemark", "(Ljava/lang/String;)V", "unselectPlacemark", "Lru/ozon/app/android/geo/map/clusterization/CurrentPinState;", "newState", "changePlacemarkState", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/clusterization/CurrentPinState;)V", "findPlacemarkInViewport", "(Ljava/lang/String;)Lwe0/u;", "cacheKey", "Lru/ozon/app/android/geo/map/clusterization/PinMetadata;", "metaData", "oldPlacemark", "updatePlacemark", "(ILru/ozon/app/android/geo/map/clusterization/PinMetadata;Lwe0/u;)V", "observeCameraCenterAndClusterize", "startClusterization", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "addPlacemarksToClusterizer", "observeActions", "Lee0/a;", "clickModel", "handleClickModel", "(Lee0/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "handleClusterClick", "", "isMergedPin", "handlePinClick", "(Ljava/lang/String;Z)V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalViewBasedAlgorithm;", "createNonHierarchicalViewBasedAlgorithm", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalViewBasedAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "Lde0/d;", "createClusterizer", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)Lde0/d;", "items", "Lwe0/t;", "createClusterIcon", "(Ljava/util/List;)Lwe0/t;", "Landroid/content/Context;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/geo/map/clusterization/ClusterBitmapCache;", "clusterBitmapCache", "Lru/ozon/app/android/geo/map/clusterization/ClusterBitmapCache;", "Lde0/b;", "clusterizerMode$delegate", "LSc/j;", "getClusterizerMode", "()Lde0/b;", "clusterizerMode", "Lwe0/k;", "clusteringOptions$delegate", "getClusteringOptions", "()Lwe0/k;", "clusteringOptions", "clusterizer", "Lde0/d;", "isClusterizationEnabled", "Z", "LAe/x0;", "isCameraCenteredFlow", "LAe/x0;", "Lxe/M;", "coroutineScope", "Lxe/M;", "actionBaseLink", "Ljava/lang/String;", "mergedPinsActionBaseLink", "selectedPinId", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapClusterizationProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private String actionBaseLink;

    @NotNull
    private final Function1<Integer, BitmapContainer> bitmapProvider;

    @NotNull
    private final ClusterBitmapCache clusterBitmapCache;

    /* renamed from: clusteringOptions$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j clusteringOptions;
    private d clusterizer;

    /* renamed from: clusterizerMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j clusterizerMode;

    @NotNull
    private final Context context;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final x0<Boolean> isCameraCenteredFlow;
    private boolean isClusterizationEnabled;

    @NotNull
    private final OzonMapController mapController;
    private String mergedPinsActionBaseLink;

    @NotNull
    private final Function0<Unit> onClusterizationFinished;

    @NotNull
    private final Function1<String, Unit> onPinClicked;
    private String selectedPinId;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/MapClusterizationProvider$Companion;", "", "<init>", "()V", "MAX_DISTANCE_BETWEEN_CLUSTERED_ITEMS", "", "MAX_ITEMS_ON_MAP_THRESHOLD", "CAMERA_MOVING_DEBOUNCE", "", "PLACEMARK_ANIMATION_DURATION", "CLUSTERING_MIN_ZOOM", "MIN_ITEMS_COUNT_IN_CLUSTER", "ZOOM_INCREMENT", "", "ID_MASK", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapClusterizationProvider(@NotNull Context context, @NotNull OzonMapController mapController, @NotNull Function1<? super String, Unit> onPinClicked, @NotNull Function1<? super Integer, BitmapContainer> bitmapProvider, @NotNull Function0<Unit> onClusterizationFinished) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(onPinClicked, "onPinClicked");
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        Intrinsics.checkNotNullParameter(onClusterizationFinished, "onClusterizationFinished");
        this.context = context;
        this.mapController = mapController;
        this.onPinClicked = onPinClicked;
        this.bitmapProvider = bitmapProvider;
        this.onClusterizationFinished = onClusterizationFinished;
        this.clusterBitmapCache = new ClusterBitmapCache(context);
        this.clusterizerMode = k.b(MapClusterizationProvider$clusterizerMode$2.INSTANCE);
        this.clusteringOptions = k.b(MapClusterizationProvider$clusteringOptions$2.INSTANCE);
        this.isClusterizationEnabled = true;
        this.isCameraCenteredFlow = O0.a(Boolean.FALSE);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("MapClusterizationProvider", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("MapClusterizationProvider")).plus(new MapClusterizationProvider$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    private final void addPlacemarksToClusterizer(List<u> placemarks) {
        Algorithm<u> b11;
        d dVar = this.clusterizer;
        if (dVar == null || (b11 = dVar.b()) == null) {
            return;
        }
        b11.addItems(placemarks);
    }

    private final void changePlacemarkState(String id2, CurrentPinState newState) {
        u findPlacemarkInViewport = findPlacemarkInViewport(id2);
        if (findPlacemarkInViewport == null) {
            return;
        }
        Object k11 = findPlacemarkInViewport.k();
        PinMetadata pinMetadata = k11 instanceof PinMetadata ? (PinMetadata) k11 : null;
        if (pinMetadata == null) {
            return;
        }
        updatePlacemark(newState == CurrentPinState.SELECTED ? pinMetadata.getSelectedStateCacheHash() : pinMetadata.getDefaultStateCacheHash(), PinMetadata.copy$default(pinMetadata, null, 0, 0, newState, false, 23, null), findPlacemarkInViewport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t createClusterIcon(List<u> items) {
        return new t(new InterfaceC10542A.c(this.clusterBitmapCache.getClusterBitmap(items.size())), new PointF(0.5f, 0.5f), true);
    }

    private final d createClusterizer(Algorithm<u> algorithm) {
        e clusterController = this.mapController.getClusterController();
        if (clusterController == null) {
            return null;
        }
        C6193b clusterizerMode = getClusterizerMode();
        return clusterController.c(new MapClusterizationProvider$createClusterizer$1(this), getClusteringOptions(), algorithm, clusterizerMode);
    }

    private final NonHierarchicalViewBasedAlgorithm<u> createNonHierarchicalViewBasedAlgorithm() {
        NonHierarchicalViewBasedAlgorithm<u> nonHierarchicalViewBasedAlgorithm = new NonHierarchicalViewBasedAlgorithm<>();
        nonHierarchicalViewBasedAlgorithm.setMaxDistanceBetweenClusteredItems(150);
        return nonHierarchicalViewBasedAlgorithm;
    }

    private final u findPlacemarkInViewport(String id2) {
        d dVar = this.clusterizer;
        Object obj = null;
        if (dVar == null) {
            return null;
        }
        Iterator it = dVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((u) next).e(), id2)) {
                obj = next;
                break;
            }
        }
        return (u) obj;
    }

    private final we0.k getClusteringOptions() {
        return (we0.k) this.clusteringOptions.getValue();
    }

    private final C6193b getClusterizerMode() {
        return (C6193b) this.clusterizerMode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleClickModel(InterfaceC6350a interfaceC6350a, kotlin.coroutines.d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new MapClusterizationProvider$handleClickModel$2(interfaceC6350a, this, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClusterClick(String id2) {
        List<we0.s> a11;
        Object obj;
        m b11;
        CameraPositionModel cameraPosition$default;
        d dVar = this.clusterizer;
        if (dVar == null || (a11 = dVar.a()) == null) {
            return;
        }
        Iterator<T> it = a11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((we0.s) obj).d(), id2)) {
                    break;
                }
            }
        }
        we0.s sVar = (we0.s) obj;
        if (sVar == null || (b11 = sVar.b()) == null || (cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(this.mapController, null, 1, null)) == null) {
            return;
        }
        CameraPositionModel copy$default = CameraPositionModel.copy$default(cameraPosition$default, CoordinateModelKt.toCoordinateModel(b11), cameraPosition$default.getZoom() + 1.0f, 0.0f, 0.0f, 12, null);
        if (copy$default == null) {
            return;
        }
        OzonMapController.DefaultImpls.moveToAnimated$default(this.mapController, copy$default, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePinClick(String id2, boolean isMergedPin) {
        String str;
        selectPlacemark(id2);
        if (isMergedPin) {
            str = this.mergedPinsActionBaseLink;
            if (str == null) {
                str = this.actionBaseLink;
            }
        } else {
            str = this.actionBaseLink;
        }
        if (str == null || !h.t(str, "{id}", false)) {
            return;
        }
        this.onPinClicked.invoke(h.X(str, "{id}", id2, false));
    }

    private final void observeActions() {
        Ae.B0<InterfaceC6350a> f7;
        d dVar = this.clusterizer;
        if (dVar == null || (f7 = dVar.f()) == null) {
            return;
        }
        C2399j.C(new C2408n0(f7, new MapClusterizationProvider$observeActions$1(this, null)), this.coroutineScope);
    }

    private final void observeCameraCenterAndClusterize(List<u> placemarks) {
        final M0 b11 = C2399j.b(this.isCameraCenteredFlow);
        C2399j.C(new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$observeCameraCenterAndClusterize$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$observeCameraCenterAndClusterize$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$observeCameraCenterAndClusterize$$inlined$filter$1$2", f = "MapClusterizationProvider.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$observeCameraCenterAndClusterize$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new MapClusterizationProvider$observeCameraCenterAndClusterize$2(this, placemarks, null)), this.coroutineScope);
    }

    private final void selectPlacemark(String id2) {
        if (Intrinsics.d(this.selectedPinId, id2)) {
            return;
        }
        String str = this.selectedPinId;
        if (str != null) {
            unselectPlacemark(str);
        }
        this.selectedPinId = id2;
        changePlacemarkState(id2, CurrentPinState.SELECTED);
    }

    private final void setupBaseLinks(AddressEditMapVO item) {
        String actionBaseLink = item.getActionBaseLink();
        this.actionBaseLink = actionBaseLink != null ? UtilsKt.decodeLink(actionBaseLink) : null;
        String mergedPinsActionBaseLink = item.getMergedPinsActionBaseLink();
        this.mergedPinsActionBaseLink = mergedPinsActionBaseLink != null ? UtilsKt.decodeLink(mergedPinsActionBaseLink) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startClusterization(List<u> list, kotlin.coroutines.d<? super Unit> dVar) {
        this.clusterizer = createClusterizer(createNonHierarchicalViewBasedAlgorithm());
        addPlacemarksToClusterizer(list);
        observeActions();
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new MapClusterizationProvider$startClusterization$2(this, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    private final void unselectPlacemark(String id2) {
        changePlacemarkState(id2, CurrentPinState.DEFAULT);
    }

    private final void updatePlacemark(int cacheKey, PinMetadata metaData, u oldPlacemark) {
        BitmapContainer invoke = this.bitmapProvider.invoke(Integer.valueOf(cacheKey));
        if (invoke == null) {
            return;
        }
        u a11 = u.a(oldPlacemark, null, z.a(oldPlacemark.d(), new InterfaceC10542A.c(invoke.getBitmap(), String.valueOf(invoke.hashCode())), invoke.getAnchor(), false, 0.0f, 0.0f, 252), metaData, null, 1017);
        try {
            d dVar = this.clusterizer;
            if (dVar != null) {
                dVar.e(a11);
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
    }

    public final void clusterize(@NotNull List<u> placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        if (this.clusterizer != null) {
            return;
        }
        E0.d(this.coroutineScope.getCoroutineContext());
        observeCameraCenterAndClusterize(placemarks);
    }

    public final void configureMapClusterization(@NotNull AddressEditMapVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.isClusterizationEnabled = item.getClusterizationEnabled();
        updateClusterizationState();
        setupBaseLinks(item);
    }

    public final void onCameraCentered() {
        this.isCameraCenteredFlow.setValue(Boolean.TRUE);
    }

    public final void onCameraEndMoveAction() {
        String str = this.selectedPinId;
        if (str != null) {
            unselectPlacemark(str);
            this.selectedPinId = null;
        }
    }

    public final void updateClusterizationState() {
        de0.c cVar = this.isClusterizationEnabled ? de0.c.f61616c : de0.c.f61617d;
        d dVar = this.clusterizer;
        if (dVar != null) {
            dVar.c(cVar);
        }
    }
}
