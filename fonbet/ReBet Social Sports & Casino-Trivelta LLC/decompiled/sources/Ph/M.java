package Ph;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface M extends CoroutineContext.Element {

    /* renamed from: T2, reason: collision with root package name */
    public static final a f9041T2 = a.f9042a;

    public static final class a implements CoroutineContext.Key {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9042a = new a();
    }

    void handleException(CoroutineContext coroutineContext, Throwable th2);
}
