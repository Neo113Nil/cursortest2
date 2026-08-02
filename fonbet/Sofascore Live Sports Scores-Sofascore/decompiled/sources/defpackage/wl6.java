package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wl6 extends hoi implements Function2 {
    public final /* synthetic */ syl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl6(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new wl6(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wl6(this.r, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        int i = syl.C;
        syl sylVar = this.r;
        sylVar.getClass();
        udm udmVar = sylVar.q;
        try {
            int currentItem = udmVar.j.getCurrentItem() + 1;
            mpm mpmVar = sylVar.t;
            if (currentItem < (mpmVar != null ? mpmVar.getItemCount() : 0)) {
                udmVar.j.setCurrentItem(currentItem);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return Unit.a;
    }
}
