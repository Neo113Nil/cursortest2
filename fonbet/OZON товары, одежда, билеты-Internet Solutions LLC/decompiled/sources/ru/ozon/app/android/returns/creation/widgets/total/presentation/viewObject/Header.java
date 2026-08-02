package ru.ozon.app.android.returns.creation.widgets.total.presentation.viewObject;

import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/Header;", "", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "totalRow", "expandRow", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "getTotalRow", "()Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "getExpandRow", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Header {
    private final CommonControlSettings common;
    private final BalanceRow expandRow;
    private final BalanceRow totalRow;

    public Header(BalanceRow balanceRow, BalanceRow balanceRow2, CommonControlSettings commonControlSettings) {
        this.totalRow = balanceRow;
        this.expandRow = balanceRow2;
        this.common = commonControlSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.d(this.totalRow, header.totalRow) && Intrinsics.d(this.expandRow, header.expandRow) && Intrinsics.d(this.common, header.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final BalanceRow getExpandRow() {
        return this.expandRow;
    }

    public final BalanceRow getTotalRow() {
        return this.totalRow;
    }

    public int hashCode() {
        BalanceRow balanceRow = this.totalRow;
        int hashCode = (balanceRow == null ? 0 : balanceRow.hashCode()) * 31;
        BalanceRow balanceRow2 = this.expandRow;
        int hashCode2 = (hashCode + (balanceRow2 == null ? 0 : balanceRow2.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BalanceRow balanceRow = this.totalRow;
        BalanceRow balanceRow2 = this.expandRow;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("Header(totalRow=");
        sb2.append(balanceRow);
        sb2.append(", expandRow=");
        sb2.append(balanceRow2);
        sb2.append(", common=");
        return b.g(sb2, commonControlSettings, ")");
    }
}
