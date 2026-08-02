package com.usercentrics.sdk;

import com.usercentrics.sdk.core.application.Application;
import com.usercentrics.sdk.mediation.data.ConsentMediationPayload;
import com.usercentrics.sdk.mediation.data.MediationResultPayload;
import com.usercentrics.sdk.mediation.data.TCFConsentPayload;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: UsercentricsSDKImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/usercentrics/sdk/mediation/data/MediationResultPayload;", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsSDKImpl$applyMediationIfNeeded$1", f = "UsercentricsSDKImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UsercentricsSDKImpl$applyMediationIfNeeded$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super MediationResultPayload>, Object> {
    final /* synthetic */ List<UsercentricsServiceConsent> $consents;
    final /* synthetic */ TCFConsentPayload $tcfConsentPayload;
    int label;
    final /* synthetic */ UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsSDKImpl$applyMediationIfNeeded$1(UsercentricsSDKImpl usercentricsSDKImpl, List<UsercentricsServiceConsent> list, TCFConsentPayload tCFConsentPayload, Continuation<? super UsercentricsSDKImpl$applyMediationIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = usercentricsSDKImpl;
        this.$consents = list;
        this.$tcfConsentPayload = tCFConsentPayload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UsercentricsSDKImpl$applyMediationIfNeeded$1(this.this$0, this.$consents, this.$tcfConsentPayload, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super MediationResultPayload> continuation) {
        return ((UsercentricsSDKImpl$applyMediationIfNeeded$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isCCPAEnabled;
        Boolean bool;
        Application application;
        Application application2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            isCCPAEnabled = this.this$0.isCCPAEnabled();
            if (isCCPAEnabled) {
                Boolean optedOut = this.this$0.getUSPData().getOptedOut();
                bool = Boxing.boxBoolean(optedOut != null ? optedOut.booleanValue() : false);
            } else {
                bool = null;
            }
            List<UsercentricsServiceConsent> list = this.$consents;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (UsercentricsServiceConsent usercentricsServiceConsent : list) {
                Pair pair = TuplesKt.to(usercentricsServiceConsent.getTemplateId(), Boxing.boxBoolean(usercentricsServiceConsent.getStatus()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            TCFConsentPayload tCFConsentPayload = this.$tcfConsentPayload;
            application = this.this$0.application;
            UsercentricsVariant variant = application.getInitialValuesStrategy().getValue().getVariant();
            Intrinsics.checkNotNull(variant);
            ConsentMediationPayload consentMediationPayload = new ConsentMediationPayload(linkedHashMap, tCFConsentPayload, bool, variant);
            application2 = this.this$0.application;
            return application2.getMediationFacade().getValue().mediateConsents(consentMediationPayload);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
