package com.google.android.gms.internal.gtm;

import g.C6594f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import spay.sdk.api.ErrorCode;

/* loaded from: classes9.dex */
public final class zzpy {
    private final String zza = "https://www.google-analytics.com";

    private static final String zzb(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            String valueOf = String.valueOf(str);
            zzhl.zza(valueOf.length() != 0 ? "Cannot encode the string: ".concat(valueOf) : new String("Cannot encode the string: "));
            return "";
        }
    }

    public final String zza(zzpe zzpeVar) {
        String sb2;
        String str = this.zza;
        if (zzpeVar.zzg()) {
            sb2 = zzpeVar.zza();
        } else {
            String trim = !zzpeVar.zze().trim().equals("") ? zzpeVar.zze().trim() : ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            StringBuilder sb3 = new StringBuilder();
            if (zzpeVar.zzf() != null) {
                sb3.append(zzpeVar.zzf());
            } else {
                sb3.append("id");
            }
            sb3.append("=");
            sb3.append(zzb(zzpeVar.zzb()));
            sb3.append("&pv=");
            sb3.append(zzb(trim));
            sb3.append("&rv=5.0");
            if (zzpeVar.zzg()) {
                sb3.append("&gtm_debug=x");
            }
            sb2 = sb3.toString();
        }
        return C6594f.a(str, "/gtm/android?", sb2, new StringBuilder(str.length() + 13 + String.valueOf(sb2).length()));
    }
}
