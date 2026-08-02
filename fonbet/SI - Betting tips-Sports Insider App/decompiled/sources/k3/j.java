package k3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.google.firebase.messaging.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends d {

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f18806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, x taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f18798b.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f18806g = (ConnectivityManager) systemService;
    }

    @Override // k3.f
    public final Object a() {
        return i.a(this.f18806g);
    }

    @Override // k3.d
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // k3.d
    public final void f(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            e3.x.e().a(i.f18805a, "Network broadcast received");
            b(i.a(this.f18806g));
        }
    }
}
