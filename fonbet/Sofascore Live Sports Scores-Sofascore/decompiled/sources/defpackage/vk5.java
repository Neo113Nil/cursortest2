package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vk5 extends yk5 {
    public long d;
    public ekh e;

    public vk5() {
        super(3);
        this.d = 9205357640488583168L;
        this.e = dkh.a;
    }

    @Override // defpackage.mk5
    public final void a(vy8 vy8Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // defpackage.mk5
    public final vy8 b() {
        vy8 b;
        mk5 mk5Var = (mk5) CollectionsKt.F0(this.c);
        return (mk5Var == null || (b = mk5Var.b()) == null) ? nq8.z(ty8.a) : b;
    }

    @Override // defpackage.mk5
    public final mk5 copy() {
        vk5 vk5Var = new vk5();
        vk5Var.d = this.d;
        vk5Var.e = this.e;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mk5) it.next()).copy());
        }
        vk5Var.c.addAll(arrayList2);
        return vk5Var;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) s75.d(this.d)) + ", sizeMode=" + this.e + ", children=[\n" + c() + "\n])";
    }
}
