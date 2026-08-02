package defpackage;

import com.google.android.gms.internal.ads.zzadf;
import com.google.android.gms.internal.ads.zzaeb;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vbn {
    public final zzaed a;
    public final zzaeb b = new zzaeb();
    public final zzfi c = new zzfi(0);
    public final zzfi d = new zzfi(0);
    public final zzej e;
    public final qpk f;
    public final zzadf g;
    public long h;
    public long i;
    public long j;
    public zzbv k;
    public long l;
    public final c0l m;

    public vbn(c0l c0lVar, zzaed zzaedVar, qpk qpkVar, zzadf zzadfVar) {
        this.m = c0lVar;
        this.a = zzaedVar;
        this.f = qpkVar;
        this.g = zzadfVar;
        zzej zzejVar = new zzej();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i = highestOneBit + highestOneBit;
        }
        zzejVar.a = 0;
        zzejVar.b = -1;
        zzejVar.c = 0;
        zzejVar.d = new long[i];
        zzejVar.e = i - 1;
        this.e = zzejVar;
        this.h = C.TIME_UNSET;
        this.k = zzbv.d;
        this.i = C.TIME_UNSET;
        this.j = C.TIME_UNSET;
    }

    public final void a(long j, long j2) {
        c0l c0lVar = this.m;
        x9n x9nVar = (x9n) c0lVar.c;
        while (true) {
            zzej zzejVar = this.e;
            int i = zzejVar.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                yhk.d();
                return;
            }
            long j3 = zzejVar.d[zzejVar.a];
            Long l = (Long) this.d.d(j3);
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                this.a.a(2);
            }
            zzadf zzadfVar = this.g;
            zzadfVar.a(1000 * j3);
            long j4 = this.l;
            long b = zzadfVar.b();
            long j5 = zzadfVar.h;
            zzaed zzaedVar = this.a;
            zzaeb zzaebVar = this.b;
            int e = zzaedVar.e(j3, j, j2, j4, false, false, b, j5, zzaebVar);
            if (e != 5 && e != 4) {
                this.f.d(j3, zzaebVar.a);
            }
            if (e == 0 || e == 1) {
                this.i = j3;
                long a = zzejVar.a();
                zzbv zzbvVar = (zzbv) this.c.d(a);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.d) && !zzbvVar.equals(this.k)) {
                    this.k = zzbvVar;
                    zzt zztVar = new zzt();
                    zztVar.u = zzbvVar.a;
                    zztVar.v = zzbvVar.b;
                    zztVar.d("video/raw");
                    c0lVar.b = new zzv(zztVar);
                    x9nVar.j.execute(new o9n(c0lVar, zzbvVar));
                }
                long nanoTime = e == 0 ? System.nanoTime() : zzaebVar.b;
                int i2 = zzaedVar.d;
                zzaedVar.d = 3;
                zzaedVar.f = zzfm.u(zzaedVar.h.zzb());
                int i3 = 0;
                if ((i2 == 3 ? 0 : 1) != 0 && x9nVar.f != null) {
                    x9nVar.j.execute(new o9n(c0lVar, i3));
                }
                zzv zzvVar = (zzv) c0lVar.b;
                long j6 = nanoTime;
                x9nVar.k.b(a, j6, zzvVar == null ? new zzv(new zzt()) : zzvVar, null);
                ((zzafb) x9nVar.d.remove()).c(j6);
            } else if (e == 2 || e == 3) {
                this.i = j3;
                zzejVar.a();
                x9nVar.j.execute(new o9n(c0lVar, r12));
                ((zzafb) x9nVar.d.remove()).zzb();
            } else if (e != 4) {
                return;
            } else {
                this.i = j3;
            }
        }
    }
}
