package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BaseRequestParamDto.kt */
/* loaded from: classes14.dex */
public final class BaseRequestParamDto implements Parcelable {
    public static final Parcelable.Creator<BaseRequestParamDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    /* compiled from: BaseRequestParamDto.kt */
    public static final class a implements Parcelable.Creator<BaseRequestParamDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseRequestParamDto createFromParcel(Parcel parcel) {
            return new BaseRequestParamDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseRequestParamDto[] newArray(int i) {
            return new BaseRequestParamDto[i];
        }
    }

    public BaseRequestParamDto(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String d() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRequestParamDto)) {
            return false;
        }
        BaseRequestParamDto baseRequestParamDto = (BaseRequestParamDto) obj;
        return epx.f(this.key, baseRequestParamDto.key) && epx.f(this.value, baseRequestParamDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseRequestParamDto(key=");
        sb.append(this.key);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
