package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class kyo implements Runnable {
    public final TaskCompletionSource a;

    public kyo() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public kyo(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
