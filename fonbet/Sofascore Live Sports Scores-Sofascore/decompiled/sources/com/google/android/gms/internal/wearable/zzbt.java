package com.google.android.gms.internal.wearable;

import defpackage.d6o;
import defpackage.opn;
import defpackage.s6o;
import defpackage.zz0;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbt implements zzes {
    static {
        zzcs zzcsVar = zzcs.b;
        int i = opn.a;
    }

    @Override // com.google.android.gms.internal.wearable.zzes
    public final zzel a(zzcg zzcgVar, zzcs zzcsVar) {
        zzcj q = zzcgVar.q();
        int i = zzdg.zzd;
        zzdg zzdgVar = (zzdg) ((zzdc) this).a.d(4, null);
        try {
            s6o a = d6o.c.a(zzdgVar.getClass());
            zz0 zz0Var = q.b;
            if (zz0Var == null) {
                zz0Var = new zz0(q);
            }
            a.e(zzdgVar, zz0Var, zzcsVar);
            a.c(zzdgVar);
            q.f();
            if (zzdgVar.c()) {
                return zzdgVar;
            }
            throw new zzdv(new zzfh().getMessage());
        } catch (zzdv e) {
            throw e;
        } catch (zzfh e2) {
            throw new zzdv(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzdv) {
                throw ((zzdv) e3.getCause());
            }
            throw new zzdv(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzdv) {
                throw ((zzdv) e4.getCause());
            }
            throw e4;
        }
    }
}
