package com.vk.clips.interests.impl.ui;

import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import com.vk.dto.common.Image;
import java.util.List;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.h0u0;
import xsna.ms9;
import xsna.n0u0;
import xsna.pr;
import xsna.tlo0;
import xsna.vka;
import xsna.vu5;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: ClipsInterestsViewState.kt */
/* loaded from: classes16.dex */
public final class ClipsInterestsViewState implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsInterestsViewState.kt */
    public static final class UIScreenStep {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UIScreenStep[] $VALUES;
        public static final UIScreenStep FINISH_KEEP_VIEW;
        public static final UIScreenStep FINISH_RESET_VIEW;
        public static final UIScreenStep MAIN_CATEGORIES;
        public static final UIScreenStep SUB_CATEGORIES;

        static {
            UIScreenStep uIScreenStep = new UIScreenStep("MAIN_CATEGORIES", 0);
            MAIN_CATEGORIES = uIScreenStep;
            UIScreenStep uIScreenStep2 = new UIScreenStep("SUB_CATEGORIES", 1);
            SUB_CATEGORIES = uIScreenStep2;
            UIScreenStep uIScreenStep3 = new UIScreenStep("FINISH_RESET_VIEW", 2);
            FINISH_RESET_VIEW = uIScreenStep3;
            UIScreenStep uIScreenStep4 = new UIScreenStep("FINISH_KEEP_VIEW", 3);
            FINISH_KEEP_VIEW = uIScreenStep4;
            UIScreenStep[] uIScreenStepArr = {uIScreenStep, uIScreenStep2, uIScreenStep3, uIScreenStep4};
            $VALUES = uIScreenStepArr;
            $ENTRIES = new asp(uIScreenStepArr);
        }

        public UIScreenStep() {
            throw null;
        }

        public static UIScreenStep valueOf(String str) {
            return (UIScreenStep) Enum.valueOf(UIScreenStep.class, str);
        }

        public static UIScreenStep[] values() {
            return (UIScreenStep[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class a {
        public final Image a;
        public final int b;

        public a(int i, Image image) {
            this.a = image;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            Image image = this.a;
            return Integer.hashCode(this.b) + ((image == null ? 0 : image.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarUIState(avatar=");
            sb.append(this.a);
            sb.append(", progress=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class b {
        public final tlo0.f a;

        public b(tlo0.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a);
        }

        public final String toString() {
            return pr.b(new StringBuilder("ButtonUIState(buttonText="), this.a, ')');
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class c implements fm50<ClipsInterestsState.Content> {
        public final yzt0<d> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class d {
        public final UIScreenStep a;
        public final a b;
        public final g c;
        public final f d;
        public final b e;

        public d(UIScreenStep uIScreenStep, a aVar, g gVar, f fVar, b bVar) {
            this.a = uIScreenStep;
            this.b = aVar;
            this.c = gVar;
            this.d = fVar;
            this.e = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            return Integer.hashCode(this.e.a.a) + ((this.d.hashCode() + fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a)) * 31);
        }

        public final String toString() {
            return "ContentUIState(step=" + this.a + ", avatar=" + this.b + ", items=" + this.c + ", header=" + this.d + ", button=" + this.e + ')';
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class e implements fm50<ClipsInterestsState.a> {
        public final yzt0<a> a;

        public e(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class f {
        public final tlo0.g a;
        public final tlo0.f b;

        public f(tlo0.g gVar, tlo0.f fVar) {
            this.a = gVar;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderUIState(stepText=");
            sb.append(this.a);
            sb.append(", titleText=");
            return pr.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class g {
        public final List<vka> a;

        public g(List<vka> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("InterestsUIState(interestItems="), this.a);
        }
    }

    /* compiled from: ClipsInterestsViewState.kt */
    public static final class h implements fm50<ClipsInterestsState.c> {
        public final yzt0<a> a;

        public h(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public ClipsInterestsViewState(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }

    public final n0u0<c> a() {
        return this.a;
    }

    public final n0u0<e> b() {
        return this.c;
    }

    public final n0u0<h> c() {
        return this.b;
    }
}
