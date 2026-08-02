package com.vk.photos.root.presentation;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.iga0;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: PhotosRootViewState.kt */
/* loaded from: classes4.dex */
public final class i implements ao50 {
    public final fi50 a;

    /* compiled from: PhotosRootViewState.kt */
    public static final class a implements fm50<iga0> {
        public final yzt0<Integer> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(selectedTab=");
            sb.append(this.a);
            sb.append(", enableSwitchTabBySwipe=");
            sb.append(this.b);
            sb.append(", showOnboarding=");
            sb.append(this.c);
            sb.append(", retryOnboarding=");
            return tr.c(sb, this.d, ')');
        }
    }

    public i(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
