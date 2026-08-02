package eb;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class l extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8827a;

    /* renamed from: b, reason: collision with root package name */
    public int f8828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f8829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f8829c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8827a = obj;
        this.f8828b |= Integer.MIN_VALUE;
        return this.f8829c.d(null, this);
    }
}
