package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import Ae.InterfaceC2395h;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u001c\u0010\u001f\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "cell", "", "setAddressCell", "(Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;)V", "setAddressCellV2", "", "miniAppName", "updateAddressCell", "(Ljava/lang/String;)V", "updateTabConfig", "()V", "", "shouldShow", "setShouldShow", "(Z)V", "link", "getActionAddressBookBarGeo", "LAe/h;", "getAddressCellFlow", "()LAe/h;", "addressCellFlow", "getAddressCellV2Flow", "addressCellV2Flow", "Landroidx/lifecycle/P;", "getShouldShow", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoResponse;", "actionAddressBookBarGeo", "isTooltipTracked", "()Z", "setTooltipTracked", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressUiInfoViewModel {
    @NotNull
    InterfaceC2395h<ActionAddressBookBarGeoResponse> getActionAddressBookBarGeo();

    void getActionAddressBookBarGeo(@NotNull String link);

    @NotNull
    InterfaceC2395h<AddressCell> getAddressCellFlow();

    @NotNull
    InterfaceC2395h<AddressCell> getAddressCellV2Flow();

    @NotNull
    P<Boolean> getShouldShow();

    boolean isTooltipTracked();

    void setAddressCell(@NotNull AddressCell cell);

    void setAddressCellV2(@NotNull AddressCell cell);

    void setShouldShow(boolean shouldShow);

    void setTooltipTracked(boolean z11);

    void updateAddressCell(@NotNull String miniAppName);

    void updateTabConfig();
}
