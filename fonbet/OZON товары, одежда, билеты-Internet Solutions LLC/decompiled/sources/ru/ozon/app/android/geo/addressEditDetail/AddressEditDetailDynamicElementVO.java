package ru.ozon.app.android.geo.addressEditDetail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO;", "", "<init>", "()V", "Atom", "CheckoutCellList", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO$Atom;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO$CheckoutCellList;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressEditDetailDynamicElementVO {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO$Atom;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Atom extends AddressEditDetailDynamicElementVO {

        @NotNull
        private final AtomDTO atom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Atom(@NotNull AtomDTO atom) {
            super(null);
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Atom) && Intrinsics.d(this.atom, ((Atom) other).atom);
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        public int hashCode() {
            return this.atom.hashCode();
        }

        @NotNull
        public String toString() {
            return "Atom(atom=" + this.atom + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO$CheckoutCellList;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkoutCellList", "<init>", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "getCheckoutCellList", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckoutCellList extends AddressEditDetailDynamicElementVO {

        @NotNull
        private final CheckoutCellListDTO checkoutCellList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckoutCellList(@NotNull CheckoutCellListDTO checkoutCellList) {
            super(null);
            Intrinsics.checkNotNullParameter(checkoutCellList, "checkoutCellList");
            this.checkoutCellList = checkoutCellList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckoutCellList) && Intrinsics.d(this.checkoutCellList, ((CheckoutCellList) other).checkoutCellList);
        }

        @NotNull
        public final CheckoutCellListDTO getCheckoutCellList() {
            return this.checkoutCellList;
        }

        public int hashCode() {
            return this.checkoutCellList.hashCode();
        }

        @NotNull
        public String toString() {
            return "CheckoutCellList(checkoutCellList=" + this.checkoutCellList + ")";
        }
    }

    public /* synthetic */ AddressEditDetailDynamicElementVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AddressEditDetailDynamicElementVO() {
    }
}
