package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import xsna.cv90;
import xsna.g0a;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzcj {
    public static cv90 zza(Task task, final zzcg zzcgVar, final zzcg zzcgVar2) {
        final zzcf zzcfVar = new zzcf(zzcgVar2);
        task.addOnSuccessListener(new OnSuccessListener(zzcgVar) { // from class: com.google.android.gms.internal.cast.zzci
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                o100 o100Var = g0a.n;
                zzcf.this.setResult(new Status(0));
            }
        }).addOnFailureListener(new OnFailureListener(zzcgVar2) { // from class: com.google.android.gms.internal.cast.zzch
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                Status status = new Status(8, "unknown error");
                if (exc instanceof ApiException) {
                    ApiException apiException = (ApiException) exc;
                    status = new Status(apiException.g(), apiException.getMessage());
                }
                zzcf zzcfVar2 = zzcf.this;
                o100 o100Var = g0a.n;
                zzcfVar2.setResult(status);
            }
        });
        return zzcfVar;
    }
}
