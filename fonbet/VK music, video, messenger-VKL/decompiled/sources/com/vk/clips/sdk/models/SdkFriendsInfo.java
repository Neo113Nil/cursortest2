package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: SdkFriendsInfo.kt */
/* loaded from: classes17.dex */
public final class SdkFriendsInfo implements Parcelable {
    public static final Parcelable.Creator<SdkFriendsInfo> CREATOR = new a();
    public final int b;
    public final List<String> c;

    /* compiled from: SdkFriendsInfo.kt */
    public static final class a implements Parcelable.Creator<SdkFriendsInfo> {
        @Override // android.os.Parcelable.Creator
        public final SdkFriendsInfo createFromParcel(Parcel parcel) {
            return new SdkFriendsInfo(parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkFriendsInfo[] newArray(int i) {
            return new SdkFriendsInfo[i];
        }
    }

    public SdkFriendsInfo(int i, List<String> list) {
        this.b = i;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkFriendsInfo)) {
            return false;
        }
        SdkFriendsInfo sdkFriendsInfo = (SdkFriendsInfo) obj;
        return this.b == sdkFriendsInfo.b && epx.f(this.c, sdkFriendsInfo.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        List<String> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkFriendsInfo(friendsCount=");
        sb.append(this.b);
        sb.append(", friendsAvatarsList=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeStringList(this.c);
    }
}
