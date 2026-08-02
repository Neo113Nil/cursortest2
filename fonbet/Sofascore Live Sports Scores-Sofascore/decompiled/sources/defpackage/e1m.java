package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e1m extends hoi implements Function1 {
    public int r;

    public e1m(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new e1m(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new e1m((rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r6.a(r5) == r0) goto L27;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uul uulVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        try {
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        if (i == 0) {
            y6a.M(obj);
            bwm bwmVar = bwm.a;
            this.r = 1;
            if (bwmVar.a(this) == lu3Var) {
                return lu3Var;
            }
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
        tul tulVar = jdm.d;
        if ((tulVar == null || (uulVar = tulVar.a) == null) ? false : uulVar.g) {
            kqm kqmVar = kqm.a;
            this.r = 2;
        }
        return Unit.a;
    }
}
