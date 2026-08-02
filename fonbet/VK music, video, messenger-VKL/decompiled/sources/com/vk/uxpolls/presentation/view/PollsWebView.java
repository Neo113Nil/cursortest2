package com.vk.uxpolls.presentation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.presentation.js.model.UxPollsSetHeight;
import com.vk.uxpolls.presentation.js.model.UxPollsTheme;
import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;
import com.vk.uxpolls.presentation.view.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.bpn0;
import xsna.d4e0;
import xsna.dub0;
import xsna.ewj;
import xsna.f5r0;
import xsna.g59;
import xsna.g5r0;
import xsna.hp30;
import xsna.jw30;
import xsna.l4r0;
import xsna.lsr;
import xsna.nix0;
import xsna.oub0;
import xsna.r820;
import xsna.rsr;
import xsna.s3q0;
import xsna.so40;
import xsna.spj;
import xsna.vwt0;
import xsna.w910;
import xsna.wzs;
import xsna.yte;
import xsna.yzs;
import xsna.ztr;

/* compiled from: PollsWebView.kt */
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes6.dex */
public final class PollsWebView extends FrameLayout implements ewj {
    public static final /* synthetic */ int h = 0;
    public final bpn0 b;
    public final bpn0 c;
    public UxPollsTheme d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;

    /* compiled from: PollsWebView.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements yzs<com.vk.uxpolls.presentation.js.model.a, a.AbstractC1943a, spj<? super Boolean>, Object> {
        @Override // xsna.yzs
        public final Object invoke(com.vk.uxpolls.presentation.js.model.a aVar, a.AbstractC1943a abstractC1943a, spj<? super Boolean> spjVar) {
            return PollsWebView.d((PollsWebView) this.receiver, aVar, abstractC1943a);
        }
    }

    /* compiled from: PollsWebView.kt */
    @b6l(c = "com.vk.uxpolls.presentation.view.PollsWebView$onAttachedToWindow$2", f = "PollsWebView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<lsr<? super Boolean>, Throwable, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super Boolean> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
            b bVar = PollsWebView.this.new b(spjVar);
            bVar.L$0 = th;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            PollsWebView.this.onError(th);
            return s3q0.a;
        }
    }

    /* compiled from: PollsWebView.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements wzs<a.AbstractC1943a, spj<? super s3q0>, Object> {
        @Override // xsna.wzs
        public final Object invoke(a.AbstractC1943a abstractC1943a, spj<? super s3q0> spjVar) {
            return PollsWebView.e((PollsWebView) this.receiver, abstractC1943a);
        }
    }

    /* compiled from: PollsWebView.kt */
    @b6l(c = "com.vk.uxpolls.presentation.view.PollsWebView$onAttachedToWindow$4", f = "PollsWebView.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements yzs<lsr<? super a.AbstractC1943a>, Throwable, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public d(spj<? super d> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super a.AbstractC1943a> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
            d dVar = PollsWebView.this.new d(spjVar);
            dVar.L$0 = th;
            return dVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            PollsWebView.this.onError(th);
            return s3q0.a;
        }
    }

    /* compiled from: PollsWebView.kt */
    public static final class e extends g5r0 {
        public e(com.vk.uxpolls.presentation.view.a aVar) {
            super(PollsWebView.this, aVar);
        }

        @Override // xsna.g5r0, xsna.o2y
        public final void l1(UxPollsSetHeight uxPollsSetHeight) {
            super.l1(uxPollsSetHeight);
            nix0.b(PollsWebView.this.getWebView(), Integer.valueOf((int) TypedValue.applyDimension(1, Integer.valueOf(uxPollsSetHeight.getHeight()).floatValue(), Resources.getSystem().getDisplayMetrics())));
        }
    }

    /* compiled from: PollsWebView.kt */
    public static final class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PollsWebView.this.getController().h();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            PollsWebView.this.getController().i(webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            PollsWebView.this.getController().g(webResourceResponse);
        }
    }

    public PollsWebView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static e a(PollsWebView pollsWebView) {
        return pollsWebView.new e(pollsWebView.getController());
    }

    public static final Boolean d(PollsWebView pollsWebView, com.vk.uxpolls.presentation.js.model.a aVar, a.AbstractC1943a abstractC1943a) {
        pollsWebView.getClass();
        boolean z = false;
        if (aVar != null) {
            UxPollsPoll uxPollsPoll = aVar.a;
            if (abstractC1943a instanceof a.AbstractC1943a.b) {
                if (!(abstractC1943a instanceof a.AbstractC1943a.b.C1945a) || ((a.AbstractC1943a.b.C1945a) abstractC1943a).a != uxPollsPoll.getId()) {
                    String e2 = uxPollsPoll.e();
                    List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> list = aVar.b;
                    UxPollsTheme theme = pollsWebView.getTheme();
                    String h2 = theme != null ? theme.h() : null;
                    d4e0 d4e0Var = l4r0.b;
                    nix0.a(pollsWebView.getWebView(), new VKWebAppEventData.VKWebAppUXPollsConfig(e2, list, h2, d4e0Var != null ? d4e0Var.a() : null, null));
                }
                s3q0 s3q0Var = s3q0.a;
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final s3q0 e(PollsWebView pollsWebView, a.AbstractC1943a abstractC1943a) {
        if (abstractC1943a instanceof a.AbstractC1943a.c) {
            pollsWebView.getWebView().loadUrl(((a.AbstractC1943a.c) abstractC1943a).a);
        } else {
            pollsWebView.getClass();
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vk.uxpolls.presentation.view.a getController() {
        return (com.vk.uxpolls.presentation.view.a) this.c.getValue();
    }

    private final GestureDetector getScrollGestureDetector() {
        return (GestureDetector) this.g.getValue();
    }

    private final UxPollsTheme getTheme() {
        Configuration configuration;
        UxPollsTheme uxPollsTheme = this.d;
        if (uxPollsTheme != null) {
            return uxPollsTheme;
        }
        Resources resources = getContext().getResources();
        Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        return (valueOf != null && valueOf.intValue() == 32) ? UxPollsTheme.DARK : (valueOf != null && valueOf.intValue() == 16) ? UxPollsTheme.LIGHT : UxPollsTheme.LIGHT;
    }

    private final f5r0 getUxPollsJsInterface() {
        return (f5r0) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView getWebView() {
        return (WebView) this.b.getValue();
    }

    private final WebViewClient getWebViewClient() {
        return (WebViewClient) this.f.getValue();
    }

    public final void f(UxPollsTheme uxPollsTheme) {
        this.d = uxPollsTheme;
        UxPollsTheme theme = getTheme();
        nix0.a(getWebView(), new VKWebAppEventData.VKWebAppUXPollsConfig(null, null, theme != null ? theme.h() : null, null, null, 27, null));
    }

    public final void g(com.vk.uxpolls.presentation.js.model.a aVar) {
        WebView webView = getWebView();
        Integer d2 = aVar.a.d();
        nix0.b(webView, d2 != null ? Integer.valueOf((int) TypedValue.applyDimension(1, d2.floatValue(), Resources.getSystem().getDisplayMetrics())) : null);
        getController().d(aVar);
    }

    public final boolean h() {
        return getController().e().getValue() instanceof a.AbstractC1943a.b;
    }

    public final void hide() {
        getController().m1();
    }

    public final void i() {
        getController().load();
    }

    public final void j(List list) {
        getController().c(list, new w910(this, 13));
    }

    public final void k(List list) {
        getController().a(list, true, new r820(this, 12));
    }

    public final void l(List list) {
        getController().a(list, false, new yte(1, this, PollsWebView.class, "handlePollsRetrieved", "handlePollsRetrieved(Lcom/vk/uxpolls/presentation/js/model/UxPollsPollState;)V", 0, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rsr.s(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new ztr(getController().f(), getController().e(), new a(3, this, PollsWebView.class, "handleNewPoll", "handleNewPoll(Lcom/vk/uxpolls/presentation/js/model/UxPollsPollState;Lcom/vk/uxpolls/presentation/view/UxPollsManager$WebAppState;)Z", 4)), new b(null)), vwt0.a(this));
        rsr.s(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(getController().e(), new c(2, this, PollsWebView.class, "handleWebAppState", "handleWebAppState(Lcom/vk/uxpolls/presentation/view/UxPollsManager$WebAppState;)V", 4)), new d(null)), vwt0.a(this));
    }

    @Override // xsna.ewj
    public final void onError(Throwable th) {
        getController().onError(th);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(getScrollGestureDetector().onTouchEvent(motionEvent));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPollsListener(dub0 dub0Var) {
        getController().b(dub0Var);
    }

    public PollsWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PollsWebView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PollsWebView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PollsWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new bpn0(new g59(context, attributeSet, i, 3));
        this.c = new bpn0(new hp30(this, 10));
        this.e = new bpn0(new jw30(this, 12));
        this.f = new bpn0(new so40(this, 11));
        this.g = new bpn0(new oub0(context));
        addView(getWebView());
        getWebView().setWebChromeClient(new WebChromeClient());
        getWebView().setWebViewClient(getWebViewClient());
        getWebView().getSettings().setJavaScriptEnabled(true);
        getWebView().addJavascriptInterface(getUxPollsJsInterface(), "AndroidBridge");
        getWebView().setBackgroundColor(0);
        getWebView().setFocusable(true);
        getWebView().setFocusableInTouchMode(true);
    }
}
