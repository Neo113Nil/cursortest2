package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseAPlusMarkDto.kt */
/* loaded from: classes14.dex */
public final class BaseAPlusMarkDto implements Parcelable {
    public static final Parcelable.Creator<BaseAPlusMarkDto> CREATOR = new a();

    @pmi0("rkn_url")
    private final String rknUrl;

    /* compiled from: BaseAPlusMarkDto.kt */
    public static final class a implements Parcelable.Creator<BaseAPlusMarkDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseAPlusMarkDto createFromParcel(Parcel parcel) {
            return new BaseAPlusMarkDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseAPlusMarkDto[] newArray(int i) {
            return new BaseAPlusMarkDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseAPlusMarkDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.rknUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseAPlusMarkDto) && epx.f(this.rknUrl, ((BaseAPlusMarkDto) obj).rknUrl);
    }

    public final int hashCode() {
        String str = this.rknUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("BaseAPlusMarkDto(rknUrl="), this.rknUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rknUrl);
    }

    public BaseAPlusMarkDto(String str) {
        this.rknUrl = str;
    }

    public /* synthetic */ BaseAPlusMarkDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
