package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0343n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0393p0 f14292a;

    public RunnableC0343n0(C0393p0 c0393p0) {
        this.f14292a = c0393p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0393p0 c0393p0 = this.f14292a;
        synchronized (c0393p0) {
            if (c0393p0.f14438a != null && c0393p0.a()) {
                try {
                    c0393p0.f14441d = null;
                    c0393p0.f14438a.unbindService(c0393p0.j);
                } catch (Throwable unused) {
                }
            }
            c0393p0.f14441d = null;
        }
    }
}
