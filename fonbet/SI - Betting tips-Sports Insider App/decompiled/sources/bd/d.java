package bd;

import eg.z;
import f3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3145b = i10;
        this.f3146c = jVar;
        this.f3147d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3145b) {
            case 0:
                return new d(this.f3146c, this.f3147d, continuation, 0);
            default:
                return new d(this.f3146c, this.f3147d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3145b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3145b;
        int i10 = this.f3147d;
        j jVar = this.f3146c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                jVar.getClass();
                return Boolean.valueOf(io.sentry.config.a.C(new Integer(((Number) x.n0(j.c().f19564a.f9927a, true, false, new eb.b(i10, 4))).intValue())));
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                jVar.getClass();
                return new Integer(((Number) x.n0(j.c().f19564a.f9927a, false, true, new eb.b(i10, 2))).intValue());
        }
    }
}
