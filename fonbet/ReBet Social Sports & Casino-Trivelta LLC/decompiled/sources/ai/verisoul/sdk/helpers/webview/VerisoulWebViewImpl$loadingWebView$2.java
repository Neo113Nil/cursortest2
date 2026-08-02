package ai.verisoul.sdk.helpers.webview;

import Ph.C1452g0;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.M0;
import Ph.P;
import ai.verisoul.sdk.logger.Logger;
import android.webkit.WebView;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$loadingWebView$2", f = "VerisoulWebViewImpl.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nVerisoulWebViewImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerisoulWebViewImpl.kt\nai/verisoul/sdk/helpers/webview/VerisoulWebViewImpl$loadingWebView$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,281:1\n314#2,11:282\n*S KotlinDebug\n*F\n+ 1 VerisoulWebViewImpl.kt\nai/verisoul/sdk/helpers/webview/VerisoulWebViewImpl$loadingWebView$2\n*L\n143#1:282,11\n*E\n"})
/* loaded from: classes.dex */
public final class VerisoulWebViewImpl$loadingWebView$2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ VerisoulWebViewImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$loadingWebView$2$1", f = "VerisoulWebViewImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$loadingWebView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionId;
        int label;
        final /* synthetic */ VerisoulWebViewImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VerisoulWebViewImpl verisoulWebViewImpl, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = verisoulWebViewImpl;
            this.$sessionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$sessionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.initializeWebView(this.$sessionId);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerisoulWebViewImpl$loadingWebView$2(VerisoulWebViewImpl verisoulWebViewImpl, String str, Continuation<? super VerisoulWebViewImpl$loadingWebView$2> continuation) {
        super(2, continuation);
        this.this$0 = verisoulWebViewImpl;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VerisoulWebViewImpl$loadingWebView$2(this.this$0, this.$sessionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((VerisoulWebViewImpl$loadingWebView$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (Ph.AbstractC1455i.g(r8, r1, r7) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        WebView webView;
        WebView webView2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            M0 c10 = C1452g0.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$sessionId, null);
            this.label = 1;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        final VerisoulWebViewImpl verisoulWebViewImpl = this.this$0;
        this.L$0 = verisoulWebViewImpl;
        this.label = 2;
        final C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
        c1469p.F();
        JSBridge jSBridge = new JSBridge(new WebViewInitCallback() { // from class: ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$loadingWebView$2$2$jsBridge$1
            @Override // ai.verisoul.sdk.helpers.webview.WebViewInitCallback
            public void onFailure(@NotNull Exception exception) {
                String str;
                Intrinsics.checkNotNullParameter(exception, "exception");
                Logger logger = Logger.INSTANCE;
                str = verisoulWebViewImpl.TAG;
                logger.error(str, "Error fetching sessionId: " + exception.getMessage());
                if (InterfaceC1465n.this.isActive()) {
                    InterfaceC1465n interfaceC1465n = InterfaceC1465n.this;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(exception)));
                }
            }

            @Override // ai.verisoul.sdk.helpers.webview.WebViewInitCallback
            public void onInit() {
                if (InterfaceC1465n.this.isActive()) {
                    InterfaceC1465n interfaceC1465n = InterfaceC1465n.this;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                }
            }
        });
        webView = verisoulWebViewImpl.webView;
        if (webView != null) {
            webView.removeJavascriptInterface(JSBridge.class.getSimpleName());
        }
        webView2 = verisoulWebViewImpl.webView;
        if (webView2 != null) {
            webView2.addJavascriptInterface(jSBridge, JSBridge.class.getSimpleName());
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
    }
}
