package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class o9l extends n9l {
    public o9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar, windowInsets);
    }

    @Override // defpackage.u9l
    public x9l a() {
        return x9l.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.m9l, defpackage.u9l
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9l)) {
            return false;
        }
        o9l o9lVar = (o9l) obj;
        return Objects.equals(this.c, o9lVar.c) && Objects.equals(this.g, o9lVar.g) && m9l.M(this.h, o9lVar.h);
    }

    @Override // defpackage.u9l
    public e55 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new e55(displayCutout);
    }

    @Override // defpackage.u9l
    public int hashCode() {
        return this.c.hashCode();
    }

    public o9l(x9l x9lVar, o9l o9lVar) {
        super(x9lVar, o9lVar);
    }
}
