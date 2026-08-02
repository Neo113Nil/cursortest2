package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersBonusRewardTermsDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoreGetStickersBonusRewardTermsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStickersBonusRewardTermsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoreGetStickersBonusRewardTermsResponseDto> CREATOR = new a();

    @pmi0("terms")
    private final StickersBonusRewardTermsDto terms;

    /* compiled from: StoreGetStickersBonusRewardTermsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStickersBonusRewardTermsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersBonusRewardTermsResponseDto createFromParcel(Parcel parcel) {
            return new StoreGetStickersBonusRewardTermsResponseDto(StickersBonusRewardTermsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStickersBonusRewardTermsResponseDto[] newArray(int i) {
            return new StoreGetStickersBonusRewardTermsResponseDto[i];
        }
    }

    public StoreGetStickersBonusRewardTermsResponseDto(StickersBonusRewardTermsDto stickersBonusRewardTermsDto) {
        this.terms = stickersBonusRewardTermsDto;
    }

    public final StickersBonusRewardTermsDto d() {
        return this.terms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreGetStickersBonusRewardTermsResponseDto) && epx.f(this.terms, ((StoreGetStickersBonusRewardTermsResponseDto) obj).terms);
    }

    public final int hashCode() {
        return this.terms.hashCode();
    }

    public final String toString() {
        return "StoreGetStickersBonusRewardTermsResponseDto(terms=" + this.terms + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.terms.writeToParcel(parcel, i);
    }
}
