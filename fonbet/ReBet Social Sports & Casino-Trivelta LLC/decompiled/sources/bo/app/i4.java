package bo.app;

import Ph.AbstractC1459k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k4 f25559a;

    public i4(k4 k4Var) {
        this.f25559a = k4Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new h4(this.f25559a, intent, goAsync(), null), 3, null);
    }
}
