package bo.app;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l5 f25470a;

    public g5(l5 l5Var) {
        this.f25470a = l5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f25470a) {
            try {
                l5 l5Var = this.f25470a;
                if (l5Var.f25713i == null) {
                    return null;
                }
                while (l5Var.f25712h > l5Var.f25710f) {
                    l5Var.d((String) ((Map.Entry) l5Var.f25714j.entrySet().iterator().next()).getKey());
                }
                l5 l5Var2 = this.f25470a;
                int i10 = l5Var2.f25715k;
                if (i10 >= 2000 && i10 >= l5Var2.f25714j.size()) {
                    this.f25470a.d();
                    this.f25470a.f25715k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
