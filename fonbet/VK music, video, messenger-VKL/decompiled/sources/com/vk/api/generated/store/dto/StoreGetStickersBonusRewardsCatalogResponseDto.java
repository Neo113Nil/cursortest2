package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersBonusBalanceDto;
import com.vk.api.generated.stickers.dto.StickersBonusRewardDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StoreGetStickersBonusRewardsCatalogResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickersBonusRewardsCatalogResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickersBonusRewardsCatalogResponseDto> CREATOR = new a();

    @pmi0("balance")
    private final StickersBonusBalanceDto balance;

    @pmi0("has_inactive_user_discounts")
    private final Boolean hasInactiveUserDiscounts;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("rewards")
    private final List<StickersBonusRewardDto> rewards;

    @pmi0("user_discounts")
    private final StoreStockItemDiscountsDto userDiscounts;

    /* compiled from: StoreGetStickersBonusRewardsCatalogResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickersBonusRewardsCatalogResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersBonusRewardsCatalogResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StickersBonusRewardDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            StickersBonusBalanceDto createFromParcel = parcel.readInt() == 0 ? null : StickersBonusBalanceDto.CREATOR.createFromParcel(parcel);
            StoreStockItemDiscountsDto createFromParcel2 = parcel.readInt() == 0 ? null : StoreStockItemDiscountsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoreGetStickersBonusRewardsCatalogResponseDto(valueOf, arrayList, createFromParcel, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersBonusRewardsCatalogResponseDto[] newArray(int i) {
            return new StoreGetStickersBonusRewardsCatalogResponseDto[i];
        }
    }

    public StoreGetStickersBonusRewardsCatalogResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final StickersBonusBalanceDto d() {
        return this.balance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hasInactiveUserDiscounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetStickersBonusRewardsCatalogResponseDto)) {
            return false;
        }
        StoreGetStickersBonusRewardsCatalogResponseDto storeGetStickersBonusRewardsCatalogResponseDto = (StoreGetStickersBonusRewardsCatalogResponseDto) obj;
        return epx.f(this.isEnabled, storeGetStickersBonusRewardsCatalogResponseDto.isEnabled) && epx.f(this.rewards, storeGetStickersBonusRewardsCatalogResponseDto.rewards) && epx.f(this.balance, storeGetStickersBonusRewardsCatalogResponseDto.balance) && epx.f(this.userDiscounts, storeGetStickersBonusRewardsCatalogResponseDto.userDiscounts) && epx.f(this.hasInactiveUserDiscounts, storeGetStickersBonusRewardsCatalogResponseDto.hasInactiveUserDiscounts);
    }

    public final List<StickersBonusRewardDto> f() {
        return this.rewards;
    }

    public final StoreStockItemDiscountsDto g() {
        return this.userDiscounts;
    }

    public final int hashCode() {
        Boolean bool = this.isEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<StickersBonusRewardDto> list = this.rewards;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        StickersBonusBalanceDto stickersBonusBalanceDto = this.balance;
        int hashCode3 = (hashCode2 + (stickersBonusBalanceDto == null ? 0 : stickersBonusBalanceDto.hashCode())) * 31;
        StoreStockItemDiscountsDto storeStockItemDiscountsDto = this.userDiscounts;
        int hashCode4 = (hashCode3 + (storeStockItemDiscountsDto == null ? 0 : storeStockItemDiscountsDto.hashCode())) * 31;
        Boolean bool2 = this.hasInactiveUserDiscounts;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isEnabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreGetStickersBonusRewardsCatalogResponseDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", rewards=");
        sb.append(this.rewards);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", userDiscounts=");
        sb.append(this.userDiscounts);
        sb.append(", hasInactiveUserDiscounts=");
        return tn.a(sb, this.hasInactiveUserDiscounts, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<StickersBonusRewardDto> list = this.rewards;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StickersBonusRewardDto) f.next()).writeToParcel(parcel, i);
            }
        }
        StickersBonusBalanceDto stickersBonusBalanceDto = this.balance;
        if (stickersBonusBalanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersBonusBalanceDto.writeToParcel(parcel, i);
        }
        StoreStockItemDiscountsDto storeStockItemDiscountsDto = this.userDiscounts;
        if (storeStockItemDiscountsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemDiscountsDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.hasInactiveUserDiscounts;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public StoreGetStickersBonusRewardsCatalogResponseDto(Boolean bool, List<StickersBonusRewardDto> list, StickersBonusBalanceDto stickersBonusBalanceDto, StoreStockItemDiscountsDto storeStockItemDiscountsDto, Boolean bool2) {
        this.isEnabled = bool;
        this.rewards = list;
        this.balance = stickersBonusBalanceDto;
        this.userDiscounts = storeStockItemDiscountsDto;
        this.hasInactiveUserDiscounts = bool2;
    }

    public /* synthetic */ StoreGetStickersBonusRewardsCatalogResponseDto(Boolean bool, List list, StickersBonusBalanceDto stickersBonusBalanceDto, StoreStockItemDiscountsDto storeStockItemDiscountsDto, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : stickersBonusBalanceDto, (i & 8) != 0 ? null : storeStockItemDiscountsDto, (i & 16) != 0 ? null : bool2);
    }
}
