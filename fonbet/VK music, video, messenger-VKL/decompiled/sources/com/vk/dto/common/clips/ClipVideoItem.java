package com.vk.dto.common.clips;

import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.common.clips.AudioConfig;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.ozl;
import xsna.qm1;
import xsna.qoy;
import xsna.shy;
import xsna.xq;

/* compiled from: ClipVideoItem.kt */
@ozl
/* loaded from: classes18.dex */
public final class ClipVideoItem implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipVideoItem> CREATOR = new b();
    public static final a t = new a();
    public final String b;
    public final int c;
    public final String d;
    public final StoryMusicInfo e;
    public final MaskLight f;
    public final long g;
    public final float h;
    public final int i;
    public final int j;
    public final FilterInfo k;
    public final TranscodingState l;
    public final boolean m;
    public final VideoTransform n;
    public final boolean o;
    public final AudioEffectType p;
    public final AudioConfig q;
    public final ClipsVideoItemLocation r;
    public final float s;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipVideoItem> {
        @Override // xsna.aay
        public final ClipVideoItem a(JSONObject jSONObject) {
            return new ClipVideoItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipVideoItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipVideoItem a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            int u = serializer.u();
            String H2 = serializer.H();
            StoryMusicInfo storyMusicInfo = (StoryMusicInfo) serializer.G(StoryMusicInfo.class.getClassLoader());
            MaskLight maskLight = (MaskLight) serializer.G(MaskLight.class.getClassLoader());
            String str = H;
            long w = serializer.w();
            float s = serializer.s();
            int u2 = serializer.u();
            int u3 = serializer.u();
            FilterInfo filterInfo = (FilterInfo) serializer.A(FilterInfo.class.getClassLoader());
            if (filterInfo == null) {
                filterInfo = new FilterInfo(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null);
            }
            TranscodingState.a aVar = TranscodingState.Companion;
            String H3 = serializer.H();
            aVar.getClass();
            TranscodingState a = TranscodingState.a.a(H3);
            FilterInfo filterInfo2 = filterInfo;
            boolean m = serializer.m();
            VideoTransform videoTransform = (VideoTransform) serializer.G(VideoTransform.class.getClassLoader());
            boolean m2 = serializer.m();
            AudioEffectType.a aVar2 = AudioEffectType.Companion;
            String H4 = serializer.H();
            String str2 = H4 != null ? H4 : "";
            aVar2.getClass();
            return new ClipVideoItem(str, u, H2, storyMusicInfo, maskLight, w, s, u2, u3, filterInfo2, a, m, videoTransform, m2, AudioEffectType.a.a(str2), (AudioConfig) serializer.G(AudioConfig.class.getClassLoader()), (ClipsVideoItemLocation) serializer.G(ClipsVideoItemLocation.class.getClassLoader()), serializer.s());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipVideoItem[i];
        }
    }

    public ClipVideoItem(String str, int i, String str2, StoryMusicInfo storyMusicInfo, MaskLight maskLight, long j, float f, int i2, int i3, FilterInfo filterInfo, TranscodingState transcodingState, boolean z, VideoTransform videoTransform, boolean z2, AudioEffectType audioEffectType, AudioConfig audioConfig, ClipsVideoItemLocation clipsVideoItemLocation, float f2) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = storyMusicInfo;
        this.f = maskLight;
        this.g = j;
        this.h = f;
        this.i = i2;
        this.j = i3;
        this.k = filterInfo;
        this.l = transcodingState;
        this.m = z;
        this.n = videoTransform;
        this.o = z2;
        this.p = audioEffectType;
        this.q = audioConfig;
        this.r = clipsVideoItemLocation;
        this.s = f2;
    }

    public static ClipVideoItem a(ClipVideoItem clipVideoItem, String str, int i, int i2, ClipsVideoItemLocation clipsVideoItemLocation, int i3) {
        String str2 = (i3 & 1) != 0 ? clipVideoItem.b : str;
        int i4 = (i3 & 2) != 0 ? clipVideoItem.c : i;
        String str3 = clipVideoItem.d;
        StoryMusicInfo storyMusicInfo = clipVideoItem.e;
        MaskLight maskLight = clipVideoItem.f;
        long j = (i3 & 32) != 0 ? clipVideoItem.g : 0L;
        float f = clipVideoItem.h;
        int i5 = clipVideoItem.i;
        int i6 = (i3 & 256) != 0 ? clipVideoItem.j : i2;
        FilterInfo filterInfo = clipVideoItem.k;
        TranscodingState transcodingState = clipVideoItem.l;
        boolean z = clipVideoItem.m;
        VideoTransform videoTransform = clipVideoItem.n;
        boolean z2 = clipVideoItem.o;
        AudioEffectType audioEffectType = clipVideoItem.p;
        AudioConfig audioConfig = clipVideoItem.q;
        ClipsVideoItemLocation clipsVideoItemLocation2 = (i3 & 65536) != 0 ? clipVideoItem.r : clipsVideoItemLocation;
        float f2 = clipVideoItem.s;
        clipVideoItem.getClass();
        return new ClipVideoItem(str2, i4, str3, storyMusicInfo, maskLight, j, f, i5, i6, filterInfo, transcodingState, z, videoTransform, z2, audioEffectType, audioConfig, clipsVideoItemLocation2, f2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.Y(this.g);
        serializer.P(this.h);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.e0(this.k);
        serializer.j0(this.l.name());
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.i0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.j0(this.p.name());
        serializer.i0(this.q);
        serializer.i0(this.r);
        serializer.P(this.s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new qm1(this, 25));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipVideoItem)) {
            return false;
        }
        ClipVideoItem clipVideoItem = (ClipVideoItem) obj;
        return epx.f(this.b, clipVideoItem.b) && this.c == clipVideoItem.c && epx.f(this.d, clipVideoItem.d) && epx.f(this.e, clipVideoItem.e) && epx.f(this.f, clipVideoItem.f) && this.g == clipVideoItem.g && Float.compare(this.h, clipVideoItem.h) == 0 && this.i == clipVideoItem.i && this.j == clipVideoItem.j && epx.f(this.k, clipVideoItem.k) && this.l == clipVideoItem.l && this.m == clipVideoItem.m && epx.f(this.n, clipVideoItem.n) && this.o == clipVideoItem.o && this.p == clipVideoItem.p && epx.f(this.q, clipVideoItem.q) && epx.f(this.r, clipVideoItem.r) && Float.compare(this.s, clipVideoItem.s) == 0;
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        StoryMusicInfo storyMusicInfo = this.e;
        int hashCode2 = (hashCode + (storyMusicInfo == null ? 0 : storyMusicInfo.hashCode())) * 31;
        MaskLight maskLight = this.f;
        int b2 = qoy.b((this.l.hashCode() + ((this.k.hashCode() + shy.a(this.j, shy.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, bh10.a((hashCode2 + (maskLight == null ? 0 : maskLight.hashCode())) * 31, 31, this.g), 31), 31), 31)) * 31)) * 31, 31, this.m);
        VideoTransform videoTransform = this.n;
        int hashCode3 = (this.p.hashCode() + qoy.b((b2 + (videoTransform == null ? 0 : videoTransform.hashCode())) * 31, 31, this.o)) * 31;
        AudioConfig audioConfig = this.q;
        int hashCode4 = (hashCode3 + (audioConfig == null ? 0 : audioConfig.hashCode())) * 31;
        ClipsVideoItemLocation clipsVideoItemLocation = this.r;
        return Float.hashCode(this.s) + ((hashCode4 + (clipsVideoItemLocation != null ? clipsVideoItemLocation.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipVideoItem(fileUri=");
        sb.append(this.b);
        sb.append(", originalDuration=");
        sb.append(this.c);
        sb.append(", reversedFileUri=");
        sb.append(this.d);
        sb.append(", music=");
        sb.append(this.e);
        sb.append(", mask=");
        sb.append(this.f);
        sb.append(", clipVideoAudioShiftMs=");
        sb.append(this.g);
        sb.append(", speed=");
        sb.append(this.h);
        sb.append(", startMs=");
        sb.append(this.i);
        sb.append(", endMs=");
        sb.append(this.j);
        sb.append(", filterInfo=");
        sb.append(this.k);
        sb.append(", transcodingState=");
        sb.append(this.l);
        sb.append(", recordedWithTimer=");
        sb.append(this.m);
        sb.append(", transform=");
        sb.append(this.n);
        sb.append(", fromPhoto=");
        sb.append(this.o);
        sb.append(", audioEffect=");
        sb.append(this.p);
        sb.append(", audioConfig=");
        sb.append(this.q);
        sb.append(", originFileLocation=");
        sb.append(this.r);
        sb.append(", volume=");
        return xq.c(')', this.s, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClipVideoItem(java.lang.String r24, int r25, java.lang.String r26, com.vk.dto.music.StoryMusicInfo r27, com.vk.dto.clips.masks.MaskLight r28, long r29, float r31, int r32, int r33, com.vk.dto.clips.filters.FilterInfo r34, com.vk.dto.clips.gallery.TranscodingState r35, boolean r36, com.vk.dto.clips.VideoTransform r37, boolean r38, com.vk.dto.clips.morphing.AudioEffectType r39, com.vk.dto.common.clips.AudioConfig r40, com.vk.dto.clips.ClipsVideoItemLocation r41, float r42, int r43, xsna.zcl r44) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.common.clips.ClipVideoItem.<init>(java.lang.String, int, java.lang.String, com.vk.dto.music.StoryMusicInfo, com.vk.dto.clips.masks.MaskLight, long, float, int, int, com.vk.dto.clips.filters.FilterInfo, com.vk.dto.clips.gallery.TranscodingState, boolean, com.vk.dto.clips.VideoTransform, boolean, com.vk.dto.clips.morphing.AudioEffectType, com.vk.dto.common.clips.AudioConfig, com.vk.dto.clips.ClipsVideoItemLocation, float, int, xsna.zcl):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(28:68|69|70|4|(25:62|63|64|7|(1:9)(1:61)|10|(1:12)(1:60)|13|(1:15)(1:59)|16|(1:18)(1:58)|19|20|21|(12:23|24|25|26|(3:28|(2:31|32)|30)|36|(3:46|47|48)|38|(1:40)(1:45)|41|42|43)|56|54|(0)|36|(0)|38|(0)(0)|41|42|43)|6|7|(0)(0)|10|(0)(0)|13|(0)(0)|16|(0)(0)|19|20|21|(0)|56|54|(0)|36|(0)|38|(0)(0)|41|42|43)|3|4|(0)|6|7|(0)(0)|10|(0)(0)|13|(0)(0)|16|(0)(0)|19|20|21|(0)|56|54|(0)|36|(0)|38|(0)(0)|41|42|43) */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #3 {all -> 0x00fa, blocks: (B:21:0x00e9, B:23:0x00f1), top: B:20:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipVideoItem(JSONObject jSONObject) {
        this(r20, r3, r4, r5, r6, r18, r9, r10, r11, r12, r13, r14, r17, r16, r8, r2, r7, r0 == null ? r0.floatValue() : 1.0f);
        StoryMusicInfo storyMusicInfo;
        MaskLight maskLight;
        JSONObject optJSONObject;
        FilterInfo filterInfo;
        JSONObject optJSONObject2;
        VideoTransform videoTransform;
        long j;
        float f;
        int i;
        int i2;
        FilterInfo filterInfo2;
        TranscodingState transcodingState;
        boolean z;
        boolean z2;
        String str;
        AudioConfig audioConfig;
        String string = jSONObject.getString("file_uri");
        String D = f370.D(jSONObject, "file_uri_reversed");
        int i3 = jSONObject.getInt("duration");
        StoryMusicInfo.a aVar = StoryMusicInfo.o;
        ClipsVideoItemLocation clipsVideoItemLocation = null;
        if (jSONObject.has("music_info")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("music_info");
                aVar.getClass();
                storyMusicInfo = new StoryMusicInfo(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
            MaskLight.a aVar2 = MaskLight.f;
            if (jSONObject.has("mask")) {
                try {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("mask");
                    aVar2.getClass();
                    maskLight = new MaskLight(jSONObject3);
                } catch (JSONException e2) {
                    L.i(e2);
                }
                long j2 = jSONObject.getLong("audio_shift");
                float f2 = (float) jSONObject.getDouble("speed");
                int i4 = jSONObject.getInt("start_ms");
                int i5 = jSONObject.getInt("end_ms");
                optJSONObject = jSONObject.optJSONObject("filter_info");
                if (optJSONObject != null) {
                    filterInfo = FilterInfo.a.a(optJSONObject);
                } else {
                    filterInfo = new FilterInfo(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null);
                }
                TranscodingState.a aVar3 = TranscodingState.Companion;
                String D2 = f370.D(jSONObject, "transcoding_state");
                aVar3.getClass();
                TranscodingState a2 = TranscodingState.a.a(D2);
                boolean optBoolean = jSONObject.optBoolean("recorded_with_timer", false);
                optJSONObject2 = jSONObject.optJSONObject("transform");
                if (optJSONObject2 != null) {
                    Serializer.c<VideoTransform> cVar = VideoTransform.CREATOR;
                    videoTransform = VideoTransform.a.a(optJSONObject2);
                } else {
                    videoTransform = null;
                }
                if (jSONObject.has("from_photo")) {
                    j = j2;
                    f = f2;
                    i = i4;
                    i2 = i5;
                    filterInfo2 = filterInfo;
                    transcodingState = a2;
                    z = optBoolean;
                    z2 = jSONObject.getBoolean("from_photo");
                } else {
                    j = j2;
                    f = f2;
                    i = i4;
                    i2 = i5;
                    filterInfo2 = filterInfo;
                    transcodingState = a2;
                    z = optBoolean;
                    z2 = false;
                }
                AudioEffectType.a aVar4 = AudioEffectType.Companion;
                String string2 = jSONObject.has("audio_effect") ? jSONObject.getString("audio_effect") : "";
                aVar4.getClass();
                AudioEffectType a3 = AudioEffectType.a.a(string2);
                if (jSONObject.getBoolean("has_audio_track")) {
                    str = string;
                    try {
                        audioConfig = new AudioConfig(0, 0, 3, null);
                    } catch (Throwable unused) {
                    }
                    if (audioConfig == null) {
                        AudioConfig.a aVar5 = AudioConfig.d;
                        if (jSONObject.has("audio_config")) {
                            try {
                                JSONObject jSONObject4 = jSONObject.getJSONObject("audio_config");
                                aVar5.getClass();
                                audioConfig = new AudioConfig(jSONObject4);
                            } catch (JSONException e3) {
                                L.i(e3);
                            }
                        }
                        audioConfig = null;
                    }
                    AudioConfig audioConfig2 = audioConfig;
                    ClipsVideoItemLocation.b bVar = ClipsVideoItemLocation.d;
                    if (jSONObject.has("location")) {
                        try {
                            JSONObject jSONObject5 = jSONObject.getJSONObject("location");
                            bVar.getClass();
                            clipsVideoItemLocation = new ClipsVideoItemLocation(jSONObject5);
                        } catch (JSONException e4) {
                            L.i(e4);
                        }
                    }
                    Float u = f370.u("volume", jSONObject);
                }
                str = string;
                audioConfig = null;
                if (audioConfig == null) {
                }
                AudioConfig audioConfig22 = audioConfig;
                ClipsVideoItemLocation.b bVar2 = ClipsVideoItemLocation.d;
                if (jSONObject.has("location")) {
                }
                Float u2 = f370.u("volume", jSONObject);
            }
            maskLight = null;
            long j22 = jSONObject.getLong("audio_shift");
            float f22 = (float) jSONObject.getDouble("speed");
            int i42 = jSONObject.getInt("start_ms");
            int i52 = jSONObject.getInt("end_ms");
            optJSONObject = jSONObject.optJSONObject("filter_info");
            if (optJSONObject != null) {
            }
            TranscodingState.a aVar32 = TranscodingState.Companion;
            String D22 = f370.D(jSONObject, "transcoding_state");
            aVar32.getClass();
            TranscodingState a22 = TranscodingState.a.a(D22);
            boolean optBoolean2 = jSONObject.optBoolean("recorded_with_timer", false);
            optJSONObject2 = jSONObject.optJSONObject("transform");
            if (optJSONObject2 != null) {
            }
            if (jSONObject.has("from_photo")) {
            }
            AudioEffectType.a aVar42 = AudioEffectType.Companion;
            if (jSONObject.has("audio_effect")) {
            }
            aVar42.getClass();
            AudioEffectType a32 = AudioEffectType.a.a(string2);
            if (jSONObject.getBoolean("has_audio_track")) {
            }
            str = string;
            audioConfig = null;
            if (audioConfig == null) {
            }
            AudioConfig audioConfig222 = audioConfig;
            ClipsVideoItemLocation.b bVar22 = ClipsVideoItemLocation.d;
            if (jSONObject.has("location")) {
            }
            Float u22 = f370.u("volume", jSONObject);
        }
        storyMusicInfo = null;
        MaskLight.a aVar22 = MaskLight.f;
        if (jSONObject.has("mask")) {
        }
        maskLight = null;
        long j222 = jSONObject.getLong("audio_shift");
        float f222 = (float) jSONObject.getDouble("speed");
        int i422 = jSONObject.getInt("start_ms");
        int i522 = jSONObject.getInt("end_ms");
        optJSONObject = jSONObject.optJSONObject("filter_info");
        if (optJSONObject != null) {
        }
        TranscodingState.a aVar322 = TranscodingState.Companion;
        String D222 = f370.D(jSONObject, "transcoding_state");
        aVar322.getClass();
        TranscodingState a222 = TranscodingState.a.a(D222);
        boolean optBoolean22 = jSONObject.optBoolean("recorded_with_timer", false);
        optJSONObject2 = jSONObject.optJSONObject("transform");
        if (optJSONObject2 != null) {
        }
        if (jSONObject.has("from_photo")) {
        }
        AudioEffectType.a aVar422 = AudioEffectType.Companion;
        if (jSONObject.has("audio_effect")) {
        }
        aVar422.getClass();
        AudioEffectType a322 = AudioEffectType.a.a(string2);
        if (jSONObject.getBoolean("has_audio_track")) {
        }
        str = string;
        audioConfig = null;
        if (audioConfig == null) {
        }
        AudioConfig audioConfig2222 = audioConfig;
        ClipsVideoItemLocation.b bVar222 = ClipsVideoItemLocation.d;
        if (jSONObject.has("location")) {
        }
        Float u222 = f370.u("volume", jSONObject);
    }
}
