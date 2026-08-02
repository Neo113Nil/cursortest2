package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.Ff;
import com.ironsource.J5;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ada implements Ff.a, OnCompleteListener {
    public final /* synthetic */ ScheduledFuture a;

    public /* synthetic */ ada(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // com.ironsource.Ff.a
    public void cancel() {
        J5.a(this.a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.a.cancel(false);
    }
}
