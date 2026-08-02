package k3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.g0;
import com.google.firebase.messaging.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: f, reason: collision with root package name */
    public final g0 f18795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, x taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f18795f = new g0(1, this);
    }

    @Override // k3.f
    public final void c() {
        e3.x.e().a(e.f18796a, getClass().getSimpleName().concat(": registering receiver"));
        this.f18798b.registerReceiver(this.f18795f, e());
    }

    @Override // k3.f
    public final void d() {
        e3.x.e().a(e.f18796a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f18798b.unregisterReceiver(this.f18795f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
