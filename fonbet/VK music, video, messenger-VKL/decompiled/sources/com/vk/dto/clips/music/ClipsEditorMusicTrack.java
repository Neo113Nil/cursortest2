package com.vk.dto.clips.music;

import android.content.res.Resources;
import android.net.Uri;
import com.ironsource.C4583ua;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.g60;
import xsna.qoy;
import xsna.r11;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClipsEditorMusicTrack.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorMusicTrack extends Serializer.StreamParcelableAdapter implements bxx {
    public final int b;
    public final UserId c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final Uri i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public static final int m = (int) (Resources.getSystem().getDisplayMetrics().density * 24);
    public static final Serializer.c<ClipsEditorMusicTrack> CREATOR = new b();
    public static final a n = new a();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsEditorMusicTrack> {
        @Override // xsna.aay
        public final ClipsEditorMusicTrack a(JSONObject jSONObject) {
            return new ClipsEditorMusicTrack(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsEditorMusicTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsEditorMusicTrack a(Serializer serializer) {
            return new ClipsEditorMusicTrack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsEditorMusicTrack[i];
        }
    }

    public ClipsEditorMusicTrack() {
        this(0, null, null, 0, null, null, null, null, false, null, false, 2047, null);
    }

    public static ClipsEditorMusicTrack zb(ClipsEditorMusicTrack clipsEditorMusicTrack, int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = clipsEditorMusicTrack.b;
        }
        int i4 = i;
        UserId userId = clipsEditorMusicTrack.c;
        String str2 = clipsEditorMusicTrack.d;
        if ((i3 & 8) != 0) {
            i2 = clipsEditorMusicTrack.e;
        }
        int i5 = i2;
        String str3 = clipsEditorMusicTrack.f;
        String str4 = (i3 & 32) != 0 ? clipsEditorMusicTrack.g : str;
        String str5 = clipsEditorMusicTrack.h;
        Uri uri = clipsEditorMusicTrack.i;
        boolean z = clipsEditorMusicTrack.j;
        String str6 = clipsEditorMusicTrack.k;
        boolean z2 = clipsEditorMusicTrack.l;
        clipsEditorMusicTrack.getClass();
        return new ClipsEditorMusicTrack(i4, userId, str2, i5, str3, str4, str5, uri, z, str6, z2);
    }

    public final String Ab() {
        return r11.b(new StringBuilder(), this.c.b, '_', this.b);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.m0(this.h);
        Uri uri = this.i;
        serializer.m0(uri != null ? uri.toString() : null);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.j0(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new g60(this, 28));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorMusicTrack)) {
            return false;
        }
        ClipsEditorMusicTrack clipsEditorMusicTrack = (ClipsEditorMusicTrack) obj;
        return this.b == clipsEditorMusicTrack.b && epx.f(this.c, clipsEditorMusicTrack.c) && epx.f(this.d, clipsEditorMusicTrack.d) && this.e == clipsEditorMusicTrack.e && epx.f(this.f, clipsEditorMusicTrack.f) && epx.f(this.g, clipsEditorMusicTrack.g) && epx.f(this.h, clipsEditorMusicTrack.h) && epx.f(this.i, clipsEditorMusicTrack.i) && this.j == clipsEditorMusicTrack.j && epx.f(this.k, clipsEditorMusicTrack.k) && this.l == clipsEditorMusicTrack.l;
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int a3 = shy.a(this.e, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.i;
        int b2 = qoy.b((hashCode3 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.j);
        String str5 = this.k;
        return Boolean.hashCode(this.l) + ((b2 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorMusicTrack(audioId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", durationMs=");
        sb.append(this.e);
        sb.append(", artistNameFallback=");
        sb.append(this.f);
        sb.append(", url=");
        sb.append(this.g);
        sb.append(", trackCode=");
        sb.append(this.h);
        sb.append(", thumb=");
        sb.append(this.i);
        sb.append(", canDownload=");
        sb.append(this.j);
        sb.append(", originalSoundVideoId=");
        sb.append(this.k);
        sb.append(", isTrend=");
        return q0.a(sb, this.l, ')');
    }

    public /* synthetic */ ClipsEditorMusicTrack(int i, UserId userId, String str, int i2, String str2, String str3, String str4, Uri uri, boolean z, String str5, boolean z2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? UserId.d : userId, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : uri, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? false : z2);
    }

    public ClipsEditorMusicTrack(int i, UserId userId, String str, int i2, String str2, String str3, String str4, Uri uri, boolean z, String str5, boolean z2) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = uri;
        this.j = z;
        this.k = str5;
        this.l = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsEditorMusicTrack(Serializer serializer) {
        this(r1, r2, r3, r4, r5, r6, r7, r0 != null ? Uri.parse(r0) : null, serializer.m(), serializer.H(), serializer.m());
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        int u2 = serializer.u();
        String H2 = serializer.H();
        String H3 = serializer.H();
        String I = serializer.I();
        String I2 = serializer.I();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsEditorMusicTrack(JSONObject jSONObject) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r0.length() > 0 ? r0 : null, false, 1024, null);
        int optInt = jSONObject.optInt("id", jSONObject.optInt(C4583ua.b));
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String string = jSONObject.getString("title");
        int i = jSONObject.getInt("duration");
        String string2 = jSONObject.getString("artist");
        String string3 = jSONObject.getString("url");
        String optString = jSONObject.optString("track_code");
        String str = optString.length() > 0 ? optString : null;
        String optString2 = jSONObject.optString("thumb");
        optString2 = optString2.length() <= 0 ? null : optString2;
        Uri parse = optString2 != null ? Uri.parse(optString2) : null;
        boolean optBoolean = jSONObject.optBoolean("can_download");
        String optString3 = jSONObject.optString("original_sound_video_id");
    }
}
