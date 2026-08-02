package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import defpackage.ase;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqj {
    public static final zzqj c;
    public final String a;
    public final ase b;

    static {
        new zzqj("");
        c = new zzqj("preload");
    }

    public zzqj(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new ase(1) : null;
    }

    public final synchronized void a(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        ase aseVar = this.b;
        if (aseVar == null) {
            throw null;
        }
        LogSessionId logSessionId3 = aseVar.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        zzguk.f(logSessionId3.equals(logSessionId2));
        aseVar.a = logSessionId;
    }
}
