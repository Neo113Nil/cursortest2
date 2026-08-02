package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AtumRepositoryDslReferenceObjectDto.kt */
/* loaded from: classes14.dex */
public final class AtumRepositoryDslReferenceObjectDto implements Parcelable {
    public static final Parcelable.Creator<AtumRepositoryDslReferenceObjectDto> CREATOR = new a();

    @pmi0("as_name")
    private final String asName;

    @pmi0("record_id")
    private final AtumRecordIdDto recordId;

    /* compiled from: AtumRepositoryDslReferenceObjectDto.kt */
    public static final class a implements Parcelable.Creator<AtumRepositoryDslReferenceObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryDslReferenceObjectDto createFromParcel(Parcel parcel) {
            return new AtumRepositoryDslReferenceObjectDto(AtumRecordIdDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryDslReferenceObjectDto[] newArray(int i) {
            return new AtumRepositoryDslReferenceObjectDto[i];
        }
    }

    public AtumRepositoryDslReferenceObjectDto(AtumRecordIdDto atumRecordIdDto, String str) {
        this.recordId = atumRecordIdDto;
        this.asName = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumRepositoryDslReferenceObjectDto)) {
            return false;
        }
        AtumRepositoryDslReferenceObjectDto atumRepositoryDslReferenceObjectDto = (AtumRepositoryDslReferenceObjectDto) obj;
        return epx.f(this.recordId, atumRepositoryDslReferenceObjectDto.recordId) && epx.f(this.asName, atumRepositoryDslReferenceObjectDto.asName);
    }

    public final int hashCode() {
        return this.asName.hashCode() + (this.recordId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumRepositoryDslReferenceObjectDto(recordId=");
        sb.append(this.recordId);
        sb.append(", asName=");
        return ho8.a(sb, this.asName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.recordId.writeToParcel(parcel, i);
        parcel.writeString(this.asName);
    }
}
