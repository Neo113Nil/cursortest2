package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b1d;
import defpackage.b98;
import defpackage.hda;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k6b;
import defpackage.kj2;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.w2g;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
    final /* synthetic */ kj2 $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 135}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ kj2 $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
        @il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C13451 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13451(FullScreenWebViewDisplay fullScreenWebViewDisplay, rq3<? super C13451> rq3Var) {
                super(2, rq3Var);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // defpackage.h21
            public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
                return new C13451(this.this$0, rq3Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
                return ((C13451) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
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
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "Error loading webView");
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
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, kj2 kj2Var, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = kj2Var;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, rq3Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        
            if (r7 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
        @Override // defpackage.h21
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ku3 ku3Var;
            AdObject adObject;
            AdObject adObject2;
            LoadEvent loadEvent;
            AdPlayer adPlayer;
            z88 onLoadEvent;
            b1d displayMessages;
            DisplayMessage.WebViewInstanceRequest webViewInstanceRequest;
            String str;
            ku3 ku3Var2;
            ISDKDispatchers dispatchers;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                ku3Var = (ku3) this.L$0;
                adObject = this.this$0.getAdObject();
                if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
                    adObject2 = this.this$0.getAdObject();
                    if (adObject2 == null || (adPlayer = adObject2.getAdPlayer()) == null || (onLoadEvent = adPlayer.getOnLoadEvent()) == null) {
                        loadEvent = null;
                        if (loadEvent instanceof LoadEvent.Error) {
                            this.this$0.setResult(0);
                            dispatchers = this.this$0.getDispatchers();
                            xw3.L(s9a.c(dispatchers.getDefault()), null, null, new C13451(this.this$0, null), 3);
                            this.this$0.finish();
                            this.$continuation.a(null);
                        }
                    } else {
                        this.L$0 = ku3Var;
                        this.label = 1;
                        obj = rd0.S(onLoadEvent, this);
                    }
                }
                displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
                this.L$0 = ku3Var;
                this.label = 2;
                if (displayMessages.emit(webViewInstanceRequest, this) != lu3Var) {
                    ku3Var2 = ku3Var;
                    s9a.t(ku3Var2);
                    kj2 kj2Var = this.$continuation;
                    p2g p2gVar = w2g.b;
                    Unit unit = Unit.a;
                    kj2Var.resumeWith(unit);
                    return unit;
                }
                return lu3Var;
            }
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ku3Var2 = (ku3) this.L$0;
                y6a.M(obj);
                s9a.t(ku3Var2);
                kj2 kj2Var2 = this.$continuation;
                p2g p2gVar2 = w2g.b;
                Unit unit2 = Unit.a;
                kj2Var2.resumeWith(unit2);
                return unit2;
            }
            ku3Var = (ku3) this.L$0;
            y6a.M(obj);
            loadEvent = (LoadEvent) obj;
            if (loadEvent instanceof LoadEvent.Error) {
            }
            displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
            str = this.this$0.opportunityId;
            webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
            this.L$0 = ku3Var;
            this.label = 2;
            if (displayMessages.emit(webViewInstanceRequest, this) != lu3Var) {
            }
            return lu3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, kj2 kj2Var, rq3<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = kj2Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        k6b E = hda.E(this.this$0);
        dispatchers = this.this$0.getDispatchers();
        xw3.L(E, dispatchers.getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2);
        return Unit.a;
    }
}
