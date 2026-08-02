package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.r;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzdge;
import com.google.android.gms.internal.ads.zzdmh;
import com.google.android.gms.internal.ads.zzebu;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzers;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzzr;
import com.ironsource.C4324ta;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class utn implements zzhcv, zzebu, zzbie, zzdmh, zzfpo {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public utn(uno unoVar) {
        this.a = 8;
        this.b = "googleads.g.doubleclick.net";
        this.c = "/pagead/ads";
        this.d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.e = unoVar;
    }

    public static Uri f(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new coo("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new coo("Query parameter already exists: ms");
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms=" + str + U3.j.c + uri3.substring(i2));
        } catch (UnsupportedOperationException unused2) {
            throw new coo("Provided Uri is not in a valid state");
        }
    }

    public static String g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        npn s = vpn.s();
        s.b();
        ((vpn) s.b).w(5);
        e8n v = g8n.v(0, bArr.length, bArr);
        s.b();
        ((vpn) s.b).t(v);
        return Base64.encodeToString(((vpn) s.c()).b(), 11);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public void a(zzbil.zzt.zza zzaVar) {
        zzbil.zza.zzb zzbVar = (zzbil.zza.zzb) ((zzbil.zzt) zzaVar.b).E().w();
        zzbil.zza.EnumC0134zza enumC0134zza = (zzbil.zza.EnumC0134zza) this.c;
        zzbVar.n();
        ((zzbil.zza) zzbVar.b).F(enumC0134zza);
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).M((zzbil.zza) zzbVar.o());
        zzbil.zzm.zza zzaVar2 = (zzbil.zzm.zza) ((zzbil.zzt) zzaVar.b).D().w();
        String str = (String) this.b;
        zzaVar2.n();
        ((zzbil.zzm) zzaVar2.b).F(str);
        zzbil.zzar zzarVar = (zzbil.zzar) this.d;
        zzaVar2.n();
        ((zzbil.zzm) zzaVar2.b).G(zzarVar);
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).L((zzbil.zzm) zzaVar2.o());
        String str2 = (String) this.e;
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).G(str2);
    }

    public synchronized void b(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put(C4324ta.b, null);
            hashMap.put("evt", motionEvent);
            Object obj = this.c;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, hashMap);
            ((en0) this.e).y(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new q0p(2005, e);
        }
    }

    public synchronized boolean c() {
        Object obj;
        try {
            obj = this.c;
        } catch (Exception e) {
            throw new q0p(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void d() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.c;
            obj.getClass().getDeclaredMethod(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, null).invoke(obj, null);
            ((en0) this.e).y(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new q0p(2003, e);
        }
    }

    public synchronized int e() {
        Object obj;
        try {
            obj = this.c;
        } catch (Exception e) {
            throw new q0p(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, null).invoke(obj, null)).intValue();
    }

    public synchronized byte[] h(HashMap hashMap) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.c;
        } catch (Exception e) {
            ((en0) this.e).z(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 0:
                String valueOf = String.valueOf((Uri) this.d);
                int i = zze.zza;
                zzo.zzi("Failed to parse gmsg params for: ".concat(valueOf));
                break;
            case 1:
            default:
                zzfqw zzfqwVar = (zzfqw) this.c;
                if (zzfqwVar != null) {
                    zzfqwVar.zzd(false);
                    zzfrg zzfrgVar = (zzfrg) this.b;
                    if (zzfrgVar != null) {
                        zzfrgVar.a(zzfqwVar);
                        zzfrgVar.h();
                        break;
                    } else {
                        zzfte zzfteVar = (zzfte) this.e;
                        zzfteVar.f.b(zzfqwVar.zzm());
                        break;
                    }
                }
                break;
            case 2:
                ((zzcub) this.e).e.submit(new g3g(this, th, (zzfte) this.c, (String) this.b, (zzv) this.d, 3, false));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        if (r1.equals("PRECISE") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[Catch: JSONException -> 0x00fb, TryCatch #0 {JSONException -> 0x00fb, blocks: (B:18:0x0047, B:28:0x0088, B:30:0x00a0, B:41:0x00d4, B:43:0x00e1, B:45:0x00e7, B:50:0x00f0), top: B:17:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzb(Object obj) {
        int i;
        int hashCode;
        zzt zztVar;
        switch (this.a) {
            case 0:
                ((zzclx) this.e).b0((Map) obj, (List) this.c, (String) this.b);
                break;
            case 1:
            default:
                zzfte zzfteVar = (zzfte) this.e;
                zzfqw zzfqwVar = (zzfqw) this.c;
                com.google.android.gms.ads.internal.util.client.zzt zztVar2 = (com.google.android.gms.ads.internal.util.client.zzt) obj;
                if (zzfqwVar != null) {
                    zzfqwVar.zzd(zztVar2 == com.google.android.gms.ads.internal.util.client.zzt.zza);
                    zzfrg zzfrgVar = (zzfrg) this.b;
                    if (zzfrgVar == null) {
                        zzfteVar.f.b(zzfqwVar.zzm());
                    } else {
                        zzfrgVar.a(zzfqwVar);
                        zzfrgVar.h();
                    }
                }
                zzdge zzdgeVar = (zzdge) this.d;
                if (zzdgeVar != null) {
                    String zzb = zzfteVar.d.zzb();
                    if (!TextUtils.isEmpty(zzb)) {
                        try {
                            JSONObject jSONObject = new JSONObject(zzb);
                            Parcelable.Creator<zzt> creator = zzt.CREATOR;
                            String optString = jSONObject.optString("type");
                            String optString2 = jSONObject.optString("precision");
                            String optString3 = jSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY);
                            long optLong = jSONObject.optLong(U3.i.X, 0L);
                            int hashCode2 = optString.hashCode();
                            int i2 = 3;
                            if (hashCode2 == 66934) {
                                if (optString.equals("CPC")) {
                                    i = 2;
                                    hashCode = optString2.hashCode();
                                    if (hashCode != -2131980260) {
                                    }
                                }
                                i = 0;
                                hashCode = optString2.hashCode();
                                if (hashCode != -2131980260) {
                                }
                            } else if (hashCode2 != 66944) {
                                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                                    optLong /= 1000;
                                    i = 3;
                                    hashCode = optString2.hashCode();
                                    if (hashCode != -2131980260) {
                                        if (optString2.equals("ESTIMATED")) {
                                            i2 = 1;
                                            zztVar = new zzt(i, i2, optString3, optLong);
                                            if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzdgeVar.d)) {
                                            }
                                        }
                                        i2 = 0;
                                        zztVar = new zzt(i, i2, optString3, optLong);
                                        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzdgeVar.d)) {
                                        }
                                    } else if (hashCode == 399232571) {
                                        break;
                                    } else {
                                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                            i2 = 2;
                                            zztVar = new zzt(i, i2, optString3, optLong);
                                            if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzdgeVar.d) && zzdgeVar.b.B0 && zzdgeVar.c.compareAndSet(false, true)) {
                                                zzdgeVar.p0(new ewm(zztVar, 14));
                                                break;
                                            }
                                        }
                                        i2 = 0;
                                        zztVar = new zzt(i, i2, optString3, optLong);
                                        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzdgeVar.d)) {
                                            zzdgeVar.p0(new ewm(zztVar, 14));
                                        }
                                    }
                                }
                                i = 0;
                                hashCode = optString2.hashCode();
                                if (hashCode != -2131980260) {
                                }
                            } else {
                                if (optString.equals("CPM")) {
                                    i = 1;
                                    hashCode = optString2.hashCode();
                                    if (hashCode != -2131980260) {
                                    }
                                }
                                i = 0;
                                hashCode = optString2.hashCode();
                                if (hashCode != -2131980260) {
                                }
                            }
                        } catch (JSONException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("UrlPinger.pingUrl", e);
                        }
                    }
                }
                break;
            case 2:
                ((zzcub) this.e).e.submit(new lv4((zzfte) this.c, (String) obj, (zzv) this.d, false, 24));
                break;
        }
    }

    public utn(r rVar, zzdcx zzdcxVar, Executor executor) {
        this.a = 6;
        this.c = rVar;
        this.b = zzdcxVar;
        this.d = executor;
    }

    public utn(zzzr zzzrVar, boolean[] zArr) {
        this.a = 10;
        this.c = zzzrVar;
        this.b = zArr;
        int i = zzzrVar.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }

    public /* synthetic */ utn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public utn(uun uunVar, dvn dvnVar, Long l, String str) {
        this.a = 1;
        this.d = uunVar;
        this.e = dvnVar;
        this.c = l;
        this.b = str;
    }

    public /* synthetic */ utn(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public utn(zzcub zzcubVar, zzfte zzfteVar, String str, zzv zzvVar) {
        this.a = 2;
        this.c = zzfteVar;
        this.b = str;
        this.d = zzvVar;
        Objects.requireNonNull(zzcubVar);
        this.e = zzcubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public /* synthetic */ void zza() {
        zzers zzersVar = (zzers) this.c;
        zzersVar.b.b((zzflo) this.b, (zzfld) this.d, (zzemt) this.e);
    }
}
