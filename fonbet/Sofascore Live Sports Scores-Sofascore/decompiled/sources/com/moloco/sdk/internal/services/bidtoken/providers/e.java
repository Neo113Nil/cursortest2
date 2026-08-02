package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements j {
    public final Context a;
    public d b = new d(d());

    public e(Context context) {
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = new d(d());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        Long d = d();
        boolean z = !new d(d).equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI needsRefresh: " + z + ", with adi: " + d, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "ADISignalProvider";
    }

    public final Long d() {
        try {
            return Long.valueOf(this.a.getFilesDir().getTotalSpace());
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ADISignalProvider", "ADI Error", e, false, 8, null);
            return null;
        }
    }
}
