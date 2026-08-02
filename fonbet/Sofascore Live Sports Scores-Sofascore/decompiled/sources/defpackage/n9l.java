package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class n9l extends m9l {
    public u4a s;

    public n9l(x9l x9lVar, n9l n9lVar) {
        super(x9lVar, n9lVar);
        this.s = null;
        this.s = n9lVar.s;
    }

    @Override // defpackage.u9l
    public x9l b() {
        return x9l.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.u9l
    public x9l c() {
        return x9l.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.u9l
    public final u4a l() {
        u4a u4aVar = this.s;
        if (u4aVar != null) {
            return u4aVar;
        }
        WindowInsets windowInsets = this.c;
        u4a c = u4a.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = c;
        return c;
    }

    @Override // defpackage.u9l
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // defpackage.u9l
    public void z(u4a u4aVar) {
        this.s = u4aVar;
    }

    public n9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar, windowInsets);
        this.s = null;
    }
}
