package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n30 implements ComponentCallbacks2 {
    public final /* synthetic */ n72 a;

    public n30(n72 n72Var) {
        this.a = n72Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        n72 n72Var = this.a;
        synchronized (n72Var) {
            if (((apf) ((WeakReference) n72Var.b).get()) == null) {
                n72Var.n();
            }
            Unit unit = Unit.a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        fpf d;
        long h;
        n72 n72Var = this.a;
        synchronized (n72Var) {
            try {
                apf apfVar = (apf) ((WeakReference) n72Var.b).get();
                if (apfVar != null) {
                    uof uofVar = apfVar.a;
                    if (i >= 40) {
                        fpf d2 = apfVar.d();
                        if (d2 != null) {
                            synchronized (d2.c) {
                                ((c78) d2.a.c).n(-1L);
                                spf spfVar = d2.b;
                                spfVar.b = 0;
                                spfVar.a.clear();
                                Unit unit = Unit.a;
                            }
                        }
                    } else if (i >= 20) {
                        ((m30) n72Var.c).a(uofVar.a);
                    } else if (i >= 10 && (d = apfVar.d()) != null) {
                        synchronized (d.c) {
                            h = ((c78) d.a.c).h();
                        }
                        long j = h / 2;
                        synchronized (d.c) {
                            ((c78) d.a.c).n(j);
                            Unit unit2 = Unit.a;
                        }
                    }
                } else {
                    n72Var.n();
                }
                Unit unit3 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
