package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Bc.f;
import Be.AbstractC2635g;
import Ge.n;
import He.b;
import Hs.c;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModelImpl;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010.\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u001a0\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010'R\"\u00102\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u0010\u001dR\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u000100098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010;¨\u0006D"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModelImpl;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoApi;", "addressUiInfoApi", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoApi;", "actionAddressBookBarGeoApi", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "tabConfigUpdateDelegate", "Lru/ozon/app/android/location/ComposerLocationRepository;", "locationRepository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoApi;Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoApi;Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;Lru/ozon/app/android/location/ComposerLocationRepository;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "cell", "", "setAddressCell", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;)V", "setAddressCellV2", "", "miniAppName", "updateAddressCell", "(Ljava/lang/String;)V", "updateTabConfig", "()V", "", "shouldShow", "setShouldShow", "(Z)V", "link", "getActionAddressBookBarGeo", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoApi;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoApi;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "LAe/x0;", "_addressCellFlow", "LAe/x0;", "_addressCellV2Flow", "Lxe/M;", "scope", "Lxe/M;", "Landroidx/lifecycle/V;", "kotlin.jvm.PlatformType", "_shouldShow", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoResponse;", "_actionAddressBookBarGeo", "isTooltipTracked", "Z", "()Z", "setTooltipTracked", "Lnc/b;", "updateDisposable", "Lnc/b;", "LAe/h;", "getAddressCellFlow", "()LAe/h;", "addressCellFlow", "getAddressCellV2Flow", "addressCellV2Flow", "Landroidx/lifecycle/P;", "getShouldShow", "()Landroidx/lifecycle/P;", "actionAddressBookBarGeo", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressUiInfoViewModelImpl implements AddressUiInfoViewModel {

    @NotNull
    private final x0<ActionAddressBookBarGeoResponse> _actionAddressBookBarGeo;

    @NotNull
    private final x0<AddressCell> _addressCellFlow;

    @NotNull
    private final x0<AddressCell> _addressCellV2Flow;

    @NotNull
    private final V<Boolean> _shouldShow;

    @NotNull
    private final ActionAddressBookBarGeoApi actionAddressBookBarGeoApi;

    @NotNull
    private final AddressUiInfoApi addressUiInfoApi;

    @NotNull
    private final AuthStateStorage authStateStorage;
    private boolean isTooltipTracked;

    @NotNull
    private final ComposerLocationRepository locationRepository;

    @NotNull
    private M scope;

    @NotNull
    private final TabConfigUpdateDelegate tabConfigUpdateDelegate;
    private volatile InterfaceC8487b updateDisposable;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModelImpl$1", f = "AddressUiInfoViewModelImpl.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModelImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AddressUiInfoViewModelImpl.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h a11 = n.a(AddressUiInfoViewModelImpl.this.authStateStorage.getAuthState());
                final AddressUiInfoViewModelImpl addressUiInfoViewModelImpl = AddressUiInfoViewModelImpl.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModelImpl.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Boolean) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Boolean bool, d<? super Unit> dVar) {
                        AddressUiInfoViewModelImpl.this.setTooltipTracked(false);
                        AddressUiInfoViewModelImpl.this._shouldShow.postValue(Boolean.TRUE);
                        AddressUiInfoViewModelImpl.this._actionAddressBookBarGeo.setValue(null);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public AddressUiInfoViewModelImpl(@NotNull AddressUiInfoApi addressUiInfoApi, @NotNull ActionAddressBookBarGeoApi actionAddressBookBarGeoApi, @NotNull TabConfigUpdateDelegate tabConfigUpdateDelegate, @NotNull ComposerLocationRepository locationRepository, @NotNull AuthStateStorage authStateStorage) {
        Intrinsics.checkNotNullParameter(addressUiInfoApi, "addressUiInfoApi");
        Intrinsics.checkNotNullParameter(actionAddressBookBarGeoApi, "actionAddressBookBarGeoApi");
        Intrinsics.checkNotNullParameter(tabConfigUpdateDelegate, "tabConfigUpdateDelegate");
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        this.addressUiInfoApi = addressUiInfoApi;
        this.actionAddressBookBarGeoApi = actionAddressBookBarGeoApi;
        this.tabConfigUpdateDelegate = tabConfigUpdateDelegate;
        this.locationRepository = locationRepository;
        this.authStateStorage = authStateStorage;
        this._addressCellFlow = O0.a(null);
        this._addressCellV2Flow = O0.a(null);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b.plus(X0.b()));
        this._shouldShow = new V<>(Boolean.TRUE);
        this._actionAddressBookBarGeo = O0.a(null);
        C10727i.c(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    @NotNull
    public InterfaceC2395h<ActionAddressBookBarGeoResponse> getActionAddressBookBarGeo() {
        return new C2406m0(this._actionAddressBookBarGeo);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    @NotNull
    public InterfaceC2395h<AddressCell> getAddressCellFlow() {
        return new C2406m0(this._addressCellFlow);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    @NotNull
    public InterfaceC2395h<AddressCell> getAddressCellV2Flow() {
        return new C2406m0(this._addressCellV2Flow);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    @NotNull
    public P<Boolean> getShouldShow() {
        return this._shouldShow;
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    /* renamed from: isTooltipTracked, reason: from getter */
    public boolean getIsTooltipTracked() {
        return this.isTooltipTracked;
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void setAddressCell(@NotNull AddressCell cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this._addressCellFlow.setValue(cell);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void setAddressCellV2(@NotNull AddressCell cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this._addressCellV2Flow.setValue(cell);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void setShouldShow(boolean shouldShow) {
        this._shouldShow.postValue(Boolean.valueOf(shouldShow));
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void setTooltipTracked(boolean z11) {
        this.isTooltipTracked = z11;
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void updateAddressCell(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        if (this.updateDisposable == null) {
            this.updateDisposable = new f(this.addressUiInfoApi.getAddressUiInfo(miniAppName).j(Mc.a.b()), new InterfaceC9019a() { // from class: ip.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    AddressUiInfoViewModelImpl.this.updateDisposable = null;
                }
            }).h(new Hs.b(new AddressUiInfoViewModelImpl$updateAddressCell$2(this), 9), new c(AddressUiInfoViewModelImpl$updateAddressCell$3.INSTANCE, 7));
        }
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void updateTabConfig() {
        this.tabConfigUpdateDelegate.updateMainTabBarConfig();
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel
    public void getActionAddressBookBarGeo(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        C10727i.c(this.scope, null, null, new AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1(link, this, null), 3);
    }
}
