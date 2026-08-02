package com.vk.ads.easypromote.impl.presentation;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import xsna.epx;
import xsna.iq;
import xsna.shy;

/* compiled from: EasyPromoteNavigationEvent.kt */
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: EasyPromoteNavigationEvent.kt */
    /* renamed from: com.vk.ads.easypromote.impl.presentation.a$a, reason: collision with other inner class name */
    public static final class C0373a implements a {
        public final int a;
        public final int b;
        public final Long c;

        public C0373a(int i, int i2, Long l) {
            this.a = i;
            this.b = i2;
            this.c = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0373a)) {
                return false;
            }
            C0373a c0373a = (C0373a) obj;
            return this.a == c0373a.a && this.b == c0373a.b && epx.f(this.c, c0373a.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            Long l = this.c;
            return a + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AcceptSettings(durationDays=");
            sb.append(this.a);
            sb.append(", budgetRub=");
            sb.append(this.b);
            sb.append(", customDate=");
            return iq.b(sb, this.c, ')');
        }
    }

    /* compiled from: EasyPromoteNavigationEvent.kt */
    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1568846418;
        }

        public final String toString() {
            return "NavigateUp";
        }
    }

    /* compiled from: EasyPromoteNavigationEvent.kt */
    public static final class c implements a {
        public final FaqSource a;

        public c(FaqSource faqSource) {
            this.a = faqSource;
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
            return "OpenEasyPromoteFaq(faqSource=" + this.a + ')';
        }
    }
}
