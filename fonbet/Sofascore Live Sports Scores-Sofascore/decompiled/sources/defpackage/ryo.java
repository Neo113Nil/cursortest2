package defpackage;

import com.google.ads.interactivemedia.v3.internal.zzmu;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ryo extends rxo {
    public final /* synthetic */ TaskCompletionSource b;

    public ryo(vyo vyoVar, TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // defpackage.rxo
    public final void S1(zzmu zzmuVar) {
        this.b.trySetResult(zzmuVar.a);
    }

    @Override // defpackage.rxo
    public final void k(int i) {
        this.b.trySetException(new gyo(i));
    }
}
