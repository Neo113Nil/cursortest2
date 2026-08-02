package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import xsna.cv90;
import xsna.cxz0;
import xsna.dki0;
import xsna.ehz;
import xsna.exc0;
import xsna.fhz;
import xsna.hr01;
import xsna.rwz0;
import xsna.u380;
import xsna.xo9;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzen {
    private final cv90 zza(c cVar, dki0 dki0Var, @Nullable hr01 hr01Var, @Nullable PendingIntent pendingIntent) {
        return cVar.a(new zzel(this, cVar, dki0Var, hr01Var, pendingIntent));
    }

    private final cv90 zzb(c cVar, @Nullable hr01 hr01Var, @Nullable PendingIntent pendingIntent) {
        return cVar.b(new zzem(this, cVar, hr01Var, pendingIntent));
    }

    public final cv90<Status> add(c cVar, dki0 dki0Var, u380 u380Var) {
        cxz0 cxz0Var;
        rwz0 rwz0Var = rwz0.b;
        Looper d = cVar.d();
        rwz0Var.getClass();
        ehz a = fhz.a(d, u380Var, u380.class.getSimpleName());
        synchronized (rwz0Var.a) {
            try {
                ehz.a aVar = a.b;
                exc0.j(aVar, "Key must not be null");
                cxz0Var = (cxz0) rwz0Var.a.get(aVar);
                if (cxz0Var == null) {
                    cxz0Var = new cxz0(a);
                    rwz0Var.a.put(aVar, cxz0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza(cVar, dki0Var, cxz0Var, null);
    }

    public final cv90<DataSourcesResult> findDataSources(c cVar, DataSourcesRequest dataSourcesRequest) {
        return cVar.a(new zzek(this, cVar, dataSourcesRequest));
    }

    public final cv90<Status> remove(c cVar, u380 u380Var) {
        cxz0 cxz0Var;
        rwz0 rwz0Var = rwz0.b;
        Looper d = cVar.d();
        rwz0Var.getClass();
        ehz a = fhz.a(d, u380Var, u380.class.getSimpleName());
        synchronized (rwz0Var.a) {
            try {
                ehz.a aVar = a.b;
                if (aVar == null) {
                    cxz0Var = null;
                } else {
                    cxz0Var = (cxz0) rwz0Var.a.remove(aVar);
                    if (cxz0Var != null) {
                        cxz0Var.a.b = null;
                    }
                }
            } finally {
            }
        }
        return cxz0Var == null ? xo9.p(Status.f, cVar) : zzb(cVar, cxz0Var, null);
    }

    public final cv90<Status> add(c cVar, dki0 dki0Var, PendingIntent pendingIntent) {
        return zza(cVar, dki0Var, null, pendingIntent);
    }

    public final cv90<Status> remove(c cVar, PendingIntent pendingIntent) {
        return zzb(cVar, null, pendingIntent);
    }
}
