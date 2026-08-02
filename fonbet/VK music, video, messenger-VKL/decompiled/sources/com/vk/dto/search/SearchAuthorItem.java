package com.vk.dto.search;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: SearchAuthorItem.kt */
/* loaded from: classes18.dex */
public final class SearchAuthorItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchAuthorItem> CREATOR = new b();
    public static final a g = new a();
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<SearchAuthorItem> {
        @Override // xsna.aay
        public final SearchAuthorItem a(JSONObject jSONObject) {
            Serializer.c<SearchAuthorItem> cVar = SearchAuthorItem.CREATOR;
            return new SearchAuthorItem(jSONObject.optLong("id"), jSONObject.optString("track_code"), jSONObject.optString("content_type"), jSONObject.optString("description"), jSONObject.optString("section_id"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SearchAuthorItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchAuthorItem a(Serializer serializer) {
            return new SearchAuthorItem(serializer.w(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchAuthorItem[i];
        }
    }

    public SearchAuthorItem(long j, String str, String str2, String str3, String str4) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAuthorItem)) {
            return false;
        }
        SearchAuthorItem searchAuthorItem = (SearchAuthorItem) obj;
        return this.b == searchAuthorItem.b && epx.f(this.c, searchAuthorItem.c) && epx.f(this.d, searchAuthorItem.d) && epx.f(this.e, searchAuthorItem.e) && epx.f(this.f, searchAuthorItem.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAuthorItem(id=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", authorType=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", sectionId=");
        return ho8.a(sb, this.f, ')');
    }
}
