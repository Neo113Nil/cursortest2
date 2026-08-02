package kotlinx.coroutines.flow;

import Ph.C0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class A implements L, InterfaceC5321f, kotlinx.coroutines.flow.internal.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f54609a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f54610b;

    public A(L l10, C0 c02) {
        this.f54609a = l10;
        this.f54610b = c02;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public InterfaceC5321f b(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return N.d(this, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.C, kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        return this.f54609a.collect(interfaceC5322g, continuation);
    }

    @Override // kotlinx.coroutines.flow.L
    public Object getValue() {
        return this.f54609a.getValue();
    }
}
