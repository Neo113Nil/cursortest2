package lb;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* renamed from: lb.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5445y implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55812b;

    public C5445y(C5441u c5441u, TaskCompletionSource taskCompletionSource, Context context) {
        this.f55811a = taskCompletionSource;
        this.f55812b = context;
        Objects.requireNonNull(c5441u);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f55811a.setException(exc);
        C5441u.d(this.f55812b);
    }
}
