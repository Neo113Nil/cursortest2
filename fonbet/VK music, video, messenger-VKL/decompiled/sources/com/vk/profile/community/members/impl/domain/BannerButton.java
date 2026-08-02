package com.vk.profile.community.members.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: MembersListBanner.kt */
/* loaded from: classes5.dex */
public final class BannerButton implements Parcelable {
    public static final Parcelable.Creator<BannerButton> CREATOR = new a();
    public final String b;
    public final BannerButtonStyle c;
    public final String d;

    /* compiled from: MembersListBanner.kt */
    public static final class a implements Parcelable.Creator<BannerButton> {
        @Override // android.os.Parcelable.Creator
        public final BannerButton createFromParcel(Parcel parcel) {
            return new BannerButton(parcel.readString(), BannerButtonStyle.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BannerButton[] newArray(int i) {
            return new BannerButton[i];
        }
    }

    public BannerButton(String str, BannerButtonStyle bannerButtonStyle, String str2) {
        this.b = str;
        this.c = bannerButtonStyle;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerButton)) {
            return false;
        }
        BannerButton bannerButton = (BannerButton) obj;
        return epx.f(this.b, bannerButton.b) && this.c == bannerButton.c && epx.f(this.d, bannerButton.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerButton(text=");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", actionUrl=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
    }
}
