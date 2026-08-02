package com.vk.posting.presentation.video;

import com.vk.posting.presentation.video.model.VideoPickerFilter;
import xsna.epx;
import xsna.ewp;
import xsna.wia0;
import xsna.xl50;

/* compiled from: VideoPickerPatch.kt */
/* loaded from: classes5.dex */
public abstract class c implements xl50 {

    /* compiled from: VideoPickerPatch.kt */
    public static final class a extends c {
        public final VideoPickerFilter b;

        public a(VideoPickerFilter videoPickerFilter) {
            this.b = videoPickerFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FilterPicker(filter=" + this.b + ')';
        }
    }

    /* compiled from: VideoPickerPatch.kt */
    public static abstract class b extends c {

        /* compiled from: VideoPickerPatch.kt */
        public static final class a extends b {
            public final ewp b;

            public a(ewp ewpVar) {
                this.b = ewpVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "Error(errorLoading=" + this.b + ')';
            }
        }

        /* compiled from: VideoPickerPatch.kt */
        /* renamed from: com.vk.posting.presentation.video.c$b$b, reason: collision with other inner class name */
        public static final class C1539b extends b {
            public static final C1539b b = new C1539b();
        }

        /* compiled from: VideoPickerPatch.kt */
        /* renamed from: com.vk.posting.presentation.video.c$b$c, reason: collision with other inner class name */
        public static final class C1540c extends b {
        }

        /* compiled from: VideoPickerPatch.kt */
        public static final class d extends b {
            public final wia0<Object> b;

            public d(wia0<Object> wia0Var) {
                this.b = wia0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(videoList=" + this.b + ')';
            }
        }
    }
}
