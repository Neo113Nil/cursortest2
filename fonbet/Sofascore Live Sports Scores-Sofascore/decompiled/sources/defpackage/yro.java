package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yro implements BaseImplementation.ResultHolder {
    public final TaskCompletionSource a;

    public yro(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void a(Result result) {
        Status status = (Status) result;
        int i = status.a;
        TaskCompletionSource taskCompletionSource = this.a;
        if (i == 0) {
            taskCompletionSource.setResult(Boolean.TRUE);
        } else if (i == 4002) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            taskCompletionSource.setException(new ApiException(status));
        }
    }
}
