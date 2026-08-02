package lb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzam;
import java.util.Objects;
import kb.C5235u;

/* renamed from: lb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5429h implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5430i f55761a;

    public C5429h(C5430i c5430i) {
        Objects.requireNonNull(c5430i);
        this.f55761a = c5430i;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        zzaf zzafVar;
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) AbstractC3191o.m(task.getException()));
        }
        String f10 = ((C5235u) task.getResult()).f();
        zzafVar = this.f55761a.f55763a;
        return Tasks.forResult(zzam.h(f10, zzafVar));
    }
}
