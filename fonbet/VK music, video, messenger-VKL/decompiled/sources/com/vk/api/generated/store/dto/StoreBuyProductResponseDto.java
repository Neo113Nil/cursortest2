package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.stickers.dto.StickersBonusResultDto;
import com.vk.api.generated.stickers.dto.StickersRandomSelectorResultDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreBuyProductResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreBuyProductResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreBuyProductResponseDto> CREATOR = new a();

    @pmi0("confirmation")
    private final StoreBuyProductConfirmationDto confirmation;

    @pmi0("product")
    private final StoreProductDto product;

    @pmi0("products")
    private final List<StoreProductDto> products;

    @pmi0("random_selector_result")
    private final StickersRandomSelectorResultDto randomSelectorResult;

    @pmi0("stickers_bonus")
    private final StickersBonusResultDto stickersBonus;

    @pmi0("success")
    private final BaseBoolIntDto success;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    @pmi0("withdrawn_votes")
    private final Integer withdrawnVotes;

    /* compiled from: StoreBuyProductResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreBuyProductResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreBuyProductResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            StoreBuyProductConfirmationDto createFromParcel = parcel.readInt() == 0 ? null : StoreBuyProductConfirmationDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(StoreBuyProductResponseDto.class.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            StoreProductDto createFromParcel2 = parcel.readInt() == 0 ? null : StoreProductDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(StoreProductDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new StoreBuyProductResponseDto(createFromParcel, baseBoolIntDto, valueOf, arrayList, createFromParcel2, arrayList2, parcel.readInt() == 0 ? null : StickersRandomSelectorResultDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StickersBonusResultDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreBuyProductResponseDto[] newArray(int i) {
            return new StoreBuyProductResponseDto[i];
        }
    }

    public StoreBuyProductResponseDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreBuyProductResponseDto)) {
            return false;
        }
        StoreBuyProductResponseDto storeBuyProductResponseDto = (StoreBuyProductResponseDto) obj;
        return epx.f(this.confirmation, storeBuyProductResponseDto.confirmation) && this.success == storeBuyProductResponseDto.success && epx.f(this.withdrawnVotes, storeBuyProductResponseDto.withdrawnVotes) && epx.f(this.userIds, storeBuyProductResponseDto.userIds) && epx.f(this.product, storeBuyProductResponseDto.product) && epx.f(this.products, storeBuyProductResponseDto.products) && epx.f(this.randomSelectorResult, storeBuyProductResponseDto.randomSelectorResult) && epx.f(this.stickersBonus, storeBuyProductResponseDto.stickersBonus);
    }

    public final int hashCode() {
        StoreBuyProductConfirmationDto storeBuyProductConfirmationDto = this.confirmation;
        int hashCode = (storeBuyProductConfirmationDto == null ? 0 : storeBuyProductConfirmationDto.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.success;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.withdrawnVotes;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.userIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        StoreProductDto storeProductDto = this.product;
        int hashCode5 = (hashCode4 + (storeProductDto == null ? 0 : storeProductDto.hashCode())) * 31;
        List<StoreProductDto> list2 = this.products;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        StickersRandomSelectorResultDto stickersRandomSelectorResultDto = this.randomSelectorResult;
        int hashCode7 = (hashCode6 + (stickersRandomSelectorResultDto == null ? 0 : stickersRandomSelectorResultDto.hashCode())) * 31;
        StickersBonusResultDto stickersBonusResultDto = this.stickersBonus;
        return hashCode7 + (stickersBonusResultDto != null ? stickersBonusResultDto.hashCode() : 0);
    }

    public final String toString() {
        return "StoreBuyProductResponseDto(confirmation=" + this.confirmation + ", success=" + this.success + ", withdrawnVotes=" + this.withdrawnVotes + ", userIds=" + this.userIds + ", product=" + this.product + ", products=" + this.products + ", randomSelectorResult=" + this.randomSelectorResult + ", stickersBonus=" + this.stickersBonus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StoreBuyProductConfirmationDto storeBuyProductConfirmationDto = this.confirmation;
        if (storeBuyProductConfirmationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeBuyProductConfirmationDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.success, i);
        Integer num = this.withdrawnVotes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list = this.userIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        StoreProductDto storeProductDto = this.product;
        if (storeProductDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeProductDto.writeToParcel(parcel, i);
        }
        List<StoreProductDto> list2 = this.products;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((StoreProductDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        StickersRandomSelectorResultDto stickersRandomSelectorResultDto = this.randomSelectorResult;
        if (stickersRandomSelectorResultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersRandomSelectorResultDto.writeToParcel(parcel, i);
        }
        StickersBonusResultDto stickersBonusResultDto = this.stickersBonus;
        if (stickersBonusResultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersBonusResultDto.writeToParcel(parcel, i);
        }
    }

    public StoreBuyProductResponseDto(StoreBuyProductConfirmationDto storeBuyProductConfirmationDto, BaseBoolIntDto baseBoolIntDto, Integer num, List<Integer> list, StoreProductDto storeProductDto, List<StoreProductDto> list2, StickersRandomSelectorResultDto stickersRandomSelectorResultDto, StickersBonusResultDto stickersBonusResultDto) {
        this.confirmation = storeBuyProductConfirmationDto;
        this.success = baseBoolIntDto;
        this.withdrawnVotes = num;
        this.userIds = list;
        this.product = storeProductDto;
        this.products = list2;
        this.randomSelectorResult = stickersRandomSelectorResultDto;
        this.stickersBonus = stickersBonusResultDto;
    }

    public /* synthetic */ StoreBuyProductResponseDto(StoreBuyProductConfirmationDto storeBuyProductConfirmationDto, BaseBoolIntDto baseBoolIntDto, Integer num, List list, StoreProductDto storeProductDto, List list2, StickersRandomSelectorResultDto stickersRandomSelectorResultDto, StickersBonusResultDto stickersBonusResultDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : storeBuyProductConfirmationDto, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : storeProductDto, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : stickersRandomSelectorResultDto, (i & 128) != 0 ? null : stickersBonusResultDto);
    }
}
