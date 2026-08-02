package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StickersRandomSelectorOptionsDto.kt */
/* loaded from: classes15.dex */
public final class StickersRandomSelectorOptionsDto implements Parcelable {
    public static final Parcelable.Creator<StickersRandomSelectorOptionsDto> CREATOR = new a();

    @pmi0("animation_url")
    private final String animationUrl;

    @pmi0("balance")
    private final Integer balance;

    @pmi0("free_attempts_count")
    private final Integer freeAttemptsCount;

    @pmi0("gift_price")
    private final Integer giftPrice;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_gifting_enabled")
    private final Boolean isGiftingEnabled;

    @pmi0("packs")
    private final StickersPacksChunkDto packs;

    @pmi0("probability_note")
    private final String probabilityNote;

    @pmi0("reason")
    private final String reason;

    @pmi0("stock_item")
    private final StoreStockItemDto stockItem;

    /* compiled from: StickersRandomSelectorOptionsDto.kt */
    public static final class a implements Parcelable.Creator<StickersRandomSelectorOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersRandomSelectorOptionsDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString = parcel.readString();
            StoreStockItemDto createFromParcel = parcel.readInt() == 0 ? null : StoreStockItemDto.CREATOR.createFromParcel(parcel);
            boolean z3 = z2;
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            StickersPacksChunkDto createFromParcel2 = parcel.readInt() == 0 ? null : StickersPacksChunkDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() == 0 ? z3 : true);
            }
            return new StickersRandomSelectorOptionsDto(z, readString, createFromParcel, readString2, valueOf2, createFromParcel2, readString3, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersRandomSelectorOptionsDto[] newArray(int i) {
            return new StickersRandomSelectorOptionsDto[i];
        }
    }

    public StickersRandomSelectorOptionsDto(boolean z, String str, StoreStockItemDto storeStockItemDto, String str2, Integer num, StickersPacksChunkDto stickersPacksChunkDto, String str3, Boolean bool, Integer num2, Integer num3) {
        this.isEnabled = z;
        this.reason = str;
        this.stockItem = storeStockItemDto;
        this.probabilityNote = str2;
        this.balance = num;
        this.packs = stickersPacksChunkDto;
        this.animationUrl = str3;
        this.isGiftingEnabled = bool;
        this.freeAttemptsCount = num2;
        this.giftPrice = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersRandomSelectorOptionsDto)) {
            return false;
        }
        StickersRandomSelectorOptionsDto stickersRandomSelectorOptionsDto = (StickersRandomSelectorOptionsDto) obj;
        return this.isEnabled == stickersRandomSelectorOptionsDto.isEnabled && epx.f(this.reason, stickersRandomSelectorOptionsDto.reason) && epx.f(this.stockItem, stickersRandomSelectorOptionsDto.stockItem) && epx.f(this.probabilityNote, stickersRandomSelectorOptionsDto.probabilityNote) && epx.f(this.balance, stickersRandomSelectorOptionsDto.balance) && epx.f(this.packs, stickersRandomSelectorOptionsDto.packs) && epx.f(this.animationUrl, stickersRandomSelectorOptionsDto.animationUrl) && epx.f(this.isGiftingEnabled, stickersRandomSelectorOptionsDto.isGiftingEnabled) && epx.f(this.freeAttemptsCount, stickersRandomSelectorOptionsDto.freeAttemptsCount) && epx.f(this.giftPrice, stickersRandomSelectorOptionsDto.giftPrice);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.reason;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StoreStockItemDto storeStockItemDto = this.stockItem;
        int hashCode3 = (hashCode2 + (storeStockItemDto == null ? 0 : storeStockItemDto.hashCode())) * 31;
        String str2 = this.probabilityNote;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.balance;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        StickersPacksChunkDto stickersPacksChunkDto = this.packs;
        int hashCode6 = (hashCode5 + (stickersPacksChunkDto == null ? 0 : stickersPacksChunkDto.hashCode())) * 31;
        String str3 = this.animationUrl;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isGiftingEnabled;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.freeAttemptsCount;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.giftPrice;
        return hashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersRandomSelectorOptionsDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", stockItem=");
        sb.append(this.stockItem);
        sb.append(", probabilityNote=");
        sb.append(this.probabilityNote);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", packs=");
        sb.append(this.packs);
        sb.append(", animationUrl=");
        sb.append(this.animationUrl);
        sb.append(", isGiftingEnabled=");
        sb.append(this.isGiftingEnabled);
        sb.append(", freeAttemptsCount=");
        sb.append(this.freeAttemptsCount);
        sb.append(", giftPrice=");
        return uqi.b(sb, this.giftPrice, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.reason);
        StoreStockItemDto storeStockItemDto = this.stockItem;
        if (storeStockItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.probabilityNote);
        Integer num = this.balance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        StickersPacksChunkDto stickersPacksChunkDto = this.packs;
        if (stickersPacksChunkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersPacksChunkDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.animationUrl);
        Boolean bool = this.isGiftingEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num2 = this.freeAttemptsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.giftPrice;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ StickersRandomSelectorOptionsDto(boolean z, String str, StoreStockItemDto storeStockItemDto, String str2, Integer num, StickersPacksChunkDto stickersPacksChunkDto, String str3, Boolean bool, Integer num2, Integer num3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : storeStockItemDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : stickersPacksChunkDto, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3);
    }
}
