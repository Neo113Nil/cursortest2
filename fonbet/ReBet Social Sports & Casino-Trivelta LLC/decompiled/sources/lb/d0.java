package lb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f55749c = new d0();

    /* renamed from: a, reason: collision with root package name */
    public final H f55750a;

    /* renamed from: b, reason: collision with root package name */
    public final C5441u f55751b;

    public d0() {
        this(H.k(), C5441u.b());
    }

    public static d0 g() {
        return f55749c;
    }

    public final Task a() {
        return this.f55750a.a();
    }

    public final void b(Context context) {
        this.f55750a.b(context);
    }

    public final void c(FirebaseAuth firebaseAuth) {
        this.f55750a.i(firebaseAuth);
    }

    public final boolean d(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f55751b.i(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean e(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        return this.f55751b.j(activity, taskCompletionSource, firebaseAuth, firebaseUser);
    }

    public final Task f() {
        return this.f55750a.j();
    }

    public d0(H h10, C5441u c5441u) {
        this.f55750a = h10;
        this.f55751b = c5441u;
    }
}
