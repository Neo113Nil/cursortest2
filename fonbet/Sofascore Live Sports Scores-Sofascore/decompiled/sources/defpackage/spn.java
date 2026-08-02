package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.r;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzczp;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzdus;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzegq;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzeib;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfih;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmv;
import com.google.android.gms.internal.ads.zzfns;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzgeb;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zziol;
import com.mbridge.msdk.foundation.entity.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class spn implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ spn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r1.c.d++;
     */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ddb zza(Object obj) {
        zzeqf zzeqfVar;
        zzfnu zzfnuVar = null;
        int i = 0;
        switch (this.a) {
            case 0:
                zzbun zzbunVar = (zzbun) obj;
                zzbunVar.c0((String) this.b, (zzbqh) this.c);
                return zzhcy.a(zzbunVar);
            case 1:
                zzbvm zzbvmVar = (zzbvm) this.b;
                Object obj2 = this.c;
                zzcgo zzcgoVar = new zzcgo();
                zzt.zzc();
                String uuid = UUID.randomUUID().toString();
                zzbqg.j.b(uuid, new won(zzbvmVar, zzcgoVar, 1));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", uuid);
                jSONObject.put("args", (JSONObject) obj2);
                ((zzbun) obj).h("google.afma.activeView.handleUpdate", jSONObject);
                return zzcgoVar;
            case 2:
                zzcub zzcubVar = (zzcub) this.b;
                Uri.Builder builder = (Uri.Builder) this.c;
                zzcubVar.e.submit(new bnn(8, zzcubVar, (Throwable) obj));
                builder.appendQueryParameter((String) zzba.zzc().a(zzbjg.Qb), "9");
                return zzhcy.a(builder.toString());
            case 3:
                zzczp zzczpVar = (zzczp) this.b;
                zzcbv zzcbvVar = (zzcbv) obj;
                zzcbvVar.i = (zzfns) this.c;
                zzeib zzeibVar = zzczpVar.h;
                return zzeibVar.a(zzcbvVar, new fjn(zzeibVar.b, 12), new mxn(zzeibVar, 6), new r3o(zzcbvVar, 2));
            case 4:
                zzdus zzdusVar = (zzdus) this.b;
                JSONObject jSONObject2 = (JSONObject) this.c;
                zzclm zzclmVar = (zzclm) obj;
                zzbst zzbstVar = zzdusVar.a.b;
                zzcgn zzcgnVar = new zzcgn(zzclmVar);
                if (zzbstVar != null) {
                    zzclmVar.J(new zzcnw(5, 0, 0));
                } else {
                    zzclmVar.J(new zzcnw(4, 0, 0));
                }
                zzclmVar.zzP().g = new ejg(27, zzdusVar, zzclmVar, zzcgnVar);
                zzclmVar.h("google.afma.nativeAds.renderVideo", jSONObject2);
                return zzcgnVar;
            case 5:
                zzegq zzegqVar = (zzegq) this.b;
                zzbve zzbveVar = (zzbve) this.c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                    x5n.q("scar-preloader-processing-done", zzegqVar.i);
                }
                return zzbveVar.a(jSONObject3);
            case 6:
                zzegq zzegqVar2 = (zzegq) this.b;
                List list = (List) this.c;
                Exception exc = (Exception) obj;
                zzt.zzh().e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    zzeqfVar = new zzeqf(1, "Timed out waiting for ad response.");
                } else if (exc instanceof zzeqf) {
                    zzeqfVar = (zzeqf) exc;
                } else {
                    zzeqfVar = new zzeqf(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = zzeqfVar.getMessage() == null ? "" : zzeqfVar.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List c = zzguz.a(new sgo(':')).c(message);
                            if (c.size() == 2) {
                                message = (String) c.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzfta.c(zzfta.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
                    }
                    zzegqVar2.j.a(arrayList, null);
                }
                return zzhcy.b(zzeqfVar);
            case 7:
                return ((zzeho) ((zziol) this.b).zzb()).e((zzcbv) this.c);
            case 8:
                return ((zzfek) this.b).a().a(((zzcbv) this.c).m, zzay.zza().zzo((Bundle) obj));
            case 9:
                return ((zzfdl) this.b).a(((zzcbv) this.c).m, zzay.zza().zzo((Bundle) obj));
            case 10:
                zzepc zzepcVar = (zzepc) this.b;
                zzdvv zzdvvVar = (zzdvv) this.c;
                JSONObject jSONObject4 = (JSONObject) obj;
                zzfmv zzfmvVar = zzepcVar.d;
                xlo a = zzhcy.a(zzdvvVar);
                synchronized (zzfmvVar) {
                    zzfmvVar.a.addFirst(a);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new zzbup("process json failed");
                }
                if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                    x5n.q("rendering-native-ads-preprocess-end", zzepcVar.f);
                }
                return zzhcy.a(jSONObject4.getJSONObject("json").getJSONArray(b.JSON_KEY_ADS));
            case 11:
                zzepc zzepcVar2 = (zzepc) this.b;
                zzfld zzfldVar = (zzfld) this.c;
                zzdvv zzdvvVar2 = (zzdvv) obj;
                if (((Boolean) zzba.zzc().a(zzbjg.U2)).booleanValue()) {
                    x5n.q("rendering-native-ads-preprocess-start", zzepcVar2.f);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) zzba.zzc().a(zzbjg.ba)).booleanValue() && PlatformVersion.a()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("response", zzfldVar.s.c);
                jSONObject6.put("sdk_params", jSONObject5);
                return zzhcy.h(zzdvvVar2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new spn(10, zzepcVar2, zzdvvVar2), zzepcVar2.b);
            case 12:
                zzflo zzfloVar = (zzflo) obj;
                ((zzfnu) this.b).b = zzfloVar;
                Iterator it2 = zzfloVar.b.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((zzfld) it2.next()).a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i = 1;
                            }
                        }
                    } else if (i != 0) {
                        return ((zzczp) this.c).c(zzhcy.a(zzfloVar));
                    }
                }
                return xlo.b;
            case 13:
                zzfih zzfihVar = (zzfih) this.b;
                zzdcx zzdcxVar = (zzdcx) this.c;
                zzfio zzfioVar = (zzfio) obj;
                r rVar = zzfihVar.a;
                zzfnv zzfnvVar = zzfioVar.b;
                zzcbv zzcbvVar2 = zzfioVar.a;
                synchronized (rVar) {
                    try {
                        c9o c9oVar = (c9o) rVar.a.get(zzfnvVar);
                        if (c9oVar != null) {
                            g9o g9oVar = c9oVar.d;
                            g9oVar.c = zzt.zzk().a();
                            g9oVar.d++;
                            c9oVar.a();
                            LinkedList linkedList = c9oVar.a;
                            if (!linkedList.isEmpty() && (zzfnuVar = (zzfnu) linkedList.remove()) != null) {
                                g9oVar.e++;
                                g9oVar.b.a = true;
                                break;
                            }
                            zzfoi zzfoiVar = c9oVar.d.b;
                            zzfoi clone = zzfoiVar.clone();
                            zzfoiVar.a = false;
                            zzfoiVar.b = 0;
                            if (zzfnuVar != null) {
                                zzbil.zzb.zzc F = zzbil.zzb.F();
                                zzbil.zzb.zza.C0136zza H = zzbil.zzb.zza.H();
                                H.n();
                                ((zzbil.zzb.zza) H.b).E();
                                zzbil.zzb.zze.zza E = zzbil.zzb.zze.E();
                                boolean z = clone.a;
                                E.n();
                                ((zzbil.zzb.zze) E.b).H(z);
                                int i2 = clone.b;
                                E.n();
                                ((zzbil.zzb.zze) E.b).D(i2);
                                H.n();
                                ((zzbil.zzb.zza) H.b).F((zzbil.zzb.zze) E.o());
                                F.n();
                                ((zzbil.zzb) F.b).E((zzbil.zzb.zza) H.o());
                                zzfnuVar.a.zza().f.t((zzbil.zzb) F.o());
                            }
                            rVar.b();
                        } else {
                            rVar.c.c++;
                            rVar.b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zzfnuVar != null && zzcbvVar2 != null) {
                    zzczp zza = zzdcxVar.zza();
                    zzeib zzeibVar2 = zza.h;
                    zzfpp d = zza.c.a(zzeibVar2.a(zzcbvVar2, new b1l(zzeibVar2, 17), new d1l(zzeibVar2, 18), yvn.f), zzfqc.NOTIFY_CACHE_HIT).d();
                    d.addListener(new vlo(i, d, new d1l(zza, 11)), zza.j);
                    d.addListener(new vlo(i, d, zzfihVar.c), zzfihVar.b);
                }
                return zzhcy.a(new zzfig(zzfnvVar, zzcbvVar2, zzfnuVar));
            default:
                return ((zzggu) ((zzgeb) this.b).b.f.get()).c((Context) this.c);
        }
    }
}
