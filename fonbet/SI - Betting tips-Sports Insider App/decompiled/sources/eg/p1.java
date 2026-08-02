package eg;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p1 extends kotlin.coroutines.a implements e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f9211b = new p1(x.f9237b);

    @Override // eg.e1
    public final o0 J(Function1 function1) {
        return q1.f9213a;
    }

    @Override // eg.e1
    public final o0 K(boolean z5, boolean z7, h1 h1Var) {
        return q1.f9213a;
    }

    @Override // eg.e1
    public final o Y(m1 m1Var) {
        return q1.f9213a;
    }

    @Override // eg.e1
    public final boolean c() {
        return true;
    }

    @Override // eg.e1
    public final boolean isCancelled() {
        return false;
    }

    @Override // eg.e1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // eg.e1
    public final Object w(mf.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // eg.e1
    public final CancellationException y() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // eg.e1
    public final void k(CancellationException cancellationException) {
    }
}
