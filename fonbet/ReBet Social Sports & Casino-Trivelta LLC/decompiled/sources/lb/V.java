package lb;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class V implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f55711a;

    public V(T t10, RecaptchaAction recaptchaAction) {
        this.f55711a = recaptchaAction;
        Objects.requireNonNull(t10);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f55711a);
        }
        Exception exc = (Exception) AbstractC3191o.m(task.getException());
        if (!(exc instanceof P)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
