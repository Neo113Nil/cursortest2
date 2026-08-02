package ru.ozon.app.android.returns.creation.widgets.total.data;

import Ak.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowItemDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/data/HeaderDTO;", "", "totalRow", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "expandRowsItem", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTotalRow", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "getExpandRowsItem", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderDTO {
    public static final int $stable = 8;
    private final CommonControlSettings common;
    private final BalanceRowItemDTO expandRowsItem;
    private final BalanceRowDTO totalRow;

    public HeaderDTO(BalanceRowDTO balanceRowDTO, BalanceRowItemDTO balanceRowItemDTO, CommonControlSettings commonControlSettings) {
        this.totalRow = balanceRowDTO;
        this.expandRowsItem = balanceRowItemDTO;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, BalanceRowDTO balanceRowDTO, BalanceRowItemDTO balanceRowItemDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            balanceRowDTO = headerDTO.totalRow;
        }
        if ((i11 & 2) != 0) {
            balanceRowItemDTO = headerDTO.expandRowsItem;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = headerDTO.common;
        }
        return headerDTO.copy(balanceRowDTO, balanceRowItemDTO, commonControlSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final BalanceRowDTO getTotalRow() {
        return this.totalRow;
    }

    /* renamed from: component2, reason: from getter */
    public final BalanceRowItemDTO getExpandRowsItem() {
        return this.expandRowsItem;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HeaderDTO copy(BalanceRowDTO totalRow, BalanceRowItemDTO expandRowsItem, CommonControlSettings common) {
        return new HeaderDTO(totalRow, expandRowsItem, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.totalRow, headerDTO.totalRow) && Intrinsics.d(this.expandRowsItem, headerDTO.expandRowsItem) && Intrinsics.d(this.common, headerDTO.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final BalanceRowItemDTO getExpandRowsItem() {
        return this.expandRowsItem;
    }

    public final BalanceRowDTO getTotalRow() {
        return this.totalRow;
    }

    public int hashCode() {
        BalanceRowDTO balanceRowDTO = this.totalRow;
        int hashCode = (balanceRowDTO == null ? 0 : balanceRowDTO.hashCode()) * 31;
        BalanceRowItemDTO balanceRowItemDTO = this.expandRowsItem;
        int hashCode2 = (hashCode + (balanceRowItemDTO == null ? 0 : balanceRowItemDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BalanceRowDTO balanceRowDTO = this.totalRow;
        BalanceRowItemDTO balanceRowItemDTO = this.expandRowsItem;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("HeaderDTO(totalRow=");
        sb2.append(balanceRowDTO);
        sb2.append(", expandRowsItem=");
        sb2.append(balanceRowItemDTO);
        sb2.append(", common=");
        return b.g(sb2, commonControlSettings, ")");
    }
}
