package defpackage;

import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pum implements wke {
    public final /* synthetic */ BlazeVideoManager a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function1 c;

    public pum(BlazeVideoManager blazeVideoManager, n4m n4mVar, Function1 function1) {
        this.a = blazeVideoManager;
        this.b = n4mVar;
        this.c = function1;
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        try {
            if (this.a.e(this.b)) {
                this.c.invoke(dkeVar);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
