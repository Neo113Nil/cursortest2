package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AtumRepositoryUpdateDataDto.kt */
/* loaded from: classes14.dex */
public final class AtumRepositoryUpdateDataDto implements Parcelable {
    public static final Parcelable.Creator<AtumRepositoryUpdateDataDto> CREATOR = new a();

    @pmi0("id")
    private final AtumRecordIdDto id;

    @pmi0("prop")
    private final String prop;

    @pmi0("value")
    private final Object value;

    /* compiled from: AtumRepositoryUpdateDataDto.kt */
    public static final class a implements Parcelable.Creator<AtumRepositoryUpdateDataDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryUpdateDataDto createFromParcel(Parcel parcel) {
            return new AtumRepositoryUpdateDataDto(AtumRecordIdDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readValue(AtumRepositoryUpdateDataDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryUpdateDataDto[] newArray(int i) {
            return new AtumRepositoryUpdateDataDto[i];
        }
    }

    public AtumRepositoryUpdateDataDto(AtumRecordIdDto atumRecordIdDto, String str, Object obj) {
        this.id = atumRecordIdDto;
        this.prop = str;
        this.value = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumRepositoryUpdateDataDto)) {
            return false;
        }
        AtumRepositoryUpdateDataDto atumRepositoryUpdateDataDto = (AtumRepositoryUpdateDataDto) obj;
        return epx.f(this.id, atumRepositoryUpdateDataDto.id) && epx.f(this.prop, atumRepositoryUpdateDataDto.prop) && epx.f(this.value, atumRepositoryUpdateDataDto.value);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.prop);
        Object obj = this.value;
        return a2 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumRepositoryUpdateDataDto(id=");
        sb.append(this.id);
        sb.append(", prop=");
        sb.append(this.prop);
        sb.append(", value=");
        return k73.c(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.id.writeToParcel(parcel, i);
        parcel.writeString(this.prop);
        parcel.writeValue(this.value);
    }

    public /* synthetic */ AtumRepositoryUpdateDataDto(AtumRecordIdDto atumRecordIdDto, String str, Object obj, int i, zcl zclVar) {
        this(atumRecordIdDto, str, (i & 4) != 0 ? null : obj);
    }
}
