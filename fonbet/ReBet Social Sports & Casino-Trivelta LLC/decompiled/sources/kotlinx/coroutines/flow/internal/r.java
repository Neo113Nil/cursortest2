package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public final class r implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final r f54777a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineContext f54778b = EmptyCoroutineContext.INSTANCE;

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return f54778b;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
    }
}
