package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import e3.a0;
import e3.o;
import e3.x;
import e3.z;
import f3.p;
import f3.v;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2936a = x.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        x e7 = x.e();
        String str = f2936a;
        e7.a(str, "Requesting diagnostics");
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            v e9 = v.e(context);
            Intrinsics.checkNotNullExpressionValue(e9, "getInstance(...)");
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            a0 request = (a0) new z(DiagnosticsWorker.class).b();
            e9.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            List c2 = t.c(request);
            if (c2.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new p(e9, null, o.f8552b, c2, 0).q0();
        } catch (IllegalStateException e10) {
            x.e().d(str, "WorkManager is not initialized", e10);
        }
    }
}
