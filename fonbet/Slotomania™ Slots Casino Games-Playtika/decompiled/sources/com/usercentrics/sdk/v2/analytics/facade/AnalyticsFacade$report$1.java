package com.usercentrics.sdk.v2.analytics.facade;

import com.usercentrics.sdk.UsercentricsAnalyticsEventType;
import com.usercentrics.sdk.v2.analytics.api.IAnalyticsApi;
import com.usercentrics.sdk.v2.analytics.data.CacheBuster;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.service.ISettingsService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsFacade.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.analytics.facade.AnalyticsFacade$report$1", f = "AnalyticsFacade.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AnalyticsFacade$report$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $abTestingVariant;
    final /* synthetic */ UsercentricsAnalyticsEventType $eventType;
    final /* synthetic */ String $settingsId;
    int label;
    final /* synthetic */ AnalyticsFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsFacade$report$1(AnalyticsFacade analyticsFacade, UsercentricsAnalyticsEventType usercentricsAnalyticsEventType, String str, String str2, Continuation<? super AnalyticsFacade$report$1> continuation) {
        super(2, continuation);
        this.this$0 = analyticsFacade;
        this.$eventType = usercentricsAnalyticsEventType;
        this.$settingsId = str;
        this.$abTestingVariant = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnalyticsFacade$report$1(this.this$0, this.$eventType, this.$settingsId, this.$abTestingVariant, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((AnalyticsFacade$report$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ISettingsService iSettingsService;
        IAnalyticsApi iAnalyticsApi;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            iSettingsService = this.this$0.settingsService;
            NewSettingsData settings = iSettingsService.getSettings();
            Intrinsics.checkNotNull(settings);
            if (settings.getData().getInteractionAnalytics()) {
                iAnalyticsApi = this.this$0.analyticsApi;
                iAnalyticsApi.report(this.$eventType, this.$settingsId, this.$abTestingVariant, CacheBuster.INSTANCE.generate());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
