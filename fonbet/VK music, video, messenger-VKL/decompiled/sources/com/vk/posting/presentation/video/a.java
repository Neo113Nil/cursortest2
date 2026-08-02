package com.vk.posting.presentation.video;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import xsna.epx;
import xsna.kj50;
import xsna.lq;

/* compiled from: VideoPickerAction.kt */
/* loaded from: classes5.dex */
public abstract class a implements kj50 {

    /* compiled from: VideoPickerAction.kt */
    /* renamed from: com.vk.posting.presentation.video.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1531a extends a {

        /* compiled from: VideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.a$a$a, reason: collision with other inner class name */
        public static final class C1532a extends AbstractC1531a {
            public static final C1532a b = new C1532a();
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class b extends a {

        /* compiled from: VideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.a$b$a, reason: collision with other inner class name */
        public static abstract class AbstractC1533a extends b {

            /* compiled from: VideoPickerAction.kt */
            /* renamed from: com.vk.posting.presentation.video.a$b$a$a, reason: collision with other inner class name */
            public static final class C1534a extends AbstractC1533a {
                public static final C1534a b = new C1534a();
            }

            /* compiled from: VideoPickerAction.kt */
            /* renamed from: com.vk.posting.presentation.video.a$b$a$b, reason: collision with other inner class name */
            public static final class C1535b extends AbstractC1533a {
                public static final C1535b b = new C1535b();
            }
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class d extends a {

        /* compiled from: VideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.a$d$a, reason: collision with other inner class name */
        public static final class C1536a extends d {
            public static final C1536a b = new C1536a();
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class e extends a {

        /* compiled from: VideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.a$e$a, reason: collision with other inner class name */
        public static final class C1537a extends e {
        }

        /* compiled from: VideoPickerAction.kt */
        public static final class b extends e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1096012001;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class f extends a {

        /* compiled from: VideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.a$f$a, reason: collision with other inner class name */
        public static final class C1538a extends f {
            public final VideoAlbum b;

            public C1538a(VideoAlbum videoAlbum) {
                this.b = videoAlbum;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1538a) && epx.f(this.b, ((C1538a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Album(album=" + this.b + ')';
            }
        }

        /* compiled from: VideoPickerAction.kt */
        public static final class b extends f {
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
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("Video(video="), this.b, ')');
            }
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }
}
