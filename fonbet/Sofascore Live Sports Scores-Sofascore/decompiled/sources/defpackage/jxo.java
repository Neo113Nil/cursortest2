package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabl;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzr;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jxo {
    public final zzxg a;
    public final Object b;
    public final zzzg[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public kxo g;
    public boolean h;
    public final boolean[] i;
    public final zzng[] j;
    public final zzabl k;
    public final tdc l;
    public jxo m;
    public zzzr n;
    public zzabm o;
    public long p;

    public jxo(zzng[] zzngVarArr, long j, zzabl zzablVar, zzabp zzabpVar, tdc tdcVar, kxo kxoVar, zzabm zzabmVar) {
        this.j = zzngVarArr;
        this.p = j;
        this.k = zzablVar;
        this.l = tdcVar;
        zzxo zzxoVar = kxoVar.a;
        Object obj = zzxoVar.a;
        this.b = obj;
        this.g = kxoVar;
        this.n = zzzr.d;
        this.o = zzabmVar;
        this.c = new zzzg[2];
        this.i = new boolean[2];
        long j2 = kxoVar.b;
        tdcVar.getClass();
        int i = tyo.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        zzxo a = zzxoVar.a(pair.second);
        ayo ayoVar = (ayo) ((HashMap) tdcVar.d).get(obj2);
        ayoVar.getClass();
        ((HashSet) tdcVar.f).add(ayoVar);
        yxo yxoVar = (yxo) ((HashMap) tdcVar.e).get(ayoVar);
        if (yxoVar != null) {
            yxoVar.a.i(yxoVar.b);
        }
        ayoVar.c.add(a);
        zzxg k = ayoVar.a.k(a, zzabpVar, j2);
        ((IdentityHashMap) tdcVar.c).put(k, ayoVar);
        tdcVar.u();
        this.a = k;
    }

    public final long a() {
        return this.g.b + this.p;
    }

    public final boolean b() {
        if (this.e) {
            return !this.f || this.a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.e) {
            return b() || d() - this.g.b >= C.TIME_UNSET;
        }
        return false;
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long zzb = this.f ? this.a.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.g.e : zzb;
    }

    public final void e(zzbf zzbfVar) {
        this.e = true;
        this.n = this.a.zzn();
        zzabm f = f(zzbfVar);
        kxo kxoVar = this.g;
        long j = kxoVar.b;
        long j2 = kxoVar.e;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long g = g(f, j, false, new boolean[2]);
        long j3 = this.p;
        kxo kxoVar2 = this.g;
        this.p = (kxoVar2.b - g) + j3;
        this.g = kxoVar2.a(g, kxoVar2.c);
    }

    public final zzabm f(zzbf zzbfVar) {
        zzabe[] zzabeVarArr;
        zzzr zzzrVar = this.n;
        zzxo zzxoVar = this.g.a;
        zzabl zzablVar = this.k;
        zzng[] zzngVarArr = this.j;
        zzabm f = zzablVar.f(zzngVarArr, zzzrVar, zzxoVar, zzbfVar);
        int i = 0;
        while (true) {
            int i2 = f.a;
            zzabeVarArr = f.c;
            if (i >= i2) {
                break;
            }
            if (f.a(i)) {
                if (zzabeVarArr[i] == null) {
                    zzngVarArr[i].getClass();
                    r4 = false;
                }
                zzguk.f(r4);
            } else {
                zzguk.f(zzabeVarArr[i] == null);
            }
            i++;
        }
        for (zzabe zzabeVar : zzabeVarArr) {
        }
        return f;
    }

    public final long g(zzabm zzabmVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        zzng[] zzngVarArr;
        int i = 0;
        while (true) {
            int i2 = zzabmVar.a;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !zzabmVar.b(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            zzngVarArr = this.j;
            if (i3 >= 2) {
                break;
            }
            zzngVarArr[i3].getClass();
            i3++;
        }
        i();
        this.o = zzabmVar;
        if (this.m == null) {
            int i4 = 0;
            while (true) {
                zzabm zzabmVar2 = this.o;
                if (i4 >= zzabmVar2.a) {
                    break;
                }
                zzabmVar2.a(i4);
                zzabe zzabeVar = this.o.c[i4];
                i4++;
            }
        }
        zzabe[] zzabeVarArr = zzabmVar.c;
        zzxg zzxgVar = this.a;
        zzzg[] zzzgVarArr = this.c;
        long g = zzxgVar.g(zzabeVarArr, zArr2, zzzgVarArr, zArr, j);
        for (int i5 = 0; i5 < 2; i5++) {
            zzngVarArr[i5].getClass();
        }
        this.f = false;
        for (int i6 = 0; i6 < 2; i6++) {
            if (zzzgVarArr[i6] != null) {
                zzguk.f(zzabmVar.a(i6));
                zzngVarArr[i6].getClass();
                this.f = true;
            } else {
                zzguk.f(zzabeVarArr[i6] == null);
            }
        }
        return g;
    }

    public final void h() {
        i();
        tdc tdcVar = this.l;
        zzxg zzxgVar = this.a;
        try {
            IdentityHashMap identityHashMap = (IdentityHashMap) tdcVar.c;
            ayo ayoVar = (ayo) identityHashMap.remove(zzxgVar);
            ayoVar.getClass();
            ayoVar.a.c(zzxgVar);
            ayoVar.c.remove(zzxgVar.a);
            if (!identityHashMap.isEmpty()) {
                tdcVar.u();
            }
            tdcVar.x(ayoVar);
        } catch (RuntimeException e) {
            zzeh.f("Period release failed.", e);
        }
    }

    public final void i() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            zzabm zzabmVar = this.o;
            if (i >= zzabmVar.a) {
                return;
            }
            zzabmVar.a(i);
            zzabe zzabeVar = this.o.c[i];
            i++;
        }
    }
}
