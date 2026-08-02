package defpackage;

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ase {
    public LogSessionId a;

    public ase(int i) {
        LogSessionId logSessionId;
        LogSessionId logSessionId2;
        switch (i) {
            case 1:
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                this.a = logSessionId;
                break;
            default:
                logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
                this.a = logSessionId2;
                break;
        }
    }

    public void a(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = this.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        z1a.E(logSessionId3.equals(logSessionId2));
        this.a = logSessionId;
    }
}
