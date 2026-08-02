package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.jq;
import xsna.km50;
import xsna.mbt0;
import xsna.qoy;
import xsna.shy;

/* compiled from: VideoRelatedVideosState.kt */
/* loaded from: classes7.dex */
public interface j extends km50 {

    /* compiled from: VideoRelatedVideosState.kt */
    public static final class a implements j {
        public final VideoDiscoveryRelatedVideosSource b;
        public final VideoFile c;
        public final int d;
        public final m e;
        public final List<mbt0> f;
        public final VideoRelatedVideosLoopMode g;
        public final boolean h;
        public final boolean i;

        public a(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource, VideoFile videoFile, int i, m mVar, List<mbt0> list, VideoRelatedVideosLoopMode videoRelatedVideosLoopMode, boolean z, boolean z2) {
            this.b = videoDiscoveryRelatedVideosSource;
            this.c = videoFile;
            this.d = i;
            this.e = mVar;
            this.f = list;
            this.g = videoRelatedVideosLoopMode;
            this.h = z;
            this.i = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + fw3.a((this.e.hashCode() + shy.a(this.d, jq.b(this.c, this.b.hashCode() * 31, 31), 31)) * 31, 31, this.f)) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(source=");
            sb.append(this.b);
            sb.append(", currentVideoFile=");
            sb.append(this.c);
            sb.append(", currentPosition=");
            sb.append(this.d);
            sb.append(", pagingState=");
            sb.append(this.e);
            sb.append(", videos=");
            sb.append(this.f);
            sb.append(", loopMode=");
            sb.append(this.g);
            sb.append(", isShuffled=");
            sb.append(this.h);
            sb.append(", isOrderReversed=");
            return q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: VideoRelatedVideosState.kt */
    public static final class b implements j {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -371547275;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
