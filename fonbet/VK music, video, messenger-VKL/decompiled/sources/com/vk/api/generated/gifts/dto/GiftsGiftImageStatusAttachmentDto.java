package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: GiftsGiftImageStatusAttachmentDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftImageStatusAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftImageStatusAttachmentDto> CREATOR = new a();

    @pmi0("pack_id")
    private final int packId;

    @pmi0("status_id")
    private final int statusId;

    @pmi0("url")
    private final String url;

    /* compiled from: GiftsGiftImageStatusAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftImageStatusAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftImageStatusAttachmentDto createFromParcel(Parcel parcel) {
            return new GiftsGiftImageStatusAttachmentDto(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftImageStatusAttachmentDto[] newArray(int i) {
            return new GiftsGiftImageStatusAttachmentDto[i];
        }
    }

    public GiftsGiftImageStatusAttachmentDto(int i, int i2, String str) {
        this.packId = i;
        this.statusId = i2;
        this.url = str;
    }

    public final int d() {
        return this.packId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.statusId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftImageStatusAttachmentDto)) {
            return false;
        }
        GiftsGiftImageStatusAttachmentDto giftsGiftImageStatusAttachmentDto = (GiftsGiftImageStatusAttachmentDto) obj;
        return this.packId == giftsGiftImageStatusAttachmentDto.packId && this.statusId == giftsGiftImageStatusAttachmentDto.statusId && epx.f(this.url, giftsGiftImageStatusAttachmentDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + shy.a(this.statusId, Integer.hashCode(this.packId) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGiftImageStatusAttachmentDto(packId=");
        sb.append(this.packId);
        sb.append(", statusId=");
        sb.append(this.statusId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.packId);
        parcel.writeInt(this.statusId);
        parcel.writeString(this.url);
    }
}
