package com.vk.catalog2.common.dto.api;

import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogCatalog.kt */
/* loaded from: classes16.dex */
public final class CatalogCatalog extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogCatalog> CREATOR = new a();
    public final List<CatalogSection> b;
    public final String c;
    public final CatalogSection d;
    public final CatalogSection e;
    public final String f;
    public final List<CatalogButton> g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogCatalog> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogCatalog a(Serializer serializer) {
            ArrayList k = serializer.k(CatalogSection.class);
            if (k == null) {
                k = new ArrayList();
            }
            String H = serializer.H();
            CatalogSection catalogSection = (CatalogSection) serializer.G(CatalogSection.class.getClassLoader());
            CatalogSection catalogSection2 = (CatalogSection) serializer.G(CatalogSection.class.getClassLoader());
            String H2 = serializer.H();
            ArrayList k2 = serializer.k(CatalogButton.class);
            if (k2 == null) {
                k2 = new ArrayList();
            }
            return new CatalogCatalog(k, H, catalogSection, catalogSection2, H2, k2, false, 64, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogCatalog[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogCatalog(List<CatalogSection> list, String str, CatalogSection catalogSection, CatalogSection catalogSection2, String str2, List<? extends CatalogButton> list2, boolean z) {
        this.b = list;
        this.c = str;
        this.d = catalogSection;
        this.e = catalogSection2;
        this.f = str2;
        this.g = list2;
        this.h = z;
    }

    public static CatalogCatalog zb(CatalogCatalog catalogCatalog, List list, String str, int i) {
        if ((i & 1) != 0) {
            list = catalogCatalog.b;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            str = catalogCatalog.c;
        }
        String str2 = str;
        CatalogSection catalogSection = catalogCatalog.d;
        CatalogSection catalogSection2 = catalogCatalog.e;
        String str3 = catalogCatalog.f;
        List<CatalogButton> list3 = catalogCatalog.g;
        boolean z = (i & 64) != 0 ? catalogCatalog.h : true;
        catalogCatalog.getClass();
        return new CatalogCatalog(list2, str2, catalogSection, catalogSection2, str3, list3, z);
    }

    public final CatalogSection Ab() {
        Object obj;
        List<CatalogSection> list = this.b;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((CatalogSection) obj).b, this.c)) {
                break;
            }
        }
        CatalogSection catalogSection = (CatalogSection) obj;
        return catalogSection == null ? (CatalogSection) j5g.a0(list) : catalogSection;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.W(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalog)) {
            return false;
        }
        CatalogCatalog catalogCatalog = (CatalogCatalog) obj;
        return epx.f(this.b, catalogCatalog.b) && epx.f(this.c, catalogCatalog.c) && epx.f(this.d, catalogCatalog.d) && epx.f(this.e, catalogCatalog.e) && epx.f(this.f, catalogCatalog.f) && epx.f(this.g, catalogCatalog.g) && this.h == catalogCatalog.h;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        CatalogSection catalogSection = this.d;
        int hashCode = (a2 + (catalogSection == null ? 0 : catalogSection.hashCode())) * 31;
        CatalogSection catalogSection2 = this.e;
        int hashCode2 = (hashCode + (catalogSection2 == null ? 0 : catalogSection2.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.h) + fw3.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCatalog(sections=");
        sb.append(this.b);
        sb.append(", defaultSectionId=");
        sb.append(this.c);
        sb.append(", headerSection=");
        sb.append(this.d);
        sb.append(", footerSection=");
        sb.append(this.e);
        sb.append(", pinnedSectionId=");
        sb.append(this.f);
        sb.append(", buttons=");
        sb.append(this.g);
        sb.append(", isFromCache=");
        return q0.a(sb, this.h, ')');
    }

    public CatalogCatalog(List list, String str, CatalogSection catalogSection, CatalogSection catalogSection2, String str2, List list2, boolean z, int i, zcl zclVar) {
        this(list, str, catalogSection, catalogSection2, str2, (i & 32) != 0 ? EmptyList.b : list2, (i & 64) != 0 ? false : z);
    }
}
