package kb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class N implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionCodeSettings f54379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f54380b;

    public N(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.f54379a = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.f54380b = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f54380b.n0()).M(this.f54379a, (String) AbstractC3191o.m(((C5235u) task.getResult()).f()));
    }
}
