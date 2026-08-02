package hg;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class k0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10710a;

    /* renamed from: b, reason: collision with root package name */
    public int f10711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f10712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f10712c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10710a = obj;
        this.f10711b |= Integer.MIN_VALUE;
        return this.f10712c.d(null, this);
    }
}
