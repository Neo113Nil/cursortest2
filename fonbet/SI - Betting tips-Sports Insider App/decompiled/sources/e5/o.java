package e5;

import android.os.Process;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8655a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f8656b;

    public /* synthetic */ o(Runnable runnable, int i5) {
        this.f8655a = i5;
        this.f8656b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8655a) {
            case 0:
                try {
                    this.f8656b.run();
                    break;
                } catch (Exception e7) {
                    ci.c.p("Executor", "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f8656b.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.f8656b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f8655a) {
            case 1:
                return this.f8656b.toString();
            default:
                return super.toString();
        }
    }
}
