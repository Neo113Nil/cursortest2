package lb;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import java.util.Objects;

/* renamed from: lb.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5443w implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f55805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55806b;

    public C5443w(C5441u c5441u, TaskCompletionSource taskCompletionSource, Context context) {
        this.f55805a = taskCompletionSource;
        this.f55806b = context;
        Objects.requireNonNull(c5441u);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f55805a.setResult((AuthResult) obj);
        C5441u.d(this.f55806b);
    }
}
