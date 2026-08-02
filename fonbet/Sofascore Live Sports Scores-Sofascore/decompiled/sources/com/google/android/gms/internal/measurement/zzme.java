package com.google.android.gms.internal.measurement;

import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzme extends zzadu implements zzafd {
    private static final zzme zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private zzmd zzf;
    private String zze = "";
    private String zzg = "";

    static {
        zzme zzmeVar = new zzme();
        zzh = zzmeVar;
        zzadu.t(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    public static zzmb z() {
        return (zzmb) zzh.p();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void B(zzmd zzmdVar) {
        this.zzf = zzmdVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzme();
        }
        if (i2 == 4) {
            return new zzmb(zzh);
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
        synchronized (zzme.class) {
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
