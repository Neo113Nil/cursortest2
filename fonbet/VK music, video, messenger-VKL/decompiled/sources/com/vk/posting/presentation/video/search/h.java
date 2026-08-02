package com.vk.posting.presentation.video.search;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.o2t0;
import xsna.tr;
import xsna.tzh0;
import xsna.wia0;
import xsna.yzt0;

/* compiled from: SearchVideoPickerViewState.kt */
/* loaded from: classes5.dex */
public final class h implements ao50 {
    public final fi50 a;

    /* compiled from: SearchVideoPickerViewState.kt */
    public static final class a implements fm50<tzh0> {
        public final yzt0<wia0<o2t0>> a;

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
            return tr.c(new StringBuilder("Data(result="), this.a, ')');
        }
    }

    public h(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
