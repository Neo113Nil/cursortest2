package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejn implements zzfpi {
    public static final Pattern e = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String a;
    public final zzfqw b;
    public final zzfrg c;
    public final zzcny d;

    public zzejn(String str, zzfrg zzfrgVar, zzfqw zzfqwVar, zzcny zzcnyVar) {
        this.a = str;
        this.c = zzfrgVar;
        this.b = zzfqwVar;
        this.d = zzcnyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    @Override // com.google.android.gms.internal.ads.zzfpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj) {
        zzefb zzefbVar;
        String str;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        String str2;
        String str3;
        zzejm zzejmVar = (zzejm) obj;
        int optInt = zzejmVar.a.optInt("http_timeout_millis", 60000);
        zzcbx zzcbxVar = zzejmVar.b;
        int i = zzcbxVar.g;
        String str4 = zzcbxVar.m;
        String str5 = zzcbxVar.c;
        zzfqw zzfqwVar = this.b;
        zzfrg zzfrgVar = this.c;
        int i2 = 1;
        String str6 = "";
        if (i != -2) {
            if (i == 1) {
                List list = zzcbxVar.a;
                if (list != null) {
                    str6 = TextUtils.join(", ", list);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzf(str6);
                }
                zzefbVar = new zzefb(2, "Error building request URL: ".concat(String.valueOf(str6)));
            } else {
                zzefbVar = new zzefb(1);
            }
            zzfqwVar.a(zzefbVar);
            zzfqwVar.zzd(false);
            zzfrgVar.a(zzfqwVar);
            throw zzefbVar;
        }
        HashMap hashMap = new HashMap();
        if (zzcbxVar.e) {
            String str7 = this.a;
            if (!TextUtils.isEmpty(str7)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F1)).booleanValue()) {
                    if (TextUtils.isEmpty(str7)) {
                        str2 = "";
                    } else {
                        Matcher matcher = e.matcher(str7);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(i2);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                str3 = str4;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        str2 = str2.concat("; ");
                                    }
                                    str2 = str2.concat(group);
                                }
                            } else {
                                str3 = str4;
                            }
                            str4 = str3;
                            i2 = 1;
                        }
                    }
                    str = str4;
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("Cookie", str2);
                    }
                } else {
                    str = str4;
                    hashMap.put("Cookie", str7);
                }
                if (zzcbxVar.d && (jSONObject = zzejmVar.a) != null) {
                    optJSONObject = jSONObject.optJSONObject("pii");
                    if (optJSONObject == null) {
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
                byte[] bArr = null;
                if (((Boolean) zzbks.a.c()).booleanValue()) {
                    zzcny zzcnyVar = this.d;
                    zzcnyVar.a();
                    zzims zzimsVar = zzcnyVar.c;
                    String encodeToString = zzimsVar != null ? Base64.encodeToString(zzimsVar.d(), 10) : null;
                    if (!TextUtils.isEmpty(encodeToString)) {
                        hashMap.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pa), encodeToString);
                    }
                }
                byte[] bArr2 = new byte[0];
                if (!TextUtils.isEmpty(str5)) {
                    byte[] bytes = str5.getBytes(StandardCharsets.UTF_8);
                    if (zzcbxVar.l) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                gZIPOutputStream.write(bytes);
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                bArr = byteArray;
                            } finally {
                            }
                        } catch (IOException e2) {
                            com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e2);
                            com.google.android.gms.ads.internal.zzt.zzh().d("PrepareRequestFunction.apply", e2);
                        }
                        if (bArr != null) {
                            hashMap.put("Content-Encoding", "gzip");
                            bArr2 = bArr;
                        }
                    }
                    bArr2 = bytes;
                }
                String str8 = TextUtils.isEmpty(str) ? str : "";
                zzfqwVar.zzd(true);
                zzfrgVar.a(zzfqwVar);
                return new zzeji(zzcbxVar.f, optInt, hashMap, bArr2, str8);
            }
        }
        str = str4;
        if (zzcbxVar.d) {
            optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject == null) {
            }
        }
        byte[] bArr3 = null;
        if (((Boolean) zzbks.a.c()).booleanValue()) {
        }
        byte[] bArr22 = new byte[0];
        if (!TextUtils.isEmpty(str5)) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        zzfqwVar.zzd(true);
        zzfrgVar.a(zzfqwVar);
        return new zzeji(zzcbxVar.f, optInt, hashMap, bArr22, str8);
    }
}
