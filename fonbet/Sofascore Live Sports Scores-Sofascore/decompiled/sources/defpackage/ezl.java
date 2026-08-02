package defpackage;

import com.blaze.blazesdk.ads.custom_native.a;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ezl extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ a s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezl(a aVar, String str, String str2, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = aVar;
        this.t = str;
        this.u = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new ezl(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ezl) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        a aVar = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                String str = this.t;
                int i2 = a.d;
                aVar.getClass();
                String valueOf = String.valueOf(System.currentTimeMillis());
                String r = c.r(c.r(str, "[timestamp]", valueOf, false), "[CACHEBUSTER]", valueOf, false);
                hs4 hs4Var = z45.a;
                hq4 hq4Var = hq4.c;
                vvl vvlVar = new vvl(r, this.u, aVar, null);
                this.r = 1;
                obj = xw3.R(hq4Var, vvlVar, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            d2g d2gVar = (d2g) obj;
            if (d2gVar.q) {
                i2g i2gVar = d2gVar.g;
                if (i2gVar != null) {
                    i2gVar.string();
                }
                aVar.getClass();
            } else {
                evl.m(aVar);
            }
        } catch (Exception e) {
            e.getMessage();
            evl.m(aVar);
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
        return Unit.a;
    }
}
