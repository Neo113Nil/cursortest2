package com.vk.stickers.settings;

import com.vk.stickers.settings.f;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.p6l0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: StickerSettingsState.kt */
/* loaded from: classes6.dex */
public final class j implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: StickerSettingsState.kt */
    public static final class a implements fm50<f.a> {
        public final yzt0<p6l0> a;

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
            return tr.c(new StringBuilder("Loaded(data="), this.a, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class b implements fm50<f.b> {
        public static final b a = new b();
    }

    public j(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
