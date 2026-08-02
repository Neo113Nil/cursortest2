package eg;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9176a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9177b;

    public /* synthetic */ h(int i5, Object obj) {
        this.f9176a = i5;
        this.f9177b = obj;
    }

    @Override // eg.i
    public final void a(Throwable th2) {
        switch (this.f9176a) {
            case 0:
                ((ScheduledFuture) this.f9177b).cancel(false);
                break;
            case 1:
                ((Function1) this.f9177b).invoke(th2);
                break;
            default:
                ((o0) this.f9177b).b();
                break;
        }
    }

    public final String toString() {
        switch (this.f9176a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f9177b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f9177b).getClass().getSimpleName() + '@' + c0.n(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f9177b) + ']';
        }
    }
}
