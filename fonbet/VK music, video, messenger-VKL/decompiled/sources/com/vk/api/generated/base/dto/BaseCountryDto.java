package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BaseCountryDto.kt */
/* loaded from: classes14.dex */
public final class BaseCountryDto implements Parcelable {
    public static final Parcelable.Creator<BaseCountryDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: BaseCountryDto.kt */
    public static final class a implements Parcelable.Creator<BaseCountryDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCountryDto createFromParcel(Parcel parcel) {
            return new BaseCountryDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCountryDto[] newArray(int i) {
            return new BaseCountryDto[i];
        }
    }

    public BaseCountryDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCountryDto)) {
            return false;
        }
        BaseCountryDto baseCountryDto = (BaseCountryDto) obj;
        return this.id == baseCountryDto.id && epx.f(this.title, baseCountryDto.title);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCountryDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
