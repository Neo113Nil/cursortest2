package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lgm implements z88 {
    public final /* synthetic */ z88 a;
    public final /* synthetic */ BlazePlayerType b;

    public lgm(z88 z88Var, BlazePlayerType blazePlayerType) {
        this.a = z88Var;
        this.b = blazePlayerType;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new cdm(b98Var, this.b), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
