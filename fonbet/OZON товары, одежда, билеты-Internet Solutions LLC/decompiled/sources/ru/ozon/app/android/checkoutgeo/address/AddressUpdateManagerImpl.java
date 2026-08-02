package ru.ozon.app.android.checkoutgeo.address;

import Nc.C3667a;
import io.reactivex.p;
import io.reactivex.u;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManagerImpl;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u00040\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManagerImpl;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "<init>", "()V", "", "addressChanged", "Lio/reactivex/p;", "kotlin.jvm.PlatformType", "observeAddressChange", "()Lio/reactivex/p;", "LNc/a;", "addressUpdate", "LNc/a;", "getAddressUpdate", "()LNc/a;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressUpdateManagerImpl implements AddressUpdateManager {

    @NotNull
    private final C3667a<Unit> addressUpdate;

    public AddressUpdateManagerImpl() {
        C3667a<Unit> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.addressUpdate = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u observeAddressChange$lambda$0(AddressUpdateManagerImpl addressUpdateManagerImpl) {
        return addressUpdateManagerImpl.getAddressUpdate().g() ? addressUpdateManagerImpl.getAddressUpdate().skip(1L) : addressUpdateManagerImpl.getAddressUpdate();
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager
    public void addressChanged() {
        getAddressUpdate().onNext(Unit.f71690a);
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager
    @NotNull
    public C3667a<Unit> getAddressUpdate() {
        return this.addressUpdate;
    }

    @Override // ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager
    @NotNull
    public p<Unit> observeAddressChange() {
        p<Unit> defer = p.defer(new Callable() { // from class: hp.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u observeAddressChange$lambda$0;
                observeAddressChange$lambda$0 = AddressUpdateManagerImpl.observeAddressChange$lambda$0(AddressUpdateManagerImpl.this);
                return observeAddressChange$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(defer, "defer(...)");
        return defer;
    }
}
