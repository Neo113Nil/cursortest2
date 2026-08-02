package rc;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22449a;

    /* renamed from: b, reason: collision with root package name */
    public int f22450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f22451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f22451c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22449a = obj;
        this.f22450b |= Integer.MIN_VALUE;
        return this.f22451c.d(null, this);
    }
}
