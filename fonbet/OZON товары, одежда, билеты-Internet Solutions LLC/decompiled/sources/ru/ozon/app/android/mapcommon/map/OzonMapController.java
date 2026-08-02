package ru.ozon.app.android.mapcommon.map;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModel;
import ru.ozon.app.android.mapcommon.map.model.LogoPosition;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModel;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;
import we0.i;
import we0.q;
import we0.u;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000bJO\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b!\u0010\"J;\u0010'\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001d2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b'\u0010(J+\u0010,\u001a\u00020\u00072\u0006\u0010#\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020\u0011H&¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u00020908H&¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H&¢\u0006\u0004\b<\u0010\u0016J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0002H&¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u000209H&¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u000109H&¢\u0006\u0004\bC\u0010BJ\u0017\u0010D\u001a\u00020\u00072\u0006\u0010@\u001a\u000209H&¢\u0006\u0004\bD\u0010BJ\u0019\u0010E\u001a\u0004\u0018\u0001092\u0006\u0010=\u001a\u00020\u0002H&¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001082\u0006\u0010H\u001a\u00020GH&¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u0004H&¢\u0006\u0004\bO\u0010PJ\u0011\u0010R\u001a\u0004\u0018\u00010QH&¢\u0006\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001c\u0010\\\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010PR\u001c\u0010_\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b_\u0010]\"\u0004\b`\u0010PR\u001c\u0010a\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010PR\u001c\u0010c\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\bc\u0010]\"\u0004\bd\u0010PR\u001c\u0010e\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\be\u0010]\"\u0004\bf\u0010PR\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010m8&@&X¦\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR6\u0010y\u001a\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010s8&@&X¦\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lru/ozon/app/android/mapcommon/map/OzonMapController;", "", "", "locationUid", "", "isUseViewPlacemarkController", "Lkotlin/Function1;", "", "loading", "Lio/reactivex/b;", "initMap", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Lio/reactivex/b;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "sessionId", "isReinitialization", "(Lkotlin/jvm/functions/Function1;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Ljava/lang/String;ZZ)Lio/reactivex/b;", "", "height", "()I", "width", "onStart", "()V", "onStop", "onDestroy", "clear", "dispose", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "getCameraPosition", "(Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;)Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "Lwe0/i;", "getVisibleArea", "()Lwe0/i;", "position", "", "duration", "endAction", "moveToAnimated", "(Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/mapcommon/map/model/LogoPosition;", "horizontalPadding", "verticalPadding", "setLogoAlignment", "(Lru/ozon/app/android/mapcommon/map/model/LogoPosition;II)V", "Lwe0/q;", "logoConfig", "setLogoConfig", "(Lwe0/q;)V", "Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "rect", "setFocusRect", "(Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;)V", "getFocusRect", "()Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "", "Lwe0/u;", "getPlacemarkObjects", "()Ljava/util/List;", "clearPlacemarkObjects", "id", "removePlacemark", "(Ljava/lang/String;)V", "placemark", "insertPlacemark", "(Lwe0/u;)V", "showUserPlaceMark", "updateMarker", "getPlacemarkById", "(Ljava/lang/String;)Lwe0/u;", "Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;", "providerType", "getPreferredProvider", "(Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;)Ljava/util/List;", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "getAnalyticsModuleState", "()Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "isEnabled", "setPinAnimationEnabledState", "(Z)V", "Lde0/e;", "getClusterController", "()Lde0/e;", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "LAe/h;", "getTilesLoadingFlow", "()LAe/h;", "tilesLoadingFlow", "isScrollGesturesEnabled", "()Z", "setScrollGesturesEnabled", "isZoomGesturesEnabled", "setZoomGesturesEnabled", "isRotateGesturesEnabled", "setRotateGesturesEnabled", "isTiltGesturesEnabled", "setTiltGesturesEnabled", "isDarkThemeEnabled", "setDarkThemeEnabled", "Landroid/graphics/Point;", "getZoomFocusPoint", "()Landroid/graphics/Point;", "setZoomFocusPoint", "(Landroid/graphics/Point;)V", "zoomFocusPoint", "Lkotlin/Function0;", "getOnSizeChanged", "()Lkotlin/jvm/functions/Function0;", "setOnSizeChanged", "(Lkotlin/jvm/functions/Function0;)V", "onSizeChanged", "Lkotlin/Function3;", "Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;", "getOnCameraChanged", "()Lfd/n;", "setOnCameraChanged", "(Lfd/n;)V", "onCameraChanged", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OzonMapController {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CameraPositionModel getCameraPosition$default(OzonMapController ozonMapController, BoundingBoxModel boundingBoxModel, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCameraPosition");
            }
            if ((i11 & 1) != 0) {
                boundingBoxModel = null;
            }
            return ozonMapController.getCameraPosition(boundingBoxModel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC7094b initMap$default(OzonMapController ozonMapController, String str, boolean z11, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initMap");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            if ((i11 & 4) != 0) {
                function1 = null;
            }
            return ozonMapController.initMap(str, z11, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void moveToAnimated$default(OzonMapController ozonMapController, CameraPositionModel cameraPositionModel, Float f7, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToAnimated");
            }
            if ((i11 & 2) != 0) {
                f7 = null;
            }
            if ((i11 & 4) != 0) {
                function1 = null;
            }
            ozonMapController.moveToAnimated(cameraPositionModel, f7, function1);
        }

        public static /* synthetic */ void setLogoAlignment$default(OzonMapController ozonMapController, LogoPosition logoPosition, int i11, int i12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLogoAlignment");
            }
            if ((i13 & 2) != 0) {
                i11 = 10;
            }
            if ((i13 & 4) != 0) {
                i12 = 10;
            }
            ozonMapController.setLogoAlignment(logoPosition, i11, i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC7094b initMap$default(OzonMapController ozonMapController, Function1 function1, GeoProviderConfig geoProviderConfig, String str, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initMap");
            }
            if ((i11 & 1) != 0) {
                function1 = null;
            }
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            if ((i11 & 16) != 0) {
                z12 = false;
            }
            return ozonMapController.initMap(function1, geoProviderConfig, str, z11, z12);
        }
    }

    void clear();

    void clearPlacemarkObjects();

    void dispose();

    @NotNull
    AnalyticModuleState getAnalyticsModuleState();

    CameraPositionModel getCameraPosition(BoundingBoxModel boundingBox);

    e getClusterController();

    @NotNull
    View getContentView();

    ScreenRectModel getFocusRect();

    u getPlacemarkById(@NotNull String id2);

    @NotNull
    List<u> getPlacemarkObjects();

    List<String> getPreferredProvider(@NotNull PreferredProvider.Type providerType);

    InterfaceC2395h<Boolean> getTilesLoadingFlow();

    i getVisibleArea();

    int height();

    @NotNull
    AbstractC7094b initMap(String locationUid, boolean isUseViewPlacemarkController, Function1<? super Boolean, Unit> loading);

    @NotNull
    AbstractC7094b initMap(Function1<? super Boolean, Unit> loading, @NotNull GeoProviderConfig geoProviderConfig, String sessionId, boolean isReinitialization, boolean isUseViewPlacemarkController);

    void insertPlacemark(@NotNull u placemark);

    void moveToAnimated(@NotNull CameraPositionModel position, Float duration, Function1<? super Boolean, Unit> endAction);

    void onDestroy();

    void onStart();

    void onStop();

    void removePlacemark(@NotNull String id2);

    void setDarkThemeEnabled(boolean z11);

    void setFocusRect(ScreenRectModel rect);

    void setLogoAlignment(@NotNull LogoPosition position, int horizontalPadding, int verticalPadding);

    void setLogoConfig(@NotNull q logoConfig);

    void setOnCameraChanged(InterfaceC6511n<? super CameraPositionModel, ? super CameraUpdateReasonModel, ? super Boolean, Unit> interfaceC6511n);

    void setOnSizeChanged(Function0<Unit> function0);

    void setPinAnimationEnabledState(boolean isEnabled);

    void setRotateGesturesEnabled(boolean z11);

    void setScrollGesturesEnabled(boolean z11);

    void setTiltGesturesEnabled(boolean z11);

    void setZoomFocusPoint(Point point);

    void setZoomGesturesEnabled(boolean z11);

    void showUserPlaceMark(u placemark);

    void updateMarker(@NotNull u placemark);

    int width();
}
