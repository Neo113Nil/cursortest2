package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i implements j {
    public final com.moloco.sdk.internal.services.x a;
    public h b;

    public i(com.moloco.sdk.internal.services.x xVar) {
        xVar.getClass();
        this.a = xVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        boolean z = !Intrinsics.c(this.b, d());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", com.appsflyer.internal.i.j("[CBT][BIS]: needsRefresh: ", z), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "BInfoSignalProvider";
    }

    public final h d() {
        com.moloco.sdk.internal.services.x xVar = this.a;
        try {
            xVar.getClass();
            Context context = xVar.a;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Integer valueOf = Integer.valueOf(registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1);
            Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Integer valueOf2 = Integer.valueOf(registerReceiver2 != null ? registerReceiver2.getIntExtra("status", 1) : 1);
            Object systemService = context.getSystemService("power");
            systemService.getClass();
            Boolean valueOf3 = Boolean.valueOf(((PowerManager) systemService).isPowerSaveMode());
            h hVar = new h(valueOf, valueOf2, valueOf3);
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: blev: " + valueOf + ", bst: " + valueOf2 + ", psm: " + valueOf3, false, 4, null);
            return hVar;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: Error", e, false, 8, null);
            return new h(null, null, null);
        }
    }
}
