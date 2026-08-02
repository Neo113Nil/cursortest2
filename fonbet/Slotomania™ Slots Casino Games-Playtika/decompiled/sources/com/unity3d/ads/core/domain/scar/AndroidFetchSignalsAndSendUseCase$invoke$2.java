package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidFetchSignalsAndSendUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", i = {0, 0, 1, 1}, l = {35, Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE}, m = "invokeSuspend", n = {"requestedSignals", "startTime", "requestedSignals", "uploadStartTime"}, s = {"L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes2.dex */
final class AndroidFetchSignalsAndSendUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ ByteString $tokenId;
    final /* synthetic */ int $tokenNumber;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ AndroidFetchSignalsAndSendUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFetchSignalsAndSendUseCase$invoke$2(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase, TokenConfiguration tokenConfiguration, int i, ByteString byteString, Continuation<? super AndroidFetchSignalsAndSendUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidFetchSignalsAndSendUseCase;
        this.$tokenConfiguration = tokenConfiguration;
        this.$tokenNumber = i;
        this.$tokenId = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidFetchSignalsAndSendUseCase$invoke$2(this.this$0, this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidFetchSignalsAndSendUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
        SendDiagnosticEvent sendDiagnosticEvent;
        long j;
        List<AdFormatOuterClass.AdFormat> list;
        ScarManager scarManager;
        Object signals;
        Object m11180constructorimpl;
        BiddingSignals biddingSignals;
        String str;
        SendDiagnosticEvent sendDiagnosticEvent2;
        Map tags;
        SendDiagnosticEvent sendDiagnosticEvent3;
        long j2;
        List<AdFormatOuterClass.AdFormat> list2;
        HandleGetTokenRequest handleGetTokenRequest;
        Object invoke;
        Object m11180constructorimpl2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        String str2;
        SendDiagnosticEvent sendDiagnosticEvent4;
        Map tags2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long m12642markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m12642markNowz9LOYto();
                    scarEligibleEffectiveUseCase = this.this$0.scarEligibleEffectiveUseCase;
                    List<AdFormatOuterClass.AdFormat> invoke2 = scarEligibleEffectiveUseCase.invoke(this.$tokenConfiguration);
                    if (invoke2.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_scar_signals_collection_started", null, null, null, null, Boxing.boxInt(this.$tokenNumber), 30, null);
                    AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase = this.this$0;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        AndroidFetchSignalsAndSendUseCase$invoke$2 androidFetchSignalsAndSendUseCase$invoke$2 = this;
                        scarManager = androidFetchSignalsAndSendUseCase.scarManager;
                        this.L$0 = invoke2;
                        this.J$0 = m12642markNowz9LOYto;
                        this.label = 1;
                        signals = scarManager.getSignals(invoke2, this);
                        if (signals != coroutine_suspended) {
                            j = m12642markNowz9LOYto;
                            list = invoke2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        j = m12642markNowz9LOYto;
                        list = invoke2;
                        Result.Companion companion2 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                        }
                        biddingSignals = (BiddingSignals) m11180constructorimpl;
                        if (biddingSignals != null) {
                        }
                        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                        Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j)));
                        tags = this.this$0.getTags(list);
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str, boxDouble, tags, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                        if (biddingSignals == null) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.J$0;
                    list2 = (List) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        invoke = obj;
                        m11180constructorimpl2 = Result.m11180constructorimpl(invoke);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion3 = Result.INSTANCE;
                        m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) (Result.m11186isFailureimpl(m11180constructorimpl2) ? null : m11180constructorimpl2);
                        if (universalResponse != null) {
                        }
                        str2 = "native_scar_signals_upload_failure_time";
                        String str3 = str2;
                        sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                        Double boxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j2)));
                        tags2 = this.this$0.getTags(list2);
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str3, boxDouble2, tags2, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                        return Unit.INSTANCE;
                    }
                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) (Result.m11186isFailureimpl(m11180constructorimpl2) ? null : m11180constructorimpl2);
                    if (universalResponse != null || universalResponse.hasError()) {
                        str2 = "native_scar_signals_upload_failure_time";
                    } else {
                        str2 = "native_scar_signals_upload_success_time";
                    }
                    String str32 = str2;
                    sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                    Double boxDouble22 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j2)));
                    tags2 = this.this$0.getTags(list2);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str32, boxDouble22, tags2, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                    return Unit.INSTANCE;
                }
                j = this.J$0;
                list = (List) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    signals = obj;
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion22 = Result.INSTANCE;
                    m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                    if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                    }
                    biddingSignals = (BiddingSignals) m11180constructorimpl;
                    if (biddingSignals != null) {
                    }
                    sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    Double boxDouble3 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j)));
                    tags = this.this$0.getTags(list);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str, boxDouble3, tags, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                    if (biddingSignals == null) {
                    }
                }
                m11180constructorimpl = Result.m11180constructorimpl(signals);
                if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                    m11180constructorimpl = null;
                }
                biddingSignals = (BiddingSignals) m11180constructorimpl;
                if (biddingSignals != null) {
                    str = "native_scar_signals_collection_success_time";
                } else {
                    str = "native_scar_signals_collection_failure_time";
                }
                sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                Double boxDouble32 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j)));
                tags = this.this$0.getTags(list);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str, boxDouble32, tags, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                if (biddingSignals == null) {
                    return Unit.INSTANCE;
                }
                long m12642markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m12642markNowz9LOYto();
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_scar_signals_upload_started", null, null, null, null, Boxing.boxInt(this.$tokenNumber), 30, null);
                AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase2 = this.this$0;
                ByteString byteString = this.$tokenId;
                try {
                    Result.Companion companion4 = Result.INSTANCE;
                    AndroidFetchSignalsAndSendUseCase$invoke$2 androidFetchSignalsAndSendUseCase$invoke$22 = this;
                    handleGetTokenRequest = androidFetchSignalsAndSendUseCase2.handleGetTokenRequest;
                    this.L$0 = list;
                    this.J$0 = m12642markNowz9LOYto2;
                    this.label = 2;
                    invoke = handleGetTokenRequest.invoke(byteString, biddingSignals, this);
                } catch (Throwable th4) {
                    th = th4;
                    j2 = m12642markNowz9LOYto2;
                    list2 = list;
                    Result.Companion companion32 = Result.INSTANCE;
                    m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(th));
                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) (Result.m11186isFailureimpl(m11180constructorimpl2) ? null : m11180constructorimpl2);
                    if (universalResponse != null) {
                    }
                    str2 = "native_scar_signals_upload_failure_time";
                    String str322 = str2;
                    sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                    Double boxDouble222 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j2)));
                    tags2 = this.this$0.getTags(list2);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str322, boxDouble222, tags2, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                    return Unit.INSTANCE;
                }
                if (invoke != coroutine_suspended) {
                    j2 = m12642markNowz9LOYto2;
                    list2 = list;
                    m11180constructorimpl2 = Result.m11180constructorimpl(invoke);
                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) (Result.m11186isFailureimpl(m11180constructorimpl2) ? null : m11180constructorimpl2);
                    if (universalResponse != null) {
                    }
                    str2 = "native_scar_signals_upload_failure_time";
                    String str3222 = str2;
                    sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                    Double boxDouble2222 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j2)));
                    tags2 = this.this$0.getTags(list2);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str3222, boxDouble2222, tags2, null, null, Boxing.boxInt(this.$tokenNumber), 24, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
