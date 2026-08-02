package Oa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f8583a;

    public j() {
        this.f8583a = null;
    }

    public abstract void a();

    public final TaskCompletionSource b() {
        return this.f8583a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f8583a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public j(TaskCompletionSource taskCompletionSource) {
        this.f8583a = taskCompletionSource;
    }
}
