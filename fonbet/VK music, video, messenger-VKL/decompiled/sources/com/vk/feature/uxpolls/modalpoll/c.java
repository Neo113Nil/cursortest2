package com.vk.feature.uxpolls.modalpoll;

import xsna.epx;
import xsna.oq;
import xsna.xl50;

/* compiled from: UxPollsMvi.kt */
/* loaded from: classes18.dex */
public abstract class c implements xl50 {

    /* compiled from: UxPollsMvi.kt */
    public static final class a extends c {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class b extends c {
        public static final b b = new b();
    }

    /* compiled from: UxPollsMvi.kt */
    /* renamed from: com.vk.feature.uxpolls.modalpoll.c$c, reason: collision with other inner class name */
    public static final class C1027c extends c {
        public static final C1027c b = new C1027c();
    }

    /* compiled from: UxPollsMvi.kt */
    public static final class d extends c {
        public static final d b = new d();
    }
}
