package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dj2 implements ej2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dj2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ej2
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                ((q55) obj).d();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + ml4.X(this) + ']';
            default:
                return "DisposeOnCancel[" + ((q55) obj) + ']';
        }
    }
}
