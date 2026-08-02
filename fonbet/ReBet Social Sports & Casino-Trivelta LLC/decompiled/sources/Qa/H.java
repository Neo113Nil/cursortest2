package Qa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f9562a;

    public H() {
        this.f9562a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f9562a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f9562a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public H(TaskCompletionSource taskCompletionSource) {
        this.f9562a = taskCompletionSource;
    }
}
