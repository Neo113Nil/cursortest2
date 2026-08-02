package sb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23408a;

    /* renamed from: b, reason: collision with root package name */
    public int f23409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f23410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, Continuation continuation) {
        super(continuation);
        this.f23410c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23408a = obj;
        this.f23409b |= Integer.MIN_VALUE;
        return this.f23410c.d(null, this);
    }
}
