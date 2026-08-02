package defpackage;

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b3c {
    public static void a(n2c n2cVar, bse bseVar) {
        LogSessionId logSessionId;
        zre zreVar = bseVar.a;
        zreVar.getClass();
        LogSessionId logSessionId2 = zreVar.a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        n2cVar.b.setString("log-session-id", logSessionId2.getStringId());
    }
}
