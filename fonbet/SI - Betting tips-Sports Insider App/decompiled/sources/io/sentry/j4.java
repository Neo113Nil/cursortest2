package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: c, reason: collision with root package name */
    public static final j4 f16563c = new j4();

    /* renamed from: a, reason: collision with root package name */
    public boolean f16564a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f16565b = new io.sentry.util.a();

    public final void a() {
        r a7 = this.f16565b.a();
        try {
            if (!this.f16564a) {
                this.f16564a = true;
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
