package j$.util.stream;

/* loaded from: classes2.dex */
public final class h8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f17923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f17924b;

    public h8(Runnable runnable, Runnable runnable2) {
        this.f17923a = runnable;
        this.f17924b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17923a.run();
            this.f17924b.run();
        } catch (Throwable th2) {
            try {
                this.f17924b.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
