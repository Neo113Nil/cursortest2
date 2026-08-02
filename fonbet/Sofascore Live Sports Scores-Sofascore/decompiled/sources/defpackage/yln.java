package defpackage;

import android.net.NetworkCapabilities;
import android.view.View;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzfyy;
import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yln implements zzgac {
    public final zzfyk a;
    public final zzfyy b;
    public final zzbcn c;
    public final zzbbz d;
    public final zzbbj e;
    public final zzbcp f;
    public final zzbch g;
    public final zzbby h;

    public yln(zzfyk zzfykVar, zzfyy zzfyyVar, zzbcn zzbcnVar, zzbbz zzbbzVar, zzbbj zzbbjVar, zzbcp zzbcpVar, zzbch zzbchVar, zzbby zzbbyVar) {
        this.a = zzfykVar;
        this.b = zzfyyVar;
        this.c = zzbcnVar;
        this.d = zzbbzVar;
        this.e = zzbbjVar;
        this.f = zzbcpVar;
        this.g = zzbchVar;
        this.h = zzbbyVar;
    }

    public final HashMap a() {
        long j;
        HashMap hashMap = new HashMap();
        zzfyk zzfykVar = this.a;
        Task task = this.b.d;
        zzaza zzazaVar = xao.a;
        if (task.isSuccessful()) {
            zzazaVar = (zzaza) task.getResult();
        }
        hashMap.put("v", zzfykVar.a());
        hashMap.put("gms", Boolean.valueOf(zzfykVar.c()));
        hashMap.put("gv", Long.valueOf(zzazaVar.B0()));
        hashMap.put("int", zzazaVar.z0());
        hashMap.put("attts", Long.valueOf(zzazaVar.E0().E()));
        hashMap.put("att", zzazaVar.E0().G());
        hashMap.put("attkid", zzazaVar.E0().F());
        hashMap.put("up", Boolean.valueOf(this.d.a));
        hashMap.put("t", new Throwable());
        zzbch zzbchVar = this.g;
        hashMap.put("tcq", Long.valueOf(zzbchVar.a));
        hashMap.put("tpq", Long.valueOf(zzbchVar.b));
        hashMap.put("tcv", Long.valueOf(zzbchVar.c));
        hashMap.put("tpv", Long.valueOf(zzbchVar.d));
        hashMap.put("tchv", Long.valueOf(zzbchVar.e));
        hashMap.put("tphv", Long.valueOf(zzbchVar.f));
        hashMap.put("tcc", Long.valueOf(zzbchVar.g));
        hashMap.put("tpc", Long.valueOf(zzbchVar.h));
        zzbbj zzbbjVar = this.e;
        if (zzbbjVar != null) {
            synchronized (zzbbj.class) {
                try {
                    NetworkCapabilities networkCapabilities = zzbbjVar.a;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j = 2;
                        } else if (zzbbjVar.a.hasTransport(1)) {
                            j = 1;
                        } else if (zzbbjVar.a.hasTransport(0)) {
                            j = 0;
                        }
                    }
                    j = -1;
                } finally {
                }
            }
            hashMap.put("nt", Long.valueOf(j));
        }
        zzbcp zzbcpVar = this.f;
        hashMap.put("vs", Long.valueOf(zzbcpVar.d ? zzbcpVar.b - zzbcpVar.a : -1L));
        long j2 = zzbcpVar.c;
        zzbcpVar.c = -1L;
        hashMap.put("vf", Long.valueOf(j2));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zzb() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zzc() {
        HashMap a = a();
        zzbby zzbbyVar = this.h;
        List list = zzbbyVar.a;
        zzbbyVar.a = Collections.EMPTY_LIST;
        a.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, list);
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zzd() {
        HashMap a = a();
        zzbcn zzbcnVar = this.c;
        if (zzbcnVar.l <= -2) {
            WeakReference weakReference = zzbcnVar.h;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                zzbcnVar.l = -3L;
            }
        }
        a.put("lts", Long.valueOf(zzbcnVar.l));
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
