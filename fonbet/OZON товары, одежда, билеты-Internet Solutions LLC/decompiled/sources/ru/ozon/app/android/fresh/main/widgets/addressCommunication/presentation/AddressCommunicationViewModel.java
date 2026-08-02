package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import He.b;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.flags.FreshAddressCommunicationVisibleFlag;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationApi;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.LocationInfo;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00060\u0001j\u0002`\u0002:\u0001$B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationApi;", "api", "Lru/ozon/app/android/location/LocationRepository;", "locationRepository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationApi;Lru/ozon/app/android/location/LocationRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "checkWidgetVisibility", "()V", "", "lat", "lng", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo;", "createLocationInfo", "(DD)Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo;", "onCleared", "setWidgetInvisible", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationApi;", "Lru/ozon/app/android/location/LocationRepository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lxe/M;", "scope", "Lxe/M;", "Landroidx/lifecycle/V;", "", "_shouldShow", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "getShouldShow", "()Landroidx/lifecycle/P;", "shouldShow", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressCommunicationViewModel implements InterfaceC6786a {

    @NotNull
    private final V<Boolean> _shouldShow;

    @NotNull
    private final AddressCommunicationApi api;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final LocationRepository locationRepository;

    @NotNull
    private final M scope;

    public AddressCommunicationViewModel(@NotNull AddressCommunicationApi api, @NotNull LocationRepository locationRepository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.api = api;
        this.locationRepository = locationRepository;
        this.featureChecker = featureChecker;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b.plus(X0.b()));
        this._shouldShow = new V<>();
        checkWidgetVisibility();
    }

    private final void checkWidgetVisibility() {
        if (this.featureChecker.isEnabled(FreshAddressCommunicationVisibleFlag.INSTANCE)) {
            this._shouldShow.postValue(Boolean.TRUE);
        } else {
            C10727i.c(this.scope, null, null, new AddressCommunicationViewModel$checkWidgetVisibility$1(this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationInfo createLocationInfo(double lat, double lng) {
        return new LocationInfo(new LocationInfo.Coordinates(lat, lng));
    }

    @NotNull
    public final P<Boolean> getShouldShow() {
        return this._shouldShow;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }

    public final void setWidgetInvisible() {
        this._shouldShow.setValue(Boolean.FALSE);
    }
}
