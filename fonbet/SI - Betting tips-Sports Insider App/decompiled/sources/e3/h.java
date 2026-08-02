package e3;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8520b;

    /* renamed from: c, reason: collision with root package name */
    public int f8521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f8522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CoroutineWorker coroutineWorker, Continuation continuation, int i5) {
        super(2, continuation);
        this.f8520b = i5;
        this.f8522d = coroutineWorker;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f8520b) {
            case 0:
                return new h(this.f8522d, continuation, 0);
            default:
                return new h(this.f8522d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f8520b) {
            case 0:
                h hVar = (h) create(zVar, continuation);
                Unit unit = Unit.f19194a;
                hVar.invokeSuspend(unit);
                return unit;
            default:
                return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8520b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f8521c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f8521c = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return obj;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f8521c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f8521c = 1;
                Object c2 = this.f8522d.c(this);
                return c2 == aVar2 ? aVar2 : c2;
        }
    }
}
