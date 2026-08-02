package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsGetSecretHashResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetSecretHashResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetSecretHashResponseDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("edu_sign")
    private final String eduSign;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("sign")
    private final String sign;

    @pmi0("ts")
    private final int ts;

    /* compiled from: AppsGetSecretHashResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetSecretHashResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetSecretHashResponseDto createFromParcel(Parcel parcel) {
            return new AppsGetSecretHashResponseDto(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetSecretHashResponseDto[] newArray(int i) {
            return new AppsGetSecretHashResponseDto[i];
        }
    }

    public AppsGetSecretHashResponseDto(int i, int i2, String str, String str2, String str3) {
        this.appId = i;
        this.ts = i2;
        this.sign = str;
        this.requestId = str2;
        this.eduSign = str3;
    }

    public final String d() {
        return this.eduSign;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetSecretHashResponseDto)) {
            return false;
        }
        AppsGetSecretHashResponseDto appsGetSecretHashResponseDto = (AppsGetSecretHashResponseDto) obj;
        return this.appId == appsGetSecretHashResponseDto.appId && this.ts == appsGetSecretHashResponseDto.ts && epx.f(this.sign, appsGetSecretHashResponseDto.sign) && epx.f(this.requestId, appsGetSecretHashResponseDto.requestId) && epx.f(this.eduSign, appsGetSecretHashResponseDto.eduSign);
    }

    public final String f() {
        return this.sign;
    }

    public final int g() {
        return this.ts;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.ts, Integer.hashCode(this.appId) * 31, 31), 31, this.sign);
        String str = this.requestId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eduSign;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetSecretHashResponseDto(appId=");
        sb.append(this.appId);
        sb.append(", ts=");
        sb.append(this.ts);
        sb.append(", sign=");
        sb.append(this.sign);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", eduSign=");
        return ho8.a(sb, this.eduSign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeInt(this.ts);
        parcel.writeString(this.sign);
        parcel.writeString(this.requestId);
        parcel.writeString(this.eduSign);
    }

    public /* synthetic */ AppsGetSecretHashResponseDto(int i, int i2, String str, String str2, String str3, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3);
    }
}
