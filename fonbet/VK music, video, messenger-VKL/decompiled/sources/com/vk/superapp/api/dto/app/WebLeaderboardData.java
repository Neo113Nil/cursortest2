package com.vk.superapp.api.dto.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.en;
import xsna.epx;
import xsna.vu5;

/* compiled from: WebLeaderboardData.kt */
/* loaded from: classes6.dex */
public final class WebLeaderboardData implements Parcelable {
    public static final Parcelable.Creator<WebLeaderboardData> CREATOR = new a();
    public final WebApiApplication b;
    public final ArrayList<WebGameLeaderboard> c;
    public final int d;

    /* compiled from: WebLeaderboardData.kt */
    public static final class a implements Parcelable.Creator<WebLeaderboardData> {
        @Override // android.os.Parcelable.Creator
        public final WebLeaderboardData createFromParcel(Parcel parcel) {
            WebApiApplication webApiApplication = (WebApiApplication) parcel.readParcelable(WebLeaderboardData.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(WebGameLeaderboard.CREATOR, parcel, arrayList, i, 1);
            }
            return new WebLeaderboardData(webApiApplication, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WebLeaderboardData[] newArray(int i) {
            return new WebLeaderboardData[i];
        }
    }

    public WebLeaderboardData(WebApiApplication webApiApplication, ArrayList<WebGameLeaderboard> arrayList, int i) {
        this.b = webApiApplication;
        this.c = arrayList;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebLeaderboardData)) {
            return false;
        }
        WebLeaderboardData webLeaderboardData = (WebLeaderboardData) obj;
        return epx.f(this.b, webLeaderboardData.b) && epx.f(this.c, webLeaderboardData.c) && this.d == webLeaderboardData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + (((int) this.b.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebLeaderboardData(apiApplication=");
        sb.append(this.b);
        sb.append(", leaderboard=");
        sb.append(this.c);
        sb.append(", userResult=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        ArrayList<WebGameLeaderboard> arrayList = this.c;
        parcel.writeInt(arrayList.size());
        Iterator<WebGameLeaderboard> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d);
    }
}
