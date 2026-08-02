package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class re implements uv8 {
    public final AppCompatActivity a;
    public final AppCompatActivity b;
    public volatile ic4 c;
    public final Object d = new Object();

    public re(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
        this.b = appCompatActivity;
    }

    @Override // defpackage.uv8
    public final Object f() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        AppCompatActivity appCompatActivity = this.a;
                        ne neVar = new ne(this.b, 0);
                        stk viewModelStore = appCompatActivity.getViewModelStore();
                        ly3 r = ufa.r(appCompatActivity);
                        viewModelStore.getClass();
                        r.getClass();
                        g7h g7hVar = new g7h(viewModelStore, neVar, r);
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(pe.class);
                        orCreateKotlinClass.getClass();
                        String t = kik.t(orCreateKotlinClass);
                        if (t == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.c = ((pe) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t), orCreateKotlinClass)).b;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
