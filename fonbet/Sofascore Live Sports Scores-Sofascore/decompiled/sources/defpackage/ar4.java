package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzav;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzesp;
import com.google.android.gms.internal.ads.zzesx;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzmf;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zznp;
import com.google.android.gms.internal.ads.zzuc;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ar4 implements l2c, m2c, zzhcf, zzmf {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public ar4(xwo xwoVar) {
        this.a = 3;
        this.e = xwoVar;
        zznp zznpVar = new zznp();
        zznpVar.d = zzav.d;
        this.d = zznpVar;
        this.b = true;
    }

    @Override // defpackage.l2c
    public void a(gke gkeVar) {
        l2c l2cVar = (l2c) this.g;
        if (l2cVar != null) {
            l2cVar.a(gkeVar);
            gkeVar = ((l2c) this.g).getPlaybackParameters();
        }
        ((qbc) this.d).a(gkeVar);
    }

    @Override // defpackage.m2c
    public void b(hke hkeVar) {
        m2c m2cVar = (m2c) this.g;
        if (m2cVar != null) {
            m2cVar.b(hkeVar);
            hkeVar = ((m2c) this.g).mo9getPlaybackParameters();
        }
        ((i9i) this.d).b(hkeVar);
    }

    @Override // defpackage.m2c
    public boolean c() {
        if (this.b) {
            return false;
        }
        m2c m2cVar = (m2c) this.g;
        m2cVar.getClass();
        return m2cVar.c();
    }

    public void d(n51 n51Var) {
        m2c m2cVar;
        m2c g = n51Var.g();
        if (g == null || g == (m2cVar = (m2c) this.g)) {
            return;
        }
        if (m2cVar != null) {
            throw new tf6(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.g = g;
        this.f = n51Var;
        ((u2c) g).b(((i9i) this.d).d);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public void e(zzav zzavVar) {
        zzmf zzmfVar = (zzmf) this.g;
        if (zzmfVar != null) {
            zzmfVar.e(zzavVar);
            zzavVar = ((zzmf) this.g).zzj();
        }
        ((zznp) this.d).e(zzavVar);
    }

    public void f(zzne zzneVar) {
        zzmf zzmfVar;
        zzmf zzd = zzneVar.zzd();
        if (zzd == null || zzd == (zzmfVar = (zzmf) this.g)) {
            return;
        }
        if (zzmfVar != null) {
            throw new zzjn(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.g = zzd;
        this.f = zzneVar;
        ((zzuc) zzd).e(((zznp) this.d).d);
    }

    @Override // defpackage.l2c
    public gke getPlaybackParameters() {
        l2c l2cVar = (l2c) this.g;
        return l2cVar != null ? l2cVar.getPlaybackParameters() : (gke) ((qbc) this.d).e;
    }

    @Override // defpackage.l2c, defpackage.m2c
    public long getPositionUs() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (this.b) {
                    return ((qbc) obj).getPositionUs();
                }
                l2c l2cVar = (l2c) this.g;
                l2cVar.getClass();
                return l2cVar.getPositionUs();
            default:
                if (this.b) {
                    return ((i9i) obj).getPositionUs();
                }
                m2c m2cVar = (m2c) this.g;
                m2cVar.getClass();
                return m2cVar.getPositionUs();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(8:5|6|7|8|(1:10)(1:68)|11|12|(2:14|(4:16|83|26|27)(1:35))(4:36|(1:38)|39|(2:41|(2:43|44)(2:45|46))(2:47|140))))|72|73|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0062, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0063, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r0);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    @Override // com.google.android.gms.internal.ads.zzhcf
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ddb mo10zza() {
        zzbxt zzbxtVar;
        zzbxt b;
        zzfco zzfcoVar = (zzfco) this.d;
        String str = (String) this.e;
        List list = (List) this.f;
        Bundle bundle = (Bundle) this.g;
        boolean z = this.b;
        boolean z2 = this.c;
        zzcgo zzcgoVar = new zzcgo();
        if (z2) {
            if (!((Boolean) zzba.zzc().a(zzbjg.u2)).booleanValue()) {
                zzesp zzespVar = zzfcoVar.f;
                zzespVar.getClass();
                try {
                    zzespVar.a.put(str, zzespVar.b.b(str));
                } catch (RemoteException e) {
                    zze.zzb("Couldn't create RTB adapter : ", e);
                }
                ConcurrentHashMap concurrentHashMap = zzespVar.a;
                b = concurrentHashMap.containsKey(str) ? (zzbxt) concurrentHashMap.get(str) : null;
                zzbxtVar = b;
                if (zzbxtVar != null) {
                    if (!((Boolean) zzba.zzc().a(zzbjg.k2)).booleanValue()) {
                        throw null;
                    }
                    int i = zzesx.f;
                    synchronized (zzesx.class) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", str);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) zzba.zzc().a(zzbjg.q2)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                zzcgoVar.zzc(jSONObject);
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return zzcgoVar;
                }
                zzesx zzesxVar = new zzesx(str, zzbxtVar, zzcgoVar, zzt.zzk().elapsedRealtime());
                if (((Boolean) zzba.zzc().a(zzbjg.p2)).booleanValue()) {
                    zzfcoVar.b.schedule(new x3o(zzesxVar, 6), ((Long) zzba.zzc().a(zzbjg.i2)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (z) {
                    if (((Boolean) zzba.zzc().a(zzbjg.w2)).booleanValue()) {
                        zzfcoVar.a.submit(new ugn(zzfcoVar, zzbxtVar, bundle, list, zzesxVar, zzcgoVar, 1));
                        return zzcgoVar;
                    }
                    zzbxtVar.r1(new ObjectWrapper(zzfcoVar.d), zzfcoVar.i, bundle, (Bundle) list.get(0), zzfcoVar.e.f, zzesxVar);
                    return zzcgoVar;
                }
                synchronized (zzesxVar) {
                    if (zzesxVar.e) {
                        return zzcgoVar;
                    }
                    try {
                        if (((Boolean) zzba.zzc().a(zzbjg.q2)).booleanValue()) {
                            zzesxVar.c.put("signal_error_code", 0);
                        }
                    } catch (JSONException unused2) {
                    }
                    zzesxVar.b.zzc(zzesxVar.c);
                    zzesxVar.e = true;
                    return zzcgoVar;
                }
            }
        }
        b = zzfcoVar.g.b(str);
        zzbxtVar = b;
        if (zzbxtVar != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public long zzg() {
        if (this.b) {
            return ((zznp) this.d).zzg();
        }
        zzmf zzmfVar = (zzmf) this.g;
        zzmfVar.getClass();
        return zzmfVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzh() {
        if (this.b) {
            return false;
        }
        zzmf zzmfVar = (zzmf) this.g;
        zzmfVar.getClass();
        return zzmfVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public zzav zzj() {
        zzmf zzmfVar = (zzmf) this.g;
        return zzmfVar != null ? zzmfVar.zzj() : ((zznp) this.d).d;
    }

    @Override // defpackage.m2c
    /* renamed from: getPlaybackParameters, reason: collision with other method in class */
    public hke mo9getPlaybackParameters() {
        m2c m2cVar = (m2c) this.g;
        if (m2cVar != null) {
            return m2cVar.mo9getPlaybackParameters();
        }
        return ((i9i) this.d).d;
    }

    public /* synthetic */ ar4(zzfco zzfcoVar, String str, List list, Bundle bundle, boolean z, boolean z2) {
        this.a = 2;
        this.d = zzfcoVar;
        this.e = str;
        this.f = list;
        this.g = bundle;
        this.b = z;
        this.c = z2;
    }

    public ar4(hh6 hh6Var, sqi sqiVar) {
        this.a = 0;
        this.e = hh6Var;
        this.d = new qbc(sqiVar);
        this.b = true;
    }

    public ar4(ih6 ih6Var) {
        this.a = 1;
        this.e = ih6Var;
        i9i i9iVar = new i9i();
        i9iVar.d = hke.d;
        this.d = i9iVar;
        this.b = true;
    }
}
