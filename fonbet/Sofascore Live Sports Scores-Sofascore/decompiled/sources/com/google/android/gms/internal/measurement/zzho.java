package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzho extends zzadu implements zzafd {
    private static final zzho zze;
    private static volatile zzafj zzf;
    private zzaef zzb = ldn.e;

    static {
        zzho zzhoVar = new zzho();
        zze = zzhoVar;
        zzadu.t(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static zzho A() {
        return zze;
    }

    public static zzhh z() {
        return (zzhh) zze.p();
    }

    public final void B(ArrayList arrayList) {
        zzaef zzaefVar = this.zzb;
        if (!zzaefVar.zza()) {
            this.zzb = x5n.k(zzaefVar);
        }
        zzaca.j(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i2 == 3) {
            return new zzho();
        }
        if (i2 == 4) {
            return new zzhh(zze);
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
        synchronized (zzho.class) {
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
