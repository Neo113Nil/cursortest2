package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ChannelsLongpollCredentialsDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsLongpollCredentialsDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsLongpollCredentialsDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("server_url")
    private final String serverUrl;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("st")
    private final String st;

    @pmi0("ts")
    private final int ts;

    /* compiled from: ChannelsLongpollCredentialsDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsLongpollCredentialsDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsLongpollCredentialsDto createFromParcel(Parcel parcel) {
            return new ChannelsLongpollCredentialsDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsLongpollCredentialsDto[] newArray(int i) {
            return new ChannelsLongpollCredentialsDto[i];
        }
    }

    public ChannelsLongpollCredentialsDto(int i, String str, String str2, String str3, String str4) {
        this.ts = i;
        this.key = str;
        this.sid = str2;
        this.st = str3;
        this.serverUrl = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsLongpollCredentialsDto)) {
            return false;
        }
        ChannelsLongpollCredentialsDto channelsLongpollCredentialsDto = (ChannelsLongpollCredentialsDto) obj;
        return this.ts == channelsLongpollCredentialsDto.ts && epx.f(this.key, channelsLongpollCredentialsDto.key) && epx.f(this.sid, channelsLongpollCredentialsDto.sid) && epx.f(this.st, channelsLongpollCredentialsDto.st) && epx.f(this.serverUrl, channelsLongpollCredentialsDto.serverUrl);
    }

    public final int hashCode() {
        return this.serverUrl.hashCode() + urd0.a(urd0.a(urd0.a(Integer.hashCode(this.ts) * 31, 31, this.key), 31, this.sid), 31, this.st);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsLongpollCredentialsDto(ts=");
        sb.append(this.ts);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", st=");
        sb.append(this.st);
        sb.append(", serverUrl=");
        return ho8.a(sb, this.serverUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ts);
        parcel.writeString(this.key);
        parcel.writeString(this.sid);
        parcel.writeString(this.st);
        parcel.writeString(this.serverUrl);
    }
}
