package xe;

import Ee.C2967a;
import Sc.r;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.O;

/* renamed from: xe.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10711a<T> extends H0 implements kotlin.coroutines.d<T>, M {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f105424c;

    public AbstractC10711a(@NotNull CoroutineContext coroutineContext, boolean z11, boolean z12) {
        super(z12);
        if (z11) {
            Y((B0) coroutineContext.get(B0.a.f105375a));
        }
        this.f105424c = coroutineContext.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xe.H0
    @NotNull
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // xe.H0
    public final void W(@NotNull C10709A c10709a) {
        K.a(this.f105424c, c10709a);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return this.f105424c;
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f105424c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xe.H0
    protected final void j0(Object obj) {
        if (!(obj instanceof C10760z)) {
            x0(obj);
            return;
        }
        C10760z c10760z = (C10760z) obj;
        w0(c10760z.a(), c10760z.f105510a);
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        Throwable b11 = Sc.r.b(obj);
        if (b11 != null) {
            obj = new C10760z(false, b11);
        }
        Object f02 = f0(obj);
        if (f02 == I0.f105399b) {
            return;
        }
        t(f02);
    }

    protected void w0(boolean z11, @NotNull Throwable th2) {
    }

    protected void x0(T t2) {
    }

    public final void y0(@NotNull O o11, AbstractC10711a abstractC10711a, @NotNull Function2 function2) {
        Object invoke;
        o11.getClass();
        int i11 = O.a.f105412a[o11.ordinal()];
        if (i11 == 1) {
            C2967a.b(function2, abstractC10711a, this);
            return;
        }
        if (i11 == 2) {
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(this, "completion");
            kotlin.coroutines.d b11 = Wc.b.b(Wc.b.a(abstractC10711a, this, function2));
            r.Companion companion = Sc.r.INSTANCE;
            b11.resumeWith(Unit.f71690a);
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new Sc.o();
            }
            return;
        }
        Intrinsics.checkNotNullParameter(this, "completion");
        try {
            CoroutineContext coroutineContext = this.f105424c;
            Object c11 = De.G.c(coroutineContext, null);
            try {
                Intrinsics.checkNotNullParameter(this, "frame");
                if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
                    kotlin.jvm.internal.U.g(2, function2);
                    invoke = function2.invoke(abstractC10711a, this);
                } else {
                    invoke = Wc.b.c(function2, abstractC10711a, this);
                }
                De.G.a(coroutineContext, c11);
                if (invoke != Wc.a.COROUTINE_SUSPENDED) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    resumeWith(invoke);
                }
            } catch (Throwable th2) {
                De.G.a(coroutineContext, c11);
                throw th2;
            }
        } catch (Throwable th3) {
            r.Companion companion3 = Sc.r.INSTANCE;
            resumeWith(Sc.s.a(th3));
        }
    }
}
