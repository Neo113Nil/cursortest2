package com.vk.dto.clips.model;

import android.os.Parcel;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.media.VideoConfigEditor;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import java.io.File;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.kf1;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ClipsEditorInputVideoItem.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorInputVideoItem implements Serializer.StreamParcelable, bxx {
    public final File b;
    public final long c;
    public final long d;
    public final MaskLight e;
    public final ClipsEditorMusicInfo f;
    public final File g;
    public final TranscodingState h;
    public final FilterInfo i;
    public final boolean j;
    public final float k;
    public final VideoTransform l;
    public final boolean m;
    public final AudioEffectType n;
    public final AudioConfigEditor o;
    public final VideoConfigEditor p;
    public final ClipsVideoItemLocation q;
    public final ClipsEditorVideoVolumeItem r;
    public static final a s = new a();
    public static final Serializer.c<ClipsEditorInputVideoItem> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsEditorInputVideoItem> {
        @Override // xsna.aay
        public final ClipsEditorInputVideoItem a(JSONObject jSONObject) {
            return new ClipsEditorInputVideoItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsEditorInputVideoItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsEditorInputVideoItem a(Serializer serializer) {
            File file = new File(String.valueOf(serializer.H()));
            long w = serializer.w();
            long w2 = serializer.w();
            MaskLight maskLight = (MaskLight) serializer.G(MaskLight.class.getClassLoader());
            ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) serializer.G(ClipsEditorMusicInfo.class.getClassLoader());
            String I = serializer.I();
            File file2 = I != null ? new File(I) : null;
            TranscodingState.a aVar = TranscodingState.Companion;
            String H = serializer.H();
            aVar.getClass();
            TranscodingState a = TranscodingState.a.a(H);
            FilterInfo filterInfo = (FilterInfo) serializer.A(FilterInfo.class.getClassLoader());
            boolean m = serializer.m();
            float s = serializer.s();
            VideoTransform videoTransform = (VideoTransform) serializer.G(VideoTransform.class.getClassLoader());
            boolean m2 = serializer.m();
            AudioEffectType.a aVar2 = AudioEffectType.Companion;
            String H2 = serializer.H();
            aVar2.getClass();
            return new ClipsEditorInputVideoItem(file, w, w2, maskLight, clipsEditorMusicInfo, file2, a, filterInfo, m, s, videoTransform, m2, AudioEffectType.a.a(H2), (AudioConfigEditor) serializer.A(AudioConfigEditor.class.getClassLoader()), (VideoConfigEditor) serializer.A(VideoConfigEditor.class.getClassLoader()), (ClipsVideoItemLocation) serializer.G(ClipsVideoItemLocation.class.getClassLoader()), (ClipsEditorVideoVolumeItem) serializer.A(ClipsEditorVideoVolumeItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsEditorInputVideoItem[i];
        }
    }

    public ClipsEditorInputVideoItem(File file, long j, long j2, MaskLight maskLight, ClipsEditorMusicInfo clipsEditorMusicInfo, File file2, TranscodingState transcodingState, FilterInfo filterInfo, boolean z, float f, VideoTransform videoTransform, boolean z2, AudioEffectType audioEffectType, AudioConfigEditor audioConfigEditor, VideoConfigEditor videoConfigEditor, ClipsVideoItemLocation clipsVideoItemLocation, ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem) {
        this.b = file;
        this.c = j;
        this.d = j2;
        this.e = maskLight;
        this.f = clipsEditorMusicInfo;
        this.g = file2;
        this.h = transcodingState;
        this.i = filterInfo;
        this.j = z;
        this.k = f;
        this.l = videoTransform;
        this.m = z2;
        this.n = audioEffectType;
        this.o = audioConfigEditor;
        this.p = videoConfigEditor;
        this.q = clipsVideoItemLocation;
        this.r = clipsEditorVideoVolumeItem;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.getPath());
        serializer.Y(this.c);
        serializer.Y(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        File file = this.g;
        serializer.m0(file != null ? file.getPath() : null);
        serializer.j0(this.h.name());
        serializer.e0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.P(this.k);
        serializer.i0(this.l);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.j0(this.n.name());
        serializer.e0(this.o);
        serializer.e0(this.p);
        serializer.i0(this.q);
        serializer.e0(this.r);
    }

    public final long d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final File e() {
        return this.g;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new kf1(this, 18));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorInputVideoItem)) {
            return false;
        }
        ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) obj;
        return epx.f(this.b, clipsEditorInputVideoItem.b) && this.c == clipsEditorInputVideoItem.c && this.d == clipsEditorInputVideoItem.d && epx.f(this.e, clipsEditorInputVideoItem.e) && epx.f(this.f, clipsEditorInputVideoItem.f) && epx.f(this.g, clipsEditorInputVideoItem.g) && this.h == clipsEditorInputVideoItem.h && epx.f(this.i, clipsEditorInputVideoItem.i) && this.j == clipsEditorInputVideoItem.j && Float.compare(this.k, clipsEditorInputVideoItem.k) == 0 && epx.f(this.l, clipsEditorInputVideoItem.l) && this.m == clipsEditorInputVideoItem.m && this.n == clipsEditorInputVideoItem.n && epx.f(this.o, clipsEditorInputVideoItem.o) && epx.f(this.p, clipsEditorInputVideoItem.p) && epx.f(this.q, clipsEditorInputVideoItem.q) && epx.f(this.r, clipsEditorInputVideoItem.r);
    }

    public final long f() {
        return this.c;
    }

    public final File g() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        MaskLight maskLight = this.e;
        int hashCode = (a2 + (maskLight == null ? 0 : maskLight.hashCode())) * 31;
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.f;
        int hashCode2 = (hashCode + (clipsEditorMusicInfo == null ? 0 : clipsEditorMusicInfo.hashCode())) * 31;
        File file = this.g;
        int a3 = io.reactivex.rxjava3.subjects.b.a(this.k, qoy.b((this.i.hashCode() + ((this.h.hashCode() + ((hashCode2 + (file == null ? 0 : file.hashCode())) * 31)) * 31)) * 31, 31, this.j), 31);
        VideoTransform videoTransform = this.l;
        int hashCode3 = (this.n.hashCode() + qoy.b((a3 + (videoTransform == null ? 0 : videoTransform.hashCode())) * 31, 31, this.m)) * 31;
        AudioConfigEditor audioConfigEditor = this.o;
        int hashCode4 = (hashCode3 + (audioConfigEditor == null ? 0 : audioConfigEditor.hashCode())) * 31;
        VideoConfigEditor videoConfigEditor = this.p;
        int hashCode5 = (hashCode4 + (videoConfigEditor == null ? 0 : videoConfigEditor.hashCode())) * 31;
        ClipsVideoItemLocation clipsVideoItemLocation = this.q;
        return this.r.hashCode() + ((hashCode5 + (clipsVideoItemLocation != null ? clipsVideoItemLocation.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClipsEditorInputVideoItem(videoFile=" + this.b + ", startTimeMs=" + this.c + ", endTimeMs=" + this.d + ", maskInfo=" + this.e + ", musicInfo=" + this.f + ", reversedVideoFile=" + this.g + ", transcodingState=" + this.h + ", clipFilterInfo=" + this.i + ", recordedWithTimer=" + this.j + ", speed=" + this.k + ", transform=" + this.l + ", fromPhoto=" + this.m + ", audioEffect=" + this.n + ", audioConfig=" + this.o + ", videoConfig=" + this.p + ", originFileLocation=" + this.q + ", volumeItem=" + this.r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ClipsEditorInputVideoItem(File file, long j, long j2, MaskLight maskLight, ClipsEditorMusicInfo clipsEditorMusicInfo, File file2, TranscodingState transcodingState, FilterInfo filterInfo, boolean z, float f, VideoTransform videoTransform, boolean z2, AudioEffectType audioEffectType, AudioConfigEditor audioConfigEditor, VideoConfigEditor videoConfigEditor, ClipsVideoItemLocation clipsVideoItemLocation, ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem, int i, zcl zclVar) {
        this(file, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? null : maskLight, (i & 16) != 0 ? null : clipsEditorMusicInfo, (i & 32) != 0 ? null : file2, transcodingState, (i & 128) != 0 ? new FilterInfo(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null) : filterInfo, (i & 256) != 0 ? false : z, (i & 512) != 0 ? 1.0f : f, (i & 1024) != 0 ? null : videoTransform, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? AudioEffectType.DEFAULT : audioEffectType, (i & 8192) != 0 ? null : audioConfigEditor, (i & 16384) != 0 ? null : videoConfigEditor, (32768 & i) != 0 ? null : clipsVideoItemLocation, (i & 65536) != 0 ? new ClipsEditorVideoVolumeItem(1.0f, false, 2, null) : clipsEditorVideoVolumeItem);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsEditorInputVideoItem(JSONObject jSONObject) {
        this(r1, r2, r4, r6, r7, r8, r10, r11, r12, r13, r14, r15, r9, r1, r17, r1, r19);
        FilterInfo filterInfo;
        VideoTransform videoTransform;
        VideoConfigEditor videoConfigEditor;
        ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem;
        long j;
        File file = new File(jSONObject.getString(X3.i.b));
        long j2 = jSONObject.getLong("start_ms");
        long j3 = jSONObject.getLong("end_ms");
        MaskLight maskLight = (MaskLight) aay.a.c(jSONObject, "mask", MaskLight.f);
        ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) aay.a.c(jSONObject, "music", ClipsEditorMusicInfo.m);
        String D = f370.D(jSONObject, "rev_file");
        File file2 = D != null ? new File(D) : null;
        TranscodingState.a aVar = TranscodingState.Companion;
        String string = jSONObject.getString("transcoding_state");
        aVar.getClass();
        TranscodingState a2 = TranscodingState.a.a(string);
        JSONObject optJSONObject = jSONObject.optJSONObject("filter_info");
        if (optJSONObject != null) {
            filterInfo = FilterInfo.a.a(optJSONObject);
        } else {
            filterInfo = new FilterInfo(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null);
        }
        boolean z = jSONObject.getBoolean("is_timer");
        Float u = f370.u("speed", jSONObject);
        float floatValue = u != null ? u.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transform");
        if (optJSONObject2 != null) {
            Serializer.c<VideoTransform> cVar = VideoTransform.CREATOR;
            videoTransform = VideoTransform.a.a(optJSONObject2);
        } else {
            videoTransform = null;
        }
        boolean z2 = jSONObject.getBoolean("photo");
        AudioEffectType.a aVar2 = AudioEffectType.Companion;
        String string2 = jSONObject.getString("audio_effect");
        aVar2.getClass();
        AudioEffectType a3 = AudioEffectType.a.a(string2);
        AudioConfigEditor audioConfigEditor = (AudioConfigEditor) aay.a.c(jSONObject, "audio_config", AudioConfigEditor.d);
        VideoConfigEditor videoConfigEditor2 = (VideoConfigEditor) aay.a.c(jSONObject, "video_config", VideoConfigEditor.g);
        ClipsVideoItemLocation clipsVideoItemLocation = (ClipsVideoItemLocation) aay.a.c(jSONObject, "location", ClipsVideoItemLocation.d);
        ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem2 = (ClipsEditorVideoVolumeItem) aay.a.c(jSONObject, "volume", ClipsEditorVideoVolumeItem.d);
        if (clipsEditorVideoVolumeItem2 == null) {
            Float u2 = f370.u("volume", jSONObject);
            clipsEditorVideoVolumeItem = new ClipsEditorVideoVolumeItem(u2 != null ? u2.floatValue() : 1.0f, false, 2, null);
            j = j2;
            videoConfigEditor = videoConfigEditor2;
            j3 = j3;
        } else {
            videoConfigEditor = videoConfigEditor2;
            clipsEditorVideoVolumeItem = clipsEditorVideoVolumeItem2;
            j = j2;
        }
    }
}
