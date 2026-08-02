package com.vk.feed.design.view.newsfeed.ads_action_button;

import com.vk.core.view.components.button.VkButton;
import xsna.bt;
import xsna.cut0;
import xsna.dko;
import xsna.epx;
import xsna.tlo0;

/* compiled from: VkFeedActionCellButton.kt */
/* loaded from: classes18.dex */
public interface b {

    /* compiled from: VkFeedActionCellButton.kt */
    public static final class a implements b {
        public final tlo0.h a;
        public final VkButton.Mode b;

        public a(tlo0.h hVar, VkButton.Mode mode) {
            this.a = hVar;
            this.b = mode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            VkButton.Mode mode = this.b;
            return (hashCode + (mode == null ? 0 : mode.hashCode())) * 961;
        }

        public final String toString() {
            return "Button(text=" + this.a + ", mode=" + this.b + ", appearance=null, contentDescription=null)";
        }
    }

    /* compiled from: VkFeedActionCellButton.kt */
    /* renamed from: com.vk.feed.design.view.newsfeed.ads_action_button.b$b, reason: collision with other inner class name */
    public static final class C1039b implements b {
        public final dko a;
        public final cut0 b;
        public final tlo0 c;

        public C1039b(dko dkoVar, cut0 cut0Var, tlo0 tlo0Var) {
            this.a = dkoVar;
            this.b = cut0Var;
            this.c = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1039b)) {
                return false;
            }
            C1039b c1039b = (C1039b) obj;
            return epx.f(this.a, c1039b.a) && epx.f(this.b, c1039b.b) && epx.f(this.c, c1039b.c);
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
            sb.append(", iconColor=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            return bt.a(sb, this.c, ')');
        }
    }
}
