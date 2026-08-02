package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Hb;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesLongpollParamsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesLongpollParamsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesLongpollParamsDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("pts")
    private final Integer pts;

    @pmi0(Hb.a)
    private final String server;

    @pmi0("ts")
    private final int ts;

    /* compiled from: MessagesLongpollParamsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesLongpollParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesLongpollParamsDto createFromParcel(Parcel parcel) {
            return new MessagesLongpollParamsDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesLongpollParamsDto[] newArray(int i) {
            return new MessagesLongpollParamsDto[i];
        }
    }

    public MessagesLongpollParamsDto(String str, String str2, int i, Integer num) {
        this.server = str;
        this.key = str2;
        this.ts = i;
        this.pts = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesLongpollParamsDto)) {
            return false;
        }
        MessagesLongpollParamsDto messagesLongpollParamsDto = (MessagesLongpollParamsDto) obj;
        return epx.f(this.server, messagesLongpollParamsDto.server) && epx.f(this.key, messagesLongpollParamsDto.key) && this.ts == messagesLongpollParamsDto.ts && epx.f(this.pts, messagesLongpollParamsDto.pts);
    }

    public final int hashCode() {
        int a2 = shy.a(this.ts, urd0.a(this.server.hashCode() * 31, 31, this.key), 31);
        Integer num = this.pts;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesLongpollParamsDto(server=");
        sb.append(this.server);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", ts=");
        sb.append(this.ts);
        sb.append(", pts=");
        return uqi.b(sb, this.pts, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.server);
        parcel.writeString(this.key);
        parcel.writeInt(this.ts);
        Integer num = this.pts;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesLongpollParamsDto(String str, String str2, int i, Integer num, int i2, zcl zclVar) {
        this(str, str2, i, (i2 & 8) != 0 ? null : num);
    }
}
