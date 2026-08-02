package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StickersSubscribePackAuthorResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersSubscribePackAuthorResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersSubscribePackAuthorResponseDto> CREATOR = new a();

    @pmi0("stickers_author_subscription")
    private final StickersAuthorSubscriptionDto stickersAuthorSubscription;

    /* compiled from: StickersSubscribePackAuthorResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersSubscribePackAuthorResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSubscribePackAuthorResponseDto createFromParcel(Parcel parcel) {
            return new StickersSubscribePackAuthorResponseDto(StickersAuthorSubscriptionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSubscribePackAuthorResponseDto[] newArray(int i) {
            return new StickersSubscribePackAuthorResponseDto[i];
        }
    }

    public StickersSubscribePackAuthorResponseDto(StickersAuthorSubscriptionDto stickersAuthorSubscriptionDto) {
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
        return (obj instanceof StickersSubscribePackAuthorResponseDto) && epx.f(this.stickersAuthorSubscription, ((StickersSubscribePackAuthorResponseDto) obj).stickersAuthorSubscription);
    }

    public final int hashCode() {
        return this.stickersAuthorSubscription.hashCode();
    }

    public final String toString() {
        return "StickersSubscribePackAuthorResponseDto(stickersAuthorSubscription=" + this.stickersAuthorSubscription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.stickersAuthorSubscription.writeToParcel(parcel, i);
    }
}
