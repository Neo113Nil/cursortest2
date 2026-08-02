package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.so;
import xsna.zcl;

/* compiled from: MessagesChannelsConfigDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChannelsConfigDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChannelsConfigDto> CREATOR = new a();

    @pmi0("backoff_strategy")
    private final String backoffStrategy;

    @pmi0("eh_host")
    private final String ehHost;

    @pmi0("eh_ping_interval")
    private final Float ehPingInterval;

    @pmi0("inconsistency_detection")
    private final Boolean inconsistencyDetection;

    @pmi0("ws_enabled")
    private final Boolean wsEnabled;

    @pmi0("ws_host")
    private final String wsHost;

    @pmi0("ws_impl_type")
    private final String wsImplType;

    @pmi0("ws_ping_interval")
    private final Integer wsPingInterval;

    /* compiled from: MessagesChannelsConfigDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChannelsConfigDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MessagesChannelsConfigDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer valueOf2;
            Boolean bool;
            Boolean valueOf3;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
                bool = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = bool;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer num = valueOf2;
            String readString3 = parcel.readString();
            Float f = bool;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                f = Float.valueOf(parcel.readFloat());
            }
            return new MessagesChannelsConfigDto(valueOf, readString, num, readString2, valueOf3, readString3, readString4, f);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChannelsConfigDto[] newArray(int i) {
            return new MessagesChannelsConfigDto[i];
        }
    }

    public MessagesChannelsConfigDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChannelsConfigDto)) {
            return false;
        }
        MessagesChannelsConfigDto messagesChannelsConfigDto = (MessagesChannelsConfigDto) obj;
        return epx.f(this.wsEnabled, messagesChannelsConfigDto.wsEnabled) && epx.f(this.wsHost, messagesChannelsConfigDto.wsHost) && epx.f(this.wsPingInterval, messagesChannelsConfigDto.wsPingInterval) && epx.f(this.wsImplType, messagesChannelsConfigDto.wsImplType) && epx.f(this.inconsistencyDetection, messagesChannelsConfigDto.inconsistencyDetection) && epx.f(this.backoffStrategy, messagesChannelsConfigDto.backoffStrategy) && epx.f(this.ehHost, messagesChannelsConfigDto.ehHost) && epx.f(this.ehPingInterval, messagesChannelsConfigDto.ehPingInterval);
    }

    public final int hashCode() {
        Boolean bool = this.wsEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.wsHost;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.wsPingInterval;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.wsImplType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.inconsistencyDetection;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.backoffStrategy;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ehHost;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.ehPingInterval;
        return hashCode7 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChannelsConfigDto(wsEnabled=");
        sb.append(this.wsEnabled);
        sb.append(", wsHost=");
        sb.append(this.wsHost);
        sb.append(", wsPingInterval=");
        sb.append(this.wsPingInterval);
        sb.append(", wsImplType=");
        sb.append(this.wsImplType);
        sb.append(", inconsistencyDetection=");
        sb.append(this.inconsistencyDetection);
        sb.append(", backoffStrategy=");
        sb.append(this.backoffStrategy);
        sb.append(", ehHost=");
        sb.append(this.ehHost);
        sb.append(", ehPingInterval=");
        return so.b(sb, this.ehPingInterval, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.wsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.wsHost);
        Integer num = this.wsPingInterval;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.wsImplType);
        Boolean bool2 = this.inconsistencyDetection;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.backoffStrategy);
        parcel.writeString(this.ehHost);
        Float f = this.ehPingInterval;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public MessagesChannelsConfigDto(Boolean bool, String str, Integer num, String str2, Boolean bool2, String str3, String str4, Float f) {
        this.wsEnabled = bool;
        this.wsHost = str;
        this.wsPingInterval = num;
        this.wsImplType = str2;
        this.inconsistencyDetection = bool2;
        this.backoffStrategy = str3;
        this.ehHost = str4;
        this.ehPingInterval = f;
    }

    public /* synthetic */ MessagesChannelsConfigDto(Boolean bool, String str, Integer num, String str2, Boolean bool2, String str3, String str4, Float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : f);
    }
}
