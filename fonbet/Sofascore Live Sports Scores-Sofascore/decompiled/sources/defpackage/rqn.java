package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.facebook.internal.d;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rqn {
    public final f79 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public d e;

    public rqn(Context context) {
        f79 f79Var = new f79("AppUpdateListenerRegistry", 7);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.a = f79Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        d dVar;
        HashSet hashSet = this.d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!isEmpty && this.e == null) {
            d dVar2 = new d(this, 21);
            this.e = dVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(dVar2, intentFilter, 2);
            } else {
                context.registerReceiver(dVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (dVar = this.e) == null) {
            return;
        }
        context.unregisterReceiver(dVar);
        this.e = null;
    }
}
