package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.p001authapiphone.zzi;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l4n extends zzi {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ l4n(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzj
    public final void x1(Status status) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                TaskUtil.a(status, null, taskCompletionSource);
                break;
            default:
                TaskUtil.a(status, null, taskCompletionSource);
                break;
        }
    }
}
