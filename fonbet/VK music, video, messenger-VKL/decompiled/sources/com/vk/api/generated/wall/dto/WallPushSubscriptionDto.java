package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: WallPushSubscriptionDto.kt */
/* loaded from: classes15.dex */
public final class WallPushSubscriptionDto implements Parcelable {
    public static final Parcelable.Creator<WallPushSubscriptionDto> CREATOR = new a();

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    /* compiled from: WallPushSubscriptionDto.kt */
    public static final class a implements Parcelable.Creator<WallPushSubscriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPushSubscriptionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallPushSubscriptionDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPushSubscriptionDto[] newArray(int i) {
            return new WallPushSubscriptionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallPushSubscriptionDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPushSubscriptionDto) && epx.f(this.isSubscribed, ((WallPushSubscriptionDto) obj).isSubscribed);
    }

    public final int hashCode() {
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("WallPushSubscriptionDto(isSubscribed="), this.isSubscribed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public WallPushSubscriptionDto(Boolean bool) {
        this.isSubscribed = bool;
    }

    public /* synthetic */ WallPushSubscriptionDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
