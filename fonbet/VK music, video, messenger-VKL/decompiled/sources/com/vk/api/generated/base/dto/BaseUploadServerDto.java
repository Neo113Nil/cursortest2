package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseUploadServerDto.kt */
/* loaded from: classes14.dex */
public final class BaseUploadServerDto implements Parcelable {
    public static final Parcelable.Creator<BaseUploadServerDto> CREATOR = new a();

    @pmi0("fallback_upload_url")
    private final String fallbackUploadUrl;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: BaseUploadServerDto.kt */
    public static final class a implements Parcelable.Creator<BaseUploadServerDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseUploadServerDto createFromParcel(Parcel parcel) {
            return new BaseUploadServerDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseUploadServerDto[] newArray(int i) {
            return new BaseUploadServerDto[i];
        }
    }

    public BaseUploadServerDto(String str, String str2) {
        this.uploadUrl = str;
        this.fallbackUploadUrl = str2;
    }

    public final String d() {
        return this.fallbackUploadUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.uploadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseUploadServerDto)) {
            return false;
        }
        BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
        return epx.f(this.uploadUrl, baseUploadServerDto.uploadUrl) && epx.f(this.fallbackUploadUrl, baseUploadServerDto.fallbackUploadUrl);
    }

    public final int hashCode() {
        int hashCode = this.uploadUrl.hashCode() * 31;
        String str = this.fallbackUploadUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseUploadServerDto(uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", fallbackUploadUrl=");
        return ho8.a(sb, this.fallbackUploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
        parcel.writeString(this.fallbackUploadUrl);
    }

    public /* synthetic */ BaseUploadServerDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
