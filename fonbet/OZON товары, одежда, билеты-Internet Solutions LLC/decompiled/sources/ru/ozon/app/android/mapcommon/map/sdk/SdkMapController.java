package ru.ozon.app.android.mapcommon.map.sdk;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import De.s;
import Ge.k;
import Ie0.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import ce0.InterfaceC5817a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import de0.e;
import fd.InterfaceC6511n;
import io.reactivex.AbstractC7094b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me0.InterfaceC8137a;
import ne0.C8583b;
import ne0.InterfaceC8585d;
import ne0.InterfaceC8587f;
import org.jetbrains.annotations.NotNull;
import pe0.AbstractC8905a;
import qc.InterfaceC9019a;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModelKt;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModelKt;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModel;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;
import ru.ozon.app.android.mapcommon.map.model.LogoPosition;
import ru.ozon.app.android.mapcommon.map.model.LogoPositionKt;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModel;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModelKt;
import ru.ozon.app.android.mapcommon.map.sdk.SdkMapController;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;
import vc.C10299d;
import vc.C10302g;
import ve0.b;
import we0.C10551g;
import we0.i;
import we0.j;
import we0.q;
import we0.u;
import we0.y;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;
import xe0.InterfaceC10766e;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009e\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J7\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010(2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\u001aJ\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020=H\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010=H\u0017¢\u0006\u0004\bG\u0010FJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020=H\u0016¢\u0006\u0004\bH\u0010FJ\u0019\u0010I\u001a\u0004\u0018\u00010=2\u0006\u0010A\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010<2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010TJ\u0011\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020X2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J)\u0010\\\u001a\u00020\r*\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\b^\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010_R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR*\u0010i\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010h8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR<\u0010q\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010o8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR0\u0010x\u001a\u0010\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R1\u0010~\u001a\u0010\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0013\n\u0004\b~\u0010y\u001a\u0004\b\u007f\u0010{\"\u0005\b\u0080\u0001\u0010}R(\u0010\u0081\u0001\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0081\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010TR \u0010\u0088\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008a\u0001\u001a\u00020\b2\u0007\u0010\u0089\u0001\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u008a\u0001\u0010\u0083\u0001\"\u0005\b\u008b\u0001\u0010TR)\u0010\u008c\u0001\u001a\u00020\b2\u0007\u0010\u0089\u0001\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u008c\u0001\u0010\u0083\u0001\"\u0005\b\u008d\u0001\u0010TR)\u0010\u008e\u0001\u001a\u00020\b2\u0007\u0010\u0089\u0001\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u008e\u0001\u0010\u0083\u0001\"\u0005\b\u008f\u0001\u0010TR)\u0010\u0090\u0001\u001a\u00020\b2\u0007\u0010\u0089\u0001\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0090\u0001\u0010\u0083\u0001\"\u0005\b\u0091\u0001\u0010TR(\u0010\u0092\u0001\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0001\u0010\u0083\u0001\"\u0005\b\u0093\u0001\u0010TR0\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0094\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009f\u0001"}, d2 = {"Lru/ozon/app/android/mapcommon/map/sdk/SdkMapController;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Landroid/view/ViewGroup;", "mapContainer", "<init>", "(Landroid/view/ViewGroup;)V", "", "locationUid", "", "isUseViewPlacemarkController", "Lkotlin/Function1;", "", "loading", "Lio/reactivex/b;", "initMap", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Lio/reactivex/b;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "sessionId", "isReinitialization", "(Lkotlin/jvm/functions/Function1;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Ljava/lang/String;ZZ)Lio/reactivex/b;", "", "height", "()I", "width", "onStart", "()V", "onStop", "onDestroy", "clear", "dispose", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "getCameraPosition", "(Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;)Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "Lwe0/i;", "getVisibleArea", "()Lwe0/i;", "position", "", "duration", "endAction", "moveToAnimated", "(Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/mapcommon/map/model/LogoPosition;", "horizontalPadding", "verticalPadding", "setLogoAlignment", "(Lru/ozon/app/android/mapcommon/map/model/LogoPosition;II)V", "Lwe0/q;", "logoConfig", "setLogoConfig", "(Lwe0/q;)V", "Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "rect", "setFocusRect", "(Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;)V", "getFocusRect", "()Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "", "Lwe0/u;", "getPlacemarkObjects", "()Ljava/util/List;", "clearPlacemarkObjects", "id", "removePlacemark", "(Ljava/lang/String;)V", "placemark", "insertPlacemark", "(Lwe0/u;)V", "showUserPlaceMark", "updateMarker", "getPlacemarkById", "(Ljava/lang/String;)Lwe0/u;", "Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;", "providerType", "getPreferredProvider", "(Lru/ozon/mapsdk/common/geoproxy/model/PreferredProvider$Type;)Ljava/util/List;", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "getAnalyticsModuleState", "()Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "isEnabled", "setPinAnimationEnabledState", "(Z)V", "Lde0/e;", "getClusterController", "()Lde0/e;", "Lwe0/j;", "padding", "getCheckedCameraVisibleAreaPadding", "(Lwe0/j;)Lwe0/j;", "doAfterMapInit", "(Lio/reactivex/b;Lkotlin/jvm/functions/Function1;)Lio/reactivex/b;", "addContentViewToContainer", "Landroid/view/ViewGroup;", "Lru/ozon/mapsdk/OzonMapView;", "contentView", "Lru/ozon/mapsdk/OzonMapView;", "getContentView", "()Lru/ozon/mapsdk/OzonMapView;", "Lxe/M;", "mapScope", "Lxe/M;", "Lkotlin/Function0;", "onSizeChanged", "Lkotlin/jvm/functions/Function0;", "getOnSizeChanged", "()Lkotlin/jvm/functions/Function0;", "setOnSizeChanged", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function3;", "Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;", "onCameraChanged", "Lfd/n;", "getOnCameraChanged", "()Lfd/n;", "setOnCameraChanged", "(Lfd/n;)V", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "onMapClickListener", "Lkotlin/jvm/functions/Function1;", "getOnMapClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnMapClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onMapLongClickListener", "getOnMapLongClickListener", "setOnMapLongClickListener", "isPinAnimationEnabled", "Z", "()Z", "setPinAnimationEnabled", "LAe/h;", "getTilesLoadingFlow", "()LAe/h;", "tilesLoadingFlow", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isRotateGesturesEnabled", "setRotateGesturesEnabled", "isScrollGesturesEnabled", "setScrollGesturesEnabled", "isZoomGesturesEnabled", "setZoomGesturesEnabled", "isTiltGesturesEnabled", "setTiltGesturesEnabled", "isDarkThemeEnabled", "setDarkThemeEnabled", "Landroid/graphics/Point;", "getZoomFocusPoint", "()Landroid/graphics/Point;", "setZoomFocusPoint", "(Landroid/graphics/Point;)V", "zoomFocusPoint", "Lve0/b;", "getController", "()Lve0/b;", "controller", "Companion", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SdkMapController implements OzonMapController {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final j EMPTY_AREA_PADDING = new j(0, 0, 0, 0);

    @NotNull
    private final OzonMapView contentView;
    private boolean isPinAnimationEnabled;

    @NotNull
    private final ViewGroup mapContainer;

    @NotNull
    private final M mapScope;
    private InterfaceC6511n<? super CameraPositionModel, ? super CameraUpdateReasonModel, ? super Boolean, Unit> onCameraChanged;
    private Function1<? super CoordinateModel, Unit> onMapClickListener;
    private Function1<? super CoordinateModel, Unit> onMapLongClickListener;
    private Function0<Unit> onSizeChanged;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mapcommon/map/sdk/SdkMapController$Companion;", "", "<init>", "()V", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SdkMapController(@NotNull ViewGroup mapContainer) {
        Intrinsics.checkNotNullParameter(mapContainer, "mapContainer");
        this.mapContainer = mapContainer;
        Context context = mapContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.contentView = new OzonMapView(context, null, 6);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.mapScope = N.a(CoroutineContext.Element.a.d(s.f6650a, (H0) b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addContentViewToContainer() {
        OzonMapView contentView = getContentView();
        this.mapContainer.removeAllViews();
        this.mapContainer.addView(contentView);
        contentView.p(new SdkMapController$addContentViewToContainer$1$1(this));
    }

    private final AbstractC7094b doAfterMapInit(AbstractC7094b abstractC7094b, final Function1<? super Boolean, Unit> function1) {
        C10299d c10299d = new C10299d(abstractC7094b.c(new C10302g(new InterfaceC9019a() { // from class: Zy.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                SdkMapController.doAfterMapInit$lambda$2(SdkMapController.this);
            }
        })), new InterfaceC9019a() { // from class: Zy.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                SdkMapController.doAfterMapInit$lambda$3(Function1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(c10299d, "doFinally(...)");
        return c10299d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doAfterMapInit$lambda$2(SdkMapController sdkMapController) {
        InterfaceC8137a d11;
        InterfaceC8137a d12;
        InterfaceC5817a g10;
        C0 e11;
        E0.d(sdkMapController.mapScope.getCoroutineContext());
        b controller = sdkMapController.getController();
        if (controller != null && (g10 = controller.g()) != null && (e11 = g10.e()) != null) {
            C2399j.C(new C2408n0(e11, new SdkMapController$doAfterMapInit$1$1(sdkMapController, null)), sdkMapController.mapScope);
        }
        b controller2 = sdkMapController.getController();
        if (controller2 != null && (d12 = controller2.d()) != null) {
            C2399j.C(new C2408n0(d12.e(), new SdkMapController$doAfterMapInit$1$2(sdkMapController, null)), sdkMapController.mapScope);
        }
        b controller3 = sdkMapController.getController();
        if (controller3 == null || (d11 = controller3.d()) == null) {
            return;
        }
        C2399j.C(new C2408n0(d11.f(), new SdkMapController$doAfterMapInit$1$3(sdkMapController, null)), sdkMapController.mapScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doAfterMapInit$lambda$3(Function1 function1) {
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    private final j getCheckedCameraVisibleAreaPadding(j padding) {
        int measuredWidth = getContentView().getMeasuredWidth();
        int g10 = padding.g();
        if (g10 >= 0 && g10 <= measuredWidth) {
            int measuredHeight = getContentView().getMeasuredHeight();
            int e11 = padding.e();
            if (e11 >= 0 && e11 <= measuredHeight) {
                return padding;
            }
        }
        return EMPTY_AREA_PADDING;
    }

    private final b getController() {
        return getContentView().h().getValue();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void clear() {
        b controller = getController();
        if (controller != null) {
            controller.clear();
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void clearPlacemarkObjects() {
        InterfaceC10766e b11;
        b controller = getController();
        if (controller == null || (b11 = controller.b()) == null) {
            return;
        }
        b11.clear();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void dispose() {
        b controller = getController();
        if (controller != null) {
            controller.dispose();
        }
        N.c(this.mapScope, null);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public AnalyticModuleState getAnalyticsModuleState() {
        return getContentView().g().q();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public CameraPositionModel getCameraPosition(BoundingBoxModel boundingBox) {
        C10551g c11;
        b controller = getController();
        InterfaceC5817a g10 = controller != null ? controller.g() : null;
        if (boundingBox == null) {
            if (g10 != null) {
                c11 = g10.getCurrentPosition();
            }
            c11 = null;
        } else {
            if (g10 != null) {
                c11 = g10.c(BoundingBoxModelKt.toSdkBoundingBox(boundingBox));
            }
            c11 = null;
        }
        if (c11 != null) {
            return CameraPositionModelKt.toCameraPositionModel(c11);
        }
        return null;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public e getClusterController() {
        b controller = getController();
        if (controller != null) {
            return controller.f();
        }
        return null;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public ScreenRectModel getFocusRect() {
        InterfaceC5817a g10;
        b controller = getController();
        j padding = (controller == null || (g10 = controller.g()) == null) ? null : g10.d();
        if (padding == null || padding.i()) {
            return null;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        Intrinsics.checkNotNullParameter(padding, "padding");
        return ScreenRectModelKt.toScreenRectModel(new Rect(padding.f(), padding.h(), measuredWidth - padding.g(), measuredHeight - padding.e()));
    }

    public InterfaceC6511n<CameraPositionModel, CameraUpdateReasonModel, Boolean, Unit> getOnCameraChanged() {
        return this.onCameraChanged;
    }

    public Function1<CoordinateModel, Unit> getOnMapClickListener() {
        return this.onMapClickListener;
    }

    public Function1<CoordinateModel, Unit> getOnMapLongClickListener() {
        return this.onMapLongClickListener;
    }

    public Function0<Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public u getPlacemarkById(@NotNull String id2) {
        InterfaceC10766e b11;
        Intrinsics.checkNotNullParameter(id2, "id");
        b controller = getController();
        if (controller == null || (b11 = controller.b()) == null) {
            return null;
        }
        return b11.getPlacemarkById(id2);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public List<u> getPlacemarkObjects() {
        InterfaceC10766e b11;
        b controller = getController();
        List<u> a11 = (controller == null || (b11 = controller.b()) == null) ? null : b11.a();
        return a11 == null ? K.f71697a : a11;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public List<String> getPreferredProvider(@NotNull PreferredProvider.Type providerType) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        try {
            return getContentView().g().d(providerType);
        } catch (ae0.j unused) {
            return null;
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public InterfaceC2395h<Boolean> getTilesLoadingFlow() {
        c h11;
        b controller = getController();
        if (controller == null || (h11 = controller.h()) == null) {
            return null;
        }
        return h11.getTilesLoadingFlow();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public i getVisibleArea() {
        InterfaceC5817a g10;
        b controller = getController();
        if (controller == null || (g10 = controller.g()) == null) {
            return null;
        }
        return g10.getVisibleArea();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public int height() {
        return getContentView().getHeight();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public AbstractC7094b initMap(String locationUid, boolean isUseViewPlacemarkController, Function1<? super Boolean, Unit> loading) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return doAfterMapInit(k.a(s.f6650a, new SdkMapController$initMap$1(loading, this, locationUid, isUseViewPlacemarkController, null)), loading);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void insertPlacemark(@NotNull u placemark) {
        InterfaceC10766e b11;
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        b controller = getController();
        if (controller == null || (b11 = controller.b()) == null) {
            return;
        }
        b11.insertPlacemark(placemark);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void moveToAnimated(@NotNull CameraPositionModel position, Float duration, Function1<? super Boolean, Unit> endAction) {
        InterfaceC5817a g10;
        InterfaceC5817a g11;
        Intrinsics.checkNotNullParameter(position, "position");
        if (duration != null) {
            b controller = getController();
            if (controller == null || (g11 = controller.g()) == null) {
                return;
            }
            g11.b(CameraPositionModelKt.toMapSdkCameraPosition(position), duration.floatValue(), endAction);
            return;
        }
        b controller2 = getController();
        if (controller2 == null || (g10 = controller2.g()) == null) {
            return;
        }
        InterfaceC5817a.C0864a.a(g10, CameraPositionModelKt.toMapSdkCameraPosition(position), endAction, 2);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void onDestroy() {
        b controller = getController();
        if (controller != null) {
            controller.onDestroy();
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void onStart() {
        b controller = getController();
        if (controller != null) {
            controller.onStart();
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void onStop() {
        b controller = getController();
        if (controller != null) {
            controller.onStop();
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void removePlacemark(@NotNull String id2) {
        InterfaceC10766e b11;
        Intrinsics.checkNotNullParameter(id2, "id");
        b controller = getController();
        if (controller == null || (b11 = controller.b()) == null) {
            return;
        }
        b11.e(id2);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setDarkThemeEnabled(boolean z11) {
        c h11;
        b controller = getController();
        if (controller == null || (h11 = controller.h()) == null) {
            return;
        }
        h11.b(z11 ? y.DARK : y.LIGHT);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setFocusRect(ScreenRectModel rect) {
        InterfaceC5817a g10;
        j jVar;
        b controller = getController();
        if (controller == null || (g10 = controller.g()) == null) {
            return;
        }
        if (rect != null) {
            int measuredWidth = getContentView().getMeasuredWidth();
            int measuredHeight = getContentView().getMeasuredHeight();
            Rect focusRect = ScreenRectModelKt.toRect(rect);
            Intrinsics.checkNotNullParameter(focusRect, "focusRect");
            jVar = getCheckedCameraVisibleAreaPadding(new j(focusRect.left, focusRect.top, measuredWidth - focusRect.right, measuredHeight - focusRect.bottom));
        } else {
            jVar = EMPTY_AREA_PADDING;
        }
        g10.a(jVar);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setLogoAlignment(@NotNull LogoPosition position, int horizontalPadding, int verticalPadding) {
        Intrinsics.checkNotNullParameter(position, "position");
        b controller = getController();
        if (controller != null) {
            controller.setLogoConfig(new q(LogoPositionKt.toMapSdkLogoPosition(position), (Pair<Integer, Integer>) new Pair(Integer.valueOf(horizontalPadding), Integer.valueOf(verticalPadding))));
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setLogoConfig(@NotNull q logoConfig) {
        Intrinsics.checkNotNullParameter(logoConfig, "logoConfig");
        b controller = getController();
        if (controller != null) {
            controller.setLogoConfig(logoConfig);
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setOnCameraChanged(InterfaceC6511n<? super CameraPositionModel, ? super CameraUpdateReasonModel, ? super Boolean, Unit> interfaceC6511n) {
        this.onCameraChanged = interfaceC6511n;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setOnSizeChanged(Function0<Unit> function0) {
        this.onSizeChanged = function0;
    }

    public void setPinAnimationEnabled(boolean z11) {
        this.isPinAnimationEnabled = z11;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setPinAnimationEnabledState(boolean isEnabled) {
        b controller = getController();
        InterfaceC10766e b11 = controller != null ? controller.b() : null;
        if (isEnabled) {
            setPinAnimationEnabled(true);
            if (b11 != null) {
                b11.n();
                return;
            }
            return;
        }
        setPinAnimationEnabled(false);
        if (b11 != null) {
            b11.f();
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setRotateGesturesEnabled(boolean z11) {
        InterfaceC8137a d11;
        b controller = getController();
        if (controller == null || (d11 = controller.d()) == null) {
            return;
        }
        d11.a(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setScrollGesturesEnabled(boolean z11) {
        InterfaceC8137a d11;
        b controller = getController();
        if (controller == null || (d11 = controller.d()) == null) {
            return;
        }
        d11.c(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setTiltGesturesEnabled(boolean z11) {
        InterfaceC8137a d11;
        b controller = getController();
        if (controller == null || (d11 = controller.d()) == null) {
            return;
        }
        d11.b(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setZoomFocusPoint(Point point) {
        InterfaceC8137a d11;
        b controller = getController();
        if (controller == null || (d11 = controller.d()) == null) {
            return;
        }
        d11.setZoomFocusPoint(point);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void setZoomGesturesEnabled(boolean z11) {
        InterfaceC8137a d11;
        b controller = getController();
        if (controller == null || (d11 = controller.d()) == null) {
            return;
        }
        d11.d(z11);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @SuppressLint({"MissingPermission"})
    public void showUserPlaceMark(u placemark) {
        InterfaceC8585d c11;
        InterfaceC8587f a11;
        b controller = getController();
        if (controller == null || (c11 = controller.c()) == null || (a11 = c11.a()) == null) {
            return;
        }
        AbstractC8905a abstractC8905a = (AbstractC8905a) a11;
        abstractC8905a.h();
        if (placemark != null) {
            abstractC8905a.i(new C8583b(placemark));
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public void updateMarker(@NotNull u placemark) {
        InterfaceC10766e b11;
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        b controller = getController();
        if (controller == null || (b11 = controller.b()) == null) {
            return;
        }
        b11.insertPlacemark(placemark);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    public int width() {
        return getContentView().getWidth();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public OzonMapView getContentView() {
        return this.contentView;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonMapController
    @NotNull
    public AbstractC7094b initMap(Function1<? super Boolean, Unit> loading, @NotNull GeoProviderConfig geoProviderConfig, String sessionId, boolean isReinitialization, boolean isUseViewPlacemarkController) {
        Intrinsics.checkNotNullParameter(geoProviderConfig, "geoProviderConfig");
        C10720e0 c10720e0 = C10720e0.f105451a;
        return doAfterMapInit(k.a(s.f6650a, new SdkMapController$initMap$2(loading, isReinitialization, this, geoProviderConfig, sessionId, isUseViewPlacemarkController, null)), loading);
    }
}
