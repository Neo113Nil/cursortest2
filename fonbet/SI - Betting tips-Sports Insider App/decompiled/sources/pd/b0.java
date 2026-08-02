package pd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f21729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j, Continuation continuation) {
        super(2, continuation);
        this.f21730c = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b0(this.f21730c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21729b;
        if (i5 == 0) {
            h8.b.B(obj);
            this.f21729b = 1;
            if (eg.c0.j(this.f21730c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }
}
