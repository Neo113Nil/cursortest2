package com.google.android.gms.internal.measurement;

import defpackage.jdn;
import defpackage.ldn;
import defpackage.ndn;
import defpackage.odn;
import defpackage.w7n;
import defpackage.zz0;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpr extends zzadu implements zzafd {
    private static final zzpr zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzaef zzg = ldn.e;

    static {
        zzpr zzprVar = new zzpr();
        zzl = zzprVar;
        zzadu.t(zzpr.class, zzprVar);
    }

    private zzpr() {
    }

    public static zzpr A(InputStream inputStream, zzadf zzadfVar) {
        zzpr zzprVar = zzl;
        zzacv h = zzacv.h(inputStream, 4096);
        zzadu n = zzprVar.n();
        try {
            odn a = jdn.c.a(n.getClass());
            zz0 zz0Var = h.c;
            if (zz0Var == null) {
                zz0Var = new zz0(h);
            }
            a.f(n, zz0Var, zzadfVar);
            a.c(n);
            zzadu.w(n);
            return (zzpr) n;
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

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", w7n.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new zzpr();
        }
        if (i2 == 4) {
            return new zzpq(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzm;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzpr.class) {
            try {
                zzafjVar = zzm;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzl);
                    zzm = zzafjVar;
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

    public final boolean z() {
        return this.zzf;
    }
}
