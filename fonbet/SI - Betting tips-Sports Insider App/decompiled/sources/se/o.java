package se;

import androidx.lifecycle.d1;
import da.r;
import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23573b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f23574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f23575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23573b = i5;
        this.f23575d = pVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23573b) {
            case 0:
                o oVar = new o(this.f23575d, continuation, 0);
                oVar.f23574c = ((Boolean) obj).booleanValue();
                return oVar;
            case 1:
                o oVar2 = new o(this.f23575d, continuation, 1);
                oVar2.f23574c = ((Boolean) obj).booleanValue();
                return oVar2;
            case 2:
                o oVar3 = new o(this.f23575d, continuation, 2);
                oVar3.f23574c = ((Boolean) obj).booleanValue();
                return oVar3;
            default:
                o oVar4 = new o(this.f23575d, continuation, 3);
                oVar4.f23574c = ((Boolean) obj).booleanValue();
                return oVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f23573b;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i5) {
        }
        return ((o) create(bool, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23573b;
        p pVar = this.f23575d;
        int i10 = 0;
        int i11 = 1;
        switch (i5) {
            case 0:
                boolean z5 = this.f23574c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                pVar.A.getClass();
                if (r.c()) {
                    i11 = 2;
                } else if (!z5) {
                    i11 = 0;
                }
                u1.a i12 = d1.i(pVar);
                CoroutineContext coroutineContext = pVar.L;
                lg.e eVar = m0.f9201a;
                c0.t(i12, coroutineContext.t(lg.d.f20063c), null, new f(pVar, i11, null, 0), 2);
                break;
            case 1:
                boolean z7 = this.f23574c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.A.getClass();
                if (r.d()) {
                    i10 = 2;
                } else if (z7) {
                    i10 = 1;
                }
                u1.a i13 = d1.i(pVar);
                CoroutineContext coroutineContext2 = pVar.L;
                lg.e eVar2 = m0.f9201a;
                c0.t(i13, coroutineContext2.t(lg.d.f20063c), null, new f(pVar, i10, null, 1), 2);
                break;
            case 2:
                boolean z10 = this.f23574c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.A.getClass();
                if (r.f()) {
                    i10 = 2;
                } else if (z10) {
                    i10 = 1;
                }
                u1.a i14 = d1.i(pVar);
                CoroutineContext coroutineContext3 = pVar.L;
                lg.e eVar3 = m0.f9201a;
                c0.t(i14, coroutineContext3.t(lg.d.f20063c), null, new f(pVar, i10, null, 2), 2);
                break;
            default:
                boolean z11 = this.f23574c;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                pVar.A.getClass();
                if (r.e()) {
                    i10 = 2;
                } else if (z11) {
                    i10 = 1;
                }
                u1.a i15 = d1.i(pVar);
                CoroutineContext coroutineContext4 = pVar.L;
                lg.e eVar4 = m0.f9201a;
                c0.t(i15, coroutineContext4.t(lg.d.f20063c), null, new bd.i(i10, 21, pVar, (Continuation) null), 2);
                break;
        }
        return Unit.f19194a;
    }
}
