package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.f5o0;
import xsna.ouf0;
import xsna.x6k0;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes12.dex */
public final class zzab extends x6k0 {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // xsna.x6k0
    public final Task<Void> startSmsRetriever() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = new Feature[]{zzac.zzc};
        a.e = 1567;
        return doWrite(a.a());
    }

    @Override // xsna.x6k0
    public final Task<Void> startSmsUserConsent(@Nullable final String str) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = new Feature[]{zzac.zzd};
        a.e = 1568;
        return doWrite(a.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
