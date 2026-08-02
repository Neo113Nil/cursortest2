package L9;

import android.os.Process;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f7105a;

    public d(Runnable runnable, int i10) {
        this.f7105a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f7105a.run();
    }
}
