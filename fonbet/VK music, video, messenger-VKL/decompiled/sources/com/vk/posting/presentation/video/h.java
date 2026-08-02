package com.vk.posting.presentation.video;

import com.vk.posting.presentation.video.model.VideoPickerFilter;
import xsna.ao50;
import xsna.d3t0;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.wia0;
import xsna.yzt0;

/* compiled from: VideoPickerViewState.kt */
/* loaded from: classes5.dex */
public final class h implements ao50 {
    public final fi50 a;

    /* compiled from: VideoPickerViewState.kt */
    public static final class a implements fm50<d3t0> {
        public final yzt0<wia0<Object>> a;
        public final yzt0<Boolean> b;
        public final yzt0<VideoPickerFilter> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.a);
            sb.append(", isReloadFilter=");
            sb.append(this.b);
            sb.append(", filterSelected=");
            return tr.c(sb, this.c, ')');
        }
    }

    public h(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
