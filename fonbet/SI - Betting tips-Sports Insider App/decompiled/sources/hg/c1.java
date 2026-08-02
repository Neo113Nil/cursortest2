package hg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public d1 f10657a;

    /* renamed from: b, reason: collision with root package name */
    public h f10658b;

    /* renamed from: c, reason: collision with root package name */
    public e1 f10659c;

    /* renamed from: d, reason: collision with root package name */
    public eg.e1 f10660d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10661e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f10663g;

    /* renamed from: h, reason: collision with root package name */
    public int f10664h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f10663g = d1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10662f = obj;
        this.f10664h |= Integer.MIN_VALUE;
        this.f10663g.a(null, this);
        return lf.a.f20034a;
    }
}
