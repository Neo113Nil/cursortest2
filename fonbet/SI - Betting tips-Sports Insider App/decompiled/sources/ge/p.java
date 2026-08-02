package ge;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9986a;

    /* renamed from: b, reason: collision with root package name */
    public int f9987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f9988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f9988c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f9986a = obj;
        this.f9987b |= Integer.MIN_VALUE;
        return this.f9988c.d(null, this);
    }
}
