package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfwy implements zzfww {
    public final zzfwz a;

    public zzfwy(zzfwz zzfwzVar) {
        this.a = zzfwzVar;
    }

    public final JSONObject a(View view) {
        JSONObject a = zzfxg.a(0, 0, 0, 0);
        UiModeManager uiModeManager = zzfxf.a;
        zzfvs zzfvsVar = zzfvs.CTV;
        zzfvs zzfvsVar2 = zzfvs.OTHER;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                zzfvsVar2 = zzfvs.MOBILE;
            } else if (currentModeType == 4) {
                zzfvsVar2 = zzfvsVar;
            }
        }
        int i = zzfvsVar2 != zzfvsVar ? 2 : zzfxj.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            a.put("noOutputDevice", i2 == 0);
        } catch (JSONException unused) {
        }
        return a;
    }
}
