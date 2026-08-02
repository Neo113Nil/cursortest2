package Ph;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class A0 extends H0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8991f = AtomicIntegerFieldUpdater.newUpdater(A0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f8992e;

    public A0(Function1 function1) {
        this.f8992e = function1;
    }

    @Override // Ph.H0
    public boolean u() {
        return true;
    }

    @Override // Ph.H0
    public void v(Throwable th2) {
        if (f8991f.compareAndSet(this, 0, 1)) {
            this.f8992e.invoke(th2);
        }
    }
}
