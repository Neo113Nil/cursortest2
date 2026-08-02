package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection;", "", "<init>", "()V", "Variant", "AtomCell", "Pickup", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$AtomCell;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$Variant;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DeliverySection {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$AtomCell;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection;", "Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AtomCell extends DeliverySection {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO cell;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AtomCell(@NotNull AtomDTO cell) {
            super(null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AtomCell) && Intrinsics.d(this.cell, ((AtomCell) other).cell);
        }

        @NotNull
        public final AtomDTO getCell() {
            return this.cell;
        }

        public int hashCode() {
            return this.cell.hashCode();
        }

        @NotNull
        public String toString() {
            return "AtomCell(cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "pickupButton", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "getPickupButton", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pickup extends DeliverySection {

        @NotNull
        private final PickupButtonWrapper pickupButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pickup(@NotNull PickupButtonWrapper pickupButton) {
            super(null);
            Intrinsics.checkNotNullParameter(pickupButton, "pickupButton");
            this.pickupButton = pickupButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pickup) && Intrinsics.d(this.pickupButton, ((Pickup) other).pickupButton);
        }

        @NotNull
        public final PickupButtonWrapper getPickupButton() {
            return this.pickupButton;
        }

        public int hashCode() {
            return this.pickupButton.hashCode();
        }

        @NotNull
        public String toString() {
            return "Pickup(pickupButton=" + this.pickupButton + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$Variant;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryVariantVO;", "variant", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryVariantVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryVariantVO;", "getVariant", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryVariantVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Variant extends DeliverySection {

        @NotNull
        private final DeliveryVariantVO variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Variant(@NotNull DeliveryVariantVO variant) {
            super(null);
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.variant = variant;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Variant) && Intrinsics.d(this.variant, ((Variant) other).variant);
        }

        @NotNull
        public final DeliveryVariantVO getVariant() {
            return this.variant;
        }

        public int hashCode() {
            return this.variant.hashCode();
        }

        @NotNull
        public String toString() {
            return "Variant(variant=" + this.variant + ")";
        }
    }

    public /* synthetic */ DeliverySection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeliverySection() {
    }
}
