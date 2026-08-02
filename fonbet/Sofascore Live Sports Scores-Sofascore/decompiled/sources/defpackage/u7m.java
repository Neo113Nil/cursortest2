package defpackage;

import android.app.Application;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.n4m;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u7m extends hoi implements Function1 {
    public long r;
    public int s;
    public final /* synthetic */ n4m.a.C1353a t;
    public final /* synthetic */ esf u;
    public final /* synthetic */ c1m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7m(n4m.a.C1353a c1353a, esf esfVar, c1m c1mVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = c1353a;
        this.u = esfVar;
        this.v = c1mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new u7m(this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((u7m) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:5:0x003b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long c;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            c = wzb.c(this.t.b);
            if (this.u.a <= this.t.b) {
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c = this.r;
            y6a.M(obj);
            esf esfVar = this.u;
            long j = esfVar.a + 10;
            esfVar.a = j;
            fdm fdmVar = this.v.o;
            Pair pair = new Pair(new Long(j), new Long(c));
            if (fdmVar.a.b(pair)) {
                fdmVar.b = pair;
            }
            if (this.u.a <= this.t.b) {
                this.r = c;
                this.s = 1;
                if (n4o.y(10L, this) == lu3Var) {
                    return lu3Var;
                }
                esf esfVar2 = this.u;
                long j2 = esfVar2.a + 10;
                esfVar2.a = j2;
                fdm fdmVar2 = this.v.o;
                Pair pair2 = new Pair(new Long(j2), new Long(c));
                if (fdmVar2.a.b(pair2)) {
                }
                if (this.u.a <= this.t.b) {
                    c1m c1mVar = this.v;
                    fdm fdmVar3 = c1mVar.o;
                    Pair pair3 = new Pair(new Long(c1mVar.E()), new Long(this.v.E()));
                    if (fdmVar3.a.b(pair3)) {
                        fdmVar3.b = pair3;
                    }
                    Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    if (!(application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false)) {
                        this.v.E.k(cxl.NEXT);
                    }
                    return Unit.a;
                }
            }
        }
    }
}
