package com.vk.clips.favorites.impl.ui.folders.renaming;

import com.vk.core.compose.component.defaults.SpinnerState;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: ClipsFavoritesFolderRenamingViewState.kt */
/* loaded from: classes16.dex */
public final class f implements ao50 {
    public final fi50 a;

    /* compiled from: ClipsFavoritesFolderRenamingViewState.kt */
    public static final class a implements fm50<ClipsFavoritesFolderRenamingState> {
        public static final a a = new a();
    }

    /* compiled from: ClipsFavoritesFolderRenamingViewState.kt */
    public static final class b implements fm50<ClipsFavoritesFolderRenamingState> {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<SpinnerState> d;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Render(isSaveButtonEnabled=");
            sb.append(this.a);
            sb.append(", isDialogCancelable=");
            sb.append(this.b);
            sb.append(", isSpinnerVisible=");
            sb.append(this.c);
            sb.append(", screenSpinnerState=");
            return tr.c(sb, this.d, ')');
        }
    }

    public f(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
