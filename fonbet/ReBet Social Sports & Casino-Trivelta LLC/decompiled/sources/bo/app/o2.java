package bo.app;

import Ph.AbstractC1459k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q2 f25843a;

    public o2(q2 q2Var) {
        this.f25843a = q2Var;
    }

    public static final String a() {
        return "Session seal logic executing in broadcast";
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.W6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o2.a();
            }
        }, 6, (Object) null);
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new n2(this.f25843a, goAsync(), null), 3, null);
    }
}
