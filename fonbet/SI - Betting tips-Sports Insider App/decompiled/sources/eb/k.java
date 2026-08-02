package eb;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8824a;

    /* renamed from: b, reason: collision with root package name */
    public int f8825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f8826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f8826c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8824a = obj;
        this.f8825b |= Integer.MIN_VALUE;
        return this.f8826c.d(null, this);
    }
}
