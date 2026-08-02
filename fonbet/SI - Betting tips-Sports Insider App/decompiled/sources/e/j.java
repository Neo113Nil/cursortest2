package e;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.g0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import c0.i0;
import c0.j0;
import c0.k0;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j extends c0.f implements p1, androidx.lifecycle.r, q2.f, e0, g.h, d0.e, d0.f, i0, j0, androidx.core.view.n {

    /* renamed from: b, reason: collision with root package name */
    public final e6.j f8417b = new e6.j();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.core.view.q f8418c = new androidx.core.view.q(new b(this, 0));

    /* renamed from: d, reason: collision with root package name */
    public final q2.e f8419d;

    /* renamed from: e, reason: collision with root package name */
    public o1 f8420e;

    /* renamed from: f, reason: collision with root package name */
    public final g f8421f;

    /* renamed from: g, reason: collision with root package name */
    public final gf.t f8422g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f8423h;

    /* renamed from: i, reason: collision with root package name */
    public final i f8424i;
    public final CopyOnWriteArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f8425k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f8426l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f8427m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f8428n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f8429o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8430p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public final gf.t f8431r;

    /* renamed from: s, reason: collision with root package name */
    public final gf.t f8432s;

    /* renamed from: t, reason: collision with root package name */
    public final gf.t f8433t;

    public j() {
        Intrinsics.checkNotNullParameter(this, "owner");
        q2.e eVar = new q2.e(new r2.a(this, new me.a(10, this)));
        this.f8419d = eVar;
        this.f8421f = new g(this);
        this.f8422g = gf.k.b(new c(this, 1));
        this.f8423h = new AtomicInteger();
        this.f8424i = new i(this);
        this.j = new CopyOnWriteArrayList();
        this.f8425k = new CopyOnWriteArrayList();
        this.f8426l = new CopyOnWriteArrayList();
        this.f8427m = new CopyOnWriteArrayList();
        this.f8428n = new CopyOnWriteArrayList();
        this.f8429o = new CopyOnWriteArrayList();
        this.f8431r = gf.k.b(new c(this, 2));
        g0 g0Var = this.f3250a;
        if (g0Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i5 = 0;
        g0Var.a(new androidx.lifecycle.c0(this) { // from class: e.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f8402b;

            {
                this.f8402b = owner;
            }

            @Override // androidx.lifecycle.c0
            public final void c(androidx.lifecycle.e0 e0Var, androidx.lifecycle.w event) {
                Window window;
                View peekDecorView;
                switch (i5) {
                    case 0:
                        j jVar = this.f8402b;
                        Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == androidx.lifecycle.w.ON_STOP && (window = jVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        j jVar2 = this.f8402b;
                        Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == androidx.lifecycle.w.ON_DESTROY) {
                            jVar2.f8417b.f8719b = null;
                            if (!jVar2.isChangingConfigurations()) {
                                jVar2.getViewModelStore().a();
                            }
                            g gVar = jVar2.f8421f;
                            j jVar3 = gVar.f8411d;
                            jVar3.getWindow().getDecorView().removeCallbacks(gVar);
                            jVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(gVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f3250a.a(new androidx.lifecycle.c0(this) { // from class: e.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f8402b;

            {
                this.f8402b = owner;
            }

            @Override // androidx.lifecycle.c0
            public final void c(androidx.lifecycle.e0 e0Var, androidx.lifecycle.w event) {
                Window window;
                View peekDecorView;
                switch (i10) {
                    case 0:
                        j jVar = this.f8402b;
                        Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == androidx.lifecycle.w.ON_STOP && (window = jVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        j jVar2 = this.f8402b;
                        Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == androidx.lifecycle.w.ON_DESTROY) {
                            jVar2.f8417b.f8719b = null;
                            if (!jVar2.isChangingConfigurations()) {
                                jVar2.getViewModelStore().a();
                            }
                            g gVar = jVar2.f8421f;
                            j jVar3 = gVar.f8411d;
                            jVar3.getWindow().getDecorView().removeCallbacks(gVar);
                            jVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(gVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f3250a.a(new q2.a(2, this));
        eVar.a();
        d1.e(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.f3250a.a(new x(this));
        }
        eVar.f21928b.c("android:support:activity-result", new a2.r(2, this));
        o(new f.a() { // from class: e.e
            @Override // f.a
            public final void a(j it) {
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar = j.this;
                Bundle a7 = jVar.f8419d.f21928b.a("android:support:activity-result");
                if (a7 != null) {
                    i iVar = jVar.f8424i;
                    LinkedHashMap linkedHashMap = iVar.f9641b;
                    LinkedHashMap linkedHashMap2 = iVar.f9640a;
                    Bundle bundle = iVar.f9646g;
                    ArrayList<Integer> integerArrayList = a7.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        iVar.f9643d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = a7.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = stringArrayList.get(i11);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i11);
                        Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i11);
                        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        iVar.f9641b.put(str3, Integer.valueOf(intValue));
                    }
                }
            }
        });
        this.f8432s = gf.k.b(new c(this, 3));
        this.f8433t = gf.k.b(new c(this, 4));
    }

    public static void m(d0 d0Var, j jVar, androidx.lifecycle.e0 e0Var, androidx.lifecycle.w event) {
        Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.w.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = jVar.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            d0Var.b(onBackInvokedDispatcher);
        }
    }

    public static void n(j jVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e7) {
            if (!Intrinsics.areEqual(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e7;
            }
        } catch (NullPointerException e9) {
            if (!Intrinsics.areEqual(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e9;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f8421f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.n
    public final void addMenuProvider(androidx.core.view.r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        androidx.core.view.q qVar = this.f8418c;
        qVar.f1383b.add(provider);
        qVar.f1382a.run();
    }

    @Override // d0.f
    public final void b(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8425k.remove(listener);
    }

    @Override // d0.e
    public final void c(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.j.add(listener);
    }

    @Override // g.h
    public final g.g d() {
        return this.f8424i;
    }

    @Override // c0.i0
    public final void f(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8427m.remove(listener);
    }

    @Override // d0.f
    public final void g(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8425k.add(listener);
    }

    @Override // androidx.lifecycle.r
    public final t1.c getDefaultViewModelCreationExtras() {
        t1.e eVar = new t1.e(0);
        if (getApplication() != null) {
            eVar.b(l1.f2201e, getApplication());
        }
        eVar.b(d1.f2149a, this);
        eVar.b(d1.f2150b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            eVar.b(d1.f2151c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    public final m1 getDefaultViewModelProviderFactory() {
        return (m1) this.f8432s.getValue();
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.y getLifecycle() {
        return this.f3250a;
    }

    @Override // e.e0
    public final d0 getOnBackPressedDispatcher() {
        return (d0) this.f8433t.getValue();
    }

    @Override // q2.f
    public final q2.d getSavedStateRegistry() {
        return this.f8419d.f21928b;
    }

    @Override // androidx.lifecycle.p1
    public final o1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f8420e == null) {
            f fVar = (f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this.f8420e = fVar.f8407a;
            }
            if (this.f8420e == null) {
                this.f8420e = new o1();
            }
        }
        o1 o1Var = this.f8420e;
        Intrinsics.checkNotNull(o1Var);
        return o1Var;
    }

    @Override // c0.j0
    public final void h(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8428n.add(listener);
    }

    @Override // c0.i0
    public final void i(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8427m.add(listener);
    }

    @Override // d0.e
    public final void j(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.j.remove(listener);
    }

    @Override // c0.j0
    public final void l(p0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8428n.remove(listener);
    }

    public final void o(f.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        e6.j jVar = this.f8417b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        j jVar2 = (j) jVar.f8719b;
        if (jVar2 != null) {
            listener.a(jVar2);
        }
        ((CopyOnWriteArraySet) jVar.f8718a).add(listener);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i5, int i10, Intent intent) {
        if (this.f8424i.a(i5, i10, intent)) {
            return;
        }
        super.onActivityResult(i5, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((d2.a) this.f8431r.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.j.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(newConfig);
        }
    }

    @Override // c0.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f8419d.b(bundle);
        e6.j jVar = this.f8417b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        jVar.f8719b = this;
        Iterator it = ((CopyOnWriteArraySet) jVar.f8718a).iterator();
        while (it.hasNext()) {
            ((f.a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i5 = z0.f2262b;
        x0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = this.f8418c.f1383b.iterator();
        while (it.hasNext()) {
            ((a1) ((androidx.core.view.r) it.next())).f1865a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i5, item)) {
            return true;
        }
        if (i5 == 0) {
            return this.f8418c.a(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5) {
        if (this.f8430p) {
            return;
        }
        Iterator it = this.f8427m.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(new c0.p(z5));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f8426l.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.f8418c.f1383b.iterator();
        while (it.hasNext()) {
            ((a1) ((androidx.core.view.r) it.next())).f1865a.q(menu);
        }
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5) {
        if (this.q) {
            return;
        }
        Iterator it = this.f8428n.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(new k0(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        Iterator it = this.f8418c.f1383b.iterator();
        while (it.hasNext()) {
            ((a1) ((androidx.core.view.r) it.next())).f1865a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.f8424i.a(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i5, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        f fVar;
        o1 o1Var = this.f8420e;
        if (o1Var == null && (fVar = (f) getLastNonConfigurationInstance()) != null) {
            o1Var = fVar.f8407a;
        }
        if (o1Var == null) {
            return null;
        }
        f fVar2 = new f();
        fVar2.f8407a = o1Var;
        return fVar2;
    }

    @Override // c0.f, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        g0 g0Var = this.f3250a;
        if (g0Var != null) {
            Intrinsics.checkNotNull(g0Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            g0Var.g(androidx.lifecycle.x.f2255c);
        }
        super.onSaveInstanceState(outState);
        this.f8419d.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator it = this.f8425k.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(Integer.valueOf(i5));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f8429o.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void p() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView6, "<this>");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final g.b q(h.a contract, g.a callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(contract, "contract");
        i registry = this.f8424i;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.c("activity_rq#" + this.f8423h.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.n
    public final void removeMenuProvider(androidx.core.view.r provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f8418c.b(provider);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (m4.g.r()) {
                Trace.beginSection(m4.g.B("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ((t) this.f8422g.getValue()).a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i5) {
        p();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f8421f.a(decorView);
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i5) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i5, Intent intent2, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i5, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i5, Intent intent2, int i10, int i11, int i12, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i5, intent2, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f8430p = true;
        try {
            super.onMultiWindowModeChanged(z5, newConfig);
            this.f8430p = false;
            Iterator it = this.f8427m.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                p0.a aVar = (p0.a) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                aVar.accept(new c0.p(z5));
            }
        } catch (Throwable th2) {
            this.f8430p = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.q = true;
        try {
            super.onPictureInPictureModeChanged(z5, newConfig);
            this.q = false;
            Iterator it = this.f8428n.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                p0.a aVar = (p0.a) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                aVar.accept(new k0(z5));
            }
        } catch (Throwable th2) {
            this.q = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        p();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f8421f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f8421f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
