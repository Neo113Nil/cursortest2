package com.vk.onboardingpromo.impl.ui.entity;

import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.lj50;
import xsna.qg80;
import xsna.shy;
import xsna.vu5;

/* compiled from: OnboardingPromoAction.kt */
/* loaded from: classes4.dex */
public interface a extends lj50 {

    /* compiled from: OnboardingPromoAction.kt */
    /* renamed from: com.vk.onboardingpromo.impl.ui.entity.a$a, reason: collision with other inner class name */
    public static final class C1448a implements a {
        public final OnboardingPromoState.CurrentSlide b;

        public C1448a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1448a) && epx.f(this.b, ((C1448a) obj).b);
        }

        public final int hashCode() {
            OnboardingPromoState.CurrentSlide currentSlide = this.b;
            if (currentSlide == null) {
                return 0;
            }
            return currentSlide.hashCode();
        }

        public final String toString() {
            return "OnAppClose(currentSlide=" + this.b + ')';
        }

        public C1448a(OnboardingPromoState.CurrentSlide currentSlide) {
            this.b = currentSlide;
        }
    }

    /* compiled from: OnboardingPromoAction.kt */
    public static final class b implements a {
        public final OnboardingPromoState.CurrentSlide b;

        public b(OnboardingPromoState.CurrentSlide currentSlide) {
            this.b = currentSlide;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnAppMinimize(currentSlide=" + this.b + ')';
        }
    }

    /* compiled from: OnboardingPromoAction.kt */
    public static final class c implements a {
        public final qg80 b;
        public final int c;
        public final boolean d;

        public c() {
            this(null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            qg80 qg80Var = this.b;
            return Boolean.hashCode(this.d) + shy.a(this.c, (qg80Var == null ? 0 : qg80Var.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnClose(slideMedia=");
            sb.append(this.b);
            sb.append(", slideNumber=");
            sb.append(this.c);
            sb.append(", closeByCross=");
            return q0.a(sb, this.d, ')');
        }

        public /* synthetic */ c(qg80 qg80Var, int i) {
            this((i & 1) != 0 ? null : qg80Var, 0, false);
        }

        public c(qg80 qg80Var, int i, boolean z) {
            this.b = qg80Var;
            this.c = i;
            this.d = z;
        }
    }

    /* compiled from: OnboardingPromoAction.kt */
    public static final class d implements a {
        public final qg80 b;
        public final int c;

        public d(qg80 qg80Var, int i) {
            this.b = qg80Var;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCtaClick(currentSlide=");
            sb.append(this.b);
            sb.append(", slideNumber=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: OnboardingPromoAction.kt */
    public static final class e implements a {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("OnMuteChanged(isMuted="), this.b, ')');
        }
    }

    /* compiled from: OnboardingPromoAction.kt */
    public static final class f implements a {
        public final qg80 b;
        public final long c;
        public final int d;

        public f(qg80 qg80Var, long j, int i) {
            this.b = qg80Var;
            this.c = j;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnSetCurrentSlide(currentSlide=");
            sb.append(this.b);
            sb.append(", showTime=");
            sb.append(this.c);
            sb.append(", slideNumber=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: OnboardingPromoAction.kt */
    public static final class g implements a {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1631927225;
        }

        public final String toString() {
            return "OnShow";
        }
    }
}
