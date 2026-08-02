package com.vk.search.ui.stat;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: SearchContext.kt */
/* loaded from: classes5.dex */
public final class SearchContext implements Parcelable {
    public static final Parcelable.Creator<SearchContext> CREATOR = new a();
    public final String b;
    public final int c;
    public final SchemeStat$EventItem.Type d;
    public final long e;
    public final String f;
    public final String g;

    /* compiled from: SearchContext.kt */
    public static final class a implements Parcelable.Creator<SearchContext> {
        @Override // android.os.Parcelable.Creator
        public final SearchContext createFromParcel(Parcel parcel) {
            return new SearchContext(parcel.readString(), parcel.readInt(), SchemeStat$EventItem.Type.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchContext[] newArray(int i) {
            return new SearchContext[i];
        }
    }

    public SearchContext(String str, int i, SchemeStat$EventItem.Type type, long j, String str2, String str3) {
        this.b = str;
        this.c = i;
        this.d = type;
        this.e = j;
        this.f = str2;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchContext)) {
            return false;
        }
        SearchContext searchContext = (SearchContext) obj;
        return epx.f(this.b, searchContext.b) && this.c == searchContext.c && this.d == searchContext.d && this.e == searchContext.e && epx.f(this.f, searchContext.f) && epx.f(this.g, searchContext.g);
    }

    public final int hashCode() {
        String str = this.b;
        int a2 = bh10.a((this.d.hashCode() + shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchContext(query=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", blockName=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public /* synthetic */ SearchContext(String str, int i, SchemeStat$EventItem.Type type, long j, String str2, String str3, int i2, zcl zclVar) {
        this(str, i, type, j, str2, (i2 & 32) != 0 ? null : str3);
    }
}
