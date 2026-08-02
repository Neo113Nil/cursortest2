package lb;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* renamed from: lb.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5442v implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55800b;

    public C5442v(C5441u c5441u, TaskCompletionSource taskCompletionSource, Context context) {
        this.f55799a = taskCompletionSource;
        this.f55800b = context;
        Objects.requireNonNull(c5441u);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f55799a.setException(exc);
        C5441u.d(this.f55800b);
    }
}
