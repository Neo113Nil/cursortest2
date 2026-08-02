package rc;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22411a;

    /* renamed from: b, reason: collision with root package name */
    public int f22412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f22413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f22413c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22411a = obj;
        this.f22412b |= Integer.MIN_VALUE;
        return this.f22413c.d(null, this);
    }
}
