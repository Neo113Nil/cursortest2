package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AtumRecordIdDto.kt */
/* loaded from: classes14.dex */
public final class AtumRecordIdDto implements Parcelable {
    public static final Parcelable.Creator<AtumRecordIdDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("type")
    private final String type;

    /* compiled from: AtumRecordIdDto.kt */
    public static final class a implements Parcelable.Creator<AtumRecordIdDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRecordIdDto createFromParcel(Parcel parcel) {
            return new AtumRecordIdDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRecordIdDto[] newArray(int i) {
            return new AtumRecordIdDto[i];
        }
    }

    public AtumRecordIdDto(String str, String str2) {
        this.type = str;
        this.id = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumRecordIdDto)) {
            return false;
        }
        AtumRecordIdDto atumRecordIdDto = (AtumRecordIdDto) obj;
        return epx.f(this.type, atumRecordIdDto.type) && epx.f(this.id, atumRecordIdDto.id);
    }

    public final int hashCode() {
        return this.id.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumRecordIdDto(type=");
        sb.append(this.type);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.id);
    }
}
