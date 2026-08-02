package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgf extends zzadu implements zzafd {
    private static final zzgf zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private zzaef zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private zzaef zzi;

    static {
        zzgf zzgfVar = new zzgf();
        zzj = zzgfVar;
        zzadu.t(zzgf.class, zzgfVar);
    }

    private zzgf() {
        ldn ldnVar = ldn.e;
        this.zze = ldnVar;
        this.zzf = ldnVar;
        this.zzg = ldnVar;
        this.zzi = ldnVar;
    }

    public static zzgf E() {
        return zzj;
    }

    public final List A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zzb & 1) != 0;
    }

    public final boolean C() {
        return this.zzh;
    }

    public final zzaef D() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", zzfu.class, "zzf", zzfw.class, "zzg", zzgc.class, "zzh", "zzi", zzfu.class});
        }
        if (i2 == 3) {
            return new zzgf();
        }
        if (i2 == 4) {
            return new zzfs(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzk;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzgf.class) {
            try {
                zzafjVar = zzk;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzj);
                    zzk = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final List y() {
        return this.zze;
    }

    public final List z() {
        return this.zzf;
    }
}
