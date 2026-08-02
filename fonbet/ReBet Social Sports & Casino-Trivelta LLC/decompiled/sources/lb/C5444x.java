package lb;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzafz;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import kb.C5226k;
import kb.C5229n;

/* renamed from: lb.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5444x {

    /* renamed from: b, reason: collision with root package name */
    public static final String f55808b = "x";

    /* renamed from: c, reason: collision with root package name */
    public static final C5444x f55809c = new C5444x();

    /* renamed from: a, reason: collision with root package name */
    public String f55810a;

    public static C5444x b() {
        return f55809c;
    }

    public static /* synthetic */ void e(C5444x c5444x, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z10, boolean z11, d0 d0Var, Task task) {
        if (!task.isSuccessful()) {
            Log.e(f55808b, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.q0() == null || !firebaseAuth.q0().e("PHONE_PROVIDER")) {
            c5444x.c(firebaseAuth, str, activity, z10, z11, d0Var, taskCompletionSource);
        } else {
            firebaseAuth.q0().b(firebaseAuth.o(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new g0(c5444x, taskCompletionSource)).addOnFailureListener(new W(c5444x, firebaseAuth, str, activity, z10, z11, d0Var, taskCompletionSource));
        }
    }

    public static /* synthetic */ void f(C5444x c5444x, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, d0 d0Var, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new n0().a(((IntegrityTokenResponse) task.getResult()).token()).b());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f55808b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        c5444x.d(firebaseAuth, d0Var, activity, taskCompletionSource);
    }

    public static boolean i(Exception exc) {
        if (exc instanceof C5229n) {
            return true;
        }
        return (exc instanceof C5226k) && ((C5226k) exc).a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    public final Task a(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z10, boolean z11, boolean z12, final RecaptchaAction recaptchaAction) {
        C5425d c5425d = (C5425d) firebaseAuth.l();
        final d0 g10 = d0.g();
        if (zzagl.zza(firebaseAuth.i()) || c5425d.h()) {
            return Tasks.forResult(new n0().b());
        }
        String str2 = f55808b;
        Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z11 + ", ForceRecaptchav2Flow from firebaseSettings = " + c5425d.f());
        boolean z13 = z11 || c5425d.f();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task f10 = g10.f();
        if (f10 != null) {
            if (f10.isSuccessful()) {
                return Tasks.forResult(new n0().d((String) f10.getResult()).b());
            }
            Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + f10.getException().getMessage());
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (z13 || z12) {
            c(firebaseAuth, str, activity, z10, z13, g10, taskCompletionSource);
        } else {
            Task q10 = firebaseAuth.q();
            final boolean z14 = false;
            OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: lb.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C5444x.e(C5444x.this, taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z10, z14, g10, task);
                }
            };
            taskCompletionSource = taskCompletionSource;
            q10.addOnCompleteListener(onCompleteListener);
        }
        return taskCompletionSource.getTask();
    }

    public final void c(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11, final d0 d0Var, final TaskCompletionSource taskCompletionSource) {
        if (!z10 || z11) {
            d(firebaseAuth, d0Var, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.f55810a) ? Tasks.forResult(new zzahr(this.f55810a)) : firebaseAuth.K()).continueWithTask(firebaseAuth.C0(), new f0(this, str, IntegrityManagerFactory.create(firebaseAuth.i().l()))).addOnCompleteListener(new OnCompleteListener() { // from class: lb.e0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C5444x.f(C5444x.this, taskCompletionSource, firebaseAuth, d0Var, activity, task);
                }
            });
        }
    }

    public final void d(FirebaseAuth firebaseAuth, d0 d0Var, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new C5229n());
            return;
        }
        H.e(firebaseAuth.i().l(), firebaseAuth);
        AbstractC3191o.m(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (C5441u.b().h(activity, taskCompletionSource2)) {
            new zzafz(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzaen.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new h0(this, taskCompletionSource)).addOnFailureListener(new i0(this, taskCompletionSource));
    }
}
