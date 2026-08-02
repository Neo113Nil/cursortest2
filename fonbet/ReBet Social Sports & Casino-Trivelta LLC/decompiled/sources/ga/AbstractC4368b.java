package ga;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* renamed from: ga.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4368b extends AbstractC4370d {
    @Override // ga.AbstractC4370d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4367a c(Task task) {
        if (task.isSuccessful()) {
            return new C4367a(task.getResult(), Status.f32275f);
        }
        if (task.isCanceled()) {
            return new C4367a(new Status(16, "The task has been canceled."));
        }
        Status status = this.f47228d;
        return status != null ? new C4367a(status) : new C4367a(Status.f32277h);
    }

    public C4367a e(int i10, Intent intent) {
        if (i10 != -1) {
            return i10 != 0 ? new C4367a(null, Status.f32277h) : new C4367a(null, Status.f32279j);
        }
        Object f10 = intent != null ? f(intent) : null;
        return f10 != null ? new C4367a(f10, Status.f32275f) : new C4367a(null, Status.f32277h);
    }

    public abstract Object f(Intent intent);
}
