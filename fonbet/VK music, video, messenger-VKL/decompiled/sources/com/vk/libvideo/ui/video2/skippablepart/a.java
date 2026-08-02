package com.vk.libvideo.ui.video2.skippablepart;

import xsna.vu5;

/* compiled from: VideoSkippableAction.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: VideoSkippableAction.kt */
    /* renamed from: com.vk.libvideo.ui.video2.skippablepart.a$a, reason: collision with other inner class name */
    public static final class C1253a implements a {
        public static final C1253a a = new C1253a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1253a);
        }

        public final int hashCode() {
            return -2113763783;
        }

        public final String toString() {
            return "NextVideo";
        }
    }

    /* compiled from: VideoSkippableAction.kt */
    public static final class b implements a {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Seek(position="));
        }
    }
}
