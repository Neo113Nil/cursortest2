package com.vk.dto.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.feed.core.models.NewsfeedResearch;
import xsna.epx;

/* compiled from: DzenArticleBlockItem.kt */
/* loaded from: classes18.dex */
public final class DzenArticleBlockItem implements Parcelable {
    public static final Parcelable.Creator<DzenArticleBlockItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final NewsfeedResearch g;

    /* compiled from: DzenArticleBlockItem.kt */
    public static final class a implements Parcelable.Creator<DzenArticleBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final DzenArticleBlockItem createFromParcel(Parcel parcel) {
            return new DzenArticleBlockItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (NewsfeedResearch) parcel.readParcelable(DzenArticleBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DzenArticleBlockItem[] newArray(int i) {
            return new DzenArticleBlockItem[i];
        }
    }

    public DzenArticleBlockItem(String str, String str2, String str3, String str4, String str5, NewsfeedResearch newsfeedResearch) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = newsfeedResearch;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DzenArticleBlockItem)) {
            return false;
        }
        DzenArticleBlockItem dzenArticleBlockItem = (DzenArticleBlockItem) obj;
        return epx.f(this.b, dzenArticleBlockItem.b) && epx.f(this.c, dzenArticleBlockItem.c) && epx.f(this.d, dzenArticleBlockItem.d) && epx.f(this.e, dzenArticleBlockItem.e) && epx.f(this.f, dzenArticleBlockItem.f) && epx.f(this.g, dzenArticleBlockItem.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NewsfeedResearch newsfeedResearch = this.g;
        return hashCode5 + (newsfeedResearch != null ? newsfeedResearch.hashCode() : 0);
    }

    public final String toString() {
        return "DzenArticleBlockItem(id=" + this.b + ", title=" + this.c + ", trackCode=" + this.d + ", imageUrl=" + this.e + ", buttonText=" + this.f + ", research=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
    }
}
