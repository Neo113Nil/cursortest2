package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bdm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdm(Map map, String str, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = map;
        this.t = str;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new bdm(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((bdm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (defpackage.evl.b(r1, r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (r5.a(r4) == r0) goto L17;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            bwm bwmVar = bwm.a;
            this.r = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        String str = (String) this.s.get("WscIasData");
        Function1<? super BlazeResult<Unit>, Unit> function1 = this.u;
        if (str != null) {
            BlazeSDK.INSTANCE.handleNotificationValue(str, this.t, function1);
            return Unit.a;
        }
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        j1m j1mVar = j1m.a;
        s sVar = new s();
        j1m.a(sVar);
        BlazeResult.Error d = sVar.d();
        this.r = 2;
    }
}
