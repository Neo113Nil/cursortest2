package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Cf;
import com.ironsource.InterfaceC2341b4;
import com.ironsource.Jb;
import com.ironsource.Xg;

/* loaded from: classes4.dex */
public class ContextProvider {
    private static volatile ContextProvider b;
    private InterfaceC2341b4 a = new Cf();

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (b == null) {
            synchronized (ContextProvider.class) {
                if (b == null) {
                    b = new ContextProvider();
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
        if (Jb.Y().h().t()) {
            this.a = new Xg(this.a.a(), this.a.b());
        }
    }
}
