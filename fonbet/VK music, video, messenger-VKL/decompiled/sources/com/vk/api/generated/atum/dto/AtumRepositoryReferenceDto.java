package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumRepositoryReferenceDto.kt */
/* loaded from: classes14.dex */
public final class AtumRepositoryReferenceDto implements Parcelable {
    public static final Parcelable.Creator<AtumRepositoryReferenceDto> CREATOR = new a();

    @pmi0("dsl")
    private final AtumRepositoryDslReferenceDto dsl;

    @pmi0("object_ref")
    private final AtumRepositoryObjectReferenceDto objectRef;

    /* compiled from: AtumRepositoryReferenceDto.kt */
    public static final class a implements Parcelable.Creator<AtumRepositoryReferenceDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryReferenceDto createFromParcel(Parcel parcel) {
            return new AtumRepositoryReferenceDto(parcel.readInt() == 0 ? null : AtumRepositoryDslReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumRepositoryObjectReferenceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryReferenceDto[] newArray(int i) {
            return new AtumRepositoryReferenceDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumRepositoryReferenceDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumRepositoryReferenceDto)) {
            return false;
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = (AtumRepositoryReferenceDto) obj;
        return epx.f(this.dsl, atumRepositoryReferenceDto.dsl) && epx.f(this.objectRef, atumRepositoryReferenceDto.objectRef);
    }

    public final int hashCode() {
        AtumRepositoryDslReferenceDto atumRepositoryDslReferenceDto = this.dsl;
        int hashCode = (atumRepositoryDslReferenceDto == null ? 0 : atumRepositoryDslReferenceDto.hashCode()) * 31;
        AtumRepositoryObjectReferenceDto atumRepositoryObjectReferenceDto = this.objectRef;
        return hashCode + (atumRepositoryObjectReferenceDto != null ? atumRepositoryObjectReferenceDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumRepositoryReferenceDto(dsl=" + this.dsl + ", objectRef=" + this.objectRef + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumRepositoryDslReferenceDto atumRepositoryDslReferenceDto = this.dsl;
        if (atumRepositoryDslReferenceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryDslReferenceDto.writeToParcel(parcel, i);
        }
        AtumRepositoryObjectReferenceDto atumRepositoryObjectReferenceDto = this.objectRef;
        if (atumRepositoryObjectReferenceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryObjectReferenceDto.writeToParcel(parcel, i);
        }
    }

    public AtumRepositoryReferenceDto(AtumRepositoryDslReferenceDto atumRepositoryDslReferenceDto, AtumRepositoryObjectReferenceDto atumRepositoryObjectReferenceDto) {
        this.dsl = atumRepositoryDslReferenceDto;
        this.objectRef = atumRepositoryObjectReferenceDto;
    }

    public /* synthetic */ AtumRepositoryReferenceDto(AtumRepositoryDslReferenceDto atumRepositoryDslReferenceDto, AtumRepositoryObjectReferenceDto atumRepositoryObjectReferenceDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumRepositoryDslReferenceDto, (i & 2) != 0 ? null : atumRepositoryObjectReferenceDto);
    }
}
