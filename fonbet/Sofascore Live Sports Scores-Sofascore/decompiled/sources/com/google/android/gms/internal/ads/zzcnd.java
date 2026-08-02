package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcnd {
    public static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    public static final Pattern b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(zzfld zzfldVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue() && zzfldVar.T) {
            zzflz zzflzVar = zzfldVar.V;
            zzflzVar.getClass();
            if (zzflzVar.a.optBoolean((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v6), true) && zzfldVar.b != 4) {
                zzemh zzemhVar = zzflzVar.a() == 1 ? zzemh.VIDEO : zzemh.HTML_DISPLAY;
                String str = zzfldVar.l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", zzemhVar.a);
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("Unable to build OMID ENV JSON", e);
                }
            }
        }
        return null;
    }
}
