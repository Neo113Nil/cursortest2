package com.vk.catalog2.common.dto.api.video;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.f370;
import xsna.j5g;
import xsna.ms9;
import xsna.urd0;

/* compiled from: CatalogMovieItem.kt */
/* loaded from: classes16.dex */
public final class CatalogMovieItem extends Serializer.StreamParcelableAdapter {
    public final int b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Float g;
    public final Float h;
    public final List<String> i;
    public static final a j = new a();
    public static final Serializer.c<CatalogMovieItem> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMovieItem> {
        @Override // xsna.aay
        public final CatalogMovieItem a(JSONObject jSONObject) {
            return new CatalogMovieItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMovieItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMovieItem a(Serializer serializer) {
            return new CatalogMovieItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMovieItem[i];
        }
    }

    public CatalogMovieItem(int i, String str, String str2, Integer num, Integer num2, Float f, Float f2, List<String> list) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = num2;
        this.g = f;
        this.h = f2;
        this.i = list;
    }

    public final Float Ab() {
        return this.h;
    }

    public final Float Bb() {
        return this.g;
    }

    public final int Cb() {
        return this.b;
    }

    public final String Db() {
        return this.c;
    }

    public final Integer Eb() {
        return this.f;
    }

    public final Integer Fb() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.V(this.e);
        serializer.V(this.f);
        serializer.R(this.g);
        serializer.R(this.h);
        serializer.l0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMovieItem)) {
            return false;
        }
        CatalogMovieItem catalogMovieItem = (CatalogMovieItem) obj;
        return this.b == catalogMovieItem.b && epx.f(this.c, catalogMovieItem.c) && epx.f(this.d, catalogMovieItem.d) && epx.f(this.e, catalogMovieItem.e) && epx.f(this.f, catalogMovieItem.f) && epx.f(this.g, catalogMovieItem.g) && epx.f(this.h, catalogMovieItem.h) && epx.f(this.i, catalogMovieItem.i);
    }

    public final String getName() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int a2 = urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int hashCode2 = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.g;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.h;
        return this.i.hashCode() + ((hashCode4 + (f2 != null ? f2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMovieItem(movieId=");
        sb.append(this.b);
        sb.append(", posterUrl=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", seriesStopYear=");
        sb.append(this.e);
        sb.append(", releaseYear=");
        sb.append(this.f);
        sb.append(", kinoMailRating=");
        sb.append(this.g);
        sb.append(", imdbRating=");
        sb.append(this.h);
        sb.append(", genres=");
        return ms9.a(')', sb, this.i);
    }

    public final List<String> zb() {
        return this.i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMovieItem(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r8, j5g.V((Iterable) (r1 == 0 ? EmptyList.b : r1)));
        int i = jSONObject.getInt("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("poster_picture");
        ?? r1 = 0;
        String optString = optJSONObject != null ? optJSONObject.optString("url") : null;
        String optString2 = jSONObject.optString("name");
        Integer x = f370.x(jSONObject, "series_stop_year");
        Integer x2 = f370.x(jSONObject, "year");
        Float u = f370.u("kinomail_rating", jSONObject);
        Float u2 = f370.u("imdb_rating", jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("genres");
        if (optJSONArray != null) {
            r1 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                r1.add(f370.A("name", optJSONArray.getJSONObject(i2)));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMovieItem(Serializer serializer) {
        this(r1, r2, r0 == null ? "" : r0, serializer.v(), serializer.v(), serializer.t(), serializer.t(), com.vk.core.serialize.a.a(serializer));
        int u = serializer.u();
        String I = serializer.I();
        String H = serializer.H();
    }
}
