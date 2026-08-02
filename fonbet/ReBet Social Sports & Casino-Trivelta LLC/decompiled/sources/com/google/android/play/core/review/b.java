package com.google.android.play.core.review;

import Na.g;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes3.dex */
public final class b implements Na.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f36658a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f36659b = new Handler(Looper.getMainLooper());

    public b(g gVar) {
        this.f36658a = gVar;
    }

    @Override // Na.b
    public final Task a() {
        return this.f36658a.a();
    }

    @Override // Na.b
    public final Task b(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this, this.f36659b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
