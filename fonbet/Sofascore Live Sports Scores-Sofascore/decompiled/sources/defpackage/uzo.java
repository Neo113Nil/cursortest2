package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uzo extends IStatusCallback.Stub {
    public final /* synthetic */ TaskCompletionSource a;

    public uzo(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void I2(Status status) {
        int i = status.a;
        TaskCompletionSource taskCompletionSource = this.a;
        if (i == 6) {
            taskCompletionSource.trySetException(ApiExceptionUtil.a(status));
        } else {
            TaskUtil.a(status, null, taskCompletionSource);
        }
    }
}
