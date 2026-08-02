package lb;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h0 implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55762a;

    public h0(C5444x c5444x, TaskCompletionSource taskCompletionSource) {
        this.f55762a = taskCompletionSource;
        Objects.requireNonNull(c5444x);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f55762a.setResult(new n0().d((String) obj).b());
    }
}
