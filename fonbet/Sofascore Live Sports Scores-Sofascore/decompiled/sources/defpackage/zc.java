package defpackage;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zc implements uv8 {
    public volatile gc4 a;
    public final Object b = new Object();
    public final AppCompatActivity c;
    public final re d;
    public fjg e;

    public zc(AppCompatActivity appCompatActivity) {
        this.c = appCompatActivity;
        this.d = new re(appCompatActivity);
    }

    public final gc4 a() {
        String str;
        AppCompatActivity appCompatActivity = this.c;
        if (appCompatActivity.getApplication() instanceof uv8) {
            ic4 ic4Var = (ic4) ((yc) fz8.Q(yc.class, this.d));
            return new gc4(ic4Var.a, ic4Var.b);
        }
        if (Application.class.equals(appCompatActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + appCompatActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    public final void b() {
        re reVar = this.d;
        AppCompatActivity appCompatActivity = reVar.a;
        ne neVar = new ne(reVar.b, 0);
        stk viewModelStore = appCompatActivity.getViewModelStore();
        ly3 r = ufa.r(appCompatActivity);
        viewModelStore.getClass();
        r.getClass();
        g7h g7hVar = new g7h(viewModelStore, neVar, r);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(pe.class);
        orCreateKotlinClass.getClass();
        String t = kik.t(orCreateKotlinClass);
        if (t == null) {
            a70.p("Local and anonymous classes can not be ViewModels");
            return;
        }
        fjg fjgVar = ((pe) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t), orCreateKotlinClass)).c;
        this.e = fjgVar;
        if (((ly3) fjgVar.b) == null) {
            ly3 defaultViewModelCreationExtras = this.c.getDefaultViewModelCreationExtras();
            o3a.p(fjgVar.a, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            fjgVar.b = defaultViewModelCreationExtras;
        }
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
