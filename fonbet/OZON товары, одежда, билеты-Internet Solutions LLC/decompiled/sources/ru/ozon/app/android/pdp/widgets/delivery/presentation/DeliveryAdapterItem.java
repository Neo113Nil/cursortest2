package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import N3.C3660k;
import T7.E;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "Placeholder", "Separator", "VerticalSpace", "MainHeader", "SectionHeader", "CellDefault", "CellSingleAtom", "Footer", "Pickup", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$CellDefault;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$CellSingleAtom;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Footer;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$MainHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Placeholder;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Separator;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$VerticalSpace;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DeliveryAdapterItem {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$CellDefault;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cell", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "layoutId", "I", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellDefault extends DeliveryAdapterItem {

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell;
        private final int layoutId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDefault(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell) {
            super(null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.layoutId = R$layout.pdp_item_delivery_cell_default;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CellDefault) && Intrinsics.d(this.cell, ((CellDefault) other).cell);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault getCell() {
            return this.cell;
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        public int hashCode() {
            return this.cell.hashCode();
        }

        @NotNull
        public String toString() {
            return "CellDefault(cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$CellSingleAtom;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "layoutId", "I", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellSingleAtom extends DeliveryAdapterItem {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO cell;
        private final int layoutId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellSingleAtom(@NotNull AtomDTO cell) {
            super(null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.layoutId = R$layout.pdp_item_delivery_cell_with_icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CellSingleAtom) && Intrinsics.d(this.cell, ((CellSingleAtom) other).cell);
        }

        @NotNull
        public final AtomDTO getCell() {
            return this.cell;
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        public int hashCode() {
            return this.cell.hashCode();
        }

        @NotNull
        public String toString() {
            return "CellSingleAtom(cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Footer;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", CommentV3DTO.FOOTER_FIELD_NAME, "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", "getFooter", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", "layoutId", "I", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer extends DeliveryAdapterItem {
        public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

        @NotNull
        private final DeliveryFooter footer;
        private final int layoutId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Footer(@NotNull DeliveryFooter footer) {
            super(null);
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.footer = footer;
            this.layoutId = R$layout.pdp_item_delivery_footer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Footer) && Intrinsics.d(this.footer, ((Footer) other).footer);
        }

        @NotNull
        public final DeliveryFooter getFooter() {
            return this.footer;
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        public int hashCode() {
            return this.footer.hashCode();
        }

        @NotNull
        public String toString() {
            return "Footer(footer=" + this.footer + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$MainHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", CommentV3DTO.HEADER_FIELD_NAME, "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", "getHeader", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", "layoutId", "I", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainHeader extends DeliveryAdapterItem {

        @NotNull
        private final DeliveryHeader header;
        private final int layoutId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainHeader(@NotNull DeliveryHeader header) {
            super(null);
            Intrinsics.checkNotNullParameter(header, "header");
            this.header = header;
            this.layoutId = R$layout.pdp_item_delivery_main_header;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MainHeader) && Intrinsics.d(this.header, ((MainHeader) other).header);
        }

        @NotNull
        public final DeliveryHeader getHeader() {
            return this.header;
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        public int hashCode() {
            return this.header.hashCode();
        }

        @NotNull
        public String toString() {
            return "MainHeader(header=" + this.header + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "pickupButtonWrapper", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "getPickupButtonWrapper", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "layoutId", "I", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pickup extends DeliveryAdapterItem {
        private final int layoutId;

        @NotNull
        private final PickupButtonWrapper pickupButtonWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pickup(@NotNull PickupButtonWrapper pickupButtonWrapper) {
            super(null);
            Intrinsics.checkNotNullParameter(pickupButtonWrapper, "pickupButtonWrapper");
            this.pickupButtonWrapper = pickupButtonWrapper;
            this.layoutId = R$layout.pdp_item_delivery_pickup;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pickup) && Intrinsics.d(this.pickupButtonWrapper, ((Pickup) other).pickupButtonWrapper);
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        @NotNull
        public final PickupButtonWrapper getPickupButtonWrapper() {
            return this.pickupButtonWrapper;
        }

        public int hashCode() {
            return this.pickupButtonWrapper.hashCode();
        }

        @NotNull
        public String toString() {
            return "Pickup(pickupButtonWrapper=" + this.pickupButtonWrapper + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Placeholder;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Placeholder extends DeliveryAdapterItem {

        @NotNull
        public static final Placeholder INSTANCE = new Placeholder();
        private static final int layoutId = R$layout.pdp_item_delivery_placeholder;

        private Placeholder() {
            super(null);
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return layoutId;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "icon", "Ljava/lang/String;", "getIcon", "iconTint", "getIconTint", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "layoutId", "I", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionHeader extends DeliveryAdapterItem {
        private final String icon;
        private final String iconTint;
        private final int layoutId;
        private final TextDTO text;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) other;
            return Intrinsics.d(this.icon, sectionHeader.icon) && Intrinsics.d(this.iconTint, sectionHeader.iconTint) && Intrinsics.d(this.text, sectionHeader.text);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTint() {
            return this.iconTint;
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconTint;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextDTO textDTO = this.text;
            return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconTint;
            return b.e(C3660k.d("SectionHeader(icon=", str, ", iconTint=", str2, ", text="), this.text, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Separator;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Separator extends DeliveryAdapterItem {

        @NotNull
        public static final Separator INSTANCE = new Separator();
        private static final int layoutId = R$layout.pdp_item_delivery_separator;

        private Separator() {
            super(null);
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return layoutId;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$VerticalSpace;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "", "heightPx", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeightPx", "layoutId", "getLayoutId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpace extends DeliveryAdapterItem {
        private final int heightPx;
        private final int layoutId;

        public VerticalSpace(int i11) {
            super(null);
            this.heightPx = i11;
            this.layoutId = R$layout.pdp_item_delivery_vertical_space;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalSpace) && this.heightPx == ((VerticalSpace) other).heightPx;
        }

        public final int getHeightPx() {
            return this.heightPx;
        }

        @Override // ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem
        public int getLayoutId() {
            return this.layoutId;
        }

        public int hashCode() {
            return Integer.hashCode(this.heightPx);
        }

        @NotNull
        public String toString() {
            return E.a(this.heightPx, "VerticalSpace(heightPx=", ")");
        }
    }

    public /* synthetic */ DeliveryAdapterItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getLayoutId();

    private DeliveryAdapterItem() {
    }
}
