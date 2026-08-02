package e5;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.h0;
import com.google.firebase.messaging.x;
import java.util.concurrent.Executor;
import s7.d1;
import s7.e2;
import s7.f1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8657a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8658b;

    public /* synthetic */ p(int i5, Object obj) {
        this.f8657a = i5;
        this.f8658b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8657a) {
            case 0:
                ((Executor) this.f8658b).execute(new o(runnable, 0));
                break;
            case 1:
                ((Handler) ((x) this.f8658b).f6184c).post(runnable);
                break;
            case 2:
                ((h0) this.f8658b).post(runnable);
                break;
            case 3:
                d1 d1Var = ((f1) ((e2) this.f8658b).f3328a).f22746g;
                f1.m(d1Var);
                d1Var.s(runnable);
                break;
            default:
                ((h0) this.f8658b).post(runnable);
                break;
        }
    }

    public p() {
        this.f8657a = 4;
        h0 h0Var = new h0(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f8658b = h0Var;
    }

    public p(Looper looper) {
        this.f8657a = 2;
        this.f8658b = new h0(looper, 3);
    }
}
