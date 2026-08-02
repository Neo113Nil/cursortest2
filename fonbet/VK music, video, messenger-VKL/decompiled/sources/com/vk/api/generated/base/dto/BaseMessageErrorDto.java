package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseMessageErrorDto.kt */
/* loaded from: classes14.dex */
public final class BaseMessageErrorDto implements Parcelable {
    public static final Parcelable.Creator<BaseMessageErrorDto> CREATOR = new a();

    @pmi0("code")
    private final Integer code;

    @pmi0("description")
    private final String description;

    /* compiled from: BaseMessageErrorDto.kt */
    public static final class a implements Parcelable.Creator<BaseMessageErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseMessageErrorDto createFromParcel(Parcel parcel) {
            return new BaseMessageErrorDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseMessageErrorDto[] newArray(int i) {
            return new BaseMessageErrorDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMessageErrorDto() {
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
        if (!(obj instanceof BaseMessageErrorDto)) {
            return false;
        }
        BaseMessageErrorDto baseMessageErrorDto = (BaseMessageErrorDto) obj;
        return epx.f(this.code, baseMessageErrorDto.code) && epx.f(this.description, baseMessageErrorDto.description);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseMessageErrorDto(code=");
        sb.append(this.code);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.code;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.description);
    }

    public BaseMessageErrorDto(Integer num, String str) {
        this.code = num;
        this.description = str;
    }

    public /* synthetic */ BaseMessageErrorDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
