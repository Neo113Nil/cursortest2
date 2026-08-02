package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzabo;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzabv;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzeoq;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzqj;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j5o implements zzdom, zzabp {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;

    public j5o(zzjj zzjjVar, zzqj zzqjVar) {
        this.a = 1;
        this.d = zzjjVar;
        this.b = new HashMap();
        this.c = zzqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public synchronized void a(zzabn zzabnVar) {
        ((zzjj) this.d).c.a(zzabnVar);
        d(zzabnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public void b(boolean z, Context context, zzdec zzdecVar) {
        zzfmd zzfmdVar;
        try {
            zzfmu zzfmuVar = (zzfmu) ((zzemt) this.b).b;
            zzfmuVar.b(z);
            int i = ((zzeoq) this.d).c.clientJarVersion;
            int intValue = ((Integer) zzba.zzc().a(zzbjg.x1)).intValue();
            zzbvx zzbvxVar = zzfmuVar.a;
            if (i < intValue) {
                try {
                    zzbvxVar.zzh();
                    return;
                } finally {
                }
            } else {
                try {
                    zzbvxVar.o0(new ObjectWrapper(context));
                    return;
                } finally {
                }
            }
        } catch (zzfmd e) {
            int i2 = zze.zza;
            zzo.zzh("Cannot show interstitial.");
            throw new zzdol(e.getCause());
        }
        int i22 = zze.zza;
        zzo.zzh("Cannot show interstitial.");
        throw new zzdol(e.getCause());
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public synchronized void c(zzabo zzaboVar) {
        ((zzjj) this.d).c.c(zzaboVar);
        while (zzaboVar != null) {
            d(zzaboVar.zzd());
            zzaboVar = zzaboVar.zze();
        }
    }

    public void d(zzabn zzabnVar) {
        zzqj zzqjVar = (zzqj) ((HashMap) this.b).remove(zzabnVar);
        zzqjVar.getClass();
        jso jsoVar = (jso) ((zzjj) this.d).n.get(zzqjVar);
        if (jsoVar != null) {
            synchronized (jsoVar) {
                jsoVar.d--;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                a2p a2pVar = ((a2p) this.c).b;
                String str = "";
                while (a2pVar != null) {
                    Object obj = a2pVar.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                    }
                    a2pVar = a2pVar.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public synchronized zzabn zza() {
        zzabn zza;
        zzjj zzjjVar = (zzjj) this.d;
        zzabv zzabvVar = zzjjVar.c;
        HashMap hashMap = (HashMap) this.b;
        zza = zzabvVar.zza();
        zzqj zzqjVar = (zzqj) this.c;
        hashMap.put(zza, zzqjVar);
        jso jsoVar = (jso) zzjjVar.n.get(zzqjVar);
        if (jsoVar != null) {
            synchronized (jsoVar) {
                jsoVar.d++;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public synchronized void zzd() {
        ((zzjj) this.d).c.zzd();
    }

    public j5o(zzeoq zzeoqVar, zzemt zzemtVar, zzfld zzfldVar) {
        this.a = 0;
        this.b = zzemtVar;
        this.c = zzfldVar;
        this.d = zzeoqVar;
    }

    public /* synthetic */ j5o(String str) {
        this.a = 2;
        a2p a2pVar = new a2p();
        this.c = a2pVar;
        this.d = a2pVar;
        this.b = str;
    }
}
