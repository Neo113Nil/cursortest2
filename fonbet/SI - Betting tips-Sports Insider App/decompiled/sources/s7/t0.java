package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f23086a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23087b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23088c;

    public t0(r3 r3Var) {
        g6.v.h(r3Var);
        this.f23086a = r3Var;
    }

    public final void a() {
        r3 r3Var = this.f23086a;
        r3Var.l0();
        r3Var.b().j();
        r3Var.b().j();
        if (this.f23087b) {
            r3Var.a().f22910n.a("Unregistering connectivity change receiver");
            this.f23087b = false;
            this.f23088c = false;
            try {
                r3Var.f22997l.f22740a.unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                r3Var.a().f22903f.b(e7, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r3 r3Var = this.f23086a;
        r3Var.l0();
        String action = intent.getAction();
        r3Var.a().f22910n.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            r3Var.a().f22906i.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        r0 r0Var = r3Var.f22988b;
        r3.U(r0Var);
        boolean D = r0Var.D();
        if (this.f23088c != D) {
            this.f23088c = D;
            r3Var.b().s(new androidx.core.widget.b(this, D));
        }
    }
}
