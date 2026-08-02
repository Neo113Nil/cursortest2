package xe;

import De.C2866i;
import Sc.r;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10714b0<T> extends He.h {

    /* renamed from: c, reason: collision with root package name */
    public int f105427c;

    public AbstractC10714b0(int i11) {
        this.f105427c = i11;
    }

    public void b(@NotNull CancellationException cancellationException) {
    }

    @NotNull
    public abstract kotlin.coroutines.d<T> c();

    public Throwable d(Object obj) {
        C10760z c10760z = obj instanceof C10760z ? (C10760z) obj : null;
        if (c10760z != null) {
            return c10760z.f105510a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(@NotNull Throwable th2) {
        K.a(c().getContext(), new P("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object g();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = xe.B0.f105374o0;
        r4 = (xe.B0) r5.get(xe.B0.a.f105375a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            kotlin.coroutines.d<T> c11 = c();
            Intrinsics.g(c11, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2866i c2866i = (C2866i) c11;
            kotlin.coroutines.jvm.internal.c cVar = c2866i.f6624e;
            Object obj = c2866i.f6626g;
            CoroutineContext context = cVar.getContext();
            Object c12 = De.G.c(context, obj);
            B0 b02 = null;
            h1<?> d11 = c12 != De.G.f6602a ? G.d(cVar, context, c12) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object g10 = g();
                Throwable d12 = d(g10);
                if (d12 == null) {
                    int i11 = this.f105427c;
                    boolean z11 = true;
                    if (i11 != 1 && i11 != 2) {
                        z11 = false;
                    }
                }
                if (b02 != null && !b02.isActive()) {
                    CancellationException Z11 = b02.Z();
                    b(Z11);
                    r.Companion companion = Sc.r.INSTANCE;
                    cVar.resumeWith(Sc.s.a(Z11));
                } else if (d12 != null) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    cVar.resumeWith(Sc.s.a(d12));
                } else {
                    r.Companion companion3 = Sc.r.INSTANCE;
                    cVar.resumeWith(e(g10));
                }
                Unit unit = Unit.f71690a;
                if (d11 == null || d11.z0()) {
                    De.G.a(context, c12);
                }
            } catch (Throwable th2) {
                if (d11 == null || d11.z0()) {
                    De.G.a(context, c12);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            f(th3);
        }
    }
}
