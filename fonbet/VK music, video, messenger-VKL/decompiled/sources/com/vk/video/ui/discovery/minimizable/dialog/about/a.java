package com.vk.video.ui.discovery.minimizable.dialog.about;

import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.kj50;
import xsna.lq;

/* compiled from: VideoAboutAction.kt */
/* loaded from: classes7.dex */
public abstract class a implements kj50 {

    /* compiled from: VideoAboutAction.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.dialog.about.a$a, reason: collision with other inner class name */
    public static final class C1983a extends a {
        public static final C1983a b = new C1983a();
    }

    /* compiled from: VideoAboutAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: VideoAboutAction.kt */
    public static final class c extends a {
        public final VideoFile b;

        public c(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            VideoFile videoFile = this.b;
            if (videoFile == null) {
                return 0;
            }
            return videoFile.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("UpdatedVideoFile(videoFile="), this.b, ')');
        }
    }
}
