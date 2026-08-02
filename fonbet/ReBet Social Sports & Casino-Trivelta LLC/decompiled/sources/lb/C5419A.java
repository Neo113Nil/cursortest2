package lb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: lb.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5419A extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f55669a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f55670b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f55671c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseUser f55672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5441u f55673e;

    public C5419A(C5441u c5441u, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Objects.requireNonNull(c5441u);
        this.f55673e = c5441u;
        this.f55669a = new WeakReference(activity);
        this.f55670b = taskCompletionSource;
        this.f55671c = firebaseAuth;
        this.f55672d = firebaseUser;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f55669a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f55670b.setException(zzaen.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C5441u.d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (b0.d(intent)) {
                this.f55670b.setException(zzaen.zza(b0.a(intent)));
                C5441u.d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f55670b.setException(zzaen.zza(AbstractC5433l.a("WEB_CONTEXT_CANCELED")));
                    C5441u.d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f55671c.B(C5441u.a(intent)).addOnSuccessListener(new C5443w(r0, r1, context)).addOnFailureListener(new C5440t(this.f55673e, this.f55670b, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            this.f55672d.N(C5441u.a(intent)).addOnSuccessListener(new C5446z(r0, r1, context)).addOnFailureListener(new C5442v(this.f55673e, this.f55670b, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            this.f55672d.O(C5441u.a(intent)).addOnSuccessListener(new C5420B(r0, r1, context)).addOnFailureListener(new C5445y(this.f55673e, this.f55670b, context));
        } else {
            this.f55670b.setException(zzaen.zza(AbstractC5433l.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
