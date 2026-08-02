package qZ;

import EZ.g;
import EZ.h;
import GZ.l;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.C;
import androidx.activity.L;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import qZ.InterfaceC9014f;
import rZ.C9236a;
import ru.ozon.app.android.R;
import wZ.InterfaceC10463e;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u0005R\"\u0010*\u001a\u00020)8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010'\"\u0004\b3\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006_"}, d2 = {"LqZ/c;", "Landroidx/fragment/app/m;", "LqZ/e;", "LwZ/e;", "<init>", "()V", "", "hideKeyboard", "(Landroidx/fragment/app/m;)Z", "Landroid/view/View;", "(Landroid/view/View;)Z", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "close", "LqZ/b;", "config", "LqZ/b;", "getConfig", "()LqZ/b;", "setConfig", "(LqZ/b;)V", "flowTag", "LqZ/f;", "getFlowTag", "setFlowTag", "(LqZ/f;)V", "", "redirectDeeplink", "Ljava/lang/String;", "getRedirectDeeplink", "()Ljava/lang/String;", "setRedirectDeeplink", "(Ljava/lang/String;)V", "hideKeyboardOnFinish", "Z", "getHideKeyboardOnFinish", "()Z", "setHideKeyboardOnFinish", "(Z)V", "LPZ/d;", "softInputInputChangeDelegate$delegate", "LSc/j;", "getSoftInputInputChangeDelegate", "()LPZ/d;", "softInputInputChangeDelegate", "LEZ/g;", "navigator", "LEZ/g;", "getNavigator", "()LEZ/g;", "setNavigator", "(LEZ/g;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Companion", "a", "compass_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: qZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9011c extends ComponentCallbacksC5392m implements InterfaceC9013e, InterfaceC10463e {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    protected C9010b config;

    @NotNull
    private InterfaceC9014f flowTag;
    private boolean hideKeyboardOnFinish;
    public g navigator;
    protected h navigatorHolder;
    private String redirectDeeplink;
    protected GZ.g router;

    /* renamed from: softInputInputChangeDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j softInputInputChangeDelegate;

    /* renamed from: qZ.c$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static C9011c a(@NotNull C9010b config) {
            Intrinsics.checkNotNullParameter(config, "config");
            C9011c c9011c = new C9011c();
            c9011c.setArguments(androidx.core.os.d.b(new Pair("ru.ozon.compass.flow.CONFIG", config)));
            return c9011c;
        }
    }

    /* renamed from: qZ.c$b */
    public static final class b implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f81787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f81788b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f81789c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f81790d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ M f81791e;

        public b(ComponentCallbacksC5392m componentCallbacksC5392m, M m11, int i11, int i12, M m12) {
            this.f81787a = componentCallbacksC5392m;
            this.f81788b = m11;
            this.f81789c = i11;
            this.f81790d = i12;
            this.f81791e = m12;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f81787a.getLifecycle().e(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ((ComponentCallbacksC5392m) this.f81788b.f71787a).onActivityResult(this.f81789c, this.f81790d, (Intent) this.f81791e.f71787a);
            this.f81787a.getLifecycle().e(this);
        }
    }

    /* renamed from: qZ.c$c, reason: collision with other inner class name */
    static final class C1380c extends AbstractC7737t implements Function1<C, Unit> {
        C1380c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            l.a(C9011c.this.getRouter());
            return Unit.f71690a;
        }
    }

    /* renamed from: qZ.c$d */
    static final class d extends AbstractC7737t implements Function0<PZ.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f81793b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final PZ.d invoke() {
            return new PZ.d();
        }
    }

    public C9011c() {
        InterfaceC9014f.f81797k0.getClass();
        this.flowTag = InterfaceC9014f.a.a();
        this.softInputInputChangeDelegate = k.b(d.f81793b);
    }

    private final PZ.d getSoftInputInputChangeDelegate() {
        return (PZ.d) this.softInputInputChangeDelegate.getValue();
    }

    private final boolean hideKeyboard(ComponentCallbacksC5392m componentCallbacksC5392m) {
        View view = componentCallbacksC5392m.getView();
        if (view != null) {
            return hideKeyboard(view);
        }
        return false;
    }

    public final void close() {
        GZ.g router = getRouter();
        InterfaceC9014f interfaceC9014f = this.flowTag;
        String str = this.redirectDeeplink;
        router.c(new LZ.b(new C9236a(interfaceC9014f, str != null ? new pZ.e(str) : null)), null);
    }

    @NotNull
    protected final C9010b getConfig() {
        C9010b c9010b = this.config;
        if (c9010b != null) {
            return c9010b;
        }
        Intrinsics.n("config");
        throw null;
    }

    @NotNull
    protected final InterfaceC9014f getFlowTag() {
        return this.flowTag;
    }

    @NotNull
    public final g getNavigator() {
        g gVar = this.navigator;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("navigator");
        throw null;
    }

    @NotNull
    protected final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final GZ.g getRouter() {
        GZ.g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // qZ.InterfaceC9013e
    @NotNull
    public InterfaceC9014f getScreenFlowTag() {
        return this.flowTag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, androidx.fragment.app.m] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, android.content.Intent] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((data != 0 ? data.getIntExtra("ru.ozon.compass.flow.ARG_RESULT_FLOW", 0) : 0) == 10) {
            if (data != 0) {
                data.removeExtra("ru.ozon.compass.flow.ARG_RESULT_FLOW");
            }
            ComponentCallbacksC5392m w02 = getChildFragmentManager().w0();
            if (w02 != null) {
                w02.onActivityResult(requestCode, resultCode, data);
                return;
            }
            return;
        }
        M m11 = new M();
        m11.f71787a = data;
        M m12 = new M();
        ?? targetFragment = getTargetFragment();
        m12.f71787a = targetFragment;
        boolean z11 = targetFragment instanceof C9011c;
        T t2 = targetFragment;
        if (z11) {
            Intent intent = (Intent) m11.f71787a;
            ?? r102 = intent;
            if (intent == null) {
                r102 = new Intent();
            }
            m11.f71787a = r102;
            Intrinsics.f(r102.putExtra("ru.ozon.compass.flow.ARG_RESULT_FLOW", 10));
        } else {
            if (targetFragment == 0) {
                t2 = getChildFragmentManager().w0();
            }
            m12.f71787a = t2;
        }
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) m12.f71787a;
        if (componentCallbacksC5392m != null) {
            if (componentCallbacksC5392m.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                ((ComponentCallbacksC5392m) m12.f71787a).onActivityResult(requestCode, resultCode, (Intent) m11.f71787a);
            } else {
                componentCallbacksC5392m.getLifecycle().a(new b(componentCallbacksC5392m, m12, requestCode, resultCode, m11));
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = C8475a.f76670r.get();
        C8475a c8475a = obj instanceof C8475a ? (C8475a) obj : null;
        if (c8475a == null) {
            throw new IllegalStateException("Can't get OzonCompass. Call 'OzonCompass#init' before 'get'");
        }
        setNavigatorHolder(c8475a.o());
        setRouter(c8475a.q());
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PZ.d softInputInputChangeDelegate = getSoftInputInputChangeDelegate();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        softInputInputChangeDelegate.c(requireActivity, this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(requireContext);
        fragmentContainerView.setId(R.id.flowContainer);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        if (this.hideKeyboardOnFinish) {
            hideKeyboard(this);
        }
        this.redirectDeeplink = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        androidx.activity.J onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        C9010b c9010b = arguments != null ? (C9010b) arguments.getParcelable("ru.ozon.compass.flow.CONFIG") : null;
        if (c9010b == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setConfig(c9010b);
        this.flowTag = getConfig().a();
        this.redirectDeeplink = getConfig().d();
        this.hideKeyboardOnFinish = getConfig().c();
        setNavigator(new C9012d(this, this.flowTag, getConfig().b()));
        h navigatorHolder = getNavigatorHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        yZ.h.b(navigatorHolder, viewLifecycleOwner, getNavigator());
        r activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        L.a(onBackPressedDispatcher, getViewLifecycleOwner(), new C1380c(), 2);
    }

    protected final void setConfig(@NotNull C9010b c9010b) {
        Intrinsics.checkNotNullParameter(c9010b, "<set-?>");
        this.config = c9010b;
    }

    public final void setNavigator(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.navigator = gVar;
    }

    protected final void setNavigatorHolder(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.navigatorHolder = hVar;
    }

    protected final void setRouter(@NotNull GZ.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.router = gVar;
    }

    private final boolean hideKeyboard(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            return inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }
}
