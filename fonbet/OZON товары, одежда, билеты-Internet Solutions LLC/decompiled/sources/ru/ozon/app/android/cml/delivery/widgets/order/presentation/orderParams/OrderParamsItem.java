package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupVO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "", "id", "", "getId", "()I", "ParamsGroup", "SecureDeal", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$ParamsGroup;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$SecureDeal;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OrderParamsItem {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$ParamsGroup;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "", "id", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "cellListGroupVO", "<init>", "(ILru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "getCellListGroupVO", "()Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParamsGroup implements OrderParamsItem {

        @NotNull
        private final CellListGroupVO cellListGroupVO;
        private final int id;

        public ParamsGroup(int i11, @NotNull CellListGroupVO cellListGroupVO) {
            Intrinsics.checkNotNullParameter(cellListGroupVO, "cellListGroupVO");
            this.id = i11;
            this.cellListGroupVO = cellListGroupVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParamsGroup)) {
                return false;
            }
            ParamsGroup paramsGroup = (ParamsGroup) other;
            return this.id == paramsGroup.id && Intrinsics.d(this.cellListGroupVO, paramsGroup.cellListGroupVO);
        }

        @NotNull
        public final CellListGroupVO getCellListGroupVO() {
            return this.cellListGroupVO;
        }

        @Override // ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.cellListGroupVO.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "ParamsGroup(id=" + this.id + ", cellListGroupVO=" + this.cellListGroupVO + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$SecureDeal;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "", "id", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "secureDeal", "<init>", "(ILru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "getSecureDeal", "()Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SecureDeal implements OrderParamsItem {
        private final int id;

        @NotNull
        private final SecureDealMoleculeDTO secureDeal;

        public SecureDeal(int i11, @NotNull SecureDealMoleculeDTO secureDeal) {
            Intrinsics.checkNotNullParameter(secureDeal, "secureDeal");
            this.id = i11;
            this.secureDeal = secureDeal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecureDeal)) {
                return false;
            }
            SecureDeal secureDeal = (SecureDeal) other;
            return this.id == secureDeal.id && Intrinsics.d(this.secureDeal, secureDeal.secureDeal);
        }

        @Override // ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final SecureDealMoleculeDTO getSecureDeal() {
            return this.secureDeal;
        }

        public int hashCode() {
            return this.secureDeal.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "SecureDeal(id=" + this.id + ", secureDeal=" + this.secureDeal + ")";
        }
    }

    int getId();
}
