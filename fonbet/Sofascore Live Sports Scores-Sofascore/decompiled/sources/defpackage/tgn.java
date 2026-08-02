package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tgn implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final ContextWrapper b;
    public final Object c;

    public tgn(Application application) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                if (activity == ((Activity) this.b)) {
                    ((pqg) this.c).d();
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            default:
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    lnn lnnVar = (lnn) ((j3o) it.next());
                    lnnVar.a.d(new lda(JavaScriptMessage$MsgChannel.adsManager, JavaScriptMessage$MsgType.appBackgrounding, lnnVar.b, null, null));
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (activity == ((Activity) this.b)) {
                    ((pqg) obj).d();
                    break;
                }
                break;
            default:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    lnn lnnVar = (lnn) ((j3o) it.next());
                    lnnVar.a.d(new lda(JavaScriptMessage$MsgChannel.adsManager, JavaScriptMessage$MsgType.appForegrounding, lnnVar.b, null, null));
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
    }

    public tgn(pqg pqgVar, Activity activity) {
        this.a = 0;
        this.b = activity;
        this.c = pqgVar;
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }
}
