package rc;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f22384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, boolean z5, boolean z7, boolean z10, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f22384b = b0Var;
        this.f22385c = z5;
        this.f22386d = z7;
        this.f22387e = z10;
        this.f22388f = z11;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a0(this.f22384b, this.f22385c, this.f22386d, this.f22387e, this.f22388f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        b0.a(this.f22384b).getClass();
        ac.a a7 = za.k.a();
        za.k.a().getClass();
        Pair pair = new Pair("liveActive", Boolean.valueOf(this.f22385c));
        za.k.a().getClass();
        Pair pair2 = new Pair("premiumActive", Boolean.valueOf(this.f22386d));
        za.k.a().getClass();
        Pair pair3 = new Pair("expressActive", Boolean.valueOf(this.f22387e));
        za.k.a().getClass();
        ((ac.d) a7).a(n0.e(pair, pair2, pair3, new Pair("diamondActive", Boolean.valueOf(this.f22388f))));
        return Unit.f19194a;
    }
}
