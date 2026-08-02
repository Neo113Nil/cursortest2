package com.unity3d.ads.core.domain;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.a70;
import defpackage.gt8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.time.TimeMark;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "diagnosticReason", "", "reason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", PglCryptUtils.KEY_MESSAGE, "code", "", "debugMessage"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LegacyShowUseCase$showError$1 extends hoi implements gt8 {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    final /* synthetic */ TimeMark $startTime;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showError$1(LegacyShowUseCase legacyShowUseCase, String str, TimeMark timeMark, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, String str2, rq3<? super LegacyShowUseCase$showError$1> rq3Var) {
        super(6, rq3Var);
        this.this$0 = legacyShowUseCase;
        this.$opportunityId = str;
        this.$startTime = timeMark;
        this.$showOptions = unityAdsShowOptions;
        this.$listeners = listeners;
        this.$placement = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        listeners.onError(str, unityAdsShowError, str2);
        return Unit.a;
    }

    @Override // defpackage.gt8
    public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, rq3<? super Unit> rq3Var) {
        LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new LegacyShowUseCase$showError$1(this.this$0, this.$opportunityId, this.$startTime, this.$showOptions, this.$listeners, this.$placement, rq3Var);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String adInfoString;
        AdObject adObject;
        SendDiagnosticEvent sendDiagnosticEvent;
        Map tags;
        SafeCallbackInvoke safeCallbackInvoke;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
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
        safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = LegacyShowUseCase$showError$1.invokeSuspend$lambda$0(Listeners.this, str4, unityAdsShowError, str2);
                return invokeSuspend$lambda$0;
            }
        });
        return Unit.a;
    }
}
