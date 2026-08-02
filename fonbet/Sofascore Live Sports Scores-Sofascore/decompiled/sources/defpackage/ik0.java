package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ik0 {
    public static final m10 h = new m10(1);
    public final sz8 a;
    public final f4a b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final m10 c = h;

    public ik0(sz8 sz8Var, f4a f4aVar) {
        this.a = sz8Var;
        this.b = f4aVar;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            tbb tbbVar = ((sbb) it.next()).a;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, xtl xtlVar) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (xtlVar != null) {
                xtlVar.run();
                return;
            }
            return;
        }
        sz8 sz8Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            sz8Var.f(0, size);
            a(xtlVar);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.b).execute(new hk0(this, list2, list, i, xtlVar));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        sz8Var.d(0, list.size());
        a(xtlVar);
    }
}
