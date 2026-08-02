package sb;

import c1.t;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23411a;

    /* renamed from: b, reason: collision with root package name */
    public int f23412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f23413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, Continuation continuation) {
        super(continuation);
        this.f23413c = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23411a = obj;
        this.f23412b |= Integer.MIN_VALUE;
        return this.f23413c.d(null, this);
    }
}
