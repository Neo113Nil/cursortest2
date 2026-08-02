package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.o;
import defpackage.q0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a2s0;
import xsna.epx;
import xsna.j5g;
import xsna.mct0;
import xsna.nct0;
import xsna.qoy;
import xsna.rbt0;
import xsna.shy;

/* compiled from: VideoDiscoveryRelatedVideosState.kt */
/* loaded from: classes7.dex */
public abstract class h {

    /* compiled from: VideoDiscoveryRelatedVideosState.kt */
    public static final class a extends h implements nct0 {
        public final VideoFile a;
        public final VideoFile b;
        public final int c;
        public final VideoFile d;
        public final VideoFile e;
        public final m f;
        public final o g;
        public final VideoDiscoveryRelatedVideosSource h;
        public final VideoRelatedVideosLoopMode i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public a(VideoFile videoFile, VideoFile videoFile2, int i, VideoFile videoFile3, VideoFile videoFile4, m mVar, o oVar, VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource, VideoRelatedVideosLoopMode videoRelatedVideosLoopMode, boolean z, boolean z2, boolean z3) {
            this.a = videoFile;
            this.b = videoFile2;
            this.c = i;
            this.d = videoFile3;
            this.e = videoFile4;
            this.f = mVar;
            this.g = oVar;
            this.h = videoDiscoveryRelatedVideosSource;
            this.i = videoRelatedVideosLoopMode;
            this.j = z;
            this.k = z2;
            this.l = z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v17, types: [com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource] */
        /* JADX WARN: Type inference failed for: r14v18, types: [com.vk.video.ui.discovery.minimizable.related_videos.o] */
        public static a h(a aVar, VideoFile videoFile, VideoFile videoFile2, int i, VideoFile videoFile3, VideoFile videoFile4, m mVar, o.a aVar2, VideoDiscoveryRelatedVideosSource.Playlist playlist, VideoRelatedVideosLoopMode videoRelatedVideosLoopMode, boolean z, boolean z2, boolean z3, int i2) {
            if ((i2 & 1) != 0) {
                videoFile = aVar.a;
            }
            VideoFile videoFile5 = videoFile;
            if ((i2 & 2) != 0) {
                videoFile2 = aVar.b;
            }
            VideoFile videoFile6 = videoFile2;
            int i3 = (i2 & 4) != 0 ? aVar.c : i;
            VideoFile videoFile7 = (i2 & 8) != 0 ? aVar.d : videoFile3;
            VideoFile videoFile8 = (i2 & 16) != 0 ? aVar.e : videoFile4;
            m mVar2 = (i2 & 32) != 0 ? aVar.f : mVar;
            o.a aVar3 = (i2 & 64) != 0 ? aVar.g : aVar2;
            VideoDiscoveryRelatedVideosSource.Playlist playlist2 = (i2 & 128) != 0 ? aVar.h : playlist;
            VideoRelatedVideosLoopMode videoRelatedVideosLoopMode2 = (i2 & 256) != 0 ? aVar.i : videoRelatedVideosLoopMode;
            boolean z4 = (i2 & 512) != 0 ? aVar.j : z;
            boolean z5 = (i2 & 1024) != 0 ? aVar.k : z2;
            boolean z6 = (i2 & 2048) != 0 ? aVar.l : z3;
            aVar.getClass();
            return new a(videoFile5, videoFile6, i3, videoFile7, videoFile8, mVar2, aVar3, playlist2, videoRelatedVideosLoopMode2, z4, z5, z6);
        }

        @Override // xsna.nct0
        public final VideoRelatedVideosLoopMode a() {
            return this.i;
        }

        @Override // xsna.kat0
        public final a2s0 c() {
            VideoFile videoFile = this.k ? this.d : this.e;
            if (videoFile == null) {
                o oVar = this.g;
                if (!(oVar instanceof o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mct0 mct0Var = (mct0) j5g.k0(((o.a) oVar).a);
                videoFile = mct0Var != null ? mct0Var.c() : null;
            }
            if (videoFile != null) {
                return new a2s0(videoFile, VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
            }
            return null;
        }

        @Override // xsna.kat0
        public final a2s0 d() {
            VideoFile g = p.g(this.g, this.a);
            if (g != null) {
                return new a2s0(g, VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
            }
            return null;
        }

        @Override // xsna.kat0
        public final VideoFile e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l;
        }

        @Override // xsna.kat0
        public final a2s0 f() {
            VideoFile d = p.d(this.g, this.a);
            if (d != null) {
                return new a2s0(d, VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
            }
            return null;
        }

        @Override // xsna.kat0
        public final a2s0 g() {
            rbt0 rbt0Var;
            List<VideoFile> list;
            VideoFile videoFile = this.k ? this.e : this.d;
            if (videoFile == null) {
                o oVar = this.g;
                if (!(oVar instanceof o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mct0 mct0Var = (mct0) j5g.a0(((o.a) oVar).a);
                if (mct0Var != null && (rbt0Var = (rbt0) j5g.a0(mct0Var.e)) != null) {
                    if (rbt0Var.a != 0) {
                        rbt0Var = null;
                    }
                    if (rbt0Var != null && (list = rbt0Var.d) != null) {
                        videoFile = (VideoFile) j5g.a0(list);
                    }
                }
                videoFile = null;
            }
            if (videoFile != null) {
                return new a2s0(videoFile, VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
            }
            return null;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            VideoFile videoFile = this.b;
            int a = shy.a(this.c, (hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31, 31);
            VideoFile videoFile2 = this.d;
            int hashCode2 = (a + (videoFile2 == null ? 0 : videoFile2.hashCode())) * 31;
            VideoFile videoFile3 = this.e;
            return Boolean.hashCode(this.l) + qoy.b(qoy.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + (videoFile3 != null ? videoFile3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j), 31, this.k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(currentVideo=");
            sb.append(this.a);
            sb.append(", nextVideoFile=");
            sb.append(this.b);
            sb.append(", currentPosition=");
            sb.append(this.c);
            sb.append(", orderedFirstVideo=");
            sb.append(this.d);
            sb.append(", orderedLastVideo=");
            sb.append(this.e);
            sb.append(", pagingState=");
            sb.append(this.f);
            sb.append(", videoQueuePagingState=");
            sb.append(this.g);
            sb.append(", source=");
            sb.append(this.h);
            sb.append(", loopMode=");
            sb.append(this.i);
            sb.append(", isShuffled=");
            sb.append(this.j);
            sb.append(", isOrderReversed=");
            sb.append(this.k);
            sb.append(", isVideoPlaying=");
            return q0.a(sb, this.l, ')');
        }
    }

    /* compiled from: VideoDiscoveryRelatedVideosState.kt */
    public static final class b extends h {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1693466905;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: VideoDiscoveryRelatedVideosState.kt */
    public static final class c extends h {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1444728845;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VideoDiscoveryRelatedVideosState.kt */
    public static final class d extends h {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1208201255;
        }

        public final String toString() {
            return "NotProvided";
        }
    }
}
