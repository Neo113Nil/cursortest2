package com.sports.insider.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sports.insider.MyApp;
import eg.c0;
import eg.y;
import h8.b;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import m3.f;
import zc.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/util/OpenMarketService;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OpenMarketService extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        if (intent != null) {
            int q = b.q(-1, intent, "version");
            int q3 = b.q(-1, intent, "push_id");
            Continuation continuation = null;
            if (q3 > 0) {
                f fVar = new f(6);
                if (q3 >= 1) {
                    c0.t(MyApp.f6830c, f.k(), null, new cd.f(fVar, q3, continuation, 0), 2);
                }
            }
            if (q > 0) {
                io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
                c0.t(MyApp.f6830c, (y) bVar.f17176b, null, new androidx.lifecycle.b(q, 17, bVar, continuation), 2);
            }
        }
        e.d(context.getPackageName(), new WeakReference(context));
    }
}
