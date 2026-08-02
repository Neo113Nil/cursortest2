package ga;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import k.AbstractC5140a;

/* renamed from: ga.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4370d extends AbstractC5140a {

    /* renamed from: d, reason: collision with root package name */
    public Status f47228d;

    /* renamed from: e, reason: collision with root package name */
    public PendingIntent f47229e;

    @Override // k.AbstractC5140a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Task task) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest.a(this.f47229e).a());
    }

    @Override // k.AbstractC5140a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5140a.C0780a getSynchronousResult(Context context, Task task) {
        if (!task.isComplete()) {
            throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
        }
        Exception exception = task.getException();
        if (exception instanceof com.google.android.gms.common.api.b) {
            this.f47228d = ((com.google.android.gms.common.api.b) exception).getStatus();
            if (exception instanceof j) {
                this.f47229e = ((j) exception).a();
            }
        }
        if (this.f47229e == null) {
            return new AbstractC5140a.C0780a(c(task));
        }
        return null;
    }

    public abstract Object c(Task task);
}
