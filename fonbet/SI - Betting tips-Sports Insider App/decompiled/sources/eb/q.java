package eb;

import eg.z;
import f3.x;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.sentry.hints.j f8837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(io.sentry.hints.j jVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f8836b = i5;
        this.f8837c = jVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f8836b) {
            case 0:
                return new q(this.f8837c, continuation, 0);
            case 1:
                return new q(this.f8837c, continuation, 1);
            case 2:
                return new q(this.f8837c, continuation, 2);
            case 3:
                return new q(this.f8837c, continuation, 3);
            case 4:
                return new q(this.f8837c, continuation, 4);
            case 5:
                return new q(this.f8837c, continuation, 5);
            case 6:
                return new q(this.f8837c, continuation, 6);
            default:
                return new q(this.f8837c, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f8836b) {
        }
        return ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f8836b;
        io.sentry.hints.j jVar = this.f8837c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(20));
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(23));
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(25));
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(27));
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(26));
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(24));
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(22));
            default:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(io.sentry.hints.j.s(jVar).f8830a.f8809a, true, false, new a2.j(19));
        }
    }
}
