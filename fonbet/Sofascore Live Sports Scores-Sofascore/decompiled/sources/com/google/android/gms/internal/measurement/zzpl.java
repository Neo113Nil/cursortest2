package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpl extends zzadu implements zzafd {
    private static final zzpl zze;
    private static volatile zzafj zzf;
    private zzaef zzb = ldn.e;

    static {
        zzpl zzplVar = new zzpl();
        zze = zzplVar;
        zzadu.t(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    public static zzpl z(byte[] bArr, zzadf zzadfVar) {
        return (zzpl) zzadu.j(zze, bArr, zzadfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzpl();
        }
        if (i2 == 4) {
            return new zzpk(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzf;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzpl.class) {
            try {
                zzafjVar = zzf;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zze);
                    zzf = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final List y() {
        return this.zzb;
    }
}
