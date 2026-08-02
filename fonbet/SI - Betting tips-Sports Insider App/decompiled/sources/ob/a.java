package ob;

import c1.t;
import kotlin.coroutines.Continuation;
import mf.c;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21151a;

    /* renamed from: b, reason: collision with root package name */
    public int f21152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f21153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t tVar, Continuation continuation) {
        super(continuation);
        this.f21153c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21151a = obj;
        this.f21152b |= Integer.MIN_VALUE;
        return this.f21153c.d(null, this);
    }
}
