package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.b;
import com.blaze.blazesdk.closed_captions.models.ui.d;
import com.blaze.blazesdk.closed_captions.models.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dum extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dum(String str, e eVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = eVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new dum(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new dum(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        String str = null;
        if (i == 0) {
            y6a.M(obj);
            vnm vnmVar = vnm.a;
            e eVar = this.t;
            if (eVar != null) {
                if (eVar instanceof d) {
                    str = "unknown";
                } else {
                    if (!(eVar instanceof b)) {
                        zzl.b();
                        return null;
                    }
                    str = ((b) eVar).a;
                }
            }
            this.r = 1;
            if (vnmVar.d(this.s, str, this) == lu3Var) {
                return lu3Var;
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
