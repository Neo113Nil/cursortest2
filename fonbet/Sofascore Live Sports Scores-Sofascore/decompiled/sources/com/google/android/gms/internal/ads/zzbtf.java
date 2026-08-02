package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fc6;
import defpackage.mz1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzbtf extends zzbtq, zzbte {
    @Override // com.google.android.gms.internal.ads.zzbtq
    default void c(String str, String str2) {
        zza(fc6.o(new StringBuilder(mz1.d(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    default void h(String str, JSONObject jSONObject) {
        c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    default void n(String str, Map map) {
        try {
            t(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    default void t(String str, JSONObject jSONObject) {
        StringBuilder s = mz1.s("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String sb = s.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Dispatching AFMA event: ".concat(sb));
        zza(s.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    void zza(String str);
}
