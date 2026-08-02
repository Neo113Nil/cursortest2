package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c6m extends njc {
    public c6m() {
        super(9, 10);
    }

    @Override // defpackage.njc
    public final void b(dni dniVar) {
        dniVar.getClass();
        try {
            dniVar.E("CREATE TABLE IF NOT EXISTS `blaze_logs` (\n    `id` TEXT NOT NULL PRIMARY KEY,\n    `request` TEXT NOT NULL,\n    `level` TEXT NOT NULL,\n    `reporting_timestamp` TEXT,\n    `is_immediate` INTEGER NOT NULL,\n    `api_scheme_version` TEXT NOT NULL\n)");
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
