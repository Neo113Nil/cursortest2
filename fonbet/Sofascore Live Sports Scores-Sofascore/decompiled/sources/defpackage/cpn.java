package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzefb;
import com.google.android.gms.internal.ads.zzegi;
import com.google.android.gms.internal.ads.zzegq;
import com.google.android.gms.internal.ads.zzehm;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzfbu;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfed;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfeo;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfod;
import com.google.android.gms.internal.ads.zzfof;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzijq;
import com.google.android.gms.internal.ads.zzikz;
import com.google.android.gms.internal.ads.zzila;
import com.google.android.gms.internal.ads.zzilp;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cpn implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public cpn(ddo ddoVar) {
        this.a = 14;
        Objects.requireNonNull(ddoVar);
        this.b = ddoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        int length;
        zzikz zzikzVar;
        ilo i;
        zzfnu zzfnuVar;
        zzfof zzfofVar;
        int i2 = 0;
        int i3 = 2;
        switch (this.a) {
            case 0:
                zzbsa zzbsaVar = (zzbsa) obj;
                zzcgo zzcgoVar = new zzcgo();
                bpn bpnVar = new bpn(this, zzcgoVar);
                zzbru zzbruVar = (zzbru) this.b;
                Parcel J = zzbsaVar.J();
                zzbew.c(J, zzbruVar);
                zzbew.e(J, bpnVar);
                zzbsaVar.l2(J, 2);
                return zzcgoVar;
            case 1:
                zzcea zzceaVar = (zzcea) this.b;
                Map map = (Map) obj;
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                Object obj2 = zzceaVar.h;
                                synchronized (obj2) {
                                    try {
                                        length = optJSONArray.length();
                                        synchronized (obj2) {
                                            zzikzVar = (zzikz) zzceaVar.b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (zzikzVar == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    zzcee.a(sb.toString());
                                } else {
                                    for (int i4 = 0; i4 < length; i4++) {
                                        String string = optJSONArray.getJSONObject(i4).getString("threat_type");
                                        zzikzVar.n();
                                        ((zzila) zzikzVar.b).J(string);
                                    }
                                    zzceaVar.f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        if (((Boolean) zzblp.a.c()).booleanValue()) {
                            int i5 = zze.zza;
                            zzo.zze("Failed to get SafeBrowsing metadata", e);
                        }
                        return zzhcy.b(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (zzceaVar.f) {
                    synchronized (zzceaVar.h) {
                        zzijq zzijqVar = zzceaVar.a;
                        zzijqVar.n();
                        ((zzilp) zzijqVar.b).R(10);
                    }
                }
                boolean z = zzceaVar.f;
                if (!(z && zzceaVar.g.g) && (!(zzceaVar.k && zzceaVar.g.f) && (z || !zzceaVar.g.d))) {
                    return xlo.b;
                }
                synchronized (zzceaVar.h) {
                    try {
                        for (zzikz zzikzVar2 : zzceaVar.b.values()) {
                            zzijq zzijqVar2 = zzceaVar.a;
                            zzila zzilaVar = (zzila) zzikzVar2.o();
                            zzijqVar2.n();
                            ((zzilp) zzijqVar2.b).K(zzilaVar);
                        }
                        zzijq zzijqVar3 = zzceaVar.a;
                        ArrayList arrayList = zzceaVar.c;
                        zzijqVar3.n();
                        ((zzilp) zzijqVar3.b).P(arrayList);
                        ArrayList arrayList2 = zzceaVar.d;
                        zzijqVar3.n();
                        ((zzilp) zzijqVar3.b).Q(arrayList2);
                        if (((Boolean) zzblp.a.c()).booleanValue()) {
                            String D = ((zzilp) zzijqVar3.b).D();
                            String F = ((zzilp) zzijqVar3.b).F();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(D).length() + 38 + String.valueOf(F).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(D);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(F);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (zzila zzilaVar2 : Collections.unmodifiableList(((zzilp) zzijqVar3.b).E())) {
                                sb3.append("    [");
                                sb3.append(zzilaVar2.E());
                                sb3.append("] ");
                                sb3.append(zzilaVar2.D());
                            }
                            zzcee.a(sb3.toString());
                        }
                        ddb zzb = new zzbl(zzceaVar.e).zzb(1, zzceaVar.g.b, null, ((zzilp) zzijqVar3.o()).d());
                        if (((Boolean) zzblp.a.c()).booleanValue()) {
                            zzb.addListener(gl5.c, zzcgj.a);
                        }
                        i = zzhcy.i(zzb, ahn.d, zzcgj.h);
                    } finally {
                    }
                }
                return i;
            case 2:
                String str2 = (String) zzba.zzc().a(zzbjg.Qb);
                Uri.Builder builder = (Uri.Builder) this.b;
                builder.appendQueryParameter(str2, "12");
                return zzhcy.a(builder.toString());
            case 3:
                ((p03) this.b).zza((Throwable) obj);
                return xlo.b;
            case 4:
                return ((zzehm) this.b).e((zzcbv) obj);
            case 5:
                zzehq zzehqVar = (zzehq) obj;
                return zzhcy.a(new zzflo(new zzfll(((zzegi) this.b).c), zzfln.a(new InputStreamReader(zzehqVar.a), zzehqVar.b.m)));
            case 6:
                zzegq zzegqVar = (zzegq) this.b;
                return zzhcy.a(new zzflo(new zzfll(zzegqVar.d), zzfln.a(new StringReader(((JSONObject) obj).toString()), zzegqVar.o)));
            case 7:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzhcy.a(jSONObject);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            case 8:
                zzfbu zzfbuVar = (zzfbu) this.b;
                Throwable th = (Throwable) obj;
                if (((Boolean) zzba.zzc().a(zzbjg.h3)).booleanValue()) {
                    zzfdi zzfdiVar = zzfbuVar.a;
                    zzcfv zzh = zzt.zzh();
                    int zzb2 = zzfdiVar.zzb();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzb2).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(zzb2);
                    zzh.d(sb4.toString(), th);
                }
                return xlo.b;
            case 9:
                Throwable th2 = (Throwable) obj;
                String str5 = "";
                ((zzfec) this.b).c.submit(new x3o(th2, 7));
                return zzhcy.a(th2 instanceof SecurityException ? new zzfed(str5, i3) : th2 instanceof IllegalStateException ? new zzfed(str5, 3) : th2 instanceof IllegalArgumentException ? new zzfed(str5, 4) : th2 instanceof TimeoutException ? new zzfed(str5, 5) : new zzfed(str5, i2));
            case 10:
                return zzhcy.a(new zzfeo(((zzfen) this.b).b));
            case 11:
                zzfib zzfibVar = (zzfib) this.b;
                zzfod zzfodVar = (zzfod) obj;
                if (zzfodVar == null || (zzfnuVar = zzfodVar.a) == null || (zzfofVar = zzfodVar.b) == null) {
                    throw new zzefb(1, "Empty prefetch");
                }
                zzbil.zzb.zzc F2 = zzbil.zzb.F();
                zzbil.zzb.zza.C0136zza H = zzbil.zzb.zza.H();
                H.n();
                ((zzbil.zzb.zza) H.b).E();
                zzbil.zzb.zze F3 = zzbil.zzb.zze.F();
                H.n();
                ((zzbil.zzb.zza) H.b).F(F3);
                F2.n();
                ((zzbil.zzb) F2.b).E((zzbil.zzb.zza) H.o());
                zzfnuVar.a.zza().f.h((zzbil.zzb) F2.o());
                return zzfibVar.b(zzfnuVar, ((h8o) zzfofVar).b);
            case 12:
                zzfon zzfonVar = (zzfon) this.b;
                Exception exc = (Exception) obj;
                synchronized (zzfonVar) {
                    zzfonVar.d = true;
                    throw exc;
                }
            case 13:
                return zzhcy.a(((zzfpi) this.b).zza(obj));
            case 14:
                zzggu zzgguVar = (zzggu) obj;
                if (zzgguVar != null) {
                    return zzhcy.a(zzgguVar);
                }
                ddo ddoVar = (ddo) this.b;
                ddoVar.e.b(51);
                return zzhcy.h(zzhcq.r(zzhcy.c(ddoVar.d, new ado(ddoVar, ddoVar.f))), yvn.n, slo.a);
            case 15:
                return ((qeo) this.b).b.zze();
            default:
                return ((zeo) this.b).c.zzb();
        }
    }

    public /* synthetic */ cpn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public cpn(zzbsg zzbsgVar, zzbru zzbruVar) {
        this.a = 0;
        this.b = zzbruVar;
    }

    public /* synthetic */ cpn(zzfon zzfonVar, ohn ohnVar) {
        this.a = 12;
        this.b = zzfonVar;
    }
}
