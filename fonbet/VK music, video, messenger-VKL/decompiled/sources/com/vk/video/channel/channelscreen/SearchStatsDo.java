package com.vk.video.channel.channelscreen;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.search.ui.stat.SearchContext;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ChannelScreenArgs.kt */
/* loaded from: classes5.dex */
public final class SearchStatsDo implements Parcelable {
    public static final Parcelable.Creator<SearchStatsDo> CREATOR = new a();
    public final SearchContext b;
    public final String c;
    public final boolean d;
    public final boolean e;

    /* compiled from: ChannelScreenArgs.kt */
    public static final class a implements Parcelable.Creator<SearchStatsDo> {
        @Override // android.os.Parcelable.Creator
        public final SearchStatsDo createFromParcel(Parcel parcel) {
            return new SearchStatsDo((SearchContext) parcel.readParcelable(SearchStatsDo.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchStatsDo[] newArray(int i) {
            return new SearchStatsDo[i];
        }
    }

    public SearchStatsDo(SearchContext searchContext, String str, boolean z, boolean z2) {
        this.b = searchContext;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchStatsDo)) {
            return false;
        }
        SearchStatsDo searchStatsDo = (SearchStatsDo) obj;
        return epx.f(this.b, searchStatsDo.b) && epx.f(this.c, searchStatsDo.c) && this.d == searchStatsDo.d && this.e == searchStatsDo.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchStatsDo(searchContext=");
        sb.append(this.b);
        sb.append(", refScreenName=");
        sb.append(this.c);
        sb.append(", isFromDeepScreen=");
        sb.append(this.d);
        sb.append(", isFurtherProvidingRestricted=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
