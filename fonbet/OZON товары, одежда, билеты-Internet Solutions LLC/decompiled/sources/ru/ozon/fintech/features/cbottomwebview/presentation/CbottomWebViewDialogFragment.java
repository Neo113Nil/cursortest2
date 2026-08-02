package ru.ozon.fintech.features.cbottomwebview.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B90.m0;
import Sc.C4001c;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/cbottomwebview/presentation/CbottomWebViewDialogFragment;", "LE30/b;", "Lw40/a;", "<init>", "()V", "cbottom-webview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomWebViewDialogFragment extends E30.b implements InterfaceC10428a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f95405a = "CbottomWebViewDialogFragment";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f95406b;

    /* renamed from: c, reason: collision with root package name */
    private G50.a f95407c;

    /* renamed from: d, reason: collision with root package name */
    private WebView f95408d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f95409e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f95410f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f95411g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f95412h;

    /* renamed from: i, reason: collision with root package name */
    private ValueCallback<Uri[]> f95413i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC6592d<Intent> f95414j;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            CbottomWebViewDialogFragment.this.G().r0();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$onCreateView$$inlined$observe$1", f = "CbottomWebViewDialogFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95416d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95417e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95419g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomWebViewDialogFragment f95420h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$onCreateView$$inlined$observe$1$1", f = "CbottomWebViewDialogFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95421d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95422e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomWebViewDialogFragment f95423f;

            /* renamed from: ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2028a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomWebViewDialogFragment f95424a;

                public C2028a(CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
                    this.f95424a = cbottomWebViewDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    boolean z11 = screenState instanceof ScreenState.Progress;
                    CbottomWebViewDialogFragment cbottomWebViewDialogFragment = this.f95424a;
                    if (z11) {
                        G50.a aVar = cbottomWebViewDialogFragment.f95407c;
                        if (aVar != null) {
                            aVar.f9727c.setVisibility(0);
                        }
                        G50.a aVar2 = cbottomWebViewDialogFragment.f95407c;
                        if (aVar2 != null) {
                            aVar2.f9727c.bindState(screenState);
                        }
                    } else if (screenState instanceof ScreenState.Error) {
                        G50.a aVar3 = cbottomWebViewDialogFragment.f95407c;
                        if (aVar3 != null) {
                            aVar3.f9727c.setVisibility(0);
                        }
                        G50.a aVar4 = cbottomWebViewDialogFragment.f95407c;
                        if (aVar4 != null) {
                            aVar4.f9727c.bindState(screenState);
                        }
                    } else {
                        G50.a aVar5 = cbottomWebViewDialogFragment.f95407c;
                        if (aVar5 != null) {
                            aVar5.f9727c.reset();
                        }
                        G50.a aVar6 = cbottomWebViewDialogFragment.f95407c;
                        if (aVar6 != null) {
                            aVar6.f9727c.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
                super(2, dVar);
                this.f95422e = interfaceC2395h;
                this.f95423f = cbottomWebViewDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95422e, dVar, this.f95423f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95421d;
                if (i11 == 0) {
                    s.b(obj);
                    C2028a c2028a = new C2028a(this.f95423f);
                    this.f95421d = 1;
                    if (this.f95422e.collect(c2028a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
            super(2, dVar);
            this.f95419g = interfaceC2395h;
            this.f95420h = cbottomWebViewDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = CbottomWebViewDialogFragment.this.new b(this.f95419g, dVar, this.f95420h);
            bVar.f95417e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95416d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95417e)) {
                    J viewLifecycleOwner = CbottomWebViewDialogFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95419g, null, this.f95420h);
                    this.f95416d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$onCreateView$2", f = "CbottomWebViewDialogFragment.kt", l = {152}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95425d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$onCreateView$2$1", f = "CbottomWebViewDialogFragment.kt", l = {153}, m = "invokeSuspend")
        static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95427d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CbottomWebViewDialogFragment f95428e;

            /* renamed from: ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$c$a$a, reason: collision with other inner class name */
            static final class C2029a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomWebViewDialogFragment f95429a;

                C2029a(CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
                    this.f95429a = cbottomWebViewDialogFragment;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    I50.d dVar2 = (I50.d) obj;
                    if (dVar2 != null) {
                        boolean d11 = dVar2.d();
                        CbottomWebViewDialogFragment cbottomWebViewDialogFragment = this.f95429a;
                        if (d11) {
                            cbottomWebViewDialogFragment.f95409e = true;
                            CbottomWebViewDialogFragment.E(cbottomWebViewDialogFragment, dVar2.c());
                        }
                        try {
                            WebView webView = cbottomWebViewDialogFragment.f95408d;
                            if (webView != null) {
                                String c11 = dVar2.c();
                                J50.f G11 = cbottomWebViewDialogFragment.G();
                                Context requireContext = cbottomWebViewDialogFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                webView.loadUrl(c11, G11.u0(requireContext));
                            }
                        } catch (Exception e11) {
                            L80.a.a("CbottomWebViewDialogFragment", C4001c.b(e11));
                        }
                        G50.a aVar = cbottomWebViewDialogFragment.f95407c;
                        if (aVar != null) {
                            aVar.f9726b.setTitle(dVar2.b());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CbottomWebViewDialogFragment cbottomWebViewDialogFragment, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f95428e = cbottomWebViewDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95428e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95427d;
                if (i11 == 0) {
                    s.b(obj);
                    CbottomWebViewDialogFragment cbottomWebViewDialogFragment = this.f95428e;
                    x0<I50.d> w02 = cbottomWebViewDialogFragment.G().w0();
                    C2029a c2029a = new C2029a(cbottomWebViewDialogFragment);
                    this.f95427d = 1;
                    if (w02.collect(c2029a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                throw new C4005g();
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CbottomWebViewDialogFragment.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95425d;
            if (i11 == 0) {
                s.b(obj);
                CbottomWebViewDialogFragment cbottomWebViewDialogFragment = CbottomWebViewDialogFragment.this;
                J viewLifecycleOwner = cbottomWebViewDialogFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.CREATED;
                a aVar2 = new a(cbottomWebViewDialogFragment, null);
                this.f95425d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment$onDestroy$1", f = "CbottomWebViewDialogFragment.kt", l = {}, m = "invokeSuspend")
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CbottomWebViewDialogFragment.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            CookieManager cookieManager = CookieManager.getInstance();
            for (String str : CbottomWebViewDialogFragment.this.G().x0()) {
                Intrinsics.f(cookieManager);
                CbottomWebViewDialogFragment.F(cookieManager, str);
            }
            cookieManager.flush();
            return Unit.f71690a;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return CbottomWebViewDialogFragment.this;
        }
    }

    public static final class f extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f95432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f95432b = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95432b.invoke();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95433b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95433b.getValue()).getViewModelStore();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95434b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95434b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public CbottomWebViewDialogFragment() {
        m0 m0Var = new m0(this, 2);
        InterfaceC4008j a11 = k.a(n.NONE, new f(new e()));
        this.f95406b = b0.b(this, kotlin.jvm.internal.N.b(J50.f.class), new g(a11), new h(a11), m0Var);
        this.f95410f = new a();
        this.f95411g = true;
        this.f95412h = k.b(new F90.d(this, 1));
    }

    public static final void E(CbottomWebViewDialogFragment cbottomWebViewDialogFragment, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.acceptCookie();
        F(cookieManager, str);
        WebView webView = cbottomWebViewDialogFragment.f95408d;
        if (webView != null) {
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            cookieManager.setAcceptThirdPartyCookies(webView, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(CookieManager cookieManager, String str) {
        try {
            String cookie = cookieManager.getCookie(str);
            if (cookie != null) {
                try {
                    Uri parse = Uri.parse(str);
                    Intrinsics.f(parse);
                    List<String> a11 = L30.a.a(parse);
                    List<String> b11 = L30.a.b(parse);
                    Iterator it = kotlin.text.h.m(cookie, new String[]{"; "}, 0, 6).iterator();
                    while (it.hasNext()) {
                        String m02 = kotlin.text.h.m0((String) it.next(), "=");
                        for (String str2 : a11) {
                            for (String str3 : b11) {
                                String str4 = m02 + "=; path=" + str3 + "; domain=" + str2;
                                String str5 = "https://" + str2 + str3;
                                L80.a.a("CbottomWebViewDialogFragment", "cookie state for " + str5 + ": " + cookieManager.getCookie(str5));
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Delete cookie: ");
                                sb2.append(str4);
                                L80.a.a("CbottomWebViewDialogFragment", sb2.toString());
                                try {
                                    cookieManager.setCookie(str, str4);
                                } catch (Exception e11) {
                                    L80.a.c("CbottomWebViewDialogFragment", "setCookie error " + str4, e11);
                                }
                            }
                        }
                    }
                } catch (Exception e12) {
                    L80.a.c("CbottomWebViewDialogFragment", "CookieManager.clearCookiesForUrl error", e12);
                }
            }
        } catch (Exception e13) {
            L80.a.c("CbottomWebViewDialogFragment", "CookieManager.clearCookiesForUrl error", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J50.f G() {
        return (J50.f) this.f95406b.getValue();
    }

    public static void t(CbottomWebViewDialogFragment cbottomWebViewDialogFragment, Uri[] uriArr) {
        ValueCallback<Uri[]> valueCallback = cbottomWebViewDialogFragment.f95413i;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
        }
        cbottomWebViewDialogFragment.f95413i = null;
    }

    public static boolean u(CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
        return cbottomWebViewDialogFragment.G().y0();
    }

    public static Unit v(CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
        cbottomWebViewDialogFragment.G().r0();
        return Unit.f71690a;
    }

    @Override // w40.InterfaceC10428a
    public final void action(String str) {
    }

    @Override // E30.b
    public final float getDimAmount() {
        return 0.0f;
    }

    @Override // E30.b
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95405a() {
        return this.f95405a;
    }

    @Override // E30.b
    /* renamed from: getLightStatusBar, reason: from getter */
    public final boolean getF95411g() {
        return this.f95411g;
    }

    @Override // E30.b
    @NotNull
    public final C getOnBackPressedCallback() {
        return this.f95410f;
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration */
    public final boolean getF96847d() {
        return ((Boolean) this.f95412h.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((H50.a) O30.a.a(O30.c.a(requireActivity)).a(H50.a.class)).E0(this);
        super.onAttach(context);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        J50.f G11 = G();
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        Integer valueOf = arguments3 != null ? Integer.valueOf(arguments3.getInt("PARAMETER_VERSION")) : null;
        Bundle arguments4 = getArguments();
        String str = "";
        if (arguments4 != null && (string = arguments4.getString("PARAMETER_UUID", "")) != null) {
            str = string;
        }
        G11.j0(string2, parcelable, valueOf, str, null);
        G().g0();
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        this.f95414j = registerForActivityResult(new J50.b(), new InterfaceC6590b() { // from class: J50.a
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                CbottomWebViewDialogFragment.t(CbottomWebViewDialogFragment.this, (Uri[]) obj);
            }
        });
        WebView webView = new WebView(requireContext());
        webView.setWebChromeClient(new ru.ozon.fintech.features.cbottomwebview.presentation.a(this));
        this.f95408d = webView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        G50.a aVar;
        WebSettings settings;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        G50.a b11 = G50.a.b(inflater, viewGroup);
        this.f95407c = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        G50.a aVar2 = this.f95407c;
        if (aVar2 != null) {
            aVar2.f9726b.bindState(new FinToolbarState(null, null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new B50.a(this, 2), null, null, null, null, 0, 127487, null));
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new c(null), 3);
        x0<ScreenState> screenStateFlow = G().getScreenStateFlow();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(screenStateFlow, null, this), 3);
        WebView webView = this.f95408d;
        if (webView != null) {
            webView.setWebViewClient(G().v0());
        }
        WebView webView2 = this.f95408d;
        if (webView2 != null && (settings = webView2.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setMixedContentMode(1);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        WebView webView3 = this.f95408d;
        if (webView3 != null && (aVar = this.f95407c) != null) {
            aVar.f9728d.addView(webView3, 0);
        }
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        G().onDestroy();
        WebView webView = this.f95408d;
        if (webView != null) {
            webView.destroy();
        }
        this.f95408d = null;
        if (this.f95409e) {
            C10727i.c(G().t0().b(), null, null, new d(null), 3);
        }
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        G50.a aVar;
        FrameLayout frameLayout;
        WebView webView = this.f95408d;
        if (webView != null) {
            webView.stopLoading();
        }
        WebView webView2 = this.f95408d;
        if (webView2 != null && (aVar = this.f95407c) != null && (frameLayout = aVar.f9728d) != null) {
            frameLayout.removeView(webView2);
        }
        ValueCallback<Uri[]> valueCallback = this.f95413i;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.f95413i = null;
        this.f95407c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        G().z0();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        G().onStart();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        G().onStop();
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public final String provideId() {
        return G().i0();
    }

    @Override // w40.InterfaceC10428a
    public final void updateState(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        G().j0(null, parcelable, 2, uuid, null);
    }
}
