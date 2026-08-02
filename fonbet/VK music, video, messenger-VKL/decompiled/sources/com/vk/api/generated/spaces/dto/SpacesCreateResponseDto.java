package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: SpacesCreateResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCreateResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCreateResponseDto> CREATOR = new a();

    @pmi0("entity_version")
    private final int entityVersion;

    @pmi0("id")
    private final long id;

    /* compiled from: SpacesCreateResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCreateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCreateResponseDto createFromParcel(Parcel parcel) {
            return new SpacesCreateResponseDto(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCreateResponseDto[] newArray(int i) {
            return new SpacesCreateResponseDto[i];
        }
    }

    public SpacesCreateResponseDto(long j, int i) {
        this.id = j;
        this.entityVersion = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesCreateResponseDto)) {
            return false;
        }
        SpacesCreateResponseDto spacesCreateResponseDto = (SpacesCreateResponseDto) obj;
        return this.id == spacesCreateResponseDto.id && this.entityVersion == spacesCreateResponseDto.entityVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.entityVersion) + (Long.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesCreateResponseDto(id=");
        sb.append(this.id);
        sb.append(", entityVersion=");
        return vu5.b(sb, this.entityVersion, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.entityVersion);
    }
}
