package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x2m extends njc {
    public x2m() {
        super(8, 9);
    }

    @Override // defpackage.njc
    public final void b(dni dniVar) {
        dniVar.getClass();
        try {
            dniVar.E("CREATE TABLE IF NOT EXISTS `videos_liked_status` (\n    `video_id` TEXT PRIMARY KEY NOT NULL, \n    `is_liked` INTEGER NOT NULL\n)");
            dniVar.E("CREATE TABLE IF NOT EXISTS `videos_viewed` (\n    `video_id` TEXT PRIMARY KEY NOT NULL, \n    `is_synced` INTEGER NOT NULL,\n    `last_viewed_ms` REAL NOT NULL,\n    `is_read` INTEGER NOT NULL\n)");
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
