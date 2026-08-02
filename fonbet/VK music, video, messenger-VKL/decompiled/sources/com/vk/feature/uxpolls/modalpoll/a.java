package com.vk.feature.uxpolls.modalpoll;

import xsna.epx;
import xsna.kj50;
import xsna.oq;
import xsna.vu5;

/* compiled from: UxPollsMvi.kt */
/* loaded from: classes18.dex */
public abstract class a implements kj50 {

    /* compiled from: UxPollsMvi.kt */
    /* renamed from: com.vk.feature.uxpolls.modalpoll.a$a, reason: collision with other inner class name */
    public static final class C1026a extends a {
        public static final C1026a b = new C1026a();
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class c extends a {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("PollError(throwable="), this.b, ')');
        }
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class g extends a {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PollResized(height="), this.b, ')');
        }
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class h extends a {
        public static final h b = new h();
    }
}
