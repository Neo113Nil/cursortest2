package me;

import com.sports.insider.MyApp;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f20604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20603b = i5;
        this.f20604c = c0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20603b) {
            case 0:
                return new a0(this.f20604c, continuation, 0);
            default:
                return new a0(this.f20604c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20603b) {
        }
        return ((a0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f20603b;
        c0 c0Var = this.f20604c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                l1.a aVar2 = c0Var.f20612b;
                int i10 = c0Var.f20619f;
                kc.b bVar = (kc.b) c0Var.f20643z.d();
                Continuation continuation = null;
                Integer num = bVar != null ? new Integer(bVar.getType()) : null;
                aVar2.getClass();
                eg.c0.t(MyApp.f6830c, new eg.y("favoriteChange"), null, new bd.i(aVar2, i10, num, continuation, 3), 2);
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                if (c0Var.P <= Instant.now().getEpochSecond()) {
                    b0 b0Var = c0Var.O;
                    if (b0Var != null) {
                        b0Var.cancel();
                    }
                    c0Var.O = null;
                } else {
                    long j = c0Var.Q;
                    long j6 = c0Var.P;
                    if (j == j6) {
                        break;
                    } else {
                        c0Var.Q = j6;
                        b0 b0Var2 = c0Var.O;
                        if (b0Var2 != null) {
                            b0Var2.cancel();
                        }
                        c0Var.O = null;
                        b0 b0Var3 = new b0(c0Var.P - Instant.now().toEpochMilli(), c0Var);
                        c0Var.O = b0Var3;
                        b0Var3.start();
                    }
                }
                break;
        }
        return Unit.f19194a;
    }
}
