package ru.ozon.app.android.cml.delivery.widgets.order.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupDTO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem;", "", "CellListGroup", "SecureDeal", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem$CellListGroup;", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem$SecureDeal;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OrderItem {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem$CellListGroup;", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem;", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;", "dto", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;", "getDto", "()Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellListGroup implements OrderItem {

        @NotNull
        private final CellListGroupDTO dto;

        public CellListGroup(@NotNull CellListGroupDTO dto) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.dto = dto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CellListGroup) && Intrinsics.d(this.dto, ((CellListGroup) other).dto);
        }

        @NotNull
        public final CellListGroupDTO getDto() {
            return this.dto;
        }

        public int hashCode() {
            return this.dto.hashCode();
        }

        @NotNull
        public String toString() {
            return "CellListGroup(dto=" + this.dto + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem$SecureDeal;", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderItem;", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "dto", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "getDto", "()Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SecureDeal implements OrderItem {

        @NotNull
        private final SecureDealMoleculeDTO dto;

        public SecureDeal(@NotNull SecureDealMoleculeDTO dto) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.dto = dto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SecureDeal) && Intrinsics.d(this.dto, ((SecureDeal) other).dto);
        }

        @NotNull
        public final SecureDealMoleculeDTO getDto() {
            return this.dto;
        }

        public int hashCode() {
            return this.dto.hashCode();
        }

        @NotNull
        public String toString() {
            return "SecureDeal(dto=" + this.dto + ")";
        }
    }
}
