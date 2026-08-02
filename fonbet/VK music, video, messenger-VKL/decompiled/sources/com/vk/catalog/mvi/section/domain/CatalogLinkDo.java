package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;

/* compiled from: CatalogLinkDo.kt */
/* loaded from: classes16.dex */
public final class CatalogLinkDo implements Parcelable {
    public static final Parcelable.Creator<CatalogLinkDo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final List<CatalogImageDo> e;
    public final String f;
    public final String g;

    /* compiled from: CatalogLinkDo.kt */
    public static final class a implements Parcelable.Creator<CatalogLinkDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogLinkDo createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CatalogImageDo.CREATOR, parcel, arrayList, i, 1);
            }
            return new CatalogLinkDo(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogLinkDo[] newArray(int i) {
            return new CatalogLinkDo[i];
        }
    }

    public CatalogLinkDo(String str, String str2, String str3, List<CatalogImageDo> list, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = str5;
    }

    public final String d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<CatalogImageDo> e() {
        return this.e;
    }

    public final String f() {
        return this.d;
    }

    public final String getTitle() {
        return this.c;
    }

    public final String getUrl() {
        return this.b;
    }

    public final String r() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((CatalogImageDo) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
