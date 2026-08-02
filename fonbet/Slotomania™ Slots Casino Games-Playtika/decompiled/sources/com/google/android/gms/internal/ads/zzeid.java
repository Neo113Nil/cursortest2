package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeid implements zzfny {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfpi zzb;
    private final zzfps zzc;

    public zzeid(String str, zzfps zzfpsVar, zzfpi zzfpiVar) {
        this.zza = str;
        this.zzc = zzfpsVar;
        this.zzb = zzfpiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    @Override // com.google.android.gms.internal.ads.zzfny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzedr zzedrVar;
        String str;
        byte[] bArr;
        JSONObject zza;
        String str2;
        zzeic zzeicVar = (zzeic) obj;
        int optInt = zzeicVar.zza().optInt("http_timeout_millis", 60000);
        zzcat zzb = zzeicVar.zzb();
        if (zzb.zza() != -2) {
            if (zzb.zza() == 1) {
                if (zzb.zzb() != null) {
                    str = TextUtils.join(", ", zzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(str);
                } else {
                    str = "";
                }
                String.valueOf(str);
                zzedrVar = new zzedr(2, "Error building request URL: ".concat(String.valueOf(str)));
            } else {
                zzedrVar = new zzedr(1);
            }
            zzfps zzfpsVar = this.zzc;
            zzfpi zzfpiVar = this.zzb;
            zzfpiVar.zzj(zzedrVar);
            zzfpiVar.zzd(false);
            zzfpsVar.zza(zzfpiVar);
            throw zzedrVar;
        }
        HashMap hashMap = new HashMap();
        if (zzeicVar.zzb().zzg()) {
            String str3 = this.zza;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbA)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = zzd.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str2)) {
                                    str2 = str2.concat("; ");
                                }
                                str2 = str2.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("Cookie", str2);
                    }
                } else {
                    hashMap.put("Cookie", str3);
                }
            }
        }
        if (zzeicVar.zzb().zzf() && (zza = zzeicVar.zza()) != null) {
            JSONObject optJSONObject = zza.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(zzeicVar.zzb().zzd())) {
            byte[] bytes = zzeicVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzeicVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PrepareRequestFunction.apply");
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    hashMap.put(HttpHeaders.CONTENT_ENCODING, "gzip");
                }
            }
            bArr = bytes;
            String zzl = TextUtils.isEmpty(zzeicVar.zzb().zzl()) ? zzeicVar.zzb().zzl() : "";
            zzfps zzfpsVar2 = this.zzc;
            zzfpi zzfpiVar2 = this.zzb;
            zzfpiVar2.zzd(true);
            zzfpsVar2.zza(zzfpiVar2);
            return new zzehy(zzeicVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzeicVar.zzb().zzf());
        }
        bArr = bArr2;
        if (TextUtils.isEmpty(zzeicVar.zzb().zzl())) {
        }
        zzfps zzfpsVar22 = this.zzc;
        zzfpi zzfpiVar22 = this.zzb;
        zzfpiVar22.zzd(true);
        zzfpsVar22.zza(zzfpiVar22);
        return new zzehy(zzeicVar.zzb().zze(), optInt, hashMap, bArr, zzl, zzeicVar.zzb().zzf());
    }
}
