package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: OpinionStickerViewState.kt */
/* loaded from: classes6.dex */
public final class g implements ao50 {
    public final fi50 a;

    /* compiled from: OpinionStickerViewState.kt */
    public static final class a implements fm50<OpinionStickerState> {
        public final yzt0<h> a;

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
            return tr.c(new StringBuilder("Data(viewData="), this.a, ')');
        }
    }

    public g(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
