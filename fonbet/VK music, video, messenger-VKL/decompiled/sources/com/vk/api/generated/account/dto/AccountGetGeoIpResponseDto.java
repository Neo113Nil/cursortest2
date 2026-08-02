package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountGetGeoIpResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetGeoIpResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetGeoIpResponseDto> CREATOR = new a();

    @pmi0("fwd_ip")
    private final String fwdIp;

    @pmi0(CandidateTypeHintConfig.TYPE_HOST)
    private final String host;

    @pmi0("res")
    private final BaseBoolIntDto res;

    /* compiled from: AccountGetGeoIpResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetGeoIpResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetGeoIpResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetGeoIpResponseDto((BaseBoolIntDto) parcel.readParcelable(AccountGetGeoIpResponseDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetGeoIpResponseDto[] newArray(int i) {
            return new AccountGetGeoIpResponseDto[i];
        }
    }

    public AccountGetGeoIpResponseDto(BaseBoolIntDto baseBoolIntDto, String str, String str2) {
        this.res = baseBoolIntDto;
        this.fwdIp = str;
        this.host = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetGeoIpResponseDto)) {
            return false;
        }
        AccountGetGeoIpResponseDto accountGetGeoIpResponseDto = (AccountGetGeoIpResponseDto) obj;
        return this.res == accountGetGeoIpResponseDto.res && epx.f(this.fwdIp, accountGetGeoIpResponseDto.fwdIp) && epx.f(this.host, accountGetGeoIpResponseDto.host);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.res.hashCode() * 31, 31, this.fwdIp);
        String str = this.host;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetGeoIpResponseDto(res=");
        sb.append(this.res);
        sb.append(", fwdIp=");
        sb.append(this.fwdIp);
        sb.append(", host=");
        return ho8.a(sb, this.host, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.res, i);
        parcel.writeString(this.fwdIp);
        parcel.writeString(this.host);
    }

    public /* synthetic */ AccountGetGeoIpResponseDto(BaseBoolIntDto baseBoolIntDto, String str, String str2, int i, zcl zclVar) {
        this(baseBoolIntDto, str, (i & 4) != 0 ? null : str2);
    }
}
