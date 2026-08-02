package defpackage;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth_blockstore.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aap extends zze {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ aap(int i, TaskCompletionSource taskCompletionSource) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public void J2(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        switch (this.a) {
            case 0:
                TaskUtil.a(status, retrieveBytesResponse, this.b);
                break;
            default:
                super.J2(status, retrieveBytesResponse);
                break;
        }
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public void u1(Status status, byte[] bArr) {
        switch (this.a) {
            case 1:
                TaskUtil.a(status, bArr, this.b);
                break;
            default:
                super.u1(status, bArr);
                break;
        }
    }
}
