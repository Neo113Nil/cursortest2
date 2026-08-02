package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GiftsGiftImageStatusPackAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftImageStatusPackAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftImageStatusPackAttachmentDto> CREATOR = new a();

    @pmi0("pack_id")
    private final int packId;

    @pmi0("url")
    private final String url;

    /* compiled from: GiftsGiftImageStatusPackAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftImageStatusPackAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftImageStatusPackAttachmentDto createFromParcel(Parcel parcel) {
            return new GiftsGiftImageStatusPackAttachmentDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftImageStatusPackAttachmentDto[] newArray(int i) {
            return new GiftsGiftImageStatusPackAttachmentDto[i];
        }
    }

    public GiftsGiftImageStatusPackAttachmentDto(int i, String str) {
        this.packId = i;
        this.url = str;
    }

    public final int d() {
        return this.packId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftImageStatusPackAttachmentDto)) {
            return false;
        }
        GiftsGiftImageStatusPackAttachmentDto giftsGiftImageStatusPackAttachmentDto = (GiftsGiftImageStatusPackAttachmentDto) obj;
        return this.packId == giftsGiftImageStatusPackAttachmentDto.packId && epx.f(this.url, giftsGiftImageStatusPackAttachmentDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + (Integer.hashCode(this.packId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGiftImageStatusPackAttachmentDto(packId=");
        sb.append(this.packId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.packId);
        parcel.writeString(this.url);
    }
}
