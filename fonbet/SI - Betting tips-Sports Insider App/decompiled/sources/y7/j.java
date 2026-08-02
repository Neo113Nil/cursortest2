package y7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.appcompat.app.g0;
import java.util.HashSet;
import pd.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.a f25696a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f25697b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f25698c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f25699d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public g0 f25700e = null;

    public j(com.android.billingclient.api.a aVar, IntentFilter intentFilter, Context context) {
        this.f25696a = aVar;
        this.f25697b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f25698c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(y yVar) {
        this.f25696a.g("registerListener", new Object[0]);
        if (yVar == null) {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
        this.f25699d.add(yVar);
        c();
    }

    public final synchronized void b(y yVar) {
        this.f25696a.g("unregisterListener", new Object[0]);
        if (yVar == null) {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        }
        this.f25699d.remove(yVar);
        c();
    }

    public final void c() {
        g0 g0Var;
        HashSet hashSet = this.f25699d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.f25698c;
        if (!isEmpty && this.f25700e == null) {
            g0 g0Var2 = new g0(4, this);
            this.f25700e = g0Var2;
            int i5 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f25697b;
            if (i5 >= 33) {
                context.registerReceiver(g0Var2, intentFilter, 2);
            } else {
                context.registerReceiver(g0Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (g0Var = this.f25700e) == null) {
            return;
        }
        context.unregisterReceiver(g0Var);
        this.f25700e = null;
    }
}
