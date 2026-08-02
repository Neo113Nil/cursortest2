package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgh extends zzadu implements zzafd {
    private static final zzgh zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private String zze = "";
    private zzaef zzf = ldn.e;
    private boolean zzg;

    static {
        zzgh zzghVar = new zzgh();
        zzh = zzghVar;
        zzadu.t(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", zzgr.class, "zzg"});
        }
        if (i2 == 3) {
            return new zzgh();
        }
        if (i2 == 4) {
            return new zzgg(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzi;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzgh.class) {
            try {
                zzafjVar = zzi;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzh);
                    zzi = zzafjVar;
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
}
