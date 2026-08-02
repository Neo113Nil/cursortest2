package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StickersUnSubscribePackAuthorResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersUnSubscribePackAuthorResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersUnSubscribePackAuthorResponseDto> CREATOR = new a();

    @pmi0("stickers_author_subscription")
    private final StickersAuthorSubscriptionDto stickersAuthorSubscription;

    /* compiled from: StickersUnSubscribePackAuthorResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersUnSubscribePackAuthorResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersUnSubscribePackAuthorResponseDto createFromParcel(Parcel parcel) {
            return new StickersUnSubscribePackAuthorResponseDto(StickersAuthorSubscriptionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUnSubscribePackAuthorResponseDto[] newArray(int i) {
            return new StickersUnSubscribePackAuthorResponseDto[i];
        }
    }

    public StickersUnSubscribePackAuthorResponseDto(StickersAuthorSubscriptionDto stickersAuthorSubscriptionDto) {
        this.stickersAuthorSubscription = stickersAuthorSubscriptionDto;
    }

    public final StickersAuthorSubscriptionDto d() {
        return this.stickersAuthorSubscription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersUnSubscribePackAuthorResponseDto) && epx.f(this.stickersAuthorSubscription, ((StickersUnSubscribePackAuthorResponseDto) obj).stickersAuthorSubscription);
    }

    public final int hashCode() {
        return this.stickersAuthorSubscription.hashCode();
    }

    public final String toString() {
        return "StickersUnSubscribePackAuthorResponseDto(stickersAuthorSubscription=" + this.stickersAuthorSubscription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.stickersAuthorSubscription.writeToParcel(parcel, i);
    }
}
