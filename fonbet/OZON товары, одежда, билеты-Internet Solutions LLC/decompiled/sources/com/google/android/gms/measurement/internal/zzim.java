package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznw;

/* loaded from: classes9.dex */
final class zzim implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzio zze;

    zzim(zzio zzioVar, boolean z11, Uri uri, String str, String str2) {
        this.zze = zzioVar;
        this.zza = z11;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x008e, code lost:
    
        if (r6.contains("srsltid") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0091, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012d A[Catch: RuntimeException -> 0x0083, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0083, blocks: (B:3:0x0013, B:9:0x00bf, B:11:0x00ee, B:14:0x00fb, B:16:0x0101, B:17:0x0116, B:18:0x0125, B:23:0x012d, B:27:0x0155, B:28:0x0173, B:30:0x0162, B:31:0x017b, B:33:0x0181, B:35:0x0187, B:37:0x018d, B:39:0x0195, B:41:0x019d, B:43:0x01a5, B:45:0x01ab, B:48:0x01b2, B:51:0x0058, B:53:0x005e, B:55:0x0064, B:57:0x006a, B:60:0x0072, B:62:0x007a, B:66:0x0088, B:71:0x00a6, B:73:0x00b6, B:74:0x0095), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bf A[Catch: RuntimeException -> 0x0083, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0083, blocks: (B:3:0x0013, B:9:0x00bf, B:11:0x00ee, B:14:0x00fb, B:16:0x0101, B:17:0x0116, B:18:0x0125, B:23:0x012d, B:27:0x0155, B:28:0x0173, B:30:0x0162, B:31:0x017b, B:33:0x0181, B:35:0x0187, B:37:0x018d, B:39:0x0195, B:41:0x019d, B:43:0x01a5, B:45:0x01ab, B:48:0x01b2, B:51:0x0058, B:53:0x005e, B:55:0x0064, B:57:0x006a, B:60:0x0072, B:62:0x007a, B:66:0x0088, B:71:0x00a6, B:73:0x00b6, B:74:0x0095), top: B:2:0x0013 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        Bundle zzs;
        CharSequence charSequence;
        zzio zzioVar = this.zze;
        boolean z11 = this.zza;
        Uri uri = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzd;
        zzioVar.zza.zzg();
        try {
            zzlt zzv = zzioVar.zza.zzs.zzv();
            zznw.zzc();
            zzag zzf = zzioVar.zza.zzs.zzf();
            zzem zzemVar = zzen.zzav;
            boolean zzs2 = zzf.zzs(null, zzemVar);
            zznw.zzc();
            zzag zzf2 = zzioVar.zza.zzs.zzf();
            zzem zzemVar2 = zzen.zzaw;
            boolean zzs3 = zzf2.zzs(null, zzemVar2);
            if (!TextUtils.isEmpty(str3)) {
                if (str3.contains("gclid") || str3.contains("utm_campaign") || str3.contains("utm_source") || str3.contains("utm_medium") || (zzs2 && (str3.contains("utm_id") || str3.contains("dclid")))) {
                    boolean z12 = zzs3;
                    str = "Activity created with data 'referrer' without required params";
                    zzs = zzv.zzs(Uri.parse("https://google.com/search?".concat(str3)), zzs2, z12);
                    if (zzs != null) {
                        zzs.putString("_cis", "referrer");
                    }
                    if (z11) {
                        charSequence = "utm_medium";
                    } else {
                        zzlt zzv2 = zzioVar.zza.zzs.zzv();
                        zznw.zzc();
                        charSequence = "utm_medium";
                        boolean zzs4 = zzioVar.zza.zzs.zzf().zzs(null, zzemVar);
                        zznw.zzc();
                        Bundle zzs5 = zzv2.zzs(uri, zzs4, zzioVar.zza.zzs.zzf().zzs(null, zzemVar2));
                        if (zzs5 != null) {
                            zzs5.putString("_cis", "intent");
                            if (!zzs5.containsKey("gclid") && zzs != null && zzs.containsKey("gclid")) {
                                zzs5.putString("_cer", "gclid=" + zzs.getString("gclid"));
                            }
                            zzioVar.zza.zzH(str2, "_cmp", zzs5);
                            zzioVar.zza.zzb.zza(str2, zzs5);
                        }
                    }
                    if (TextUtils.isEmpty(str3)) {
                        zzioVar.zza.zzs.zzay().zzc().zzb("Activity created with referrer", str3);
                        if (zzioVar.zza.zzs.zzf().zzs(null, zzen.zzZ)) {
                            if (zzs != null) {
                                zzioVar.zza.zzH(str2, "_cmp", zzs);
                                zzioVar.zza.zzb.zza(str2, zzs);
                            } else {
                                zzioVar.zza.zzs.zzay().zzc().zzb("Referrer does not contain valid parameters", str3);
                            }
                            zzioVar.zza.zzY("auto", "_ldl", null, true);
                            return;
                        }
                        if (!str3.contains("gclid") || (!str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains(charSequence) && !str3.contains("utm_term") && !str3.contains("utm_content"))) {
                            zzioVar.zza.zzs.zzay().zzc().zza(str);
                            return;
                        } else {
                            if (TextUtils.isEmpty(str3)) {
                                return;
                            }
                            zzioVar.zza.zzY("auto", "_ldl", str3, true);
                            return;
                        }
                    }
                    return;
                }
                zzv.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
            }
            str = "Activity created with data 'referrer' without required params";
            zzs = null;
            if (z11) {
            }
            if (TextUtils.isEmpty(str3)) {
            }
        } catch (RuntimeException e11) {
            zzioVar.zza.zzs.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e11);
        }
    }
}
