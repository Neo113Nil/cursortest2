package com.vk.community.design.view.components.compose;

import androidx.compose.runtime.f;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.bhu0;
import xsna.epx;
import xsna.gzs;
import xsna.hr80;
import xsna.kai;
import xsna.ohf;
import xsna.q630;
import xsna.qe8;
import xsna.s3q0;
import xsna.sf3;
import xsna.urd0;

/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public interface a {

    /* compiled from: CommunityCard.kt */
    /* renamed from: com.vk.community.design.view.components.compose.a$a, reason: collision with other inner class name */
    public static final class C0722a implements a {
        public final String a;
        public final gzs<s3q0> b;
        public final String c;
        public final ButtonSize d;
        public final ButtonAppearance e;
        public final ButtonStyle f;
        public final q630 g;

        public C0722a() {
            throw null;
        }

        public C0722a(String str, gzs gzsVar, ButtonAppearance buttonAppearance, ButtonStyle buttonStyle, int i) {
            ButtonSize buttonSize = ButtonSize.Small;
            buttonAppearance = (i & 16) != 0 ? ButtonAppearance.Overlay : buttonAppearance;
            buttonStyle = (i & 32) != 0 ? ButtonStyle.Primary : buttonStyle;
            this.a = str;
            this.b = gzsVar;
            this.c = str;
            this.d = buttonSize;
            this.e = buttonAppearance;
            this.f = buttonStyle;
            this.g = q630.a.a;
        }

        @Override // com.vk.community.design.view.components.compose.a
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-1284204569);
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
                    androidx.compose.runtime.b.f(-1284204569, i2, -1, "com.vk.community.design.view.components.compose.CommunityCardActionButton.Default.Content (CommunityCard.kt:281)");
                }
                aVar2 = M;
                bhu0.c(this.b, this.d, this.f, this.e, q630Var.g(this.g), hr80.z().x(0, M), null, false, null, null, null, false, kai.c(1787146860, new qe8(this, 1), M), aVar2, 0, 384, 4032);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            f s = aVar2.s();
            if (s != null) {
                s.d = new ohf(this, q630Var, i, 1);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0722a)) {
                return false;
            }
            C0722a c0722a = (C0722a) obj;
            return epx.f(this.a, c0722a.a) && epx.f(this.b, c0722a.b) && epx.f(this.c, c0722a.c) && this.d == c0722a.d && this.e == c0722a.e && this.f == c0722a.f && epx.f(this.g, c0722a.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Default(text=" + this.a + ", onClick=" + this.b + ", contentDescription=" + this.c + ", buttonSize=" + this.d + ", buttonAppearance=" + this.e + ", buttonStyle=" + this.f + ", buttonModifier=" + this.g + ')';
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
