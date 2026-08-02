package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbnh;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdrb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdqm b;

    public /* synthetic */ b0o(zzdqm zzdqmVar, int i) {
        this.a = i;
        this.b = zzdqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzbnz zzbnzVar = null;
        zzdqm zzdqmVar = this.b;
        switch (i) {
            case 0:
                zzdqmVar.n.zzA();
                zzdqr zzdqrVar = zzdqmVar.m;
                synchronized (zzdqrVar) {
                    try {
                        zzclm zzclmVar = zzdqrVar.i;
                        if (zzclmVar != null) {
                            zzclmVar.destroy();
                            zzdqrVar.i = null;
                        }
                        zzclm zzclmVar2 = zzdqrVar.j;
                        if (zzclmVar2 != null) {
                            zzclmVar2.destroy();
                            zzdqrVar.j = null;
                        }
                        zzclm zzclmVar3 = zzdqrVar.k;
                        if (zzclmVar3 != null) {
                            zzclmVar3.destroy();
                            zzdqrVar.k = null;
                        }
                        ddb ddbVar = zzdqrVar.m;
                        if (ddbVar != null) {
                            ddbVar.cancel(false);
                            zzdqrVar.m = null;
                        }
                        zzcgo zzcgoVar = zzdqrVar.n;
                        if (zzcgoVar != null) {
                            zzcgoVar.cancel(false);
                            zzdqrVar.n = null;
                        }
                        zzdqrVar.l = null;
                        zzdqrVar.v.clear();
                        zzdqrVar.w.clear();
                        zzdqrVar.b = null;
                        zzdqrVar.c = null;
                        zzdqrVar.d = null;
                        zzdqrVar.e = null;
                        zzdqrVar.h = null;
                        zzdqrVar.o = null;
                        zzdqrVar.p = null;
                        zzdqrVar.q = null;
                        zzdqrVar.s = null;
                        zzdqrVar.t = null;
                        zzdqrVar.u = null;
                    } finally {
                    }
                }
                return;
            default:
                zzdrb zzdrbVar = zzdqmVar.q;
                try {
                    zzdqr zzdqrVar2 = zzdqmVar.m;
                    int q = zzdqrVar2.q();
                    if (q == 1) {
                        zzbnt zzbntVar = zzdrbVar.a;
                        if (zzbntVar != null) {
                            zzdqmVar.l();
                            zzbntVar.p4((zzbnj) zzdqmVar.r.zzb());
                            return;
                        }
                        return;
                    }
                    if (q == 2) {
                        zzbnq zzbnqVar = zzdrbVar.b;
                        if (zzbnqVar != null) {
                            zzdqmVar.l();
                            zzbnqVar.d0((zzbnh) zzdqmVar.s.zzb());
                            return;
                        }
                        return;
                    }
                    if (q == 3) {
                        String g = zzdqrVar2.g();
                        if (g != null) {
                            zzbnzVar = (zzbnz) zzdrbVar.f.get(g);
                        }
                        if (zzbnzVar != null) {
                            if (zzdqrVar2.h() != null) {
                                zzdqmVar.e("Google", true);
                            }
                            zzbnzVar.l3((zzbnm) zzdqmVar.v.zzb());
                            return;
                        }
                        return;
                    }
                    if (q == 6) {
                        zzbog zzbogVar = zzdrbVar.c;
                        if (zzbogVar != null) {
                            zzdqmVar.l();
                            zzbogVar.v4((zzbom) zzdqmVar.t.zzb());
                            return;
                        }
                        return;
                    }
                    if (q != 7) {
                        int i2 = zze.zza;
                        zzo.zzf("Wrong native template id!");
                        return;
                    } else {
                        zzbtc zzbtcVar = zzdrbVar.e;
                        if (zzbtcVar != null) {
                            zzbtcVar.G0((zzbsw) zzdqmVar.u.zzb());
                            return;
                        }
                        return;
                    }
                } catch (RemoteException e) {
                    int i3 = zze.zza;
                    zzo.zzg("RemoteException when notifyAdLoad is called", e);
                    return;
                }
        }
    }
}
