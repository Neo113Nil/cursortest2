package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b0t;
import xsna.b6l;
import xsna.gzs;
import xsna.s3q0;
import xsna.spj;
import xsna.uto0;

/* compiled from: LegacyShowUseCase.kt */
@b6l(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class LegacyShowUseCase$showError$1 extends SuspendLambda implements b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    final /* synthetic */ uto0 $startTime;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showError$1(LegacyShowUseCase legacyShowUseCase, String str, uto0 uto0Var, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, String str2, spj<? super LegacyShowUseCase$showError$1> spjVar) {
        super(6, spjVar);
        this.this$0 = legacyShowUseCase;
        this.$opportunityId = str;
        this.$startTime = uto0Var;
        this.$showOptions = unityAdsShowOptions;
        this.$listeners = listeners;
        this.$placement = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invokeSuspend$lambda$0(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        listeners.onError(str, unityAdsShowError, str2);
        return s3q0.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String adInfoString;
        AdObject adObject;
        SendDiagnosticEvent sendDiagnosticEvent;
        Map tags;
        SafeCallbackInvoke safeCallbackInvoke;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        String str = (String) this.L$0;
        final UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
        final String str2 = (String) this.L$2;
        Integer num = (Integer) this.L$3;
        String str3 = (String) this.L$4;
        logger = this.this$0.logger;
        StringBuilder sb = new StringBuilder("Failed to show ad ");
        adInfoString = this.this$0.getAdInfoString();
        sb.append(adInfoString);
        sb.append(", error: ");
        sb.append(str2);
        Logger.DefaultImpls.error$default(logger, sb.toString(), null, 2, null);
        adObject = this.this$0.adObject;
        if (adObject == null) {
            adObject = this.this$0.getTmpAdObject(this.$opportunityId);
        }
        AdObject adObject2 = adObject;
        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME;
        Double d = new Double(TimeExtensionsKt.elapsedMillis(this.$startTime));
        tags = this.this$0.getTags(str, num, str3, this.$showOptions);
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, tags, (Map) null, adObject2, (Integer) null, (ByteString) null, 104, (Object) null);
        safeCallbackInvoke = this.this$0.safeCallbackInvoke;
        final Listeners listeners = this.$listeners;
        final String str4 = this.$placement;
        safeCallbackInvoke.invoke(new gzs() { // from class: com.unity3d.ads.core.domain.c
            @Override // xsna.gzs
            public final Object invoke() {
                s3q0 invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = LegacyShowUseCase$showError$1.invokeSuspend$lambda$0(Listeners.this, str4, unityAdsShowError, str2);
                return invokeSuspend$lambda$0;
            }
        });
        return s3q0.a;
    }

    @Override // xsna.b0t
    public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, spj<? super s3q0> spjVar) {
        LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new LegacyShowUseCase$showError$1(this.this$0, this.$opportunityId, this.$startTime, this.$showOptions, this.$listeners, this.$placement, spjVar);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(s3q0.a);
    }
}
