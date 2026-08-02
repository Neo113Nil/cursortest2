package com.vk.dto.music.playlist;

import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.coremedia.iso.boxes.MetaBox;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.f370;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.uf3;
import xsna.zcl;

/* compiled from: MarusiaTrackMeta.kt */
/* loaded from: classes18.dex */
public final class MarusiaTrackMeta extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MarusiaTrackMeta> CREATOR = new b();
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final AlbumLink j;
    public final int k;
    public final boolean l;
    public final List<Artist> m;
    public final String n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final MarusiaTrackSource t;
    public final Bundle u;

    /* compiled from: MarusiaTrackMeta.kt */
    public static final class a {
        public static MarusiaTrackMeta a(JSONObject jSONObject) {
            AlbumLink albumLink;
            String str;
            int i;
            ArrayList arrayList;
            MarusiaTrackSource marusiaTrackSource;
            String str2;
            Bundle bundle;
            String str3;
            String str4;
            Bundle bundle2;
            String str5;
            String str6;
            int i2;
            long j;
            String str7;
            MarusiaTrackSource marusiaTrackSource2;
            int i3;
            JSONObject jSONObject2 = jSONObject.getJSONObject(MetaBox.TYPE);
            String A = f370.A("artist", jSONObject2);
            int optInt = jSONObject2.optInt("id");
            String A2 = f370.A("uid", jSONObject2);
            long optLong = jSONObject2.optLong("owner_id");
            String A3 = f370.A("title", jSONObject2);
            String A4 = f370.A("subtitle", jSONObject2);
            int optInt2 = jSONObject2.optInt("duration");
            String A5 = f370.A("url", jSONObject2);
            JSONObject optJSONObject = jSONObject2.optJSONObject("album");
            if (optJSONObject != null) {
                albumLink = new AlbumLink(optJSONObject);
            } else {
                String A6 = f370.A("coverUrl", jSONObject2);
                if (A6 != null) {
                    UserId userId = UserId.d;
                    SparseArray sparseArray = new SparseArray();
                    sparseArray.put(100, Uri.parse(A6));
                    s3q0 s3q0Var = s3q0.a;
                    albumLink = new AlbumLink(0, userId, null, null, new Thumb(null, 100, 100, sparseArray), null, 32, null);
                } else {
                    albumLink = null;
                }
            }
            int optInt3 = jSONObject2.optInt("genre_id");
            boolean optBoolean = jSONObject2.optBoolean("is_explicit");
            Artist.a aVar = Artist.o;
            JSONArray optJSONArray = jSONObject2.optJSONArray("main_artists");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                str = A3;
                ArrayList arrayList2 = new ArrayList(length);
                i = optInt;
                int i4 = 0;
                while (i4 < length) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i4);
                    if (optJSONObject2 != null) {
                        try {
                            aVar.getClass();
                            i3 = length;
                        } catch (Exception e) {
                            e = e;
                            i3 = length;
                        }
                        try {
                            arrayList2.add(new Artist(optJSONObject2));
                        } catch (Exception e2) {
                            e = e2;
                            L.i(e);
                            s3q0 s3q0Var2 = s3q0.a;
                            i4++;
                            length = i3;
                        }
                    } else {
                        i3 = length;
                    }
                    i4++;
                    length = i3;
                }
                arrayList = arrayList2;
            } else {
                str = A3;
                i = optInt;
                arrayList = null;
            }
            String A7 = f370.A("track_code", jSONObject2);
            long optLong2 = jSONObject2.optLong("date");
            boolean optBoolean2 = jSONObject2.optBoolean("is_focus_track");
            boolean optBoolean3 = jSONObject2.optBoolean("stories_allowed");
            boolean optBoolean4 = jSONObject2.optBoolean("short_videos_allowed");
            boolean optBoolean5 = jSONObject2.optBoolean("stories_cover_allowed");
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("source");
            if (optJSONObject3 != null) {
                Serializer.c<MarusiaTrackSource> cVar = MarusiaTrackSource.CREATOR;
                marusiaTrackSource = new MarusiaTrackSource(optJSONObject3.toString(), f370.A("media_type", optJSONObject3), f370.A("skill_name", optJSONObject3), f370.A("type", optJSONObject3), f370.A("uid", optJSONObject3), f370.A("phrase_id", optJSONObject3));
            } else {
                marusiaTrackSource = null;
            }
            Serializer.c<MarusiaTrackMeta> cVar2 = MarusiaTrackMeta.CREATOR;
            if (!jSONObject2.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS) || jSONObject2.isNull(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                str2 = A7;
                bundle = null;
            } else {
                bundle = new Bundle();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String str8 = A7;
                    String next = keys.next();
                    bundle.putString(next, jSONObject3.getString(next));
                    keys = keys;
                    A7 = str8;
                }
                str2 = A7;
            }
            boolean f = epx.f(marusiaTrackSource != null ? marusiaTrackSource.c : null, "radio");
            String str9 = f ? str == null ? "" : str : A;
            if (f) {
                str3 = A4;
                str4 = A;
            } else {
                str3 = A4;
                str4 = str;
            }
            if (f) {
                str6 = str2;
                bundle2 = bundle;
                str5 = str;
                marusiaTrackSource2 = marusiaTrackSource;
                str7 = str9;
                i2 = i;
                j = optLong2;
            } else {
                String str10 = str2;
                bundle2 = bundle;
                str5 = str3;
                str6 = str10;
                i2 = i;
                j = optLong2;
                str7 = str9;
                marusiaTrackSource2 = marusiaTrackSource;
            }
            return new MarusiaTrackMeta(str7, i2, A2, optLong, str4, str5, optInt2, A5, albumLink, optInt3, optBoolean, arrayList, str6, j, optBoolean2, optBoolean3, optBoolean4, optBoolean5, marusiaTrackSource2, bundle2);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MarusiaTrackMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarusiaTrackMeta a(Serializer serializer) {
            return new MarusiaTrackMeta(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarusiaTrackMeta[i];
        }
    }

    public MarusiaTrackMeta(String str, int i, String str2, long j, String str3, String str4, int i2, String str5, AlbumLink albumLink, int i3, boolean z, List<Artist> list, String str6, long j2, boolean z2, boolean z3, boolean z4, boolean z5, MarusiaTrackSource marusiaTrackSource, Bundle bundle) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = i2;
        this.i = str5;
        this.j = albumLink;
        this.k = i3;
        this.l = z;
        this.m = list;
        this.n = str6;
        this.o = j2;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = marusiaTrackSource;
        this.u = bundle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.h);
        serializer.j0(this.i);
        serializer.i0(this.j);
        serializer.S(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.W(this.m);
        serializer.j0(this.n);
        serializer.Y(this.o);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.i0(this.t);
        serializer.K(this.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaTrackMeta)) {
            return false;
        }
        MarusiaTrackMeta marusiaTrackMeta = (MarusiaTrackMeta) obj;
        return epx.f(this.b, marusiaTrackMeta.b) && this.c == marusiaTrackMeta.c && epx.f(this.d, marusiaTrackMeta.d) && this.e == marusiaTrackMeta.e && epx.f(this.f, marusiaTrackMeta.f) && epx.f(this.g, marusiaTrackMeta.g) && this.h == marusiaTrackMeta.h && epx.f(this.i, marusiaTrackMeta.i) && epx.f(this.j, marusiaTrackMeta.j) && this.k == marusiaTrackMeta.k && this.l == marusiaTrackMeta.l && epx.f(this.m, marusiaTrackMeta.m) && epx.f(this.n, marusiaTrackMeta.n) && this.o == marusiaTrackMeta.o && this.p == marusiaTrackMeta.p && this.q == marusiaTrackMeta.q && this.r == marusiaTrackMeta.r && this.s == marusiaTrackMeta.s && epx.f(this.t, marusiaTrackMeta.t) && epx.f(this.u, marusiaTrackMeta.u);
    }

    public final int hashCode() {
        String str = this.b;
        int a2 = shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.d;
        int a3 = bh10.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int hashCode = (a3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int a4 = shy.a(this.h, (hashCode + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.i;
        int hashCode2 = (a4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AlbumLink albumLink = this.j;
        int b2 = qoy.b(shy.a(this.k, (hashCode2 + (albumLink == null ? 0 : albumLink.hashCode())) * 31, 31), 31, this.l);
        List<Artist> list = this.m;
        int hashCode3 = (b2 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.n;
        int b3 = qoy.b(qoy.b(qoy.b(qoy.b(bh10.a((hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
        MarusiaTrackSource marusiaTrackSource = this.t;
        int hashCode4 = (b3 + (marusiaTrackSource == null ? 0 : marusiaTrackSource.hashCode())) * 31;
        Bundle bundle = this.u;
        return hashCode4 + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaTrackMeta(artist=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", uid=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", duration=");
        sb.append(this.h);
        sb.append(", url=");
        sb.append(this.i);
        sb.append(", album=");
        sb.append(this.j);
        sb.append(", genreId=");
        sb.append(this.k);
        sb.append(", isExplicit=");
        sb.append(this.l);
        sb.append(", mainArtists=");
        sb.append(this.m);
        sb.append(", trackCode=");
        sb.append(this.n);
        sb.append(", date=");
        sb.append(this.o);
        sb.append(", isFocusTrack=");
        sb.append(this.p);
        sb.append(", isStoriesAllowed=");
        sb.append(this.q);
        sb.append(", isShortVideosAllowed=");
        sb.append(this.r);
        sb.append(", isStoriesCoverAllowed=");
        sb.append(this.s);
        sb.append(", source=");
        sb.append(this.t);
        sb.append(", adsParams=");
        return uf3.c(sb, this.u, ')');
    }

    public MarusiaTrackMeta(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.u(), serializer.H(), serializer.w(), serializer.H(), serializer.H(), serializer.u(), serializer.H(), (AlbumLink) serializer.G(AlbumLink.class.getClassLoader()), serializer.u(), serializer.m(), serializer.l(Artist.class.getClassLoader()), serializer.H(), serializer.w(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), (MarusiaTrackSource) serializer.G(MarusiaTrackSource.class.getClassLoader()), serializer.o(Bundle.class.getClassLoader()));
    }
}
