package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f19759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19758b = i5;
        this.f19759c = f1Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19758b) {
            case 0:
                return new e1(this.f19759c, continuation, 0);
            default:
                return new e1(this.f19759c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19758b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((e1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((e1) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19758b;
        f1 f1Var = this.f19759c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                f1Var.e();
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                f1Var.j(f1Var.h());
                break;
        }
        return Unit.f19194a;
    }
}
