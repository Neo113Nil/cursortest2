package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.ewm;
import defpackage.hsn;
import defpackage.inn;
import defpackage.sgo;
import defpackage.x5n;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzczp {
    public final zzegq a;
    public final zzflw b;
    public final zzfqi c;
    public final zzcsj d;
    public final zzeqi e;
    public final zzdje f;
    public zzflo g;
    public final zzeib h;
    public final zzdcu i;
    public final hsn j;
    public final zzehm k;
    public final zzemv l;

    public zzczp(zzegq zzegqVar, zzflw zzflwVar, zzfqi zzfqiVar, zzcsj zzcsjVar, zzeqi zzeqiVar, zzdje zzdjeVar, zzflo zzfloVar, zzeib zzeibVar, zzdcu zzdcuVar, hsn hsnVar, zzehm zzehmVar, zzemv zzemvVar) {
        this.a = zzegqVar;
        this.b = zzflwVar;
        this.c = zzfqiVar;
        this.d = zzcsjVar;
        this.e = zzeqiVar;
        this.f = zzdjeVar;
        this.g = zzfloVar;
        this.h = zzeibVar;
        this.i = zzdcuVar;
        this.j = hsnVar;
        this.k = zzehmVar;
        this.l = zzemvVar;
    }

    public final zzfpp a(ddb ddbVar) {
        if (this.g != null) {
            zzfqi zzfqiVar = this.c;
            zzfqc zzfqcVar = zzfqc.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfqiVar);
            return new zzfpz(zzfqiVar, zzfqcVar, null, zzfqa.d, Collections.EMPTY_LIST, zzhcy.a(this.g)).d();
        }
        zzbhn zzj = com.google.android.gms.ads.internal.zzt.zzj();
        zzj.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p5)).booleanValue()) {
            synchronized (zzj.c) {
                try {
                    zzj.d();
                    ScheduledFuture scheduledFuture = zzj.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    zzj.a = zzcgj.d.schedule(zzj.b, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q5)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.c.a(ddbVar, zzfqc.SERVER_TRANSACTION).b(new cpn(this.k, 4)).d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x024a, code lost:
    
        if (r9.zze(r6, r0, r5) == false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0211 A[Catch: all -> 0x00fb, TryCatch #6 {all -> 0x00fb, blocks: (B:35:0x0098, B:37:0x00b5, B:40:0x00bd, B:42:0x00ca, B:44:0x00e4, B:45:0x0114, B:47:0x011f, B:49:0x0127, B:50:0x012d, B:54:0x0136, B:57:0x016e, B:60:0x014a, B:63:0x0159, B:65:0x0173, B:68:0x00fe, B:70:0x0187, B:74:0x01a6, B:78:0x01ae, B:80:0x01d0, B:82:0x01e6, B:84:0x0207, B:85:0x021c, B:88:0x0230, B:90:0x0236, B:91:0x0243, B:93:0x0246, B:95:0x024f, B:99:0x024c, B:100:0x0211, B:101:0x01f8, B:104:0x01bc, B:107:0x0195, B:108:0x019a), top: B:34:0x0098, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207 A[Catch: all -> 0x00fb, TryCatch #6 {all -> 0x00fb, blocks: (B:35:0x0098, B:37:0x00b5, B:40:0x00bd, B:42:0x00ca, B:44:0x00e4, B:45:0x0114, B:47:0x011f, B:49:0x0127, B:50:0x012d, B:54:0x0136, B:57:0x016e, B:60:0x014a, B:63:0x0159, B:65:0x0173, B:68:0x00fe, B:70:0x0187, B:74:0x01a6, B:78:0x01ae, B:80:0x01d0, B:82:0x01e6, B:84:0x0207, B:85:0x021c, B:88:0x0230, B:90:0x0236, B:91:0x0243, B:93:0x0246, B:95:0x024f, B:99:0x024c, B:100:0x0211, B:101:0x01f8, B:104:0x01bc, B:107:0x0195, B:108:0x019a), top: B:34:0x0098, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0236 A[Catch: all -> 0x00fb, TryCatch #6 {all -> 0x00fb, blocks: (B:35:0x0098, B:37:0x00b5, B:40:0x00bd, B:42:0x00ca, B:44:0x00e4, B:45:0x0114, B:47:0x011f, B:49:0x0127, B:50:0x012d, B:54:0x0136, B:57:0x016e, B:60:0x014a, B:63:0x0159, B:65:0x0173, B:68:0x00fe, B:70:0x0187, B:74:0x01a6, B:78:0x01ae, B:80:0x01d0, B:82:0x01e6, B:84:0x0207, B:85:0x021c, B:88:0x0230, B:90:0x0236, B:91:0x0243, B:93:0x0246, B:95:0x024f, B:99:0x024c, B:100:0x0211, B:101:0x01f8, B:104:0x01bc, B:107:0x0195, B:108:0x019a), top: B:34:0x0098, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246 A[Catch: all -> 0x00fb, TryCatch #6 {all -> 0x00fb, blocks: (B:35:0x0098, B:37:0x00b5, B:40:0x00bd, B:42:0x00ca, B:44:0x00e4, B:45:0x0114, B:47:0x011f, B:49:0x0127, B:50:0x012d, B:54:0x0136, B:57:0x016e, B:60:0x014a, B:63:0x0159, B:65:0x0173, B:68:0x00fe, B:70:0x0187, B:74:0x01a6, B:78:0x01ae, B:80:0x01d0, B:82:0x01e6, B:84:0x0207, B:85:0x021c, B:88:0x0230, B:90:0x0236, B:91:0x0243, B:93:0x0246, B:95:0x024f, B:99:0x024c, B:100:0x0211, B:101:0x01f8, B:104:0x01bc, B:107:0x0195, B:108:0x019a), top: B:34:0x0098, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfpp b() {
        zzhbr b;
        String str;
        int i;
        String str2;
        String str3;
        String string;
        zzflw zzflwVar = this.b;
        if (!zzflwVar.v) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfqi zzfqiVar = this.c;
                zzfqc zzfqcVar = zzfqc.PRELOADED_LOADER;
                Objects.requireNonNull(zzfqiVar);
                zzegq zzegqVar = this.a;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                    zzegqVar.o = zzegqVar.d.t;
                    x5n.q("scar-preloader-ready", zzegqVar.i);
                }
                String str4 = zzegqVar.d.d.zzx;
                if (!TextUtils.isEmpty(str4)) {
                    String str5 = "";
                    try {
                        str5 = new JSONObject(str4).optString("request_id", "");
                    } catch (JSONException unused) {
                    }
                    inn innVar = zzbjg.e8;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && str5.isEmpty()) {
                        int lastIndexOf = str4.lastIndexOf("&request_id=");
                        str5 = lastIndexOf != -1 ? str4.substring(lastIndexOf + 12) : "";
                    }
                    String str6 = str5;
                    if (TextUtils.isEmpty(str6)) {
                        b = zzhcy.b(new zzeqf(15, "Invalid ad string."));
                    } else {
                        synchronized (zzegqVar.l) {
                            try {
                                com.google.android.gms.ads.nonagon.signalgeneration.zzq o = zzegqVar.a.o();
                                zzeae zzeaeVar = zzegqVar.i;
                                String zzb = o.zzb(str6, zzeaeVar);
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && !TextUtils.isEmpty(zzb)) {
                                    try {
                                        JSONObject optJSONObject = new JSONObject(zzb).optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                                        if (optJSONObject != null) {
                                            if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g8)).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.h8)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) : Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f8)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(optJSONObject.optString("query_info_type", "")))) {
                                                int lastIndexOf2 = str4.lastIndexOf(U3.j.c);
                                                String substring = lastIndexOf2 != -1 ? str4.substring(0, lastIndexOf2) : null;
                                                if (!TextUtils.isEmpty(substring)) {
                                                    try {
                                                        byte[] decode = Base64.decode(substring, 11);
                                                        byte[] bytes = str6.getBytes(StandardCharsets.UTF_8);
                                                        if (!TextUtils.isEmpty(zzb)) {
                                                            try {
                                                                string = new JSONObject(zzb).getString("arek");
                                                            } catch (JSONException e) {
                                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                                com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.getKeyFromQueryJsonMap", e);
                                                            }
                                                            str4 = zzfmm.a(decode, bytes, string, zzeaeVar);
                                                        }
                                                        string = null;
                                                        str4 = zzfmm.a(decode, bytes, string, zzeaeVar);
                                                    } catch (IllegalArgumentException e2) {
                                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                                        com.google.android.gms.ads.internal.zzt.zzh().d("PreloadedLoader.decryptAdResponseIfNecessary", e2);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused2) {
                                    }
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    str = "";
                                } else {
                                    try {
                                        str = new JSONObject(str4).optString("render_id", "");
                                    } catch (JSONException unused3) {
                                        str = "";
                                    }
                                }
                                String str7 = str;
                                if (!TextUtils.isEmpty(str7)) {
                                    String str8 = "";
                                    try {
                                        str8 = new String(Base64.decode(str7, 0), StandardCharsets.UTF_8);
                                    } catch (IllegalArgumentException e3) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str7)));
                                        com.google.android.gms.ads.internal.zzt.zzh().d("PreloadedLoader.decodeRenderId", e3);
                                    }
                                    List c = zzguz.a(new sgo(':')).c(str8);
                                    if (c.size() == 2) {
                                        str2 = (String) c.get(0);
                                        i = Integer.parseInt((String) c.get(1));
                                        Pair pair = str2 == null ? new Pair(str2, Integer.valueOf(i)) : new Pair("", 0);
                                        str3 = (String) pair.first;
                                        int intValue = ((Integer) pair.second).intValue();
                                        if (!TextUtils.isEmpty(str3) && intValue > 0) {
                                            if (!o.zzd(str6, str3)) {
                                                b = zzhcy.b(new zzeqf(10, "The ad has already been shown."));
                                            }
                                        }
                                        o.zzc(str6);
                                        if (!TextUtils.isEmpty(zzb)) {
                                            b = zzegqVar.a(str4, zzegqVar.c(zzb));
                                        }
                                    } else {
                                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str7)));
                                    }
                                }
                                i = 0;
                                str2 = null;
                                if (str2 == null) {
                                }
                                str3 = (String) pair.first;
                                int intValue2 = ((Integer) pair.second).intValue();
                                if (!TextUtils.isEmpty(str3)) {
                                    if (!o.zzd(str6, str3)) {
                                    }
                                }
                                o.zzc(str6);
                                if (!TextUtils.isEmpty(zzb)) {
                                }
                            } finally {
                            }
                        }
                    }
                    return new zzfpz(zzfqiVar, zzfqcVar, null, zzfqa.d, Collections.EMPTY_LIST, b).d();
                }
                com.google.android.gms.ads.internal.client.zzc zzcVar = zzegqVar.d.d.zzs;
                if (zzcVar != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W7)).booleanValue()) {
                        String str9 = zzcVar.zza;
                        String str10 = zzcVar.zzb;
                        String str11 = "";
                        try {
                            str11 = new JSONObject(str9).optString("request_id", "");
                        } catch (JSONException unused4) {
                        }
                        String str12 = "";
                        try {
                            str12 = new JSONObject(str10).optString("request_id", "");
                        } catch (JSONException unused5) {
                        }
                        if (TextUtils.isEmpty(str12) || !str11.equals(str12)) {
                            zzegqVar.i.a.put("ridmm", "true");
                        } else {
                            zzegqVar.a.o().zzc(str11);
                            zzegqVar.i.a.put("request_id", str11);
                        }
                    }
                    b = zzegqVar.a(zzcVar.zza, zzegqVar.c(zzcVar.zzb));
                    return new zzfpz(zzfqiVar, zzfqcVar, null, zzfqa.d, Collections.EMPTY_LIST, b).d();
                }
                b = zzhcy.b(new zzeqf(14, "Mismatch request IDs."));
                return new zzfpz(zzfqiVar, zzfqcVar, null, zzfqa.d, Collections.EMPTY_LIST, b).d();
            }
        }
        return a(this.i.b());
    }

    public final zzfpp c(ddb ddbVar) {
        zzfpz b = this.c.a(ddbVar, zzfqc.RENDERER).a(new ewm(this, 12)).b(this.e);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I6)).booleanValue()) {
            b = b.c(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J6)).intValue());
        }
        return b.d();
    }
}
