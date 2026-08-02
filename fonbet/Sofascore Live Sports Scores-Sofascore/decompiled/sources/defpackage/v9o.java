package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.cast.zzfu;
import com.google.android.gms.internal.cast.zzfv;
import com.google.android.gms.internal.cast.zzgc;
import com.google.android.gms.internal.cast.zzgi;
import com.google.android.gms.internal.cast.zzgj;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v9o extends zzgj {
    public final /* synthetic */ TaskCompletionSource a;

    public v9o(zzfu zzfuVar, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.cast.zzgj, com.google.android.gms.internal.cast.zzgf
    public final void W0(Status status, zzgc zzgcVar) {
        zzgi zzgiVar = new zzgi(Status.e, zzgcVar);
        zzfv zzfvVar = new zzfv();
        zzfvVar.a = zzgiVar;
        TaskUtil.a(status, zzfvVar, this.a);
    }
}
