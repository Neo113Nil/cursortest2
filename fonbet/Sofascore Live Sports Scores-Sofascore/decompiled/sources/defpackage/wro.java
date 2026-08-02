package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wro extends zzd {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ wro(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void X1(Status status) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                taskCompletionSource.trySetException(new ApiException(status));
                break;
            default:
                taskCompletionSource.trySetException(new ApiException(status));
                break;
        }
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzb(boolean z) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                taskCompletionSource.setResult(Boolean.valueOf(z));
                break;
            default:
                taskCompletionSource.setResult(Boolean.valueOf(z));
                break;
        }
    }
}
