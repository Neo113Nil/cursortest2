package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bzl extends njc {
    public bzl() {
        super(7, 8);
    }

    @Override // defpackage.njc
    public final void b(dni dniVar) {
        dniVar.getClass();
        try {
            dniVar.E("CREATE TABLE IF NOT EXISTS `interactions_status` \n(`interaction_id` TEXT PRIMARY KEY NOT NULL, `interacted_value` TEXT NOT NULL)");
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
