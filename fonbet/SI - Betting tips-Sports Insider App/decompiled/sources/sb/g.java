package sb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23417a;

    /* renamed from: b, reason: collision with root package name */
    public int f23418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f23419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t tVar, Continuation continuation) {
        super(continuation);
        this.f23419c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23417a = obj;
        this.f23418b |= Integer.MIN_VALUE;
        return this.f23419c.d(null, this);
    }
}
