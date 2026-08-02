package Sh;

import Ph.Y0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class O implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10773a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f10774b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext.Key f10775c;

    public O(Object obj, ThreadLocal threadLocal) {
        this.f10773a = obj;
        this.f10774b = threadLocal;
        this.f10775c = new P(threadLocal);
    }

    @Override // Ph.Y0
    public Object T1(CoroutineContext coroutineContext) {
        Object obj = this.f10774b.get();
        this.f10774b.set(this.f10773a);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return Y0.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        if (!Intrinsics.areEqual(getKey(), key)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return this.f10775c;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return Intrinsics.areEqual(getKey(), key) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Y0.a.b(this, coroutineContext);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f10773a + ", threadLocal = " + this.f10774b + ')';
    }

    @Override // Ph.Y0
    public void z0(CoroutineContext coroutineContext, Object obj) {
        this.f10774b.set(obj);
    }
}
