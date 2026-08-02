package ve;

import com.sports.insider.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f24752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24751b = i5;
        this.f24752c = qVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24751b) {
            case 0:
                return new o(this.f24752c, continuation, 0);
            case 1:
                return new o(this.f24752c, continuation, 1);
            case 2:
                return new o(this.f24752c, continuation, 2);
            case 3:
                return new o(this.f24752c, continuation, 3);
            case 4:
                return new o(this.f24752c, continuation, 4);
            case 5:
                return new o(this.f24752c, continuation, 5);
            case 6:
                return new o(this.f24752c, continuation, 6);
            case 7:
                return new o(this.f24752c, continuation, 7);
            default:
                return new o(this.f24752c, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24751b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f24751b;
        q qVar = this.f24752c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.Express);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.awaiting);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.check_rate);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.read_prediction);
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.awaiting_result);
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.passed);
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.not_passed);
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.return_status);
            default:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                return qVar.getContext().getResources().getString(R.string.Total_ratio);
        }
    }
}
