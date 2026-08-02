package com.moloco.sdk.internal.services.bidtoken.providers;

import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.d0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements j {
    public final com.moloco.sdk.internal.services.w a;
    public f b;

    public g(com.moloco.sdk.internal.services.w wVar) {
        wVar.getClass();
        this.a = wVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        f d = d();
        boolean z = !d.equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z + ", with current: " + d + ", cached: " + this.b, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AudSignalProvider";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:3:0x0003, B:5:0x0009, B:12:0x0039, B:13:0x003b, B:15:0x003f, B:16:0x0046, B:21:0x002f, B:23:0x0036, B:24:0x0022, B:26:0x0029, B:27:0x0016, B:29:0x001c), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f d() {
        d0 d0Var;
        com.moloco.sdk.internal.services.w wVar = this.a;
        try {
            AudioManager audioManager = wVar.a;
            Integer valueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                d0Var = d0.a;
                AudioManager audioManager2 = wVar.a;
                return new f(d0Var, Integer.valueOf(audioManager2 == null ? audioManager2.getStreamVolume(3) : 0));
            }
            if (valueOf.intValue() == 1) {
                d0Var = d0.b;
                AudioManager audioManager22 = wVar.a;
                return new f(d0Var, Integer.valueOf(audioManager22 == null ? audioManager22.getStreamVolume(3) : 0));
            }
            if (valueOf != null && valueOf.intValue() == 2) {
                d0Var = d0.c;
                AudioManager audioManager222 = wVar.a;
                return new f(d0Var, Integer.valueOf(audioManager222 == null ? audioManager222.getStreamVolume(3) : 0));
            }
            d0Var = d0.c;
            AudioManager audioManager2222 = wVar.a;
            return new f(d0Var, Integer.valueOf(audioManager2222 == null ? audioManager2222.getStreamVolume(3) : 0));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] AS Error", e, false, 8, null);
            return new f(null, null);
        }
    }
}
