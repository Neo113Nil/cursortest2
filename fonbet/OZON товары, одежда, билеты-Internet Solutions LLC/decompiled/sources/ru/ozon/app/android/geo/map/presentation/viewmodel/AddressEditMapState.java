package ru.ozon.app.android.geo.map.presentation.viewmodel;

import H3.c;
import I0.C3173b;
import Kk.C3532b;
import Pk0.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "", "<init>", "()V", "NavBarState", "CameraState", "PageIconsState", "BannerState", "BottomSheetState", "AddressEditMapFlagsState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$AddressEditMapFlagsState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BannerState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BottomSheetState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$CameraState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$NavBarState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$PageIconsState;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressEditMapState {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$AddressEditMapFlagsState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "", "showCenterPin", "processApplicationMove", "processInitializeMap", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowCenterPin", "()Z", "getProcessApplicationMove", "getProcessInitializeMap", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressEditMapFlagsState extends AddressEditMapState {
        private final boolean processApplicationMove;
        private final boolean processInitializeMap;
        private final boolean showCenterPin;

        public AddressEditMapFlagsState(boolean z11, boolean z12, boolean z13) {
            super(null);
            this.showCenterPin = z11;
            this.processApplicationMove = z12;
            this.processInitializeMap = z13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressEditMapFlagsState)) {
                return false;
            }
            AddressEditMapFlagsState addressEditMapFlagsState = (AddressEditMapFlagsState) other;
            return this.showCenterPin == addressEditMapFlagsState.showCenterPin && this.processApplicationMove == addressEditMapFlagsState.processApplicationMove && this.processInitializeMap == addressEditMapFlagsState.processInitializeMap;
        }

        public final boolean getProcessApplicationMove() {
            return this.processApplicationMove;
        }

        public final boolean getProcessInitializeMap() {
            return this.processInitializeMap;
        }

        public final boolean getShowCenterPin() {
            return this.showCenterPin;
        }

        public int hashCode() {
            return Boolean.hashCode(this.processInitializeMap) + C3532b.a(Boolean.hashCode(this.showCenterPin) * 31, 31, this.processApplicationMove);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.showCenterPin;
            boolean z12 = this.processApplicationMove;
            return a.a(")", Lh.a.d("AddressEditMapFlagsState(showCenterPin=", ", processApplicationMove=", ", processInitializeMap=", z11, z12), this.processInitializeMap);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BannerState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "bannerIcon", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "getBannerIcon", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerState extends AddressEditMapState {
        private final AddressEditMapVO.MapIcon.BannerIcon bannerIcon;

        public BannerState(AddressEditMapVO.MapIcon.BannerIcon bannerIcon) {
            super(null);
            this.bannerIcon = bannerIcon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BannerState) && Intrinsics.d(this.bannerIcon, ((BannerState) other).bannerIcon);
        }

        public final AddressEditMapVO.MapIcon.BannerIcon getBannerIcon() {
            return this.bannerIcon;
        }

        public int hashCode() {
            AddressEditMapVO.MapIcon.BannerIcon bannerIcon = this.bannerIcon;
            if (bannerIcon == null) {
                return 0;
            }
            return bannerIcon.hashCode();
        }

        @NotNull
        public String toString() {
            return "BannerState(bannerIcon=" + this.bannerIcon + ")";
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BottomSheetState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "bottomSheetAction", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bottomSheetBadges", "LWZ/t;", "bottomSheetTokenizedEvent", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "numberPVZ", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;LWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBottomSheetAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/List;", "getBottomSheetBadges", "()Ljava/util/List;", "LWZ/t;", "getBottomSheetTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "getNumberPVZ", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetState extends AddressEditMapState {
        private final AtomActionDTO bottomSheetAction;
        private final List<BadgeDTO> bottomSheetBadges;
        private final t bottomSheetTokenizedEvent;
        private final AddressEditMapVO.NumberPVZ numberPVZ;

        public BottomSheetState(AtomActionDTO atomActionDTO, List<BadgeDTO> list, t tVar, AddressEditMapVO.NumberPVZ numberPVZ) {
            super(null);
            this.bottomSheetAction = atomActionDTO;
            this.bottomSheetBadges = list;
            this.bottomSheetTokenizedEvent = tVar;
            this.numberPVZ = numberPVZ;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheetState)) {
                return false;
            }
            BottomSheetState bottomSheetState = (BottomSheetState) other;
            return Intrinsics.d(this.bottomSheetAction, bottomSheetState.bottomSheetAction) && Intrinsics.d(this.bottomSheetBadges, bottomSheetState.bottomSheetBadges) && Intrinsics.d(this.bottomSheetTokenizedEvent, bottomSheetState.bottomSheetTokenizedEvent) && Intrinsics.d(this.numberPVZ, bottomSheetState.numberPVZ);
        }

        public final AtomActionDTO getBottomSheetAction() {
            return this.bottomSheetAction;
        }

        public final List<BadgeDTO> getBottomSheetBadges() {
            return this.bottomSheetBadges;
        }

        public final t getBottomSheetTokenizedEvent() {
            return this.bottomSheetTokenizedEvent;
        }

        public final AddressEditMapVO.NumberPVZ getNumberPVZ() {
            return this.numberPVZ;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.bottomSheetAction;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            List<BadgeDTO> list = this.bottomSheetBadges;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            t tVar = this.bottomSheetTokenizedEvent;
            int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            AddressEditMapVO.NumberPVZ numberPVZ = this.numberPVZ;
            return hashCode3 + (numberPVZ != null ? numberPVZ.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BottomSheetState(bottomSheetAction=" + this.bottomSheetAction + ", bottomSheetBadges=" + this.bottomSheetBadges + ", bottomSheetTokenizedEvent=" + this.bottomSheetTokenizedEvent + ", numberPVZ=" + this.numberPVZ + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$CameraState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "centerPin", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewPort", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "mapObjects", "", "isCentralPinShowing", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "getCenterPin", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "getViewPort", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "Ljava/util/List;", "getMapObjects", "()Ljava/util/List;", "Z", "()Z", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CameraState extends AddressEditMapState {

        @NotNull
        private final AddressEditMapVO.Pin centerPin;
        private final boolean isCentralPinShowing;
        private final List<AddressEditMapVO.MapObject> mapObjects;
        private final AddressEditMapVO.ViewPort viewPort;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraState(@NotNull AddressEditMapVO.Pin centerPin, AddressEditMapVO.ViewPort viewPort, List<AddressEditMapVO.MapObject> list, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(centerPin, "centerPin");
            this.centerPin = centerPin;
            this.viewPort = viewPort;
            this.mapObjects = list;
            this.isCentralPinShowing = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraState)) {
                return false;
            }
            CameraState cameraState = (CameraState) other;
            return Intrinsics.d(this.centerPin, cameraState.centerPin) && Intrinsics.d(this.viewPort, cameraState.viewPort) && Intrinsics.d(this.mapObjects, cameraState.mapObjects) && this.isCentralPinShowing == cameraState.isCentralPinShowing;
        }

        @NotNull
        public final AddressEditMapVO.Pin getCenterPin() {
            return this.centerPin;
        }

        public final List<AddressEditMapVO.MapObject> getMapObjects() {
            return this.mapObjects;
        }

        public final AddressEditMapVO.ViewPort getViewPort() {
            return this.viewPort;
        }

        public int hashCode() {
            int hashCode = this.centerPin.hashCode() * 31;
            AddressEditMapVO.ViewPort viewPort = this.viewPort;
            int hashCode2 = (hashCode + (viewPort == null ? 0 : viewPort.hashCode())) * 31;
            List<AddressEditMapVO.MapObject> list = this.mapObjects;
            return Boolean.hashCode(this.isCentralPinShowing) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "CameraState(centerPin=" + this.centerPin + ", viewPort=" + this.viewPort + ", mapObjects=" + this.mapObjects + ", isCentralPinShowing=" + this.isCentralPinShowing + ")";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$NavBarState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Selector;", "selector", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "dsTabs", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "miniAppHeader", "", "isShowNavbarBackground", "", "navbarTitle", "navbarSubtitle", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSelector", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getDsTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "getMiniAppHeader", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "Z", "()Z", "Ljava/lang/String;", "getNavbarTitle", "getNavbarSubtitle", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBarState extends AddressEditMapState {
        private final TabsDTO dsTabs;
        private final boolean isShowNavbarBackground;
        private final AddressEditMapVO.MiniAppHeader miniAppHeader;
        private final String navbarSubtitle;
        private final String navbarTitle;
        private final List<AddressEditMapVO.Selector> selector;

        public NavBarState(List<AddressEditMapVO.Selector> list, TabsDTO tabsDTO, AddressEditMapVO.MiniAppHeader miniAppHeader, boolean z11, String str, String str2) {
            super(null);
            this.selector = list;
            this.dsTabs = tabsDTO;
            this.miniAppHeader = miniAppHeader;
            this.isShowNavbarBackground = z11;
            this.navbarTitle = str;
            this.navbarSubtitle = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBarState)) {
                return false;
            }
            NavBarState navBarState = (NavBarState) other;
            return Intrinsics.d(this.selector, navBarState.selector) && Intrinsics.d(this.dsTabs, navBarState.dsTabs) && Intrinsics.d(this.miniAppHeader, navBarState.miniAppHeader) && this.isShowNavbarBackground == navBarState.isShowNavbarBackground && Intrinsics.d(this.navbarTitle, navBarState.navbarTitle) && Intrinsics.d(this.navbarSubtitle, navBarState.navbarSubtitle);
        }

        public final TabsDTO getDsTabs() {
            return this.dsTabs;
        }

        public final AddressEditMapVO.MiniAppHeader getMiniAppHeader() {
            return this.miniAppHeader;
        }

        public final String getNavbarSubtitle() {
            return this.navbarSubtitle;
        }

        public final String getNavbarTitle() {
            return this.navbarTitle;
        }

        public final List<AddressEditMapVO.Selector> getSelector() {
            return this.selector;
        }

        public int hashCode() {
            List<AddressEditMapVO.Selector> list = this.selector;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            TabsDTO tabsDTO = this.dsTabs;
            int hashCode2 = (hashCode + (tabsDTO == null ? 0 : tabsDTO.hashCode())) * 31;
            AddressEditMapVO.MiniAppHeader miniAppHeader = this.miniAppHeader;
            int a11 = C3532b.a((hashCode2 + (miniAppHeader == null ? 0 : miniAppHeader.hashCode())) * 31, 31, this.isShowNavbarBackground);
            String str = this.navbarTitle;
            int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.navbarSubtitle;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: isShowNavbarBackground, reason: from getter */
        public final boolean getIsShowNavbarBackground() {
            return this.isShowNavbarBackground;
        }

        @NotNull
        public String toString() {
            List<AddressEditMapVO.Selector> list = this.selector;
            TabsDTO tabsDTO = this.dsTabs;
            AddressEditMapVO.MiniAppHeader miniAppHeader = this.miniAppHeader;
            boolean z11 = this.isShowNavbarBackground;
            String str = this.navbarTitle;
            String str2 = this.navbarSubtitle;
            StringBuilder sb2 = new StringBuilder("NavBarState(selector=");
            sb2.append(list);
            sb2.append(", dsTabs=");
            sb2.append(tabsDTO);
            sb2.append(", miniAppHeader=");
            sb2.append(miniAppHeader);
            sb2.append(", isShowNavbarBackground=");
            sb2.append(z11);
            sb2.append(", navbarTitle=");
            return C3173b.c(sb2, str, ", navbarSubtitle=", str2, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$PageIconsState;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "icons", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PageIconsState extends AddressEditMapState {

        @NotNull
        private final List<AddressEditMapVO.MapIcon> icons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PageIconsState(@NotNull List<? extends AddressEditMapVO.MapIcon> icons) {
            super(null);
            Intrinsics.checkNotNullParameter(icons, "icons");
            this.icons = icons;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PageIconsState) && Intrinsics.d(this.icons, ((PageIconsState) other).icons);
        }

        @NotNull
        public final List<AddressEditMapVO.MapIcon> getIcons() {
            return this.icons;
        }

        public int hashCode() {
            return this.icons.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("PageIconsState(icons=", ")", this.icons);
        }
    }

    public /* synthetic */ AddressEditMapState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressEditMapState() {
    }
}
