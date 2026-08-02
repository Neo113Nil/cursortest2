package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.music.Genre;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.jq3;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Artist.kt */
/* loaded from: classes18.dex */
public final class Artist extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Artist> CREATOR = new b();
    public static final a o = new a();
    public final String b;
    public final String c;
    public final String d;
    public final List<Genre> e;
    public final Image f;
    public final boolean g;
    public final boolean h;
    public boolean i;
    public final String j;
    public final boolean k;
    public final Long l;
    public final int m;
    public final Integer n;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Artist> {
        @Override // xsna.aay
        public final Artist a(JSONObject jSONObject) {
            return new Artist(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Artist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Artist a(Serializer serializer) {
            return new Artist(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Artist[i];
        }
    }

    public /* synthetic */ Artist(String str, String str2, String str3, List list, Image image, boolean z, boolean z2, boolean z3, String str4, boolean z4, Long l, int i, Integer num, int i2, zcl zclVar) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : image, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? "" : str4, (i2 & 512) == 0 ? z4 : true, (i2 & 1024) != 0 ? null : l, (i2 & 2048) == 0 ? i : 0, (i2 & 4096) != 0 ? null : num);
    }

    public static Artist zb(Artist artist) {
        String str = artist.b;
        String str2 = artist.c;
        String str3 = artist.d;
        List<Genre> list = artist.e;
        Image image = artist.f;
        boolean z = artist.g;
        boolean z2 = artist.h;
        boolean z3 = artist.i;
        String str4 = artist.j;
        boolean z4 = artist.k;
        Long l = artist.l;
        int i = artist.m;
        Integer num = artist.n;
        artist.getClass();
        return new Artist(str, str2, str3, list, image, z, z2, z3, str4, z4, l, i, num);
    }

    public final Image Ab() {
        return this.f;
    }

    public final boolean Bb() {
        return this.g;
    }

    public final boolean Cb() {
        String str = this.b;
        return (str.length() == 0 || "0".equals(str)) ? false : true;
    }

    public final boolean Db() {
        String str;
        return (Cb() || (str = this.c) == null || str.length() == 0) ? false : true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.o0(this.e);
        serializer.i0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.b0(this.l);
        serializer.S(this.m);
        Integer num = this.n;
        if (num != null) {
            serializer.S(num.intValue());
        }
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new jq3(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        return epx.f(this.b, artist.b) && epx.f(this.c, artist.c) && epx.f(this.d, artist.d) && epx.f(this.e, artist.e) && epx.f(this.f, artist.f) && this.g == artist.g && this.h == artist.h && this.i == artist.i && epx.f(this.j, artist.j) && this.k == artist.k && epx.f(this.l, artist.l) && this.m == artist.m && epx.f(this.n, artist.n);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Genre> list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Image image = this.f;
        int b2 = qoy.b(urd0.a(qoy.b(qoy.b(qoy.b((hashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Long l = this.l;
        int a2 = shy.a(this.m, (b2 + (l == null ? 0 : l.hashCode())) * 31, 31);
        Integer num = this.n;
        return a2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artist(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", bio=");
        sb.append(this.d);
        sb.append(", genres=");
        sb.append(this.e);
        sb.append(", photos=");
        sb.append(this.f);
        sb.append(", isAlbumCover=");
        sb.append(this.g);
        sb.append(", canFollow=");
        sb.append(this.h);
        sb.append(", isFollowed=");
        sb.append(this.i);
        sb.append(", trackCode=");
        sb.append(this.j);
        sb.append(", canPlay=");
        sb.append(this.k);
        sb.append(", videoOwnerId=");
        sb.append(this.l);
        sb.append(", contextFlagsMask=");
        sb.append(this.m);
        sb.append(", listenersCount=");
        return uqi.b(sb, this.n, ')');
    }

    public Artist(String str, String str2, String str3, List<Genre> list, Image image, boolean z, boolean z2, boolean z3, String str4, boolean z4, Long l, int i, Integer num) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = image;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str4;
        this.k = z4;
        this.l = l;
        this.m = i;
        this.n = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Artist(JSONObject jSONObject) {
        this(r2, r3, r4, r5, new Image(jSONObject.optJSONArray("photo"), null, 2, null), jSONObject.optBoolean("is_album_cover", false), jSONObject.optBoolean("can_follow"), jSONObject.optBoolean("is_followed"), jSONObject.optString("track_code"), jSONObject.optBoolean("can_play"), f370.z(jSONObject, "video_owner_id"), jSONObject.optInt("flags_context"), Integer.valueOf(jSONObject.optInt("listeners_count")));
        ArrayList arrayList;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("name");
        String optString3 = jSONObject.optString("bio");
        Genre.a aVar = Genre.d;
        JSONArray optJSONArray = jSONObject.optJSONArray("genres");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        aVar.getClass();
                        arrayList2.add(new Genre(optJSONObject));
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Artist(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r1 == null ? "" : r1, serializer.m(), serializer.x(), serializer.u(), Integer.valueOf(serializer.u()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String H3 = serializer.H();
        ArrayList j = serializer.j(Genre.CREATOR);
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        String H4 = serializer.H();
    }
}
