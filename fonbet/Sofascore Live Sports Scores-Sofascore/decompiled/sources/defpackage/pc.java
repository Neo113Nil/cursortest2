package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pc implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ pc(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 1:
                try {
                    runnable.run();
                    break;
                } catch (Exception unused) {
                    d7a.A("Executor");
                    return;
                }
            case 2:
                runnable.run();
                break;
            case 3:
                Process.setThreadPriority(0);
                runnable.run();
                break;
            default:
                try {
                    runnable.run();
                    break;
                } catch (RuntimeException unused2) {
                    return;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
