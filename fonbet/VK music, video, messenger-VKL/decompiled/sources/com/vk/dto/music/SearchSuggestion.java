package com.vk.dto.music;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SearchSuggestion.kt */
/* loaded from: classes18.dex */
public final class SearchSuggestion extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchSuggestion> CREATOR = new b();
    public static final a l = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Type g;
    public final String h;
    public final String i;
    public final MovieDto j;
    public final String k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchSuggestion.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type MetaChannelLink;
        public static final Type MovieLink;
        public static final Type Popular;
        public static final Type Recent;
        public static final Type RecentWithoutClear;
        public static final Type SectionLink;
        private final String apiValue;

        /* compiled from: SearchSuggestion.kt */
        public static final class a {
            public static Type a(String str) {
                for (Type type : Type.values()) {
                    if (epx.f(type.h(), str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        static {
            Type type = new Type("Recent", 0, "recent");
            Recent = type;
            Type type2 = new Type("RecentWithoutClear", 1, "recent_without_clear");
            RecentWithoutClear = type2;
            Type type3 = new Type("Popular", 2, "popular");
            Popular = type3;
            Type type4 = new Type("SectionLink", 3, "section");
            SectionLink = type4;
            Type type5 = new Type("MetaChannelLink", 4, "metachannel");
            MetaChannelLink = type5;
            Type type6 = new Type("MovieLink", 5, "movie");
            MovieLink = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.apiValue = str2;
        }

        public static zrp<Type> i() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiValue;
        }
    }

    /* compiled from: SearchSuggestion.kt */
    public static final class a extends aay<SearchSuggestion> {
        @Override // xsna.aay
        public final SearchSuggestion a(JSONObject jSONObject) {
            return new SearchSuggestion(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SearchSuggestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchSuggestion a(Serializer serializer) {
            return new SearchSuggestion(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchSuggestion[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SearchSuggestion(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, MovieDto movieDto, String str8, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, type, str6, str7, r11, r12);
        String str9;
        MovieDto movieDto2;
        str6 = (i & 64) != 0 ? null : str6;
        str7 = (i & 128) != 0 ? null : str7;
        if ((i & 256) != 0) {
            str9 = str8;
            movieDto2 = null;
        } else {
            str9 = str8;
            movieDto2 = movieDto;
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g.h());
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.e0(this.j);
        serializer.j0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestion)) {
            return false;
        }
        SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
        return epx.f(this.b, searchSuggestion.b) && epx.f(this.c, searchSuggestion.c) && epx.f(this.d, searchSuggestion.d) && epx.f(this.e, searchSuggestion.e) && epx.f(this.f, searchSuggestion.f) && this.g == searchSuggestion.g && epx.f(this.h, searchSuggestion.h) && epx.f(this.i, searchSuggestion.i) && epx.f(this.j, searchSuggestion.j) && epx.f(this.k, searchSuggestion.k);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MovieDto movieDto = this.j;
        return this.k.hashCode() + ((hashCode3 + (movieDto != null ? movieDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSuggestion<id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", formattedTitle=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", context=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.g);
        sb.append(" trackCode=");
        return ho8.a(sb, this.k, '>');
    }

    public SearchSuggestion(String str, String str2, String str3, String str4, String str5, Type type, String str6, String str7, MovieDto movieDto, String str8) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = type;
        this.h = str6;
        this.i = str7;
        this.j = movieDto;
        this.k = str8;
    }

    /* compiled from: SearchSuggestion.kt */
    public static final class MovieDto extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<MovieDto> CREATOR = new b();
        public final int b;
        public final String c;
        public final Float d;
        public final String e;
        public final Integer f;
        public final String g;
        public final Integer h;
        public final String i;

        /* compiled from: SearchSuggestion.kt */
        public static final class a extends aay<MovieDto> {
            @Override // xsna.aay
            public final MovieDto a(JSONObject jSONObject) {
                return new MovieDto(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<MovieDto> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MovieDto a(Serializer serializer) {
                return new MovieDto(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MovieDto[i];
            }
        }

        static {
            new a();
        }

        public MovieDto(int i, String str, Float f, String str2, Integer num, String str3, Integer num2, String str4) {
            this.b = i;
            this.c = str;
            this.d = f;
            this.e = str2;
            this.f = num;
            this.g = str3;
            this.h = num2;
            this.i = str4;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
            serializer.R(this.d);
            serializer.j0(this.e);
            serializer.V(this.f);
            serializer.j0(this.g);
            serializer.V(this.h);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MovieDto)) {
                return false;
            }
            MovieDto movieDto = (MovieDto) obj;
            return this.b == movieDto.b && epx.f(this.c, movieDto.c) && epx.f(this.d, movieDto.d) && epx.f(this.e, movieDto.e) && epx.f(this.f, movieDto.f) && epx.f(this.g, movieDto.g) && epx.f(this.h, movieDto.h) && epx.f(this.i, movieDto.i);
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Float f = this.d;
            int hashCode = (a2 + (f == null ? 0 : f.hashCode())) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.g;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.h;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.i;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MovieDto(id=");
            sb.append(this.b);
            sb.append(", posterUrl=");
            sb.append(this.c);
            sb.append(", rating=");
            sb.append(this.d);
            sb.append(", ageRestriction=");
            sb.append(this.e);
            sb.append(", releaseYear=");
            sb.append(this.f);
            sb.append(", country=");
            sb.append(this.g);
            sb.append(", durationMinutes=");
            sb.append(this.h);
            sb.append(", originalName=");
            return ho8.a(sb, this.i, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MovieDto(Serializer serializer) {
            this(r1, r0 == null ? "" : r0, serializer.t(), serializer.I(), serializer.v(), serializer.I(), serializer.v(), serializer.I());
            int u = serializer.u();
            String H = serializer.H();
        }

        public MovieDto(JSONObject jSONObject) {
            this(jSONObject.getInt("id"), jSONObject.getString("poster_picture"), f370.u(CampaignEx.JSON_KEY_STAR, jSONObject), f370.D(jSONObject, "age_restrict"), f370.x(jSONObject, "year"), f370.D(jSONObject, "country"), f370.x(jSONObject, "duration"), f370.D(jSONObject, "name_eng"));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchSuggestion(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r14 == null ? "" : r14);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        String H5 = serializer.H();
        String str5 = H5 == null ? "" : H5;
        Type.a aVar = Type.Companion;
        String H6 = serializer.H();
        H6 = H6 == null ? "" : H6;
        aVar.getClass();
        Type a2 = Type.a.a(H6);
        Type type = a2 == null ? Type.Popular : a2;
        String I = serializer.I();
        String I2 = serializer.I();
        MovieDto movieDto = (MovieDto) serializer.A(MovieDto.class.getClassLoader());
        String H7 = serializer.H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchSuggestion(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, r0 != null ? new MovieDto(r0) : null, jSONObject.optString("track_code"));
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("formatted_title");
        String optString4 = jSONObject.optString("subtitle");
        String optString5 = jSONObject.optString("context");
        Type.a aVar = Type.Companion;
        String optString6 = jSONObject.optString("type");
        aVar.getClass();
        Type a2 = Type.a.a(optString6);
        Type type = a2 == null ? Type.Popular : a2;
        String optString7 = jSONObject.optString("link");
        String optString8 = jSONObject.optString("icon");
        JSONObject optJSONObject = jSONObject.optJSONObject("movie");
    }
}
