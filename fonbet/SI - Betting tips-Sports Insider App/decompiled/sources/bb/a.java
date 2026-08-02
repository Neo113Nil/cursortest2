package bb;

import eg.z;
import f3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f3127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3126b = i10;
        this.f3127c = bVar;
        this.f3128d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3126b) {
            case 0:
                return new a(this.f3127c, this.f3128d, continuation, 0);
            default:
                return new a(this.f3127c, this.f3128d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3126b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3126b;
        int i10 = this.f3128d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) x.n0(x.e0().f23426a.f23832a, false, true, new eb.b(i10, 17))).intValue());
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) x.n0(x.e0().f23426a.f23832a, false, true, new eb.b(i10, 18))).intValue());
        }
    }
}
