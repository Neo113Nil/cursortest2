package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesCredentialsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCredentialsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCredentialsDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("lp_server_unavailable")
    private final Boolean lpServerUnavailable;

    @pmi0("server_lp")
    private final String serverLp;

    @pmi0("server_sse")
    private final String serverSse;

    @pmi0("ts")
    private final long ts;

    /* compiled from: MessagesCredentialsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCredentialsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCredentialsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesCredentialsDto(readString, readLong, readString2, readString3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCredentialsDto[] newArray(int i) {
            return new MessagesCredentialsDto[i];
        }
    }

    public MessagesCredentialsDto(String str, long j, String str2, String str3, Boolean bool) {
        this.key = str;
        this.ts = j;
        this.serverLp = str2;
        this.serverSse = str3;
        this.lpServerUnavailable = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCredentialsDto)) {
            return false;
        }
        MessagesCredentialsDto messagesCredentialsDto = (MessagesCredentialsDto) obj;
        return epx.f(this.key, messagesCredentialsDto.key) && this.ts == messagesCredentialsDto.ts && epx.f(this.serverLp, messagesCredentialsDto.serverLp) && epx.f(this.serverSse, messagesCredentialsDto.serverSse) && epx.f(this.lpServerUnavailable, messagesCredentialsDto.lpServerUnavailable);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(this.key.hashCode() * 31, 31, this.ts), 31, this.serverLp);
        String str = this.serverSse;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.lpServerUnavailable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCredentialsDto(key=");
        sb.append(this.key);
        sb.append(", ts=");
        sb.append(this.ts);
        sb.append(", serverLp=");
        sb.append(this.serverLp);
        sb.append(", serverSse=");
        sb.append(this.serverSse);
        sb.append(", lpServerUnavailable=");
        return tn.a(sb, this.lpServerUnavailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeLong(this.ts);
        parcel.writeString(this.serverLp);
        parcel.writeString(this.serverSse);
        Boolean bool = this.lpServerUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesCredentialsDto(String str, long j, String str2, String str3, Boolean bool, int i, zcl zclVar) {
        this(str, j, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}
