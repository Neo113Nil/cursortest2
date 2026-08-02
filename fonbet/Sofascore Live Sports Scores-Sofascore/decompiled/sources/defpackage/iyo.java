package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class iyo extends txo {
    public final /* synthetic */ TaskCompletionSource b;

    public iyo(vyo vyoVar, TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override // defpackage.txo
    public final void F(Bundle bundle) {
        this.b.trySetResult(bundle.getString("newToken"));
    }

    @Override // defpackage.txo
    public final void k(int i) {
        this.b.trySetException(new gyo(i));
    }
}
