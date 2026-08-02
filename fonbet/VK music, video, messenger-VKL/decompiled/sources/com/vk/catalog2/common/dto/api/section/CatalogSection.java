package com.vk.catalog2.common.dto.api.section;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;
import xsna.znk0;

/* compiled from: CatalogSection.kt */
/* loaded from: classes16.dex */
public final class CatalogSection extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSection> CREATOR = new a();
    public static final CatalogSection p;
    public final String b;
    public final CatalogDataType c;
    public final String d;
    public final String e;
    public final String f;
    public final CatalogBadge g;
    public final List<String> h;
    public final List<CatalogBlock> i;
    public final List<CatalogButton> j;
    public final CatalogHint k;
    public final CatalogSectionStyle l;
    public final CatalogHeaderStyle m;
    public final CatalogAdBanner n;
    public final String o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogSection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSection a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            CatalogDataType I = H2 != null ? znk0.I(H2) : null;
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            CatalogBadge catalogBadge = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
            ArrayList a = com.vk.core.serialize.a.a(serializer);
            ArrayList k = serializer.k(CatalogBlock.class);
            if (k == null) {
                k = new ArrayList();
            }
            ArrayList k2 = serializer.k(CatalogButton.class);
            if (k2 == null) {
                k2 = new ArrayList();
            }
            return new CatalogSection(H, I, H3, H4, H5, catalogBadge, a, k, k2, (CatalogHint) serializer.A(CatalogHint.class.getClassLoader()), (CatalogSectionStyle) serializer.G(CatalogSectionStyle.class.getClassLoader()), (CatalogHeaderStyle) serializer.G(CatalogHeaderStyle.class.getClassLoader()), (CatalogAdBanner) serializer.G(CatalogAdBanner.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSection[i];
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        p = new CatalogSection("", null, "empty_section", null, null, null, emptyList, new ArrayList(), emptyList, null, null, null, null, null);
    }

    public /* synthetic */ CatalogSection(String str, CatalogDataType catalogDataType, String str2, String str3, String str4, CatalogBadge catalogBadge, List list, List list2, List list3, CatalogHint catalogHint, CatalogSectionStyle catalogSectionStyle, CatalogHeaderStyle catalogHeaderStyle, CatalogAdBanner catalogAdBanner, String str5, int i, zcl zclVar) {
        this(str, catalogDataType, str2, str3, str4, catalogBadge, list, list2, list3, catalogHint, (i & 1024) != 0 ? null : catalogSectionStyle, (i & 2048) != 0 ? null : catalogHeaderStyle, (i & 4096) != 0 ? null : catalogAdBanner, (i & 8192) != 0 ? null : str5);
    }

    public static CatalogSection zb(CatalogSection catalogSection, String str, CatalogBadge catalogBadge, List list, List list2, int i) {
        String str2 = (i & 1) != 0 ? catalogSection.b : str;
        CatalogDataType catalogDataType = catalogSection.c;
        String str3 = catalogSection.d;
        String str4 = catalogSection.e;
        String str5 = catalogSection.f;
        CatalogBadge catalogBadge2 = (i & 32) != 0 ? catalogSection.g : catalogBadge;
        List list3 = (i & 64) != 0 ? catalogSection.h : list;
        List list4 = (i & 128) != 0 ? catalogSection.i : list2;
        List<CatalogButton> list5 = catalogSection.j;
        CatalogHint catalogHint = catalogSection.k;
        CatalogSectionStyle catalogSectionStyle = catalogSection.l;
        CatalogHeaderStyle catalogHeaderStyle = catalogSection.m;
        CatalogAdBanner catalogAdBanner = catalogSection.n;
        String str6 = catalogSection.o;
        catalogSection.getClass();
        return new CatalogSection(str2, catalogDataType, str3, str4, str5, catalogBadge2, list3, list4, list5, catalogHint, catalogSectionStyle, catalogHeaderStyle, catalogAdBanner, str6);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        CatalogDataType catalogDataType = this.c;
        serializer.j0(catalogDataType != null ? catalogDataType.getId() : null);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.l0(this.h);
        serializer.W(this.i);
        serializer.W(this.j);
        serializer.e0(this.k);
        serializer.i0(this.l);
        serializer.i0(this.m);
        serializer.i0(this.n);
        serializer.j0(this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSection)) {
            return false;
        }
        CatalogSection catalogSection = (CatalogSection) obj;
        return epx.f(this.b, catalogSection.b) && this.c == catalogSection.c && epx.f(this.d, catalogSection.d) && epx.f(this.e, catalogSection.e) && epx.f(this.f, catalogSection.f) && epx.f(this.g, catalogSection.g) && epx.f(this.h, catalogSection.h) && epx.f(this.i, catalogSection.i) && epx.f(this.j, catalogSection.j) && epx.f(this.k, catalogSection.k) && epx.f(this.l, catalogSection.l) && epx.f(this.m, catalogSection.m) && epx.f(this.n, catalogSection.n) && epx.f(this.o, catalogSection.o);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CatalogDataType catalogDataType = this.c;
        int a2 = urd0.a((hashCode + (catalogDataType == null ? 0 : catalogDataType.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CatalogBadge catalogBadge = this.g;
        int a3 = fw3.a(fw3.a(fw3.a((hashCode3 + (catalogBadge == null ? 0 : catalogBadge.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        CatalogHint catalogHint = this.k;
        int hashCode4 = (a3 + (catalogHint == null ? 0 : catalogHint.hashCode())) * 31;
        CatalogSectionStyle catalogSectionStyle = this.l;
        int hashCode5 = (hashCode4 + (catalogSectionStyle == null ? 0 : catalogSectionStyle.hashCode())) * 31;
        CatalogHeaderStyle catalogHeaderStyle = this.m;
        int hashCode6 = (hashCode5 + (catalogHeaderStyle == null ? 0 : catalogHeaderStyle.hashCode())) * 31;
        CatalogAdBanner catalogAdBanner = this.n;
        int hashCode7 = (hashCode6 + (catalogAdBanner == null ? 0 : Integer.hashCode(catalogAdBanner.b))) * 31;
        String str3 = this.o;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSection(id=");
        sb.append(this.b);
        sb.append(", dataType=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        sb.append(this.e);
        sb.append(", urlToThisSection=");
        sb.append(this.f);
        sb.append(", badge=");
        sb.append(this.g);
        sb.append(", reactOnEvents=");
        sb.append(this.h);
        sb.append(", blocks=");
        sb.append(this.i);
        sb.append(", buttons=");
        sb.append(this.j);
        sb.append(", hint=");
        sb.append(this.k);
        sb.append(", style=");
        sb.append(this.l);
        sb.append(", catalogHeaderStyle=");
        sb.append(this.m);
        sb.append(", adBanner=");
        sb.append(this.n);
        sb.append(", iconUrl=");
        return ho8.a(sb, this.o, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSection(String str, CatalogDataType catalogDataType, String str2, String str3, String str4, CatalogBadge catalogBadge, List<String> list, List<CatalogBlock> list2, List<? extends CatalogButton> list3, CatalogHint catalogHint, CatalogSectionStyle catalogSectionStyle, CatalogHeaderStyle catalogHeaderStyle, CatalogAdBanner catalogAdBanner, String str5) {
        this.b = str;
        this.c = catalogDataType;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = catalogBadge;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = catalogHint;
        this.l = catalogSectionStyle;
        this.m = catalogHeaderStyle;
        this.n = catalogAdBanner;
        this.o = str5;
    }
}
