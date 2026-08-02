package kotlinx.coroutines.flow;

import Ph.C0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class z implements C, InterfaceC5321f, kotlinx.coroutines.flow.internal.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f54963a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f54964b;

    public z(C c10, C0 c02) {
        this.f54963a = c10;
        this.f54964b = c02;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public InterfaceC5321f b(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return E.e(this, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.C, kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        return this.f54963a.collect(interfaceC5322g, continuation);
    }
}
