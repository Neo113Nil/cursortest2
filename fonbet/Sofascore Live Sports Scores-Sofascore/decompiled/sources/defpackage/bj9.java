package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bj9 extends yr4 {
    @Override // defpackage.yr4
    public final Object e(Object obj) {
        v89 v89Var = (v89) obj;
        ArrayList arrayList = v89Var.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dj9.a.O0((int[]) it.next());
        }
        arrayList.clear();
        return v89Var;
    }

    @Override // defpackage.yr4
    public final Object h() {
        v89 v89Var = new v89();
        v89Var.a = new ArrayList();
        return v89Var;
    }
}
