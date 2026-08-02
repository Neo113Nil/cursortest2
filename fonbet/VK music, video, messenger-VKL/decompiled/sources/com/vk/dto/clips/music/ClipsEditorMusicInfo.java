package com.vk.dto.clips.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.log.L;
import defpackage.q0;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zx0;

/* compiled from: ClipsEditorMusicInfo.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorMusicInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ClipsEditorMusicInfo> CREATOR = new b();
    public static final a m = new a();
    public final ClipsEditorMusicTrack b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final MusicCatalogInfoEditor k;
    public final boolean l;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsEditorMusicInfo> {
        @Override // xsna.aay
        public final ClipsEditorMusicInfo a(JSONObject jSONObject) {
            return new ClipsEditorMusicInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsEditorMusicInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsEditorMusicInfo a(Serializer serializer) {
            ClipsEditorMusicTrack clipsEditorMusicTrack = (ClipsEditorMusicTrack) serializer.G(ClipsEditorMusicTrack.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new ClipsEditorMusicInfo(clipsEditorMusicTrack, H, serializer.u(), serializer.u(), serializer.u(), serializer.H(), serializer.u(), serializer.m(), serializer.m(), (MusicCatalogInfoEditor) serializer.G(MusicCatalogInfoEditor.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsEditorMusicInfo[i];
        }
    }

    public /* synthetic */ ClipsEditorMusicInfo(ClipsEditorMusicTrack clipsEditorMusicTrack, String str, int i, int i2, int i3, String str2, int i4, boolean z, boolean z2, MusicCatalogInfoEditor musicCatalogInfoEditor, boolean z3, int i5, zcl zclVar) {
        this(clipsEditorMusicTrack, str, i, i2, i3, (i5 & 32) != 0 ? null : str2, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? null : musicCatalogInfoEditor, (i5 & 1024) != 0 ? false : z3);
    }

    public static ClipsEditorMusicInfo zb(ClipsEditorMusicInfo clipsEditorMusicInfo, ClipsEditorMusicTrack clipsEditorMusicTrack, String str, int i, int i2, int i3, String str2, int i4, int i5) {
        if ((i5 & 1) != 0) {
            clipsEditorMusicTrack = clipsEditorMusicInfo.b;
        }
        ClipsEditorMusicTrack clipsEditorMusicTrack2 = clipsEditorMusicTrack;
        if ((i5 & 2) != 0) {
            str = clipsEditorMusicInfo.c;
        }
        String str3 = str;
        int i6 = (i5 & 4) != 0 ? clipsEditorMusicInfo.d : i;
        int i7 = (i5 & 8) != 0 ? clipsEditorMusicInfo.e : i2;
        int i8 = (i5 & 16) != 0 ? clipsEditorMusicInfo.f : i3;
        String str4 = (i5 & 32) != 0 ? clipsEditorMusicInfo.g : str2;
        int i9 = (i5 & 64) != 0 ? clipsEditorMusicInfo.h : i4;
        boolean z = clipsEditorMusicInfo.i;
        boolean z2 = clipsEditorMusicInfo.j;
        MusicCatalogInfoEditor musicCatalogInfoEditor = clipsEditorMusicInfo.k;
        boolean z3 = clipsEditorMusicInfo.l;
        clipsEditorMusicInfo.getClass();
        return new ClipsEditorMusicInfo(clipsEditorMusicTrack2, str3, i6, i7, i8, str4, i9, z, z2, musicCatalogInfoEditor, z3);
    }

    public final String Ab() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.S(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.i0(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new zx0(this, 23));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorMusicInfo)) {
            return false;
        }
        ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) obj;
        return epx.f(this.b, clipsEditorMusicInfo.b) && epx.f(this.c, clipsEditorMusicInfo.c) && this.d == clipsEditorMusicInfo.d && this.e == clipsEditorMusicInfo.e && this.f == clipsEditorMusicInfo.f && epx.f(this.g, clipsEditorMusicInfo.g) && this.h == clipsEditorMusicInfo.h && this.i == clipsEditorMusicInfo.i && this.j == clipsEditorMusicInfo.j && epx.f(this.k, clipsEditorMusicInfo.k) && this.l == clipsEditorMusicInfo.l;
    }

    public final int hashCode() {
        int a2 = shy.a(this.f, shy.a(this.e, shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31);
        String str = this.g;
        int b2 = qoy.b(qoy.b(shy.a(this.h, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.i), 31, this.j);
        MusicCatalogInfoEditor musicCatalogInfoEditor = this.k;
        return Boolean.hashCode(this.l) + ((b2 + (musicCatalogInfoEditor != null ? musicCatalogInfoEditor.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorMusicInfo(musicTrack=");
        sb.append(this.b);
        sb.append(", trackUrl=");
        sb.append(this.c);
        sb.append(", startMs=");
        sb.append(this.d);
        sb.append(", finishMs=");
        sb.append(this.e);
        sb.append(", delayMs=");
        sb.append(this.f);
        sb.append(", localFilePath=");
        sb.append(this.g);
        sb.append(", recommendedTime=");
        sb.append(this.h);
        sb.append(", fromDuet=");
        sb.append(this.i);
        sb.append(", fromLocalVideo=");
        sb.append(this.j);
        sb.append(", musicCatalogInfo=");
        sb.append(this.k);
        sb.append(", fromVoiceOver=");
        return q0.a(sb, this.l, ')');
    }

    public ClipsEditorMusicInfo(ClipsEditorMusicTrack clipsEditorMusicTrack, String str, int i, int i2, int i3, String str2, int i4, boolean z, boolean z2, MusicCatalogInfoEditor musicCatalogInfoEditor, boolean z3) {
        this.b = clipsEditorMusicTrack;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str2;
        this.h = i4;
        this.i = z;
        this.j = z2;
        this.k = musicCatalogInfoEditor;
        this.l = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsEditorMusicInfo(JSONObject jSONObject) {
        this(r6, r7, r8, r9, r10, r11, r12, r13, r14, r4, !jSONObject.has("from_voice_over") ? jSONObject.getBoolean("from_voice_over") : false);
        ClipsEditorMusicTrack clipsEditorMusicTrack;
        JSONObject optJSONObject;
        ClipsEditorMusicTrack.a aVar = ClipsEditorMusicTrack.n;
        MusicCatalogInfoEditor musicCatalogInfoEditor = null;
        if (jSONObject.has("music_track")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("music_track");
                aVar.getClass();
                clipsEditorMusicTrack = new ClipsEditorMusicTrack(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
            String string = jSONObject.getString("track_url");
            int i = jSONObject.getInt("start_ms");
            int i2 = jSONObject.getInt("finish_ms");
            int i3 = jSONObject.getInt("delay_ms");
            String D = f370.D(jSONObject, "file_path");
            int i4 = jSONObject.getInt("recommended_time");
            boolean z = jSONObject.getBoolean("from_duet");
            boolean z2 = jSONObject.getBoolean("from_local_video");
            optJSONObject = jSONObject.optJSONObject("music_catalog_info");
            if (optJSONObject != null) {
                MusicCatalogInfoEditor.g.getClass();
                musicCatalogInfoEditor = new MusicCatalogInfoEditor(optJSONObject);
            }
        }
        clipsEditorMusicTrack = null;
        String string2 = jSONObject.getString("track_url");
        int i5 = jSONObject.getInt("start_ms");
        int i22 = jSONObject.getInt("finish_ms");
        int i32 = jSONObject.getInt("delay_ms");
        String D2 = f370.D(jSONObject, "file_path");
        int i42 = jSONObject.getInt("recommended_time");
        boolean z3 = jSONObject.getBoolean("from_duet");
        boolean z22 = jSONObject.getBoolean("from_local_video");
        optJSONObject = jSONObject.optJSONObject("music_catalog_info");
        if (optJSONObject != null) {
        }
    }
}
