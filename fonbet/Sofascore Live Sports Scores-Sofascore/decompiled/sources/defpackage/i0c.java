package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i0c extends g0c {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i0c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.g0c
    public final void c(w0c w0cVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h0c h0cVar = new h0c(w0cVar);
                w0cVar.a(h0cVar);
                try {
                    o3 o3Var = (o3) obj;
                    Task task = (Task) o3Var.b;
                    Executor executor = (Executor) o3Var.c;
                    task.addOnSuccessListener(executor, new rw9(h0cVar));
                    task.addOnFailureListener(executor, new rw9(h0cVar));
                    break;
                } catch (Throwable th) {
                    td4.w0(th);
                    h0cVar.onError(th);
                    return;
                }
            default:
                ((ma3) obj).c(new r0c(w0cVar, 0));
                break;
        }
    }
}
