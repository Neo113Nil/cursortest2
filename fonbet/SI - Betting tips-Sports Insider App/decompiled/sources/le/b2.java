package le;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b2 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f19709b;

    /* renamed from: c, reason: collision with root package name */
    public int f19710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, Continuation continuation) {
        super(continuation);
        this.f19709b = c2Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19708a = obj;
        this.f19710c |= Integer.MIN_VALUE;
        return this.f19709b.a(0, this);
    }
}
