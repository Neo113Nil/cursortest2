package md;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20552a;

    /* renamed from: b, reason: collision with root package name */
    public int f20553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bd.f f20554c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bd.f fVar, Continuation continuation) {
        super(continuation);
        this.f20554c = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20552a = obj;
        this.f20553b |= Integer.MIN_VALUE;
        return this.f20554c.d(null, this);
    }
}
