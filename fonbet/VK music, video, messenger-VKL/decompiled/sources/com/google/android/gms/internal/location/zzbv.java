package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import xsna.cv90;
import xsna.rnt;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class zzbv {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final ue6 ue6Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ue6 ue6Var2 = ue6.this;
                if (task.isSuccessful()) {
                    ue6Var2.setResult(Status.f);
                    return;
                }
                if (task.isCanceled()) {
                    ue6Var2.setFailedResult(Status.j);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    ue6Var2.setFailedResult(((ApiException) exception).d());
                } else {
                    ue6Var2.setFailedResult(Status.h);
                }
            }
        });
        return taskCompletionSource;
    }

    public final cv90<Status> addGeofences(c cVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return cVar.b(new zzbr(this, cVar, geofencingRequest, pendingIntent));
    }

    public final cv90<Status> removeGeofences(c cVar, PendingIntent pendingIntent) {
        return cVar.b(new zzbs(this, cVar, pendingIntent));
    }

    @Deprecated
    public final cv90<Status> addGeofences(c cVar, List<rnt> list, PendingIntent pendingIntent) {
        GeofencingRequest.a aVar = new GeofencingRequest.a();
        aVar.a(list);
        aVar.c();
        return cVar.b(new zzbr(this, cVar, aVar.b(), pendingIntent));
    }

    public final cv90<Status> removeGeofences(c cVar, List<String> list) {
        return cVar.b(new zzbt(this, cVar, list));
    }
}
