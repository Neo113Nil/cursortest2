package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;
import defpackage.w3m;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cnm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ w3m s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnm(w3m w3mVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = w3mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new cnm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new cnm(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            w3m w3mVar = this.s;
            n4m D = w3mVar.D();
            if (D != null) {
                w3mVar.h0(new w3m.a.b(true));
                D.m = Boolean.TRUE;
                gim gimVar = D.b;
                if (gimVar instanceof gim.e) {
                    qom qomVar = w3mVar.k0;
                    String str = ((gim.e) gimVar).a.id;
                    Integer t = tz9.t(w3mVar.t, w3mVar.D());
                    String H = w3mVar.H();
                    this.r = 1;
                    qomVar.getClass();
                    try {
                        Set<Map.Entry> entrySet = qom.c.entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (Intrinsics.c(entry.getKey(), H)) {
                                aeh aehVar = qom.f;
                                Object key = entry.getKey();
                                key.getClass();
                                aehVar.b(key);
                                fdi fdiVar = qom.k;
                                HashMap f = tub.f(new Pair(H, t));
                                fdiVar.getClass();
                                fdiVar.m(null, f);
                            }
                        }
                    } catch (Throwable th) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    }
                    if (Unit.a == lu3Var) {
                        return lu3Var;
                    }
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
