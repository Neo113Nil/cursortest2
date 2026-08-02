package com.google.android.gms.internal.measurement;

import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznm extends zzadu implements zzafd {
    private static final zznm zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        zznm zznmVar = new zznm();
        zzg = zznmVar;
        zzadu.t(zznm.class, zznmVar);
    }

    private zznm() {
    }

    public static zznm A() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zznm();
        }
        if (i2 == 4) {
            return new zznl(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzh;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zznm.class) {
            try {
                zzafjVar = zzh;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzg);
                    zzh = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final String y() {
        return this.zze;
    }

    public final long z() {
        return this.zzf;
    }
}
