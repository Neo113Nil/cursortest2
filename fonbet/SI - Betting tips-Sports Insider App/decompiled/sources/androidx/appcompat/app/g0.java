package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.d1;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.play.core.install.zza;
import com.sports.insider.ui.activities.MainActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s7.f1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f254b;

    public /* synthetic */ g0(int i5, Object obj) {
        this.f253a = i5;
        this.f254b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        Continuation continuation = null;
        switch (this.f253a) {
            case 0:
                ((h0) this.f254b).g();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((k3.d) this.f254b).f(intent);
                return;
            case 2:
                MainActivity mainActivity = (MainActivity) this.f254b;
                if (intent == null || (action = intent.getAction()) == null) {
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode == -869793127) {
                    if (action.equals("OpenPrediction")) {
                        int q = h8.b.q(-1, intent, "idPrediction");
                        int q3 = h8.b.q(-1, intent, "typePrediction");
                        Set set = MainActivity.J0;
                        mainActivity.H().h(q, q3, false);
                        return;
                    }
                    return;
                }
                if (hashCode == 64368639) {
                    if (action.equals("Bonus")) {
                        Set set2 = MainActivity.J0;
                        pe.s I = mainActivity.I();
                        I.getClass();
                        eg.c0.t(d1.i(I), null, null, new oe.j(I, intent, continuation, 11), 3);
                        return;
                    }
                    return;
                }
                if (hashCode == 321102183 && action.equals("Announcement")) {
                    Set set3 = MainActivity.J0;
                    pd.t H = mainActivity.H();
                    H.getClass();
                    u1.a i5 = d1.i(H);
                    lg.e eVar = eg.m0.f9201a;
                    eg.c0.t(i5, lg.d.f20063c, null, new me.y(intent, H, continuation, 6), 2);
                    return;
                }
                return;
            case 3:
                f1 f1Var = (f1) this.f254b;
                if (intent == null) {
                    s7.n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22906i.a("App receiver called with null intent");
                    return;
                }
                String action2 = intent.getAction();
                if (action2 == null) {
                    s7.n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22906i.a("App receiver called with null action");
                    return;
                }
                int hashCode2 = action2.hashCode();
                if (hashCode2 != -1928239649) {
                    if (hashCode2 == 1279883384 && action2.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        s7.n0 n0Var3 = f1Var.f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22910n.a("[sgtm] App Receiver notified batches are available");
                        s7.d1 d1Var = f1Var.f22746g;
                        f1.m(d1Var);
                        d1Var.s(new androidx.core.widget.b(25, this));
                        return;
                    }
                } else if (action2.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    o8.a();
                    if (f1Var.f22743d.t(null, s7.x.R0)) {
                        s7.n0 n0Var4 = f1Var.f22745f;
                        f1.m(n0Var4);
                        n0Var4.f22910n.a("App receiver notified triggers are available");
                        s7.d1 d1Var2 = f1Var.f22746g;
                        f1.m(d1Var2);
                        d1Var2.s(new androidx.core.widget.b(26, f1Var));
                        return;
                    }
                    return;
                }
                s7.n0 n0Var5 = f1Var.f22745f;
                f1.m(n0Var5);
                n0Var5.f22906i.a("App receiver called with unknown action");
                return;
            default:
                com.google.android.play.core.appupdate.c cVar = (com.google.android.play.core.appupdate.c) ((y7.j) this.f254b);
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar.f25696a.e("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar.f25696a.e("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    cVar.f25696a.e("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                com.android.billingclient.api.a aVar = cVar.f25696a;
                aVar.e("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                aVar.e("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                aVar.e("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar.f25696a.e("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar) {
                    Iterator it = new HashSet(cVar.f25699d).iterator();
                    while (it.hasNext()) {
                        ((pd.y) it.next()).a(zzaVar);
                    }
                }
                return;
        }
    }

    public g0(f1 f1Var) {
        this.f253a = 3;
        this.f254b = f1Var;
    }
}
