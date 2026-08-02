package com.vk.dzenarticle.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleItem;
import com.vk.feed.core.models.NewsfeedResearch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.qoy;
import xsna.urd0;

/* compiled from: DzenArticle.kt */
/* loaded from: classes18.dex */
public final class DzenArticle implements Parcelable {
    public static final Parcelable.Creator<DzenArticle> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final Integer h;
    public final List<ArticleItem> i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final NewsfeedResearch n;

    /* compiled from: DzenArticle.kt */
    public static final class a implements Parcelable.Creator<DzenArticle> {
        @Override // android.os.Parcelable.Creator
        public final DzenArticle createFromParcel(Parcel parcel) {
            int i;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt = parcel.readInt();
            Integer num = valueOf;
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = bo.b(DzenArticle.class, parcel, arrayList, i, 1);
            }
            return new DzenArticle(readString, readString2, readString3, readString4, readString5, z, num, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (NewsfeedResearch) parcel.readParcelable(DzenArticle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DzenArticle[] newArray(int i) {
            return new DzenArticle[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DzenArticle(String str, String str2, String str3, String str4, String str5, boolean z, Integer num, List<? extends ArticleItem> list, String str6, String str7, String str8, String str9, NewsfeedResearch newsfeedResearch) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = num;
        this.i = list;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = newsfeedResearch;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DzenArticle)) {
            return false;
        }
        DzenArticle dzenArticle = (DzenArticle) obj;
        return epx.f(this.b, dzenArticle.b) && epx.f(this.c, dzenArticle.c) && epx.f(this.d, dzenArticle.d) && epx.f(this.e, dzenArticle.e) && epx.f(this.f, dzenArticle.f) && this.g == dzenArticle.g && epx.f(this.h, dzenArticle.h) && epx.f(this.i, dzenArticle.i) && epx.f(this.j, dzenArticle.j) && epx.f(this.k, dzenArticle.k) && epx.f(this.l, dzenArticle.l) && epx.f(this.m, dzenArticle.m) && epx.f(this.n, dzenArticle.n);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        int a2 = urd0.a(urd0.a(urd0.a(fw3.a((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        String str = this.m;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        NewsfeedResearch newsfeedResearch = this.n;
        return hashCode + (newsfeedResearch != null ? newsfeedResearch.hashCode() : 0);
    }

    public final String toString() {
        return "DzenArticle(id=" + this.b + ", publisherId=" + this.c + ", title=" + this.d + ", originalUrl=" + this.e + ", publishedDateText=" + this.f + ", isBanned=" + this.g + ", viewsCount=" + this.h + ", contentItems=" + this.i + ", publisherName=" + this.j + ", publisherSubtitle=" + this.k + ", publisherDescription=" + this.l + ", publisherLogoUrl=" + this.m + ", research=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        Integer num = this.h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Iterator a2 = ao.a(parcel, this.i);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeParcelable(this.n, i);
    }
}
