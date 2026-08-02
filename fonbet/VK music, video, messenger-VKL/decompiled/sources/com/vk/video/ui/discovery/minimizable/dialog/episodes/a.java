package com.vk.video.ui.discovery.minimizable.dialog.episodes;

import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.kj50;
import xsna.lq;

/* compiled from: VideoEpisodesAction.kt */
/* loaded from: classes7.dex */
public abstract class a implements kj50 {

    /* compiled from: VideoEpisodesAction.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.dialog.episodes.a$a, reason: collision with other inner class name */
    public static final class C1984a extends a {
        public static final C1984a b = new C1984a();
    }

    /* compiled from: VideoEpisodesAction.kt */
    public static final class b extends a {
        public final VideoFile b;

        public b(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            VideoFile videoFile = this.b;
            if (videoFile == null) {
                return 0;
            }
            return videoFile.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("VideoFileUpdated(videoFile="), this.b, ')');
        }
    }
}
