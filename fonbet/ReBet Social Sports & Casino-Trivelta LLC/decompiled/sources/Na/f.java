package Na;

import Oa.i;
import Oa.t;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class f extends Oa.g {

    /* renamed from: a, reason: collision with root package name */
    public final i f7980a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f7981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7982c;

    public f(g gVar, i iVar, TaskCompletionSource taskCompletionSource) {
        this.f7982c = gVar;
        this.f7980a = iVar;
        this.f7981b = taskCompletionSource;
    }

    @Override // Oa.h
    public void zzb(Bundle bundle) {
        t tVar = this.f7982c.f7984a;
        if (tVar != null) {
            tVar.r(this.f7981b);
        }
        this.f7980a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
