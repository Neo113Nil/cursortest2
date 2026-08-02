package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function6;
import kotlin.time.TimeSource;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "emit", "(Lcom/unity3d/ads/core/data/model/ShowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LegacyShowUseCase$invoke$4<T> implements FlowCollector {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ Function6<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, AdObject adObject, Function6<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super Continuation<? super Unit>, ? extends Object> function6) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$unityAdsShowOptions = unityAdsShowOptions;
        this.$adObject = adObject;
        this.$reportShowError = function6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x015b, code lost:
    
        if (r4.invoke(r6, r6, r8, r9, r0, r10) != r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) != r3) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ShowEvent showEvent, Continuation<? super Unit> continuation) {
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
        LegacyShowUseCase$invoke$4 legacyShowUseCase$invoke$4;
        LegacyShowUseCase$invoke$4<T> legacyShowUseCase$invoke$42;
        MutableStateFlow mutableStateFlow;
        Object sendOperativeError;
        ShowEvent showEvent2 = showEvent;
        if (continuation instanceof LegacyShowUseCase$invoke$4$emit$1) {
            legacyShowUseCase$invoke$4$emit$1 = (LegacyShowUseCase$invoke$4$emit$1) continuation;
            if ((legacyShowUseCase$invoke$4$emit$1.label & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$4$emit$1.label -= Integer.MIN_VALUE;
                LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$12 = legacyShowUseCase$invoke$4$emit$1;
                Object obj = legacyShowUseCase$invoke$4$emit$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                legacyShowUseCase$invoke$4 = legacyShowUseCase$invoke$4$emit$12.label;
                if (legacyShowUseCase$invoke$4 == 0) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        Function6<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> function6 = legacyShowUseCase$invoke$4.$reportShowError;
                        UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                        String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                        legacyShowUseCase$invoke$4$emit$12.L$0 = null;
                        legacyShowUseCase$invoke$4$emit$12.L$1 = null;
                        legacyShowUseCase$invoke$4$emit$12.label = 3;
                    }
                    if (legacyShowUseCase$invoke$4 == 1) {
                        showEvent2 = (ShowEvent) legacyShowUseCase$invoke$4$emit$12.L$1;
                        LegacyShowUseCase$invoke$4<T> legacyShowUseCase$invoke$43 = (LegacyShowUseCase$invoke$4) legacyShowUseCase$invoke$4$emit$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        legacyShowUseCase$invoke$42 = legacyShowUseCase$invoke$43;
                        try {
                            Function6<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> function62 = legacyShowUseCase$invoke$42.$reportShowError;
                            String reason = ((ShowEvent.Error) showEvent2).getReason();
                            UnityAds.UnityAdsShowError unityAdsShowError2 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            String message = ((ShowEvent.Error) showEvent2).getMessage();
                            Integer boxInt = Boxing.boxInt(((ShowEvent.Error) showEvent2).getErrorCode());
                            String message2 = ((ShowEvent.Error) showEvent2).getMessage();
                            legacyShowUseCase$invoke$4$emit$12.L$0 = legacyShowUseCase$invoke$42;
                            legacyShowUseCase$invoke$4$emit$12.L$1 = null;
                            legacyShowUseCase$invoke$4$emit$12.label = 2;
                        } catch (Throwable th2) {
                            th = th2;
                            legacyShowUseCase$invoke$4 = legacyShowUseCase$invoke$42;
                            Function6<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> function63 = legacyShowUseCase$invoke$4.$reportShowError;
                            UnityAds.UnityAdsShowError unityAdsShowError3 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            String shortenedStackTrace$default2 = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                            legacyShowUseCase$invoke$4$emit$12.L$0 = null;
                            legacyShowUseCase$invoke$4$emit$12.L$1 = null;
                            legacyShowUseCase$invoke$4$emit$12.label = 3;
                        }
                    } else {
                        if (legacyShowUseCase$invoke$4 == 2) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (legacyShowUseCase$invoke$4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        legacyShowUseCase$invoke$4 = this;
                        Function6<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> function632 = legacyShowUseCase$invoke$4.$reportShowError;
                        UnityAds.UnityAdsShowError unityAdsShowError32 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                        String shortenedStackTrace$default22 = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                        legacyShowUseCase$invoke$4$emit$12.L$0 = null;
                        legacyShowUseCase$invoke$4$emit$12.L$1 = null;
                        legacyShowUseCase$invoke$4$emit$12.label = 3;
                    }
                    if (showEvent2 instanceof ShowEvent.Started) {
                        this.this$0.showStarted(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Clicked) {
                        this.this$0.showClicked(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Completed) {
                        this.this$0.showCompleted(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime), this.$placement, ((ShowEvent.Completed) showEvent2).getStatus(), this.$listeners, ((ShowEvent.Completed) showEvent2).getReason(), ((ShowEvent.Completed) showEvent2).getReasonDebug(), this.$unityAdsShowOptions);
                    } else if (showEvent2 instanceof ShowEvent.ReceivedReward) {
                        this.this$0.showReceivedReward(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Error) {
                        mutableStateFlow = this.this$0.hasStarted;
                        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                            this.this$0.showCompleted(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime), this.$placement, ShowStatus.ERROR, this.$listeners, ((ShowEvent.Error) showEvent2).getReason(), ((ShowEvent.Error) showEvent2).getMessage(), this.$unityAdsShowOptions);
                        } else {
                            LegacyShowUseCase legacyShowUseCase = this.this$0;
                            OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                            String message3 = ((ShowEvent.Error) showEvent2).getMessage();
                            AdObject adObject = this.$adObject;
                            legacyShowUseCase$invoke$4$emit$12.L$0 = this;
                            legacyShowUseCase$invoke$4$emit$12.L$1 = showEvent2;
                            legacyShowUseCase$invoke$4$emit$12.label = 1;
                            sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$12);
                            if (sendOperativeError != coroutine_suspended) {
                                legacyShowUseCase$invoke$42 = this;
                                Function6<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> function622 = legacyShowUseCase$invoke$42.$reportShowError;
                                String reason2 = ((ShowEvent.Error) showEvent2).getReason();
                                UnityAds.UnityAdsShowError unityAdsShowError22 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                String message4 = ((ShowEvent.Error) showEvent2).getMessage();
                                Integer boxInt2 = Boxing.boxInt(((ShowEvent.Error) showEvent2).getErrorCode());
                                String message22 = ((ShowEvent.Error) showEvent2).getMessage();
                                legacyShowUseCase$invoke$4$emit$12.L$0 = legacyShowUseCase$invoke$42;
                                legacyShowUseCase$invoke$4$emit$12.L$1 = null;
                                legacyShowUseCase$invoke$4$emit$12.label = 2;
                            }
                            return coroutine_suspended;
                        }
                    } else if (showEvent2 instanceof ShowEvent.CancelTimeout) {
                        this.this$0.cancelTimeout(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime));
                    } else if (showEvent2 instanceof ShowEvent.LeftApplication) {
                        this.this$0.bannerLeftApplication(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(this.$startTime), this.$placement, this.$listeners);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, continuation);
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$122 = legacyShowUseCase$invoke$4$emit$1;
        Object obj2 = legacyShowUseCase$invoke$4$emit$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        legacyShowUseCase$invoke$4 = legacyShowUseCase$invoke$4$emit$122.label;
        if (legacyShowUseCase$invoke$4 == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((ShowEvent) obj, (Continuation<? super Unit>) continuation);
    }
}
