package com.usercentrics.sdk.services.tcf;

import com.usercentrics.sdk.acm.service.AdditionalConsentModeService;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.async.dispatcher.Semaphore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: TCF.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.tcf.TCF$updateTCString$1", f = "TCF.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class TCF$updateTCString$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCF$updateTCString$1(TCF tcf, Continuation<? super TCF$updateTCString$1> continuation) {
        super(2, continuation);
        this.this$0 = tcf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TCF$updateTCString$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((TCF$updateTCString$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Semaphore semaphore;
        DeviceStorage deviceStorage;
        Map map;
        AdditionalConsentModeService additionalConsentModeService;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            semaphore = this.this$0.semaphore;
            semaphore.acquire();
            this.this$0.updatePolicyVersion();
            String tCStringFromModel = this.this$0.getTCStringFromModel();
            this.this$0.updateIABTCFKeys(tCStringFromModel);
            deviceStorage = this.this$0.storageInstance;
            map = this.this$0.disclosedVendorsMap;
            additionalConsentModeService = this.this$0.additionalConsentModeService;
            deviceStorage.saveTCFData(new StorageTCF(tCStringFromModel, map, additionalConsentModeService.getAcString()));
            this.this$0.setTCFData();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
