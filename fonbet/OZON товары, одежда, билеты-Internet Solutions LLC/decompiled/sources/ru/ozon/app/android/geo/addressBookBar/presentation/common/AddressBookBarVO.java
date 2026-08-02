package ru.ozon.app.android.geo.addressBookBar.presentation.common;

import Bl.b;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "showSeparator", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "addressCell", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "trackingInfo", "<init>", "(JZLru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getShowSeparator", "()Z", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "getAddressCell", "()Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressBookBarVO implements c {
    private final AtomAction action;

    @NotNull
    private final AddressCell addressCell;
    private final long id;
    private final boolean showSeparator;
    private final t trackingInfo;

    public AddressBookBarVO(long j11, boolean z11, @NotNull AddressCell addressCell, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(addressCell, "addressCell");
        this.id = j11;
        this.showSeparator = z11;
        this.addressCell = addressCell;
        this.action = atomAction;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressBookBarVO)) {
            return false;
        }
        AddressBookBarVO addressBookBarVO = (AddressBookBarVO) other;
        return this.id == addressBookBarVO.id && this.showSeparator == addressBookBarVO.showSeparator && Intrinsics.d(this.addressCell, addressBookBarVO.addressCell) && Intrinsics.d(this.action, addressBookBarVO.action) && Intrinsics.d(this.trackingInfo, addressBookBarVO.trackingInfo);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final AddressCell getAddressCell() {
        return this.addressCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.addressCell.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.showSeparator)) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.showSeparator;
        AddressCell addressCell = this.addressCell;
        AtomAction atomAction = this.action;
        t tVar = this.trackingInfo;
        StringBuilder c11 = b.c(j11, "AddressBookBarVO(id=", ", showSeparator=", z11);
        c11.append(", addressCell=");
        c11.append(addressCell);
        c11.append(", action=");
        c11.append(atomAction);
        return a.b(c11, ", trackingInfo=", tVar, ")");
    }
}
