package com.vk.dto.market.catalog;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.zcl;

/* compiled from: CatalogMarketSorting.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketSorting extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketSorting> CREATOR = new b();
    public final List<SortOption> b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMarketSorting> {
        @Override // xsna.aay
        public final CatalogMarketSorting a(JSONObject jSONObject) {
            return new CatalogMarketSorting(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMarketSorting> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketSorting a(Serializer serializer) {
            return new CatalogMarketSorting(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketSorting[i];
        }
    }

    static {
        new a();
    }

    public CatalogMarketSorting() {
        this(null, null, 3, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketSorting)) {
            return false;
        }
        CatalogMarketSorting catalogMarketSorting = (CatalogMarketSorting) obj;
        return epx.f(this.b, catalogMarketSorting.b) && epx.f(this.c, catalogMarketSorting.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMarketSorting(sortingOptions=");
        sb.append(this.b);
        sb.append(", sortingOptionId=");
        return ho8.a(sb, this.c, ')');
    }

    public CatalogMarketSorting(List<SortOption> list, String str) {
        this.b = list;
        this.c = str;
    }

    /* compiled from: CatalogMarketSorting.kt */
    public static final class SortOption extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<SortOption> CREATOR = new b();
        public final String b;
        public final String c;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<SortOption> {
            @Override // xsna.aay
            public final SortOption a(JSONObject jSONObject) {
                return new SortOption(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<SortOption> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SortOption a(Serializer serializer) {
                return new SortOption(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SortOption[i];
            }
        }

        static {
            new a();
        }

        public SortOption(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOption)) {
                return false;
            }
            SortOption sortOption = (SortOption) obj;
            return epx.f(this.b, sortOption.b) && epx.f(this.c, sortOption.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SortOption(id=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }

        public SortOption(JSONObject jSONObject) {
            this(jSONObject.optString("id"), jSONObject.optString("title"));
        }

        public SortOption(Serializer serializer) {
            this(serializer.H(), serializer.H());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketSorting(JSONObject jSONObject) {
        this(r1, f370.D(jSONObject, "sorting_option_id"));
        ?? r1;
        JSONArray optJSONArray = jSONObject.optJSONArray("sorting_options");
        if (optJSONArray != null) {
            r1 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    r1.add(new SortOption(optJSONObject));
                }
            }
        } else {
            r1 = EmptyList.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketSorting(Serializer serializer) {
        this(r0 == null ? EmptyList.b : r0, serializer.H());
        List k = serializer.k(SortOption.class);
    }

    public CatalogMarketSorting(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? null : str);
    }
}
