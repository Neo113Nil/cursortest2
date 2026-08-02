package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lpi extends BroadcastReceiver {
    public mpi a;
    public Context b;

    public final void a() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        mpi mpiVar = this.a;
        if (mpiVar != null) {
            Context context = ((FirebaseMessaging) mpiVar.d).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        mpi mpiVar = this.a;
        if (mpiVar != null && mpiVar.a()) {
            mpi mpiVar2 = this.a;
            Object obj = mpiVar2.d;
            FirebaseMessaging.b(0L, mpiVar2);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
