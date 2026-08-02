package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class p9l extends o9l {
    public u4a t;
    public u4a u;
    public u4a v;

    public p9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.u9l
    public u4a k() {
        u4a u4aVar = this.u;
        if (u4aVar != null) {
            return u4aVar;
        }
        u4a d = u4a.d(this.c.getMandatorySystemGestureInsets());
        this.u = d;
        return d;
    }

    @Override // defpackage.u9l
    public u4a m() {
        u4a u4aVar = this.t;
        if (u4aVar != null) {
            return u4aVar;
        }
        u4a d = u4a.d(this.c.getSystemGestureInsets());
        this.t = d;
        return d;
    }

    @Override // defpackage.u9l
    public u4a o() {
        u4a u4aVar = this.v;
        if (u4aVar != null) {
            return u4aVar;
        }
        u4a d = u4a.d(this.c.getTappableElementInsets());
        this.v = d;
        return d;
    }

    @Override // defpackage.m9l, defpackage.u9l
    public x9l r(int i, int i2, int i3, int i4) {
        return x9l.h(null, this.c.inset(i, i2, i3, i4));
    }

    public p9l(x9l x9lVar, p9l p9lVar) {
        super(x9lVar, p9lVar);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.n9l, defpackage.u9l
    public void z(u4a u4aVar) {
    }
}
