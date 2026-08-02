package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c2 extends b2 {
    public c2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
    }

    @Override // androidx.core.view.h2
    public k2 a() {
        return k2.h(null, this.f1286c.consumeDisplayCutout());
    }

    @Override // androidx.core.view.h2
    public l e() {
        DisplayCutout displayCutout = this.f1286c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new l(displayCutout);
    }

    @Override // androidx.core.view.a2, androidx.core.view.h2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Objects.equals(this.f1286c, c2Var.f1286c) && Objects.equals(this.f1290g, c2Var.f1290g) && a2.z(this.f1291h, c2Var.f1291h);
    }

    @Override // androidx.core.view.h2
    public int hashCode() {
        return this.f1286c.hashCode();
    }
}
