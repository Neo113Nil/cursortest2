package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Af;
import com.ironsource.Ib;
import com.ironsource.Y3;
import com.ironsource.ah;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class ContextProvider {
    private static volatile ContextProvider b;
    private Y3 a = new Af();

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (b == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (b == null) {
                        b = new ContextProvider();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public Context getActiveContext() {
        Activity a = this.a.a();
        return a != null ? a : this.a.b();
    }

    public Context getApplicationContext() {
        Context b2 = this.a.b();
        Activity a = this.a.a();
        return (b2 != null || a == null) ? b2 : a.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.a.a();
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.a.a(activity);
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.a.a(context);
        }
    }

    public void updateStrategyIfNeeded() {
        if (Ib.a0().h().u()) {
            this.a = new ah(this.a.a(), this.a.b());
        }
    }
}
