package com.unity3d.ads.adplayer;

import androidx.lifecycle.j;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.g5z;
import xsna.kq9;
import xsna.ksr;
import xsna.lsr;
import xsna.myc0;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: FullScreenWebViewDisplay.kt */
@b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends SuspendLambda implements wzs<lsr<? super DisplayMessage>, spj<? super s3q0>, Object> {
    final /* synthetic */ kq9<s3q0> $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: FullScreenWebViewDisplay.kt */
    @b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 135}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kq9<s3q0> $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* compiled from: FullScreenWebViewDisplay.kt */
        @b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", l = {123}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03671 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03671(FullScreenWebViewDisplay fullScreenWebViewDisplay, spj<? super C03671> spjVar) {
                super(2, spjVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C03671(this.this$0, spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    a.a(obj);
                    sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    str = this.this$0.opportunityId;
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "Error loading webView");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return s3q0.a;
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C03671) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, kq9<? super s3q0> kq9Var, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = kq9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, spjVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        
            if (r7 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            AdObject adObject;
            AdObject adObject2;
            LoadEvent loadEvent;
            AdPlayer adPlayer;
            ksr<LoadEvent> onLoadEvent;
            sh50<DisplayMessage> displayMessages;
            DisplayMessage.WebViewInstanceRequest webViewInstanceRequest;
            String str;
            yvj yvjVar2;
            ISDKDispatchers dispatchers;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                yvjVar = (yvj) this.L$0;
                adObject = this.this$0.getAdObject();
                if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
                    adObject2 = this.this$0.getAdObject();
                    if (adObject2 == null || (adPlayer = adObject2.getAdPlayer()) == null || (onLoadEvent = adPlayer.getOnLoadEvent()) == null) {
                        loadEvent = null;
                        if (loadEvent instanceof LoadEvent.Error) {
                            this.this$0.setResult(0);
                            dispatchers = this.this$0.getDispatchers();
                            myc0.h(zvj.a(dispatchers.getDefault()), null, null, new C03671(this.this$0, null), 3);
                            this.this$0.finish();
                            this.$continuation.z(null);
                        }
                    } else {
                        this.L$0 = yvjVar;
                        this.label = 1;
                        obj = rsr.u(onLoadEvent, this);
                    }
                }
                displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                str = this.this$0.opportunityId;
                webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
                this.L$0 = yvjVar;
                this.label = 2;
                if (displayMessages.emit(webViewInstanceRequest, this) != coroutineSingletons) {
                    yvjVar2 = yvjVar;
                    zvj.e(yvjVar2);
                    kq9<s3q0> kq9Var = this.$continuation;
                    s3q0 s3q0Var = s3q0.a;
                    kq9Var.resumeWith(s3q0Var);
                    return s3q0Var;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yvjVar2 = (yvj) this.L$0;
                a.a(obj);
                zvj.e(yvjVar2);
                kq9<s3q0> kq9Var2 = this.$continuation;
                s3q0 s3q0Var2 = s3q0.a;
                kq9Var2.resumeWith(s3q0Var2);
                return s3q0Var2;
            }
            yvjVar = (yvj) this.L$0;
            a.a(obj);
            loadEvent = (LoadEvent) obj;
            if (loadEvent instanceof LoadEvent.Error) {
            }
            displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            str = this.this$0.opportunityId;
            webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
            this.L$0 = yvjVar;
            this.label = 2;
            if (displayMessages.emit(webViewInstanceRequest, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, kq9<? super s3q0> kq9Var, spj<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1> spjVar) {
        super(2, spjVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = kq9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        j a = g5z.a(this.this$0);
        dispatchers = this.this$0.getDispatchers();
        myc0.h(a, dispatchers.getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super DisplayMessage> lsrVar, spj<? super s3q0> spjVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
