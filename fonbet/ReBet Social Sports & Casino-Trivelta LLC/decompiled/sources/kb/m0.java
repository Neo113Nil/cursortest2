package kb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.gms.internal.p002firebaseauthapi.zzaix;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f54407a;

    public m0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f54407a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) AbstractC3191o.m(task.getException()));
        }
        zzair zzairVar = (zzair) task.getResult();
        if (zzairVar instanceof zzaix) {
            zzaix zzaixVar = (zzaix) zzairVar;
            return Tasks.forResult(new lb.Z(AbstractC3191o.g(zzaixVar.zzf()), AbstractC3191o.g(zzaixVar.zze()), zzaixVar.zzc(), zzaixVar.zzb(), zzaixVar.zzd(), AbstractC3191o.g(zzaixVar.zza()), this.f54407a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + zzairVar.getClass().getName() + ".");
    }
}
