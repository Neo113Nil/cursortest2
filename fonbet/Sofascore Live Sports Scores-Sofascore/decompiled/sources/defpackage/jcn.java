package defpackage;

import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzddi;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zznl;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcn implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public jcn(zzmb zzmbVar, zzlu zzluVar, long j) {
        this.c = zzluVar;
        this.b = j;
        Objects.requireNonNull(zzmbVar);
        this.d = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = zzfm.a;
                ((zzaex) obj2).b.a(obj, j);
                break;
            case 1:
                zzats zzatsVar = (zzats) obj;
                zjn zjnVar = zzatsVar.a;
                zjnVar.a(j, (String) obj2);
                zjnVar.b(zzatsVar.toString());
                break;
            case 2:
                zzfvd zzfvdVar = (zzfvd) obj;
                if (zzfvdVar.q != null) {
                    zzdx zzdxVar = (zzdx) obj2;
                    String str2 = zzdxVar instanceof zzddi ? ((zzddi) zzdxVar).d : null;
                    zzfvdVar.q.g("paa", "pano_ts", this.b, zzfvdVar.s(), zzfvdVar.t(), str2, zzfvdVar.s, zzfvdVar.g());
                    break;
                }
                break;
            case 3:
                zzmb zzmbVar = (zzmb) obj;
                zzmbVar.Z((zzlu) obj2, false, j);
                zzmbVar.f = null;
                zznl o = ((zzic) zzmbVar.b).o();
                o.Q();
                o.R();
                o.e0(new yuo(o, null));
                break;
            default:
                ((gl5) obj2).run();
                lvc lvcVar = (lvc) obj;
                lvcVar.getClass();
                v1k v1kVar = new v1k(Executors.callable(this, null));
                jvc jvcVar = new jvc(v1kVar, lvcVar.b.schedule(v1kVar, j, TimeUnit.MINUTES));
                jvcVar.addListener(new f2p(i2, jvcVar), f35.a);
                break;
        }
    }

    public jcn(zzats zzatsVar, String str, long j) {
        this.c = str;
        this.b = j;
        this.d = zzatsVar;
    }

    public jcn(zzfvd zzfvdVar, long j, zzdx zzdxVar) {
        this.b = j;
        this.c = zzdxVar;
        this.d = zzfvdVar;
    }

    public jcn(zzqi zzqiVar, gl5 gl5Var, lvc lvcVar, long j) {
        this.c = gl5Var;
        this.d = lvcVar;
        this.b = j;
    }

    public /* synthetic */ jcn(zzaex zzaexVar, Object obj, long j) {
        this.c = zzaexVar;
        this.d = obj;
        this.b = j;
    }
}
