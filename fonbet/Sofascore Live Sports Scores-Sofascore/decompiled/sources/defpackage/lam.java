package defpackage;

import android.graphics.Bitmap;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lam extends hoi implements Function1 {
    public final /* synthetic */ c1m r;
    public final /* synthetic */ Bitmap s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lam(c1m c1mVar, Bitmap bitmap, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = c1mVar;
        this.s = bitmap;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new lam(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new lam(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        t I;
        c1m c1mVar = this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            I = c1mVar.I();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        if (I == null) {
            return Unit.a;
        }
        rum h = c1m.h(c1mVar, this.s);
        if (h == null) {
            return Unit.a;
        }
        ((atl) I).a.put(c1mVar.H(), h);
        return Unit.a;
    }
}
