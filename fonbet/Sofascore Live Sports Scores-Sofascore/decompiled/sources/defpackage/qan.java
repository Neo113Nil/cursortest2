package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzadz;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzafc;
import com.google.android.gms.internal.ads.zzafd;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzh;
import com.google.android.gms.internal.ads.zzi;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qan implements zzafd {
    public zzgxm a;
    public zzv b;
    public long c;
    public int d;
    public final /* synthetic */ zzadz e;

    public qan(zzadz zzadzVar, Context context) {
        this.e = zzadzVar;
        zzfm.l(context);
        mio mioVar = zzgxm.b;
        this.a = s.e;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void E(int i) {
        this.e.e.E(i);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean a(long j, ean eanVar) {
        int i;
        zzguk.f(false);
        long j2 = j + this.c;
        zzadz zzadzVar = this.e;
        qpk qpkVar = zzadzVar.i;
        long j3 = qpkVar.a == C.TIME_UNSET ? -9223372036854775807L : (long) (((j2 - r3) * qpkVar.c) + qpkVar.b);
        if (j3 == C.TIME_UNSET || j3 >= zzadzVar.h || (i = this.d) >= 2) {
            return false;
        }
        this.d = i + 1;
        eanVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void b(long j, long j2) {
        this.e.e.b(j + this.c, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean c(zzv zzvVar) {
        zzadz zzadzVar = this.e;
        boolean z = true;
        zzguk.f(zzadzVar.n == 0);
        zzi zziVar = zzvVar.F;
        if (zziVar == null || !zziVar.d()) {
            zziVar = zzi.h;
        }
        try {
            int i = zziVar.c;
            try {
                if (i == 7) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 34) {
                        if (i2 >= 33 && zzdy.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zzh zzhVar = new zzh();
                            zzhVar.a = zziVar.a;
                            zzhVar.b = zziVar.b;
                            zzhVar.d = zziVar.d;
                            zzhVar.e = zziVar.e;
                            zzhVar.f = zziVar.f;
                            zzhVar.c = 6;
                            zziVar = zzhVar.a();
                            zzdp zzdpVar = zzadzVar.f;
                            Looper myLooper = Looper.myLooper();
                            myLooper.getClass();
                            d8o a = zzdpVar.a(myLooper, null);
                            zzadzVar.k = a;
                            zzadzVar.b.a(zzadzVar.a, zziVar, zzadzVar, new pan(a, 0));
                            throw null;
                        }
                    }
                    i = 7;
                }
                if (!z && Build.VERSION.SDK_INT >= 29) {
                    String str = zzfm.a;
                    Locale locale = Locale.US;
                    zzeh.c("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                    zziVar = zzi.h;
                    zzdp zzdpVar2 = zzadzVar.f;
                    Looper myLooper2 = Looper.myLooper();
                    myLooper2.getClass();
                    d8o a2 = zzdpVar2.a(myLooper2, null);
                    zzadzVar.k = a2;
                    zzadzVar.b.a(zzadzVar.a, zziVar, zzadzVar, new pan(a2, 0));
                    throw null;
                }
                zzadzVar.b.a(zzadzVar.a, zziVar, zzadzVar, new pan(a2, 0));
                throw null;
            } catch (zzbo e) {
                throw new zzafc(e, zzvVar);
            }
            if (i == 6) {
                if (Build.VERSION.SDK_INT < 33 || !zzdy.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    z = false;
                }
            } else if (i == 7) {
                z = zzdy.b("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (i == 2 || i == 10) {
                zziVar = zzi.h;
            }
            zzdp zzdpVar22 = zzadzVar.f;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            d8o a22 = zzdpVar22.a(myLooper22, null);
            zzadzVar.k = a22;
        } catch (zzdx e2) {
            throw new zzafc(e2, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void d(float f) {
        zzadz zzadzVar = this.e;
        zzadzVar.i.e(f);
        zzadzVar.e.d(f);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void f(Surface surface, zzev zzevVar) {
        zzadz zzadzVar = this.e;
        Pair pair = zzadzVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzev) zzadzVar.l.second).equals(zzevVar)) {
            return;
        }
        zzadzVar.l = Pair.create(surface, zzevVar);
        int i = zzevVar.a;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void g(zzaea zzaeaVar) {
        this.e.e.k = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void h(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = zzgxm.x(list);
        zzv zzvVar = this.b;
        if (zzvVar == null) {
            return;
        }
        zzt zztVar = new zzt(zzvVar);
        zzi zziVar = zzvVar.F;
        if (zziVar == null || !zziVar.d()) {
            zziVar = zzi.h;
        }
        zztVar.E = zziVar;
        zztVar.a();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void i(long j) {
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void j(zzv zzvVar, long j, int i, List list) {
        zzguk.f(false);
        this.a = zzgxm.x(list);
        this.b = zzvVar;
        zzt zztVar = new zzt(zzvVar);
        zzi zziVar = zzvVar.F;
        if (zziVar == null || !zziVar.d()) {
            zziVar = zzi.h;
        }
        zztVar.E = zziVar;
        zztVar.a();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zza() {
        zzadz zzadzVar = this.e;
        if (zzadzVar.d) {
            zzadzVar.e.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzb() {
        zzadz zzadzVar = this.e;
        if (zzadzVar.d) {
            zzadzVar.e.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzg(boolean z) {
        zzfi zzfiVar;
        zzadz zzadzVar = this.e;
        if (zzadzVar.n == 1) {
            zzadzVar.m++;
            zzadzVar.e.zzg(z);
            while (true) {
                int b = zzadzVar.j.b();
                zzfiVar = zzadzVar.j;
                if (b <= 1) {
                    break;
                } else {
                    zzfiVar.c();
                }
            }
            if (zzfiVar.b() == 1) {
                ((abn) zzadzVar.j.c()).getClass();
                throw null;
            }
            zzea zzeaVar = zzadzVar.k;
            zzeaVar.getClass();
            zzeaVar.f(new f2n(zzadzVar, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzh(boolean z) {
        this.e.e.a.getClass();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzi() {
        this.e.e.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final Surface zzk() {
        zzguk.f(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzq() {
        int i = zzev.c.a;
        this.e.l = null;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzt() {
        zzadz zzadzVar = this.e;
        if (zzadzVar.j.b() == 0) {
            zzadzVar.e.zzt();
            return;
        }
        zzfi zzfiVar = new zzfi(0);
        if (zzadzVar.j.b() <= 0) {
            zzadzVar.j = zzfiVar;
        } else {
            ((abn) zzadzVar.j.c()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzw(boolean z) {
        zzadz zzadzVar = this.e;
        if (zzadzVar.d) {
            zzadzVar.e.a.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzx() {
        zzadz zzadzVar = this.e;
        if (zzadzVar.n == 2) {
            return;
        }
        zzea zzeaVar = zzadzVar.k;
        if (zzeaVar != null) {
            zzeaVar.zzl();
        }
        zzadzVar.l = null;
        zzadzVar.n = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void e(ban banVar) {
    }
}
