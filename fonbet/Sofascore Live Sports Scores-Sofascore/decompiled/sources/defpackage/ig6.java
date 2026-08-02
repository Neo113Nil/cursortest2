package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ig6 {
    public static bse a(Context context, ug6 ug6Var, boolean z) {
        LogSessionId logSessionId;
        MediaMetricsManager f = i3c.f(context.getSystemService("media_metrics"));
        r6c r6cVar = f == null ? null : new r6c(context, f.createPlaybackSession());
        if (r6cVar == null) {
            m6k.f0();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new bse(logSessionId);
        }
        if (z) {
            bn4 bn4Var = ug6Var.r;
            bn4Var.getClass();
            bn4Var.f.e(r6cVar);
        }
        return new bse(r6cVar.c.getSessionId());
    }
}
