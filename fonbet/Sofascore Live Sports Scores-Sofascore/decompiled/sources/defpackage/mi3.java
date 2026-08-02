package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mi3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public mi3(k8f k8fVar) {
        nxf[] nxfVarArr = nxf.a;
        this.b = k8fVar;
    }

    public final void a(g58 g58Var) {
        switch (this.a) {
            case 0:
                ni3 ni3Var = (ni3) this.b;
                synchronized (ni3Var) {
                    ni3Var.d = true;
                }
                ((ni3) this.b).g(g58Var);
                return;
            default:
                ((j8f) ((k8f) this.b)).r(g58Var.getCause());
                return;
        }
    }

    public final void b(ms0 ms0Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                e58 f = e58.f();
                f.getClass();
                Task b = f.d.b();
                Task b2 = f.e.b();
                Task<TContinuationResult> continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{b, b2}).continueWithTask(f.c, new li3(5, f, b, b2));
                nxf[] nxfVarArr = nxf.a;
                continueWithTask.addOnCompleteListener(new o3(ms0Var, (k8f) this.b));
                break;
        }
    }

    public mi3(ni3 ni3Var) {
        this.b = ni3Var;
    }

    private final void c(ms0 ms0Var) {
    }
}
