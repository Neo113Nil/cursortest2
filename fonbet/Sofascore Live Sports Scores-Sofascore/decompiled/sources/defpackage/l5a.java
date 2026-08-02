package defpackage;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l5a implements InstallReferrerStateListener, OnCompleteListener {
    public final /* synthetic */ lj2 a;

    public /* synthetic */ l5a(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        lj2 lj2Var = this.a;
        if (exception != null) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(new u2g(exception));
        } else if (task.isCanceled()) {
            lj2Var.a(null);
        } else {
            p2g p2gVar2 = w2g.b;
            lj2Var.resumeWith(task.getResult());
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(Integer.valueOf(i));
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }
}
