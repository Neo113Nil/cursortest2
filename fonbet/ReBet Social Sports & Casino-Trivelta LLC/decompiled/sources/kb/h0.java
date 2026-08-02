package kb;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import lb.C5444x;

/* loaded from: classes3.dex */
public final class h0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.auth.a f54395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f54397c;

    public h0(FirebaseAuth firebaseAuth, com.google.firebase.auth.a aVar, String str) {
        this.f54395a = aVar;
        this.f54396b = str;
        Objects.requireNonNull(firebaseAuth);
        this.f54397c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && C5444x.i(exception)) {
                FirebaseAuth.l0((eb.k) exception, this.f54395a, this.f54396b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        this.f54397c.k0(this.f54395a, (lb.k0) task.getResult());
    }
}
