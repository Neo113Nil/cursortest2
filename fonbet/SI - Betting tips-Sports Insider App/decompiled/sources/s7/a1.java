package s7;

import java.lang.Thread;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f22636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f22637b;

    public a1(d1 d1Var, String str) {
        this.f22637b = d1Var;
        this.f22636a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        n0 n0Var = ((f1) this.f22637b.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22903f.b(th2, this.f22636a);
    }
}
