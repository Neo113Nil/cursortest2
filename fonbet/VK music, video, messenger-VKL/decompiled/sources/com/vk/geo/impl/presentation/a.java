package com.vk.geo.impl.presentation;

import com.vk.geo.impl.model.id.StringId;
import xsna.epx;
import xsna.kj50;
import xsna.m300;
import xsna.vby;
import xsna.y8x;

/* compiled from: GeoAction.kt */
/* loaded from: classes2.dex */
public interface a extends kj50 {

    /* compiled from: GeoAction.kt */
    @vby
    /* renamed from: com.vk.geo.impl.presentation.a$a, reason: collision with other inner class name */
    public static final class C1080a implements a {
        public final String b;

        public final boolean equals(Object obj) {
            if (obj instanceof C1080a) {
                return epx.f(this.b, ((C1080a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CleanIconCacheIfNeed(id=" + ((Object) StringId.a(this.b)) + ')';
        }
    }

    /* compiled from: GeoAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: GeoAction.kt */
    public static final class c implements a {
        public final String b;
        public final boolean c;

        public c(String str, boolean z) {
            this.b = str;
            this.c = z;
        }
    }

    /* compiled from: GeoAction.kt */
    @vby
    public static final class d implements a {
        public final long b;

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.b == ((d) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return "MapCreated(mapSize=" + ((Object) y8x.b(this.b)) + ')';
        }
    }

    /* compiled from: GeoAction.kt */
    public static final class e implements a {
        public static final e b = new e();
    }

    /* compiled from: GeoAction.kt */
    @vby
    public static final class f implements a {
        public final long b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            long j = ((f) obj).b;
            int i = m300.b;
            return this.b == j;
        }

        public final int hashCode() {
            int i = m300.b;
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return "MoveMapFinishedWithId(transactionId=" + ((Object) m300.a(this.b)) + ')';
        }
    }

    /* compiled from: GeoAction.kt */
    public static final class g implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToMarker(contentId=" + ((Object) "null") + ", markerId=" + ((Object) "null") + ')';
        }
    }

    /* compiled from: GeoAction.kt */
    public interface h extends a {

        /* compiled from: GeoAction.kt */
        /* renamed from: com.vk.geo.impl.presentation.a$h$a, reason: collision with other inner class name */
        public static final class C1081a implements h {
            public static final C1081a b = new C1081a();
        }

        /* compiled from: GeoAction.kt */
        public static final class b implements h {
            public static final b b = new b();
        }

        /* compiled from: GeoAction.kt */
        @vby
        public static final class c implements h {
            public final boolean b;

            public final boolean equals(Object obj) {
                if (obj instanceof c) {
                    return this.b == ((c) obj).b;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return "Permission(granted=" + this.b + ')';
            }
        }
    }
}
