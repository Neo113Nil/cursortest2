package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowEvent;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.b0t;
import xsna.jvo0;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.xh50;

/* compiled from: LegacyShowUseCase.kt */
/* loaded from: classes14.dex */
public final class LegacyShowUseCase$invoke$4<T> implements lsr {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, AdObject adObject, b0t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super spj<? super s3q0>, ? extends Object> b0tVar) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$unityAdsShowOptions = unityAdsShowOptions;
        this.$adObject = adObject;
        this.$reportShowError = b0tVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(3:(1:(1:13)(2:17|18))(1:19)|14|15)(2:20|21))(5:26|27|(1:29)(2:30|(1:32)(2:33|(1:35)(2:36|(1:38)(2:39|(2:41|(1:43)(2:44|(2:46|25)))(2:47|(1:49)(2:50|(1:52)(2:53|54)))))))|14|15)|22|(2:24|25)|14|15))|58|6|7|8|(0)(0)|22|(0)|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017d, code lost:
    
        r4 = r22.$reportShowError;
        r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        r9 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r0, 0, 1, null);
        r10.L$0 = null;
        r10.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0193, code lost:
    
        if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) != r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ShowEvent showEvent, spj<? super s3q0> spjVar) {
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        xh50 xh50Var;
        Object sendOperativeError;
        b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> b0tVar;
        String reason;
        UnityAds.UnityAdsShowError unityAdsShowError;
        String message;
        Integer num;
        String message2;
        ShowEvent showEvent2 = showEvent;
        if (spjVar instanceof LegacyShowUseCase$invoke$4$emit$1) {
            legacyShowUseCase$invoke$4$emit$1 = (LegacyShowUseCase$invoke$4$emit$1) spjVar;
            int i2 = legacyShowUseCase$invoke$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$4$emit$1.label = i2 - Integer.MIN_VALUE;
                legacyShowUseCase$invoke$4$emit$12 = legacyShowUseCase$invoke$4$emit$1;
                Object obj = legacyShowUseCase$invoke$4$emit$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = legacyShowUseCase$invoke$4$emit$12.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (showEvent2 instanceof ShowEvent.Started) {
                        this.this$0.showStarted(new jvo0.a(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Clicked) {
                        this.this$0.showClicked(new jvo0.a(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Completed) {
                        this.this$0.showCompleted(new jvo0.a(this.$startTime), this.$placement, ((ShowEvent.Completed) showEvent2).getStatus(), this.$listeners, ((ShowEvent.Completed) showEvent2).getReason(), ((ShowEvent.Completed) showEvent2).getReasonDebug(), this.$unityAdsShowOptions);
                    } else if (showEvent2 instanceof ShowEvent.ReceivedReward) {
                        this.this$0.showReceivedReward(new jvo0.a(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Error) {
                        xh50Var = this.this$0.hasStarted;
                        if (((Boolean) xh50Var.getValue()).booleanValue()) {
                            this.this$0.showCompleted(new jvo0.a(this.$startTime), this.$placement, ShowStatus.ERROR, this.$listeners, ((ShowEvent.Error) showEvent2).getReason(), ((ShowEvent.Error) showEvent2).getMessage(), this.$unityAdsShowOptions);
                        } else {
                            LegacyShowUseCase legacyShowUseCase = this.this$0;
                            OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                            String message3 = ((ShowEvent.Error) showEvent2).getMessage();
                            AdObject adObject = this.$adObject;
                            legacyShowUseCase$invoke$4$emit$12.L$0 = showEvent2;
                            legacyShowUseCase$invoke$4$emit$12.label = 1;
                            sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$12);
                            if (sendOperativeError == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (showEvent2 instanceof ShowEvent.CancelTimeout) {
                        this.this$0.cancelTimeout(new jvo0.a(this.$startTime));
                    } else {
                        if (!(showEvent2 instanceof ShowEvent.LeftApplication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.bannerLeftApplication(new jvo0.a(this.$startTime), this.$placement, this.$listeners);
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.a(obj);
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return s3q0.a;
                }
                showEvent2 = (ShowEvent) legacyShowUseCase$invoke$4$emit$12.L$0;
                kotlin.a.a(obj);
                b0tVar = this.$reportShowError;
                reason = ((ShowEvent.Error) showEvent2).getReason();
                unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                message = ((ShowEvent.Error) showEvent2).getMessage();
                num = new Integer(((ShowEvent.Error) showEvent2).getErrorCode());
                message2 = ((ShowEvent.Error) showEvent2).getMessage();
                legacyShowUseCase$invoke$4$emit$12.L$0 = null;
                legacyShowUseCase$invoke$4$emit$12.label = 2;
                if (b0tVar.invoke(reason, unityAdsShowError, message, num, message2, legacyShowUseCase$invoke$4$emit$12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return s3q0.a;
            }
        }
        legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, spjVar);
        legacyShowUseCase$invoke$4$emit$12 = legacyShowUseCase$invoke$4$emit$1;
        Object obj2 = legacyShowUseCase$invoke$4$emit$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = legacyShowUseCase$invoke$4$emit$12.label;
        if (i != 0) {
        }
        b0tVar = this.$reportShowError;
        reason = ((ShowEvent.Error) showEvent2).getReason();
        unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        message = ((ShowEvent.Error) showEvent2).getMessage();
        num = new Integer(((ShowEvent.Error) showEvent2).getErrorCode());
        message2 = ((ShowEvent.Error) showEvent2).getMessage();
        legacyShowUseCase$invoke$4$emit$12.L$0 = null;
        legacyShowUseCase$invoke$4$emit$12.label = 2;
        if (b0tVar.invoke(reason, unityAdsShowError, message, num, message2, legacyShowUseCase$invoke$4$emit$12) == coroutineSingletons) {
        }
        return s3q0.a;
    }

    @Override // xsna.lsr
    public /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
        return emit((ShowEvent) obj, (spj<? super s3q0>) spjVar);
    }
}
