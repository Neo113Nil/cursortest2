package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AtumStyledColorDto.kt */
/* loaded from: classes14.dex */
public final class AtumStyledColorDto implements Parcelable {
    public static final Parcelable.Creator<AtumStyledColorDto> CREATOR = new a();

    @pmi0("dark")
    private final Integer dark;

    @pmi0("light")
    private final Integer light;

    @pmi0("name")
    private final String name;

    /* compiled from: AtumStyledColorDto.kt */
    public static final class a implements Parcelable.Creator<AtumStyledColorDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumStyledColorDto createFromParcel(Parcel parcel) {
            return new AtumStyledColorDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumStyledColorDto[] newArray(int i) {
            return new AtumStyledColorDto[i];
        }
    }

    public AtumStyledColorDto() {
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
        if (!(obj instanceof AtumStyledColorDto)) {
            return false;
        }
        AtumStyledColorDto atumStyledColorDto = (AtumStyledColorDto) obj;
        return epx.f(this.name, atumStyledColorDto.name) && epx.f(this.light, atumStyledColorDto.light) && epx.f(this.dark, atumStyledColorDto.dark);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.light;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dark;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumStyledColorDto(name=");
        sb.append(this.name);
        sb.append(", light=");
        sb.append(this.light);
        sb.append(", dark=");
        return uqi.b(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Integer num = this.light;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.dark;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AtumStyledColorDto(String str, Integer num, Integer num2) {
        this.name = str;
        this.light = num;
        this.dark = num2;
    }

    public /* synthetic */ AtumStyledColorDto(String str, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
