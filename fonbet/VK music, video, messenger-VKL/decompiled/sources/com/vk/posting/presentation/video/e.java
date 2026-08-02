package com.vk.posting.presentation.video;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import xsna.am50;
import xsna.epx;
import xsna.gp;
import xsna.uf90;
import xsna.wf90;

/* compiled from: VideoPickerSideEffect.kt */
/* loaded from: classes5.dex */
public abstract class e {

    /* compiled from: VideoPickerSideEffect.kt */
    public static abstract class a extends e {

        /* compiled from: VideoPickerSideEffect.kt */
        /* renamed from: com.vk.posting.presentation.video.e$a$a, reason: collision with other inner class name */
        public static final class C1541a extends a {
            public static final C1541a a = new C1541a();
        }

        /* compiled from: VideoPickerSideEffect.kt */
        public static final class b extends a {
            public final VideoAlbum a;
            public final UserId b;

            public b(VideoAlbum videoAlbum, UserId userId) {
                this.a = videoAlbum;
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenAlbumVideos(videoAlbum=");
                sb.append(this.a);
                sb.append(", userId=");
                return gp.b(sb, this.b, ')');
            }
        }

        /* compiled from: VideoPickerSideEffect.kt */
        public static final class c extends a {
            public final VideoFile a;
            public final am50 b;

            public c(VideoFile videoFile, am50 am50Var) {
                this.a = videoFile;
                this.b = am50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ReturnResult(video=" + this.a + ", techMetricsCollector=" + this.b + ')';
            }
        }
    }

    /* compiled from: VideoPickerSideEffect.kt */
    public static abstract class b extends e {

        /* compiled from: VideoPickerSideEffect.kt */
        public static final class a extends b {
            public final uf90 a;

            public a(wf90 wf90Var) {
                this.a = wf90Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Init(pagingHelper=" + this.a + ')';
            }
        }
    }
}
