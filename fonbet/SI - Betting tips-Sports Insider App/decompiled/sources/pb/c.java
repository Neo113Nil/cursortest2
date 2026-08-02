package pb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21596a;

    /* renamed from: b, reason: collision with root package name */
    public int f21597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f21598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, Continuation continuation) {
        super(continuation);
        this.f21598c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21596a = obj;
        this.f21597b |= Integer.MIN_VALUE;
        return this.f21598c.d(null, this);
    }
}
