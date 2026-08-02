package com.vk.dto.search;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;

/* compiled from: SearchQuickFilterItem.kt */
/* loaded from: classes18.dex */
public final class SearchQuickFilterItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchQuickFilterItem> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final List<SearchQuickInnerFilterItem> n;

    /* compiled from: SearchQuickFilterItem.kt */
    public static final class a {
        public static SearchQuickFilterItem a(SearchFilterItem searchFilterItem) {
            return new SearchQuickFilterItem(searchFilterItem.b, searchFilterItem.c, searchFilterItem.d, searchFilterItem.e, searchFilterItem.f, searchFilterItem.g, searchFilterItem.h, searchFilterItem.i, searchFilterItem.j, searchFilterItem.k, searchFilterItem.l, searchFilterItem.m, searchFilterItem.n);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SearchQuickFilterItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchQuickFilterItem a(Serializer serializer) {
            return new SearchQuickFilterItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchQuickFilterItem[i];
        }
    }

    public SearchQuickFilterItem(String str, String str2, String str3, String str4, String str5, Integer num, boolean z, boolean z2, String str6, boolean z3, boolean z4, String str7, List<SearchQuickInnerFilterItem> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
        this.h = z;
        this.i = z2;
        this.j = str6;
        this.k = z3;
        this.l = z4;
        this.m = str7;
        this.n = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.V(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
        serializer.W(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchQuickFilterItem)) {
            return false;
        }
        SearchQuickFilterItem searchQuickFilterItem = (SearchQuickFilterItem) obj;
        return epx.f(this.b, searchQuickFilterItem.b) && epx.f(this.c, searchQuickFilterItem.c) && epx.f(this.d, searchQuickFilterItem.d) && epx.f(this.e, searchQuickFilterItem.e) && epx.f(this.f, searchQuickFilterItem.f) && epx.f(this.g, searchQuickFilterItem.g) && this.h == searchQuickFilterItem.h && this.i == searchQuickFilterItem.i && epx.f(this.j, searchQuickFilterItem.j) && this.k == searchQuickFilterItem.k && this.l == searchQuickFilterItem.l && epx.f(this.m, searchQuickFilterItem.m) && epx.f(this.n, searchQuickFilterItem.n);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        return this.n.hashCode() + urd0.a(qoy.b(qoy.b(urd0.a(qoy.b(qoy.b((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchQuickFilterItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", filterParameter=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", filterValue=");
        sb.append(this.f);
        sb.append(", filterValueInt=");
        sb.append(this.g);
        sb.append(", filterIsSelected=");
        sb.append(this.h);
        sb.append(", filterIsDefault=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(", isEnabled=");
        sb.append(this.k);
        sb.append(", hideTitle=");
        sb.append(this.l);
        sb.append(", icon=");
        sb.append(this.m);
        sb.append(", innerFilters=");
        return ms9.a(')', sb, this.n);
    }

    public SearchQuickFilterItem(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), Integer.valueOf(serializer.u()), serializer.m(), serializer.m(), serializer.H(), serializer.m(), serializer.m(), serializer.H(), serializer.k(SearchQuickInnerFilterItem.class));
    }
}
