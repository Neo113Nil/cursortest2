package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nk5 extends yk5 {
    public vy8 d;
    public ho e;

    public nk5() {
        super(3);
        this.d = ty8.a;
        this.e = ho.c;
    }

    @Override // defpackage.mk5
    public final void a(vy8 vy8Var) {
        this.d = vy8Var;
    }

    @Override // defpackage.mk5
    public final vy8 b() {
        return this.d;
    }

    @Override // defpackage.mk5
    public final mk5 copy() {
        nk5 nk5Var = new nk5();
        nk5Var.d = this.d;
        nk5Var.e = this.e;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mk5) it.next()).copy());
        }
        nk5Var.c.addAll(arrayList2);
        return nk5Var;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.d + ", contentAlignment=" + this.e + "children=[\n" + c() + "\n])";
    }
}
