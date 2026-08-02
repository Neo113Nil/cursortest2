package Sh;

import kotlin.coroutines.CoroutineContext;

/* renamed from: Sh.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1567e implements Ph.P {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f10785a;

    public C1567e(CoroutineContext coroutineContext) {
        this.f10785a = coroutineContext;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f10785a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
