package com.vk.newsfeed.common.presentation.model.items.attachments.video;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.e630;
import xsna.epx;
import xsna.fw3;
import xsna.h5s;
import xsna.jq;
import xsna.ol60;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: VideoSimpleHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class VideoSimpleHolderUiDto extends ol60 {
    public final List<ImageSize> A;
    public final int B;
    public final NewsEntry h;
    public final NewsEntry i;
    public final VideoAttachment j;
    public final VideoFile k;
    public final int l;
    public final int m;
    public final String n;
    public final TitleTextMode o;
    public final SubtitleTextMode p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final List<ImageSize> z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSimpleHolderUiDto.kt */
    public static final class SubtitleTextMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtitleTextMode[] $VALUES;
        public static final SubtitleTextMode MUSIC_VIDEO;
        public static final SubtitleTextMode NONE;
        public static final SubtitleTextMode VIEWS;

        static {
            SubtitleTextMode subtitleTextMode = new SubtitleTextMode("NONE", 0);
            NONE = subtitleTextMode;
            SubtitleTextMode subtitleTextMode2 = new SubtitleTextMode("MUSIC_VIDEO", 1);
            MUSIC_VIDEO = subtitleTextMode2;
            SubtitleTextMode subtitleTextMode3 = new SubtitleTextMode("VIEWS", 2);
            VIEWS = subtitleTextMode3;
            SubtitleTextMode[] subtitleTextModeArr = {subtitleTextMode, subtitleTextMode2, subtitleTextMode3};
            $VALUES = subtitleTextModeArr;
            $ENTRIES = new asp(subtitleTextModeArr);
        }

        public SubtitleTextMode() {
            throw null;
        }

        public static SubtitleTextMode valueOf(String str) {
            return (SubtitleTextMode) Enum.valueOf(SubtitleTextMode.class, str);
        }

        public static SubtitleTextMode[] values() {
            return (SubtitleTextMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSimpleHolderUiDto.kt */
    public static final class TitleTextMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TitleTextMode[] $VALUES;
        public static final TitleTextMode DEFAULT;
        public static final TitleTextMode MUSIC_VIDEO;
        public static final TitleTextMode NONE;

        static {
            TitleTextMode titleTextMode = new TitleTextMode("NONE", 0);
            NONE = titleTextMode;
            TitleTextMode titleTextMode2 = new TitleTextMode("MUSIC_VIDEO", 1);
            MUSIC_VIDEO = titleTextMode2;
            TitleTextMode titleTextMode3 = new TitleTextMode("DEFAULT", 2);
            DEFAULT = titleTextMode3;
            TitleTextMode[] titleTextModeArr = {titleTextMode, titleTextMode2, titleTextMode3};
            $VALUES = titleTextModeArr;
            $ENTRIES = new asp(titleTextModeArr);
        }

        public TitleTextMode() {
            throw null;
        }

        public static TitleTextMode valueOf(String str) {
            return (TitleTextMode) Enum.valueOf(TitleTextMode.class, str);
        }

        public static TitleTextMode[] values() {
            return (TitleTextMode[]) $VALUES.clone();
        }
    }

    public VideoSimpleHolderUiDto(NewsEntry newsEntry, NewsEntry newsEntry2, VideoAttachment videoAttachment, VideoFile videoFile, int i, int i2, String str, TitleTextMode titleTextMode, SubtitleTextMode subtitleTextMode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, int i4, int i5, int i6, List list, ArrayList arrayList, int i7) {
        super(i7, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = videoAttachment;
        this.k = videoFile;
        this.l = i;
        this.m = i2;
        this.n = str;
        this.o = titleTextMode;
        this.p = subtitleTextMode;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = i3;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.z = list;
        this.A = arrayList;
        this.B = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSimpleHolderUiDto)) {
            return false;
        }
        VideoSimpleHolderUiDto videoSimpleHolderUiDto = (VideoSimpleHolderUiDto) obj;
        return epx.f(this.h, videoSimpleHolderUiDto.h) && epx.f(this.i, videoSimpleHolderUiDto.i) && epx.f(this.j, videoSimpleHolderUiDto.j) && epx.f(this.k, videoSimpleHolderUiDto.k) && this.l == videoSimpleHolderUiDto.l && this.m == videoSimpleHolderUiDto.m && epx.f(this.n, videoSimpleHolderUiDto.n) && this.o == videoSimpleHolderUiDto.o && this.p == videoSimpleHolderUiDto.p && this.q == videoSimpleHolderUiDto.q && this.r == videoSimpleHolderUiDto.r && this.s == videoSimpleHolderUiDto.s && this.t == videoSimpleHolderUiDto.t && this.u == videoSimpleHolderUiDto.u && this.v == videoSimpleHolderUiDto.v && this.w == videoSimpleHolderUiDto.w && this.x == videoSimpleHolderUiDto.x && this.y == videoSimpleHolderUiDto.y && epx.f(this.z, videoSimpleHolderUiDto.z) && epx.f(this.A, videoSimpleHolderUiDto.A) && this.B == videoSimpleHolderUiDto.B;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = shy.a(this.m, shy.a(this.l, jq.b(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31), 31), 31);
        String str = this.n;
        return Integer.hashCode(0) + shy.a(this.B, fw3.a(fw3.a(shy.a(this.y, shy.a(this.x, shy.a(this.w, shy.a(this.v, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.p.hashCode() + ((this.o.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31), 31), 31), 31), 31, this.z), 31, this.A), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSimpleHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", attachment=");
        sb.append(this.j);
        sb.append(", video=");
        sb.append(this.k);
        sb.append(", width=");
        sb.append(this.l);
        sb.append(", height=");
        sb.append(this.m);
        sb.append(", ref=");
        sb.append(this.n);
        sb.append(", titleTextMode=");
        sb.append(this.o);
        sb.append(", subtitleTextMode=");
        sb.append(this.p);
        sb.append(", isPending=");
        sb.append(this.q);
        sb.append(", isAdvertisement=");
        sb.append(this.r);
        sb.append(", isRestricted=");
        sb.append(this.s);
        sb.append(", isInteractive=");
        sb.append(this.t);
        sb.append(", isYoutube=");
        sb.append(this.u);
        sb.append(", videoDurationVisibility=");
        sb.append(this.v);
        sb.append(", interactiveVideoDurationVisibility=");
        sb.append(this.w);
        sb.append(", durationViewBackgroundResId=");
        sb.append(this.x);
        sb.append(", playIconResId=");
        sb.append(this.y);
        sb.append(", localImages=");
        sb.append(this.z);
        sb.append(", remoteImages=");
        sb.append(this.A);
        sb.append(", videoViewType=");
        return h5s.c(this.B, ", seqId=0)", sb);
    }
}
