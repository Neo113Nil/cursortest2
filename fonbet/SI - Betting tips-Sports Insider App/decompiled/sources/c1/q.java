package c1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3465b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i5, Continuation continuation, int i10) {
        super(i5, continuation);
        this.f3465b = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3465b) {
            case 0:
                q qVar = new q(2, continuation, 0);
                qVar.f3466c = obj;
                return qVar;
            default:
                q qVar2 = new q(2, continuation, 1);
                qVar2.f3466c = obj;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3465b) {
            case 0:
                return ((q) create((c1) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((q) create((hg.w0) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3465b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return Boolean.valueOf(!(((c1) this.f3466c) instanceof s0));
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return Boolean.valueOf(((hg.w0) this.f3466c) != hg.w0.f10789a);
        }
    }
}
