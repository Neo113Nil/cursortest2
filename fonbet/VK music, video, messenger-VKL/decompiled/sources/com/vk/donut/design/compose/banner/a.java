package com.vk.donut.design.compose.banner;

import xsna.epx;
import xsna.p3u;
import xsna.ryn;
import xsna.swm0;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: DonutBanner.kt */
    /* renamed from: com.vk.donut.design.compose.banner.a$a, reason: collision with other inner class name */
    public static final class C0900a implements a {
        public static final C0900a a = new C0900a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0900a);
        }

        public final int hashCode() {
            return -1679196523;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final class b<T extends ryn> implements a {
        public final T a;

        public b(T t) {
            this.a = t;
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
            return "OneCard(card=" + this.a + ')';
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final class c implements a {
        public final swm0 a;
        public final p3u b;

        public c(swm0 swm0Var, p3u p3uVar) {
            this.a = swm0Var;
            this.b = p3uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TwoCards(regular=" + this.a + ", goal=" + this.b + ')';
        }
    }
}
