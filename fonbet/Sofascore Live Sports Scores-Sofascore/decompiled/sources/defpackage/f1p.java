package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f1p extends pzo {
    @Override // defpackage.pzo
    public final void F(Bundle bundle) {
        super.F(bundle);
        int i = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i != 0) {
            taskCompletionSource.trySetException(new i5a(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}
