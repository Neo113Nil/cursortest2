package ru.ozon.app.android.mapcommon.mapcommon;

import Ae.InterfaceC2395h;
import android.graphics.Point;
import android.view.View;
import de0.e;
import fd.InterfaceC6511n;
import io.reactivex.AbstractC7094b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.flags.CacheGeoProviderFlag;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModel;
import ru.ozon.app.android.mapcommon.map.model.LogoPosition;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModel;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;
import we0.i;
import we0.q;
import we0.u;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0011\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0016JH\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b%\u0010!J\u001c\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010+H\u0096\u0001¢\u0006\u0004\b,\u0010-J8\u00102\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010/2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b2\u00103J(\u00107\u001a\u00020\u000e2\u0006\u0010.\u001a\u0002042\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u000e2\b\u0010>\u001a\u0004\u0018\u00010=H\u0096\u0001¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010=H\u0096\u0001¢\u0006\u0004\bA\u0010BJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020D0CH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\bG\u0010!J\u0018\u0010I\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\bI\u0010JJ\u0018\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u001a\u0010N\u001a\u00020\u000e2\b\u0010K\u001a\u0004\u0018\u00010DH\u0096\u0001¢\u0006\u0004\bN\u0010MJ\u0018\u0010O\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bO\u0010MJ\u001a\u0010P\u001a\u0004\u0018\u00010D2\u0006\u0010H\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\bP\u0010QJ \u0010T\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010C2\u0006\u0010S\u001a\u00020RH\u0096\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010W\u001a\u00020VH\u0096\u0001¢\u0006\u0004\bW\u0010XJ\u0018\u0010Z\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\bZ\u0010[J\u0012\u0010]\u001a\u0004\u0018\u00010\\H\u0096\u0001¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010`R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010bR\u0014\u0010f\u001a\u00020c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001c\u0010j\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010g8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001c\u0010k\u001a\u00020\r8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010[R\u001c\u0010n\u001a\u00020\r8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bn\u0010l\"\u0004\bo\u0010[R\u001c\u0010p\u001a\u00020\r8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bp\u0010l\"\u0004\bq\u0010[R\u001c\u0010r\u001a\u00020\r8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\br\u0010l\"\u0004\bs\u0010[R\u001c\u0010t\u001a\u00020\r8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bt\u0010l\"\u0004\bu\u0010[R\u001e\u0010{\u001a\u0004\u0018\u00010v8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010|8\u0016@\u0016X\u0096\u000f¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R=\u0010\u0088\u0001\u001a\u001e\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0082\u00018\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0089\u0001"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapperImpl;", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "ozonMapController", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/mapcommon/map/OzonMapController;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lkotlin/Function1;", "", "", "loading", "Lio/reactivex/b;", "initMap", "(Lkotlin/jvm/functions/Function1;)Lio/reactivex/b;", "", "locationUid", "isUseViewPlacemarkController", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Lio/reactivex/b;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "sessionId", "isReinitialization", "(Lkotlin/jvm/functions/Function1;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Ljava/lang/String;ZZ)Lio/reactivex/b;", "", "height", "()I", "width", "onStart", "()V", "onStop", "onDestroy", "clear", "dispose", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "getCameraPosition", "(Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;)Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "Lwe0/i;", "getVisibleArea", "()Lwe0/i;", "position", "", "duration", "endAction", "moveToAnimated", "(Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/mapcommon/map/model/LogoPosition;", "horizontalPadding", "verticalPadding", "setLogoAlignment", "(Lru/ozon/app/android/mapcommon/map/model/LogoPosition;II)V", "Lwe0/q;", "logoConfig", "setLogoConfig", "(Lwe0/q;)V", "Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "rect", "setFocusRect", "(Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;)V", "getFocusRect", "()Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "", "Lwe0/u;", "getPlacemarkObjects", "()Ljava/util/List;", "clearPlacemarkObjects", "id", "removePlacemark", "(Ljava/lang/String;)V", "placemark", "insertPlacemark", "(Lwe0/u;)V", "showUserPlaceMark", "updateMarker", "getPlacemarkById", "(Ljava/lang/String;)Lwe0/u;", "Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;", "providerType", "getPreferredProvider", "(Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;)Ljava/util/List;", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "getAnalyticsModuleState", "()Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "isEnabled", "setPinAnimationEnabledState", "(Z)V", "Lde0/e;", "getClusterController", "()Lde0/e;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "LAe/h;", "getTilesLoadingFlow", "()LAe/h;", "tilesLoadingFlow", "isScrollGesturesEnabled", "()Z", "setScrollGesturesEnabled", "isZoomGesturesEnabled", "setZoomGesturesEnabled", "isRotateGesturesEnabled", "setRotateGesturesEnabled", "isTiltGesturesEnabled", "setTiltGesturesEnabled", "isDarkThemeEnabled", "setDarkThemeEnabled", "Landroid/graphics/Point;", "getZoomFocusPoint", "()Landroid/graphics/Point;", "setZoomFocusPoint", "(Landroid/graphics/Point;)V", "zoomFocusPoint", "Lkotlin/Function0;", "getOnSizeChanged", "()Lkotlin/jvm/functions/Function0;", "setOnSizeChanged", "(Lkotlin/jvm/functions/Function0;)V", "onSizeChanged", "Lkotlin/Function3;", "Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;", "getOnCameraChanged", "()Lfd/n;", "setOnCameraChanged", "(Lfd/n;)V", "onCameraChanged", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonMapControllerWrapperImpl implements OzonMapControllerWrapper, OzonMapController {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final OzonMapController ozonMapController;

    public OzonMapControllerWrapperImpl(@NotNull OzonMapController ozonMapController, @NotNull AreaLocalStore areaLocalStore, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ozonMapController, "ozonMapController");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.ozonMapController = ozonMapController;
        this.areaLocalStore = areaLocalStore;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.featureChecker = featureChecker;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void clear() {
        this.ozonMapController.clear();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void clearPlacemarkObjects() {
        this.ozonMapController.clearPlacemarkObjects();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void dispose() {
        this.ozonMapController.dispose();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public AnalyticModuleState getAnalyticsModuleState() {
        return this.ozonMapController.getAnalyticsModuleState();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public CameraPositionModel getCameraPosition(BoundingBoxModel boundingBox) {
        return this.ozonMapController.getCameraPosition(boundingBox);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public e getClusterController() {
        return this.ozonMapController.getClusterController();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public View getContentView() {
        return this.ozonMapController.getContentView();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public ScreenRectModel getFocusRect() {
        return this.ozonMapController.getFocusRect();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public u getPlacemarkById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.ozonMapController.getPlacemarkById(id2);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public List<u> getPlacemarkObjects() {
        return this.ozonMapController.getPlacemarkObjects();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public List<String> getPreferredProvider(@NotNull PreferredProvider.Type providerType) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        return this.ozonMapController.getPreferredProvider(providerType);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public InterfaceC2395h<Boolean> getTilesLoadingFlow() {
        return this.ozonMapController.getTilesLoadingFlow();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public i getVisibleArea() {
        return this.ozonMapController.getVisibleArea();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public int height() {
        return this.ozonMapController.height();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public AbstractC7094b initMap(String locationUid, boolean isUseViewPlacemarkController, Function1<? super Boolean, Unit> loading) {
        return this.ozonMapController.initMap(locationUid, isUseViewPlacemarkController, loading);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void insertPlacemark(@NotNull u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        this.ozonMapController.insertPlacemark(placemark);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void moveToAnimated(@NotNull CameraPositionModel position, Float duration, Function1<? super Boolean, Unit> endAction) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.ozonMapController.moveToAnimated(position, duration, endAction);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void onDestroy() {
        this.ozonMapController.onDestroy();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void onStart() {
        this.ozonMapController.onStart();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void onStop() {
        this.ozonMapController.onStop();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void removePlacemark(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.ozonMapController.removePlacemark(id2);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setDarkThemeEnabled(boolean z11) {
        this.ozonMapController.setDarkThemeEnabled(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setFocusRect(ScreenRectModel rect) {
        this.ozonMapController.setFocusRect(rect);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setLogoAlignment(@NotNull LogoPosition position, int horizontalPadding, int verticalPadding) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.ozonMapController.setLogoAlignment(position, horizontalPadding, verticalPadding);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setLogoConfig(@NotNull q logoConfig) {
        Intrinsics.checkNotNullParameter(logoConfig, "logoConfig");
        this.ozonMapController.setLogoConfig(logoConfig);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setOnCameraChanged(InterfaceC6511n<? super CameraPositionModel, ? super CameraUpdateReasonModel, ? super Boolean, Unit> interfaceC6511n) {
        this.ozonMapController.setOnCameraChanged(interfaceC6511n);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setOnSizeChanged(Function0<Unit> function0) {
        this.ozonMapController.setOnSizeChanged(function0);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setPinAnimationEnabledState(boolean isEnabled) {
        this.ozonMapController.setPinAnimationEnabledState(isEnabled);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setRotateGesturesEnabled(boolean z11) {
        this.ozonMapController.setRotateGesturesEnabled(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setScrollGesturesEnabled(boolean z11) {
        this.ozonMapController.setScrollGesturesEnabled(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setTiltGesturesEnabled(boolean z11) {
        this.ozonMapController.setTiltGesturesEnabled(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setZoomFocusPoint(Point point) {
        this.ozonMapController.setZoomFocusPoint(point);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setZoomGesturesEnabled(boolean z11) {
        this.ozonMapController.setZoomGesturesEnabled(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void showUserPlaceMark(u placemark) {
        this.ozonMapController.showUserPlaceMark(placemark);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void updateMarker(@NotNull u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        this.ozonMapController.updateMarker(placemark);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public int width() {
        return this.ozonMapController.width();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public AbstractC7094b initMap(Function1<? super Boolean, Unit> loading, @NotNull GeoProviderConfig geoProviderConfig, String sessionId, boolean isReinitialization, boolean isUseViewPlacemarkController) {
        Intrinsics.checkNotNullParameter(geoProviderConfig, "geoProviderConfig");
        return this.ozonMapController.initMap(loading, geoProviderConfig, sessionId, isReinitialization, isUseViewPlacemarkController);
    }

    @Override // ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapper
    @NotNull
    public AbstractC7094b initMap(Function1<? super Boolean, Unit> loading) {
        GeoProviderConfig geoProviderConfig = this.ozonGeoProxyClient.getGeoProviderConfig();
        boolean isEnabled = this.featureChecker.isEnabled(CacheGeoProviderFlag.INSTANCE);
        if (geoProviderConfig != null && this.ozonGeoProxyClient.isGeoProviderHold()) {
            return OzonMapController.DefaultImpls.initMap$default(this.ozonMapController, loading, geoProviderConfig, null, false, false, 28, null);
        }
        if (geoProviderConfig != null && isEnabled) {
            return OzonMapController.DefaultImpls.initMap$default(this.ozonMapController, loading, geoProviderConfig, null, false, false, 28, null);
        }
        return OzonMapController.DefaultImpls.initMap$default(this.ozonMapController, this.areaLocalStore.getLocationUid(), false, loading, 2, null);
    }
}
