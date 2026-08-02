package com.vk.clips.editor.state.model;

import com.vk.clips.editor.state.model.e;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.clips.media.VideoConfigEditor;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import xsna.bh10;
import xsna.epx;
import xsna.fzd;
import xsna.kyd;
import xsna.qoy;
import xsna.urd0;
import xsna.xq;

/* compiled from: ClipsEditorVideoItem.kt */
/* loaded from: classes16.dex */
public final class c implements kyd {
    public final File a;
    public final long b;
    public final long c;
    public final MaskLight d;
    public final ClipsEditorMusicInfo e;
    public final File f;
    public final TranscodingState g;
    public final FilterInfo h;
    public final boolean i;
    public final String j;
    public final VideoTransform k;
    public final boolean l;
    public final AudioEffectType m;
    public final AudioConfigEditor n;
    public final VideoConfigEditor o;
    public final ClipsVideoItemLocation p;
    public final fzd q;
    public final ClipsEditorVideoVolumeItem r;
    public final float s;

    public c(File file, long j, long j2, MaskLight maskLight, ClipsEditorMusicInfo clipsEditorMusicInfo, File file2, TranscodingState transcodingState, FilterInfo filterInfo, boolean z, String str, VideoTransform videoTransform, boolean z2, AudioEffectType audioEffectType, AudioConfigEditor audioConfigEditor, VideoConfigEditor videoConfigEditor, ClipsVideoItemLocation clipsVideoItemLocation, fzd fzdVar, ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem, float f) {
        this.a = file;
        this.b = j;
        this.c = j2;
        this.d = maskLight;
        this.e = clipsEditorMusicInfo;
        this.f = file2;
        this.g = transcodingState;
        this.h = filterInfo;
        this.i = z;
        this.j = str;
        this.k = videoTransform;
        this.l = z2;
        this.m = audioEffectType;
        this.n = audioConfigEditor;
        this.o = videoConfigEditor;
        this.p = clipsVideoItemLocation;
        this.q = fzdVar;
        this.r = clipsEditorVideoVolumeItem;
        this.s = f;
    }

    public static c a(c cVar, File file, long j, long j2, File file2, FilterInfo filterInfo, String str, VideoTransform videoTransform, AudioEffectType audioEffectType, fzd fzdVar, ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem, float f, int i) {
        File file3 = (i & 1) != 0 ? cVar.a : file;
        long j3 = (i & 2) != 0 ? cVar.b : j;
        long j4 = (i & 4) != 0 ? cVar.c : j2;
        MaskLight maskLight = cVar.d;
        ClipsEditorMusicInfo clipsEditorMusicInfo = cVar.e;
        File file4 = (i & 32) != 0 ? cVar.f : file2;
        TranscodingState transcodingState = cVar.g;
        FilterInfo filterInfo2 = (i & 128) != 0 ? cVar.h : filterInfo;
        boolean z = cVar.i;
        String str2 = (i & 512) != 0 ? cVar.j : str;
        VideoTransform videoTransform2 = (i & 1024) != 0 ? cVar.k : videoTransform;
        boolean z2 = cVar.l;
        AudioEffectType audioEffectType2 = (i & 4096) != 0 ? cVar.m : audioEffectType;
        AudioConfigEditor audioConfigEditor = cVar.n;
        VideoConfigEditor videoConfigEditor = cVar.o;
        ClipsVideoItemLocation clipsVideoItemLocation = cVar.p;
        fzd fzdVar2 = (i & 65536) != 0 ? cVar.q : fzdVar;
        ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem2 = (i & 131072) != 0 ? cVar.r : clipsEditorVideoVolumeItem;
        float f2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? cVar.s : f;
        cVar.getClass();
        return new c(file3, j3, j4, maskLight, clipsEditorMusicInfo, file4, transcodingState, filterInfo2, z, str2, videoTransform2, z2, audioEffectType2, audioConfigEditor, videoConfigEditor, clipsVideoItemLocation, fzdVar2, clipsEditorVideoVolumeItem2, f2);
    }

    public final long b() {
        return (long) ((this.o != null ? r0.f : 0L) / this.s);
    }

    public final int c() {
        VideoConfigEditor videoConfigEditor = this.o;
        if (videoConfigEditor != null) {
            return videoConfigEditor.c;
        }
        return 0;
    }

    public final int d() {
        VideoConfigEditor videoConfigEditor = this.o;
        if (videoConfigEditor != null) {
            return videoConfigEditor.b;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && this.g == cVar.g && epx.f(this.h, cVar.h) && this.i == cVar.i && epx.f(this.j, cVar.j) && epx.f(this.k, cVar.k) && this.l == cVar.l && this.m == cVar.m && epx.f(this.n, cVar.n) && epx.f(this.o, cVar.o) && epx.f(this.p, cVar.p) && epx.f(this.q, cVar.q) && epx.f(this.r, cVar.r) && Float.compare(this.s, cVar.s) == 0;
    }

    @Override // xsna.kyd
    public final long getDurationMs() {
        long j = this.c;
        return j != 0 ? j - this.b : b();
    }

    @Override // xsna.kyd
    public final e getOffset() {
        return e.a.a;
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        MaskLight maskLight = this.d;
        int hashCode = (a + (maskLight == null ? 0 : maskLight.hashCode())) * 31;
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.e;
        int hashCode2 = (hashCode + (clipsEditorMusicInfo == null ? 0 : clipsEditorMusicInfo.hashCode())) * 31;
        File file = this.f;
        int a2 = urd0.a(qoy.b((this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + (file == null ? 0 : file.hashCode())) * 31)) * 31)) * 31, 31, this.i), 31, this.j);
        VideoTransform videoTransform = this.k;
        int hashCode3 = (this.m.hashCode() + qoy.b((a2 + (videoTransform == null ? 0 : videoTransform.hashCode())) * 31, 31, this.l)) * 31;
        AudioConfigEditor audioConfigEditor = this.n;
        int hashCode4 = (hashCode3 + (audioConfigEditor == null ? 0 : audioConfigEditor.hashCode())) * 31;
        VideoConfigEditor videoConfigEditor = this.o;
        int hashCode5 = (hashCode4 + (videoConfigEditor == null ? 0 : videoConfigEditor.hashCode())) * 31;
        ClipsVideoItemLocation clipsVideoItemLocation = this.p;
        return Float.hashCode(this.s) + ((this.r.hashCode() + ((this.q.hashCode() + ((hashCode5 + (clipsVideoItemLocation != null ? clipsVideoItemLocation.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // xsna.kyd
    public final String m() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorVideoItem(videoFile=");
        sb.append(this.a);
        sb.append(", startTimeMs=");
        sb.append(this.b);
        sb.append(", endTimeMs=");
        sb.append(this.c);
        sb.append(", maskInfo=");
        sb.append(this.d);
        sb.append(", musicInfo=");
        sb.append(this.e);
        sb.append(", reversedVideoFile=");
        sb.append(this.f);
        sb.append(", transcodingState=");
        sb.append(this.g);
        sb.append(", clipFilterInfo=");
        sb.append(this.h);
        sb.append(", recordedWithTimer=");
        sb.append(this.i);
        sb.append(", uniqueId=");
        sb.append(this.j);
        sb.append(", transform=");
        sb.append(this.k);
        sb.append(", fromPhoto=");
        sb.append(this.l);
        sb.append(", audioEffect=");
        sb.append(this.m);
        sb.append(", audioConfig=");
        sb.append(this.n);
        sb.append(", videoConfig=");
        sb.append(this.o);
        sb.append(", originFileLocation=");
        sb.append(this.p);
        sb.append(", preview=");
        sb.append(this.q);
        sb.append(", volumeItem=");
        sb.append(this.r);
        sb.append(", speed=");
        return xq.c(')', this.s, sb);
    }
}
