package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import defpackage.inn;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbpa implements zzbqh {
    public static final Pattern a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    public static final Pattern b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        String str = (String) map.get("action");
        boolean equals = "tick".equals(str);
        Pattern pattern = a;
        if (!equals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get(U3.i.X);
                if (TextUtils.isEmpty(str2)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q2)).booleanValue() || b.matcher(str2).matches()) {
                    zzclmVar.zzq().b.c("e", str2);
                    return;
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzd("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get(U3.i.X);
                if (TextUtils.isEmpty(str4)) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q2)).booleanValue() || pattern.matcher(str3).matches()) {
                    zzclmVar.zzq().b.c(str3, str4);
                    return;
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzd("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("No label given for CSI tick.");
            return;
        }
        inn innVar = zzbjg.Q2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && !pattern.matcher(str5).matches()) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("No timestamp given for CSI tick.");
            return;
        }
        try {
            long parseLong = (Long.parseLong(str7) - com.google.android.gms.ads.internal.zzt.zzk().a()) + com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            zzbjt zzq = zzclmVar.zzq();
            HashMap hashMap = zzq.a;
            zzbjs zzbjsVar = (zzbjs) hashMap.get(str6);
            String[] strArr = {str5};
            if (zzbjsVar != null) {
                zzq.b.a(zzbjsVar, parseLong, strArr);
            }
            hashMap.put(str5, new zzbjs(parseLong, null, null));
        } catch (NumberFormatException e) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Malformed timestamp for CSI tick.", e);
        }
    }
}
