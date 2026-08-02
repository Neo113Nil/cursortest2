package com.google.android.gms.internal.location;

import V9.InterfaceC1750f;
import V9.InterfaceC1752h;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.InterfaceC3126e;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbv implements InterfaceC1752h {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final InterfaceC3126e interfaceC3126e) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InterfaceC3126e interfaceC3126e2 = InterfaceC3126e.this;
                if (task.isSuccessful()) {
                    interfaceC3126e2.setResult(Status.f32275f);
                    return;
                }
                if (task.isCanceled()) {
                    interfaceC3126e2.setFailedResult(Status.f32279j);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof b) {
                    interfaceC3126e2.setFailedResult(((b) exception).getStatus());
                } else {
                    interfaceC3126e2.setFailedResult(Status.f32277h);
                }
            }
        });
        return taskCompletionSource;
    }

    public final h addGeofences(f fVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return fVar.h(new zzbr(this, fVar, geofencingRequest, pendingIntent));
    }

    public final h removeGeofences(f fVar, PendingIntent pendingIntent) {
        return fVar.h(new zzbs(this, fVar, pendingIntent));
    }

    @Deprecated
    public final h addGeofences(f fVar, List<InterfaceC1750f> list, PendingIntent pendingIntent) {
        GeofencingRequest.a aVar = new GeofencingRequest.a();
        aVar.b(list);
        aVar.d(5);
        return fVar.h(new zzbr(this, fVar, aVar.c(), pendingIntent));
    }

    public final h removeGeofences(f fVar, List<String> list) {
        return fVar.h(new zzbt(this, fVar, list));
    }
}
