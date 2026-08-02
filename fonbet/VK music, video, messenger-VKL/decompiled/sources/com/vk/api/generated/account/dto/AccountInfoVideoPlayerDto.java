package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: AccountInfoVideoPlayerDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoVideoPlayerDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoVideoPlayerDto> CREATOR = new a();

    @pmi0("player_decoder_config")
    private final int playerDecoderConfig;

    @pmi0("player_pool_size")
    private final int playerPoolSize;

    @pmi0("player_type")
    private final int playerType;

    /* compiled from: AccountInfoVideoPlayerDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoVideoPlayerDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoVideoPlayerDto createFromParcel(Parcel parcel) {
            return new AccountInfoVideoPlayerDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoVideoPlayerDto[] newArray(int i) {
            return new AccountInfoVideoPlayerDto[i];
        }
    }

    public AccountInfoVideoPlayerDto(int i, int i2, int i3) {
        this.playerType = i;
        this.playerPoolSize = i2;
        this.playerDecoderConfig = i3;
    }

    public final int d() {
        return this.playerDecoderConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.playerPoolSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoVideoPlayerDto)) {
            return false;
        }
        AccountInfoVideoPlayerDto accountInfoVideoPlayerDto = (AccountInfoVideoPlayerDto) obj;
        return this.playerType == accountInfoVideoPlayerDto.playerType && this.playerPoolSize == accountInfoVideoPlayerDto.playerPoolSize && this.playerDecoderConfig == accountInfoVideoPlayerDto.playerDecoderConfig;
    }

    public final int f() {
        return this.playerType;
    }

    public final int hashCode() {
        return Integer.hashCode(this.playerDecoderConfig) + shy.a(this.playerPoolSize, Integer.hashCode(this.playerType) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoVideoPlayerDto(playerType=");
        sb.append(this.playerType);
        sb.append(", playerPoolSize=");
        sb.append(this.playerPoolSize);
        sb.append(", playerDecoderConfig=");
        return vu5.b(sb, this.playerDecoderConfig, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.playerType);
        parcel.writeInt(this.playerPoolSize);
        parcel.writeInt(this.playerDecoderConfig);
    }
}
