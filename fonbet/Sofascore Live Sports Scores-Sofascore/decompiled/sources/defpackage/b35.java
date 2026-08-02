package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class b35 extends vx4 {
    public int m;

    public b35(v7l v7lVar) {
        super(v7lVar);
        if (v7lVar instanceof mf9) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.vx4
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            rx4 rx4Var = (rx4) it.next();
            rx4Var.a(rx4Var);
        }
    }
}
