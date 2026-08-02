package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: WebFriendsUseApp.kt */
/* loaded from: classes18.dex */
public final class WebFriendsUseApp implements Parcelable {
    public static final Parcelable.Creator<WebFriendsUseApp> CREATOR = new a();
    public final String b;
    public final List<ProfileItem> c;

    /* compiled from: WebFriendsUseApp.kt */
    public static final class a implements Parcelable.Creator<WebFriendsUseApp> {
        @Override // android.os.Parcelable.Creator
        public final WebFriendsUseApp createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ProfileItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new WebFriendsUseApp(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WebFriendsUseApp[] newArray(int i) {
            return new WebFriendsUseApp[i];
        }
    }

    public WebFriendsUseApp(String str, List<ProfileItem> list) {
        this.b = str;
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
        if (!(obj instanceof WebFriendsUseApp)) {
            return false;
        }
        WebFriendsUseApp webFriendsUseApp = (WebFriendsUseApp) obj;
        return epx.f(this.b, webFriendsUseApp.b) && epx.f(this.c, webFriendsUseApp.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebFriendsUseApp(description=");
        sb.append(this.b);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((ProfileItem) a2.next()).writeToParcel(parcel, i);
        }
    }
}
