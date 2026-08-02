package le;

import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19705b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f19706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f19707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(d1 d1Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19705b = i5;
        this.f19707d = d1Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19705b) {
            case 0:
                b1 b1Var = new b1(this.f19707d, continuation, 0);
                b1Var.f19706c = ((Number) obj).longValue();
                return b1Var;
            default:
                b1 b1Var2 = new b1(this.f19707d, continuation, 1);
                b1Var2.f19706c = ((Number) obj).longValue();
                return b1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.f19705b) {
            case 0:
                return ((b1) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((b1) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19705b;
        d1 d1Var = this.f19707d;
        long j = this.f19706c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                if (j > Instant.now().getEpochSecond()) {
                    d1.s(d1Var, d1Var.j);
                }
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                if (j > Instant.now().getEpochSecond()) {
                    d1.s(d1Var, d1Var.j);
                }
                break;
        }
        return Unit.f19194a;
    }
}
