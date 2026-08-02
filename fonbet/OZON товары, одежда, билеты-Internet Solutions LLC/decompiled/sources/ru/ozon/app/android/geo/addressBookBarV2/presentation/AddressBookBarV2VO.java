package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import An.C2439a;
import Bl.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.storefront.navBar.v2.NavbarSaleUpdate;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/storefront/navBar/v2/NavbarSaleUpdate;", "", "id", "", "saleActive", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "cell", "isEmbedded", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "updateSettings", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "geoAction", "<init>", "(JZLru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;ZLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getSaleActive", "()Z", "setSaleActive", "(Z)V", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "getCell", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "getUpdateSettings", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$UpdateSettings;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getGeoAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddressBookBarV2VO implements c, NavbarSaleUpdate {
    private final AtomAction action;
    private final String backgroundColor;

    @NotNull
    private final AddressCell.RightLeftTitlesCell24Icon cell;
    private final AtomActionDTO geoAction;
    private final long id;
    private final boolean isEmbedded;
    private boolean saleActive;
    private final AddressCell.UpdateSettings updateSettings;

    public AddressBookBarV2VO(long j11, boolean z11, @NotNull AddressCell.RightLeftTitlesCell24Icon cell, boolean z12, String str, AtomAction atomAction, AddressCell.UpdateSettings updateSettings, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.saleActive = z11;
        this.cell = cell;
        this.isEmbedded = z12;
        this.backgroundColor = str;
        this.action = atomAction;
        this.updateSettings = updateSettings;
        this.geoAction = atomActionDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressBookBarV2VO)) {
            return false;
        }
        AddressBookBarV2VO addressBookBarV2VO = (AddressBookBarV2VO) other;
        return this.id == addressBookBarV2VO.id && this.saleActive == addressBookBarV2VO.saleActive && Intrinsics.d(this.cell, addressBookBarV2VO.cell) && this.isEmbedded == addressBookBarV2VO.isEmbedded && Intrinsics.d(this.backgroundColor, addressBookBarV2VO.backgroundColor) && Intrinsics.d(this.action, addressBookBarV2VO.action) && Intrinsics.d(this.updateSettings, addressBookBarV2VO.updateSettings) && Intrinsics.d(this.geoAction, addressBookBarV2VO.geoAction);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AddressCell.RightLeftTitlesCell24Icon getCell() {
        return this.cell;
    }

    public final AtomActionDTO getGeoAction() {
        return this.geoAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public boolean getSaleActive() {
        return this.saleActive;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AddressCell.UpdateSettings getUpdateSettings() {
        return this.updateSettings;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a((this.cell.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.saleActive)) * 31, 31, this.isEmbedded);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        AddressCell.UpdateSettings updateSettings = this.updateSettings;
        int hashCode3 = (hashCode2 + (updateSettings == null ? 0 : updateSettings.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.geoAction;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    /* renamed from: isEmbedded, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    @Override // ru.ozon.app.android.storefront.navBar.v2.NavbarSaleUpdate
    public void setSaleActive(boolean z11) {
        this.saleActive = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.saleActive;
        AddressCell.RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon = this.cell;
        boolean z12 = this.isEmbedded;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        AddressCell.UpdateSettings updateSettings = this.updateSettings;
        AtomActionDTO atomActionDTO = this.geoAction;
        StringBuilder c11 = b.c(j11, "AddressBookBarV2VO(id=", ", saleActive=", z11);
        c11.append(", cell=");
        c11.append(rightLeftTitlesCell24Icon);
        c11.append(", isEmbedded=");
        c11.append(z12);
        C2439a.c(", backgroundColor=", str, ", action=", c11, atomAction);
        c11.append(", updateSettings=");
        c11.append(updateSettings);
        c11.append(", geoAction=");
        c11.append(atomActionDTO);
        c11.append(")");
        return c11.toString();
    }
}
