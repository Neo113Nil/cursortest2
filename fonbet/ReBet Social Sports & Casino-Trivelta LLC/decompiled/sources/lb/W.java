package lb;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class W implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f55712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f55714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f55715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f55716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f55717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55718g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C5444x f55719h;

    public W(C5444x c5444x, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10, boolean z11, d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f55712a = firebaseAuth;
        this.f55713b = str;
        this.f55714c = activity;
        this.f55715d = z10;
        this.f55716e = z11;
        this.f55717f = d0Var;
        this.f55718g = taskCompletionSource;
        Objects.requireNonNull(c5444x);
        this.f55719h = c5444x;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C5444x.f55808b;
        Log.e(str, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f55712a.q0().d("PHONE_PROVIDER")) {
            this.f55719h.c(this.f55712a, this.f55713b, this.f55714c, this.f55715d, this.f55716e, this.f55717f, this.f55718g);
        } else {
            this.f55718g.setResult(new n0().b());
        }
    }
}
