package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseCodeMessageDto.kt */
/* loaded from: classes14.dex */
public final class BaseCodeMessageDto implements Parcelable {
    public static final Parcelable.Creator<BaseCodeMessageDto> CREATOR = new a();

    @pmi0("code")
    private final int code;

    @pmi0("message")
    private final String message;

    /* compiled from: BaseCodeMessageDto.kt */
    public static final class a implements Parcelable.Creator<BaseCodeMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCodeMessageDto createFromParcel(Parcel parcel) {
            return new BaseCodeMessageDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCodeMessageDto[] newArray(int i) {
            return new BaseCodeMessageDto[i];
        }
    }

    public BaseCodeMessageDto(int i, String str) {
        this.code = i;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCodeMessageDto)) {
            return false;
        }
        BaseCodeMessageDto baseCodeMessageDto = (BaseCodeMessageDto) obj;
        return this.code == baseCodeMessageDto.code && epx.f(this.message, baseCodeMessageDto.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCodeMessageDto(code=");
        sb.append(this.code);
        sb.append(", message=");
        return ho8.a(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
    }

    public /* synthetic */ BaseCodeMessageDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
