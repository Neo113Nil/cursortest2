package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzblm;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzbf extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ TaggingLibraryJsInterface b;

    public zzbf(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.a = str;
        this.b = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean booleanValue = ((Boolean) zzblm.c.c()).booleanValue();
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.b;
        String concat = booleanValue ? ",\"as\":".concat(taggingLibraryJsInterface.k.zzb().toString()) : "";
        Locale locale = Locale.getDefault();
        zzbkq zzbkqVar = zzblm.e;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.a, str, Long.valueOf(((Boolean) zzbkqVar.c()).booleanValue() ? ((Long) zzblm.h.c()).longValue() : 0L), concat);
        if (((Boolean) zzbkqVar.c()).booleanValue()) {
            try {
                taggingLibraryJsInterface.h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbf.this.b.b.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e);
            }
        } else {
            taggingLibraryJsInterface.b.evaluateJavascript(format, null);
        }
        if (((Boolean) zzblm.c.c()).booleanValue() && ((Boolean) zzblm.d.c()).booleanValue()) {
            taggingLibraryJsInterface.l.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        zzbkq zzbkqVar;
        final String format;
        String str = this.a;
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.b;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str);
            if (((Boolean) zzblm.c.c()).booleanValue()) {
                jSONObject.put("as", taggingLibraryJsInterface.k.zzb());
            }
            zzbkqVar = zzblm.e;
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbkqVar.c()).booleanValue() ? ((Long) zzblm.h.c()).longValue() : 0L);
            jSONObject.put("signal", query);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String concat = ((Boolean) zzblm.c.c()).booleanValue() ? ",\"as\":".concat(taggingLibraryJsInterface.k.zzb().toString()) : "";
            Locale locale = Locale.getDefault();
            String query2 = queryInfo.getQuery();
            zzbkqVar = zzblm.e;
            format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str, query2, Long.valueOf(((Boolean) zzbkqVar.c()).booleanValue() ? ((Long) zzblm.h.c()).longValue() : 0L), concat);
        }
        if (((Boolean) zzbkqVar.c()).booleanValue()) {
            try {
                taggingLibraryJsInterface.h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbf.this.b.b.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e);
            }
        } else {
            taggingLibraryJsInterface.b.evaluateJavascript(format, null);
        }
        if (((Boolean) zzblm.c.c()).booleanValue() && ((Boolean) zzblm.d.c()).booleanValue()) {
            taggingLibraryJsInterface.l.zzb();
        }
    }
}
