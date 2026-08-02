package id;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11213a;

    /* renamed from: b, reason: collision with root package name */
    public int f11214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f11215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f11215c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11213a = obj;
        this.f11214b |= Integer.MIN_VALUE;
        return this.f11215c.d(null, this);
    }
}
