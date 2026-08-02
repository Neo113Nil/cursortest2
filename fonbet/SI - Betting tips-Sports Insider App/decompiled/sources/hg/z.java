package hg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public a0 f10805a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10806b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f10808d;

    /* renamed from: e, reason: collision with root package name */
    public int f10809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f10808d = a0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10807c = obj;
        this.f10809e |= Integer.MIN_VALUE;
        return this.f10808d.d(null, this);
    }
}
