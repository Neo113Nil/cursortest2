package com.vk.video.ad;

import com.vk.video.ad.data.VideoAdInfo;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.j8;
import xsna.tr;
import xsna.vzr0;
import xsna.yzt0;

/* compiled from: VideoAdContract.kt */
/* loaded from: classes5.dex */
public final class g implements ao50 {
    public final fi50 a;

    /* compiled from: VideoAdContract.kt */
    public static final class a implements fm50<vzr0> {
        public final yzt0<VideoAdInfo> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Data(videoAdInfo="), this.a, ')');
        }
    }

    public g(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a.equals(((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VideoAdViewState(data="), this.a, ')');
    }
}
