package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tk5 extends yk5 {
    public ho d;
    public vy8 e;
    public long f;

    public tk5() {
        super(3);
        this.d = ho.d;
        this.e = nq8.A(new q99(x25.a));
    }

    @Override // defpackage.mk5
    public final void a(vy8 vy8Var) {
        this.e = vy8Var;
    }

    @Override // defpackage.mk5
    public final vy8 b() {
        return this.e;
    }

    @Override // defpackage.mk5
    public final mk5 copy() {
        tk5 tk5Var = new tk5();
        tk5Var.f = this.f;
        tk5Var.d = this.d;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mk5) it.next()).copy());
        }
        tk5Var.c.addAll(arrayList2);
        return tk5Var;
    }

    public final String toString() {
        return "EmittableLazyListItem(modifier=" + this.e + ", alignment=" + this.d + ", children=[\n" + c() + "\n])";
    }
}
