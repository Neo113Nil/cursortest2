package lb;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: classes3.dex */
public final class O implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f55697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f55698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Continuation f55699d;

    public O(String str, T t10, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f55696a = str;
        this.f55697b = t10;
        this.f55698c = recaptchaAction;
        this.f55699d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzaen.zzc((Exception) AbstractC3191o.m(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f55696a);
        }
        return this.f55697b.b(this.f55696a, Boolean.TRUE, this.f55698c).continueWithTask(this.f55699d);
    }
}
