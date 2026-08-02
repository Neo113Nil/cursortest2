package ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation;

import De.s;
import Sc.r;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.data.CharityAddressSelectorApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/data/CharityAddressSelectorApi;", "api", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "addressUpdateManager", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/data/CharityAddressSelectorApi;Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;)V", "", "onCleared", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "dto", "changeAddress", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/data/CharityAddressSelectorApi;", "Lru/ozon/app/android/checkoutgeo/address/AddressUpdateManager;", "Landroidx/lifecycle/V;", "LSc/r;", "events", "Landroidx/lifecycle/V;", "getEvents", "()Landroidx/lifecycle/V;", "Lxe/M;", "scope", "Lxe/M;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CharityAddressSelectorViewModel implements InterfaceC6786a {

    @NotNull
    private final AddressUpdateManager addressUpdateManager;

    @NotNull
    private final CharityAddressSelectorApi api;

    @NotNull
    private final V<r<Unit>> events;

    @NotNull
    private M scope;

    public CharityAddressSelectorViewModel(@NotNull CharityAddressSelectorApi api, @NotNull AddressUpdateManager addressUpdateManager) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(addressUpdateManager, "addressUpdateManager");
        this.api = api;
        this.addressUpdateManager = addressUpdateManager;
        this.events = new V<>();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(s.f6650a.plus(X0.b()));
    }

    public final void changeAddress(@NotNull AtomAction.Click dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Map<String, String> params = dto.getParams();
        if (params == null) {
            params = U.c();
        }
        String link = dto.getLink();
        if (link == null) {
            return;
        }
        C10727i.c(this.scope, null, null, new CharityAddressSelectorViewModel$changeAddress$1(this, link, params, null), 3);
    }

    @NotNull
    public final V<r<Unit>> getEvents() {
        return this.events;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }
}
