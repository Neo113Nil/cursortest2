package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16980a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16981b;

    public /* synthetic */ r(int i5, Object obj) {
        this.f16980a = i5;
        this.f16981b = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f16980a) {
            case 0:
                s.f17051a.set((b1) this.f16981b);
                break;
            default:
                ((io.sentry.util.a) this.f16981b).unlock();
                break;
        }
    }
}
