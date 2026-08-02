package za;

import eg.g0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25895b;

    /* renamed from: c, reason: collision with root package name */
    public int f25896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f25897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g0 g0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f25895b = i5;
        this.f25897d = g0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f25895b) {
            case 0:
                return new d(this.f25897d, continuation, 0);
            default:
                return new d(this.f25897d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f25895b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25895b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f25896c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f25896c = 1;
                Object m6 = this.f25897d.m(this);
                return m6 == aVar ? aVar : m6;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f25896c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f25896c = 1;
                Object m10 = this.f25897d.m(this);
                return m10 == aVar2 ? aVar2 : m10;
        }
    }
}
