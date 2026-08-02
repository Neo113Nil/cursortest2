package Na;

import Oa.i;
import Oa.t;
import Oa.w;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final i f7983c = new i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    public t f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7985b;

    public g(Context context) {
        this.f7985b = context.getPackageName();
        if (w.a(context)) {
            this.f7984a = new t(context, f7983c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), d.f7977a, null, null);
        }
    }

    public final Task a() {
        i iVar = f7983c;
        iVar.d("requestInAppReview (%s)", this.f7985b);
        if (this.f7984a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new a(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7984a.p(new e(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
