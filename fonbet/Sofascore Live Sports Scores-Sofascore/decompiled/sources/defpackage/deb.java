package defpackage;

import com.sofascore.model.firebase.AdConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class deb extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ geb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deb(geb gebVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = gebVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new deb(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((deb) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Integer delaySeconds;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        geb gebVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            wd5 wd5Var = xd5.b;
            AdConfig.Preroll preroll = gebVar.k;
            long R = wkn.R((preroll == null || (delaySeconds = preroll.getDelaySeconds()) == null) ? 0 : delaySeconds.intValue(), be5.SECONDS);
            this.r = 1;
            if (n4o.z(R, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        int i2 = geb.q;
        if (gebVar.n()) {
            gebVar.h = true;
            sr8 sr8Var = gebVar.f;
            gebVar.f = null;
            if (sr8Var != null) {
                sr8Var.invoke();
            }
        }
        return Unit.a;
    }
}
