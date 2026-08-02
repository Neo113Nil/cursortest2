package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzbyy {
    public final zzclm a;
    public final String b;

    public zzbyy(zzclm zzclmVar, String str) {
        this.a = zzclmVar;
        this.b = str;
    }

    public final void b(String str) {
        try {
            JSONObject put = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", this.b);
            zzclm zzclmVar = this.a;
            if (zzclmVar != null) {
                zzclmVar.t("onError", put);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        try {
            this.a.t("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void d(String str) {
        try {
            this.a.t("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void e(int i, int i2, int i3, int i4, int i5, float f) {
        try {
            this.a.t("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while obtaining screen information.", e);
        }
    }
}
