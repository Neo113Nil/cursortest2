package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fv9 extends u4 {
    public final c7 a;
    public final int b;
    public final int c;

    public fv9(c7 c7Var, int i, int i2) {
        this.a = c7Var;
        this.b = i;
        b0a.A(i, i2, c7Var.size());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b0a.y(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.u4, java.util.List, defpackage.gv9
    public final List subList(int i, int i2) {
        b0a.A(i, i2, this.c);
        int i3 = this.b;
        return new fv9(this.a, i + i3, i3 + i2);
    }
}
