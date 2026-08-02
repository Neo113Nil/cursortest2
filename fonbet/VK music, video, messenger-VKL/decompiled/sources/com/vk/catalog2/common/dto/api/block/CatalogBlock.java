package com.vk.catalog2.common.dto.api.block;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.BuildConfig;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogGroupCategoryItem;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.video.CatalogPinnedVideoInfo;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;
import xsna.jgp;
import xsna.urd0;
import xsna.v11;
import xsna.zcl;
import xsna.znk0;

/* compiled from: CatalogBlock.kt */
/* loaded from: classes16.dex */
public final class CatalogBlock extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogBlock> CREATOR = new a();
    public final String b;
    public final CatalogDataType c;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final CatalogBadge h;
    public final CatalogLayout i;
    public final ArrayList<CatalogButton> j;
    public final String k;
    public final List<String> l;
    public final CatalogBlockItemsData m;
    public final String n;
    public final Map<String, CatalogBadge> o;
    public final Meta p;
    public final String q;
    public final String r;
    public final CatalogBlockStatInfo s;
    public final List<CatalogArtistInfo> t;
    public final List<CatalogBlockAnchorInfo> u;
    public final List<CatalogPinnedVideoInfo> v;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBlock a(Serializer serializer) {
            String str;
            CatalogDataType catalogDataType;
            String str2;
            Map map;
            String H = serializer.H();
            CatalogDataType I = znk0.I(serializer.H());
            String H2 = serializer.H();
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            String H4 = serializer.H();
            String H5 = serializer.H();
            CatalogBadge catalogBadge = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
            CatalogLayout catalogLayout = (CatalogLayout) serializer.G(CatalogLayout.class.getClassLoader());
            ArrayList k = serializer.k(CatalogButton.class);
            if (k == null) {
                k = new ArrayList();
            }
            String H6 = serializer.H();
            ArrayList arrayList = k;
            ArrayList a = com.vk.core.serialize.a.a(serializer);
            CatalogBlockItemsData catalogBlockItemsData = (CatalogBlockItemsData) serializer.G(CatalogBlockItemsData.class.getClassLoader());
            String H7 = serializer.H();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    str = H;
                    map = new LinkedHashMap();
                    catalogDataType = I;
                    int i = 0;
                    while (i < u) {
                        int i2 = i;
                        String H8 = serializer.H();
                        String str3 = H2;
                        CatalogBadge catalogBadge2 = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
                        if (H8 != null && catalogBadge2 != null) {
                            map.put(H8, catalogBadge2);
                        }
                        i = i2 + 1;
                        H2 = str3;
                    }
                    str2 = H2;
                } else {
                    str = H;
                    catalogDataType = I;
                    str2 = H2;
                    map = jgp.b;
                }
                return new CatalogBlock(str, catalogDataType, str2, H3, H4, H5, catalogBadge, catalogLayout, arrayList, H6, a, catalogBlockItemsData, H7, map, (Meta) serializer.G(Meta.class.getClassLoader()), serializer.H(), serializer.H(), null, serializer.B(CatalogArtistInfo.class.getClassLoader()), serializer.B(CatalogBlockAnchorInfo.class.getClassLoader()), serializer.B(CatalogPinnedVideoInfo.class.getClassLoader()), 131072, null);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBlock[i];
        }
    }

    public CatalogBlock(String str, CatalogDataType catalogDataType, String str2, String str3, String str4, String str5, CatalogBadge catalogBadge, CatalogLayout catalogLayout, ArrayList arrayList, String str6, List list, CatalogBlockItemsData catalogBlockItemsData, String str7, Map map, Meta meta, String str8, String str9, CatalogBlockStatInfo catalogBlockStatInfo, List list2, List list3, List list4, int i, zcl zclVar) {
        this(str, catalogDataType, (i & 4) != 0 ? str : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : catalogBadge, catalogLayout, (i & 256) != 0 ? new ArrayList() : arrayList, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? new ArrayList() : list, (i & 2048) != 0 ? new CatalogBlockItemsData(catalogDataType, null, null, null, null, null, null, null, null, null, null, null, 4094, null) : catalogBlockItemsData, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? jgp.b : map, (i & 16384) != 0 ? null : meta, (32768 & i) != 0 ? null : str8, (65536 & i) != 0 ? BuildConfig.FLAVOR : str9, (131072 & i) != 0 ? null : catalogBlockStatInfo, (262144 & i) != 0 ? EmptyList.b : list2, (524288 & i) != 0 ? EmptyList.b : list3, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? EmptyList.b : list4);
    }

    public static CatalogBlock zb(CatalogBlock catalogBlock, CatalogDataType catalogDataType, CatalogLayout catalogLayout, CatalogBlockItemsData catalogBlockItemsData, int i) {
        String str = catalogBlock.b;
        CatalogDataType catalogDataType2 = (i & 2) != 0 ? catalogBlock.c : catalogDataType;
        String str2 = catalogBlock.d;
        CatalogDataType catalogDataType3 = catalogDataType2;
        String str3 = catalogBlock.e;
        String str4 = catalogBlock.f;
        String str5 = catalogBlock.g;
        CatalogBadge catalogBadge = catalogBlock.h;
        CatalogLayout catalogLayout2 = (i & 128) != 0 ? catalogBlock.i : catalogLayout;
        ArrayList<CatalogButton> arrayList = catalogBlock.j;
        CatalogLayout catalogLayout3 = catalogLayout2;
        String str6 = catalogBlock.k;
        List<String> list = catalogBlock.l;
        CatalogBlockItemsData catalogBlockItemsData2 = (i & 2048) != 0 ? catalogBlock.m : catalogBlockItemsData;
        String str7 = catalogBlock.n;
        Map<String, CatalogBadge> map = catalogBlock.o;
        Meta meta = catalogBlock.p;
        CatalogBlockItemsData catalogBlockItemsData3 = catalogBlockItemsData2;
        String str8 = catalogBlock.q;
        String str9 = catalogBlock.r;
        CatalogBlockStatInfo catalogBlockStatInfo = catalogBlock.s;
        List<CatalogArtistInfo> list2 = catalogBlock.t;
        List<CatalogBlockAnchorInfo> list3 = catalogBlock.u;
        List<CatalogPinnedVideoInfo> list4 = catalogBlock.v;
        catalogBlock.getClass();
        return new CatalogBlock(str, catalogDataType3, str2, str3, str4, str5, catalogBadge, catalogLayout3, arrayList, str6, list, catalogBlockItemsData3, str7, map, meta, str8, str9, catalogBlockStatInfo, list2, list3, list4);
    }

    public final String Ab() {
        return this.q;
    }

    public final ArrayList<CatalogButton> Bb() {
        return this.j;
    }

    public final String Cb() {
        return this.n;
    }

    public final CatalogButton Db(String str) {
        CatalogGroupCategoryItem catalogGroupCategoryItem;
        CatalogBlockItemsData catalogBlockItemsData = this.m;
        if (CatalogBlockItemsData.j.$EnumSwitchMapping$0[catalogBlockItemsData.b.ordinal()] != 6 || (catalogGroupCategoryItem = catalogBlockItemsData.h.get(str)) == null) {
            return null;
        }
        return catalogGroupCategoryItem.c;
    }

    public final Map<String, CatalogBadge> Eb() {
        return this.o;
    }

    public final List<String> Fb() {
        return this.m.c;
    }

    public final ArrayList Gb(CatalogExtendedData catalogExtendedData) {
        List<String> list = this.m.c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object Ab = catalogExtendedData.Ab(this.c, (String) it.next());
            if (Ab != null) {
                arrayList.add(Ab);
            }
        }
        return arrayList;
    }

    public final ArrayList Hb(CatalogExtendedData catalogExtendedData, CatalogDataType catalogDataType) {
        List<String> list = this.m.c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object Ab = catalogExtendedData.Ab(catalogDataType, (String) it.next());
            if (Ab != null) {
                arrayList.add(Ab);
            }
        }
        return arrayList;
    }

    public final List<String> Ib() {
        return this.m.j;
    }

    public final String Jb() {
        return this.r;
    }

    public final CatalogViewType Kb() {
        return this.i.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c.getId());
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.W(this.j);
        serializer.j0(this.k);
        serializer.l0(this.l);
        serializer.i0(this.m);
        serializer.j0(this.n);
        Map<String, CatalogBadge> map = this.o;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.j0((String) entry.getKey());
                serializer.i0((Serializer.StreamParcelable) entry.getValue());
            }
        }
        serializer.i0(this.p);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.f0(this.t);
        serializer.f0(this.u);
        serializer.f0(this.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlock)) {
            return false;
        }
        CatalogBlock catalogBlock = (CatalogBlock) obj;
        return epx.f(this.b, catalogBlock.b) && this.c == catalogBlock.c && epx.f(this.d, catalogBlock.d) && epx.f(this.e, catalogBlock.e) && epx.f(this.f, catalogBlock.f) && epx.f(this.g, catalogBlock.g) && epx.f(this.h, catalogBlock.h) && epx.f(this.i, catalogBlock.i) && epx.f(this.j, catalogBlock.j) && epx.f(this.k, catalogBlock.k) && epx.f(this.l, catalogBlock.l) && epx.f(this.m, catalogBlock.m) && epx.f(this.n, catalogBlock.n) && epx.f(this.o, catalogBlock.o) && epx.f(this.p, catalogBlock.p) && epx.f(this.q, catalogBlock.q) && epx.f(this.r, catalogBlock.r) && epx.f(this.s, catalogBlock.s) && epx.f(this.t, catalogBlock.t) && epx.f(this.u, catalogBlock.u) && epx.f(this.v, catalogBlock.v);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CatalogBadge catalogBadge = this.h;
        int hashCode3 = (this.j.hashCode() + ((this.i.hashCode() + ((hashCode2 + (catalogBadge == null ? 0 : catalogBadge.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.k;
        int hashCode4 = (this.m.hashCode() + fw3.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.l)) * 31;
        String str4 = this.n;
        int a3 = v11.a((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.o);
        Meta meta = this.p;
        int hashCode5 = (a3 + (meta == null ? 0 : meta.hashCode())) * 31;
        String str5 = this.q;
        int a4 = urd0.a((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.r);
        CatalogBlockStatInfo catalogBlockStatInfo = this.s;
        return this.v.hashCode() + fw3.a(fw3.a((a4 + (catalogBlockStatInfo != null ? catalogBlockStatInfo.hashCode() : 0)) * 31, 31, this.t), 31, this.u);
    }

    public final String toString() {
        return this.c + ' ' + this.i.b + " items:" + this.m.c.size();
    }

    public CatalogBlock(String str, CatalogDataType catalogDataType, String str2, String str3, String str4, String str5, CatalogBadge catalogBadge, CatalogLayout catalogLayout, ArrayList<CatalogButton> arrayList, String str6, List<String> list, CatalogBlockItemsData catalogBlockItemsData, String str7, Map<String, CatalogBadge> map, Meta meta, String str8, String str9, CatalogBlockStatInfo catalogBlockStatInfo, List<CatalogArtistInfo> list2, List<CatalogBlockAnchorInfo> list3, List<CatalogPinnedVideoInfo> list4) {
        this.b = str;
        this.c = catalogDataType;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = catalogBadge;
        this.i = catalogLayout;
        this.j = arrayList;
        this.k = str6;
        this.l = list;
        this.m = catalogBlockItemsData;
        this.n = str7;
        this.o = map;
        this.p = meta;
        this.q = str8;
        this.r = str9;
        this.s = catalogBlockStatInfo;
        this.t = list2;
        this.u = list3;
        this.v = list4;
    }
}
