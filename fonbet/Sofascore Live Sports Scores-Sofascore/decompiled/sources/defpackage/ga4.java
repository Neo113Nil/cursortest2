package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ga4 implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dm9 dm9Var;
        if (this.mApplicationContext == null) {
            a70.r("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = cm9.a;
        if (iBinder == null) {
            dm9Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(dm9.r7);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof dm9)) {
                bm9 bm9Var = new bm9();
                bm9Var.a = iBinder;
                dm9Var = bm9Var;
            } else {
                dm9Var = (dm9) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new fa4(dm9Var, componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
