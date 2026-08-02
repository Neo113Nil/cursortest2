package Yh;

import Ph.M;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b implements M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f14265a = a.f14260a;

    public boolean equals(Object obj) {
        return (obj instanceof b) || (obj instanceof a);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f14265a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f14265a.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return this.f14265a.getKey();
    }

    @Override // Ph.M
    public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        this.f14265a.handleException(coroutineContext, th2);
    }

    public int hashCode() {
        return a.f14260a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f14265a.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f14265a.plus(coroutineContext);
    }
}
