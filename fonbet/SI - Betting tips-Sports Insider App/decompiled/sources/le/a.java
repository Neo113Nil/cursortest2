package le;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f19692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19691b = i5;
        this.f19692c = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19691b) {
            case 0:
                return new a(this.f19692c, continuation, 0);
            case 1:
                return new a(this.f19692c, continuation, 1);
            default:
                return new a(this.f19692c, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19691b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19691b;
        int i10 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        h hVar = this.f19692c;
        int i11 = 2;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                Pair pair = (Pair) hVar.f19805o.d();
                hVar.f19804n.h(new Pair(pair != null ? (String) pair.f19192a : null, pair != null ? (String) pair.f19193b : null));
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                jg.d dVar = MyApp.f6830c;
                lg.e eVar = eg.m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                hVar.j = eg.c0.t(dVar, dVar2, null, new b(hVar, objArr2 == true ? 1 : 0, i10), 2);
                hVar.f19801k = eg.c0.t(dVar, dVar2, null, new b(hVar, objArr == true ? 1 : 0, i11), 2);
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                s7.u uVar = hVar.f19797f.f25075b;
                ((la.h) y3.m(la.h.class, null, 6)).getClass();
                eb.m mVar = (eb.m) y3.m(eb.m.class, null, 6);
                hg.g i12 = hg.u0.i(hg.u0.i(new c1.u(2, new eb.i(hg.u0.i(io.sentry.config.a.e(mVar.f8830a.f8809a, new String[]{"sku_details_table"}, new a2.j(21))), mVar, i10))));
                lg.e eVar2 = eg.m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                hVar.f19800i = hg.u0.p(new hg.u(hg.u0.n(new hg.u(hg.u0.n(i12, dVar3), new kd.e((Object) hVar, (Continuation) (objArr4 == true ? 1 : 0), 9), 2), dVar3), new ge.o(3, objArr3 == true ? 1 : 0, i11)), androidx.lifecycle.d1.i(hVar));
                break;
        }
        return Unit.f19194a;
    }
}
