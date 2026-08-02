package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.a70;
import defpackage.c0l;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zag extends zac {
    public final e b;
    public final TaskCompletionSource c;
    public final StatusExceptionMapper d;

    public zag(int i, e eVar, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.c = taskCompletionSource;
        this.b = eVar;
        this.d = statusExceptionMapper;
        if (i == 2 && eVar.b) {
            a70.p("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.c.trySetException(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zaaa zaaaVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = zaaaVar.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new c0l(zaaaVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zabk zabkVar) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            e eVar = this.b;
            eVar.d.a.u(zabkVar.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(zai.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] f(zabk zabkVar) {
        return this.b.a;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean g(zabk zabkVar) {
        return this.b.b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int h(zabk zabkVar) {
        return this.b.c;
    }
}
