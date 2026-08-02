package com.vk.community.design.view.components.compose;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.epx;
import xsna.g7c;
import xsna.gtg;
import xsna.i5s;
import xsna.k9q0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.sy90;
import xsna.wlb0;
import xsna.yqv0;

/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public interface b {

    /* compiled from: CommunityCard.kt */
    public static final class a implements b {
        public final String a;
        public final String b;

        public a(String str, int i) {
            String str2 = (i & 2) != 0 ? null : "Subtitle2";
            this.a = str;
            this.b = str2;
        }

        @Override // com.vk.community.design.view.components.compose.b
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(162369369);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(162369369, i2, -1, "com.vk.community.design.view.components.compose.CommunityCardSubtitle.Text.Content (CommunityCard.kt:124)");
                }
                a.j g = androidx.compose.foundation.layout.a.g(4);
                dt1.a.getClass();
                k a = j.a(g, dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                gtg.a(this.a, wlb0.l(M).i0, wlb0.h(M).getText().p, null, null, 0L, false, M, 0, 120);
                String str = this.b;
                if (str == null) {
                    M.K(-1556847331);
                } else {
                    M.K(-1556847330);
                    yqv0.c(" · ", null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 6, 0, 8186);
                    M = M;
                }
                M.j();
                if (str == null) {
                    M.K(-1556578902);
                } else {
                    M.K(-1556578901);
                    gtg.a(str, wlb0.l(M).i0, wlb0.h(M).getText().p, null, null, 0L, false, M, 0, 248);
                }
                M.j();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new g7c(this, q630Var, i, 1);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(false) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text(text=");
            sb.append(this.a);
            sb.append(", secondText=");
            return i5s.a(sb, this.b, ", verified=false)");
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
