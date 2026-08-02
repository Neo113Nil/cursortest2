package com.google.android.gms.internal.measurement;

import defpackage.j8n;
import defpackage.jdn;
import defpackage.odn;
import defpackage.zz0;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzacd implements zzafj {
    static {
        zzadf zzadfVar = zzadf.b;
        int i = j8n.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzafj
    public final zzadu a(InputStream inputStream, zzadf zzadfVar) {
        zzacv h = zzacv.h(inputStream, 4096);
        int i = zzadu.zzd;
        zzadu n = ((zzadq) this).a.n();
        try {
            odn a = jdn.c.a(n.getClass());
            zz0 zz0Var = h.c;
            if (zz0Var == null) {
                zz0Var = new zz0(h);
            }
            a.f(n, zz0Var, zzadfVar);
            a.c(n);
            h.m(0);
            if (zzadu.v(n, true)) {
                return n;
            }
            throw new zzafy().d();
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
}
