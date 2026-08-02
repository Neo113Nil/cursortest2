package com.vk.feature.uxpolls.modalpoll;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.shy;
import xsna.tr;
import xsna.vu5;
import xsna.yzt0;

/* compiled from: UxPollsMvi.kt */
/* loaded from: classes18.dex */
public final class g implements ao50 {
    public final fi50 a;

    /* compiled from: UxPollsMvi.kt */
    public static final class a implements fm50<f> {
        public final yzt0<AbstractC1030a> a;

        /* compiled from: UxPollsMvi.kt */
        /* renamed from: com.vk.feature.uxpolls.modalpoll.g$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1030a {

            /* compiled from: UxPollsMvi.kt */
            /* renamed from: com.vk.feature.uxpolls.modalpoll.g$a$a$a, reason: collision with other inner class name */
            public static final class C1031a extends AbstractC1030a {
                public final Throwable a;
                public final int b;
                public final int c;

                public C1031a(Throwable th, int i, int i2) {
                    this.a = th;
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1031a)) {
                        return false;
                    }
                    C1031a c1031a = (C1031a) obj;
                    return epx.f(this.a, c1031a.a) && this.b == c1031a.b && this.c == c1031a.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Error(throwable=");
                    sb.append(this.a);
                    sb.append(", titleRes=");
                    sb.append(this.b);
                    sb.append(", subtitleRes=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: UxPollsMvi.kt */
            /* renamed from: com.vk.feature.uxpolls.modalpoll.g$a$a$b */
            public static final class b extends AbstractC1030a {
                public static final b a = new b();
            }

            /* compiled from: UxPollsMvi.kt */
            /* renamed from: com.vk.feature.uxpolls.modalpoll.g$a$a$c */
            public static final class c extends AbstractC1030a {
                public static final c a = new c();
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("ContentViewState(contentState="), this.a, ')');
        }
    }

    public g(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
