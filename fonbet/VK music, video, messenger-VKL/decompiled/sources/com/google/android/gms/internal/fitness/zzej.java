package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import xsna.cv90;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzej {
    private final cv90 zza(c cVar, Subscription subscription) {
        return cVar.a(new zzee(this, cVar, subscription));
    }

    public final cv90<ListSubscriptionsResult> listSubscriptions(c cVar) {
        return cVar.a(new zzec(this, cVar));
    }

    public final cv90<Status> subscribe(c cVar, DataSource dataSource) {
        exc0.k("Must call setDataSource() or setDataType()", dataSource != null);
        return zza(cVar, new Subscription(dataSource, null, -1L, 2, 0));
    }

    public final cv90<Status> unsubscribe(c cVar, Subscription subscription) {
        DataType dataType = subscription.c;
        if (dataType != null) {
            return unsubscribe(cVar, dataType);
        }
        DataSource dataSource = subscription.b;
        exc0.i(dataSource);
        return unsubscribe(cVar, dataSource);
    }

    public final cv90<ListSubscriptionsResult> listSubscriptions(c cVar, DataType dataType) {
        return cVar.a(new zzed(this, cVar, dataType));
    }

    public final cv90<Status> subscribe(c cVar, DataType dataType) {
        exc0.k("Must call setDataSource() or setDataType()", dataType != null);
        return zza(cVar, new Subscription(null, dataType, -1L, 2, 0));
    }

    public final cv90<Status> unsubscribe(c cVar, DataSource dataSource) {
        return cVar.b(new zzeg(this, cVar, dataSource));
    }

    public final cv90<Status> unsubscribe(c cVar, DataType dataType) {
        return cVar.b(new zzef(this, cVar, dataType));
    }
}
