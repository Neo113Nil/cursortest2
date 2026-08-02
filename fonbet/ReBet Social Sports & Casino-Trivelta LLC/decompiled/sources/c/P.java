package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zc.C6957c;

/* loaded from: classes.dex */
public final class P extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public C6957c f26481n;

    /* renamed from: o, reason: collision with root package name */
    public String f26482o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f26483p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C6957c f26484q;

    /* renamed from: r, reason: collision with root package name */
    public int f26485r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C6957c c6957c, Continuation continuation) {
        super(continuation);
        this.f26484q = c6957c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26483p = obj;
        this.f26485r |= Integer.MIN_VALUE;
        return this.f26484q.b(null, null, this);
    }
}
