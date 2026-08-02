package k3;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.firebase.messaging.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f18803f;

    /* renamed from: g, reason: collision with root package name */
    public final i3.d f18804g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, x taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f18798b.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f18803f = (ConnectivityManager) systemService;
        this.f18804g = new i3.d(1, this);
    }

    @Override // k3.f
    public final Object a() {
        return i.a(this.f18803f);
    }

    @Override // k3.f
    public final void c() {
        try {
            e3.x.e().a(i.f18805a, "Registering network callback");
            n3.g.a(this.f18803f, this.f18804g);
        } catch (IllegalArgumentException e7) {
            e3.x.e().d(i.f18805a, "Received exception while registering network callback", e7);
        } catch (SecurityException e9) {
            e3.x.e().d(i.f18805a, "Received exception while registering network callback", e9);
        }
    }

    @Override // k3.f
    public final void d() {
        try {
            e3.x.e().a(i.f18805a, "Unregistering network callback");
            this.f18803f.unregisterNetworkCallback(this.f18804g);
        } catch (IllegalArgumentException e7) {
            e3.x.e().d(i.f18805a, "Received exception while unregistering network callback", e7);
        } catch (SecurityException e9) {
            e3.x.e().d(i.f18805a, "Received exception while unregistering network callback", e9);
        }
    }
}
