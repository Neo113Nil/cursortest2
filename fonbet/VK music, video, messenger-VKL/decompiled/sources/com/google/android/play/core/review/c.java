package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.fc01;
import xsna.kf01;
import xsna.lf01;
import xsna.ul01;
import xsna.up01;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class c extends fc01 {
    public final lf01 a;
    public final TaskCompletionSource b;
    public final /* synthetic */ kf01 e;

    public c(kf01 kf01Var, TaskCompletionSource taskCompletionSource) {
        lf01 lf01Var = new lf01("OnRequestInstallCallback");
        this.e = kf01Var;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.a = lf01Var;
        this.b = taskCompletionSource;
    }

    public final void j(Bundle bundle) throws RemoteException {
        up01 up01Var = this.e.a;
        if (up01Var != null) {
            TaskCompletionSource taskCompletionSource = this.b;
            synchronized (up01Var.f) {
                up01Var.e.remove(taskCompletionSource);
            }
            synchronized (up01Var.f) {
                try {
                    if (up01Var.k.get() <= 0 || up01Var.k.decrementAndGet() <= 0) {
                        up01Var.a().post(new ul01(up01Var));
                    } else {
                        up01Var.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } finally {
                }
            }
        }
        this.a.a("onGetLaunchReviewFlowInfo", new Object[0]);
        this.b.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
