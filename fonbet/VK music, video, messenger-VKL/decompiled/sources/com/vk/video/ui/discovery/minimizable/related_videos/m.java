package com.vk.video.ui.discovery.minimizable.related_videos;

import defpackage.q0;
import xsna.epx;
import xsna.mct0;

/* compiled from: VideoRelatedVideosPagingState.kt */
/* loaded from: classes7.dex */
public interface m {

    /* compiled from: VideoRelatedVideosPagingState.kt */
    public static final class a implements m {
        public final mct0 a;

        public a(mct0 mct0Var) {
            this.a = mct0Var;
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
            return "Content(paging=" + this.a + ')';
        }
    }

    /* compiled from: VideoRelatedVideosPagingState.kt */
    public static final class b implements m {
        public final boolean a;

        public b() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Error(isShuffleLoadingError="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: VideoRelatedVideosPagingState.kt */
    public static final class c implements m {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 221966255;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
