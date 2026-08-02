package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.d6b;
import defpackage.e6g;
import defpackage.g6b;
import defpackage.h79;
import defpackage.ly3;
import defpackage.nqg;
import defpackage.oqg;
import defpackage.pqg;
import defpackage.ptk;
import defpackage.qqg;
import defpackage.qtk;
import defpackage.qzc;
import defpackage.sqg;
import defpackage.stk;
import defpackage.ttk;
import defpackage.wb3;
import defpackage.y6b;
import defpackage.yso;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w implements h79, qqg, ttk {
    public final Fragment a;
    public final stk b;
    public final wb3 c;
    public qtk d;
    public y6b e = null;
    public oqg f = null;

    public w(Fragment fragment, stk stkVar, wb3 wb3Var) {
        this.a = fragment;
        this.b = stkVar;
        this.c = wb3Var;
    }

    public final void a(d6b d6bVar) {
        this.e.g(d6bVar);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new y6b(this, true);
            pqg pqgVar = new pqg(this, new e6g(this, 8));
            this.f = new oqg(pqgVar);
            pqgVar.c();
            this.c.run();
        }
    }

    @Override // defpackage.h79
    public final ly3 getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        qzc qzcVar = new qzc(0);
        LinkedHashMap linkedHashMap = qzcVar.a;
        if (application != null) {
            linkedHashMap.put(ptk.d, application);
        }
        linkedHashMap.put(yso.l, fragment);
        linkedHashMap.put(yso.m, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(yso.n, fragment.getArguments());
        }
        return qzcVar;
    }

    @Override // defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        qtk defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        qtk qtkVar = this.d;
        if (qtkVar != null) {
            return qtkVar;
        }
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        sqg sqgVar = new sqg(application, fragment, fragment.getArguments());
        this.d = sqgVar;
        return sqgVar;
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.qqg
    public final nqg getSavedStateRegistry() {
        b();
        return this.f.b;
    }

    @Override // defpackage.ttk
    public final stk getViewModelStore() {
        b();
        return this.b;
    }
}
