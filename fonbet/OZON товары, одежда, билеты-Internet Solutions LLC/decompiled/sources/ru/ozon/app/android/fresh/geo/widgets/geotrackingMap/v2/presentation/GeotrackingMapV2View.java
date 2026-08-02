package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import E.RunnableC2901q;
import FG.a;
import Tc.b;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.geo.databinding.WidgetGeotrackingMapV2Binding;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.LogoPosition;
import ru.ozon.app.android.mapcommon.map.model.PointModel;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModel;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u001e*\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\"*\u00020\f2\u0006\u0010(\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\"¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0016\u00109\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2View;", "", "Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;", "binding", "Ll10/i;", "container", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapIconProviderV2;", "iconProvider", "<init>", "(Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;Ll10/i;Lru/ozon/app/android/mapcommon/map/OzonMapController;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapIconProviderV2;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "page", "", "duration", "", "focusMapOnPins", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;F)V", "", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "getCoordinatesForFocusing", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)Ljava/util/List;", "", "updateActiveZone", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)Z", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "box", "buildBoundsWithScreenPadding", "(Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "", "toNonZeroSpan", "(D)D", "half", "", "calculateTopOverlayPx", "()I", "coordinates", "buildBoundingBox", "(Ljava/util/List;)Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "screenHeightPx", "calculateSheetHeight", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;I)I", "onStart", "()V", "onStop", "bindGeotrackingMapV2VO", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)V", "state", "trackBottomSheetState", "(I)V", "Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;", "getBinding", "()Lru/ozon/app/android/fresh/geo/databinding/WidgetGeotrackingMapV2Binding;", "Ll10/i;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapIconProviderV2;", "isInitialized", "Z", "previousSheetRatio", "D", "pageVO", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "Lkotlin/Function0;", "onBackPressed", "Lkotlin/jvm/functions/Function0;", "getOnBackPressed", "()Lkotlin/jvm/functions/Function0;", "setOnBackPressed", "(Lkotlin/jvm/functions/Function0;)V", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapV2View {

    @NotNull
    private final WidgetGeotrackingMapV2Binding binding;

    @NotNull
    private final i container;

    @NotNull
    private final GeotrackingMapIconProviderV2 iconProvider;
    private boolean isInitialized;

    @NotNull
    private final OzonMapController mapController;
    private Function0<Unit> onBackPressed;
    private GeotrackingMapV2VO pageVO;
    private double previousSheetRatio;

    public GeotrackingMapV2View(@NotNull WidgetGeotrackingMapV2Binding binding, @NotNull i container, @NotNull OzonMapController mapController, @NotNull GeotrackingMapIconProviderV2 iconProvider) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(iconProvider, "iconProvider");
        this.binding = binding;
        this.container = container;
        this.mapController = mapController;
        this.iconProvider = iconProvider;
        this.previousSheetRatio = Double.NaN;
        GeotrackingMapV2VO geotrackingMapV2VO = this.pageVO;
        if (geotrackingMapV2VO != null) {
            focusMapOnPins$default(this, geotrackingMapV2VO, 0.0f, 2, null);
        }
        IconButtonView iconButtonView = binding.backBtn;
        iconButtonView.setBackgroundResource(R$color.transparent);
        iconButtonView.setOnClickListener(new a(this, 1));
        IconButtonView iconButtonView2 = binding.locationBtn;
        iconButtonView2.setBackgroundResource(R$color.transparent);
        iconButtonView2.setOnClickListener(new BC.a(this, 1));
    }

    private final BoundingBoxModel buildBoundingBox(List<GeotrackingMapV2VO.Pin.Coordinates> coordinates) {
        List<GeotrackingMapV2VO.Pin.Coordinates> list = coordinates;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double latitude = ((GeotrackingMapV2VO.Pin.Coordinates) it.next()).getLatitude();
        while (it.hasNext()) {
            latitude = Math.min(latitude, ((GeotrackingMapV2VO.Pin.Coordinates) it.next()).getLatitude());
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double latitude2 = ((GeotrackingMapV2VO.Pin.Coordinates) it2.next()).getLatitude();
        while (it2.hasNext()) {
            latitude2 = Math.max(latitude2, ((GeotrackingMapV2VO.Pin.Coordinates) it2.next()).getLatitude());
        }
        Iterator<T> it3 = list.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        double longitude = ((GeotrackingMapV2VO.Pin.Coordinates) it3.next()).getLongitude();
        while (it3.hasNext()) {
            longitude = Math.min(longitude, ((GeotrackingMapV2VO.Pin.Coordinates) it3.next()).getLongitude());
        }
        Iterator<T> it4 = list.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        double longitude2 = ((GeotrackingMapV2VO.Pin.Coordinates) it4.next()).getLongitude();
        while (it4.hasNext()) {
            longitude2 = Math.max(longitude2, ((GeotrackingMapV2VO.Pin.Coordinates) it4.next()).getLongitude());
        }
        return new BoundingBoxModel(new PointModel(latitude, longitude), new PointModel(latitude2, longitude2));
    }

    private final BoundingBoxModel buildBoundsWithScreenPadding(BoundingBoxModel box, GeotrackingMapV2VO page) {
        int height = this.mapController.height();
        if (height < 1) {
            height = 1;
        }
        int width = this.mapController.width();
        if (width < 1) {
            width = 1;
        }
        Integer valueOf = Integer.valueOf(this.binding.getConstraintLayout().getHeight());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int calculateSheetHeight = calculateSheetHeight(page, valueOf != null ? valueOf.intValue() : height);
        int calculateTopOverlayPx = calculateTopOverlayPx();
        double d11 = width;
        int i11 = (int) (d11 * 0.15d);
        int i12 = (height - calculateSheetHeight) - calculateTopOverlayPx;
        if (i12 < 1) {
            i12 = 1;
        }
        int i13 = (int) (i12 * 0.15d);
        double latitude = box.getSouthWest().getLatitude();
        double latitude2 = box.getNorthEast().getLatitude();
        double longitude = box.getSouthWest().getLongitude();
        double longitude2 = box.getNorthEast().getLongitude();
        double half = half(latitude + latitude2);
        double half2 = half(longitude + longitude2);
        double nonZeroSpan = toNonZeroSpan(longitude2 - longitude);
        double nonZeroSpan2 = toNonZeroSpan(latitude2 - latitude);
        int i14 = calculateTopOverlayPx + i13;
        int i15 = calculateSheetHeight + i13;
        int i16 = (width - i11) - i11;
        if (i16 < 1) {
            i16 = 1;
        }
        double d12 = height / ((height - i14) - i15 >= 1 ? r5 : 1);
        double half3 = half(nonZeroSpan * (d11 / i16));
        double half4 = half(nonZeroSpan2 * d12);
        return new BoundingBoxModel(new PointModel(half - half4, half2 - half3), new PointModel(half + half4, half2 + half3));
    }

    private final int calculateSheetHeight(GeotrackingMapV2VO geotrackingMapV2VO, int i11) {
        return (int) (geotrackingMapV2VO.getCurrentSheetRatio() * i11);
    }

    private final int calculateTopOverlayPx() {
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Math.max(this.binding.backBtn.getBottom(), this.binding.locationBtn.getBottom()) + ResourceExtKt.getStatusBarHeight(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusMapOnPins(GeotrackingMapV2VO page, float duration) {
        if (page.getCurrentSheetRatio() >= 0.8d) {
            return;
        }
        List<GeotrackingMapV2VO.Pin.Coordinates> coordinatesForFocusing = getCoordinatesForFocusing(page);
        if (coordinatesForFocusing.isEmpty()) {
            return;
        }
        if (!updateActiveZone(page)) {
            this.binding.mapContainer.post(new RunnableC2901q(this, 1));
            return;
        }
        CameraPositionModel cameraPosition = this.mapController.getCameraPosition(buildBoundsWithScreenPadding(buildBoundingBox(coordinatesForFocusing), page));
        if (cameraPosition == null) {
            return;
        }
        OzonMapController.DefaultImpls.moveToAnimated$default(this.mapController, cameraPosition, duration == 0.0f ? null : Float.valueOf(duration), null, 4, null);
    }

    static /* synthetic */ void focusMapOnPins$default(GeotrackingMapV2View geotrackingMapV2View, GeotrackingMapV2VO geotrackingMapV2VO, float f7, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f7 = 0.0f;
        }
        geotrackingMapV2View.focusMapOnPins(geotrackingMapV2VO, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusMapOnPins$lambda$8(GeotrackingMapV2View geotrackingMapV2View) {
        GeotrackingMapV2VO geotrackingMapV2VO = geotrackingMapV2View.pageVO;
        if (geotrackingMapV2VO != null) {
            focusMapOnPins$default(geotrackingMapV2View, geotrackingMapV2VO, 0.0f, 2, null);
        }
    }

    private final List<GeotrackingMapV2VO.Pin.Coordinates> getCoordinatesForFocusing(GeotrackingMapV2VO page) {
        b builder = C7714v.B();
        builder.add(page.getCourierPin().getCoordinates());
        builder.add(page.getDestinationPin().getCoordinates());
        if (page.getCourierPin().getCoordinates() == null) {
            builder.add(page.getDarkStorePin().getCoordinates());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return C7714v.I(builder.B());
    }

    private final l getTokenizedAnalytics() {
        return this.container.X();
    }

    private final double half(double d11) {
        return d11 / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(GeotrackingMapV2View geotrackingMapV2View, View view) {
        Function0<Unit> function0 = geotrackingMapV2View.onBackPressed;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3(GeotrackingMapV2View geotrackingMapV2View, View view) {
        GeotrackingMapV2VO geotrackingMapV2VO = geotrackingMapV2View.pageVO;
        if (geotrackingMapV2VO != null) {
            focusMapOnPins$default(geotrackingMapV2View, geotrackingMapV2VO, 0.0f, 2, null);
            t locationTrackingInfo = geotrackingMapV2VO.getLocationTrackingInfo();
            if (locationTrackingInfo != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(geotrackingMapV2View.getTokenizedAnalytics(), locationTrackingInfo, null, 2, null);
            }
        }
    }

    private final double toNonZeroSpan(double d11) {
        if (d11 <= 0.0d) {
            return 0.001d;
        }
        return d11;
    }

    private final boolean updateActiveZone(GeotrackingMapV2VO page) {
        if (this.pageVO == null) {
            this.mapController.setFocusRect(null);
            return false;
        }
        int height = this.mapController.height();
        int width = this.mapController.width();
        if (width <= 0 || height <= 0) {
            return false;
        }
        Integer valueOf = Integer.valueOf(this.binding.getConstraintLayout().getHeight());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int calculateSheetHeight = height - calculateSheetHeight(page, valueOf != null ? valueOf.intValue() : height);
        if (calculateSheetHeight < 0) {
            calculateSheetHeight = 0;
        }
        int calculateTopOverlayPx = calculateTopOverlayPx();
        this.mapController.setFocusRect(calculateSheetHeight > calculateTopOverlayPx ? new ScreenRectModel(new Point(0, calculateTopOverlayPx), new Point(width, calculateSheetHeight)) : null);
        return true;
    }

    public final void bindGeotrackingMapV2VO(@NotNull GeotrackingMapV2VO page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.pageVO = page;
        ArrayList arrayList = this.isInitialized ? new ArrayList() : C7714v.m0(page.getDarkStorePin(), page.getDestinationPin());
        if (page.getCourierPin().getCoordinates() != null) {
            arrayList.add(page.getCourierPin());
        }
        this.iconProvider.drawPinsOnMapView(arrayList, new GeotrackingMapV2View$bindGeotrackingMapV2VO$1(this, page));
        if (this.isInitialized && this.previousSheetRatio == page.getCurrentSheetRatio()) {
            return;
        }
        this.isInitialized = true;
        this.previousSheetRatio = page.getCurrentSheetRatio();
        focusMapOnPins$default(this, page, 0.0f, 2, null);
    }

    @NotNull
    public final WidgetGeotrackingMapV2Binding getBinding() {
        return this.binding;
    }

    public final void onStart() {
        OzonMapController ozonMapController = this.mapController;
        OzonMapController.DefaultImpls.setLogoAlignment$default(ozonMapController, LogoPosition.LEFT_TOP, 0, 0, 6, null);
        ozonMapController.setRotateGesturesEnabled(false);
        ozonMapController.setTiltGesturesEnabled(false);
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ozonMapController.setDarkThemeEnabled(ThemeExtKt.isDarkThemeActive(context));
        ozonMapController.onStart();
    }

    public final void onStop() {
        this.mapController.onStop();
        this.iconProvider.onStop();
    }

    public final void setOnBackPressed(Function0<Unit> function0) {
        this.onBackPressed = function0;
    }

    public final void trackBottomSheetState(int state) {
        t expandedSheetTrackingInfo;
        GeotrackingMapV2VO geotrackingMapV2VO;
        t defaultSheetTrackingInfo;
        if (state != 3) {
            if (state != 4 || (geotrackingMapV2VO = this.pageVO) == null || (defaultSheetTrackingInfo = geotrackingMapV2VO.getDefaultSheetTrackingInfo()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(getTokenizedAnalytics(), defaultSheetTrackingInfo, null, 2, null);
            return;
        }
        GeotrackingMapV2VO geotrackingMapV2VO2 = this.pageVO;
        if (geotrackingMapV2VO2 == null || (expandedSheetTrackingInfo = geotrackingMapV2VO2.getExpandedSheetTrackingInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(getTokenizedAnalytics(), expandedSheetTrackingInfo, null, 2, null);
    }
}
