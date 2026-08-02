package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.fido.zzi;
import com.google.android.gms.internal.fido.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o2p extends zzl {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ o2p(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzm
    public final void q(Status status, PendingIntent pendingIntent) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                TaskUtil.a(status, pendingIntent, taskCompletionSource);
                break;
            case 1:
                TaskUtil.a(status, pendingIntent, taskCompletionSource);
                break;
            case 2:
                TaskUtil.a(status, new zzi(), taskCompletionSource);
                break;
            default:
                TaskUtil.a(status, new zzi(), taskCompletionSource);
                break;
        }
    }
}
