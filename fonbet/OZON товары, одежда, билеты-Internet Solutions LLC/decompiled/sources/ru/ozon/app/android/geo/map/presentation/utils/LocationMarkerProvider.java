package ru.ozon.app.android.geo.map.presentation.utils;

import Ey.RunnableC2974a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider;
import ru.ozon.app.android.geo.map.presentation.views.LocationMarkerView;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.pinlocator.PinLocator;
import we0.InterfaceC10542A;
import we0.m;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJI\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b'\u0010(R\u0018\u0010\u0006\u001a\u00060\u0004R\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/LocationMarkerProvider;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache;", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider;", "cache", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache;Lru/ozon/app/android/mapcommon/map/OzonMapController;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "locationMarker", "Lkotlin/Function0;", "", "onLocationMarkerTap", "Ljava/lang/Runnable;", "swapLocationMarkerRunnable", "Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView;", "locationMarkerView", "", "showTooltip", "", "zIndex", "addLocationMarker", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lkotlin/jvm/functions/Function0;Ljava/lang/Runnable;Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView;ZF)V", "swapLocationMarker", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView;Lkotlin/jvm/functions/Function0;FZ)V", "Lwe0/A;", "content", "Landroid/graphics/PointF;", "anchor", "onPinTap", "addPlacemark", "(Lwe0/A;Landroid/graphics/PointF;Lkotlin/jvm/functions/Function0;F)V", "userLocationMarker", "onUserLocationAction", "createUserLocationMarker", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lkotlin/jvm/functions/Function0;Ljava/lang/Boolean;)V", "cancelUserLocationSwapRunnable", "()Lkotlin/Unit;", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lwe0/m;", "defaultCoordinates$delegate", "LSc/j;", "getDefaultCoordinates", "()Lwe0/m;", "defaultCoordinates", "defaultAnchor$delegate", "getDefaultAnchor", "()Landroid/graphics/PointF;", "defaultAnchor", "Landroid/os/Handler;", "handler$delegate", "getHandler", "()Landroid/os/Handler;", "handler", "userLocationMarkerView$delegate", "getUserLocationMarkerView", "()Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView;", "userLocationMarkerView", "swapUserLocationMarkerRunnable", "Ljava/lang/Runnable;", "currentUserLocationMarker", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "Ljava/lang/Boolean;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationMarkerProvider {

    @NotNull
    private final MapIconProvider.DescriptorCache cache;
    private AddressEditMapVO.LocationMarker currentUserLocationMarker;

    /* renamed from: defaultAnchor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultAnchor;

    /* renamed from: defaultCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultCoordinates;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler;

    @NotNull
    private final OzonMapController mapController;
    private Boolean showTooltip;
    private Runnable swapUserLocationMarkerRunnable;

    /* renamed from: userLocationMarkerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userLocationMarkerView;

    public LocationMarkerProvider(@NotNull Context context, @NotNull MapIconProvider.DescriptorCache cache, @NotNull OzonMapController mapController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        this.cache = cache;
        this.mapController = mapController;
        this.defaultCoordinates = k.b(LocationMarkerProvider$defaultCoordinates$2.INSTANCE);
        this.defaultAnchor = k.b(LocationMarkerProvider$defaultAnchor$2.INSTANCE);
        this.handler = k.b(LocationMarkerProvider$handler$2.INSTANCE);
        this.userLocationMarkerView = k.b(new LocationMarkerProvider$userLocationMarkerView$2(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLocationMarker(AddressEditMapVO.LocationMarker locationMarker, Function0<Unit> onLocationMarkerTap, Runnable swapLocationMarkerRunnable, LocationMarkerView locationMarkerView, boolean showTooltip, float zIndex) {
        if (swapLocationMarkerRunnable != null) {
            getHandler().removeCallbacks(swapLocationMarkerRunnable);
        }
        swapLocationMarker(locationMarker, locationMarkerView, onLocationMarkerTap, zIndex, showTooltip);
        AddressEditMapVO.LocationTooltip tooltip = locationMarker.getTooltip();
        if (tooltip != null) {
            long timing = tooltip.getTiming();
            if (swapLocationMarkerRunnable != null) {
                getHandler().postDelayed(swapLocationMarkerRunnable, timing);
            }
        }
    }

    private final void addPlacemark(InterfaceC10542A content, PointF anchor, Function0<Unit> onPinTap, float zIndex) {
        m defaultCoordinates = getDefaultCoordinates();
        if (anchor == null) {
            anchor = getDefaultAnchor();
        }
        this.mapController.showUserPlaceMark(new u(defaultCoordinates, new z(content, anchor, false, false, 0.0f, zIndex, 0.0f, 220), PinLocator.User.INSTANCE, null, onPinTap, 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createUserLocationMarker$lambda$1(LocationMarkerProvider locationMarkerProvider, AddressEditMapVO.LocationMarker locationMarker, Function0 function0) {
        locationMarkerProvider.showTooltip = Boolean.FALSE;
        swapLocationMarker$default(locationMarkerProvider, locationMarker, locationMarkerProvider.getUserLocationMarkerView(), function0, locationMarker.getZPriority(), false, 16, null);
    }

    private final PointF getDefaultAnchor() {
        return (PointF) this.defaultAnchor.getValue();
    }

    private final m getDefaultCoordinates() {
        return (m) this.defaultCoordinates.getValue();
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationMarkerView getUserLocationMarkerView() {
        return (LocationMarkerView) this.userLocationMarkerView.getValue();
    }

    private final void swapLocationMarker(AddressEditMapVO.LocationMarker locationMarker, LocationMarkerView locationMarkerView, Function0<Unit> onLocationMarkerTap, float zIndex, boolean showTooltip) {
        Bitmap bitmap;
        AddressEditMapVO.PinCacheKey pinCacheKey = new AddressEditMapVO.PinCacheKey(locationMarker.getHashId(), Boolean.valueOf(showTooltip));
        if (locationMarkerView != null) {
            MapIconProvider.BitmapContainer bitmapContainer = this.cache.get(pinCacheKey);
            if (bitmapContainer == null || (bitmap = bitmapContainer.getBitmap()) == null) {
                bitmap = UtilsKt.getBitmap(locationMarkerView.getState(showTooltip));
            }
            Bitmap bitmap2 = bitmap;
            addPlacemark(new InterfaceC10542A.c(bitmap2, MapIconProvider.DescriptorCache.put$default(this.cache, bitmap2, pinCacheKey, null, 4, null)), locationMarkerView.getContentAnchor(showTooltip), onLocationMarkerTap, zIndex);
        }
    }

    static /* synthetic */ void swapLocationMarker$default(LocationMarkerProvider locationMarkerProvider, AddressEditMapVO.LocationMarker locationMarker, LocationMarkerView locationMarkerView, Function0 function0, float f7, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        locationMarkerProvider.swapLocationMarker(locationMarker, locationMarkerView, function0, f7, z11);
    }

    public final Unit cancelUserLocationSwapRunnable() {
        Runnable runnable = this.swapUserLocationMarkerRunnable;
        if (runnable == null) {
            return null;
        }
        getHandler().removeCallbacks(runnable);
        return Unit.f71690a;
    }

    public final void createUserLocationMarker(@NotNull AddressEditMapVO.LocationMarker userLocationMarker, @NotNull Function0<Unit> onUserLocationAction, Boolean showTooltip) {
        Intrinsics.checkNotNullParameter(userLocationMarker, "userLocationMarker");
        Intrinsics.checkNotNullParameter(onUserLocationAction, "onUserLocationAction");
        if (showTooltip != null) {
            this.showTooltip = showTooltip;
        }
        if (!Intrinsics.d(this.currentUserLocationMarker, userLocationMarker)) {
            this.swapUserLocationMarkerRunnable = new RunnableC2974a(this, userLocationMarker, onUserLocationAction, 0);
            this.currentUserLocationMarker = userLocationMarker;
        }
        getUserLocationMarkerView().bind(userLocationMarker, new LocationMarkerProvider$createUserLocationMarker$3(this, userLocationMarker, onUserLocationAction), true);
    }
}
