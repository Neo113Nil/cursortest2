package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: AccountGetPingUrlResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetPingUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetPingUrlResponseDto> CREATOR = new a();

    @pmi0("endpoint")
    private final String endpoint;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("time_interval")
    private final int timeInterval;

    /* compiled from: AccountGetPingUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetPingUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetPingUrlResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetPingUrlResponseDto(parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetPingUrlResponseDto[] newArray(int i) {
            return new AccountGetPingUrlResponseDto[i];
        }
    }

    public AccountGetPingUrlResponseDto(boolean z, String str, int i) {
        this.isEnabled = z;
        this.endpoint = str;
        this.timeInterval = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetPingUrlResponseDto)) {
            return false;
        }
        AccountGetPingUrlResponseDto accountGetPingUrlResponseDto = (AccountGetPingUrlResponseDto) obj;
        return this.isEnabled == accountGetPingUrlResponseDto.isEnabled && epx.f(this.endpoint, accountGetPingUrlResponseDto.endpoint) && this.timeInterval == accountGetPingUrlResponseDto.timeInterval;
    }

    public final int hashCode() {
        return Integer.hashCode(this.timeInterval) + urd0.a(Boolean.hashCode(this.isEnabled) * 31, 31, this.endpoint);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetPingUrlResponseDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", endpoint=");
        sb.append(this.endpoint);
        sb.append(", timeInterval=");
        return vu5.b(sb, this.timeInterval, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.endpoint);
        parcel.writeInt(this.timeInterval);
    }
}
