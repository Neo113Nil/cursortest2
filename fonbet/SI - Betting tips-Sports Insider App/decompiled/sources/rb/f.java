package rb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22379a;

    /* renamed from: b, reason: collision with root package name */
    public int f22380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f22381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, Continuation continuation) {
        super(continuation);
        this.f22381c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22379a = obj;
        this.f22380b |= Integer.MIN_VALUE;
        return this.f22381c.d(null, this);
    }
}
