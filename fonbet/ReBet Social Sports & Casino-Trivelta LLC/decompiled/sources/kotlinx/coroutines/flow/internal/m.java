package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f54775a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f54776b;

    public m(Throwable th2, CoroutineContext coroutineContext) {
        this.f54775a = coroutineContext;
        this.f54776b = th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f54775a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f54775a.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f54775a.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f54775a.plus(coroutineContext);
    }
}
