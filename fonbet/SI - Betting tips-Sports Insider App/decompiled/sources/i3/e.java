package i3;

import android.net.ConnectivityManager;
import androidx.lifecycle.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements j3.d {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f10907a;

    public e(ConnectivityManager connManager) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.f10907a = connManager;
    }

    @Override // j3.d
    public final hg.c a(e3.f constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return new hg.c(new o(constraints, this, (Continuation) null, 12), kotlin.coroutines.g.f19227a, -2, gg.a.f10048a);
    }

    @Override // j3.d
    public final boolean b(m3.o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.a() != null;
    }

    @Override // j3.d
    public final boolean c(m3.o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (b(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
