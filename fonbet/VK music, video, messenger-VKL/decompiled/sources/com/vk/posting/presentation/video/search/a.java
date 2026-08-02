package com.vk.posting.presentation.video.search;

import com.vk.dto.common.VideoFile;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.lq;

/* compiled from: SearchVideoPickerAction.kt */
/* loaded from: classes5.dex */
public abstract class a implements kj50 {

    /* compiled from: SearchVideoPickerAction.kt */
    /* renamed from: com.vk.posting.presentation.video.search.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1542a extends a {

        /* compiled from: SearchVideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.search.a$a$a, reason: collision with other inner class name */
        public static final class C1543a extends AbstractC1542a {
            public static final C1543a b = new C1543a();
        }
    }

    /* compiled from: SearchVideoPickerAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: SearchVideoPickerAction.kt */
    public static final class c extends a {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("InputSearchText(text="), this.b, ')');
        }
    }

    /* compiled from: SearchVideoPickerAction.kt */
    public static abstract class d extends a {

        /* compiled from: SearchVideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.search.a$d$a, reason: collision with other inner class name */
        public static final class C1544a extends d {
            public static final C1544a b = new C1544a();
        }
    }

    /* compiled from: SearchVideoPickerAction.kt */
    public static abstract class e extends a {

        /* compiled from: SearchVideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.search.a$e$a, reason: collision with other inner class name */
        public static final class C1545a extends e {
        }

        /* compiled from: SearchVideoPickerAction.kt */
        public static final class b extends e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1669122001;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: SearchVideoPickerAction.kt */
    public static abstract class f extends a {

        /* compiled from: SearchVideoPickerAction.kt */
        /* renamed from: com.vk.posting.presentation.video.search.a$f$a, reason: collision with other inner class name */
        public static final class C1546a extends f {
            public final VideoFile b;

            public C1546a(VideoFile videoFile) {
                this.b = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1546a) && epx.f(this.b, ((C1546a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("Video(video="), this.b, ')');
            }
        }
    }

    /* compiled from: SearchVideoPickerAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }
}
