package com.moloco.sdk.internal.services.bidtoken.providers;

import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n implements j {
    public final com.moloco.sdk.internal.services.s a;
    public final com.moloco.sdk.internal.services.g b;
    public m c;

    public n(com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.internal.services.g gVar) {
        sVar.getClass();
        gVar.getClass();
        this.a = sVar;
        this.b = gVar;
        this.c = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.c = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        m d = d();
        boolean z = !d.equals(this.c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP needsRefresh: " + z + ", with current: " + d + ", cached: " + this.c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "DSignalProvider";
    }

    public final m d() {
        com.moloco.sdk.internal.services.s sVar = this.a;
        try {
            int i = this.b.a.getResources().getConfiguration().orientation;
            com.moloco.sdk.internal.services.h hVar = i != 1 ? i != 2 ? com.moloco.sdk.internal.services.h.a : com.moloco.sdk.internal.services.h.c : com.moloco.sdk.internal.services.h.b;
            sVar.getClass();
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            Object systemService = sVar.a.getSystemService("input_method");
            systemService.getClass();
            InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
            return new m(hVar, language, currentInputMethodSubtype != null ? currentInputMethodSubtype.getLocale() : null);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP Error", e, false, 8, null);
            return new m(null, null, null);
        }
    }
}
