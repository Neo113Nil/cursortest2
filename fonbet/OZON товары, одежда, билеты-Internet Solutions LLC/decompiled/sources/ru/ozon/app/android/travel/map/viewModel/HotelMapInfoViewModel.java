package ru.ozon.app.android.travel.map.viewModel;

import B90.C2618u;
import BO.b;
import Bc.c;
import Bc.r;
import Fy.C3065c;
import Mc.a;
import android.location.Location;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.common.api.ResolvableApiException;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.utils.rx.RxExtKt;
import sc.C9656b;
import vc.l;
import we0.m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/location/LocationRepository;", "locationRepository", "<init>", "(Lru/ozon/app/android/location/LocationRepository;)V", "", "requestLastLocation", "()V", "checkLocationSettings", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "getActionLiveData", "()Landroidx/lifecycle/P;", "", "getStateLiveData", "onBottomWidgetCreated", "", "isProviderLogoOverlapped", "onBottomWidgetBound", "(Z)V", "newState", "onNewState", "(Ljava/lang/Object;)V", "onDefineCurrentLocationAction", "Lru/ozon/app/android/location/LocationRepository;", "Landroidx/lifecycle/V;", "action", "Landroidx/lifecycle/V;", "state", "Action", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HotelMapInfoViewModel extends w0 {

    @NotNull
    private final V<Action> action;

    @NotNull
    private final LocationRepository locationRepository;

    @NotNull
    private final V<Object> state;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "", "RequestLocationPermission", "HideBottomWidget", "ShowBottomWidget", "LocationException", "MoveToLocation", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$HideBottomWidget;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$LocationException;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$RequestLocationPermission;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$ShowBottomWidget;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$HideBottomWidget;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HideBottomWidget implements Action {

            @NotNull
            public static final HideBottomWidget INSTANCE = new HideBottomWidget();

            private HideBottomWidget() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof HideBottomWidget);
            }

            public int hashCode() {
                return 650616926;
            }

            @NotNull
            public String toString() {
                return "HideBottomWidget";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$LocationException;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "Lcom/google/android/gms/common/api/ResolvableApiException;", "exception", "<init>", "(Lcom/google/android/gms/common/api/ResolvableApiException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/gms/common/api/ResolvableApiException;", "getException", "()Lcom/google/android/gms/common/api/ResolvableApiException;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocationException implements Action {

            @NotNull
            private final ResolvableApiException exception;

            public LocationException(@NotNull ResolvableApiException exception) {
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "Lwe0/m;", "location", "<init>", "(Lwe0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwe0/m;", "getLocation", "()Lwe0/m;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MoveToLocation implements Action {

            @NotNull
            private final m location;

            public MoveToLocation(@NotNull m location) {
                Intrinsics.checkNotNullParameter(location, "location");
                this.location = location;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MoveToLocation) && Intrinsics.d(this.location, ((MoveToLocation) other).location);
            }

            @NotNull
            public final m getLocation() {
                return this.location;
            }

            public int hashCode() {
                return this.location.hashCode();
            }

            @NotNull
            public String toString() {
                return "MoveToLocation(location=" + this.location + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$RequestLocationPermission;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestLocationPermission implements Action {

            @NotNull
            public static final RequestLocationPermission INSTANCE = new RequestLocationPermission();

            private RequestLocationPermission() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestLocationPermission);
            }

            public int hashCode() {
                return 1516556614;
            }

            @NotNull
            public String toString() {
                return "RequestLocationPermission";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$ShowBottomWidget;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;", "", "isProviderLogoOverlapped", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowBottomWidget implements Action {
            private final boolean isProviderLogoOverlapped;

            public ShowBottomWidget(boolean z11) {
                this.isProviderLogoOverlapped = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowBottomWidget) && this.isProviderLogoOverlapped == ((ShowBottomWidget) other).isProviderLogoOverlapped;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isProviderLogoOverlapped);
            }

            /* renamed from: isProviderLogoOverlapped, reason: from getter */
            public final boolean getIsProviderLogoOverlapped() {
                return this.isProviderLogoOverlapped;
            }

            @NotNull
            public String toString() {
                return C2618u.g("ShowBottomWidget(isProviderLogoOverlapped=", ")", this.isProviderLogoOverlapped);
            }
        }
    }

    public HotelMapInfoViewModel(@NotNull LocationRepository locationRepository) {
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        this.locationRepository = locationRepository;
        this.action = new V<>();
        this.state = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLocationSettings() {
        C8486a a11 = C5415f.a(this);
        l lVar = new l(this.locationRepository.checkLocationSettings().k(a.b()), C8125a.a());
        y<Location> requestSingleLocation = this.locationRepository.requestSingleLocation(true);
        C9656b.c(requestSingleLocation, "next is null");
        InterfaceC8487b h11 = new r(new c(requestSingleLocation, lVar), new Gy.c(HotelMapInfoViewModel$checkLocationSettings$1.INSTANCE, 4)).h(new b(new HotelMapInfoViewModel$checkLocationSettings$2(this), 5), new GJ.a(new HotelMapInfoViewModel$checkLocationSettings$3(this), 5));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Action.MoveToLocation checkLocationSettings$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Action.MoveToLocation) function1.invoke(p02);
    }

    private final void requestLastLocation() {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new r(this.locationRepository.getLastLocation(true).j(a.b()).g(C8125a.a()), new C3065c(HotelMapInfoViewModel$requestLastLocation$1.INSTANCE, 7)).h(new Gy.a(new HotelMapInfoViewModel$requestLastLocation$2(this), 3), new Gy.b(new HotelMapInfoViewModel$requestLastLocation$3(this), 6));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Action.MoveToLocation requestLastLocation$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Action.MoveToLocation) function1.invoke(p02);
    }

    @NotNull
    public final P<Action> getActionLiveData() {
        return this.action;
    }

    @NotNull
    public final P<Object> getStateLiveData() {
        return this.state;
    }

    public final void onBottomWidgetBound(boolean isProviderLogoOverlapped) {
        this.action.setValue(new Action.ShowBottomWidget(isProviderLogoOverlapped));
    }

    public final void onBottomWidgetCreated() {
        this.action.setValue(Action.HideBottomWidget.INSTANCE);
    }

    public final void onDefineCurrentLocationAction() {
        if (this.locationRepository.hasLocationPermission()) {
            requestLastLocation();
        } else {
            this.action.postValue(Action.RequestLocationPermission.INSTANCE);
        }
    }

    public final void onNewState(@NotNull Object newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.state.setValue(newState);
    }
}
