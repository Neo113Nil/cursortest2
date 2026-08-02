package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class di3 {
    public static final HashMap d = new HashMap();
    public static final hg0 e = new hg0(1);
    public final Executor a;
    public final ri3 b;
    public Task c = null;

    public di3(Executor executor, ri3 ri3Var) {
        this.a = executor;
        this.b = ri3Var;
    }

    public static Object a(Task task) {
        sz8 sz8Var = new sz8(14);
        Executor executor = e;
        task.addOnSuccessListener(executor, sz8Var);
        task.addOnFailureListener(executor, sz8Var);
        task.addOnCanceledListener(executor, sz8Var);
        if (!((CountDownLatch) sz8Var.b).await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.c;
            if (task != null) {
                if (task.isComplete() && !this.c.isSuccessful()) {
                }
            }
            this.c = Tasks.call(this.a, new ji2(this.b, 1));
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final fi3 c() {
        synchronized (this) {
            try {
                Task task = this.c;
                if (task == null || !task.isSuccessful()) {
                    try {
                        return (fi3) a(b());
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return (fi3) this.c.getResult();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task d(fi3 fi3Var) {
        c00 c00Var = new c00(1, this, fi3Var);
        Executor executor = this.a;
        return Tasks.call(executor, c00Var).onSuccessTask(executor, new o3(5, this, fi3Var));
    }
}
