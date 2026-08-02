package com.vk.dto.market.catalog;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.f370;
import xsna.uqi;
import xsna.zrp;

/* compiled from: CatalogMarketCategoryContext.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketCategoryContext extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketCategoryContext> CREATOR = new b();
    public final Context b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogMarketCategoryContext.kt */
    public static final class Context {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Context[] $VALUES;
        public static final Context CLASSIFIEDS;
        public static final a Companion;
        public static final Context MARKET;
        private final String key;

        /* compiled from: CatalogMarketCategoryContext.kt */
        public static final class a {
            public static Context a(String str) {
                Context context;
                Context[] values = Context.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        context = null;
                        break;
                    }
                    context = values[i];
                    if (epx.f(context.h(), str)) {
                        break;
                    }
                    i++;
                }
                return context == null ? Context.MARKET : context;
            }
        }

        static {
            Context context = new Context("MARKET", 0, "market");
            MARKET = context;
            Context context2 = new Context("CLASSIFIEDS", 1, "classifieds");
            CLASSIFIEDS = context2;
            Context[] contextArr = {context, context2};
            $VALUES = contextArr;
            $ENTRIES = new asp(contextArr);
            Companion = new a();
        }

        public Context(String str, int i, String str2) {
            this.key = str2;
        }

        public static Context valueOf(String str) {
            return (Context) Enum.valueOf(Context.class, str);
        }

        public static Context[] values() {
            return (Context[]) $VALUES.clone();
        }

        public final String h() {
            return this.key;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMarketCategoryContext> {
        @Override // xsna.aay
        public final CatalogMarketCategoryContext a(JSONObject jSONObject) {
            return new CatalogMarketCategoryContext(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMarketCategoryContext> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketCategoryContext a(Serializer serializer) {
            return new CatalogMarketCategoryContext(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketCategoryContext[i];
        }
    }

    static {
        new a();
    }

    public CatalogMarketCategoryContext(Context context, Integer num, Integer num2, Integer num3) {
        this.b = context;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.h());
        serializer.V(this.c);
        serializer.V(this.d);
        serializer.V(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketCategoryContext)) {
            return false;
        }
        CatalogMarketCategoryContext catalogMarketCategoryContext = (CatalogMarketCategoryContext) obj;
        return this.b == catalogMarketCategoryContext.b && epx.f(this.c, catalogMarketCategoryContext.c) && epx.f(this.d, catalogMarketCategoryContext.d) && epx.f(this.e, catalogMarketCategoryContext.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMarketCategoryContext(context=");
        sb.append(this.b);
        sb.append(", categoryTreeId=");
        sb.append(this.c);
        sb.append(", rootCategoryId=");
        sb.append(this.d);
        sb.append(", categoryId=");
        return uqi.b(sb, this.e, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketCategoryContext(JSONObject jSONObject) {
        this(Context.a.a(r0), f370.x(jSONObject, "category_tree_id"), f370.x(jSONObject, "root_category_id"), f370.x(jSONObject, "category_id"));
        String string = jSONObject.getString("catalog_context");
        Context.Companion.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketCategoryContext(Serializer serializer) {
        this(Context.a.a(r0), serializer.v(), serializer.v(), serializer.v());
        String H = serializer.H();
        Context.Companion.getClass();
    }
}
