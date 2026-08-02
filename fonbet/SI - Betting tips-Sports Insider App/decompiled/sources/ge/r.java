package ge;

import androidx.lifecycle.d1;
import com.sports.insider.data.repository.room.live.LiveTable;
import eg.m0;
import eg.z;
import hg.u;
import hg.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f9992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9991b = i5;
        this.f9992c = sVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9991b) {
            case 0:
                return new r(this.f9992c, continuation, 0);
            default:
                return new r(this.f9992c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f9991b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f9991b;
        int i10 = 3;
        Continuation continuation = null;
        s sVar = this.f9992c;
        int i11 = 0;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                u uVar = new u(new u(u0.i(new q(u0.h(sVar.f9996e, 100L), 0)), new androidx.lifecycle.c(sVar, continuation, 14), 2), new o(i10, continuation, i11));
                lg.e eVar = m0.f9201a;
                sVar.f9993b = u0.p(u0.n(uVar, lg.d.f20063c), d1.i(sVar));
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                bd.j jVar = sVar.f9995d;
                jVar.getClass();
                id.p e7 = io.sentry.config.a.e(bd.j.c().f19564a.f9927a, new String[]{LiveTable.tableName}, new f1.a(17));
                lg.e eVar2 = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                sVar.f9994c = u0.p(u0.n(new u(new u(u0.i(u0.n(new bd.g(u0.n(e7, dVar), jVar, 0), m0.f9201a)), new ab.b(sVar, (Continuation) null, 8), 2), new o(i10, continuation, 1)), dVar), d1.i(sVar));
                break;
        }
        return Unit.f19194a;
    }
}
