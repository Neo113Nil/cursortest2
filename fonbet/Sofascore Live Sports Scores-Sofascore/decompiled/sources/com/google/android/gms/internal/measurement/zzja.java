package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzja extends zzadu implements zzafd {
    private static final zzja zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = ldn.e;
    private zziw zzf;

    static {
        zzja zzjaVar = new zzja();
        zzg = zzjaVar;
        zzadu.t(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzje.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzja();
        }
        if (i2 == 4) {
            return new zziz(zzg);
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
        synchronized (zzja.class) {
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

    public final List y() {
        return this.zze;
    }

    public final zziw z() {
        zziw zziwVar = this.zzf;
        return zziwVar == null ? zziw.A() : zziwVar;
    }
}
