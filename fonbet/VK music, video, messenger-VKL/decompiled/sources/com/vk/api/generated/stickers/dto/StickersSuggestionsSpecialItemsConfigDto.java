package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersSuggestionsSpecialItemsConfigDto.kt */
/* loaded from: classes15.dex */
public final class StickersSuggestionsSpecialItemsConfigDto implements Parcelable {
    public static final Parcelable.Creator<StickersSuggestionsSpecialItemsConfigDto> CREATOR = new a();

    @pmi0("gift")
    private final StickersSuggestionsSpecialItemsGiftConfigDto gift;

    /* compiled from: StickersSuggestionsSpecialItemsConfigDto.kt */
    public static final class a implements Parcelable.Creator<StickersSuggestionsSpecialItemsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsSpecialItemsConfigDto createFromParcel(Parcel parcel) {
            return new StickersSuggestionsSpecialItemsConfigDto(parcel.readInt() == 0 ? null : StickersSuggestionsSpecialItemsGiftConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSuggestionsSpecialItemsConfigDto[] newArray(int i) {
            return new StickersSuggestionsSpecialItemsConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersSuggestionsSpecialItemsConfigDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final StickersSuggestionsSpecialItemsGiftConfigDto d() {
        return this.gift;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersSuggestionsSpecialItemsConfigDto) && epx.f(this.gift, ((StickersSuggestionsSpecialItemsConfigDto) obj).gift);
    }

    public final int hashCode() {
        StickersSuggestionsSpecialItemsGiftConfigDto stickersSuggestionsSpecialItemsGiftConfigDto = this.gift;
        if (stickersSuggestionsSpecialItemsGiftConfigDto == null) {
            return 0;
        }
        return stickersSuggestionsSpecialItemsGiftConfigDto.hashCode();
    }

    public final String toString() {
        return "StickersSuggestionsSpecialItemsConfigDto(gift=" + this.gift + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StickersSuggestionsSpecialItemsGiftConfigDto stickersSuggestionsSpecialItemsGiftConfigDto = this.gift;
        if (stickersSuggestionsSpecialItemsGiftConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersSuggestionsSpecialItemsGiftConfigDto.writeToParcel(parcel, i);
        }
    }

    public StickersSuggestionsSpecialItemsConfigDto(StickersSuggestionsSpecialItemsGiftConfigDto stickersSuggestionsSpecialItemsGiftConfigDto) {
        this.gift = stickersSuggestionsSpecialItemsGiftConfigDto;
    }

    public /* synthetic */ StickersSuggestionsSpecialItemsConfigDto(StickersSuggestionsSpecialItemsGiftConfigDto stickersSuggestionsSpecialItemsGiftConfigDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stickersSuggestionsSpecialItemsGiftConfigDto);
    }
}
