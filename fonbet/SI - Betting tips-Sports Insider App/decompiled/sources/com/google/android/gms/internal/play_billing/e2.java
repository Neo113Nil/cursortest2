package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e2 extends o1 implements Runnable, k1 {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f5438h;

    public e2(Runnable runnable) {
        runnable.getClass();
        this.f5438h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.o1
    public final String c() {
        return androidx.appcompat.widget.c1.n("task=[", this.f5438h.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5438h.run();
        } catch (Throwable th2) {
            e(th2);
            throw th2;
        }
    }
}
