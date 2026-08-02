package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.internal.zzaf;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cbo extends zzaf {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public cbo(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        this.a = 0;
        this.b = taskCompletionSource;
        Objects.requireNonNull(zznVar);
    }

    @Override // com.google.android.gms.cast.internal.zzag
    public final void F(Bundle bundle) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                taskCompletionSource.setResult(bundle);
                break;
            case 1:
                taskCompletionSource.setResult(bundle);
                break;
            default:
                taskCompletionSource.setResult(bundle);
                break;
        }
    }

    public /* synthetic */ cbo(zzn zznVar, TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }
}
