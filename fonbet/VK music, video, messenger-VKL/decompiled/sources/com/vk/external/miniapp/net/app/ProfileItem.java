package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: ProfileItem.kt */
/* loaded from: classes18.dex */
public final class ProfileItem implements Parcelable {
    public static final Parcelable.Creator<ProfileItem> CREATOR = new a();
    public final long b;
    public final WebImage c;

    /* compiled from: ProfileItem.kt */
    public static final class a implements Parcelable.Creator<ProfileItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileItem createFromParcel(Parcel parcel) {
            return new ProfileItem(parcel.readLong(), (WebImage) parcel.readParcelable(ProfileItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileItem[] newArray(int i) {
            return new ProfileItem[i];
        }
    }

    public ProfileItem(long j, WebImage webImage) {
        this.b = j;
        this.c = webImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileItem)) {
            return false;
        }
        ProfileItem profileItem = (ProfileItem) obj;
        return this.b == profileItem.b && epx.f(this.c, profileItem.c);
    }

    public final int hashCode() {
        return this.c.b.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ProfileItem(userId=" + this.b + ", photo=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
