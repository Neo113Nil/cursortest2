package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: SpacesCreateSectionResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCreateSectionResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCreateSectionResponseDto> CREATOR = new a();

    @pmi0("entity_version")
    private final int entityVersion;

    @pmi0(X3.i.L)
    private final String position;

    @pmi0("section_id")
    private final long sectionId;

    /* compiled from: SpacesCreateSectionResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCreateSectionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCreateSectionResponseDto createFromParcel(Parcel parcel) {
            return new SpacesCreateSectionResponseDto(parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCreateSectionResponseDto[] newArray(int i) {
            return new SpacesCreateSectionResponseDto[i];
        }
    }

    public SpacesCreateSectionResponseDto(long j, String str, int i) {
        this.sectionId = j;
        this.position = str;
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
        if (!(obj instanceof SpacesCreateSectionResponseDto)) {
            return false;
        }
        SpacesCreateSectionResponseDto spacesCreateSectionResponseDto = (SpacesCreateSectionResponseDto) obj;
        return this.sectionId == spacesCreateSectionResponseDto.sectionId && epx.f(this.position, spacesCreateSectionResponseDto.position) && this.entityVersion == spacesCreateSectionResponseDto.entityVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.entityVersion) + urd0.a(Long.hashCode(this.sectionId) * 31, 31, this.position);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesCreateSectionResponseDto(sectionId=");
        sb.append(this.sectionId);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", entityVersion=");
        return vu5.b(sb, this.entityVersion, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.sectionId);
        parcel.writeString(this.position);
        parcel.writeInt(this.entityVersion);
    }
}
