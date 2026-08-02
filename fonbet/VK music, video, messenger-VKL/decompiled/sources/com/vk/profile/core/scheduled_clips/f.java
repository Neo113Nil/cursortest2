package com.vk.profile.core.scheduled_clips;

import xsna.a1i;
import xsna.epx;
import xsna.fm50;
import xsna.h0u0;
import xsna.p0i;
import xsna.r0i;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: CommunityScheduledClipsGridRender.kt */
/* loaded from: classes5.dex */
public interface f extends fm50<a1i> {

    /* compiled from: CommunityScheduledClipsGridRender.kt */
    public static final class a implements f {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<p0i> c;
        public final yzt0<r0i> d;

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
            StringBuilder sb = new StringBuilder("Content(isLoading=");
            sb.append(this.a);
            sb.append(", isError=");
            sb.append(this.b);
            sb.append(", content=");
            sb.append(this.c);
            sb.append(", overlay=");
            return tr.c(sb, this.d, ')');
        }
    }
}
