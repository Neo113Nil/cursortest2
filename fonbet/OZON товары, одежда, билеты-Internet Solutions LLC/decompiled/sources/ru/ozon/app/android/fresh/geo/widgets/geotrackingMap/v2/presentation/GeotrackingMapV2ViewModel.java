package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Ae.B0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ze.w;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;", "", "", "onBackPressed", "()V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "page", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)V", "onStart", "onStop", "Lze/w;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "getAction", "()Lze/w;", "action", "LAe/B0;", "getMapState", "()LAe/B0;", "mapState", "Action", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface GeotrackingMapV2ViewModel {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "", "<init>", "()V", "Back", "HidePopup", "RefreshPage", "ShowPopup", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$Back;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$HidePopup;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$RefreshPage;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$ShowPopup;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$Back;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Back extends Action {

            @NotNull
            public static final Back INSTANCE = new Back();

            private Back() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$HidePopup;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HidePopup extends Action {

            @NotNull
            public static final HidePopup INSTANCE = new HidePopup();

            private HidePopup() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$RefreshPage;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RefreshPage extends Action {

            @NotNull
            public static final RefreshPage INSTANCE = new RefreshPage();

            private RefreshPage() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action$ShowPopup;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowPopup extends Action {

            @NotNull
            public static final ShowPopup INSTANCE = new ShowPopup();

            private ShowPopup() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    void bind(@NotNull GeotrackingMapV2VO page);

    @NotNull
    w<Action> getAction();

    @NotNull
    B0<GeotrackingMapV2VO> getMapState();

    void onBackPressed();

    void onStart();

    void onStop();
}
