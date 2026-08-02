package com.google.android.gms.cast.internal;

import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzq {
    public final Logger a;
    public final String b;
    public zzas c;

    public zzq(String str) {
        CastUtils.b(str);
        this.b = str;
        this.a = new Logger("MediaControlChannel", null);
    }

    public final void a(long j, String str) {
        Object[] objArr = {str, null};
        boolean equals = Build.TYPE.equals("user");
        Logger logger = this.a;
        if (!equals && logger.b && Log.isLoggable(logger.a, 2)) {
            logger.c("Sending text message: %s to: %s", objArr);
        }
        zzas zzasVar = this.c;
        if (zzasVar == null) {
            logger.c("Attempt to send text message without a sink", new Object[0]);
        } else {
            zzasVar.a(this.b, j, str);
        }
    }

    public final long b() {
        zzas zzasVar = this.c;
        if (zzasVar != null) {
            return zzasVar.zzc();
        }
        this.a.c("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }
}
