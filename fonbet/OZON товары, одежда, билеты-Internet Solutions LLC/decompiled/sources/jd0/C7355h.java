package jd0;

import Ae.InterfaceC2397i;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.r;
import Vb0.b;
import a5.C4947e;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import b5.C5557r;
import b5.C5558s;
import f3.AbstractC6409a;
import java.util.Map;
import jd0.AbstractC7348a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.web.OzonIdWebView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljd0/h;", "Landroidx/fragment/app/m;", "<init>", "()V", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jd0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7355h extends ComponentCallbacksC5392m {

    /* renamed from: g, reason: collision with root package name */
    private static Function0<Unit> f69763g;

    /* renamed from: h, reason: collision with root package name */
    private static Function0<Unit> f69764h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69765a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69766b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69767c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f69768d;

    /* renamed from: e, reason: collision with root package name */
    private Jb0.t f69769e;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f69770f;

    /* renamed from: jd0.h$a */
    public static final class a {
        public static C7355h a(p type, String str, String str2, int i11) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            Intrinsics.checkNotNullParameter(type, "type");
            C7355h c7355h = new C7355h();
            c7355h.setArguments(androidx.core.os.d.b(new Pair("web_view_type", type.name()), new Pair("link", str2), new Pair("screen_id_args_key", str)));
            return c7355h;
        }
    }

    /* renamed from: jd0.h$b */
    static final class b extends AbstractC7737t implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string;
            Bundle arguments = C7355h.this.getArguments();
            if (arguments == null || (string = arguments.getString("link")) == null) {
                throw new IllegalStateException("Use Fragment.newInstance with link");
            }
            return string;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.WebFragment$onViewCreated$lambda$3$lambda$2$$inlined$repeatOnStarted$1", f = "WebFragment.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: jd0.h$c */
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69772d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ J f69773e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7355h f69774f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ OzonIdWebView f69775g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.WebFragment$onViewCreated$lambda$3$lambda$2$$inlined$repeatOnStarted$1$1", f = "WebFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: jd0.h$c$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f69776d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C7355h f69777e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ OzonIdWebView f69778f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, C7355h c7355h, OzonIdWebView ozonIdWebView) {
                super(2, dVar);
                this.f69777e = c7355h;
                this.f69778f = ozonIdWebView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(dVar, this.f69777e, this.f69778f);
                aVar.f69776d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                C10727i.c((M) this.f69776d, null, null, new d(this.f69777e.z().f0(), null, this.f69778f), 3);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(J j11, kotlin.coroutines.d dVar, C7355h c7355h, OzonIdWebView ozonIdWebView) {
            super(2, dVar);
            this.f69773e = j11;
            this.f69774f = c7355h;
            this.f69775g = ozonIdWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f69773e, dVar, this.f69774f, this.f69775g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69772d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(null, this.f69774f, this.f69775g);
                this.f69772d = 1;
                if (C5412d0.b(this.f69773e, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.WebFragment$onViewCreated$lambda$3$lambda$2$lambda$1$$inlined$collectFlow$1", f = "WebFragment.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: jd0.h$d */
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69779d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC7348a.d f69780e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OzonIdWebView f69781f;

        /* renamed from: jd0.h$d$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OzonIdWebView f69782a;

            public a(OzonIdWebView ozonIdWebView) {
                this.f69782a = ozonIdWebView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                AbstractC7348a.C1139a c1139a = (AbstractC7348a.C1139a) t2;
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                k11.X().h().getValue().g(this.f69782a, c1139a.b(), c1139a.a());
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC7348a.d dVar, kotlin.coroutines.d dVar2, OzonIdWebView ozonIdWebView) {
            super(2, dVar2);
            this.f69780e = dVar;
            this.f69781f = ozonIdWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f69780e, dVar, this.f69781f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69779d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f69781f);
                this.f69779d = 1;
                if (this.f69780e.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: jd0.h$e */
    static final class e extends AbstractC7737t implements Function0<String> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = C7355h.this.requireArguments().getString("screen_id_args_key");
            if (string != null) {
                return string;
            }
            throw new IllegalStateException("Use Fragment.newInstance with screenId");
        }
    }

    /* renamed from: jd0.h$f */
    public static final class f extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C7355h.this;
        }
    }

    /* renamed from: jd0.h$g */
    public static final class g extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f69785b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f69785b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f69785b.invoke();
        }
    }

    /* renamed from: jd0.h$h, reason: collision with other inner class name */
    public static final class C1143h extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f69786b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1143h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f69786b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f69786b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: jd0.h$i */
    public static final class i extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f69787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f69787b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f69787b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: jd0.h$j */
    static final class j extends AbstractC7737t implements Function0<p> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p invoke() {
            String string = C7355h.this.requireArguments().getString("web_view_type");
            if (string != null) {
                return p.valueOf(string);
            }
            throw new IllegalStateException("Use Fragment.newInstance with type");
        }
    }

    /* renamed from: jd0.h$k */
    static final class k extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: jd0.h$k$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f69790a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.Antibot.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.OzonIdAuth.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.FintechRecovery.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f69790a = iArr;
            }
        }

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            C7355h c7355h = C7355h.this;
            int i11 = a.f69790a[c7355h.x().ordinal()];
            if (i11 == 1) {
                K k11 = Tb0.a.f26975d;
                if (k11 != null) {
                    return k11.b0().d(c7355h.v());
                }
                throw new Lb0.a();
            }
            if (i11 == 2) {
                return new n(c7355h, c7355h);
            }
            if (i11 == 3) {
                return new o(c7355h, c7355h);
            }
            throw new Sc.o();
        }
    }

    public C7355h() {
        super(R.layout.fragment_ozon_id_web);
        this.f69765a = Sc.k.b(new j());
        this.f69766b = Sc.k.b(new b());
        this.f69767c = Sc.k.b(new e());
        k kVar = new k();
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new g(new f()));
        this.f69768d = b0.b(this, N.b(AbstractC7348a.class), new C1143h(a11), new i(a11), kVar);
    }

    private final OzonIdWebView y() {
        Jb0.t tVar = this.f69769e;
        if (tVar == null) {
            throw new IllegalStateException("binding is null");
        }
        OzonIdWebView webView = tVar.f14549d;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC7348a z() {
        return (AbstractC7348a) this.f69768d.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f69770f = bundle;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        f69763g = null;
        f69764h = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        Bundle bundle = new Bundle();
        y().saveState(bundle);
        this.f69770f = bundle;
        this.f69769e = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        y().onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        y().onResume();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Bundle bundle;
        OzonIdWebView ozonIdWebView;
        Intrinsics.checkNotNullParameter(outState, "outState");
        Jb0.t tVar = this.f69769e;
        if ((tVar == null || (ozonIdWebView = tVar.f14549d) == null || ozonIdWebView.saveState(outState) == null) && (bundle = this.f69770f) != null) {
            outState.putAll(bundle);
            Unit unit = Unit.f71690a;
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Object a11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        z().l0();
        Jb0.t a12 = Jb0.t.a(view);
        this.f69769e = a12;
        AppCompatImageView backButtonImageView = a12.f14547b;
        Intrinsics.checkNotNullExpressionValue(backButtonImageView, "backButtonImageView");
        Function0<Unit> function0 = f69763g;
        if (function0 != null) {
            ViewExtKt.show(backButtonImageView);
            backButtonImageView.setOnClickListener(new GI.c(function0));
        } else {
            ViewExtKt.gone(backButtonImageView);
        }
        AppCompatImageView closeButtonImageView = a12.f14548c;
        Intrinsics.checkNotNullExpressionValue(closeButtonImageView, "closeButtonImageView");
        Function0<Unit> function02 = f69764h;
        if (function02 != null) {
            ViewExtKt.show(closeButtonImageView);
            closeButtonImageView.setOnClickListener(new GI.c(function02));
        } else {
            ViewExtKt.gone(closeButtonImageView);
        }
        OzonIdWebView ozonIdWebView = a12.f14549d;
        ViewGroup.LayoutParams layoutParams = ozonIdWebView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        boolean z11 = false;
        if (f69763g == null && f69764h == null) {
            ViewGroup.LayoutParams layoutParams2 = ozonIdWebView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
            }
        }
        w.a(ozonIdWebView, q.DEFAULT);
        WebSettings settings = ozonIdWebView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        if (C4947e.a("FORCE_DARK") && C4947e.a("FORCE_DARK_STRATEGY")) {
            try {
                r.Companion companion = Sc.r.INSTANCE;
                Context context = getContext();
                if (context != null && ThemeExtKt.isDarkThemeActive(context)) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            if (!C5557r.f55536a.d()) {
                throw C5557r.a();
            }
            C5558s.c().b(settings).a(z11);
            a11 = Unit.f71690a;
            b.a aVar = Vb0.b.f28514a;
            Throwable b11 = Sc.r.b(a11);
            if (b11 != null) {
                b.a.c(aVar, b11);
            }
        }
        ozonIdWebView.setWebViewClient(new C7352e(new jd0.i(1, z(), AbstractC7348a.class, "onInterceptUrl", "onInterceptUrl(Ljava/lang/String;)V", 0), new jd0.j(0, z(), AbstractC7348a.class, "onLoaded", "onLoaded()V", 0), new jd0.k(1, z(), AbstractC7348a.class, "onNetworkError", "onNetworkError(Lru/ozon/id/nativeauth/web/OzonIdWebViewClient$OzonIdWebViewError;)V", 0), new l(1, z(), AbstractC7348a.class, "onWebViewError", "onWebViewError(Lru/ozon/id/nativeauth/web/OzonIdWebViewClient$OzonIdWebViewError;)V", 0)));
        ozonIdWebView.setWebChromeClient(new m(this));
        for (Map.Entry<Object, String> entry : z().n0().entrySet()) {
            ozonIdWebView.addJavascriptInterface(entry.getKey(), entry.getValue());
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.t().n().getValue().f(y());
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new c(viewLifecycleOwner, null, this, ozonIdWebView), 3);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            bundle = this.f69770f;
        }
        if (bundle != null) {
            y().restoreState(bundle);
        }
    }

    @NotNull
    public final String v() {
        return (String) this.f69766b.getValue();
    }

    @NotNull
    public final String w() {
        return (String) this.f69767c.getValue();
    }

    @NotNull
    public final p x() {
        return (p) this.f69765a.getValue();
    }
}
