package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements j {
    public final com.moloco.sdk.internal.services.l a;
    public a b;

    public b(com.moloco.sdk.internal.services.l lVar) {
        lVar.getClass();
        this.a = lVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        a d = d();
        boolean z = !d.equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z + ", with current: " + d + ", cached: " + this.b, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AcSignalProvider";
    }

    public final a d() {
        boolean z;
        com.moloco.sdk.internal.services.l lVar = this.a;
        try {
            lVar.getClass();
            boolean z2 = false;
            try {
                Object systemService = lVar.a.getSystemService("captioning");
                systemService.getClass();
                z = ((CaptioningManager) systemService).isEnabled();
            } catch (Exception unused) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            Context context = lVar.a;
            Object systemService2 = context.getSystemService("accessibility");
            systemService2.getClass();
            Boolean valueOf2 = Boolean.valueOf(((AccessibilityManager) systemService2).isEnabled() && Settings.Secure.getInt(context.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1);
            try {
                if (Settings.Secure.getInt(lVar.a.getContentResolver(), "reduce_bright_colors_activated") == 1) {
                    z2 = true;
                }
            } catch (Settings.SettingNotFoundException | SecurityException unused2) {
            }
            Boolean valueOf3 = Boolean.valueOf(z2);
            Context context2 = lVar.a;
            Object systemService3 = context2.getSystemService("accessibility");
            systemService3.getClass();
            return new a(valueOf, valueOf2, valueOf3, Float.valueOf(((AccessibilityManager) systemService3).isEnabled() ? context2.getResources().getConfiguration().fontScale : 1.0f));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] ACS Error", e, false, 8, null);
            return new a(null, null, null, null);
        }
    }
}
