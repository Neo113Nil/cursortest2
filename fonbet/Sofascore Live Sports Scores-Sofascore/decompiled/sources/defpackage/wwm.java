package defpackage;

import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wwm implements wke {
    public final /* synthetic */ BlazeVideoManager a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function0 c;

    public wwm(BlazeVideoManager blazeVideoManager, n4m n4mVar, Function0 function0) {
        this.a = blazeVideoManager;
        this.b = n4mVar;
        this.c = function0;
    }

    @Override // defpackage.wke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        if (this.a.e(this.b) && i == 5) {
            try {
                this.c.invoke();
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }
}
