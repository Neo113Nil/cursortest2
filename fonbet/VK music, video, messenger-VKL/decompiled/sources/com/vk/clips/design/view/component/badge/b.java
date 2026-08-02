package com.vk.clips.design.view.component.badge;

import xsna.bt;
import xsna.cut0;
import xsna.epx;
import xsna.shy;
import xsna.tlo0;

/* compiled from: ClipBadge.kt */
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ClipBadge.kt */
    public static final class a implements b {
        public final tlo0 a;
        public final cut0 b;
        public final int c;
        public final tlo0 d;

        public a(tlo0 tlo0Var, cut0 cut0Var, int i, tlo0 tlo0Var2) {
            this.a = tlo0Var;
            this.b = cut0Var;
            this.c = i;
            this.d = tlo0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            cut0 cut0Var = this.b;
            int a = shy.a(this.c, (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31, 31);
            tlo0 tlo0Var = this.d;
            return a + (tlo0Var != null ? tlo0Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text(title=");
            sb.append(this.a);
            sb.append(", titleColor=");
            sb.append(this.b);
            sb.append(", maxWidth=");
            sb.append(this.c);
            sb.append(", contentDescription=");
            return bt.a(sb, this.d, ')');
        }
    }
}
