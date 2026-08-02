package sb0;

import Jb0.C3387e;
import Kb0.K;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.Serializable;
import java.util.Map;
import jd0.C7352e;
import jd0.q;
import jd0.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.web.OzonIdWebView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsb0/d;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: sb0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9651d extends ComponentCallbacksC5392m {

    /* renamed from: d, reason: collision with root package name */
    private static InterfaceC9652e f98513d;

    /* renamed from: a, reason: collision with root package name */
    private C3387e f98514a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f98515b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7352e f98516c = new C7352e(new b(), null, c.f98519b, C2167d.f98520b);

    /* renamed from: sb0.d$a */
    static final class a extends AbstractC7737t implements Function1<C, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f98517b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C c11) {
            C addCallback = c11;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            InterfaceC9652e interfaceC9652e = C9651d.f98513d;
            if (interfaceC9652e != null) {
                interfaceC9652e.onClose();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: sb0.d$b */
    static final class b extends AbstractC7737t implements Function1<String, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            Intrinsics.checkNotNullParameter(url, "url");
            if (h.A(url, "abt/captcha/ok", false)) {
                InterfaceC9652e interfaceC9652e = C9651d.f98513d;
                if (interfaceC9652e != null) {
                    interfaceC9652e.onSuccess();
                }
            } else if (h.A(url, "abt/captcha/fail", false)) {
                InterfaceC9652e interfaceC9652e2 = C9651d.f98513d;
                if (interfaceC9652e2 != null) {
                    interfaceC9652e2.a();
                }
            } else {
                C3387e c3387e = C9651d.this.f98514a;
                if (c3387e != null) {
                    c3387e.f14411c.loadUrl(url);
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: sb0.d$c */
    static final class c extends AbstractC7737t implements Function1<C7352e.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f98519b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7352e.a aVar) {
            C7352e.a error = aVar;
            Intrinsics.checkNotNullParameter(error, "error");
            InterfaceC9652e interfaceC9652e = C9651d.f98513d;
            if (interfaceC9652e != null) {
                interfaceC9652e.b(error);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: sb0.d$d, reason: collision with other inner class name */
    static final class C2167d extends AbstractC7737t implements Function1<C7352e.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2167d f98520b = new C2167d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7352e.a aVar) {
            C7352e.a error = aVar;
            Intrinsics.checkNotNullParameter(error, "error");
            InterfaceC9652e interfaceC9652e = C9651d.f98513d;
            if (interfaceC9652e != null) {
                interfaceC9652e.c(error);
            }
            return Unit.f71690a;
        }
    }

    public static void t() {
        InterfaceC9652e interfaceC9652e = f98513d;
        if (interfaceC9652e != null) {
            interfaceC9652e.onClose();
        }
    }

    private final OzonIdWebView x() {
        C3387e c3387e = this.f98514a;
        Intrinsics.f(c3387e);
        OzonIdWebView webView = c3387e.f14411c;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        return webView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f98515b = bundle;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C3387e b11 = C3387e.b(inflater, viewGroup);
        this.f98514a = b11;
        FrameLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        Bundle bundle = new Bundle();
        x().saveState(bundle);
        this.f98515b = bundle;
        this.f98514a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        x().onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        x().onResume();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Bundle bundle;
        OzonIdWebView ozonIdWebView;
        Intrinsics.checkNotNullParameter(outState, "outState");
        C3387e c3387e = this.f98514a;
        if ((c3387e == null || (ozonIdWebView = c3387e.f14411c) == null || ozonIdWebView.saveState(outState) == null) && (bundle = this.f98515b) != null) {
            outState.putAll(bundle);
            Unit unit = Unit.f71690a;
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        J onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        r activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            L.a(onBackPressedDispatcher, null, a.f98517b, 3);
        }
        C3387e c3387e = this.f98514a;
        Intrinsics.f(c3387e);
        OzonIdWebView webView = c3387e.f14411c;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        w.a(webView, q.NO_CACHE);
        webView.setWebViewClient(this.f98516c);
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        jd0.r value = k11.t().n().getValue();
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        value.f(webView);
        c3387e.f14410b.setOnClickListener(new ViewOnClickListenerC9650c());
        String string = requireArguments().getString(ImagesContract.URL);
        if (string == null) {
            throw new IllegalStateException("Url не передан");
        }
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        Serializable serializable = Build.VERSION.SDK_INT >= 33 ? requireArguments.getSerializable("headers", Serializable.class) : requireArguments.getSerializable("headers");
        Map<String, String> map = serializable instanceof Map ? (Map) serializable : null;
        if (map == null) {
            map = U.c();
        }
        webView.loadUrl(string, map);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            bundle = this.f98515b;
        }
        if (bundle != null) {
            x().restoreState(bundle);
        }
    }
}
