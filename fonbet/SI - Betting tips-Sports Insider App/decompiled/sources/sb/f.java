package sb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23414a;

    /* renamed from: b, reason: collision with root package name */
    public int f23415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f23416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, Continuation continuation) {
        super(continuation);
        this.f23416c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23414a = obj;
        this.f23415b |= Integer.MIN_VALUE;
        return this.f23416c.d(null, this);
    }
}
