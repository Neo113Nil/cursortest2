package com.vk.feature.uxpolls.modalpoll;

import xsna.epx;
import xsna.oq;

/* compiled from: UxPollsMvi.kt */
/* loaded from: classes18.dex */
public abstract class e {

    /* compiled from: UxPollsMvi.kt */
    public static abstract class a extends e {

        /* compiled from: UxPollsMvi.kt */
        /* renamed from: com.vk.feature.uxpolls.modalpoll.e$a$a, reason: collision with other inner class name */
        public static final class C1028a extends a {
            public static final C1028a a = new C1028a();
        }
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class b extends e {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }
}
