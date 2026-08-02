package com.vk.search.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: SearchQuery.kt */
/* loaded from: classes5.dex */
public final class SearchQuery implements Parcelable {
    public static final Parcelable.Creator<SearchQuery> CREATOR = new a();
    public final String b;
    public final SearchInputMethod c;
    public final String d;
    public final String e;

    /* compiled from: SearchQuery.kt */
    public static final class a implements Parcelable.Creator<SearchQuery> {
        @Override // android.os.Parcelable.Creator
        public final SearchQuery createFromParcel(Parcel parcel) {
            return new SearchQuery(parcel.readString(), parcel.readInt() == 0 ? null : SearchInputMethod.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchQuery[] newArray(int i) {
            return new SearchQuery[i];
        }
    }

    public SearchQuery(String str, SearchInputMethod searchInputMethod, String str2, String str3) {
        this.b = str;
        this.c = searchInputMethod;
        this.d = str2;
        this.e = str3;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchQuery)) {
            return false;
        }
        SearchQuery searchQuery = (SearchQuery) obj;
        return epx.f(this.b, searchQuery.b) && this.c == searchQuery.c && epx.f(this.d, searchQuery.d) && epx.f(this.e, searchQuery.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        SearchInputMethod searchInputMethod = this.c;
        int hashCode2 = (hashCode + (searchInputMethod == null ? 0 : searchInputMethod.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchQuery(text=");
        sb.append(this.b);
        sb.append(", inputMethod=");
        sb.append(this.c);
        sb.append(", queryContext=");
        sb.append(this.d);
        sb.append(", trackCode=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        SearchInputMethod searchInputMethod = this.c;
        if (searchInputMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(searchInputMethod.name());
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public /* synthetic */ SearchQuery(String str, SearchInputMethod searchInputMethod, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : searchInputMethod, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
