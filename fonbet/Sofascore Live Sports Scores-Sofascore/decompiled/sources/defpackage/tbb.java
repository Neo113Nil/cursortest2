package defpackage;

import androidx.recyclerview.widget.l;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tbb extends l {
    public final ik0 a;

    public tbb(j25 j25Var) {
        ExecutorService executorService;
        sbb sbbVar = new sbb(this);
        sz8 sz8Var = new sz8(this, 5);
        synchronized (s9a.a) {
            try {
                executorService = s9a.b;
                if (executorService == null) {
                    executorService = Executors.newFixedThreadPool(2);
                    s9a.b = executorService;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ik0 ik0Var = new ik0(sz8Var, new f4a(executorService, j25Var, false, 22));
        this.a = ik0Var;
        ik0Var.d.add(sbbVar);
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.a.f.size();
    }

    public final Object o(int i) {
        return this.a.f.get(i);
    }

    public void p(List list) {
        this.a.b(list, null);
    }
}
