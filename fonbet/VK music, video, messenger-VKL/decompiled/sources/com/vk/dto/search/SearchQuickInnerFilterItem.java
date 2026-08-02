package com.vk.dto.search;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: SearchQuickInnerFilterItem.kt */
/* loaded from: classes18.dex */
public final class SearchQuickInnerFilterItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchQuickInnerFilterItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchQuickInnerFilterItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchQuickInnerFilterItem a(Serializer serializer) {
            return new SearchQuickInnerFilterItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchQuickInnerFilterItem[i];
        }
    }

    public SearchQuickInnerFilterItem(String str, String str2, String str3, String str4, Integer num, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = z;
        this.h = z2;
        this.i = str5;
        this.j = z3;
        this.k = z4;
        this.l = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.V(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.j0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchQuickInnerFilterItem)) {
            return false;
        }
        SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) obj;
        return epx.f(this.b, searchQuickInnerFilterItem.b) && epx.f(this.c, searchQuickInnerFilterItem.c) && epx.f(this.d, searchQuickInnerFilterItem.d) && epx.f(this.e, searchQuickInnerFilterItem.e) && epx.f(this.f, searchQuickInnerFilterItem.f) && this.g == searchQuickInnerFilterItem.g && this.h == searchQuickInnerFilterItem.h && epx.f(this.i, searchQuickInnerFilterItem.i) && this.j == searchQuickInnerFilterItem.j && this.k == searchQuickInnerFilterItem.k && epx.f(this.l, searchQuickInnerFilterItem.l);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return this.l.hashCode() + qoy.b(qoy.b(urd0.a(qoy.b(qoy.b((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchQuickInnerFilterItem(title=");
        sb.append(this.b);
        sb.append(", filterParameter=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", filterValue=");
        sb.append(this.e);
        sb.append(", filterValueInt=");
        sb.append(this.f);
        sb.append(", isSelected=");
        sb.append(this.g);
        sb.append(", isDefault=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(", isEnabled=");
        sb.append(this.j);
        sb.append(", hideTitle=");
        sb.append(this.k);
        sb.append(", icon=");
        return ho8.a(sb, this.l, ')');
    }

    public SearchQuickInnerFilterItem(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), Integer.valueOf(serializer.u()), serializer.m(), serializer.m(), serializer.H(), serializer.m(), serializer.m(), serializer.H());
    }
}
