package com.vk.superapp.api.dto.app.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import xsna.epx;
import xsna.urd0;

/* compiled from: SectionAppItem.kt */
/* loaded from: classes6.dex */
public final class SectionAppItem implements Parcelable {
    public static final Parcelable.Creator<SectionAppItem> CREATOR = new a();
    public final WebApiApplication b;
    public final String c;
    public final String d;
    public final BadgeInfo e;
    public final String f;
    public final UserStack g;

    /* compiled from: SectionAppItem.kt */
    public static final class a implements Parcelable.Creator<SectionAppItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionAppItem createFromParcel(Parcel parcel) {
            return new SectionAppItem((WebApiApplication) parcel.readParcelable(SectionAppItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (BadgeInfo) parcel.readParcelable(SectionAppItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : UserStack.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionAppItem[] newArray(int i) {
            return new SectionAppItem[i];
        }
    }

    public SectionAppItem(WebApiApplication webApiApplication, String str, String str2, BadgeInfo badgeInfo, String str3, UserStack userStack) {
        this.b = webApiApplication;
        this.c = str;
        this.d = str2;
        this.e = badgeInfo;
        this.f = str3;
        this.g = userStack;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionAppItem)) {
            return false;
        }
        SectionAppItem sectionAppItem = (SectionAppItem) obj;
        return epx.f(this.b, sectionAppItem.b) && epx.f(this.c, sectionAppItem.c) && epx.f(this.d, sectionAppItem.d) && epx.f(this.e, sectionAppItem.e) && epx.f(this.f, sectionAppItem.f) && epx.f(this.g, sectionAppItem.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(((int) this.b.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        BadgeInfo badgeInfo = this.e;
        int a3 = urd0.a((hashCode + (badgeInfo == null ? 0 : badgeInfo.hashCode())) * 31, 31, this.f);
        UserStack userStack = this.g;
        return a3 + (userStack != null ? userStack.hashCode() : 0);
    }

    public final String toString() {
        return "SectionAppItem(app=" + this.b + ", webViewUrl=" + this.c + ", uid=" + this.d + ", badgeInfo=" + this.e + ", sectionTrackCode=" + this.f + ", userStack=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        UserStack userStack = this.g;
        if (userStack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userStack.writeToParcel(parcel, i);
        }
    }
}
