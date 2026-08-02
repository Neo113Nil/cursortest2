package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcld;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzcut;
import com.google.android.gms.internal.ads.zzcuy;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzdpl;
import com.google.android.gms.internal.ads.zzdrs;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qon implements zzbqh {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qon(zzdpl zzdplVar, View view) {
        this.a = 1;
        this.b = new WeakReference(zzdplVar);
        if (((Boolean) zzba.zzc().a(zzbjg.Ke)).booleanValue()) {
            this.c = new WeakReference(view);
        } else {
            this.c = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        switch (this.a) {
            case 0:
                zzclm zzclmVar = (zzclm) obj;
                zzbqg.b(map, (zzdlw) this.b);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = zze.zza;
                    zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                zzcub zzcubVar = (zzcub) this.c;
                zzhcq r = zzhcq.r(zzbqg.a(zzclmVar, str));
                int i2 = 0;
                ron ronVar = new ron(zzcubVar, str, i2);
                hsn hsnVar = zzcgj.a;
                hlo h = zzhcy.h(r, ronVar, hsnVar);
                h.addListener(new vlo(i2, h, new d1l(zzclmVar, 7)), hsnVar);
                return;
            case 1:
                zzdpl zzdplVar = (zzdpl) ((WeakReference) this.b).get();
                if (zzdplVar == null) {
                    return;
                }
                zzdplVar.g.zza();
                inn innVar = zzbjg.Ke;
                if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                    View view = (View) ((WeakReference) this.c).get();
                    zzfld zzfldVar = zzdplVar.j;
                    zzdrs zzdrsVar = zzdplVar.E;
                    zzdrsVar.getClass();
                    if (!((Boolean) zzba.zzc().a(innVar)).booleanValue() || view == null) {
                        return;
                    }
                    String str2 = true != zzab.zza(view) ? "0" : "1";
                    zzeai a = zzdrsVar.a.a();
                    a.b("action", "hcp");
                    a.b("hcp", str2);
                    a.a(zzfldVar);
                    a.c();
                    return;
                }
                return;
            case 2:
                zzdrw zzdrwVar = (zzdrw) this.b;
                try {
                    zzdrwVar.f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i3 = zze.zza;
                    zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzboj zzbojVar = (zzboj) this.c;
                zzdrwVar.e = (String) map.get("id");
                String str3 = (String) map.get("asset_id");
                if (zzbojVar == null) {
                    int i4 = zze.zza;
                    zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                } else {
                    try {
                        zzbojVar.zze(str3);
                        return;
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                        return;
                    }
                }
            case 3:
                zzdxf zzdxfVar = (zzdxf) this.b;
                zzclm zzclmVar2 = (zzclm) this.c;
                zzcuy zzcuyVar = zzdxfVar.i;
                synchronized (zzcuyVar) {
                    zzcuyVar.c.add(zzclmVar2);
                    zzcut zzcutVar = zzcuyVar.a;
                    zzclmVar2.T("/updateActiveView", zzcutVar.e);
                    zzclmVar2.T("/untrackActiveViewUnit", zzcutVar.f);
                }
                return;
            default:
                zzcld zzcldVar = (zzcld) obj;
                String str4 = (String) map.get("u");
                if (str4 == null) {
                    int i5 = zze.zza;
                    zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfld e2 = zzcldVar.e();
                if (e2 != null && !e2.i0) {
                    ((zzfte) this.b).b(str4, e2.x0, null, null);
                    return;
                }
                zzflg g = ((zzcmt) zzcldVar).g();
                if (g == null) {
                    zzt.zzh().d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                zzele zzeleVar = (zzele) this.c;
                zzelg zzelgVar = new zzelg(2, g.b, zzt.zzk().a(), str4);
                zzeleVar.getClass();
                zzeleVar.e(new f0o(8, zzeleVar, zzelgVar));
                return;
        }
    }

    public /* synthetic */ qon(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
