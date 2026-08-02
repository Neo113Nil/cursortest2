package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhw extends zzadu implements zzafd {
    private static final zzhw zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zzaef zzj = ldn.e;

    static {
        zzhw zzhwVar = new zzhw();
        zzk = zzhwVar;
        zzadu.t(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    public static zzhv K() {
        return (zzhv) zzk.p();
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zzf;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final long D() {
        return this.zzg;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final float F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zzb & 16) != 0;
    }

    public final double H() {
        return this.zzi;
    }

    public final zzaef I() {
        return this.zzj;
    }

    public final int J() {
        return this.zzj.size();
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void P() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void Q(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void S(zzhw zzhwVar) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = x5n.k(zzaefVar);
        }
        this.zzj.add(zzhwVar);
    }

    public final void T(ArrayList arrayList) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = x5n.k(zzaefVar);
        }
        zzaca.j(arrayList, this.zzj);
    }

    public final void U() {
        this.zzj = ldn.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhw.class});
        }
        if (i2 == 3) {
            return new zzhw();
        }
        if (i2 == 4) {
            return new zzhv(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzl;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhw.class) {
            try {
                zzafjVar = zzl;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzk);
                    zzl = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final String z() {
        return this.zze;
    }
}
