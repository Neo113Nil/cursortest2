package cc;

import com.android.billingclient.api.k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import eg.r;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements w7.c, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3728b;

    public /* synthetic */ b(r rVar, int i5) {
        this.f3727a = i5;
        this.f3728b = rVar;
    }

    public void a(k p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        int i5 = p02.f4037a;
        r rVar = this.f3728b;
        if (i5 == 0) {
            rVar.Q(null);
        } else {
            rVar.Q(null);
        }
    }

    @Override // w7.c
    public void c(Exception exception) {
        switch (this.f3727a) {
            case 0:
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f3728b.h0(exception);
                break;
            default:
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f3728b.h0(exception);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.f3728b.Q(Boolean.valueOf(task.k() && task.isSuccessful()));
    }
}
