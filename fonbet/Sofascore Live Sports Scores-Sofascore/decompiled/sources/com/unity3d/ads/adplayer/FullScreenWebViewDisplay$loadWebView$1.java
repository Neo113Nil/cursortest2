package com.unity3d.ads.adplayer;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.y6a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FullScreenWebViewDisplay$loadWebView$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", f = "FullScreenWebViewDisplay.kt", l = {211}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass1(this.this$0, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            String str;
            Map map;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                b1d displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                map = this.this$0.showOptions;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, map);
                this.label = 1;
                if (displayMessages.emit(displayReady, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FullScreenWebViewDisplay fullScreenWebViewDisplay, rq3<? super AnonymousClass2> rq3Var) {
            super(2, rq3Var);
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass2(this.this$0, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            String str;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                b1d displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "WebView failed to attach to FullScreenWebViewDisplay.");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$loadWebView$1(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, rq3<? super FullScreenWebViewDisplay$loadWebView$1> rq3Var) {
        super(2, rq3Var);
        this.$webView = webView;
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new FullScreenWebViewDisplay$loadWebView$1(this.$webView, this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((FullScreenWebViewDisplay$loadWebView$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        ISDKDispatchers dispatchers2;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        try {
            ViewParent parent = this.$webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.$webView);
            }
            this.this$0.setContentView(this.$webView);
            dispatchers2 = this.this$0.getDispatchers();
            xw3.L(s9a.c(dispatchers2.getDefault()), null, null, new AnonymousClass1(this.this$0, null), 3);
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                return Unit.a;
            }
            dispatchers = this.this$0.getDispatchers();
            xw3.L(s9a.c(dispatchers.getDefault()), null, null, new AnonymousClass2(this.this$0, null), 3);
            this.this$0.setResult(0);
            this.this$0.finish();
        }
        return Unit.a;
    }
}
