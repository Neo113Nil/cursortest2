package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzdus;
import com.google.android.gms.internal.ads.zzdvy;
import com.google.android.gms.internal.ads.zzebm;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzhcg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0o implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ zzfld c;
    public final /* synthetic */ zzflg d;
    public final /* synthetic */ zzb e;
    public final /* synthetic */ zzcef f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;

    public /* synthetic */ t0o(Object obj, zzr zzrVar, zzfld zzfldVar, zzflg zzflgVar, zzb zzbVar, zzcef zzcefVar, String str, String str2, int i) {
        this.a = i;
        this.i = obj;
        this.b = zzrVar;
        this.c = zzfldVar;
        this.d = zzflgVar;
        this.e = zzbVar;
        this.f = zzcefVar;
        this.g = str;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        zzebm zzebmVar;
        switch (this.a) {
            case 0:
                zzdua zzduaVar = (zzdua) this.i;
                zzr zzrVar = this.b;
                zzfld zzfldVar = this.c;
                zzflg zzflgVar = this.d;
                zzb zzbVar = this.e;
                zzcef zzcefVar = this.f;
                String str = this.g;
                String str2 = this.h;
                zzclm a = zzduaVar.j.a(zzrVar, zzfldVar, zzflgVar);
                zzcgn zzcgnVar = new zzcgn(a);
                zzdvy zzdvyVar = zzduaVar.l.a;
                zzclx zzP = a.zzP();
                inn innVar = zzbjg.yf;
                zzP.L(zzdvyVar, zzdvyVar, zzdvyVar, zzdvyVar, zzdvyVar, false, null, !((Boolean) zzba.zzc().a(innVar)).booleanValue() ? new zzb(zzduaVar.a, null, null) : zzbVar, null, true != ((Boolean) zzba.zzc().a(innVar)).booleanValue() ? null : zzcefVar, zzduaVar.o, zzduaVar.n, zzduaVar.m, null, zzdvyVar, null, null, null, null, null, null, null, zzduaVar.t);
                a.T("/getNativeAdViewSignals", zzbqg.n);
                a.T("/getNativeClickMeta", zzbqg.o);
                if (((Boolean) zzba.zzc().a(zzbjg.Q8)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(zzbjg.S8)).booleanValue() && (zzebmVar = zzduaVar.s) != null) {
                        a.T("/onDeviceStorageEvent", new zzbqp(zzebmVar));
                    }
                }
                zzclx zzP2 = a.zzP();
                synchronized (zzP2.d) {
                    zzP2.s = true;
                }
                a.zzP().g = new xtn(zzcgnVar, 2);
                a.G(str, str2);
                return zzcgnVar;
            default:
                zzdus zzdusVar = (zzdus) this.i;
                zzr zzrVar2 = this.b;
                zzfld zzfldVar2 = this.c;
                zzflg zzflgVar2 = this.d;
                zzb zzbVar2 = this.e;
                zzcef zzcefVar2 = this.f;
                String str3 = this.g;
                String str4 = this.h;
                zzclm a2 = zzdusVar.c.a(zzrVar2, zzfldVar2, zzflgVar2);
                zzcgn zzcgnVar2 = new zzcgn(a2);
                if (zzdusVar.a.b != null) {
                    zzdusVar.a(a2, zzbVar2, zzcefVar2);
                    a2.J(new zzcnw(5, 0, 0));
                } else {
                    zzdvy zzdvyVar2 = zzdusVar.d.a;
                    zzclx zzP3 = a2.zzP();
                    inn innVar2 = zzbjg.yf;
                    zzP3.L(zzdvyVar2, zzdvyVar2, zzdvyVar2, zzdvyVar2, zzdvyVar2, false, null, !((Boolean) zzba.zzc().a(innVar2)).booleanValue() ? new zzb(zzdusVar.e, null, null) : zzbVar2, null, true != ((Boolean) zzba.zzc().a(innVar2)).booleanValue() ? null : zzcefVar2, zzdusVar.h, zzdusVar.g, zzdusVar.f, null, zzdvyVar2, null, null, null, null, zzdusVar.k, null, null, zzdusVar.i);
                    zzdus.b(a2);
                }
                a2.zzP().g = new hcc(29, zzdusVar, a2, zzcgnVar2);
                a2.G(str3, str4);
                return zzcgnVar2;
        }
    }
}
