package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.UiState;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.ViewIntent;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/MercuryCertificatesAddressViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "text", "", "updateAddress", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "fetchAddresses", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/ViewIntent;", "intent", "onViewIntent$checkout_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/ViewIntent;)V", "onViewIntent", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LAe/x0;", "_searchState", "LAe/x0;", "LAe/M0;", "searchState", "LAe/M0;", "getSearchState$checkout_prodGoogleAllVendorsRelease", "()LAe/M0;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "_addressesState", "addressesState", "getAddressesState$checkout_prodGoogleAllVendorsRelease", "Lxe/B0;", "job", "Lxe/B0;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MercuryCertificatesAddressViewModel extends w0 {

    @NotNull
    private final x0<UiState> _addressesState;

    @NotNull
    private final x0<String> _searchState;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final M0<UiState> addressesState;
    private B0 job;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final M0<String> searchState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/MercuryCertificatesAddressViewModel$Companion;", "", "<init>", "()V", "SEARCH_ADDRESS_PARAM", "", "SEARCH_DEBOUNCE_DELAY_MS", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MercuryCertificatesAddressViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull ComposerNavigator navigator) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.actionV2Repository = actionV2Repository;
        this.navigator = navigator;
        x0<String> a11 = O0.a("");
        this._searchState = a11;
        this.searchState = C2399j.b(a11);
        x0<UiState> a12 = O0.a(UiState.LoadingState.INSTANCE);
        this._addressesState = a12;
        this.addressesState = C2399j.b(a12);
    }

    private final void updateAddress(AtomAction action, String text) {
        this._searchState.setValue(text);
        fetchAddresses(action, text);
    }

    public final void fetchAddresses(AtomAction action, String query) {
        if (action instanceof AtomAction.Click) {
            if (query == null || h.K(query) || query.length() > 3) {
                B0 b02 = this.job;
                if (b02 != null) {
                    b02.j(null);
                }
                this.job = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new MercuryCertificatesAddressViewModel$fetchAddresses$1(this, action, (query == null || h.K(query)) ? ((AtomAction.Click) action).getParams() : U.l(new Pair("searchAddress", query)), null), 3);
            }
        }
    }

    @NotNull
    public final M0<UiState> getAddressesState$checkout_prodGoogleAllVendorsRelease() {
        return this.addressesState;
    }

    @NotNull
    public final M0<String> getSearchState$checkout_prodGoogleAllVendorsRelease() {
        return this.searchState;
    }

    public final void onViewIntent$checkout_prodGoogleAllVendorsRelease(@NotNull ViewIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(intent instanceof ViewIntent.AddressInputUpdated)) {
            throw new o();
        }
        ViewIntent.AddressInputUpdated addressInputUpdated = (ViewIntent.AddressInputUpdated) intent;
        updateAddress(addressInputUpdated.getAction(), addressInputUpdated.getText());
    }
}
