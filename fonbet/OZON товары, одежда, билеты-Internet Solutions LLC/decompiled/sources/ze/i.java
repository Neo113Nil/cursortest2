package ze;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.C0;
import xe.H0;
import ze.C11115c;

/* loaded from: classes.dex */
public class i<E> extends AbstractC10711a<Unit> implements h<E> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C11115c f108946d;

    public i(@NotNull CoroutineContext coroutineContext, @NotNull C11115c c11115c) {
        super(coroutineContext, true, true);
        this.f108946d = c11115c;
    }

    @Override // ze.x
    public final void a(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f108946d.a(function1);
    }

    @Override // ze.x
    @NotNull
    public final Object b(E e11) {
        return this.f108946d.b(e11);
    }

    @Override // ze.w
    @NotNull
    public final Ie.f c() {
        return this.f108946d.c();
    }

    @Override // ze.w
    @NotNull
    public final Object e() {
        return this.f108946d.e();
    }

    @Override // ze.w
    public final Object f(@NotNull kotlin.coroutines.d<? super l<? extends E>> dVar) {
        C11115c c11115c = this.f108946d;
        c11115c.getClass();
        Object O11 = C11115c.O(c11115c, (kotlin.coroutines.jvm.internal.c) dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        return O11;
    }

    @Override // ze.x
    public final boolean g() {
        return this.f108946d.g();
    }

    @Override // ze.w
    @NotNull
    public final Ie.f h() {
        return this.f108946d.h();
    }

    @Override // ze.w
    public final Object i(@NotNull kotlin.coroutines.d<? super E> dVar) {
        return this.f108946d.i(dVar);
    }

    @Override // ze.w
    @NotNull
    public final j<E> iterator() {
        C11115c c11115c = this.f108946d;
        c11115c.getClass();
        return new C11115c.a();
    }

    @Override // xe.H0, xe.B0
    public final void j(CancellationException cancellationException) {
        String F11;
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            F11 = F();
            cancellationException = new C0(F11, null, this);
        }
        z(cancellationException);
    }

    @Override // ze.x
    public final boolean l(Throwable th2) {
        return this.f108946d.y(false, th2);
    }

    @Override // ze.x
    public final Object n(E e11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f108946d.n(e11, dVar);
    }

    @Override // xe.H0
    public final void z(@NotNull CancellationException cancellationException) {
        CancellationException t02 = H0.t0(this, cancellationException);
        this.f108946d.y(true, t02);
        x(t02);
    }

    @NotNull
    protected final h<E> z0() {
        return this.f108946d;
    }
}
