package com.google.android.gms.internal.measurement;

import defpackage.jdn;
import defpackage.ndn;
import defpackage.odn;
import defpackage.uxo;
import defpackage.zz0;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmq extends zzadu implements zzafd {
    private static final zzmq zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private zzaew zzi = zzaew.b;
    private String zze = "";
    private zzacr zzf = zzacr.b;
    private String zzg = "";

    static {
        zzmq zzmqVar = new zzmq();
        zzj = zzmqVar;
        zzadu.t(zzmq.class, zzmqVar);
    }

    private zzmq() {
    }

    public static zzmq E(zzacv zzacvVar, zzadf zzadfVar) {
        zzadu n = zzj.n();
        try {
            odn a = jdn.c.a(n.getClass());
            zz0 zz0Var = zzacvVar.c;
            if (zz0Var == null) {
                zz0Var = new zz0(zzacvVar);
            }
            a.f(n, zz0Var, zzadfVar);
            a.c(n);
            zzadu.w(n);
            return (zzmq) n;
        } catch (zzaeh e) {
            if (e.a) {
                throw new zzaeh(e.getMessage(), e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.d();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new zzaeh(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzmq F() {
        return zzj;
    }

    public final String A() {
        return this.zzg;
    }

    public final long B() {
        return this.zzh;
    }

    public final int C() {
        return this.zzi.size();
    }

    public final Map D() {
        return Collections.unmodifiableMap(this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", uxo.a});
        }
        if (i2 == 3) {
            return new zzmq();
        }
        if (i2 == 4) {
            return new zzmo(zzj);
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
        synchronized (zzmq.class) {
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

    public final String y() {
        return this.zze;
    }

    public final zzacr z() {
        return this.zzf;
    }
}
