package lb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: lb.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5421C extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f55676a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f55677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5441u f55678c;

    public C5421C(C5441u c5441u, Activity activity, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(c5441u);
        this.f55678c = c5441u;
        this.f55676a = new WeakReference(activity);
        this.f55677b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f55676a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f55677b.setException(zzaen.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C5441u.d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                C5441u.e(this.f55678c, intent, this.f55677b, context);
                return;
            }
            this.f55677b.setException(zzaen.zza(AbstractC5433l.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (b0.d(intent)) {
            this.f55677b.setException(zzaen.zza(b0.a(intent)));
            C5441u.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f55677b.setException(zzaen.zza(AbstractC5433l.a("WEB_CONTEXT_CANCELED")));
            C5441u.d(context);
        }
    }
}
