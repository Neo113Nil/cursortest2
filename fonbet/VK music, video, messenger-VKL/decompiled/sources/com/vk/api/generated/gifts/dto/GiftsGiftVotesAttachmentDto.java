package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: GiftsGiftVotesAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftVotesAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftVotesAttachmentDto> CREATOR = new a();

    @pmi0("amount")
    private final int amount;

    @pmi0("image")
    private final GiftsImageDto image;

    /* compiled from: GiftsGiftVotesAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftVotesAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftVotesAttachmentDto createFromParcel(Parcel parcel) {
            return new GiftsGiftVotesAttachmentDto(parcel.readInt(), GiftsImageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftVotesAttachmentDto[] newArray(int i) {
            return new GiftsGiftVotesAttachmentDto[i];
        }
    }

    public GiftsGiftVotesAttachmentDto(int i, GiftsImageDto giftsImageDto) {
        this.amount = i;
        this.image = giftsImageDto;
    }

    public final int d() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GiftsImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftVotesAttachmentDto)) {
            return false;
        }
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = (GiftsGiftVotesAttachmentDto) obj;
        return this.amount == giftsGiftVotesAttachmentDto.amount && epx.f(this.image, giftsGiftVotesAttachmentDto.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + (Integer.hashCode(this.amount) * 31);
    }

    public final String toString() {
        return "GiftsGiftVotesAttachmentDto(amount=" + this.amount + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.amount);
        this.image.writeToParcel(parcel, i);
    }
}
