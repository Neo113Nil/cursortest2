package com.vk.dto.podcast;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.music.Thumb;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0a;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.v4w;
import xsna.zcl;

/* compiled from: Podcast.kt */
/* loaded from: classes18.dex */
public final class Podcast implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<Podcast> CREATOR = new b();
    public static final a o = new a();
    public static final Podcast p = new Podcast(0, UserId.d, null, 0, null, null, false, null, null, true, false, null, false);
    public final int b;
    public final UserId c;
    public final String d;
    public final int e;
    public final List<Thumb> f;
    public final PlaylistPermissions g;
    public final boolean h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Podcast> {
        @Override // xsna.aay
        public final Podcast a(JSONObject jSONObject) {
            return new Podcast(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Podcast> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Podcast a(Serializer serializer) {
            return new Podcast(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Podcast[i];
        }
    }

    public Podcast(int i, UserId userId, String str, int i2, List<Thumb> list, PlaylistPermissions playlistPermissions, boolean z, String str2, String str3, boolean z2, boolean z3, String str4, boolean z4) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = i2;
        this.f = list;
        this.g = playlistPermissions;
        this.h = z;
        this.i = str2;
        this.j = str3;
        this.k = z2;
        this.l = z3;
        this.m = str4;
        this.n = z4;
    }

    public static Podcast a(Podcast podcast, boolean z, int i) {
        int i2 = podcast.b;
        UserId userId = podcast.c;
        String str = podcast.d;
        int i3 = podcast.e;
        List<Thumb> list = podcast.f;
        PlaylistPermissions playlistPermissions = podcast.g;
        boolean z2 = podcast.h;
        String str2 = podcast.i;
        String str3 = podcast.j;
        boolean z3 = podcast.k;
        if ((i & 1024) != 0) {
            z = podcast.l;
        }
        String str4 = podcast.m;
        boolean z4 = podcast.n;
        podcast.getClass();
        return new Podcast(i2, userId, str, i3, list, playlistPermissions, z2, str2, str3, z3, z, str4, z4);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
        serializer.o0(this.f);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
    }

    public final String d() {
        return "https://" + a0a.d + "/podcasts" + this.c.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('_');
        sb.append(this.e);
        return sb.toString();
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new v4w(this, 17));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Podcast)) {
            return false;
        }
        Podcast podcast = (Podcast) obj;
        return this.b == podcast.b && epx.f(this.c, podcast.c) && epx.f(this.d, podcast.d) && this.e == podcast.e && epx.f(this.f, podcast.f) && epx.f(this.g, podcast.g) && this.h == podcast.h && epx.f(this.i, podcast.i) && epx.f(this.j, podcast.j) && this.k == podcast.k && this.l == podcast.l && epx.f(this.m, podcast.m) && this.n == podcast.n;
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int a3 = shy.a(this.e, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        List<Thumb> list = this.f;
        int hashCode = (a3 + (list == null ? 0 : list.hashCode())) * 31;
        PlaylistPermissions playlistPermissions = this.g;
        int b2 = qoy.b((hashCode + (playlistPermissions == null ? 0 : playlistPermissions.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int hashCode2 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int b3 = qoy.b(qoy.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.k), 31, this.l);
        String str4 = this.m;
        return Boolean.hashCode(this.n) + ((b3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Podcast(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", podcastTitle=");
        sb.append(this.d);
        sb.append(", playlistId=");
        sb.append(this.e);
        sb.append(", thumbs=");
        sb.append(this.f);
        sb.append(", permissions=");
        sb.append(this.g);
        sb.append(", subtitleBadge=");
        sb.append(this.h);
        sb.append(", subtitle=");
        sb.append(this.i);
        sb.append(", category=");
        sb.append(this.j);
        sb.append(", canSubscribe=");
        sb.append(this.k);
        sb.append(", isSubscribed=");
        sb.append(this.l);
        sb.append(", trackCode=");
        sb.append(this.m);
        sb.append(", isExplicit=");
        return q0.a(sb, this.n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Podcast(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r1, jSONObject.has(SignalingProtocol.KEY_PERMISSIONS) ? new PlaylistPermissions(jSONObject.getJSONObject(SignalingProtocol.KEY_PERMISSIONS)) : null, jSONObject.optBoolean("subtitle_badge"), jSONObject.optString("subtitle"), jSONObject.optString("group_category"), jSONObject.optBoolean("can_subscribe", true), jSONObject.optBoolean("is_subscribed"), jSONObject.optString("track_code"), jSONObject.optBoolean("is_explicit"));
        ArrayList arrayList;
        int optInt = jSONObject.optInt("id");
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        String optString = jSONObject.optString("podcast_title");
        int optInt2 = jSONObject.optInt("playlist_id");
        if (jSONObject.has("thumbs")) {
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            arrayList = Thumb.a.a(jSONObject.optJSONArray("thumbs"));
        } else {
            arrayList = null;
        }
    }

    public Podcast(Serializer serializer, zcl zclVar) {
        this(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.u(), serializer.j(Thumb.CREATOR), (PlaylistPermissions) serializer.G(PlaylistPermissions.class.getClassLoader()), serializer.m(), serializer.H(), serializer.H(), serializer.m(), serializer.m(), serializer.H(), serializer.m());
    }
}
