package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumIdentityPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumIdentityPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumIdentityPropsDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("tag")
    private final String tag;

    @pmi0("update_tag")
    private final String updateTag;

    /* compiled from: AtumIdentityPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumIdentityPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumIdentityPropsDto createFromParcel(Parcel parcel) {
            return new AtumIdentityPropsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumIdentityPropsDto[] newArray(int i) {
            return new AtumIdentityPropsDto[i];
        }
    }

    public AtumIdentityPropsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumIdentityPropsDto)) {
            return false;
        }
        AtumIdentityPropsDto atumIdentityPropsDto = (AtumIdentityPropsDto) obj;
        return epx.f(this.id, atumIdentityPropsDto.id) && epx.f(this.tag, atumIdentityPropsDto.tag) && epx.f(this.updateTag, atumIdentityPropsDto.updateTag);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updateTag;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumIdentityPropsDto(id=");
        sb.append(this.id);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", updateTag=");
        return ho8.a(sb, this.updateTag, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.tag);
        parcel.writeString(this.updateTag);
    }

    public AtumIdentityPropsDto(Integer num, String str, String str2) {
        this.id = num;
        this.tag = str;
        this.updateTag = str2;
    }

    public /* synthetic */ AtumIdentityPropsDto(Integer num, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
