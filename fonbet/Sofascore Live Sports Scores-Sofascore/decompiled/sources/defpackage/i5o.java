package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzdga;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfiv;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5o implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i5o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ddb zza(Object obj) {
        zzfon zzfonVar;
        tko a;
        boolean z = false;
        switch (this.a) {
            case 0:
                zzeod zzeodVar = (zzeod) this.b;
                Uri uri = (Uri) this.c;
                zzflo zzfloVar = (zzflo) this.d;
                zzfld zzfldVar = (zzfld) this.e;
                zzflg zzflgVar = (zzflg) this.f;
                try {
                    Intent intent = new da4().a().a;
                    intent.setData(uri);
                    zzc zzcVar = new zzc(intent, null);
                    zzcgo zzcgoVar = new zzcgo();
                    evn d = zzeodVar.b.d(new zzczb(zzfloVar, zzfldVar, null), new zzdnb(new h5o(zzeodVar, zzcgoVar, zzfldVar), null));
                    zzcgoVar.zzc(new AdOverlayInfoParcel(zzcVar, null, (zzdga) d.s.zzb(), null, new VersionInfoParcel(0, 0, false), null, null, zzflgVar.b));
                    zzeodVar.d.c(2, 3);
                    return zzhcy.a(d.d());
                } catch (Throwable th) {
                    int i = zze.zza;
                    zzo.zzg("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                zzfib zzfibVar = (zzfib) this.b;
                zzfiv zzfivVar = (zzfiv) this.c;
                h8o h8oVar = (h8o) this.d;
                zzfit zzfitVar = (zzfit) this.e;
                zzdcx zzdcxVar = (zzdcx) this.f;
                zzfig zzfigVar = (zzfig) obj;
                if (zzfigVar != null) {
                    h8o h8oVar2 = new h8o(h8oVar.a, h8oVar.b, h8oVar.c, h8oVar.d, h8oVar.e, h8oVar.f, zzfigVar.a);
                    zzfnu zzfnuVar = zzfigVar.c;
                    if (zzfnuVar != null) {
                        zzfibVar.e = null;
                        zzfoh zzfohVar = zzfibVar.c;
                        synchronized (zzfohVar) {
                            zzfohVar.c.add(h8oVar2);
                        }
                        return zzfibVar.b(zzfnuVar, zzfivVar);
                    }
                    zzfoh zzfohVar2 = zzfibVar.c;
                    synchronized (zzfohVar2) {
                        zzfohVar2.e = 2;
                        synchronized (zzfohVar2) {
                            zzfonVar = zzfohVar2.d;
                            if (zzfonVar == null) {
                                z = true;
                            }
                        }
                        if (a == null) {
                            zzfibVar.e = null;
                            return zzhcy.h(a, new cpn(zzfibVar, 11), zzfibVar.f);
                        }
                        synchronized (zzfohVar2) {
                            zzfohVar2.c.add(h8oVar2);
                        }
                        zzfivVar = new zzfiv(zzfivVar.b, zzfigVar.b);
                    }
                    a = z ? null : zzfonVar.a(h8oVar2);
                    if (a == null) {
                    }
                }
                ddb b = zzfibVar.a.b(zzfivVar, zzfitVar, zzdcxVar);
                zzfibVar.e = zzdcxVar;
                return b;
        }
    }
}
