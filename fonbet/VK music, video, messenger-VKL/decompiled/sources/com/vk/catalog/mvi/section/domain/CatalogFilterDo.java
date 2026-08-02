package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.qoy;

/* compiled from: CatalogFilterDo.kt */
/* loaded from: classes16.dex */
public final class CatalogFilterDo implements Parcelable {
    public static final Parcelable.Creator<CatalogFilterDo> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final List<CatalogFilterOptionDo> f;

    /* compiled from: CatalogFilterDo.kt */
    public static final class a implements Parcelable.Creator<CatalogFilterDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogFilterDo createFromParcel(Parcel parcel) {
            int i;
            String readString = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(CatalogFilterOptionDo.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogFilterDo(readString, z, valueOf, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogFilterDo[] newArray(int i) {
            return new CatalogFilterDo[i];
        }
    }

    public CatalogFilterDo(String str, boolean z, Integer num, String str2, List<CatalogFilterOptionDo> list) {
        this.b = str;
        this.c = z;
        this.d = num;
        this.e = str2;
        this.f = list;
    }

    public final Integer d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<CatalogFilterOptionDo> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogFilterDo)) {
            return false;
        }
        CatalogFilterDo catalogFilterDo = (CatalogFilterDo) obj;
        return epx.f(this.b, catalogFilterDo.b) && this.c == catalogFilterDo.c && epx.f(this.d, catalogFilterDo.d) && epx.f(this.e, catalogFilterDo.e) && epx.f(this.f, catalogFilterDo.f);
    }

    public final boolean f() {
        return this.c;
    }

    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CatalogFilterOptionDo> list = this.f;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogFilterDo(title=");
        sb.append(this.b);
        sb.append(", isSelected=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", replacementId=");
        sb.append(this.e);
        sb.append(", options=");
        return ms9.a(')', sb, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.e);
        List<CatalogFilterOptionDo> list = this.f;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogFilterOptionDo) f.next()).writeToParcel(parcel, i);
        }
    }
}
