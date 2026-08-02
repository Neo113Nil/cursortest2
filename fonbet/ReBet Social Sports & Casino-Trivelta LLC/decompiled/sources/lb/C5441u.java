package lb;

import a1.C1908a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;

/* renamed from: lb.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5441u {

    /* renamed from: c, reason: collision with root package name */
    public static C5441u f55795c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f55796a = false;

    /* renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f55797b;

    public static AuthCredential a(Intent intent) {
        AbstractC3191o.m(intent);
        return zze.m(((zzajb) E9.c.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzajb.CREATOR)).zzc(true));
    }

    public static C5441u b() {
        if (f55795c == null) {
            f55795c = new C5441u();
        }
        return f55795c;
    }

    public static void d(Context context) {
        C5441u c5441u = f55795c;
        c5441u.f55796a = false;
        if (c5441u.f55797b != null) {
            C1908a.b(context).e(f55795c.f55797b);
        }
        f55795c.f55797b = null;
    }

    public static /* synthetic */ void e(C5441u c5441u, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        d(context);
    }

    public final void c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f55797b = broadcastReceiver;
        C1908a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    public final boolean h(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f55796a) {
            return false;
        }
        c(activity, new C5421C(this, activity, taskCompletionSource));
        this.f55796a = true;
        return true;
    }

    public final boolean i(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return j(activity, taskCompletionSource, firebaseAuth, null);
    }

    public final boolean j(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.f55796a) {
            return false;
        }
        c(activity, new C5419A(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.f55796a = true;
        return true;
    }
}
