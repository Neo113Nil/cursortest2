package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p45 implements xcb {
    public final g7 a;

    public p45(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // defpackage.xcb
    public final void d(int i, int i2) {
        g7 g7Var = this.a;
        g7Var.notifyItemRangeInserted(g7Var.g.size() + i, i2);
    }

    @Override // defpackage.xcb
    public final void f(int i, int i2) {
        g7 g7Var = this.a;
        g7Var.notifyItemRangeRemoved(g7Var.g.size() + i, i2);
    }

    @Override // defpackage.xcb
    public final void g(int i, int i2, Object obj) {
        g7 g7Var = this.a;
        g7Var.notifyItemRangeChanged(g7Var.g.size() + i, i2, obj);
    }

    @Override // defpackage.xcb
    public final void h(int i, int i2) {
        g7 g7Var = this.a;
        ArrayList arrayList = g7Var.g;
        g7Var.notifyItemMoved(arrayList.size() + i, arrayList.size() + i2);
    }
}
