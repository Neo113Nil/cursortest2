package com.vk.catalog2.common.dto.api.block;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogGroupCategoryItem;
import com.vk.catalog2.common.dto.api.app.AppContent;
import com.vk.catalog2.common.dto.api.music.ArtistsIdsList;
import com.vk.catalog2.common.dto.api.sport.CatalogSportMatchItem;
import com.vk.core.serialize.Serializer;
import com.vk.dto.games.CatalogMiniAppItem;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupsEntityCatalogItem;
import com.vk.dto.search.SearchAuthorItem;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.cjl0;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.izs;
import xsna.jgp;
import xsna.p4g;
import xsna.s3q0;
import xsna.v11;
import xsna.vba;
import xsna.zcl;
import xsna.znk0;

/* compiled from: CatalogBlockItemsData.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockItemsData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogBlockItemsData> CREATOR = new k();
    public final CatalogDataType b;
    public final List<String> c;
    public final Map<String, GroupCatalogItem> d;
    public final Map<String, SearchAuthorItem> e;
    public final Map<String, CatalogMiniAppItem> f;
    public final Map<String, GroupsEntityCatalogItem> g;
    public final Map<String, CatalogGroupCategoryItem> h;
    public final Map<String, AppContent> i;
    public final List<String> j;
    public final Map<Long, String> k;
    public final Map<String, CatalogSportMatchItem> l;
    public final Map<String, ArtistsIdsList> m;

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class a extends PropertyReference1Impl {
        public static final a b = new a(GroupCatalogItem.class, "id", "getId()J", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Long.valueOf(((GroupCatalogItem) obj).b);
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class b extends PropertyReference1Impl {
        public static final b b = new b(SearchAuthorItem.class, "id", "getId()J", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Long.valueOf(((SearchAuthorItem) obj).b);
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class c extends PropertyReference1Impl {
        public static final c b = new c(CatalogGroupCategoryItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogGroupCategoryItem) obj).b;
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class d extends PropertyReference1Impl {
        public static final d b = new d(AppContent.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((AppContent) obj).b;
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class e extends PropertyReference1Impl {
        public static final e b = new e(CatalogSportMatchItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((CatalogSportMatchItem) obj).b;
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class f extends PropertyReference1Impl {
        public static final f b = new f(GroupCatalogItem.class, "id", "getId()J", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Long.valueOf(((GroupCatalogItem) obj).b);
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class g extends PropertyReference1Impl {
        public static final g b = new g(GroupsEntityCatalogItem.class, "id", "getId()Ljava/lang/String;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((GroupsEntityCatalogItem) obj).b;
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class h extends PropertyReference1Impl {
        public static final h b = new h(GroupCatalogItem.class, "id", "getId()J", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return Long.valueOf(((GroupCatalogItem) obj).b);
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final class i {
        public static final void a(JSONObject jSONObject, aay aayVar, String str, Map map, List list, izs izsVar) {
            ArrayList arrayList;
            Serializer.c<CatalogBlockItemsData> cVar = CatalogBlockItemsData.CREATOR;
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        try {
                            Object a = aayVar.a(optJSONObject);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (Object obj : arrayList) {
                    String valueOf = String.valueOf(izsVar.invoke(obj));
                    map.put(valueOf, obj);
                    list.add(valueOf);
                }
            }
        }
    }

    /* compiled from: CatalogBlockItemsData.kt */
    public static final /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ALL_GROUPS_OR_RECOMMENDATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MINI_APPS_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GAMES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_COLLECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LIVE_CATEGORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SPORTS_MATCHES_UPCOMING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SPORTS_MATCHES_CURRENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class k extends Serializer.c<CatalogBlockItemsData> {
        /* JADX WARN: Finally extract failed */
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBlockItemsData a(Serializer serializer) {
            Map map;
            Map map2;
            Map map3;
            Map map4;
            Map map5;
            Map map6;
            Map map7;
            Map map8;
            Map map9;
            CatalogDataType I = znk0.I(serializer.H());
            ArrayList a = com.vk.core.serialize.a.a(serializer);
            Serializer.c<CatalogBlockItemsData> cVar = CatalogBlockItemsData.CREATOR;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                Map map10 = jgp.b;
                if (u >= 0) {
                    map2 = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        Serializer.StreamParcelable G = serializer.G(GroupCatalogItem.class.getClassLoader());
                        if (H != null && G != null) {
                            map2.put(H, G);
                        }
                    }
                    map = map10;
                } else {
                    map = map10;
                    map2 = map;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                Serializer.c<CatalogBlockItemsData> cVar2 = CatalogBlockItemsData.CREATOR;
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                try {
                    int u2 = serializer.u();
                    if (u2 >= 0) {
                        map3 = new LinkedHashMap();
                        for (int i2 = 0; i2 < u2; i2++) {
                            String H2 = serializer.H();
                            Serializer.StreamParcelable G2 = serializer.G(SearchAuthorItem.class.getClassLoader());
                            if (H2 != null && G2 != null) {
                                map3.put(H2, G2);
                            }
                        }
                    } else {
                        map3 = map;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                    Serializer.c<CatalogBlockItemsData> cVar3 = CatalogBlockItemsData.CREATOR;
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                    try {
                        int u3 = serializer.u();
                        if (u3 >= 0) {
                            map4 = new LinkedHashMap();
                            for (int i3 = 0; i3 < u3; i3++) {
                                String H3 = serializer.H();
                                Serializer.StreamParcelable G3 = serializer.G(CatalogMiniAppItem.class.getClassLoader());
                                if (H3 != null && G3 != null) {
                                    map4.put(H3, G3);
                                }
                            }
                        } else {
                            map4 = map;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(map4);
                        Serializer.c<CatalogBlockItemsData> cVar4 = CatalogBlockItemsData.CREATOR;
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                        try {
                            int u4 = serializer.u();
                            if (u4 >= 0) {
                                map5 = new LinkedHashMap();
                                for (int i4 = 0; i4 < u4; i4++) {
                                    String H4 = serializer.H();
                                    Serializer.StreamParcelable G4 = serializer.G(GroupsEntityCatalogItem.class.getClassLoader());
                                    if (H4 != null && G4 != null) {
                                        map5.put(H4, G4);
                                    }
                                }
                            } else {
                                map5 = map;
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(map5);
                            Serializer.c<CatalogBlockItemsData> cVar5 = CatalogBlockItemsData.CREATOR;
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
                            try {
                                int u5 = serializer.u();
                                if (u5 >= 0) {
                                    map6 = new LinkedHashMap();
                                    for (int i5 = 0; i5 < u5; i5++) {
                                        String H5 = serializer.H();
                                        Serializer.StreamParcelable G5 = serializer.G(CatalogGroupCategoryItem.class.getClassLoader());
                                        if (H5 != null && G5 != null) {
                                            map6.put(H5, G5);
                                        }
                                    }
                                } else {
                                    map6 = map;
                                }
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap(map6);
                                Serializer.c<CatalogBlockItemsData> cVar6 = CatalogBlockItemsData.CREATOR;
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap6 = Serializer.a;
                                try {
                                    int u6 = serializer.u();
                                    if (u6 >= 0) {
                                        map7 = new LinkedHashMap();
                                        for (int i6 = 0; i6 < u6; i6++) {
                                            String H6 = serializer.H();
                                            Serializer.StreamParcelable G6 = serializer.G(AppContent.class.getClassLoader());
                                            if (H6 != null && G6 != null) {
                                                map7.put(H6, G6);
                                            }
                                        }
                                    } else {
                                        map7 = map;
                                    }
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(map7);
                                    ArrayList a2 = com.vk.core.serialize.a.a(serializer);
                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap7 = Serializer.a;
                                    try {
                                        int u7 = serializer.u();
                                        if (u7 >= 0) {
                                            map8 = new LinkedHashMap();
                                            for (int i7 = 0; i7 < u7; i7++) {
                                                Long valueOf = Long.valueOf(serializer.w());
                                                String H7 = serializer.H();
                                                if (H7 == null) {
                                                    H7 = "";
                                                }
                                                map8.put(valueOf, H7);
                                            }
                                        } else {
                                            map8 = map;
                                        }
                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(map8);
                                        Serializer.c<CatalogBlockItemsData> cVar7 = CatalogBlockItemsData.CREATOR;
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap8 = Serializer.a;
                                        try {
                                            int u8 = serializer.u();
                                            if (u8 >= 0) {
                                                map9 = new LinkedHashMap();
                                                int i8 = 0;
                                                while (i8 < u8) {
                                                    String H8 = serializer.H();
                                                    int i9 = u8;
                                                    Serializer.StreamParcelable G7 = serializer.G(CatalogSportMatchItem.class.getClassLoader());
                                                    if (H8 != null && G7 != null) {
                                                        map9.put(H8, G7);
                                                    }
                                                    i8++;
                                                    u8 = i9;
                                                }
                                            } else {
                                                map9 = map;
                                            }
                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap(map9);
                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap9 = Serializer.a;
                                            try {
                                                int u9 = serializer.u();
                                                if (u9 >= 0) {
                                                    map = new LinkedHashMap();
                                                    int i10 = 0;
                                                    while (i10 < u9) {
                                                        String H9 = serializer.H();
                                                        LinkedHashMap linkedHashMap9 = linkedHashMap8;
                                                        ArtistsIdsList artistsIdsList = (ArtistsIdsList) serializer.G(ArtistsIdsList.class.getClassLoader());
                                                        if (H9 != null && artistsIdsList != null) {
                                                            map.put(H9, artistsIdsList);
                                                        }
                                                        i10++;
                                                        linkedHashMap8 = linkedHashMap9;
                                                    }
                                                }
                                                return new CatalogBlockItemsData(I, a, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, a2, linkedHashMap7, linkedHashMap8, new LinkedHashMap(map));
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            if (th instanceof Serializer.DeserializationError) {
                                                throw th;
                                            }
                                            throw new Serializer.DeserializationError(null, th);
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th2) {
                                    if (th2 instanceof Serializer.DeserializationError) {
                                        throw th2;
                                    }
                                    throw new Serializer.DeserializationError(null, th2);
                                }
                            } catch (Throwable th3) {
                                if (th3 instanceof Serializer.DeserializationError) {
                                    throw th3;
                                }
                                throw new Serializer.DeserializationError(null, th3);
                            }
                        } catch (Throwable th4) {
                            if (th4 instanceof Serializer.DeserializationError) {
                                throw th4;
                            }
                            throw new Serializer.DeserializationError(null, th4);
                        }
                    } catch (Throwable th5) {
                        if (th5 instanceof Serializer.DeserializationError) {
                            throw th5;
                        }
                        throw new Serializer.DeserializationError(null, th5);
                    }
                } catch (Throwable th6) {
                    if (th6 instanceof Serializer.DeserializationError) {
                        throw th6;
                    }
                    throw new Serializer.DeserializationError(null, th6);
                }
            } catch (Throwable th7) {
                if (th7 instanceof Serializer.DeserializationError) {
                    throw th7;
                }
                throw new Serializer.DeserializationError(null, th7);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBlockItemsData[i];
        }
    }

    public /* synthetic */ CatalogBlockItemsData(CatalogDataType catalogDataType, List list, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, List list2, Map map7, Map map8, Map map9, int i2, zcl zclVar) {
        this(catalogDataType, (i2 & 2) != 0 ? new ArrayList() : list, (i2 & 4) != 0 ? new HashMap() : map, (i2 & 8) != 0 ? new HashMap() : map2, (i2 & 16) != 0 ? new HashMap() : map3, (i2 & 32) != 0 ? new HashMap() : map4, (i2 & 64) != 0 ? new HashMap() : map5, (i2 & 128) != 0 ? new HashMap() : map6, (i2 & 256) != 0 ? new ArrayList() : list2, (i2 & 512) != 0 ? new HashMap() : map7, (i2 & 1024) != 0 ? new HashMap() : map8, (i2 & 2048) != 0 ? new HashMap() : map9);
    }

    public static void Bb(Serializer serializer, Map map) {
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c2 = n.c(serializer, map);
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            serializer.j0((String) entry.getKey());
            serializer.i0((Serializer.StreamParcelable) entry.getValue());
        }
    }

    public final Map<String, ?> Ab() {
        int i2 = j.$EnumSwitchMapping$0[this.b.ordinal()];
        Map<String, GroupsEntityCatalogItem> map = this.g;
        Map<String, GroupCatalogItem> map2 = this.d;
        switch (i2) {
            case 1:
            case 2:
                return map2;
            case 3:
                return this.e;
            case 4:
                return this.i;
            case 5:
                return this.f;
            case 7:
                if (map.isEmpty()) {
                    return map2;
                }
            case 6:
                return map;
            case 8:
                return map2;
            case 9:
            case 10:
                return this.l;
            default:
                return null;
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.getId());
        serializer.l0(this.c);
        Bb(serializer, this.d);
        Bb(serializer, this.e);
        Bb(serializer, this.f);
        Bb(serializer, this.g);
        Bb(serializer, this.h);
        Bb(serializer, this.i);
        serializer.l0(this.j);
        Map<Long, String> map = this.k;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c2 = n.c(serializer, map);
            while (c2.hasNext()) {
                Map.Entry entry = (Map.Entry) c2.next();
                serializer.Y(((Number) entry.getKey()).longValue());
                serializer.j0((String) entry.getValue());
            }
        }
        Bb(serializer, this.l);
        Map<String, ArtistsIdsList> map2 = this.m;
        if (map2 == null) {
            serializer.S(-1);
            return;
        }
        Iterator c3 = n.c(serializer, map2);
        while (c3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) c3.next();
            serializer.j0((String) entry2.getKey());
            serializer.i0((ArtistsIdsList) entry2.getValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockItemsData)) {
            return false;
        }
        CatalogBlockItemsData catalogBlockItemsData = (CatalogBlockItemsData) obj;
        return this.b == catalogBlockItemsData.b && epx.f(this.c, catalogBlockItemsData.c) && epx.f(this.d, catalogBlockItemsData.d) && epx.f(this.e, catalogBlockItemsData.e) && epx.f(this.f, catalogBlockItemsData.f) && epx.f(this.g, catalogBlockItemsData.g) && epx.f(this.h, catalogBlockItemsData.h) && epx.f(this.i, catalogBlockItemsData.i) && epx.f(this.j, catalogBlockItemsData.j) && epx.f(this.k, catalogBlockItemsData.k) && epx.f(this.l, catalogBlockItemsData.l) && epx.f(this.m, catalogBlockItemsData.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + v11.a(v11.a(fw3.a(v11.a(v11.a(v11.a(v11.a(v11.a(v11.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockItemsData(dataType=");
        sb.append(this.b);
        sb.append(", itemsIds=");
        sb.append(this.c);
        sb.append(", groupItems=");
        sb.append(this.d);
        sb.append(", searchAuthors=");
        sb.append(this.e);
        sb.append(", gameItems=");
        sb.append(this.f);
        sb.append(", groupsEntityCatalogItems=");
        sb.append(this.g);
        sb.append(", groupCategoryItems=");
        sb.append(this.h);
        sb.append(", miniappContentItems=");
        sb.append(this.i);
        sb.append(", secondaryItemsIds=");
        sb.append(this.j);
        sb.append(", channelTrackCodes=");
        sb.append(this.k);
        sb.append(", sportsMatches=");
        sb.append(this.l);
        sb.append(", playlistArtistRelations=");
        return cjl0.a(sb, this.m, ')');
    }

    public final Object zb(Object obj) {
        Map<String, ?> Ab = Ab();
        if (Ab != null) {
            return Ab.get(obj.toString());
        }
        return null;
    }

    public CatalogBlockItemsData(CatalogDataType catalogDataType, List<String> list, Map<String, GroupCatalogItem> map, Map<String, SearchAuthorItem> map2, Map<String, CatalogMiniAppItem> map3, Map<String, GroupsEntityCatalogItem> map4, Map<String, CatalogGroupCategoryItem> map5, Map<String, AppContent> map6, List<String> list2, Map<Long, String> map7, Map<String, CatalogSportMatchItem> map8, Map<String, ArtistsIdsList> map9) {
        this.b = catalogDataType;
        this.c = list;
        this.d = map;
        this.e = map2;
        this.f = map3;
        this.g = map4;
        this.h = map5;
        this.i = map6;
        this.j = list2;
        this.k = map7;
        this.l = map8;
        this.m = map9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028c, code lost:
    
        if (r2.isEmpty() == false) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogBlockItemsData(CatalogDataType catalogDataType, JSONObject jSONObject) {
        this(catalogDataType, null, null, null, null, null, null, null, null, null, null, null, 4094, null);
        JSONObject jSONObject2;
        String str;
        String obj;
        int i2;
        String str2;
        String obj2;
        ArrayList arrayList;
        String str3 = "playlists_ids";
        switch (vba.$EnumSwitchMapping$0[catalogDataType.ordinal()]) {
            case 1:
                str3 = "suggestions_ids";
                break;
            case 2:
                str3 = "search_suggestions_ids";
                break;
            case 3:
            case 4:
                break;
            case 5:
                str3 = "audio_content_card_ids";
                break;
            case 6:
                str3 = "audio_followings_update_info_ids";
                break;
            case 7:
                str3 = "audio_followings_update_item_ids";
                break;
            case 8:
            case 9:
                str3 = "catalog_banner_ids";
                break;
            case 10:
                str3 = "audios_ids";
                break;
            case 11:
                str3 = "short_video_audios_ids";
                break;
            case 12:
                str3 = "podcast_slider_items_ids";
                break;
            case 13:
                str3 = "podcast_items_ids";
                break;
            case 14:
                str3 = "offline_podcasts_ids";
                break;
            case 15:
                str3 = "podcast_episodes_ids";
                break;
            case 16:
                str3 = "extended_podcast_items_ids";
                break;
            case 17:
            case 18:
                str3 = "videos_ids";
                break;
            case 19:
                str3 = "topshelf_items_ids";
                break;
            case 20:
                str3 = "ai_assistant_ids";
                break;
            case 21:
                str3 = "video_music_stream_mixes_ids";
                break;
            case 22:
                str3 = "artist_videos_ids";
                break;
            case 23:
                str3 = "albums_ids";
                break;
            case 24:
                str3 = "links_ids";
                break;
            case 25:
                str3 = "catalog_users_ids";
                break;
            case 26:
            case 27:
                str3 = "group_ids";
                break;
            case 28:
            case 29:
                str3 = "group_items";
                break;
            case 30:
                str3 = "group_invites";
                break;
            case 31:
                str3 = "artists_ids";
                break;
            case 32:
                str3 = "thumbs_ids";
                break;
            case 33:
                str3 = "sticker_ids";
                break;
            case 34:
                str3 = "stickers_pack_ids";
                break;
            case 35:
                str3 = "stickers_banners_ids";
                break;
            case 36:
                str3 = "stickers_info_id";
                break;
            case 37:
                str3 = "placeholder_ids";
                break;
            case 38:
                str3 = "group_chats_ids";
                break;
            case 39:
                str3 = "curators_ids";
                break;
            case 40:
                str3 = "text_ids";
                break;
            case 41:
                str3 = "group_catalog_item_ids";
                break;
            case 42:
                str3 = "market_item_ids";
                break;
            case 43:
                str3 = "market_info_ids";
                break;
            case 44:
                str3 = "navigation_tab_ids";
                break;
            case 45:
                str3 = "groups_likes_ids";
                break;
            case 46:
                str3 = "longreads_ids";
                break;
            case 47:
                str3 = "friends_liked_episodes_ids";
                break;
            case 48:
                str3 = "music_owners_ids";
                break;
            case 49:
                str3 = "owner_ids";
                break;
            case 50:
                str3 = "search_author_items";
                break;
            case 51:
                str3 = "mini_app_ids";
                break;
            case 52:
                str3 = "games_items";
                break;
            case 53:
                str3 = "audio_signal_common_info_id";
                break;
            case 54:
                str3 = "search_spellcheckers_ids";
                break;
            case 55:
                str3 = "group_collection_items_ids";
                break;
            case 56:
                str3 = "radio_stations_ids";
                break;
            case 57:
                str3 = "audio_book_ids";
                break;
            case 58:
                str3 = "audio_books_person_ids";
                break;
            case 59:
                str3 = "audio_stream_mixes_ids";
                break;
            case 60:
                str3 = "group_category_items";
                break;
            case 61:
                str3 = "miniapps_content_items";
                break;
            case 62:
                str3 = "newsfeed_item_ids";
                break;
            case 63:
                str3 = "wall_items_ids";
                break;
            case 64:
                str3 = "search_entity_ids";
                break;
            case 65:
                str3 = "search_filters_ids";
                break;
            case 66:
                str3 = "feedbacks_ids";
                break;
            case 67:
                str3 = "concerts_ids";
                break;
            case 68:
                str3 = "vklive_categories_ids";
                break;
            case 69:
            case 70:
                str3 = "vk_sports_matches_ids";
                break;
            case 71:
            case 72:
                str3 = "catalog_ad_block_ids";
                break;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                str3 = "movies_ids";
                break;
            default:
                str3 = null;
                break;
        }
        int i3 = 0;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -120763900:
                    str = str3;
                    if (str.equals("miniapps_content_items")) {
                        jSONObject2 = jSONObject;
                        i.a(jSONObject2, AppContent.i, str, this.i, this.c, d.b);
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                            str2 = "catalog_recom_playlist_relations";
                        } else if (i2 != 31) {
                            if (i2 != 55) {
                                if (i2 == 59) {
                                    str2 = "placeholder_ids";
                                } else if (i2 != 60) {
                                    str2 = null;
                                }
                            }
                            str2 = "entity_group_items";
                        } else {
                            str2 = "group_ids";
                        }
                        if (str2 != null) {
                            int hashCode = str2.hashCode();
                            if (hashCode == 1092756992) {
                                if (str2.equals("group_items")) {
                                    i.a(jSONObject2, GroupCatalogItem.k, str2, this.d, this.j, f.b);
                                    break;
                                }
                            } else if (hashCode == 1619113633) {
                                if (str2.equals("catalog_recom_playlist_relations")) {
                                    JSONArray optJSONArray = jSONObject2.optJSONArray(str2);
                                    if (optJSONArray != null) {
                                        int length = optJSONArray.length();
                                        while (i3 < length) {
                                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i3);
                                            String A = f370.A("playlist_id", jSONObject3);
                                            JSONArray optJSONArray2 = jSONObject3.optJSONArray("artists_ids");
                                            if (optJSONArray2 != null) {
                                                arrayList = f370.O(optJSONArray2);
                                                break;
                                            }
                                            arrayList = null;
                                            if (A != null && arrayList != null) {
                                                this.m.put(A, new ArtistsIdsList(arrayList));
                                            }
                                            i3++;
                                        }
                                        break;
                                    }
                                }
                            } else if (hashCode == 2015275940 && str2.equals("entity_group_items")) {
                                i.a(jSONObject2, GroupsEntityCatalogItem.d, str2, this.g, this.j, g.b);
                                if (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_COLLECTION && this.g.isEmpty()) {
                                    i.a(jSONObject, GroupCatalogItem.k, "group_items", this.d, this.j, h.b);
                                    break;
                                }
                            }
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray(str2);
                            if (optJSONArray3 != null) {
                                int length2 = optJSONArray3.length();
                                while (i3 < length2) {
                                    Object opt = optJSONArray3.opt(i3);
                                    if (opt instanceof JSONArray) {
                                        this.j.add(p4g.k(f370.K((JSONArray) opt), BundleUtil.UNDERLINE_TAG, null));
                                    } else {
                                        List<String> list = this.j;
                                        if (opt != null && (obj2 = opt.toString()) != null) {
                                            list.add(obj2);
                                        }
                                    }
                                    i3++;
                                }
                                break;
                            }
                        }
                    }
                    jSONObject2 = jSONObject;
                    if (str != null) {
                        JSONArray optJSONArray4 = jSONObject2.optJSONArray(str);
                        if (optJSONArray4 != null) {
                            int length3 = optJSONArray4.length();
                            for (int i4 = 0; i4 < length3; i4++) {
                                Object opt2 = optJSONArray4.opt(i4);
                                if (opt2 instanceof JSONArray) {
                                    this.c.add(p4g.k(f370.K((JSONArray) opt2), BundleUtil.UNDERLINE_TAG, null));
                                } else {
                                    List<String> list2 = this.c;
                                    if (opt2 != null && (obj = opt2.toString()) != null) {
                                        list2.add(obj);
                                    }
                                }
                            }
                        }
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                        }
                        if (str2 != null) {
                        }
                    }
                    break;
                case 506088771:
                    if (str3.equals("search_author_items")) {
                        jSONObject2 = jSONObject;
                        i.a(jSONObject2, SearchAuthorItem.g, str3, this.e, this.c, b.b);
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                        }
                        if (str2 != null) {
                        }
                    }
                    break;
                case 874735286:
                    str = str3;
                    if (str.equals("vk_sports_matches_ids")) {
                        jSONObject2 = jSONObject;
                        i.a(jSONObject2, CatalogSportMatchItem.d, str, this.l, this.c, e.b);
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                        }
                        if (str2 != null) {
                        }
                    }
                    jSONObject2 = jSONObject;
                    if (str != null) {
                    }
                    break;
                case 1092756992:
                    jSONObject2 = jSONObject;
                    str = str3;
                    if (str.equals("group_items")) {
                        i.a(jSONObject2, GroupCatalogItem.k, str, this.d, this.c, a.b);
                        jSONObject2 = jSONObject;
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                        }
                        if (str2 != null) {
                        }
                    }
                    if (str != null) {
                    }
                    break;
                case 1174877667:
                    jSONObject2 = jSONObject;
                    str = str3;
                    if (str.equals("stickers_info_id")) {
                        String D = f370.D(jSONObject2, str);
                        if (D != null) {
                            this.c.add(D);
                        }
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                        }
                        if (str2 != null) {
                        }
                    }
                    if (str != null) {
                    }
                    break;
                case 1521261311:
                    if (str3.equals("group_category_items")) {
                        jSONObject2 = jSONObject;
                        i.a(jSONObject2, CatalogGroupCategoryItem.d, str3, this.h, this.c, c.b);
                        i2 = vba.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                        if (i2 == 3) {
                        }
                        if (str2 != null) {
                        }
                    }
                    break;
            }
            return;
        }
        jSONObject2 = jSONObject;
        str = str3;
        if (str != null) {
        }
    }
}
