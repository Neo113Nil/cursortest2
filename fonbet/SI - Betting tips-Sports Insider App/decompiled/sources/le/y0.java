package le;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f20001b;

    /* renamed from: c, reason: collision with root package name */
    public int f20002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, Continuation continuation) {
        super(continuation);
        this.f20001b = z0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20000a = obj;
        this.f20002c |= Integer.MIN_VALUE;
        return this.f20001b.a(0, this);
    }
}
