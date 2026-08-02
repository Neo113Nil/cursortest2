package kb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class P implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f54382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionCodeSettings f54383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f54384c;

    public P(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f54382a = str;
        this.f54383b = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.f54384c = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f54384c.n0()).Y((String) AbstractC3191o.m(((C5235u) task.getResult()).f()), this.f54382a, this.f54383b);
    }
}
