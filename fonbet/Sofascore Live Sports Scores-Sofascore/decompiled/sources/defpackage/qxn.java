package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnd;
import com.google.android.gms.internal.ads.zzcvp;
import com.google.android.gms.internal.ads.zzcvr;
import com.google.android.gms.internal.ads.zzcwk;
import com.google.android.gms.internal.ads.zzcxi;
import com.google.android.gms.internal.ads.zzcxx;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzcza;
import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdej;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzdoe;
import com.google.android.gms.internal.ads.zzdus;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzdwp;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzdxg;
import com.google.android.gms.internal.ads.zzdxj;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzefb;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzemj;
import com.google.android.gms.internal.ads.zzemq;
import com.google.android.gms.internal.ads.zzenb;
import com.google.android.gms.internal.ads.zzenq;
import com.google.android.gms.internal.ads.zzenu;
import com.google.android.gms.internal.ads.zzenz;
import com.google.android.gms.internal.ads.zzeom;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzerd;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfle;
import com.google.android.gms.internal.ads.zzfli;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxn implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qxn(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                zzcza zzczaVar = (zzcza) obj4;
                p03 p03Var = (p03) obj3;
                ddb ddbVar = (ddb) obj2;
                zzcyl zzcylVar = (zzcyl) obj;
                if (zzcylVar != null) {
                    p03Var.zzb(zzcylVar);
                }
                return zzhcy.g(ddbVar, ((Long) zzblv.a.c()).longValue(), TimeUnit.MILLISECONDS, zzczaVar.b);
            case 1:
                zzdus zzdusVar = (zzdus) obj4;
                zzclm a = zzdusVar.c.a(zzr.zzb(), null, null);
                zzcgn zzcgnVar = new zzcgn(a);
                zzdusVar.a(a, (zzb) obj3, (zzcef) obj2);
                a.zzP().h = new d1l(zzcgnVar, 15);
                a.loadUrl((String) zzba.zzc().a(zzbjg.O4));
                return zzcgnVar;
            case 2:
                String str = (String) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                zzclm zzclmVar = (zzclm) obj;
                zzbqz zzbqzVar = ((zzdvv) obj4).h;
                zzcgo zzcgoVar = new zzcgo();
                zzt.zzc();
                String uuid = UUID.randomUUID().toString();
                zzbqzVar.b(uuid, new won(zzbqzVar, zzcgoVar, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", uuid);
                    jSONObject2.put("args", jSONObject);
                    zzclmVar.h(str, jSONObject2);
                } catch (Exception e) {
                    zzcgoVar.zzd(e);
                }
                return zzcgoVar;
            case 3:
                zzenb zzenbVar = (zzenb) obj4;
                zzfld zzfldVar = (zzfld) obj3;
                zzflo zzfloVar = (zzflo) obj2;
                zzeae zzeaeVar = zzenbVar.i;
                inn innVar = zzbjg.V2;
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    x5n.q("rendering-webview-creation-start", zzeaeVar);
                }
                zzdxg zzdxgVar = zzenbVar.b;
                zzflw zzflwVar = zzenbVar.c;
                final zzclm a2 = zzdxgVar.a(zzflwVar.f, zzfldVar, zzfloVar.b.b);
                a2.S(zzfldVar.W);
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    x5n.q("rendering-webview-creation-end", zzeaeVar);
                }
                zzcgo zzcgoVar2 = new zzcgo();
                zzcvr zzcvrVar = zzenbVar.a;
                zzczb zzczbVar = new zzczb(zzfloVar, zzfldVar, null);
                VersionInfoParcel versionInfoParcel = zzenbVar.e;
                boolean z = zzenbVar.g;
                zzbqk zzbqkVar = zzenbVar.f;
                vun a3 = zzcvrVar.a(zzczbVar, new zzdnb(new u53(versionInfoParcel, zzcgoVar2, zzfldVar, a2, zzflwVar, z, zzbqkVar, zzenbVar.h, zzenbVar.j), a2), new zzcvp(zzfldVar.a0));
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    x5n.q("rendering-ad-component-creation-end", zzeaeVar);
                }
                final int i2 = 0;
                a3.f().a(a2, false, true != z ? null : zzbqkVar, zzeaeVar);
                zzcgoVar2.zzc(a3);
                a3.b().n0(new zzdej() { // from class: w4o
                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final /* synthetic */ void j() {
                        int i3 = i2;
                        zzclm zzclmVar2 = a2;
                        switch (i3) {
                            case 0:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 1:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 2:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            default:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                        }
                    }
                }, zzcgj.h);
                zzfli zzfliVar = zzfldVar.s;
                String str2 = zzfliVar.a;
                if (((Boolean) zzba.zzc().a(zzbjg.t6)).booleanValue() && ((zzemj) a3.i.zzb()).a()) {
                    str2 = zzcnd.a(str2, zzcnd.b(zzfldVar));
                }
                a3.f();
                return zzhcy.i(zzdxf.b(a2, zzfliVar.b, str2, zzeaeVar, ((xun) zzcvrVar).zzd()), new gyn(1, a2, zzfldVar, a3), zzenbVar.d);
            case 4:
                zzenq zzenqVar = (zzenq) obj4;
                zzflo zzfloVar2 = (zzflo) obj3;
                zzfld zzfldVar2 = (zzfld) obj2;
                Executor executor = zzenqVar.e;
                zzeae zzeaeVar2 = zzenqVar.g;
                inn innVar2 = zzbjg.V2;
                if (((Boolean) zzba.zzc().a(innVar2)).booleanValue()) {
                    x5n.q("rendering-webview-creation-start", zzeaeVar2);
                }
                Context context = zzenqVar.b;
                zzr a4 = zzfmc.a(context, zzfldVar2.u);
                final zzclm a5 = zzenqVar.c.a(a4, zzfldVar2, zzfloVar2.b.b);
                a5.S(zzfldVar2.W);
                View a6 = (((Boolean) zzba.zzc().a(zzbjg.f9)).booleanValue() && zzfldVar2.g0) ? zzcxx.a(context, a5.zzE(), zzfldVar2) : new zzdxj(context, a5.zzE(), (zzat) zzenqVar.f.apply(zzfldVar2));
                if (((Boolean) zzba.zzc().a(innVar2)).booleanValue()) {
                    x5n.q("rendering-webview-creation-end", zzeaeVar2);
                }
                zzcxi zzcxiVar = zzenqVar.a;
                yun d = zzcxiVar.d(new zzczb(zzfloVar2, zzfldVar2, null), new zzcwk(a6, a5, new ewm(a5, 20), a4.zzi ? new zzfle(-3, 0, true) : new zzfle(a4.zze, a4.zzb, false)));
                if (((Boolean) zzba.zzc().a(innVar2)).booleanValue()) {
                    x5n.q("rendering-ad-component-creation-end", zzeaeVar2);
                }
                d.f().a(a5, false, null, zzeaeVar2);
                zzdeh b = d.b();
                final int i3 = 1;
                zzdej zzdejVar = new zzdej() { // from class: w4o
                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final /* synthetic */ void j() {
                        int i32 = i3;
                        zzclm zzclmVar2 = a5;
                        switch (i32) {
                            case 0:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 1:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 2:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            default:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                        }
                    }
                };
                hsn hsnVar = zzcgj.h;
                b.n0(zzdejVar, hsnVar);
                zzfli zzfliVar2 = zzfldVar2.s;
                String str3 = zzfliVar2.a;
                if (((Boolean) zzba.zzc().a(zzbjg.t6)).booleanValue() && ((zzemj) d.l.zzb()).a()) {
                    str3 = zzcnd.a(str3, zzcnd.b(zzfldVar2));
                }
                d.f();
                zzcgo b2 = zzdxf.b(a5, zzfliVar2.b, str3, zzeaeVar2, zzcxiVar.c());
                if (zzfldVar2.M) {
                    b2.addListener(new cun(a5, 7), executor);
                }
                b2.addListener(new bnn(16, zzenqVar, a5), executor);
                return zzhcy.i(b2, new lrn(d, 2), hsnVar);
            case 5:
                return zzhcy.a(zzcxx.a(((zzenu) obj4).a, (View) obj3, (zzfld) obj2));
            case 6:
                return zzhcy.a(zzcxx.a(((zzenz) obj4).a, (View) obj3, (zzfld) obj2));
            case 7:
                zzeom zzeomVar = (zzeom) obj4;
                zzfld zzfldVar3 = (zzfld) obj3;
                zzflo zzfloVar3 = (zzflo) obj2;
                zzeae zzeaeVar3 = zzeomVar.j;
                inn innVar3 = zzbjg.V2;
                if (((Boolean) zzba.zzc().a(innVar3)).booleanValue()) {
                    x5n.q("rendering-webview-creation-start", zzeaeVar3);
                }
                zzdxg zzdxgVar2 = zzeomVar.b;
                zzflw zzflwVar2 = zzeomVar.d;
                final zzclm a7 = zzdxgVar2.a(zzflwVar2.f, zzfldVar3, zzfloVar3.b.b);
                a7.S(zzfldVar3.W);
                if (((Boolean) zzba.zzc().a(innVar3)).booleanValue()) {
                    x5n.q("rendering-webview-creation-end", zzeaeVar3);
                }
                zzcgo zzcgoVar3 = new zzcgo();
                zzdoe zzdoeVar = zzeomVar.c;
                zzczb zzczbVar2 = new zzczb(zzfloVar3, zzfldVar3, null);
                Context context2 = zzeomVar.a;
                VersionInfoParcel versionInfoParcel2 = zzeomVar.f;
                boolean z2 = zzeomVar.h;
                zzbqk zzbqkVar2 = zzeomVar.g;
                evn d2 = zzdoeVar.d(zzczbVar2, new zzdnb(new d55(context2, versionInfoParcel2, zzcgoVar3, zzfldVar3, a7, zzflwVar2, z2, zzbqkVar2, zzeomVar.i, zzeomVar.k), a7));
                zzcgoVar3.zzc(d2);
                if (((Boolean) zzba.zzc().a(innVar3)).booleanValue()) {
                    x5n.q("rendering-ad-component-creation-end", zzeaeVar3);
                }
                final int i4 = 2;
                d2.b().n0(new zzdej() { // from class: w4o
                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final /* synthetic */ void j() {
                        int i32 = i4;
                        zzclm zzclmVar2 = a7;
                        switch (i32) {
                            case 0:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 1:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 2:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            default:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                        }
                    }
                }, zzcgj.h);
                zzfli zzfliVar3 = zzfldVar3.s;
                String str4 = zzfliVar3.a;
                if (((Boolean) zzba.zzc().a(zzbjg.t6)).booleanValue() && ((zzemj) d2.h.zzb()).a()) {
                    str4 = zzcnd.a(str4, zzcnd.b(zzfldVar3));
                }
                d2.f().a(a7, true, true != z2 ? null : zzbqkVar2, zzeaeVar3);
                d2.f();
                return zzhcy.i(zzdxf.b(a7, zzfliVar3.b, str4, zzeaeVar3, zzdoeVar.c()), new gyn(2, a7, zzfldVar3, d2), zzeomVar.e);
            case 8:
                zzepc zzepcVar = (zzepc) obj4;
                zzflo zzfloVar4 = (zzflo) obj3;
                zzfld zzfldVar4 = (zzfld) obj2;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return zzhcy.b(new zzefb(3));
                }
                int i5 = zzfloVar4.a.a.l;
                if (i5 <= 1) {
                    return zzhcy.i(zzepcVar.c(zzfloVar4, zzfldVar4, jSONArray.getJSONObject(0)), ahn.k, zzepcVar.b);
                }
                int length = jSONArray.length();
                if (((Boolean) zzba.zzc().a(zzbjg.W2)).booleanValue()) {
                    zzepcVar.f.b("nsl", String.valueOf(length));
                }
                zzepcVar.d.a(Math.min(length, i5));
                ArrayList arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    if (i6 < length) {
                        arrayList.add(zzepcVar.c(zzfloVar4, zzfldVar4, jSONArray.getJSONObject(i6)));
                    } else {
                        arrayList.add(zzhcy.b(new zzefb(3)));
                    }
                }
                return zzhcy.a(arrayList);
            default:
                zzerd zzerdVar = (zzerd) obj4;
                zzfld zzfldVar5 = (zzfld) obj3;
                zzflo zzfloVar5 = (zzflo) obj2;
                zzeae zzeaeVar4 = zzerdVar.j;
                inn innVar4 = zzbjg.V2;
                if (((Boolean) zzba.zzc().a(innVar4)).booleanValue()) {
                    x5n.q("rendering-webview-creation-start", zzeaeVar4);
                }
                zzdxg zzdxgVar3 = zzerdVar.b;
                zzflw zzflwVar3 = zzerdVar.d;
                final zzclm a8 = zzdxgVar3.a(zzflwVar3.f, zzfldVar5, zzfloVar5.b.b);
                a8.S(zzfldVar5.W);
                if (((Boolean) zzba.zzc().a(innVar4)).booleanValue()) {
                    x5n.q("rendering-webview-creation-end", zzeaeVar4);
                }
                zzcgo zzcgoVar4 = new zzcgo();
                zzdwp zzdwpVar = zzerdVar.c;
                zzczb zzczbVar3 = new zzczb(zzfloVar5, zzfldVar5, null);
                Context context3 = zzerdVar.a;
                VersionInfoParcel versionInfoParcel3 = zzerdVar.f;
                zzbqk zzbqkVar3 = zzerdVar.g;
                boolean z3 = zzerdVar.h;
                zzelp zzelpVar = zzerdVar.i;
                zzeae zzeaeVar5 = zzerdVar.j;
                hvn a9 = zzdwpVar.a(zzczbVar3, new zzdwm(new tdc(context3, zzdxgVar3, zzflwVar3, versionInfoParcel3, zzfldVar5, zzcgoVar4, a8, zzbqkVar3, z3, zzelpVar, zzeaeVar5, zzerdVar.k), a8));
                zzcgoVar4.zzc(a9);
                if (((Boolean) zzba.zzc().a(innVar4)).booleanValue()) {
                    x5n.q("rendering-ad-component-creation-end", zzeaeVar5);
                }
                a8.T("/reward", new zzbrb(a9.f()));
                final int i7 = 3;
                a9.b().n0(new zzdej() { // from class: w4o
                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final /* synthetic */ void j() {
                        int i32 = i7;
                        zzclm zzclmVar2 = a8;
                        switch (i32) {
                            case 0:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 1:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            case 2:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                            default:
                                if (zzclmVar2.zzP() != null) {
                                    zzclmVar2.zzP().q0();
                                    break;
                                }
                                break;
                        }
                    }
                }, zzcgj.h);
                a9.g().a(a8, true, true != z3 ? null : zzbqkVar3, zzeaeVar5);
                zzfli zzfliVar4 = zzfldVar5.s;
                String str5 = zzfliVar4.a;
                if (((Boolean) zzba.zzc().a(zzbjg.t6)).booleanValue() && ((zzemj) a9.h.zzb()).a()) {
                    str5 = zzcnd.a(str5, zzcnd.b(zzfldVar5));
                }
                a9.g();
                return zzhcy.i(zzdxf.b(a8, zzfliVar4.b, str5, zzeaeVar5, ((o) zzdwpVar).zzd()), new gyn(3, a8, zzfldVar5, a9), zzerdVar.e);
        }
    }

    public /* synthetic */ qxn(zzemq zzemqVar, zzfld zzfldVar, zzflo zzfloVar, zzdxk zzdxkVar, int i) {
        this.a = i;
        this.b = zzemqVar;
        this.c = zzfldVar;
        this.d = zzfloVar;
    }
}
