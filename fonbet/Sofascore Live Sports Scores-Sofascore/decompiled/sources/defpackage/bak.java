package defpackage;

import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bak extends hoi implements et8 {
    public int r;
    public /* synthetic */ long s;

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        bak bakVar = new bak(4, (rq3) obj4);
        bakVar.s = longValue;
        return bakVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            long j = this.s;
            rik o = rik.o();
            int i2 = cak.b;
            o.getClass();
            long min = Math.min(j * CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, cak.a);
            this.r = 1;
            if (n4o.y(min, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Boolean.TRUE;
    }
}
