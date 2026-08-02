package lb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import kb.C5226k;

/* loaded from: classes3.dex */
public final class i0 implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55764a;

    public i0(C5444x c5444x, TaskCompletionSource taskCompletionSource) {
        this.f55764a = taskCompletionSource;
        Objects.requireNonNull(c5444x);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C5444x.f55808b;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof C5226k) && ((C5226k) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f55764a.setException(exc);
        } else {
            this.f55764a.setResult(new n0().b());
        }
    }
}
