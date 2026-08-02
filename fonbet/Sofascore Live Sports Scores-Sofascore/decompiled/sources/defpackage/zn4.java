package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zn4 implements qk3 {
    public final Context a;
    public final m0g b;

    public zn4(Context context, m0g m0gVar) {
        this.a = context.getApplicationContext();
        this.b = m0gVar;
    }

    @Override // defpackage.s6b
    public final void onStart() {
        yih k = yih.k(this.a);
        m0g m0gVar = this.b;
        synchronized (k) {
            ((HashSet) k.d).add(m0gVar);
            if (!k.b && !((HashSet) k.d).isEmpty()) {
                en0 en0Var = (en0) k.c;
                ggf ggfVar = (ggf) en0Var.d;
                boolean z = false;
                en0Var.b = ((ConnectivityManager) ggfVar.get()).getActiveNetwork() != null;
                try {
                    ((ConnectivityManager) ggfVar.get()).registerDefaultNetworkCallback((c2a) en0Var.e);
                    z = true;
                } catch (RuntimeException unused) {
                }
                k.b = z;
            }
        }
    }

    @Override // defpackage.s6b
    public final void onStop() {
        yih k = yih.k(this.a);
        m0g m0gVar = this.b;
        synchronized (k) {
            ((HashSet) k.d).remove(m0gVar);
            if (k.b && ((HashSet) k.d).isEmpty()) {
                en0 en0Var = (en0) k.c;
                ((ConnectivityManager) ((ggf) en0Var.d).get()).unregisterNetworkCallback((c2a) en0Var.e);
                k.b = false;
            }
        }
    }

    @Override // defpackage.s6b
    public final void onDestroy() {
    }
}
