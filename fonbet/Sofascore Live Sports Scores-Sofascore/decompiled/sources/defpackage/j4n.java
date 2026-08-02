package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ j4n(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                taskCompletionSource.trySetException(new IOException(Payload.RESPONSE_TIMEOUT));
                break;
            case 1:
                zzcn.d.a("get checkbox consent timed out", new Object[0]);
                taskCompletionSource.trySetResult(Boolean.FALSE);
                break;
            case 2:
                taskCompletionSource.setResult(new zzgae(new jbo()));
                break;
            default:
                taskCompletionSource.setResult(new u0p(new g1p()));
                break;
        }
    }
}
