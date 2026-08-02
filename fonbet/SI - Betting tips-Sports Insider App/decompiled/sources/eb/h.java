package eb;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8815a;

    /* renamed from: b, reason: collision with root package name */
    public int f8816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f8817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f8817c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8815a = obj;
        this.f8816b |= Integer.MIN_VALUE;
        return this.f8817c.d(null, this);
    }
}
