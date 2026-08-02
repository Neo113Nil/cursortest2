package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr implements AppSetIdClient {
    public final zzp a;
    public final zzl b;

    public zzr(Context context) {
        zzl zzlVar;
        this.a = new zzp(context, GoogleApiAvailabilityLight.b);
        synchronized (zzl.class) {
            zzlVar = zzl.d;
            if (zzlVar == null) {
                zzlVar = new zzl(context.getApplicationContext());
                zzl.d = zzlVar;
            }
        }
        this.b = zzlVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        return this.a.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful() && !task.isCanceled()) {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        int i = ((ApiException) exception).a.a;
                        if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                            return zzr.this.b.getAppSetIdInfo();
                        }
                        if (i == 43000) {
                            return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                        }
                        if (i == 15) {
                            return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                        }
                    }
                }
                return task;
            }
        });
    }
}
