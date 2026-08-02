package com.vk.network.eventhub.impl;

import xsna.epx;
import xsna.oq;

/* compiled from: ConnectionCallback.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ConnectionCallback.kt */
    /* renamed from: com.vk.network.eventhub.impl.a$a, reason: collision with other inner class name */
    public static final class C1362a extends c {
        public final Throwable a;

        public C1362a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1362a) && epx.f(this.a, ((C1362a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FloodControl(throwable="), this.a, ')');
        }
    }

    /* compiled from: ConnectionCallback.kt */
    public static final class b extends c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1708465111;
        }

        public final String toString() {
            return "IgnoreAndClose";
        }
    }

    /* compiled from: ConnectionCallback.kt */
    public static abstract class c {
    }

    /* compiled from: ConnectionCallback.kt */
    public static final class d extends c {
        public final Throwable a;

        public d(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("InvalidToken(throwable="), this.a, ')');
        }
    }

    /* compiled from: ConnectionCallback.kt */
    public static final class e extends c {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 855626742;
        }

        public final String toString() {
            return "RequireReconnect";
        }
    }

    /* compiled from: ConnectionCallback.kt */
    public static final class f extends c {
        public final Throwable a;

        public f(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Throw(throwable="), this.a, ')');
        }
    }

    void N0();

    void O0();

    c P0(Throwable th);

    void Q0();

    default void R0() {
    }
}
