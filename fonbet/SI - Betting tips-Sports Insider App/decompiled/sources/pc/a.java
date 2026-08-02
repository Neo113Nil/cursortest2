package pc;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21603b;

    /* renamed from: c, reason: collision with root package name */
    public int f21604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f21605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(u uVar, boolean z5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21603b = i5;
        this.f21605d = uVar;
        this.f21606e = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21603b) {
            case 0:
                return new a(this.f21605d, this.f21606e, continuation, 0);
            default:
                return new a(this.f21605d, this.f21606e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21603b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21603b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f21604c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21604c = 1;
                Object i10 = u.i(this.f21605d, "inapp", this.f21606e, this);
                return i10 == aVar ? aVar : i10;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f21604c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21604c = 1;
                Object i12 = u.i(this.f21605d, "subs", this.f21606e, this);
                return i12 == aVar2 ? aVar2 : i12;
        }
    }
}
