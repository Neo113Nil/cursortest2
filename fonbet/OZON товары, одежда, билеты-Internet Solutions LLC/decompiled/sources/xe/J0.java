package xe;

import Ee.C2967a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class J0<T> extends V<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f105407d;

    public J0(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        super(coroutineContext, true, false);
        this.f105407d = Wc.b.a(this, this, function2);
    }

    @Override // xe.H0
    protected final void k0() {
        C2967a.a(this.f105407d, this);
    }
}
