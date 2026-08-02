package kb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class O implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f54381a;

    public O(FirebaseUser firebaseUser) {
        Objects.requireNonNull(firebaseUser);
        this.f54381a = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f54381a.n0()).M(null, (String) AbstractC3191o.m(((C5235u) task.getResult()).f()));
    }
}
