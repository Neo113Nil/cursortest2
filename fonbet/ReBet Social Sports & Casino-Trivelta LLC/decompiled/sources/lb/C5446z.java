package lb;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import java.util.Objects;

/* renamed from: lb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5446z implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55814b;

    public C5446z(C5441u c5441u, TaskCompletionSource taskCompletionSource, Context context) {
        this.f55813a = taskCompletionSource;
        this.f55814b = context;
        Objects.requireNonNull(c5441u);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f55813a.setResult((AuthResult) obj);
        C5441u.d(this.f55814b);
    }
}
