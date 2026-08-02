package lb;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* renamed from: lb.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5437p implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5438q f55781a;

    public C5437p(RunnableC5438q runnableC5438q) {
        Objects.requireNonNull(runnableC5438q);
        this.f55781a = runnableC5438q;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        G9.a aVar;
        if (exc instanceof eb.l) {
            aVar = C5435n.f55766h;
            aVar.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f55781a.f55784b.d();
        }
    }
}
