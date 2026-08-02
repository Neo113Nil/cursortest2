package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdvj;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzevt;
import com.google.android.gms.internal.ads.zzewv;
import com.google.android.gms.internal.ads.zzeww;
import com.google.android.gms.internal.ads.zzfer;
import com.google.android.gms.internal.ads.zzfes;
import com.google.android.gms.internal.ads.zzffx;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzghf;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzhah;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class lrn implements zzgub {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lrn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object apply(Object obj) {
        SharedPreferences sharedPreferences;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zzcbr zzcbrVar = (zzcbr) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                inn innVar = zzbjg.a;
                zzba.zza();
                Context context = zzcbrVar.b;
                SharedPreferences a = zzbiz.a(context);
                if (a != null) {
                    SharedPreferences.Editor edit = a.edit();
                    Objects.requireNonNull(zzba.zzb());
                    Iterator it = zzba.zzb().a.iterator();
                    while (it.hasNext()) {
                        zzbix zzbixVar = (zzbix) it.next();
                        if (zzbixVar.a == 1) {
                            zzbixVar.b(edit, zzbixVar.c(jSONObject));
                        }
                    }
                    if (jSONObject != null) {
                        edit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        zzo.zzf("Flag Json is null.");
                    }
                    if (((Boolean) zzblh.o.c()).booleanValue() || ((Boolean) zzblh.p.c()).booleanValue()) {
                        zzba.zza();
                        edit.apply();
                    } else {
                        zzba.zza();
                        edit.commit();
                    }
                    if (((Boolean) zzblh.e.c()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                        zzba.zza();
                        try {
                            sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                        } catch (IllegalStateException e) {
                            zzo.zzj("", e);
                            sharedPreferences = null;
                        }
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            zzba.zzb();
                            JSONObject jSONObject2 = new JSONObject();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (next.startsWith("adapter:")) {
                                    try {
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            edit2.putString("flag_configuration", jSONObject2.toString());
                            edit2.apply();
                        }
                    }
                    SharedPreferences sharedPreferences2 = zzcbrVar.c;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("js_last_update", zzt.zzk().a()).apply();
                    }
                }
                return null;
            case 1:
                zzdvv zzdvvVar = (zzdvv) obj2;
                zzclm zzclmVar = (zzclm) obj;
                zzclmVar.T("/result", zzdvvVar.h);
                zzclx zzP = zzclmVar.zzP();
                zzb zzbVar = new zzb(zzdvvVar.c, null, null);
                zzdcg zzdcgVar = zzdvvVar.m;
                zzele zzeleVar = zzdvvVar.i;
                zzfte zzfteVar = zzdvvVar.j;
                zzeaj zzeajVar = zzdvvVar.d;
                zzdvj zzdvjVar = zzdvvVar.a;
                zzP.L(null, zzdvjVar, zzdvjVar, zzdvjVar, zzdvjVar, false, null, zzbVar, null, null, zzeleVar, zzfteVar, zzeajVar, null, null, null, null, null, null, null, null, null, zzdcgVar);
                return zzclmVar;
            case 2:
                return ((zzcwe) obj2).d();
            case 3:
                return ((zzevt) obj2).a();
            case 4:
                ((zzewv) obj2).a.d("AppSetIdInfoSignal", (Exception) obj);
                return new zzeww(null, -1);
            case 5:
                ((zzfer) obj2).a.d("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new zzfes(null, -1);
            case 6:
                ((zzffx) obj2).a.d("TrustlessTokenSignal", (Exception) obj);
                return new zzffy(null);
            case 7:
                zzfnu zzfnuVar = (zzfnu) obj2;
                zzfnuVar.c = (zzcyl) obj;
                return zzfnuVar;
            case 8:
                return (zzggu) obj2;
            case 9:
                zzggu zzgguVar = (zzggu) obj;
                ((zzghf) obj2).f.set(zzgguVar);
                return zzgguVar;
            case 10:
                return new Boolean(((zzgpx) obj2).b((zzggt) obj));
            case 11:
                zzggr zzggrVar = (zzggr) obj;
                zzgrh zzgrhVar = ((meo) obj2).d;
                int K = zzggrVar.K() - 1;
                if (K == 1 || K == 2) {
                    return zzggrVar;
                }
                if (K == 3) {
                    int K2 = zzggrVar.K() - 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(K2).length());
                    sb.append(K2);
                    zzgrhVar.c(1004, sb.toString());
                    int K3 = zzggrVar.K() - 1;
                    throw new ieo(me4.g(K3, "r: ", new StringBuilder(String.valueOf(K3).length() + 3)));
                }
                if (K != 12) {
                    int K4 = zzggrVar.K() - 1;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(K4).length());
                    sb2.append(K4);
                    zzgrhVar.c(1005, sb2.toString());
                    int K5 = zzggrVar.K() - 1;
                    throw new heo(me4.g(K5, "r: ", new StringBuilder(String.valueOf(K5).length() + 3)));
                }
                int K6 = zzggrVar.K() - 1;
                StringBuilder sb3 = new StringBuilder(String.valueOf(K6).length());
                sb3.append(K6);
                zzgrhVar.c(1005, sb3.toString());
                int K7 = zzggrVar.K() - 1;
                throw new geo(me4.g(K7, "r: ", new StringBuilder(String.valueOf(K7).length() + 3)));
            case 12:
                gfo gfoVar = (gfo) obj2;
                zzggt zzggtVar = (zzggt) obj;
                if (zzggtVar == null || zzggtVar.equals(zzggt.J())) {
                    return null;
                }
                return new zzfzr(zzggtVar.D(), ((zzgfw) gfoVar.e.zzb()).a, gfoVar.c.a, gfoVar.g);
            default:
                sfo sfoVar = (sfo) obj2;
                String str = (String) obj;
                if (!b0a.U(str)) {
                    return str;
                }
                File file = new File(sfoVar.a.getPackageResourcePath());
                if (!file.exists() || !file.canRead()) {
                    return "";
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[16384];
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                        for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                            messageDigest.update(bArr, 0, read);
                        }
                        zzhah j = zzhah.c.j();
                        byte[] digest = messageDigest.digest();
                        String f = j.f(digest.length, digest);
                        fileInputStream.close();
                        return f;
                    } finally {
                    }
                } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused2) {
                    return "";
                }
        }
    }
}
