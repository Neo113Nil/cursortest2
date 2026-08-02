package pd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i5, Continuation continuation, int i10) {
        super(i5, continuation);
        this.f21776b = i10;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.f21776b) {
            case 0:
                return new k(3, continuation, 0).invokeSuspend(Unit.f19194a);
            case 1:
                return new k(3, continuation, 1).invokeSuspend(Unit.f19194a);
            case 2:
                return new k(3, continuation, 2).invokeSuspend(Unit.f19194a);
            default:
                return new k(3, continuation, 3).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21776b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                break;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                break;
        }
        return Unit.f19194a;
    }
}
