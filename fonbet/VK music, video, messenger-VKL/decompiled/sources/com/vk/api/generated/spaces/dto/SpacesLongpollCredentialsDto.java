package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: SpacesLongpollCredentialsDto.kt */
/* loaded from: classes15.dex */
public final class SpacesLongpollCredentialsDto implements Parcelable {
    public static final Parcelable.Creator<SpacesLongpollCredentialsDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("server_url")
    private final String serverUrl;

    @pmi0("ts")
    private final int ts;

    /* compiled from: SpacesLongpollCredentialsDto.kt */
    public static final class a implements Parcelable.Creator<SpacesLongpollCredentialsDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesLongpollCredentialsDto createFromParcel(Parcel parcel) {
            return new SpacesLongpollCredentialsDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesLongpollCredentialsDto[] newArray(int i) {
            return new SpacesLongpollCredentialsDto[i];
        }
    }

    public SpacesLongpollCredentialsDto(int i, String str, String str2) {
        this.ts = i;
        this.key = str;
        this.serverUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesLongpollCredentialsDto)) {
            return false;
        }
        SpacesLongpollCredentialsDto spacesLongpollCredentialsDto = (SpacesLongpollCredentialsDto) obj;
        return this.ts == spacesLongpollCredentialsDto.ts && epx.f(this.key, spacesLongpollCredentialsDto.key) && epx.f(this.serverUrl, spacesLongpollCredentialsDto.serverUrl);
    }

    public final int hashCode() {
        return this.serverUrl.hashCode() + urd0.a(Integer.hashCode(this.ts) * 31, 31, this.key);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesLongpollCredentialsDto(ts=");
        sb.append(this.ts);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", serverUrl=");
        return ho8.a(sb, this.serverUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ts);
        parcel.writeString(this.key);
        parcel.writeString(this.serverUrl);
    }
}
