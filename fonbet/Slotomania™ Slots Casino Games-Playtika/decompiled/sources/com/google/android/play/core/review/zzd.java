package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.safedk.android.utils.Logger;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public final class zzd implements ReviewManager {
    private final zzi zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());

    zzd(zzi zziVar) {
        this.zza = zziVar;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task<Void> launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.zza());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this, this.zzb, taskCompletionSource));
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task<ReviewInfo> requestReviewFlow() {
        return this.zza.zza();
    }
}
