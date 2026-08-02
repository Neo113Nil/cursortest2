package Ph;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class B0 extends H0 {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f8998e;

    public B0(Function1 function1) {
        this.f8998e = function1;
    }

    @Override // Ph.H0
    public boolean u() {
        return false;
    }

    @Override // Ph.H0
    public void v(Throwable th2) {
        this.f8998e.invoke(th2);
    }
}
