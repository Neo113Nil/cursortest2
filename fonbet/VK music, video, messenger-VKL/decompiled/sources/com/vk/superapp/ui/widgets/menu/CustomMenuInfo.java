package com.vk.superapp.ui.widgets.menu;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import java.util.List;
import xsna.enx0;
import xsna.epx;
import xsna.urd0;

/* compiled from: CustomMenuInfo.kt */
/* loaded from: classes6.dex */
public final class CustomMenuInfo implements Parcelable, enx0 {
    public static final a CREATOR = new a();
    public static final CustomMenuInfo m = new CustomMenuInfo("", "", "", "", "", null, null, null, null, null, null);
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final BadgeInfo g;
    public final List<String> h;
    public final List<String> i;
    public final List<String> j;
    public final WebImage k;
    public final WebAction l;

    /* compiled from: CustomMenuInfo.kt */
    public static final class a implements Parcelable.Creator<CustomMenuInfo> {
        @Override // android.os.Parcelable.Creator
        public final CustomMenuInfo createFromParcel(Parcel parcel) {
            return new CustomMenuInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CustomMenuInfo[] newArray(int i) {
            return new CustomMenuInfo[i];
        }
    }

    public CustomMenuInfo(String str, String str2, String str3, String str4, String str5, BadgeInfo badgeInfo, List<String> list, List<String> list2, List<String> list3, WebImage webImage, WebAction webAction) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = badgeInfo;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = webImage;
        this.l = webAction;
    }

    public static CustomMenuInfo a(CustomMenuInfo customMenuInfo, String str, String str2, BadgeInfo badgeInfo, int i) {
        String str3 = customMenuInfo.b;
        if ((i & 2) != 0) {
            str = customMenuInfo.c;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = customMenuInfo.d;
        }
        String str5 = str2;
        String str6 = customMenuInfo.e;
        String str7 = customMenuInfo.f;
        if ((i & 32) != 0) {
            badgeInfo = customMenuInfo.g;
        }
        List<String> list = customMenuInfo.h;
        List<String> list2 = customMenuInfo.i;
        List<String> list3 = customMenuInfo.j;
        WebImage webImage = customMenuInfo.k;
        WebAction webAction = customMenuInfo.l;
        customMenuInfo.getClass();
        return new CustomMenuInfo(str3, str4, str5, str6, str7, badgeInfo, list, list2, list3, webImage, webAction);
    }

    public final BadgeInfo d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMenuInfo)) {
            return false;
        }
        CustomMenuInfo customMenuInfo = (CustomMenuInfo) obj;
        return epx.f(this.b, customMenuInfo.b) && epx.f(this.c, customMenuInfo.c) && epx.f(this.d, customMenuInfo.d) && epx.f(this.e, customMenuInfo.e) && epx.f(this.f, customMenuInfo.f) && epx.f(this.g, customMenuInfo.g) && epx.f(this.h, customMenuInfo.h) && epx.f(this.i, customMenuInfo.i) && epx.f(this.j, customMenuInfo.j) && epx.f(this.k, customMenuInfo.k) && epx.f(this.l, customMenuInfo.l);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        BadgeInfo badgeInfo = this.g;
        int hashCode = (a2 + (badgeInfo == null ? 0 : badgeInfo.hashCode())) * 31;
        List<String> list = this.h;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.i;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.j;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WebImage webImage = this.k;
        int hashCode5 = (hashCode4 + (webImage == null ? 0 : webImage.b.hashCode())) * 31;
        WebAction webAction = this.l;
        return hashCode5 + (webAction != null ? webAction.hashCode() : 0);
    }

    public final String toString() {
        return "CustomMenuInfo(type=" + this.b + ", name=" + this.c + ", uid=" + this.d + ", trackCode=" + this.e + ", title=" + this.f + ", badgeInfo=" + this.g + ", titleColor=" + this.h + ", iconColor=" + this.i + ", backgroundColor=" + this.j + ", image=" + this.k + ", webAction=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeStringList(this.h);
        parcel.writeStringList(this.i);
        parcel.writeStringList(this.j);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
    }

    public CustomMenuInfo(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BadgeInfo) parcel.readParcelable(BadgeInfo.class.getClassLoader()), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
