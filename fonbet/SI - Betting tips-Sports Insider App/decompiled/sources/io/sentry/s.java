package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f17051a = new ThreadLocal();

    @Override // io.sentry.c1
    public final f1 a(b1 b1Var) {
        b1 b1Var2 = get();
        f17051a.set(b1Var);
        return new r(0, b1Var2);
    }

    @Override // io.sentry.c1
    public final void close() {
        f17051a.remove();
    }

    @Override // io.sentry.c1
    public final b1 get() {
        return (b1) f17051a.get();
    }
}
