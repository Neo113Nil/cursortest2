package com.vk.newsfeed.posting.impl.domain.model;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: MediaPickerState.kt */
    /* renamed from: com.vk.newsfeed.posting.impl.domain.model.a$a, reason: collision with other inner class name */
    public static final class C1419a implements a {
        public static final C1419a a = new C1419a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1419a);
        }

        public final int hashCode() {
            return 137534066;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 974373418;
        }

        public final String toString() {
            return "Idle";
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class c implements a {
        public final MediaPickerPageLoadType a;

        public c(MediaPickerPageLoadType mediaPickerPageLoadType) {
            this.a = mediaPickerPageLoadType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Loading(loadType=" + this.a + ')';
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class d implements a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1120414716;
        }

        public final String toString() {
            return "NotStarted";
        }
    }
}
