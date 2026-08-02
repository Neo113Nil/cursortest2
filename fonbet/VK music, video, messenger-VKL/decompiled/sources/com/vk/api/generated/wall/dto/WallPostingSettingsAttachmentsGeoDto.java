package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallPostingSettingsAttachmentsGeoDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsAttachmentsGeoDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsAttachmentsGeoDto> CREATOR = new a();

    @pmi0("shortening_length")
    private final int shorteningLength;

    /* compiled from: WallPostingSettingsAttachmentsGeoDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsAttachmentsGeoDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsAttachmentsGeoDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsAttachmentsGeoDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsAttachmentsGeoDto[] newArray(int i) {
            return new WallPostingSettingsAttachmentsGeoDto[i];
        }
    }

    public WallPostingSettingsAttachmentsGeoDto(int i) {
        this.shorteningLength = i;
    }

    public final int d() {
        return this.shorteningLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPostingSettingsAttachmentsGeoDto) && this.shorteningLength == ((WallPostingSettingsAttachmentsGeoDto) obj).shorteningLength;
    }

    public final int hashCode() {
        return Integer.hashCode(this.shorteningLength);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallPostingSettingsAttachmentsGeoDto(shorteningLength="), this.shorteningLength, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.shorteningLength);
    }
}
