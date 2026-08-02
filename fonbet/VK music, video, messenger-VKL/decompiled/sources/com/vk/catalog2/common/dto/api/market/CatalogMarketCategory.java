package com.vk.catalog2.common.dto.api.market;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.fq;
import xsna.i5g;
import xsna.jgp;
import xsna.rli0;
import xsna.tn;
import xsna.u8a;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogNavigationTab.kt */
/* loaded from: classes16.dex */
public final class CatalogMarketCategory extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketCategory> CREATOR = new b();
    public static final a h = new a();
    public final int b;
    public final String c;
    public final Image d;
    public final List<CatalogMarketCategory> e;
    public final CategoryView f;
    public final Object g;

    /* compiled from: CatalogNavigationTab.kt */
    public static final class CategoryView extends Serializer.StreamParcelableAdapter implements bxx {
        public final ViewType b;
        public final Boolean c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CatalogNavigationTab.kt */
        public static final class ViewType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ViewType[] $VALUES;
            public static final a Companion;
            public static final ViewType TAB_ROOT;
            private final String value = "tab_root";

            /* compiled from: CatalogNavigationTab.kt */
            public static final class a {
                public static ViewType a(String str) {
                    try {
                        for (ViewType viewType : ViewType.values()) {
                            if (epx.f(viewType.h(), str)) {
                                return viewType;
                            }
                        }
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }

            static {
                ViewType viewType = new ViewType();
                TAB_ROOT = viewType;
                ViewType[] viewTypeArr = {viewType};
                $VALUES = viewTypeArr;
                $ENTRIES = new asp(viewTypeArr);
                Companion = new a();
            }

            public static ViewType valueOf(String str) {
                return (ViewType) Enum.valueOf(ViewType.class, str);
            }

            public static ViewType[] values() {
                return (ViewType[]) $VALUES.clone();
            }

            public final String h() {
                return this.value;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CategoryView() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            ViewType viewType = this.b;
            serializer.j0(viewType != null ? viewType.h() : null);
            serializer.J(this.c);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("type", this.b);
            jSONObject.putOpt("selected", this.c);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryView)) {
                return false;
            }
            CategoryView categoryView = (CategoryView) obj;
            return this.b == categoryView.b && epx.f(this.c, categoryView.c);
        }

        public final int hashCode() {
            ViewType viewType = this.b;
            int hashCode = (viewType == null ? 0 : viewType.hashCode()) * 31;
            Boolean bool = this.c;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CategoryView(type=");
            sb.append(this.b);
            sb.append(", selected=");
            return tn.a(sb, this.c, ')');
        }

        public /* synthetic */ CategoryView(ViewType viewType, Boolean bool, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : viewType, (i & 2) != 0 ? null : bool);
        }

        public CategoryView(ViewType viewType, Boolean bool) {
            this.b = viewType;
            this.c = bool;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CategoryView(JSONObject jSONObject) {
            this(ViewType.a.a(r1), Boolean.valueOf(jSONObject.optBoolean("selected")));
            ViewType.a aVar = ViewType.Companion;
            String optString = jSONObject.optString("type");
            aVar.getClass();
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMarketCategory> {
        @Override // xsna.aay
        public final CatalogMarketCategory a(JSONObject jSONObject) {
            return new CatalogMarketCategory(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMarketCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketCategory a(Serializer serializer) {
            return new CatalogMarketCategory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketCategory[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap] */
    public CatalogMarketCategory(int i, String str, Image image, List<CatalogMarketCategory> list, CategoryView categoryView) {
        Object obj;
        this.b = i;
        this.c = str;
        this.d = image;
        this.e = list;
        this.f = categoryView;
        if (list != null) {
            List<CatalogMarketCategory> list2 = list;
            obj = new HashMap(list2.size());
            for (CatalogMarketCategory catalogMarketCategory : list2) {
                obj.put(Integer.valueOf(catalogMarketCategory.b), catalogMarketCategory);
            }
        } else {
            obj = jgp.b;
        }
        this.g = obj;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.W(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketCategory)) {
            return false;
        }
        CatalogMarketCategory catalogMarketCategory = (CatalogMarketCategory) obj;
        return this.b == catalogMarketCategory.b && epx.f(this.c, catalogMarketCategory.c) && epx.f(this.d, catalogMarketCategory.d) && epx.f(this.e, catalogMarketCategory.e) && epx.f(this.f, catalogMarketCategory.f);
    }

    public final int hashCode() {
        int b2 = fq.b(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31);
        List<CatalogMarketCategory> list = this.e;
        int hashCode = (b2 + (list == null ? 0 : list.hashCode())) * 31;
        CategoryView categoryView = this.f;
        return hashCode + (categoryView != null ? categoryView.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogMarketCategory(id=" + this.b + ", name=" + this.c + ", icon=" + this.d + ", children=" + this.e + ", view=" + this.f + ')';
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final CatalogMarketCategory zb(int i) {
        if (this.b == i) {
            return this;
        }
        Integer valueOf = Integer.valueOf(i);
        ?? r1 = this.g;
        if (r1.containsKey(valueOf)) {
            return (CatalogMarketCategory) r1.get(Integer.valueOf(i));
        }
        List<CatalogMarketCategory> list = this.e;
        if (list == null) {
            return null;
        }
        return (CatalogMarketCategory) rli0.n(rli0.t(new i5g(list), new u8a(i, 0)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketCategory(JSONObject jSONObject) {
        this(r2, r3, r4, r1, r11 != null ? new CategoryView(r11) : null);
        ArrayList arrayList;
        int optInt = jSONObject.optInt("id");
        String optString = jSONObject.optString("name");
        JSONArray optJSONArray = jSONObject.optJSONArray("icon");
        Image image = new Image(optJSONArray == null ? new JSONArray() : optJSONArray, null, 2, null);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("children");
        if (optJSONArray2 != null) {
            arrayList = new ArrayList(optJSONArray2.length());
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new CatalogMarketCategory(optJSONArray2.getJSONObject(i)));
            }
        } else {
            arrayList = null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketCategory(Serializer serializer) {
        this(r1, r2, r3, r0 == null ? new ArrayList() : r0, (CategoryView) serializer.G(CategoryView.class.getClassLoader()));
        int u = serializer.u();
        String H = serializer.H();
        String str = H == null ? "" : H;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        ArrayList k = serializer.k(CatalogMarketCategory.class);
    }
}
