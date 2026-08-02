package com.vk.catalog2.common.dto.api.search;

import com.vk.core.serialize.Serializer;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.aay;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;
import xsna.pn00;
import xsna.urd0;

/* compiled from: CatalogSearchSpellcheckResult.kt */
/* loaded from: classes16.dex */
public final class CatalogSearchSpellcheckResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSearchSpellcheckResult> CREATOR = new b();
    public static final a j = new a();
    public final String b;
    public final String c;
    public final String d;
    public final SearchableVariable e;
    public final SearchableVariable f;
    public final String g;
    public final String h;
    public final Object i;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSearchSpellcheckResult> {
        @Override // xsna.aay
        public final CatalogSearchSpellcheckResult a(JSONObject jSONObject) {
            return new CatalogSearchSpellcheckResult(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSearchSpellcheckResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSearchSpellcheckResult a(Serializer serializer) {
            return new CatalogSearchSpellcheckResult(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSearchSpellcheckResult[i];
        }
    }

    public CatalogSearchSpellcheckResult(String str, String str2, String str3, SearchableVariable searchableVariable, SearchableVariable searchableVariable2, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = searchableVariable;
        this.f = searchableVariable2;
        this.g = str4;
        this.h = str5;
        this.i = pn00.k(new Pair("query", searchableVariable), new Pair("search_action", searchableVariable2));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchSpellcheckResult)) {
            return false;
        }
        CatalogSearchSpellcheckResult catalogSearchSpellcheckResult = (CatalogSearchSpellcheckResult) obj;
        return epx.f(this.b, catalogSearchSpellcheckResult.b) && epx.f(this.c, catalogSearchSpellcheckResult.c) && epx.f(this.d, catalogSearchSpellcheckResult.d) && epx.f(this.e, catalogSearchSpellcheckResult.e) && epx.f(this.f, catalogSearchSpellcheckResult.f) && epx.f(this.g, catalogSearchSpellcheckResult.g) && epx.f(this.h, catalogSearchSpellcheckResult.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SearchableVariable searchableVariable = this.e;
        int hashCode4 = (hashCode3 + (searchableVariable == null ? 0 : searchableVariable.hashCode())) * 31;
        SearchableVariable searchableVariable2 = this.f;
        int a2 = urd0.a((hashCode4 + (searchableVariable2 == null ? 0 : searchableVariable2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        return a2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSearchSpellcheck(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", suggest=");
        return ho8.a(sb, this.h, ')');
    }

    /* compiled from: CatalogSearchSpellcheckResult.kt */
    public static final class SearchableVariable extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<SearchableVariable> CREATOR = new b();
        public final String b;
        public final String c;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<SearchableVariable> {
            @Override // xsna.aay
            public final SearchableVariable a(JSONObject jSONObject) {
                return new SearchableVariable(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<SearchableVariable> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SearchableVariable a(Serializer serializer) {
                return new SearchableVariable(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchableVariable[i];
            }
        }

        static {
            new a();
        }

        public SearchableVariable(String str, String str2) {
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
            if (!(obj instanceof SearchableVariable)) {
                return false;
            }
            SearchableVariable searchableVariable = (SearchableVariable) obj;
            return epx.f(this.b, searchableVariable.b) && epx.f(this.c, searchableVariable.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchableVariable(text=");
            sb.append(this.b);
            sb.append(", queryToSearch=");
            return ho8.a(sb, this.c, ')');
        }

        public SearchableVariable(JSONObject jSONObject) {
            this(jSONObject.getString("text"), cqm0.a(jSONObject.optString("next_search_query")));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SearchableVariable(Serializer serializer) {
            this(r0 == null ? "" : r0, serializer.H());
            String H = serializer.H();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSearchSpellcheckResult(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r0 != null ? new SearchableVariable(r0) : null, jSONObject.getString("title"), cqm0.a(jSONObject.optString("suggest")));
        String string = jSONObject.getString("id");
        String a2 = cqm0.a(jSONObject.optString("track_code"));
        String a3 = cqm0.a(jSONObject.optString("user_input_to_replace"));
        JSONObject optJSONObject = jSONObject.optJSONObject("query");
        SearchableVariable searchableVariable = optJSONObject != null ? new SearchableVariable(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("search_action");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSearchSpellcheckResult(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r0 == null ? "" : r0, serializer.H());
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String H3 = serializer.H();
        SearchableVariable searchableVariable = (SearchableVariable) serializer.G(SearchableVariable.class.getClassLoader());
        SearchableVariable searchableVariable2 = (SearchableVariable) serializer.G(SearchableVariable.class.getClassLoader());
        String H4 = serializer.H();
    }
}
