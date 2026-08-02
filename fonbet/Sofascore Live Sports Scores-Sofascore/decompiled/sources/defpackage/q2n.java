package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zac;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class q2n extends zac {
    public final TaskCompletionSource b;

    public q2n(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.b.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zabk zabkVar) {
        try {
            i(zabkVar);
        } catch (DeadObjectException e) {
            a(zai.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(zai.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    public abstract void i(zabk zabkVar);
}
