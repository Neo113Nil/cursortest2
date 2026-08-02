package eb;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8821a;

    /* renamed from: b, reason: collision with root package name */
    public int f8822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f8823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f8823c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8821a = obj;
        this.f8822b |= Integer.MIN_VALUE;
        return this.f8823c.d(null, this);
    }
}
