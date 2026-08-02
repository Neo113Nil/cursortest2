package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.ActionButtonsStyle;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.LogoStyle;
import xsna.ao50;
import xsna.epx;
import xsna.exo;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: EcosystemProfileViewState.kt */
/* loaded from: classes6.dex */
public final class i implements ao50 {
    public final fi50 a;

    /* compiled from: EcosystemProfileViewState.kt */
    public static final class a implements fm50<h> {
        public final yzt0<com.vk.superapp.multiaccount.api.f> a;
        public final yzt0<exo> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<Boolean> e;
        public final yzt0<Boolean> f;
        public final yzt0<LogoStyle> g;
        public final yzt0<C1898a> h;

        /* compiled from: EcosystemProfileViewState.kt */
        /* renamed from: com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.i$a$a, reason: collision with other inner class name */
        public static final class C1898a {
            public final int a;
            public final ActionButtonsStyle b;

            public C1898a(int i, ActionButtonsStyle actionButtonsStyle) {
                this.a = i;
                this.b = actionButtonsStyle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1898a)) {
                    return false;
                }
                C1898a c1898a = (C1898a) obj;
                return this.a == c1898a.a && this.b == c1898a.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "Background(buttonsBorderCornerRadius=" + this.a + ", actionButtonsStyle=" + this.b + ')';
            }
        }

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EcosystemProfileSceneRender(multiAccountUser=");
            sb.append(this.a);
            sb.append(", ecoplateLoadingVisibleFieldsConfig=");
            sb.append(this.b);
            sb.append(", error=");
            sb.append(this.c);
            sb.append(", visibleRetry=");
            sb.append(this.d);
            sb.append(", visibleLogout=");
            sb.append(this.e);
            sb.append(", visibleLk=");
            sb.append(this.f);
            sb.append(", logoStyle=");
            sb.append(this.g);
            sb.append(", background=");
            return tr.c(sb, this.h, ')');
        }
    }

    public i(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
