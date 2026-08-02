package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.queue.dto.QueueSubscriptionInfoDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CallsSubscribeToQueueResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsSubscribeToQueueResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsSubscribeToQueueResponseDto> CREATOR = new a();

    @pmi0("queue_subscription_info")
    private final QueueSubscriptionInfoDto queueSubscriptionInfo;

    @pmi0("secret")
    private final String secret;

    /* compiled from: CallsSubscribeToQueueResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsSubscribeToQueueResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsSubscribeToQueueResponseDto createFromParcel(Parcel parcel) {
            return new CallsSubscribeToQueueResponseDto(QueueSubscriptionInfoDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsSubscribeToQueueResponseDto[] newArray(int i) {
            return new CallsSubscribeToQueueResponseDto[i];
        }
    }

    public CallsSubscribeToQueueResponseDto(QueueSubscriptionInfoDto queueSubscriptionInfoDto, String str) {
        this.queueSubscriptionInfo = queueSubscriptionInfoDto;
        this.secret = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsSubscribeToQueueResponseDto)) {
            return false;
        }
        CallsSubscribeToQueueResponseDto callsSubscribeToQueueResponseDto = (CallsSubscribeToQueueResponseDto) obj;
        return epx.f(this.queueSubscriptionInfo, callsSubscribeToQueueResponseDto.queueSubscriptionInfo) && epx.f(this.secret, callsSubscribeToQueueResponseDto.secret);
    }

    public final int hashCode() {
        return this.secret.hashCode() + (this.queueSubscriptionInfo.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsSubscribeToQueueResponseDto(queueSubscriptionInfo=");
        sb.append(this.queueSubscriptionInfo);
        sb.append(", secret=");
        return ho8.a(sb, this.secret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.queueSubscriptionInfo.writeToParcel(parcel, i);
        parcel.writeString(this.secret);
    }
}
