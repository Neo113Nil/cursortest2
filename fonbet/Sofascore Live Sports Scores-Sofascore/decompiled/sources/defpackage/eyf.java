package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eyf extends yk5 {
    public vy8 d;

    public eyf() {
        super(2);
        this.d = ty8.a;
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
        eyf eyfVar = new eyf();
        eyfVar.d = this.d;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mk5) it.next()).copy());
        }
        eyfVar.c.addAll(arrayList2);
        return eyfVar;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.d + ", children=[\n" + c() + "\n])";
    }
}
