package com.unity3d.ads.core.domain;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gt8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lkotlin/Function0;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {178, 184, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LegacyShowUseCase$invoke$2 extends hoi implements Function2<Function0<? extends Unit>, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $placement;
    final /* synthetic */ gt8 $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$2(LegacyShowUseCase legacyShowUseCase, AdObject adObject, boolean z, gt8 gt8Var, String str, rq3<? super LegacyShowUseCase$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = legacyShowUseCase;
        this.$adObject = adObject;
        this.$useTimeout = z;
        this.$reportShowError = gt8Var;
        this.$placement = str;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new LegacyShowUseCase$invoke$2(this.this$0, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, rq3Var);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function0<Unit> function0, rq3<? super Unit> rq3Var) {
        return ((LegacyShowUseCase$invoke$2) create(function0, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r11.terminate(r4, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r11 == r0) goto L27;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        f1d f1dVar;
        f1d f1dVar2;
        Object sendOperativeError;
        Show show;
        Function0 function02;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            function0 = (Function0) this.L$0;
            f1dVar = this.this$0.hasStarted;
            if (!((Boolean) ((fdi) f1dVar).getValue()).booleanValue()) {
                f1dVar2 = this.this$0.timeoutCancellationRequested;
                if (!((Boolean) ((fdi) f1dVar2).getValue()).booleanValue()) {
                    LegacyShowUseCase legacyShowUseCase = this.this$0;
                    OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                    AdObject adObject = this.$adObject;
                    this.L$0 = function0;
                    this.label = 1;
                    sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, "timeout", adObject, this);
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function02 = (Function0) this.L$0;
                y6a.M(obj);
                function02.invoke();
                return Unit.a;
            }
            function0 = (Function0) this.L$0;
            y6a.M(obj);
            gt8 gt8Var = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            String str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
            this.L$0 = function0;
            this.label = 3;
            if (gt8Var.invoke("timeout", unityAdsShowError, str, null, null, this) != lu3Var) {
                function02 = function0;
                function02.invoke();
                return Unit.a;
            }
            return lu3Var;
        }
        function0 = (Function0) this.L$0;
        y6a.M(obj);
        if (this.$useTimeout) {
            show = this.this$0.show;
            AdObject adObject2 = this.$adObject;
            this.L$0 = function0;
            this.label = 2;
        }
        return Unit.a;
    }
}
