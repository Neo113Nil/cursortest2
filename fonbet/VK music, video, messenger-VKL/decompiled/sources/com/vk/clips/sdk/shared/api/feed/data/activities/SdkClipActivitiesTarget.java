package com.vk.clips.sdk.shared.api.feed.data.activities;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.vu5;

/* compiled from: SdkClipActivitiesTarget.kt */
/* loaded from: classes17.dex */
public final class SdkClipActivitiesTarget implements Parcelable {
    public static final Parcelable.Creator<SdkClipActivitiesTarget> CREATOR = new a();
    public final UserId b;
    public final int c;

    /* compiled from: SdkClipActivitiesTarget.kt */
    public static final class a implements Parcelable.Creator<SdkClipActivitiesTarget> {
        @Override // android.os.Parcelable.Creator
        public final SdkClipActivitiesTarget createFromParcel(Parcel parcel) {
            return new SdkClipActivitiesTarget((UserId) parcel.readParcelable(SdkClipActivitiesTarget.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkClipActivitiesTarget[] newArray(int i) {
            return new SdkClipActivitiesTarget[i];
        }
    }

    public SdkClipActivitiesTarget(UserId userId, int i) {
        this.b = userId;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkClipActivitiesTarget)) {
            return false;
        }
        SdkClipActivitiesTarget sdkClipActivitiesTarget = (SdkClipActivitiesTarget) obj;
        return epx.f(this.b, sdkClipActivitiesTarget.b) && this.c == sdkClipActivitiesTarget.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkClipActivitiesTarget(ownerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
