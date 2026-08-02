package la;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19521a;

    /* renamed from: b, reason: collision with root package name */
    public int f19522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.t f19523c;

    /* renamed from: d, reason: collision with root package name */
    public hg.h f19524d;

    /* renamed from: e, reason: collision with root package name */
    public int f19525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(c1.t tVar, Continuation continuation) {
        super(continuation);
        this.f19523c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19521a = obj;
        this.f19522b |= Integer.MIN_VALUE;
        return this.f19523c.d(null, this);
    }
}
