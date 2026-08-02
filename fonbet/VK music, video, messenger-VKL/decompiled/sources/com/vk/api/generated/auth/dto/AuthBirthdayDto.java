package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthBirthdayDto.kt */
/* loaded from: classes14.dex */
public final class AuthBirthdayDto implements Parcelable {
    public static final Parcelable.Creator<AuthBirthdayDto> CREATOR = new a();

    @pmi0("day")
    private final Integer day;

    @pmi0("month")
    private final Integer month;

    @pmi0("year")
    private final Integer year;

    /* compiled from: AuthBirthdayDto.kt */
    public static final class a implements Parcelable.Creator<AuthBirthdayDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthBirthdayDto createFromParcel(Parcel parcel) {
            return new AuthBirthdayDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthBirthdayDto[] newArray(int i) {
            return new AuthBirthdayDto[i];
        }
    }

    public AuthBirthdayDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.day;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.month;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthBirthdayDto)) {
            return false;
        }
        AuthBirthdayDto authBirthdayDto = (AuthBirthdayDto) obj;
        return epx.f(this.year, authBirthdayDto.year) && epx.f(this.month, authBirthdayDto.month) && epx.f(this.day, authBirthdayDto.day);
    }

    public final Integer f() {
        return this.year;
    }

    public final int hashCode() {
        Integer num = this.year;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.month;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.day;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthBirthdayDto(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", day=");
        return uqi.b(sb, this.day, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.year;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.month;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.day;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public AuthBirthdayDto(Integer num, Integer num2, Integer num3) {
        this.year = num;
        this.month = num2;
        this.day = num3;
    }

    public /* synthetic */ AuthBirthdayDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
