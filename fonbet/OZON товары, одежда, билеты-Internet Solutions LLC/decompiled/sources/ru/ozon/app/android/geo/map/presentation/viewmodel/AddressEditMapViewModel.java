package ru.ozon.app.android.geo.map.presentation.viewmodel;

import Kk.c;
import Tl.b;
import WZ.t;
import Xc.a;
import androidx.lifecycle.P;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.data.AddressEditMapRequest;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOWithPayloads;
import ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegate;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002ABJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\fJ;\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u001f\u0010 J5\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\"\u0010 J5\u0010#\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H&¢\u0006\u0004\b2\u0010\fJ\u000f\u00103\u001a\u00020\u0006H&¢\u0006\u0004\b3\u0010\fR\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000209048&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0004048&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u00107R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>048&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u00107¨\u0006C"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel;", "Lru/ozon/app/android/geo/map/presentation/utils/AddressEditMapGeoProviderDelegate;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "page", "", "isFirstInit", "", "bind", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;Z)V", "defineLocationIfNeeded", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;)V", "defineLocationIfPermissionChanged", "()V", "onBackPressed", "", ImagesContract.URL, "", "zoom", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewport", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "onSelectorButtonPressed", "(Ljava/lang/String;FLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "onCameraStartMoveAction", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", RichContentDTO.ALIGN_CENTER, "onCameraEndMoveAction", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;F)V", "onSelectPinFromBannerAction", "(Ljava/lang/String;FLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;)V", "link", "onPinClickedAction", "onClusterClickedAction", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;FLWZ/t;)V", "fromLocationButton", "onDefineCurrentLocationAction", "(Z)V", "", "resultCode", "onLocationEnabledResult", "(I)V", "checkUserLocationIncludedInViewport", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;)Z", "", "hintDelayMs", "startHintTimer", "(J)V", "startBannerTimer", "hideBanner", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;", "getMapState", "mapState", "getLoader", "loader", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "getBannerState", "bannerState", "Action", "BannerState", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddressEditMapViewModel extends AddressEditMapGeoProviderDelegate {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\r\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "", "force", "", "<init>", "(Z)V", "getForce", "()Z", "RequestLocationPermission", "StartCameraMoving", "Back", "HidePvzSheet", "PrepareToClusterization", "MapMove", "SelectorClicked", "PinClicked", "ClusterClicked", "MoveToLocation", "ShowUserCurrentLocationPin", "LocationException", "AtomAction", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$AtomAction;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$Back;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ClusterClicked;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$HidePvzSheet;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$LocationException;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MapMove;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$PinClicked;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$PrepareToClusterization;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$RequestLocationPermission;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$SelectorClicked;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ShowUserCurrentLocationPin;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$StartCameraMoving;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {
        private final boolean force;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$AtomAction;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AtomAction extends Action {

            @NotNull
            private final ru.ozon.uni.atoms.af.AtomAction action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AtomAction) && Intrinsics.d(this.action, ((AtomAction) other).action);
            }

            @NotNull
            public final ru.ozon.uni.atoms.af.AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("AtomAction(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$Back;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Back extends Action {

            @NotNull
            public static final Back INSTANCE = new Back();

            private Back() {
                super(true, null);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ClusterClicked;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "", ImagesContract.URL, "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "request", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "getRequest", "()Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "LWZ/t;", "getEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ClusterClicked extends Action {
            private final t event;
            private final AddressEditMapRequest request;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClusterClicked(@NotNull String url, AddressEditMapRequest addressEditMapRequest, t tVar) {
                super(true, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.request = addressEditMapRequest;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClusterClicked)) {
                    return false;
                }
                ClusterClicked clusterClicked = (ClusterClicked) other;
                return Intrinsics.d(this.url, clusterClicked.url) && Intrinsics.d(this.request, clusterClicked.request) && Intrinsics.d(this.event, clusterClicked.event);
            }

            public final t getEvent() {
                return this.event;
            }

            public final AddressEditMapRequest getRequest() {
                return this.request;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AddressEditMapRequest addressEditMapRequest = this.request;
                int hashCode2 = (hashCode + (addressEditMapRequest == null ? 0 : addressEditMapRequest.hashCode())) * 31;
                t tVar = this.event;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.url;
                AddressEditMapRequest addressEditMapRequest = this.request;
                t tVar = this.event;
                StringBuilder sb2 = new StringBuilder("ClusterClicked(url=");
                sb2.append(str);
                sb2.append(", request=");
                sb2.append(addressEditMapRequest);
                sb2.append(", event=");
                return b.d(sb2, tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$HidePvzSheet;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HidePvzSheet extends Action {

            @NotNull
            public static final HidePvzSheet INSTANCE = new HidePvzSheet();

            private HidePvzSheet() {
                super(true, null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$LocationException;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "Lcom/google/android/gms/common/api/ResolvableApiException;", "exception", "<init>", "(Lcom/google/android/gms/common/api/ResolvableApiException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/gms/common/api/ResolvableApiException;", "getException", "()Lcom/google/android/gms/common/api/ResolvableApiException;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocationException extends Action {

            @NotNull
            private final ResolvableApiException exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocationException(@NotNull ResolvableApiException exception) {
                super(true, null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LocationException) && Intrinsics.d(this.exception, ((LocationException) other).exception);
            }

            @NotNull
            public final ResolvableApiException getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            @NotNull
            public String toString() {
                return "LocationException(exception=" + this.exception + ")";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "point", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "editMapVO", "", "zoom", "<init>", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "getPoint", "()Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "getEditMapVO", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Ljava/lang/Float;", "getZoom", "()Ljava/lang/Float;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MoveToLocation extends Action {
            private final AddressEditMapVO editMapVO;

            @NotNull
            private final CoordinateModel point;
            private final Float zoom;

            public /* synthetic */ MoveToLocation(CoordinateModel coordinateModel, AddressEditMapVO addressEditMapVO, Float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(coordinateModel, (i11 & 2) != 0 ? null : addressEditMapVO, (i11 & 4) != 0 ? null : f7);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MoveToLocation)) {
                    return false;
                }
                MoveToLocation moveToLocation = (MoveToLocation) other;
                return Intrinsics.d(this.point, moveToLocation.point) && Intrinsics.d(this.editMapVO, moveToLocation.editMapVO) && Intrinsics.d(this.zoom, moveToLocation.zoom);
            }

            public final AddressEditMapVO getEditMapVO() {
                return this.editMapVO;
            }

            @NotNull
            public final CoordinateModel getPoint() {
                return this.point;
            }

            public int hashCode() {
                int hashCode = this.point.hashCode() * 31;
                AddressEditMapVO addressEditMapVO = this.editMapVO;
                int hashCode2 = (hashCode + (addressEditMapVO == null ? 0 : addressEditMapVO.hashCode())) * 31;
                Float f7 = this.zoom;
                return hashCode2 + (f7 != null ? f7.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "MoveToLocation(point=" + this.point + ", editMapVO=" + this.editMapVO + ", zoom=" + this.zoom + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoveToLocation(@NotNull CoordinateModel point, AddressEditMapVO addressEditMapVO, Float f7) {
                super(true, null);
                Intrinsics.checkNotNullParameter(point, "point");
                this.point = point;
                this.editMapVO = addressEditMapVO;
                this.zoom = f7;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$PinClicked;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "", ImagesContract.URL, "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "request", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "getRequest", "()Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "LWZ/t;", "getEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinClicked extends Action {
            private final t event;
            private final AddressEditMapRequest request;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PinClicked(@NotNull String url, AddressEditMapRequest addressEditMapRequest, t tVar) {
                super(true, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.request = addressEditMapRequest;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinClicked)) {
                    return false;
                }
                PinClicked pinClicked = (PinClicked) other;
                return Intrinsics.d(this.url, pinClicked.url) && Intrinsics.d(this.request, pinClicked.request) && Intrinsics.d(this.event, pinClicked.event);
            }

            public final t getEvent() {
                return this.event;
            }

            public final AddressEditMapRequest getRequest() {
                return this.request;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AddressEditMapRequest addressEditMapRequest = this.request;
                int hashCode2 = (hashCode + (addressEditMapRequest == null ? 0 : addressEditMapRequest.hashCode())) * 31;
                t tVar = this.event;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.url;
                AddressEditMapRequest addressEditMapRequest = this.request;
                t tVar = this.event;
                StringBuilder sb2 = new StringBuilder("PinClicked(url=");
                sb2.append(str);
                sb2.append(", request=");
                sb2.append(addressEditMapRequest);
                sb2.append(", event=");
                return b.d(sb2, tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$PrepareToClusterization;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PrepareToClusterization extends Action {

            @NotNull
            public static final PrepareToClusterization INSTANCE = new PrepareToClusterization();

            private PrepareToClusterization() {
                super(true, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$RequestLocationPermission;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RequestLocationPermission extends Action {

            @NotNull
            public static final RequestLocationPermission INSTANCE = new RequestLocationPermission();

            private RequestLocationPermission() {
                super(true, null);
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$SelectorClicked;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "", ImagesContract.URL, "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "request", "LWZ/t;", "event", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;LWZ/t;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "getRequest", "()Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "LWZ/t;", "getEvent", "()LWZ/t;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "getType", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectorClicked extends Action {
            private final t event;
            private final AddressEditMapRequest request;

            @NotNull
            private final AddressEditMapDTO.Selector.Type type;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectorClicked(@NotNull String url, AddressEditMapRequest addressEditMapRequest, t tVar, @NotNull AddressEditMapDTO.Selector.Type type) {
                super(true, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(type, "type");
                this.url = url;
                this.request = addressEditMapRequest;
                this.event = tVar;
                this.type = type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectorClicked)) {
                    return false;
                }
                SelectorClicked selectorClicked = (SelectorClicked) other;
                return Intrinsics.d(this.url, selectorClicked.url) && Intrinsics.d(this.request, selectorClicked.request) && Intrinsics.d(this.event, selectorClicked.event) && this.type == selectorClicked.type;
            }

            public final t getEvent() {
                return this.event;
            }

            public final AddressEditMapRequest getRequest() {
                return this.request;
            }

            @NotNull
            public final AddressEditMapDTO.Selector.Type getType() {
                return this.type;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AddressEditMapRequest addressEditMapRequest = this.request;
                int hashCode2 = (hashCode + (addressEditMapRequest == null ? 0 : addressEditMapRequest.hashCode())) * 31;
                t tVar = this.event;
                return this.type.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                return "SelectorClicked(url=" + this.url + ", request=" + this.request + ", event=" + this.event + ", type=" + this.type + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$ShowUserCurrentLocationPin;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "markerLocation", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "getMarkerLocation", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowUserCurrentLocationPin extends Action {

            @NotNull
            private final AddressEditMapVO.LocationMarker markerLocation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowUserCurrentLocationPin(@NotNull AddressEditMapVO.LocationMarker markerLocation) {
                super(true, null);
                Intrinsics.checkNotNullParameter(markerLocation, "markerLocation");
                this.markerLocation = markerLocation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowUserCurrentLocationPin) && Intrinsics.d(this.markerLocation, ((ShowUserCurrentLocationPin) other).markerLocation);
            }

            @NotNull
            public final AddressEditMapVO.LocationMarker getMarkerLocation() {
                return this.markerLocation;
            }

            public int hashCode() {
                return this.markerLocation.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowUserCurrentLocationPin(markerLocation=" + this.markerLocation + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$StartCameraMoving;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StartCameraMoving extends Action {

            @NotNull
            public static final StartCameraMoving INSTANCE = new StartCameraMoving();

            private StartCameraMoving() {
                super(true, null);
            }
        }

        public /* synthetic */ Action(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11);
        }

        public boolean getForce() {
            return this.force;
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MapMove;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action;", "", ImagesContract.URL, "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "request", "", "isForced", "isMoveToUserLocation", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;Ljava/lang/Boolean;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "getRequest", "()Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "()Z", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapMove extends Action {
            private final Boolean isForced;
            private final boolean isMoveToUserLocation;
            private final AddressEditMapRequest request;

            @NotNull
            private final String url;

            public /* synthetic */ MapMove(String str, AddressEditMapRequest addressEditMapRequest, Boolean bool, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, addressEditMapRequest, (i11 & 4) != 0 ? Boolean.FALSE : bool, (i11 & 8) != 0 ? false : z11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MapMove)) {
                    return false;
                }
                MapMove mapMove = (MapMove) other;
                return Intrinsics.d(this.url, mapMove.url) && Intrinsics.d(this.request, mapMove.request) && Intrinsics.d(this.isForced, mapMove.isForced) && this.isMoveToUserLocation == mapMove.isMoveToUserLocation;
            }

            public final AddressEditMapRequest getRequest() {
                return this.request;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AddressEditMapRequest addressEditMapRequest = this.request;
                int hashCode2 = (hashCode + (addressEditMapRequest == null ? 0 : addressEditMapRequest.hashCode())) * 31;
                Boolean bool = this.isForced;
                return Boolean.hashCode(this.isMoveToUserLocation) + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
            }

            /* renamed from: isMoveToUserLocation, reason: from getter */
            public final boolean getIsMoveToUserLocation() {
                return this.isMoveToUserLocation;
            }

            @NotNull
            public String toString() {
                return "MapMove(url=" + this.url + ", request=" + this.request + ", isForced=" + this.isForced + ", isMoveToUserLocation=" + this.isMoveToUserLocation + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MapMove(@NotNull String url, AddressEditMapRequest addressEditMapRequest, Boolean bool, boolean z11) {
                super(bool != null ? bool.booleanValue() : false, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.request = addressEditMapRequest;
                this.isForced = bool;
                this.isMoveToUserLocation = z11;
            }
        }

        private Action(boolean z11) {
            this.force = z11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_BANNER", "SHOW_HINT", "HIDE_BANNER", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BannerState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BannerState[] $VALUES;
        public static final BannerState SHOW_BANNER = new BannerState("SHOW_BANNER", 0);
        public static final BannerState SHOW_HINT = new BannerState("SHOW_HINT", 1);
        public static final BannerState HIDE_BANNER = new BannerState("HIDE_BANNER", 2);

        private static final /* synthetic */ BannerState[] $values() {
            return new BannerState[]{SHOW_BANNER, SHOW_HINT, HIDE_BANNER};
        }

        static {
            BannerState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private BannerState(String str, int i11) {
        }

        public static BannerState valueOf(String str) {
            return (BannerState) Enum.valueOf(BannerState.class, str);
        }

        public static BannerState[] values() {
            return (BannerState[]) $VALUES.clone();
        }
    }

    void bind(@NotNull AddressEditMapVO page, boolean isFirstInit);

    boolean checkUserLocationIncludedInViewport(@NotNull AddressEditMapVO.ViewPort viewport);

    void defineLocationIfNeeded(@NotNull AddressEditMapVO page);

    void defineLocationIfPermissionChanged();

    @NotNull
    P<Action> getAction();

    @NotNull
    P<BannerState> getBannerState();

    @NotNull
    P<Boolean> getLoader();

    @NotNull
    P<AddressEditMapVOWithPayloads> getMapState();

    void hideBanner();

    void onBackPressed();

    void onCameraEndMoveAction(@NotNull AddressEditMapVO.Coordinate center, AddressEditMapVO.ViewPort viewport, float zoom);

    void onCameraStartMoveAction();

    void onClusterClickedAction(String link, AddressEditMapVO.ViewPort viewport, float zoom, t tokenizedEvent);

    void onDefineCurrentLocationAction(boolean fromLocationButton);

    void onLocationEnabledResult(int resultCode);

    void onPinClickedAction(String link, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent);

    void onSelectPinFromBannerAction(@NotNull String url, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent);

    void onSelectorButtonPressed(@NotNull String url, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent, @NotNull AddressEditMapDTO.Selector.Type type);

    void startBannerTimer();

    void startHintTimer(long hintDelayMs);
}
