package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0298l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0024ae f14170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323m5 f14171b;

    public RunnableC0298l5(C0323m5 c0323m5, InterfaceC0024ae interfaceC0024ae) {
        this.f14171b = c0323m5;
        this.f14170a = interfaceC0024ae;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14171b) {
            try {
                C0323m5 c0323m5 = this.f14171b;
                Object obj = c0323m5.f14229a;
                if (obj == null) {
                    c0323m5.f14230b.add(this.f14170a);
                } else {
                    this.f14170a.consume(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
