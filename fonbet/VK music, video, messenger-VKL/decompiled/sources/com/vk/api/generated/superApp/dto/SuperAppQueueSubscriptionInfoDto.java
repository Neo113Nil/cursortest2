package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppQueueSubscriptionInfoDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppQueueSubscriptionInfoDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppQueueSubscriptionInfoDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("conn_type")
    private final ConnTypeDto connType;

    @pmi0("key")
    private final String key;

    @pmi0("queue_id")
    private final String queueId;

    @pmi0("timestamp")
    private final int timestamp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppQueueSubscriptionInfoDto.kt */
    public static final class ConnTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConnTypeDto[] $VALUES;
        public static final Parcelable.Creator<ConnTypeDto> CREATOR;

        @pmi0("long-poll")
        public static final ConnTypeDto LONG_POLL;

        @pmi0("sse")
        public static final ConnTypeDto SSE;
        private final String value;

        /* compiled from: SuperAppQueueSubscriptionInfoDto.kt */
        public static final class a implements Parcelable.Creator<ConnTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ConnTypeDto createFromParcel(Parcel parcel) {
                return ConnTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ConnTypeDto[] newArray(int i) {
                return new ConnTypeDto[i];
            }
        }

        static {
            ConnTypeDto connTypeDto = new ConnTypeDto("SSE", 0, "sse");
            SSE = connTypeDto;
            ConnTypeDto connTypeDto2 = new ConnTypeDto("LONG_POLL", 1, "long-poll");
            LONG_POLL = connTypeDto2;
            ConnTypeDto[] connTypeDtoArr = {connTypeDto, connTypeDto2};
            $VALUES = connTypeDtoArr;
            $ENTRIES = new asp(connTypeDtoArr);
            CREATOR = new a();
        }

        private ConnTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ConnTypeDto valueOf(String str) {
            return (ConnTypeDto) Enum.valueOf(ConnTypeDto.class, str);
        }

        public static ConnTypeDto[] values() {
            return (ConnTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SuperAppQueueSubscriptionInfoDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppQueueSubscriptionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppQueueSubscriptionInfoDto createFromParcel(Parcel parcel) {
            return new SuperAppQueueSubscriptionInfoDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ConnTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppQueueSubscriptionInfoDto[] newArray(int i) {
            return new SuperAppQueueSubscriptionInfoDto[i];
        }
    }

    public SuperAppQueueSubscriptionInfoDto(String str, String str2, int i, String str3, ConnTypeDto connTypeDto) {
        this.baseUrl = str;
        this.key = str2;
        this.timestamp = i;
        this.queueId = str3;
        this.connType = connTypeDto;
    }

    public final String d() {
        return this.baseUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppQueueSubscriptionInfoDto)) {
            return false;
        }
        SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto = (SuperAppQueueSubscriptionInfoDto) obj;
        return epx.f(this.baseUrl, superAppQueueSubscriptionInfoDto.baseUrl) && epx.f(this.key, superAppQueueSubscriptionInfoDto.key) && this.timestamp == superAppQueueSubscriptionInfoDto.timestamp && epx.f(this.queueId, superAppQueueSubscriptionInfoDto.queueId) && this.connType == superAppQueueSubscriptionInfoDto.connType;
    }

    public final String f() {
        return this.queueId;
    }

    public final int g() {
        return this.timestamp;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.timestamp, urd0.a(this.baseUrl.hashCode() * 31, 31, this.key), 31), 31, this.queueId);
        ConnTypeDto connTypeDto = this.connType;
        return a2 + (connTypeDto == null ? 0 : connTypeDto.hashCode());
    }

    public final String toString() {
        return "SuperAppQueueSubscriptionInfoDto(baseUrl=" + this.baseUrl + ", key=" + this.key + ", timestamp=" + this.timestamp + ", queueId=" + this.queueId + ", connType=" + this.connType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        parcel.writeString(this.key);
        parcel.writeInt(this.timestamp);
        parcel.writeString(this.queueId);
        ConnTypeDto connTypeDto = this.connType;
        if (connTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            connTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppQueueSubscriptionInfoDto(String str, String str2, int i, String str3, ConnTypeDto connTypeDto, int i2, zcl zclVar) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? null : connTypeDto);
    }
}
