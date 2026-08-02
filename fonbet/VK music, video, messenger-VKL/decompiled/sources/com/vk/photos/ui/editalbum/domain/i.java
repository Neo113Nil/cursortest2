package com.vk.photos.ui.editalbum.domain;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: EditAlbumViewState.kt */
/* loaded from: classes3.dex */
public final class i implements ao50 {
    public final fi50 a;

    /* compiled from: EditAlbumViewState.kt */
    public static final class a implements fm50<h> {
        public final yzt0<Boolean> a;
        public final yzt0<String> b;
        public final yzt0<String> c;
        public final yzt0<Boolean> d;
        public final yzt0<Mode> e;
        public final yzt0<Boolean> f;
        public final yzt0<Boolean> g;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(newAlbumMode=");
            sb.append(this.a);
            sb.append(", albumTitle=");
            sb.append(this.b);
            sb.append(", albumDescription=");
            sb.append(this.c);
            sb.append(", canSave=");
            sb.append(this.d);
            sb.append(", mode=");
            sb.append(this.e);
            sb.append(", loading=");
            sb.append(this.f);
            sb.append(", canDelete=");
            return tr.c(sb, this.g, ')');
        }
    }

    public i(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
