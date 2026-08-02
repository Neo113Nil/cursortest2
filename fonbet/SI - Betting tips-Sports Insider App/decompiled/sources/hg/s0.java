package hg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public t0 f10755a;

    /* renamed from: b, reason: collision with root package name */
    public h f10756b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f10757c;

    /* renamed from: d, reason: collision with root package name */
    public eg.e1 f10758d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0 f10760f;

    /* renamed from: g, reason: collision with root package name */
    public int f10761g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, Continuation continuation) {
        super(continuation);
        this.f10760f = t0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10759e = obj;
        this.f10761g |= Integer.MIN_VALUE;
        t0.l(this.f10760f, null, this);
        return lf.a.f20034a;
    }
}
