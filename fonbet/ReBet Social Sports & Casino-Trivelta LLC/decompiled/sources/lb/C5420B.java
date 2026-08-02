package lb;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import java.util.Objects;

/* renamed from: lb.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5420B implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55675b;

    public C5420B(C5441u c5441u, TaskCompletionSource taskCompletionSource, Context context) {
        this.f55674a = taskCompletionSource;
        this.f55675b = context;
        Objects.requireNonNull(c5441u);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f55674a.setResult((AuthResult) obj);
        C5441u.d(this.f55675b);
    }
}
