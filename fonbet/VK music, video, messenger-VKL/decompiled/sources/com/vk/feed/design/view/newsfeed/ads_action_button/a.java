package com.vk.feed.design.view.newsfeed.ads_action_button;

import xsna.bt;
import xsna.cut0;
import xsna.dko;
import xsna.epx;
import xsna.tlo0;

/* compiled from: VkFeedActionCellButton.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: VkFeedActionCellButton.kt */
    /* renamed from: com.vk.feed.design.view.newsfeed.ads_action_button.a$a, reason: collision with other inner class name */
    public static final class C1038a implements a {
        public final dko a;
        public final cut0 b;
        public final tlo0 c;

        public C1038a(dko dkoVar, cut0 cut0Var, tlo0 tlo0Var) {
            this.a = dkoVar;
            this.b = cut0Var;
            this.c = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1038a)) {
                return false;
            }
            C1038a c1038a = (C1038a) obj;
            return epx.f(this.a, c1038a.a) && epx.f(this.b, c1038a.b) && epx.f(this.c, c1038a.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            cut0 cut0Var = this.b;
            int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            tlo0 tlo0Var = this.c;
            return hashCode2 + (tlo0Var != null ? tlo0Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Image(icon=");
            sb.append(this.a);
            sb.append(", iconTint=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            return bt.a(sb, this.c, ')');
        }
    }
}
