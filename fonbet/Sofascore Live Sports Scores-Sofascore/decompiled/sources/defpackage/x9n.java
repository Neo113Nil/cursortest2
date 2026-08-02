package defpackage;

import android.view.Surface;
import com.google.android.gms.internal.ads.zzadf;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzaek;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafc;
import com.google.android.gms.internal.ads.zzafd;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x9n implements zzafd {
    public final zzaed a;
    public final qpk b;
    public final vbn c;
    public final ArrayDeque d;
    public final zzadf e;
    public Surface f;
    public zzv g;
    public long h;
    public zzafa i;
    public Executor j;
    public zzaea k;

    public x9n(zzaed zzaedVar, qpk qpkVar, zzdp zzdpVar) {
        this.a = zzaedVar;
        this.b = qpkVar;
        zzaedVar.h = zzdpVar;
        zzadf zzadfVar = new zzadf(new d1l(zzaedVar, 3));
        this.e = zzadfVar;
        this.c = new vbn(new c0l(this, 8), zzaedVar, qpkVar, zzadfVar);
        this.d = new ArrayDeque();
        this.g = new zzv(new zzt());
        this.h = C.TIME_UNSET;
        this.i = zzafa.a;
        this.j = g35.c;
        this.k = j9n.b;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void E(int i) {
        zzaek zzaekVar = this.a.b;
        if (zzaekVar.h == i) {
            return;
        }
        zzaekVar.h = i;
        zzaekVar.b(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean a(long j, ean eanVar) {
        this.d.add(eanVar);
        vbn vbnVar = this.c;
        zzej zzejVar = vbnVar.e;
        int i = zzejVar.c;
        long[] jArr = zzejVar.d;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                zzl.s();
                return false;
            }
            long[] jArr2 = new long[i2];
            int i3 = zzejVar.a;
            int i4 = length - i3;
            System.arraycopy(jArr, i3, jArr2, 0, i4);
            System.arraycopy(zzejVar.d, 0, jArr2, i4, i3);
            zzejVar.a = 0;
            int i5 = zzejVar.c;
            zzejVar.b = i5 - 1;
            zzejVar.d = jArr2;
            zzejVar.e = i2 - 1;
            i = i5;
            jArr = jArr2;
        }
        int i6 = (zzejVar.b + 1) & zzejVar.e;
        zzejVar.b = i6;
        jArr[i6] = j;
        zzejVar.c = i + 1;
        vbnVar.h = j;
        vbnVar.j = C.TIME_UNSET;
        this.j.execute(new f2n(this, 5));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void b(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (zzjn e) {
            throw new zzafc(e, this.g);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean c(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void d(float f) {
        this.a.f(f);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void e(ban banVar) {
        this.i = banVar;
        this.j = slo.a;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void f(Surface surface, zzev zzevVar) {
        this.f = surface;
        this.a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void g(zzaea zzaeaVar) {
        this.k = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void h(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void j(zzv zzvVar, long j, int i, List list) {
        zzguk.f(list.isEmpty());
        int i2 = zzvVar.v;
        int i3 = zzvVar.w;
        zzv zzvVar2 = this.g;
        int i4 = zzvVar2.v;
        vbn vbnVar = this.c;
        if (i2 != i4 || i3 != zzvVar2.w) {
            long j2 = vbnVar.h;
            vbnVar.c.a(new zzbv(i2, i3, 1.0f), j2 == C.TIME_UNSET ? 0L : j2 + 1);
        }
        float f = zzvVar.z;
        if (f != this.g.z) {
            zzadf zzadfVar = this.e;
            zzadfVar.f = f;
            zzadfVar.a.d();
            zzadfVar.b.d();
            zzadfVar.c = false;
            zzadfVar.d = C.TIME_UNSET;
            zzadfVar.e = 0;
            zzadfVar.c();
        }
        this.g = zzvVar;
        if (j != this.h) {
            if (vbnVar.e.c == 0) {
                vbnVar.a.a(i);
                vbnVar.l = j;
            } else {
                zzfi zzfiVar = vbnVar.d;
                long j3 = vbnVar.h;
                zzfiVar.a(Long.valueOf(j), j3 == C.TIME_UNSET ? -4611686018427387904L : j3 + 1);
            }
            this.h = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zza() {
        this.b.f();
        this.a.b();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzb() {
        this.b.f();
        zzaed zzaedVar = this.a;
        zzaedVar.c = false;
        zzaek zzaekVar = zzaedVar.b;
        zzaekVar.c = false;
        vpk vpkVar = zzaekVar.b;
        if (vpkVar != null) {
            vpkVar.h();
        }
        zzaekVar.c();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzg(boolean z) {
        if (z) {
            zzaed zzaedVar = this.a;
            zzaedVar.b.a();
            zzaedVar.e = C.TIME_UNSET;
            zzaedVar.d = Math.min(zzaedVar.d, 1);
            zzaedVar.j = false;
        }
        this.b.f();
        vbn vbnVar = this.c;
        zzej zzejVar = vbnVar.e;
        zzejVar.a = 0;
        zzejVar.b = -1;
        zzejVar.c = 0;
        vbnVar.h = C.TIME_UNSET;
        vbnVar.i = C.TIME_UNSET;
        vbnVar.j = C.TIME_UNSET;
        zzfi zzfiVar = vbnVar.d;
        if (zzfiVar.b() > 0) {
            zzguk.a(zzfiVar.b() > 0);
            while (zzfiVar.b() > 1) {
                zzfiVar.c();
            }
            Object c = zzfiVar.c();
            c.getClass();
            vbnVar.l = ((Long) c).longValue();
        }
        zzfi zzfiVar2 = vbnVar.c;
        if (zzfiVar2.b() > 0) {
            zzguk.a(zzfiVar2.b() > 0);
            while (zzfiVar2.b() > 1) {
                zzfiVar2.c();
            }
            Object c2 = zzfiVar2.c();
            c2.getClass();
            zzfiVar2.a((zzbv) c2, 0L);
        }
        this.d.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzh(boolean z) {
        return this.a.d(z);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzi() {
        vbn vbnVar = this.c;
        long j = vbnVar.h;
        if (j == C.TIME_UNSET) {
            j = Long.MIN_VALUE;
            vbnVar.h = Long.MIN_VALUE;
            vbnVar.i = Long.MIN_VALUE;
        }
        vbnVar.j = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzj() {
        vbn vbnVar = this.c;
        long j = vbnVar.j;
        return j != C.TIME_UNSET && vbnVar.i == j;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final Surface zzk() {
        Surface surface = this.f;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzq() {
        this.f = null;
        this.a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzt() {
        zzaed zzaedVar = this.a;
        if (zzaedVar.d == 0) {
            zzaedVar.d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzw(boolean z) {
        this.a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzx() {
    }
}
