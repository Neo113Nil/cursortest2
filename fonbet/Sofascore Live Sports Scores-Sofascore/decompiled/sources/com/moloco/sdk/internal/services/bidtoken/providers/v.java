package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Moloco;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v implements j {
    public boolean a;

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.a = Moloco.isInitialized();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        StringBuilder sb;
        boolean z = this.a;
        boolean isInitialized = Moloco.isInitialized();
        boolean z2 = z != isInitialized;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        if (z2) {
            sb = new StringBuilder("[CBT] sdkInitialized updated from ");
            sb.append(z);
            sb.append(" to ");
            sb.append(isInitialized);
        } else {
            sb = new StringBuilder("[CBT] sdkInitialized didn't change (before: ");
            sb.append(z);
            sb.append(", after: ");
            sb.append(isInitialized);
            sb.append(')');
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, "SDKInitStateSignalProvider", sb.toString(), false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "SDKInitStateSignalProvider";
    }
}
