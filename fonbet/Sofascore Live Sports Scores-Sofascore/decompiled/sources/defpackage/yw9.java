package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.w;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yw9 implements ServiceConnection {
    public final /* synthetic */ int a;

    public /* synthetic */ yw9(int i) {
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                componentName.getClass();
                iBinder.getClass();
                AtomicBoolean atomicBoolean = zw9.a;
                Context a = w.a();
                lx9 lx9Var = lx9.a;
                Object obj = null;
                if (!cw3.a.contains(lx9.class)) {
                    try {
                        obj = lx9.a.h(a, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
                    } catch (Throwable th) {
                        cw3.a(lx9.class, th);
                    }
                }
                zw9.g = obj;
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                componentName.getClass();
                break;
        }
    }

    private final void d(ComponentName componentName) {
    }

    private final void a(ComponentName componentName, IBinder iBinder) {
    }
}
