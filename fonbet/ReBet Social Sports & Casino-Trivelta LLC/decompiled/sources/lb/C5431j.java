package lb;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzal;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zze;
import java.util.Objects;

/* renamed from: lb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5431j implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzal f55765a;

    public C5431j(zzal zzalVar) {
        Objects.requireNonNull(zzalVar);
        this.f55765a = zzalVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        zze zzeVar;
        zze zzeVar2;
        zze zzeVar3;
        zzeVar = this.f55765a.f37691d;
        if (zzeVar == null) {
            return task;
        }
        if (task.isSuccessful()) {
            AuthResult authResult = (AuthResult) task.getResult();
            zzaf zzafVar = (zzaf) authResult.getUser();
            zzx zzxVar = (zzx) authResult.Q();
            zzeVar3 = this.f55765a.f37691d;
            return Tasks.forResult(new zzz(zzafVar, zzxVar, zzeVar3));
        }
        Exception exception = task.getException();
        if (exception instanceof kb.r) {
            zzeVar2 = this.f55765a.f37691d;
            ((kb.r) exception).c(zzeVar2);
        }
        return Tasks.forException(exception);
    }
}
