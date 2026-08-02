package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class P implements InterfaceC5322g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f54666a;

    public P(Throwable th2) {
        this.f54666a = th2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    public Object emit(Object obj, Continuation continuation) {
        throw this.f54666a;
    }
}
