package le;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f19696b;

    /* renamed from: c, reason: collision with root package name */
    public int f19697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(z0 z0Var, Continuation continuation) {
        super(continuation);
        this.f19696b = z0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19695a = obj;
        this.f19697c |= Integer.MIN_VALUE;
        return this.f19696b.c(null, this);
    }
}
