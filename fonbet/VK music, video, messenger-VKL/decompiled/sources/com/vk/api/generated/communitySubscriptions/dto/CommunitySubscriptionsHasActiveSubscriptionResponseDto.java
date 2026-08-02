package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: CommunitySubscriptionsHasActiveSubscriptionResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsHasActiveSubscriptionResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsHasActiveSubscriptionResponseDto> CREATOR = new a();

    @pmi0("has_active")
    private final boolean hasActive;

    /* compiled from: CommunitySubscriptionsHasActiveSubscriptionResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsHasActiveSubscriptionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsHasActiveSubscriptionResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsHasActiveSubscriptionResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsHasActiveSubscriptionResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsHasActiveSubscriptionResponseDto[i];
        }
    }

    public CommunitySubscriptionsHasActiveSubscriptionResponseDto(boolean z) {
        this.hasActive = z;
    }

    public final boolean d() {
        return this.hasActive;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommunitySubscriptionsHasActiveSubscriptionResponseDto) && this.hasActive == ((CommunitySubscriptionsHasActiveSubscriptionResponseDto) obj).hasActive;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasActive);
    }

    public final String toString() {
        return q0.a(new StringBuilder("CommunitySubscriptionsHasActiveSubscriptionResponseDto(hasActive="), this.hasActive, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasActive ? 1 : 0);
    }
}
