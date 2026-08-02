package p3;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21504a;

    /* renamed from: b, reason: collision with root package name */
    public int f21505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f21506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, Continuation continuation) {
        super(continuation);
        this.f21506c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21504a = obj;
        this.f21505b |= Integer.MIN_VALUE;
        return this.f21506c.d(null, this);
    }
}
