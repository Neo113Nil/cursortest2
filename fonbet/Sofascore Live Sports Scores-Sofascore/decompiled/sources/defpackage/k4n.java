package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzj;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k4n extends zzj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ k4n(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    public final void I1(Status status, Bundle bundle) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                j6n.i(status, bundle, taskCompletionSource);
                break;
            default:
                j6n.i(status, bundle, taskCompletionSource);
                break;
        }
    }
}
