package com.usercentrics.sdk.v2.consent.service;

import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBuffer;
import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBufferEntry;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.consent.data.SaveConsentsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ConsentsServiceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.consent.service.ConsentsServiceImpl$clearConsentsFromBuffer$1", f = "ConsentsServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConsentsServiceImpl$clearConsentsFromBuffer$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SaveConsentsData $consentsData;
    int label;
    final /* synthetic */ ConsentsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConsentsServiceImpl$clearConsentsFromBuffer$1(ConsentsServiceImpl consentsServiceImpl, SaveConsentsData saveConsentsData, Continuation<? super ConsentsServiceImpl$clearConsentsFromBuffer$1> continuation) {
        super(2, continuation);
        this.this$0 = consentsServiceImpl;
        this.$consentsData = saveConsentsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConsentsServiceImpl$clearConsentsFromBuffer$1(this.this$0, this.$consentsData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((ConsentsServiceImpl$clearConsentsFromBuffer$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeviceStorage deviceStorage;
        DeviceStorage deviceStorage2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            deviceStorage = this.this$0.deviceStorage;
            List<ConsentsBufferEntry> entries = deviceStorage.getConsentBuffer().getEntries();
            SaveConsentsData saveConsentsData = this.$consentsData;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : entries) {
                if (((ConsentsBufferEntry) obj2).getTimestampInSeconds() != saveConsentsData.getTimestampInSeconds()) {
                    arrayList.add(obj2);
                }
            }
            deviceStorage2 = this.this$0.deviceStorage;
            deviceStorage2.setConsentBuffer(new ConsentsBuffer(arrayList));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
