package pe;

import androidx.lifecycle.p0;
import eg.c0;
import eg.m0;
import eg.z;
import hg.d1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21860b;

    /* renamed from: c, reason: collision with root package name */
    public int f21861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f21862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21860b = i5;
        this.f21862d = sVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21860b) {
            case 0:
                return new r(this.f21862d, continuation, 0);
            case 1:
                return new r(this.f21862d, continuation, 1);
            default:
                return new r(this.f21862d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21860b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21860b;
        s sVar = this.f21862d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f21861c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    io.sentry.hints.j jVar = sVar.q;
                    this.f21861c = 1;
                    jVar.getClass();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new ld.a(jVar, null, 3), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.a aVar2 = (ga.a) obj;
                sVar.f21879t.h(Boolean.valueOf(aVar2 != null));
                sVar.f21877r.set(false);
                sVar.f21883x = aVar2 != null ? aVar2.f9909a : -1;
                sVar.f21885z = aVar2 != null ? aVar2.f9910b : null;
                sVar.B.h(aVar2 != null ? aVar2.f9911c : null);
                return Unit.f19194a;
            case 1:
                p0 p0Var = sVar.C;
                d1 d1Var = sVar.f21881v;
                p0 p0Var2 = sVar.f21880u;
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f21861c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    if (sVar.f21882w.get()) {
                        Boolean bool = Boolean.FALSE;
                        p0Var2.h(bool);
                        d1Var.getClass();
                        d1Var.k(null, bool);
                        sVar.f21884y = -1;
                        sVar.A = null;
                        p0Var.h(null);
                        return Unit.f19194a;
                    }
                    io.sentry.hints.j jVar2 = sVar.q;
                    this.f21861c = 1;
                    jVar2.getClass();
                    lg.e eVar2 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new ld.a(jVar2, null, 5), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ga.a aVar4 = (ga.a) obj;
                p0Var2.h(Boolean.valueOf(aVar4 != null));
                sVar.f21878s.set(false);
                sVar.f21884y = aVar4 != null ? aVar4.f9909a : -1;
                sVar.A = aVar4 != null ? aVar4.f9910b : null;
                p0Var.h(aVar4 != null ? aVar4.f9911c : null);
                Boolean valueOf = Boolean.valueOf(aVar4 != null);
                d1Var.getClass();
                d1Var.k(null, valueOf);
                return Boolean.TRUE;
            default:
                lf.a aVar5 = lf.a.f20034a;
                int i12 = this.f21861c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    io.sentry.hints.j jVar3 = sVar.q;
                    this.f21861c = 1;
                    jVar3.getClass();
                    lg.e eVar3 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new ld.a(jVar3, null, 7), this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                d1 d1Var2 = sVar.D;
                d1Var2.getClass();
                d1Var2.k(null, bool2);
                return Unit.f19194a;
        }
    }
}
