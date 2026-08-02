package le;

import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e2 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19760b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f19761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f19762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(f2 f2Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19760b = i5;
        this.f19762d = f2Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19760b) {
            case 0:
                e2 e2Var = new e2(this.f19762d, continuation, 0);
                e2Var.f19761c = ((Number) obj).longValue();
                return e2Var;
            default:
                e2 e2Var2 = new e2(this.f19762d, continuation, 1);
                e2Var2.f19761c = ((Number) obj).longValue();
                return e2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.f19760b) {
            case 0:
                return ((e2) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((e2) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19760b;
        f2 f2Var = this.f19762d;
        long j = this.f19761c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                if (j > Instant.now().getEpochSecond()) {
                    f2.s(f2Var, f2Var.j);
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                if (j > Instant.now().getEpochSecond()) {
                    f2.s(f2Var, f2Var.j);
                }
                break;
        }
        return Unit.f19194a;
    }
}
