package ru.ozon.app.android.geo.map.presentation.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapState;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapStateReducer;", "", "<init>", "()V", "reduceToPayloads", "", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "oldPage", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "newPage", "isFirstInit", "", "reducePayloads", "reduceNavBarState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$NavBarState;", "reduceCameraState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$CameraState;", "reducePageIconsState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$PageIconsState;", "reduceBannerState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BannerState;", "reduceFlagsState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$AddressEditMapFlagsState;", "createNavBarPayload", "createCameraPayload", "createPageIconsPayload", "createBannerPayload", "createBottomSheetPayload", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BottomSheetState;", "createFlagsPayload", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapStateReducer {
    private final AddressEditMapState.BannerState createBannerPayload(AddressEditMapVO newPage) {
        return new AddressEditMapState.BannerState(newPage.getBannerIcon());
    }

    private final AddressEditMapState.BottomSheetState createBottomSheetPayload(AddressEditMapVO newPage) {
        return new AddressEditMapState.BottomSheetState(newPage.getBottomSheetAction(), newPage.getBottomSheetBadges(), newPage.getBottomSheetTokenizedEvent(), newPage.getNumberPVZ());
    }

    private final AddressEditMapState.CameraState createCameraPayload(AddressEditMapVO newPage) {
        return new AddressEditMapState.CameraState(newPage.getCenterPin(), newPage.getViewPort(), newPage.getMapObjects(), newPage.getShowCenterPin());
    }

    private final AddressEditMapState.AddressEditMapFlagsState createFlagsPayload(AddressEditMapVO newPage) {
        return new AddressEditMapState.AddressEditMapFlagsState(newPage.getShowCenterPin(), newPage.getProcessApplicationMove(), newPage.getProcessInitializeMap());
    }

    private final AddressEditMapState.NavBarState createNavBarPayload(AddressEditMapVO newPage) {
        return new AddressEditMapState.NavBarState(newPage.getSelector(), newPage.getDsTabs(), newPage.getMiniAppHeader(), newPage.getIsShowNavbarBackground(), newPage.getNavbarTitle(), newPage.getNavbarSubtitle());
    }

    private final AddressEditMapState.PageIconsState createPageIconsPayload(AddressEditMapVO newPage) {
        return new AddressEditMapState.PageIconsState(newPage.getIcons());
    }

    private final AddressEditMapState.BannerState reduceBannerState(AddressEditMapVO oldPage, AddressEditMapVO newPage) {
        if (Intrinsics.d(oldPage != null ? oldPage.getBannerIcon() : null, newPage.getBannerIcon())) {
            return null;
        }
        return createBannerPayload(newPage);
    }

    private final AddressEditMapState.CameraState reduceCameraState(AddressEditMapVO oldPage, AddressEditMapVO newPage) {
        if (Intrinsics.d(oldPage != null ? oldPage.getCenterPin() : null, newPage.getCenterPin()) && Intrinsics.d(oldPage.getViewPort(), newPage.getViewPort()) && Intrinsics.d(oldPage.getMapObjects(), newPage.getMapObjects())) {
            return null;
        }
        return createCameraPayload(newPage);
    }

    private final AddressEditMapState.AddressEditMapFlagsState reduceFlagsState(AddressEditMapVO oldPage, AddressEditMapVO newPage) {
        if (oldPage != null && oldPage.getShowCenterPin() == newPage.getShowCenterPin() && oldPage.getProcessInitializeMap() == newPage.getProcessInitializeMap() && oldPage.getProcessApplicationMove() == newPage.getProcessApplicationMove()) {
            return null;
        }
        return createFlagsPayload(newPage);
    }

    private final AddressEditMapState.NavBarState reduceNavBarState(AddressEditMapVO oldPage, AddressEditMapVO newPage) {
        if (Intrinsics.d(oldPage != null ? oldPage.getSelector() : null, newPage.getSelector())) {
            if (Intrinsics.d(oldPage != null ? oldPage.getMiniAppHeader() : null, newPage.getMiniAppHeader()) && oldPage != null && oldPage.getIsShowNavbarBackground() == newPage.getIsShowNavbarBackground() && Intrinsics.d(oldPage.getNavbarTitle(), newPage.getNavbarTitle()) && Intrinsics.d(oldPage.getNavbarSubtitle(), newPage.getNavbarSubtitle())) {
                return null;
            }
        }
        return createNavBarPayload(newPage);
    }

    private final AddressEditMapState.PageIconsState reducePageIconsState(AddressEditMapVO oldPage, AddressEditMapVO newPage) {
        if (Intrinsics.d(oldPage != null ? oldPage.getIcons() : null, newPage.getIcons())) {
            return null;
        }
        return createPageIconsPayload(newPage);
    }

    private final List<AddressEditMapState> reducePayloads(AddressEditMapVO oldPage, AddressEditMapVO newPage, boolean isFirstInit) {
        ArrayList arrayList = new ArrayList();
        if (isFirstInit) {
            arrayList.add(createNavBarPayload(newPage));
            arrayList.add(createCameraPayload(newPage));
            arrayList.add(createPageIconsPayload(newPage));
            arrayList.add(createBannerPayload(newPage));
            arrayList.add(createFlagsPayload(newPage));
        } else {
            AddressEditMapState.NavBarState reduceNavBarState = reduceNavBarState(oldPage, newPage);
            if (reduceNavBarState != null) {
                arrayList.add(reduceNavBarState);
            }
            AddressEditMapState.CameraState reduceCameraState = reduceCameraState(oldPage, newPage);
            if (reduceCameraState != null) {
                arrayList.add(reduceCameraState);
            }
            AddressEditMapState.PageIconsState reducePageIconsState = reducePageIconsState(oldPage, newPage);
            if (reducePageIconsState != null) {
                arrayList.add(reducePageIconsState);
            }
            AddressEditMapState.BannerState reduceBannerState = reduceBannerState(oldPage, newPage);
            if (reduceBannerState != null) {
                arrayList.add(reduceBannerState);
            }
            AddressEditMapState.AddressEditMapFlagsState reduceFlagsState = reduceFlagsState(oldPage, newPage);
            if (reduceFlagsState != null) {
                arrayList.add(reduceFlagsState);
            }
        }
        arrayList.add(createBottomSheetPayload(newPage));
        return arrayList;
    }

    @NotNull
    public final List<AddressEditMapState> reduceToPayloads(AddressEditMapVO oldPage, @NotNull AddressEditMapVO newPage, boolean isFirstInit) {
        Intrinsics.checkNotNullParameter(newPage, "newPage");
        return reducePayloads(oldPage, newPage, isFirstInit);
    }
}
