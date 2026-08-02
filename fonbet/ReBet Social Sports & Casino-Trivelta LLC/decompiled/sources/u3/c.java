package u3;

import X9.m;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.RNAppleAuthentication.SignInWithAppleService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import t3.AbstractC6436c;
import t3.AbstractC6440g;
import t3.C6435b;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lu3/c;", "Landroidx/fragment/app/m;", "<init>", "()V", "Lkotlin/Function1;", "Lt3/g;", "", "callback", "g0", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "outState", "onSaveInstanceState", "onStart", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "result", "j0", "(Lt3/g;)V", "Lcom/RNAppleAuthentication/SignInWithAppleService$AuthenticationAttempt;", m.f13664a, "Lcom/RNAppleAuthentication/SignInWithAppleService$AuthenticationAttempt;", "authenticationAttempt", "n", "Lkotlin/jvm/functions/Function1;", "Landroid/webkit/WebView;", "h0", "()Landroid/webkit/WebView;", "webViewIfCreated", "o", "a", "invertase_react-native-apple-authentication_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes.dex */
public final class c extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public SignInWithAppleService.AuthenticationAttempt authenticationAttempt;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Function1 callback;

    /* renamed from: u3.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(SignInWithAppleService.AuthenticationAttempt authenticationAttempt, boolean z10) {
            Intrinsics.checkNotNullParameter(authenticationAttempt, "authenticationAttempt");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("authenticationAttempt", authenticationAttempt);
            bundle.putBoolean("fullScreen", z10);
            cVar.setArguments(bundle);
            return cVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, c.class, "onCallback", "onCallback(Lcom/RNAppleAuthentication/SignInWithAppleResult;)V", 0);
        }

        public final void a(AbstractC6440g p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((c) this.receiver).j0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC6440g) obj);
            return Unit.INSTANCE;
        }
    }

    public final void g0(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    public final WebView h0() {
        View view = getView();
        if (view instanceof WebView) {
            return (WebView) view;
        }
        return null;
    }

    public final void j0(AbstractC6440g result) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        Function1 function1 = this.callback;
        if (function1 == null) {
            return;
        }
        function1.invoke(result);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        j0(AbstractC6440g.a.f65668a);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        SignInWithAppleService.AuthenticationAttempt authenticationAttempt = arguments != null ? (SignInWithAppleService.AuthenticationAttempt) arguments.getParcelable("authenticationAttempt") : null;
        Intrinsics.checkNotNull(authenticationAttempt);
        this.authenticationAttempt = authenticationAttempt;
        Bundle arguments2 = getArguments();
        boolean z10 = arguments2 != null ? arguments2.getBoolean("fullScreen", true) : true;
        setStyle(0, AbstractC6436c.f65665a);
        if (z10) {
            return;
        }
        setStyle(1, AbstractC6436c.f65666b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        WebView webView = new WebView(requireContext());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        SignInWithAppleService.AuthenticationAttempt authenticationAttempt = this.authenticationAttempt;
        SignInWithAppleService.AuthenticationAttempt authenticationAttempt2 = null;
        if (authenticationAttempt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authenticationAttempt");
            authenticationAttempt = null;
        }
        webView.addJavascriptInterface(new C6435b(authenticationAttempt.getState(), new b(this)), "FormInterceptorInterface");
        SignInWithAppleService.AuthenticationAttempt authenticationAttempt3 = this.authenticationAttempt;
        if (authenticationAttempt3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authenticationAttempt");
            authenticationAttempt3 = null;
        }
        webView.setWebViewClient(new u3.b(authenticationAttempt3, C6435b.f65661c.a()));
        if (savedInstanceState != null) {
            Bundle bundle = savedInstanceState.getBundle("webView");
            if (bundle != null) {
                webView.restoreState(bundle);
            }
            return webView;
        }
        SignInWithAppleService.AuthenticationAttempt authenticationAttempt4 = this.authenticationAttempt;
        if (authenticationAttempt4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authenticationAttempt");
        } else {
            authenticationAttempt2 = authenticationAttempt4;
        }
        webView.loadUrl(authenticationAttempt2.getAuthenticationUri());
        return webView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = new Bundle();
        WebView h02 = h0();
        if (h02 != null) {
            h02.saveState(bundle);
        }
        Unit unit = Unit.INSTANCE;
        outState.putBundle("webView", bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
