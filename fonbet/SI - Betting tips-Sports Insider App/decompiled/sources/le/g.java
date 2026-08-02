package le;

import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19788b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f19789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k1 f19790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(androidx.lifecycle.k1 k1Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19788b = i5;
        this.f19790d = k1Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19788b) {
            case 0:
                g gVar = new g((h) this.f19790d, continuation, 0);
                gVar.f19789c = ((Number) obj).longValue();
                return gVar;
            default:
                g gVar2 = new g((z) this.f19790d, continuation, 1);
                gVar2.f19789c = ((Number) obj).longValue();
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.f19788b) {
            case 0:
                return ((g) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((g) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19788b;
        androidx.lifecycle.k1 k1Var = this.f19790d;
        long j = this.f19789c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                if (j > Instant.now().getEpochSecond()) {
                    ((h) k1Var).n();
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                if (j > Instant.now().getEpochSecond()) {
                    z zVar = (z) k1Var;
                    u1.a i10 = androidx.lifecycle.d1.i(zVar);
                    lg.e eVar = eg.m0.f9201a;
                    eg.c0.t(i10, jg.q.f18523a, null, new y(zVar, null, 2), 2);
                }
                break;
        }
        return Unit.f19194a;
    }
}
