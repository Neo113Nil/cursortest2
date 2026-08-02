package defpackage;

import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzahh;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class egn implements zzagh {
    public zzagk b;
    public zzagi c;
    public zzahp d;
    public zzamp e;
    public int g;
    public long h;
    public int i;
    public final zzeu a = new zzeu(16);
    public long j = -1;
    public int f = 0;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                zzamp zzampVar = this.e;
                zzampVar.getClass();
                zzampVar.a(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        return o6a.P(zzagiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.b = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                zzeu zzeuVar = this.a;
                if (i2 == 0) {
                    if (!zzagiVar.i(zzeuVar.a, 0, 8, true)) {
                        zzagk zzagkVar = this.b;
                        zzagkVar.getClass();
                        zzagkVar.zzv();
                        this.b.c(new zzahj(C.TIME_UNSET, 0L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    zzeuVar.D(0);
                    this.h = zzeuVar.N();
                    this.g = zzeuVar.b();
                }
                long j = this.h;
                if (j == 1) {
                    zzagiVar.g(8, 8, zzeuVar.a);
                    this.i += 8;
                    j = zzeuVar.j();
                    this.h = j;
                }
                if (this.g == 1836086884) {
                    long zzn = zzagiVar.zzn();
                    this.j = zzn;
                    long j2 = this.i;
                    zzaji zzajiVar = new zzaji(0L, zzn - j2, C.TIME_UNSET, zzn, j - j2);
                    zzagk zzagkVar2 = this.b;
                    zzagkVar2.getClass();
                    zzaht b = zzagkVar2.b(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.c("image/heic");
                    zztVar.k = new zzap(zzajiVar);
                    b.e(new zzv(zztVar));
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                zzagiVar.zzf((int) (this.h - this.i));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.d == null || zzagiVar != this.c) {
                        this.c = zzagiVar;
                        this.d = new zzahp(zzagiVar, this.j);
                    }
                    zzamp zzampVar = this.e;
                    zzampVar.getClass();
                    int e = zzampVar.e(this.d, zzahhVar);
                    if (e == 1) {
                        zzahhVar.a += this.j;
                    }
                    return e;
                }
                if (this.e == null) {
                    this.e = new zzamp(8, zzanx.G7);
                }
                zzahp zzahpVar = new zzahp(zzagiVar, this.j);
                this.d = zzahpVar;
                if (this.e.c(zzahpVar)) {
                    zzamp zzampVar2 = this.e;
                    long j3 = this.j;
                    zzagk zzagkVar3 = this.b;
                    zzagkVar3.getClass();
                    zzampVar2.d(new zzahr(j3, zzagkVar3));
                    this.f = 3;
                } else {
                    zzagk zzagkVar4 = this.b;
                    zzagkVar4.getClass();
                    zzagkVar4.zzv();
                    this.b.c(new zzahj(C.TIME_UNSET, 0L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
        if (this.e != null) {
            this.e = null;
        }
    }
}
