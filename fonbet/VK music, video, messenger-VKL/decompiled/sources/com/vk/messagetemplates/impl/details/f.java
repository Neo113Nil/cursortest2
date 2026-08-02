package com.vk.messagetemplates.impl.details;

import xsna.c8p0;
import xsna.epx;
import xsna.i4m;
import xsna.lm50;
import xsna.pr;
import xsna.tlo0;

/* compiled from: TemplateDetailsViewState.kt */
/* loaded from: classes3.dex */
public final class f implements lm50 {
    public final c8p0 b;
    public final BottomBarViewState c;
    public final i4m d;

    /* compiled from: TemplateDetailsViewState.kt */
    public static final class a {
        public final int a;
        public final tlo0.f b;

        public a(int i, tlo0.f fVar) {
            this.a = i;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Template(id=");
            sb.append(this.a);
            sb.append(", title=");
            return pr.b(sb, this.b, ')');
        }
    }

    public f(c8p0 c8p0Var, BottomBarViewState bottomBarViewState, i4m i4mVar) {
        this.b = c8p0Var;
        this.c = bottomBarViewState;
        this.d = i4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b.a) * 31)) * 31);
    }

    public final String toString() {
        return "TemplateDetailsViewState(topBar=" + this.b + ", bottomBar=" + this.c + ", content=" + this.d + ')';
    }
}
