package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sk5 extends yk5 {
    public vy8 d;
    public int e;

    public sk5() {
        super(1);
        this.d = ty8.a;
        this.e = 0;
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
        sk5 sk5Var = new sk5();
        sk5Var.d = this.d;
        sk5Var.e = this.e;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mk5) it.next()).copy());
        }
        sk5Var.c.addAll(arrayList2);
        return sk5Var;
    }

    public final String toString() {
        return "EmittableLazyList(modifier=" + this.d + ", horizontalAlignment=" + ((Object) eo.b(this.e)) + ", activityOptions=null, children=[\n" + c() + "\n])";
    }
}
