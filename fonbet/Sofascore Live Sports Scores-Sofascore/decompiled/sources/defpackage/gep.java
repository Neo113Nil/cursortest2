package defpackage;

import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzma;
import com.google.android.gms.internal.ads.zzul;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzzf;
import com.google.android.gms.internal.ads.zzzg;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gep implements zzzg {
    public final int a;
    public final /* synthetic */ kep b;

    public gep(kep kepVar, int i) {
        this.b = kepVar;
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (r1 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        if (r4.x != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c7, code lost:
    
        if (r16 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ca, code lost:
    
        r6 = r4.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cc, code lost:
    
        if (r6 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ce, code lost:
    
        if (r7 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d2, code lost:
    
        if (r6 == r4.f) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d4, code lost:
    
        r4.a(r6, r20);
     */
    @Override // com.google.android.gms.internal.ads.zzzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(zzma zzmaVar, zziy zziyVar, int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        kep kepVar = this.b;
        int i5 = this.a;
        if (kepVar.m()) {
            return -3;
        }
        kepVar.k(i5);
        zzzf zzzfVar = kepVar.s[i5];
        boolean z4 = kepVar.M;
        zzzfVar.getClass();
        boolean z5 = (i & 2) != 0;
        bm2 bm2Var = zzzfVar.b;
        synchronized (zzzfVar) {
            try {
                int i6 = zzzfVar.p;
                int i7 = zzzfVar.r;
                int i8 = i6 + i7;
                int i9 = zzzfVar.v;
                if (i9 == -1 || i8 < i9) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                    z2 = true;
                }
                i2 = -4;
                if (i7 != zzzfVar.o ? z : false) {
                    if (!((i9 != -1 || (i4 = zzzfVar.w) == -1 || i6 + i7 < i4) ? false : z) && !z2) {
                        zzv zzvVar = ((yep) zzzfVar.c.a(i8)).a;
                        if (!z5 && zzvVar == zzzfVar.f) {
                            int j = zzzfVar.j(zzzfVar.r);
                            if (zzzfVar.g != null) {
                                int i10 = zzzfVar.l[j];
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            if (z3) {
                                int i11 = zzzfVar.l[j];
                                zziyVar.a = i11;
                                if (zzzfVar.r == zzzfVar.o - 1 && (z4 || zzzfVar.x)) {
                                    zziyVar.a = 536870912 | i11;
                                }
                                zziyVar.e = zzzfVar.m[j];
                                bm2Var.c = zzzfVar.k[j];
                                bm2Var.b = zzzfVar.j[j];
                                bm2Var.d = zzzfVar.n[j];
                                i3 = -4;
                            }
                            i3 = -3;
                        }
                        zzzfVar.a(zzvVar, zzmaVar);
                        i3 = -5;
                    }
                }
                zziyVar.a = 4;
                zziyVar.e = Long.MIN_VALUE;
                i3 = -4;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 != -4) {
            i2 = i3;
        } else if (!zziyVar.b(4)) {
            int i12 = i & 1;
            if ((i & 4) == 0) {
                ei3 ei3Var = zzzfVar.a;
                zzeu zzeuVar = (zzeu) ei3Var.c;
                if (i12 != 0) {
                    ei3.k((c78) ei3Var.e, zziyVar, bm2Var, zzeuVar);
                } else {
                    ei3Var.e = ei3.k((c78) ei3Var.e, zziyVar, bm2Var, zzeuVar);
                    zzzfVar.r++;
                }
            }
        }
        if (i2 == -3) {
            kepVar.l(i5);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.zzzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(long j) {
        boolean z;
        int i;
        kep kepVar = this.b;
        int i2 = this.a;
        if (kepVar.m()) {
            return 0;
        }
        kepVar.k(i2);
        zzzf zzzfVar = kepVar.s[i2];
        boolean z2 = kepVar.M;
        synchronized (zzzfVar) {
            int i3 = zzzfVar.r;
            int j2 = zzzfVar.j(i3);
            int i4 = zzzfVar.r;
            int i5 = zzzfVar.o;
            z = true;
            if ((i4 != i5) && j >= zzzfVar.m[j2]) {
                i = (j <= zzzfVar.u || !z2) ? zzzfVar.h(j2, i5 - i3, j, true) : i5 - i3;
            }
            i = 0;
        }
        synchronized (zzzfVar) {
            if (i >= 0) {
                try {
                    if (zzzfVar.r + i <= zzzfVar.o) {
                        zzguk.a(z);
                        zzzfVar.r += i;
                    }
                } finally {
                }
            }
            z = false;
            zzguk.a(z);
            zzzfVar.r += i;
        }
        if (i != 0) {
            return i;
        }
        kepVar.l(i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zza() {
        kep kepVar = this.b;
        return !kepVar.m() && kepVar.s[this.a].m(kepVar.M);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb() {
        IOException iOException;
        int i = this.a;
        kep kepVar = this.b;
        zzul zzulVar = kepVar.s[i].g;
        if (zzulVar != null) {
            throw zzulVar.zza();
        }
        int i2 = kepVar.C == 7 ? 6 : 3;
        zzaci zzaciVar = kepVar.j;
        IOException iOException2 = zzaciVar.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        f8n f8nVar = zzaciVar.b;
        if (f8nVar != null && (iOException = f8nVar.c) != null && f8nVar.d > i2) {
            throw iOException;
        }
    }
}
