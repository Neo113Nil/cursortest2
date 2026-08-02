package xe;

import Ee.C2967a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class K0 extends U0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f105408d;

    public K0(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, true, false);
        this.f105408d = Wc.b.a(this, this, function2);
    }

    @Override // xe.H0
    protected final void k0() {
        C2967a.a(this.f105408d, this);
    }
}
