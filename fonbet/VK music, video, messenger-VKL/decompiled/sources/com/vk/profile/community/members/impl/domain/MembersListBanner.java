package com.vk.profile.community.members.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MembersListBanner.kt */
/* loaded from: classes5.dex */
public final class MembersListBanner implements Parcelable {
    public static final Parcelable.Creator<MembersListBanner> CREATOR = new a();
    public final String b;
    public final String c;
    public final BannerButton d;
    public final String e;

    /* compiled from: MembersListBanner.kt */
    public static final class a implements Parcelable.Creator<MembersListBanner> {
        @Override // android.os.Parcelable.Creator
        public final MembersListBanner createFromParcel(Parcel parcel) {
            return new MembersListBanner(parcel.readString(), parcel.readString(), BannerButton.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MembersListBanner[] newArray(int i) {
            return new MembersListBanner[i];
        }
    }

    public MembersListBanner(String str, String str2, BannerButton bannerButton, String str3) {
        this.b = str;
        this.c = str2;
        this.d = bannerButton;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembersListBanner)) {
            return false;
        }
        MembersListBanner membersListBanner = (MembersListBanner) obj;
        return epx.f(this.b, membersListBanner.b) && epx.f(this.c, membersListBanner.c) && epx.f(this.d, membersListBanner.d) && epx.f(this.e, membersListBanner.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MembersListBanner(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", id=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
