package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.waf0;

/* compiled from: StoryMusicInfo.kt */
/* loaded from: classes18.dex */
public final class StoryMusicInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<StoryMusicInfo> CREATOR = new b();
    public static final a o = new a();
    public final MusicTrack b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final AudioFromMusicCatalogInfo l;
    public final boolean m;
    public final boolean n;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<StoryMusicInfo> {
        @Override // xsna.aay
        public final StoryMusicInfo a(JSONObject jSONObject) {
            return new StoryMusicInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StoryMusicInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryMusicInfo a(Serializer serializer) {
            MusicTrack musicTrack = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            int u = serializer.u();
            int u2 = serializer.u();
            int u3 = serializer.u();
            String H2 = serializer.H();
            boolean m = serializer.m();
            int u4 = serializer.u();
            boolean m2 = serializer.m();
            boolean m3 = serializer.m();
            AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = (AudioFromMusicCatalogInfo) serializer.G(AudioFromMusicCatalogInfo.class.getClassLoader());
            boolean m4 = serializer.m();
            Boolean n = serializer.n();
            return new StoryMusicInfo(musicTrack, H, u, u2, u3, H2, m, u4, m2, m3, audioFromMusicCatalogInfo, m4, n != null ? n.booleanValue() : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryMusicInfo[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StoryMusicInfo(com.vk.dto.music.MusicTrack r18, java.lang.String r19, int r20, int r21, int r22, java.lang.String r23, boolean r24, int r25, boolean r26, boolean r27, com.vk.dto.music.AudioFromMusicCatalogInfo r28, boolean r29, boolean r30, int r31, xsna.zcl r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L9
            r9 = r2
            goto Lb
        L9:
            r9 = r23
        Lb:
            r1 = r0 & 64
            if (r1 == 0) goto L12
            r1 = 1
            r10 = r1
            goto L14
        L12:
            r10 = r24
        L14:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 0
            if (r1 == 0) goto L1b
            r11 = r3
            goto L1d
        L1b:
            r11 = r25
        L1d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L23
            r12 = r3
            goto L25
        L23:
            r12 = r26
        L25:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L2b
            r13 = r3
            goto L2d
        L2b:
            r13 = r27
        L2d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L33
            r14 = r2
            goto L35
        L33:
            r14 = r28
        L35:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L3b
            r15 = r3
            goto L3d
        L3b:
            r15 = r29
        L3d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L50
            r16 = r3
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r3 = r17
            goto L5e
        L50:
            r16 = r30
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
        L5e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.music.StoryMusicInfo.<init>(com.vk.dto.music.MusicTrack, java.lang.String, int, int, int, java.lang.String, boolean, int, boolean, boolean, com.vk.dto.music.AudioFromMusicCatalogInfo, boolean, boolean, int, xsna.zcl):void");
    }

    public static StoryMusicInfo zb(StoryMusicInfo storyMusicInfo, String str, int i, int i2, String str2, int i3, int i4) {
        MusicTrack musicTrack = storyMusicInfo.b;
        String str3 = (i4 & 2) != 0 ? storyMusicInfo.c : str;
        int i5 = (i4 & 4) != 0 ? storyMusicInfo.d : i;
        int i6 = (i4 & 8) != 0 ? storyMusicInfo.e : i2;
        int i7 = (i4 & 16) != 0 ? storyMusicInfo.f : 0;
        String str4 = (i4 & 32) != 0 ? storyMusicInfo.g : str2;
        boolean z = (i4 & 64) != 0 ? storyMusicInfo.h : false;
        int i8 = (i4 & 128) != 0 ? storyMusicInfo.i : i3;
        boolean z2 = storyMusicInfo.j;
        boolean z3 = storyMusicInfo.k;
        AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = storyMusicInfo.l;
        boolean z4 = storyMusicInfo.m;
        boolean z5 = storyMusicInfo.n;
        storyMusicInfo.getClass();
        return new StoryMusicInfo(musicTrack, str3, i5, i6, i7, str4, z, i8, z2, z3, audioFromMusicCatalogInfo, z4, z5);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.S(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.i0(this.l);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new waf0(this, 12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryMusicInfo)) {
            return false;
        }
        StoryMusicInfo storyMusicInfo = (StoryMusicInfo) obj;
        return epx.f(this.b, storyMusicInfo.b) && epx.f(this.c, storyMusicInfo.c) && this.d == storyMusicInfo.d && this.e == storyMusicInfo.e && this.f == storyMusicInfo.f && epx.f(this.g, storyMusicInfo.g) && this.h == storyMusicInfo.h && this.i == storyMusicInfo.i && this.j == storyMusicInfo.j && this.k == storyMusicInfo.k && epx.f(this.l, storyMusicInfo.l) && this.m == storyMusicInfo.m && this.n == storyMusicInfo.n;
    }

    public final int hashCode() {
        int a2 = shy.a(this.f, shy.a(this.e, shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31);
        String str = this.g;
        int b2 = qoy.b(qoy.b(shy.a(this.i, qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31, this.k);
        AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = this.l;
        return Boolean.hashCode(this.n) + qoy.b((b2 + (audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryMusicInfo(musicTrack=");
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
        sb.append(", encodeMusic=");
        sb.append(this.h);
        sb.append(", recommendedTime=");
        sb.append(this.i);
        sb.append(", fromDuet=");
        sb.append(this.j);
        sb.append(", fromLocalVideo=");
        sb.append(this.k);
        sb.append(", musicCatalogInfo=");
        sb.append(this.l);
        sb.append(", fromVoiceOver=");
        sb.append(this.m);
        sb.append(", fromStoryBox=");
        return q0.a(sb, this.n, ')');
    }

    public StoryMusicInfo(MusicTrack musicTrack, String str, int i, int i2, int i3, String str2, boolean z, int i4, boolean z2, boolean z3, AudioFromMusicCatalogInfo audioFromMusicCatalogInfo, boolean z4, boolean z5) {
        this.b = musicTrack;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str2;
        this.h = z;
        this.i = i4;
        this.j = z2;
        this.k = z3;
        this.l = audioFromMusicCatalogInfo;
        this.m = z4;
        this.n = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoryMusicInfo(JSONObject jSONObject) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r2, jSONObject.has("from_voice_over") ? jSONObject.getBoolean("from_voice_over") : false, jSONObject.has("from_storybox") ? jSONObject.getBoolean("from_storybox") : false);
        AudioFromMusicCatalogInfo audioFromMusicCatalogInfo;
        MusicTrack.b bVar = MusicTrack.e0;
        JSONObject jSONObject2 = jSONObject.getJSONObject("music_track");
        bVar.getClass();
        MusicTrack musicTrack = new MusicTrack(jSONObject2);
        String string = jSONObject.getString("track_url");
        int i = jSONObject.getInt("start_ms");
        int i2 = jSONObject.getInt("finish_ms");
        int i3 = jSONObject.getInt("delay_ms");
        String D = f370.D(jSONObject, "file_path");
        boolean z = jSONObject.getBoolean("encode_music");
        int i4 = jSONObject.getInt("recommended_time");
        boolean z2 = jSONObject.getBoolean("from_duet");
        boolean z3 = jSONObject.getBoolean("from_local_video");
        JSONObject optJSONObject = jSONObject.optJSONObject("music_catalog_info");
        if (optJSONObject != null) {
            AudioFromMusicCatalogInfo.g.getClass();
            audioFromMusicCatalogInfo = new AudioFromMusicCatalogInfo(optJSONObject);
        } else {
            audioFromMusicCatalogInfo = null;
        }
    }
}
