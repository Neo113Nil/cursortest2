package c1;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3473a;

    /* renamed from: b, reason: collision with root package name */
    public int f3474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f3475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Continuation continuation) {
        super(continuation);
        this.f3475c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3473a = obj;
        this.f3474b |= Integer.MIN_VALUE;
        return this.f3475c.d(null, this);
    }
}
