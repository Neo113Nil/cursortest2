package androidx.activity;

import android.annotation.SuppressLint;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import xsna.aa80;
import xsna.b67;
import xsna.b740;
import xsna.bpn0;
import xsna.c820;
import xsna.cka0;
import xsna.dka0;
import xsna.epx;
import xsna.ezs;
import xsna.f5z;
import xsna.fg50;
import xsna.fs2;
import xsna.g67;
import xsna.gat;
import xsna.gqo;
import xsna.h380;
import xsna.h90;
import xsna.hb0;
import xsna.j620;
import xsna.jy50;
import xsna.ky50;
import xsna.l620;
import xsna.l8i;
import xsna.lb0;
import xsna.lbo;
import xsna.lyd;
import xsna.m8i;
import xsna.mc80;
import xsna.ndp0;
import xsna.nzm;
import xsna.o7j;
import xsna.o8i;
import xsna.ozl;
import xsna.p180;
import xsna.p380;
import xsna.qbk;
import xsna.r180;
import xsna.r980;
import xsna.ro;
import xsna.s3q0;
import xsna.sb0;
import xsna.t8i;
import xsna.ttp0;
import xsna.ua0;
import xsna.v1h0;
import xsna.va0;
import xsna.w1h0;
import xsna.wnh;
import xsna.wyt0;
import xsna.xyt0;
import xsna.y1h0;
import xsna.yja0;
import xsna.ymj;
import xsna.z1h0;
import xsna.z56;
import xsna.zf6;

/* compiled from: ComponentActivity.kt */
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements xyt0, androidx.lifecycle.f, z1h0, r180, ky50, sb0, h380, mc80, r980, aa80, j620 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b();
    private wyt0 _viewModelStore;
    private final lb0 activityResultRegistry;
    private int contentLayoutId;
    private final ymj contextAwareHelper;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final l620 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final Lazy onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<o7j<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<o7j<b740>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<o7j<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<o7j<yja0>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<o7j<dka0>> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<o7j<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final w1h0 savedStateRegistryController;

    /* compiled from: ComponentActivity.kt */
    public static final class a implements l {
        public a() {
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.ensureViewModelStore();
            componentActivity.getLifecycle().removeObserver(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    public static final class b {
    }

    /* compiled from: ComponentActivity.kt */
    public static final class c {
        public Object a;
        public wyt0 b;
    }

    /* compiled from: ComponentActivity.kt */
    public interface d extends Executor {
        void t();

        void z(View view);
    }

    /* compiled from: ComponentActivity.kt */
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {
        public final long b = SystemClock.uptimeMillis() + 10000;
        public Runnable c;
        public boolean d;

        public e() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.d) {
                decorView.postOnAnimation(new fs2(this, 4));
            } else if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Runnable runnable = this.c;
            ComponentActivity componentActivity = ComponentActivity.this;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.b) {
                    this.d = false;
                    componentActivity.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.c = null;
            if (componentActivity.getFullyDrawnReporter().b()) {
                this.d = false;
                componentActivity.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.d
        public final void t() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.d
        public final void z(View view) {
            if (this.d) {
                return;
            }
            this.d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    public static final class f extends lb0 {
        public f() {
        }

        @Override // xsna.lb0
        public final void b(int i, va0 va0Var, Object obj) {
            Bundle bundle;
            final int i2;
            ComponentActivity componentActivity = ComponentActivity.this;
            va0.a b = va0Var.b(componentActivity, obj);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new t8i(this, i, b));
                return;
            }
            Intent a = va0Var.a(componentActivity, obj);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                h90.i(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                h90.m(componentActivity, a, i, bundle2);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                h90.n(componentActivity, intentSenderRequest.g(), i2, intentSenderRequest.d(), intentSenderRequest.e(), intentSenderRequest.f(), 0, bundle2);
                s3q0 s3q0Var = s3q0.a;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xsna.u8i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.this.a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                    }
                });
            }
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ymj();
        this.menuHostHelper = new l620(new o8i(this, 0));
        y1h0 y1h0Var = new y1h0(this, new gat(this, 9));
        this.savedStateRegistryController = new w1h0(y1h0Var);
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = new bpn0(new z56(this, 4));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new bpn0(new b67(this, 2));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new l() { // from class: xsna.p8i
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$1(ComponentActivity.this, f5zVar, event);
            }
        });
        getLifecycle().addObserver(new l() { // from class: xsna.q8i
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(ComponentActivity.this, f5zVar, event);
            }
        });
        getLifecycle().addObserver(new a());
        y1h0Var.a();
        a0.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new v1h0.b() { // from class: xsna.r8i
            @Override // xsna.v1h0.b
            public final Bundle r() {
                Bundle _init_$lambda$3;
                _init_$lambda$3 = ComponentActivity._init_$lambda$3(ComponentActivity.this);
                return _init_$lambda$3;
            }
        });
        addOnContextAvailableListener(new p380() { // from class: xsna.s8i
            @Override // xsna.p380
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity._init_$lambda$4(ComponentActivity.this, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory$delegate = new bpn0(new g67(this, 1));
        this.onBackPressedDispatcher$delegate = new bpn0(new zf6(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, f5z f5zVar, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        lb0 lb0Var = componentActivity.activityResultRegistry;
        lb0Var.getClass();
        LinkedHashMap linkedHashMap = lb0Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lb0Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lb0Var.g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        Bundle a2 = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a2 != null) {
            lb0 lb0Var = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = lb0Var.b;
            LinkedHashMap linkedHashMap2 = lb0Var.a;
            Bundle bundle = lb0Var.g;
            ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                lb0Var.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        ttp0.c(linkedHashMap2).remove(num);
                    }
                }
                int intValue = integerArrayList.get(i).intValue();
                String str2 = stringArrayList.get(i);
                linkedHashMap2.put(Integer.valueOf(intValue), str2);
                lb0Var.b.put(str2, Integer.valueOf(intValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final p180 p180Var) {
        getLifecycle().addObserver(new l(this) { // from class: xsna.n8i
            public final /* synthetic */ ComponentActivity c;

            {
                this.c = this;
            }

            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$0(p180Var, this.c, f5zVar, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(p180 p180Var, ComponentActivity componentActivity, f5z f5zVar, Lifecycle.Event event) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            p180Var.e(onBackInvokedDispatcher);
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new b0(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new wyt0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ezs fullyDrawnReporter_delegate$lambda$0(ComponentActivity componentActivity) {
        return new ezs(componentActivity.reportFullyDrawnExecutor, new wnh(componentActivity, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return s3q0.a;
    }

    private final nzm getOnBackPressedInput() {
        return (nzm) this.onBackPressedInput$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p180 onBackPressedDispatcher_delegate$lambda$0(ComponentActivity componentActivity) {
        p180 p180Var = new p180(new l8i(componentActivity, 0));
        if (Build.VERSION.SDK_INT >= 33) {
            if (!epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new m8i(0, componentActivity, p180Var));
                return p180Var;
            }
            componentActivity.addObserverForBackInvoker(p180Var);
        }
        return p180Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!epx.f(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e3) {
            if (!epx.f(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nzm onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        nzm nzmVar = new nzm();
        componentActivity.getNavigationEventDispatcher().b(nzmVar);
        return nzmVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.z(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // xsna.j620
    public void addMenuProvider(c820 c820Var) {
        l620 l620Var = this.menuHostHelper;
        l620Var.b.add(c820Var);
        l620Var.a.run();
    }

    @Override // xsna.h380
    public final void addOnConfigurationChangedListener(o7j<Configuration> o7jVar) {
        this.onConfigurationChangedListeners.add(o7jVar);
    }

    public final void addOnContextAvailableListener(p380 p380Var) {
        ymj ymjVar = this.contextAwareHelper;
        ComponentActivity componentActivity = ymjVar.b;
        if (componentActivity != null) {
            p380Var.a(componentActivity);
        }
        ymjVar.a.add(p380Var);
    }

    @Override // xsna.r980
    public final void addOnMultiWindowModeChangedListener(o7j<b740> o7jVar) {
        this.onMultiWindowModeChangedListeners.add(o7jVar);
    }

    public final void addOnNewIntentListener(o7j<Intent> o7jVar) {
        this.onNewIntentListeners.add(o7jVar);
    }

    @Override // xsna.aa80
    public final void addOnPictureInPictureModeChangedListener(o7j<yja0> o7jVar) {
        this.onPictureInPictureModeChangedListeners.add(o7jVar);
    }

    public final void addOnPictureInPictureUiStateChangedListener(o7j<dka0> o7jVar) {
        this.onPictureInPictureUiStateChangedListeners.add(o7jVar);
    }

    @Override // xsna.mc80
    public final void addOnTrimMemoryListener(o7j<Integer> o7jVar) {
        this.onTrimMemoryListeners.add(o7jVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(cka0 cka0Var) {
        throw null;
    }

    @Override // xsna.sb0
    public final lb0 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.f
    public qbk getDefaultViewModelCreationExtras() {
        fg50 fg50Var = new fg50((Object) null);
        if (getApplication() != null) {
            fg50Var.a(e0.a.d, getApplication());
        }
        fg50Var.a(a0.a, this);
        fg50Var.a(a0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            fg50Var.a(a0.c, extras);
        }
        return fg50Var;
    }

    @Override // androidx.lifecycle.f
    public e0.c getDefaultViewModelProviderFactory() {
        return (e0.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public ezs getFullyDrawnReporter() {
        return (ezs) this.fullyDrawnReporter$delegate.getValue();
    }

    @ozl
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, xsna.f5z
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // xsna.ky50
    public jy50 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().c;
    }

    @Override // xsna.r180
    public final p180 getOnBackPressedDispatcher() {
        return (p180) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // xsna.z1h0
    public final v1h0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // xsna.xyt0
    public wyt0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this._viewModelStore;
    }

    public void initializeViewTreeOwners() {
        gqo.f(getWindow().getDecorView(), this);
        ro.o(getWindow().getDecorView(), this);
        lyd.h(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @ozl
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @ozl
    public void onBackPressed() {
        getOnBackPressedInput().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<o7j<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        ymj ymjVar = this.contextAwareHelper;
        ymjVar.b = this;
        Iterator it = ymjVar.a.iterator();
        while (it.hasNext()) {
            ((p380) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = v.c;
        v.a.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        l620 l620Var = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<c820> it = l620Var.b.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator<c820> it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (it.next().onMenuItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @ozl
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<o7j<b740>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new b740(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<o7j<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<c820> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @ozl
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<o7j<yja0>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new yja0(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        dka0 a2 = dka0.a.a(pictureInPictureUiState);
        Iterator<o7j<dka0>> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(a2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<c820> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @ozl
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @ozl
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        wyt0 wyt0Var = this._viewModelStore;
        if (wyt0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            wyt0Var = cVar.b;
        }
        if (wyt0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = onRetainCustomNonConfigurationInstance;
        cVar2.b = wyt0Var;
        return cVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (getLifecycle() instanceof m) {
            ((m) getLifecycle()).e(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<o7j<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> hb0<I> registerForActivityResult(va0<I, O> va0Var, lb0 lb0Var, ua0<O> ua0Var) {
        return lb0Var.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, va0Var, ua0Var);
    }

    @Override // xsna.j620
    public void removeMenuProvider(c820 c820Var) {
        this.menuHostHelper.a(c820Var);
    }

    @Override // xsna.h380
    public final void removeOnConfigurationChangedListener(o7j<Configuration> o7jVar) {
        this.onConfigurationChangedListeners.remove(o7jVar);
    }

    public final void removeOnContextAvailableListener(p380 p380Var) {
        this.contextAwareHelper.a.remove(p380Var);
    }

    @Override // xsna.r980
    public final void removeOnMultiWindowModeChangedListener(o7j<b740> o7jVar) {
        this.onMultiWindowModeChangedListeners.remove(o7jVar);
    }

    public final void removeOnNewIntentListener(o7j<Intent> o7jVar) {
        this.onNewIntentListeners.remove(o7jVar);
    }

    @Override // xsna.aa80
    public final void removeOnPictureInPictureModeChangedListener(o7j<yja0> o7jVar) {
        this.onPictureInPictureModeChangedListeners.remove(o7jVar);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(o7j<dka0> o7jVar) {
        this.onPictureInPictureUiStateChangedListeners.remove(o7jVar);
    }

    @Override // xsna.mc80
    public final void removeOnTrimMemoryListener(o7j<Integer> o7jVar) {
        this.onTrimMemoryListeners.remove(o7jVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ndp0.e()) {
                Trace.beginSection(ndp0.f("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.z(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(cka0 cka0Var) {
        throw null;
    }

    @Override // android.app.Activity
    @ozl
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @ozl
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @ozl
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @ozl
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final <I, O> hb0<I> registerForActivityResult(va0<I, O> va0Var, ua0<O> ua0Var) {
        return registerForActivityResult(va0Var, this.activityResultRegistry, ua0Var);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<o7j<b740>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new b740(z, 0));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<o7j<yja0>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new yja0(z, 0));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.z(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(c820 c820Var, f5z f5zVar) {
        l620 l620Var = this.menuHostHelper;
        l620Var.b.add(c820Var);
        l620Var.a.run();
        Lifecycle lifecycle = f5zVar.getLifecycle();
        HashMap hashMap = l620Var.c;
        l620.a aVar = (l620.a) hashMap.remove(c820Var);
        if (aVar != null) {
            aVar.a();
        }
        hashMap.put(c820Var, new l620.a(lifecycle, new lbo(1, l620Var, c820Var)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.reportFullyDrawnExecutor.z(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final c820 c820Var, f5z f5zVar, final Lifecycle.State state) {
        final l620 l620Var = this.menuHostHelper;
        l620Var.getClass();
        Lifecycle lifecycle = f5zVar.getLifecycle();
        HashMap hashMap = l620Var.c;
        l620.a aVar = (l620.a) hashMap.remove(c820Var);
        if (aVar != null) {
            aVar.a();
        }
        hashMap.put(c820Var, new l620.a(lifecycle, new l() { // from class: xsna.k620
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                l620 l620Var2 = l620.this;
                l620Var2.getClass();
                Runnable runnable = l620Var2.a;
                CopyOnWriteArrayList<c820> copyOnWriteArrayList = l620Var2.b;
                Lifecycle.Event.Companion.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event b2 = Lifecycle.Event.a.b(state2);
                c820 c820Var2 = c820Var;
                if (event == b2) {
                    copyOnWriteArrayList.add(c820Var2);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    l620Var2.a(c820Var2);
                } else if (event == Lifecycle.Event.a.a(state2)) {
                    copyOnWriteArrayList.remove(c820Var2);
                    runnable.run();
                }
            }
        }));
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
