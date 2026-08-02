package lb;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes3.dex */
public abstract class K {
    public static /* synthetic */ Task a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) AbstractC3191o.m(task.getException());
        if (zzaen.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.q0() == null) {
                firebaseAuth.m0(new T(firebaseAuth.i(), firebaseAuth));
            }
            return d(firebaseAuth.q0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    public static Task d(T t10, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task b10 = t10.b(str, Boolean.FALSE, recaptchaAction);
        return b10.continueWithTask(continuation).continueWithTask(new O(str, t10, recaptchaAction, continuation));
    }

    public final Task b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: lb.L
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                K k10 = K.this;
                if (task.isSuccessful()) {
                    return k10.c((String) task.getResult());
                }
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) AbstractC3191o.m(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                return k10.c("NO_RECAPTCHA");
            }
        };
        T q02 = firebaseAuth.q0();
        return (q02 == null || !q02.e(str2)) ? c(null).continueWithTask(new Continuation() { // from class: lb.M
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return K.a(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        }) : d(q02, recaptchaAction, str, continuation);
    }

    public abstract Task c(String str);
}
