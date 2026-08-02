package defpackage;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tnn extends zzbd {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ tnn(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public void A(String str) {
        switch (this.a) {
            case 1:
                TaskUtil.a(str != null ? Status.e : new Status(3006, null, null, null), str, this.b);
                break;
            default:
                super.A(str);
                break;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public void N(ProxyResponse proxyResponse) {
        switch (this.a) {
            case 0:
                TaskUtil.a(new Status(proxyResponse.a, null, null, null), proxyResponse, this.b);
                break;
            default:
                super.N(proxyResponse);
                break;
        }
    }
}
