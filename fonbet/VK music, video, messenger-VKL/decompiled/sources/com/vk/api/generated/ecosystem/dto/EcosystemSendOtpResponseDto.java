package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: EcosystemSendOtpResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemSendOtpResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemSendOtpResponseDto> CREATOR = new a();

    @pmi0("code_length")
    private final int codeLength;

    @pmi0("info")
    private final String info;

    @pmi0("max_messenger_hash")
    private final String maxMessengerHash;

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("status")
    private final int status;

    /* compiled from: EcosystemSendOtpResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemSendOtpResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemSendOtpResponseDto createFromParcel(Parcel parcel) {
            return new EcosystemSendOtpResponseDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemSendOtpResponseDto[] newArray(int i) {
            return new EcosystemSendOtpResponseDto[i];
        }
    }

    public EcosystemSendOtpResponseDto(int i, String str, int i2, String str2, String str3, String str4) {
        this.status = i;
        this.sid = str;
        this.codeLength = i2;
        this.info = str2;
        this.maxMessengerHash = str3;
        this.redirectUrl = str4;
    }

    public final int d() {
        return this.codeLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.info;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcosystemSendOtpResponseDto)) {
            return false;
        }
        EcosystemSendOtpResponseDto ecosystemSendOtpResponseDto = (EcosystemSendOtpResponseDto) obj;
        return this.status == ecosystemSendOtpResponseDto.status && epx.f(this.sid, ecosystemSendOtpResponseDto.sid) && this.codeLength == ecosystemSendOtpResponseDto.codeLength && epx.f(this.info, ecosystemSendOtpResponseDto.info) && epx.f(this.maxMessengerHash, ecosystemSendOtpResponseDto.maxMessengerHash) && epx.f(this.redirectUrl, ecosystemSendOtpResponseDto.redirectUrl);
    }

    public final String f() {
        return this.maxMessengerHash;
    }

    public final String g() {
        return this.redirectUrl;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.codeLength, urd0.a(Integer.hashCode(this.status) * 31, 31, this.sid), 31), 31, this.info);
        String str = this.maxMessengerHash;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemSendOtpResponseDto(status=");
        sb.append(this.status);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", codeLength=");
        sb.append(this.codeLength);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", maxMessengerHash=");
        sb.append(this.maxMessengerHash);
        sb.append(", redirectUrl=");
        return ho8.a(sb, this.redirectUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
        parcel.writeString(this.sid);
        parcel.writeInt(this.codeLength);
        parcel.writeString(this.info);
        parcel.writeString(this.maxMessengerHash);
        parcel.writeString(this.redirectUrl);
    }

    public /* synthetic */ EcosystemSendOtpResponseDto(int i, String str, int i2, String str2, String str3, String str4, int i3, zcl zclVar) {
        this(i, str, i2, str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4);
    }
}
