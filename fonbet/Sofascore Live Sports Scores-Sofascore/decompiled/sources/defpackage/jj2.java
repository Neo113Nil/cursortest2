package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jj2 extends pea {
    public final Typeface g;
    public final ij2 h;
    public boolean i;

    public jj2(ij2 ij2Var, Typeface typeface) {
        this.g = typeface;
        this.h = ij2Var;
    }

    @Override // defpackage.pea
    public final void A(Typeface typeface, boolean z) {
        if (this.i) {
            return;
        }
        this.h.j(typeface);
    }

    @Override // defpackage.pea
    public final void z(int i) {
        if (this.i) {
            return;
        }
        this.h.j(this.g);
    }
}
