package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b48 implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    public final v38 a;
    public final Map b;
    public final iz7 c;
    public final d4a d;
    public final d4a e;
    public final kz7 f;
    public final iw1 g;
    public final Application h;
    public final gz7 i;
    public lw9 j;
    public e48 k;
    public String l;

    public b48(v38 v38Var, Map map, iz7 iz7Var, d4a d4aVar, d4a d4aVar2, kz7 kz7Var, Application application, iw1 iw1Var, gz7 gz7Var) {
        this.a = v38Var;
        this.b = map;
        this.c = iz7Var;
        this.d = d4aVar;
        this.e = d4aVar2;
        this.f = kz7Var;
        this.h = application;
        this.g = iw1Var;
        this.i = gz7Var;
    }

    public final void a(Activity activity) {
        y0 y0Var = this.f.a;
        if (y0Var == null ? false : y0Var.i().isShown()) {
            iz7 iz7Var = this.c;
            Class<?> cls = activity.getClass();
            iz7Var.getClass();
            String simpleName = cls.getSimpleName();
            synchronized (simpleName) {
                try {
                    if (iz7Var.b.containsKey(simpleName)) {
                        for (ka4 ka4Var : (Set) iz7Var.b.get(simpleName)) {
                            if (ka4Var != null) {
                                iz7Var.a.a(ka4Var);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kz7 kz7Var = this.f;
            y0 y0Var2 = kz7Var.a;
            if (y0Var2 != null ? y0Var2.i().isShown() : false) {
                ((WindowManager) activity.getSystemService("window")).removeViewImmediate(kz7Var.a.i());
                kz7Var.a = null;
            }
            d4a d4aVar = this.d;
            CountDownTimer countDownTimer = (CountDownTimer) d4aVar.b;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                d4aVar.b = null;
            }
            d4a d4aVar2 = this.e;
            CountDownTimer countDownTimer2 = (CountDownTimer) d4aVar2.b;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                d4aVar2.b = null;
            }
        }
    }

    public final void b(Activity activity) {
        Object obj;
        lw9 lw9Var = this.j;
        if (lw9Var == null || this.a.d || lw9Var.a.equals(MessageType.UNSUPPORTED)) {
            return;
        }
        MessageType messageType = this.j.a;
        int i = 3;
        String str = null;
        if (this.h.getResources().getConfiguration().orientation == 1) {
            int i2 = j2a.a[messageType.ordinal()];
            if (i2 == 1) {
                str = "MODAL_PORTRAIT";
            } else if (i2 == 2) {
                str = "CARD_PORTRAIT";
            } else if (i2 == 3) {
                str = "IMAGE_ONLY_PORTRAIT";
            } else if (i2 == 4) {
                str = "BANNER_PORTRAIT";
            }
        } else {
            int i3 = j2a.a[messageType.ordinal()];
            if (i3 == 1) {
                str = "MODAL_LANDSCAPE";
            } else if (i3 == 2) {
                str = "CARD_LANDSCAPE";
            } else if (i3 == 3) {
                str = "IMAGE_ONLY_LANDSCAPE";
            } else if (i3 == 4) {
                str = "BANNER_LANDSCAPE";
            }
        }
        mw9 mw9Var = (mw9) ((yff) this.b.get(str)).get();
        int i4 = a48.a[this.j.a.ordinal()];
        int i5 = 0;
        iw1 iw1Var = this.g;
        if (i4 == 1) {
            lw9 lw9Var2 = this.j;
            hpo hpoVar = new hpo();
            hpoVar.a = new l2a(i5, lw9Var2, mw9Var, iw1Var.a);
            obj = (uz0) ((uff) hpoVar.k().f).get();
        } else if (i4 == 2) {
            lw9 lw9Var3 = this.j;
            hpo hpoVar2 = new hpo();
            hpoVar2.a = new l2a(i5, lw9Var3, mw9Var, iw1Var.a);
            obj = (msc) ((uff) hpoVar2.k().e).get();
        } else if (i4 == 3) {
            lw9 lw9Var4 = this.j;
            hpo hpoVar3 = new hpo();
            hpoVar3.a = new l2a(i5, lw9Var4, mw9Var, iw1Var.a);
            obj = (qr9) ((uff) hpoVar3.k().d).get();
        } else {
            if (i4 != 4) {
                return;
            }
            lw9 lw9Var5 = this.j;
            hpo hpoVar4 = new hpo();
            hpoVar4.a = new l2a(i5, lw9Var5, mw9Var, iw1Var.a);
            obj = (ck2) ((uff) hpoVar4.k().g).get();
        }
        activity.findViewById(R.id.content).post(new lv4(i, this, activity, obj));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str = this.l;
        v38 v38Var = this.a;
        if (str != null && str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            v38Var.e = null;
            a(activity);
            this.l = null;
        }
        v38Var.a();
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        String str = this.l;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            this.a.e = new o3(21, this, activity);
            this.l = activity.getLocalClassName();
        }
        if (this.j != null) {
            b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public final void displayMessage(lw9 lw9Var, e48 e48Var) {
    }
}
