package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: StickersAuthorSubscriptionDto.kt */
/* loaded from: classes15.dex */
public final class StickersAuthorSubscriptionDto implements Parcelable {
    public static final Parcelable.Creator<StickersAuthorSubscriptionDto> CREATOR = new a();

    @pmi0("is_subscribed")
    private final boolean isSubscribed;

    /* compiled from: StickersAuthorSubscriptionDto.kt */
    public static final class a implements Parcelable.Creator<StickersAuthorSubscriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersAuthorSubscriptionDto createFromParcel(Parcel parcel) {
            return new StickersAuthorSubscriptionDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersAuthorSubscriptionDto[] newArray(int i) {
            return new StickersAuthorSubscriptionDto[i];
        }
    }

    public StickersAuthorSubscriptionDto(boolean z) {
        this.isSubscribed = z;
    }

    public final boolean U() {
        return this.isSubscribed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersAuthorSubscriptionDto) && this.isSubscribed == ((StickersAuthorSubscriptionDto) obj).isSubscribed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSubscribed);
    }

    public final String toString() {
        return q0.a(new StringBuilder("StickersAuthorSubscriptionDto(isSubscribed="), this.isSubscribed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSubscribed ? 1 : 0);
    }
}
