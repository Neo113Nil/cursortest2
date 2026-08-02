package com.vk.superapp.api.dto.app.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pm0;
import xsna.urd0;

/* compiled from: CustomItem.kt */
/* loaded from: classes6.dex */
public final class CustomItem implements Parcelable {
    public static final Parcelable.Creator<CustomItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<Integer> d;
    public final List<Integer> e;
    public final List<Integer> f;
    public final List<Integer> g;
    public final String h;
    public final WebImage i;
    public final WebAction j;
    public final BadgeInfo k;
    public final String l;

    /* compiled from: CustomItem.kt */
    public static final class a implements Parcelable.Creator<CustomItem> {
        @Override // android.os.Parcelable.Creator
        public final CustomItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList3 = null;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = pm0.b(parcel, arrayList4, i3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = pm0.b(parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = pm0.b(parcel, arrayList3, i, 1);
                }
            }
            return new CustomItem(readString, readString2, arrayList, arrayList4, arrayList2, arrayList3, parcel.readString(), (WebImage) parcel.readParcelable(CustomItem.class.getClassLoader()), (WebAction) parcel.readParcelable(CustomItem.class.getClassLoader()), (BadgeInfo) parcel.readParcelable(CustomItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomItem[] newArray(int i) {
            return new CustomItem[i];
        }
    }

    public CustomItem(String str, String str2, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, String str3, WebImage webImage, WebAction webAction, BadgeInfo badgeInfo, String str4) {
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = str3;
        this.i = webImage;
        this.j = webAction;
        this.k = badgeInfo;
        this.l = str4;
    }

    public static CustomItem a(CustomItem customItem, BadgeInfo badgeInfo) {
        return new CustomItem(customItem.b, customItem.c, customItem.d, customItem.e, customItem.f, customItem.g, customItem.h, customItem.i, customItem.j, badgeInfo, customItem.l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomItem)) {
            return false;
        }
        CustomItem customItem = (CustomItem) obj;
        return epx.f(this.b, customItem.b) && epx.f(this.c, customItem.c) && epx.f(this.d, customItem.d) && epx.f(this.e, customItem.e) && epx.f(this.f, customItem.f) && epx.f(this.g, customItem.g) && epx.f(this.h, customItem.h) && epx.f(this.i, customItem.i) && epx.f(this.j, customItem.j) && epx.f(this.k, customItem.k) && epx.f(this.l, customItem.l);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.d;
        int a2 = fw3.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        List<Integer> list2 = this.f;
        int hashCode3 = (a2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.g;
        int hashCode4 = (this.j.hashCode() + fw3.a(urd0.a((hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.h), 31, this.i.b)) * 31;
        BadgeInfo badgeInfo = this.k;
        return this.l.hashCode() + ((hashCode4 + (badgeInfo != null ? badgeInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomItem(uid=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", iconColor=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        sb.append(this.e);
        sb.append(", borderColor=");
        sb.append(this.f);
        sb.append(", titleColor=");
        sb.append(this.g);
        sb.append(", title=");
        sb.append(this.h);
        sb.append(", icon=");
        sb.append(this.i);
        sb.append(", action=");
        sb.append(this.j);
        sb.append(", badgeInfo=");
        sb.append(this.k);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        List<Integer> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        List<Integer> list2 = this.f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        List<Integer> list3 = this.g;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeInt(((Number) f3.next()).intValue());
            }
        }
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeString(this.l);
    }
}
