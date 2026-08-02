package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowEvent;
import defpackage.a70;
import defpackage.b98;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gt8;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.rq3;
import defpackage.whj;
import defpackage.y6a;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyShowUseCase$invoke$4<T> implements b98 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ gt8 $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;
    final /* synthetic */ LegacyShowUseCase this$0;

    public LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, AdObject adObject, gt8 gt8Var) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$unityAdsShowOptions = unityAdsShowOptions;
        this.$adObject = adObject;
        this.$reportShowError = gt8Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(3:(1:(1:13)(2:17|18))(1:19)|14|15)(2:20|21))(5:26|27|(1:29)(2:30|(1:32)(2:33|(1:35)(2:36|(1:38)(2:39|(3:41|42|(1:44)(2:45|(2:47|25)))(2:48|(1:50)(2:51|(1:53)(2:54|55)))))))|14|15)|22|(2:24|25)|14|15))|59|6|7|8|(0)(0)|22|(0)|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        r4 = r22.$reportShowError;
        r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        r9 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r0, 0, 1, null);
        r10.L$0 = null;
        r10.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
    
        if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) != r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ShowEvent showEvent, rq3<? super Unit> rq3Var) {
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
        LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$12;
        lu3 lu3Var;
        int i;
        f1d f1dVar;
        Object sendOperativeError;
        gt8 gt8Var;
        String reason;
        UnityAds.UnityAdsShowError unityAdsShowError;
        String message;
        Integer num;
        String message2;
        ShowEvent showEvent2 = showEvent;
        if (rq3Var instanceof LegacyShowUseCase$invoke$4$emit$1) {
            legacyShowUseCase$invoke$4$emit$1 = (LegacyShowUseCase$invoke$4$emit$1) rq3Var;
            int i2 = legacyShowUseCase$invoke$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$4$emit$1.label = i2 - Integer.MIN_VALUE;
                legacyShowUseCase$invoke$4$emit$12 = legacyShowUseCase$invoke$4$emit$1;
                Object obj = legacyShowUseCase$invoke$4$emit$12.result;
                lu3Var = lu3.a;
                i = legacyShowUseCase$invoke$4$emit$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (showEvent2 instanceof ShowEvent.Started) {
                        this.this$0.showStarted(new whj(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Clicked) {
                        this.this$0.showClicked(new whj(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Completed) {
                        this.this$0.showCompleted(new whj(this.$startTime), this.$placement, ((ShowEvent.Completed) showEvent2).getStatus(), this.$listeners, ((ShowEvent.Completed) showEvent2).getReason(), ((ShowEvent.Completed) showEvent2).getReasonDebug(), this.$unityAdsShowOptions);
                    } else if (showEvent2 instanceof ShowEvent.ReceivedReward) {
                        this.this$0.showReceivedReward(new whj(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Error) {
                        f1dVar = this.this$0.hasStarted;
                        boolean booleanValue = ((Boolean) ((fdi) f1dVar).getValue()).booleanValue();
                        LegacyShowUseCase legacyShowUseCase = this.this$0;
                        if (booleanValue) {
                            legacyShowUseCase.showCompleted(new whj(this.$startTime), this.$placement, ShowStatus.ERROR, this.$listeners, ((ShowEvent.Error) showEvent2).getReason(), ((ShowEvent.Error) showEvent2).getMessage(), this.$unityAdsShowOptions);
                        } else {
                            OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                            String message3 = ((ShowEvent.Error) showEvent2).getMessage();
                            AdObject adObject = this.$adObject;
                            legacyShowUseCase$invoke$4$emit$12.L$0 = showEvent2;
                            legacyShowUseCase$invoke$4$emit$12.label = 1;
                            sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$12);
                            if (sendOperativeError == lu3Var) {
                                return lu3Var;
                            }
                        }
                    } else if (showEvent2 instanceof ShowEvent.CancelTimeout) {
                        this.this$0.cancelTimeout(new whj(this.$startTime));
                    } else {
                        if (!(showEvent2 instanceof ShowEvent.LeftApplication)) {
                            throw new ndd();
                        }
                        this.this$0.bannerLeftApplication(new whj(this.$startTime), this.$placement, this.$listeners);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                    } else {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return Unit.a;
                }
                showEvent2 = (ShowEvent) legacyShowUseCase$invoke$4$emit$12.L$0;
                y6a.M(obj);
                gt8Var = this.$reportShowError;
                reason = ((ShowEvent.Error) showEvent2).getReason();
                unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                message = ((ShowEvent.Error) showEvent2).getMessage();
                num = new Integer(((ShowEvent.Error) showEvent2).getErrorCode());
                message2 = ((ShowEvent.Error) showEvent2).getMessage();
                legacyShowUseCase$invoke$4$emit$12.L$0 = null;
                legacyShowUseCase$invoke$4$emit$12.label = 2;
                if (gt8Var.invoke(reason, unityAdsShowError, message, num, message2, legacyShowUseCase$invoke$4$emit$12) == lu3Var) {
                    return lu3Var;
                }
                return Unit.a;
            }
        }
        legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, rq3Var);
        legacyShowUseCase$invoke$4$emit$12 = legacyShowUseCase$invoke$4$emit$1;
        Object obj2 = legacyShowUseCase$invoke$4$emit$12.result;
        lu3Var = lu3.a;
        i = legacyShowUseCase$invoke$4$emit$12.label;
        if (i != 0) {
        }
        gt8Var = this.$reportShowError;
        reason = ((ShowEvent.Error) showEvent2).getReason();
        unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        message = ((ShowEvent.Error) showEvent2).getMessage();
        num = new Integer(((ShowEvent.Error) showEvent2).getErrorCode());
        message2 = ((ShowEvent.Error) showEvent2).getMessage();
        legacyShowUseCase$invoke$4$emit$12.L$0 = null;
        legacyShowUseCase$invoke$4$emit$12.label = 2;
        if (gt8Var.invoke(reason, unityAdsShowError, message, num, message2, legacyShowUseCase$invoke$4$emit$12) == lu3Var) {
        }
        return Unit.a;
    }

    @Override // defpackage.b98
    public /* bridge */ /* synthetic */ Object emit(Object obj, rq3 rq3Var) {
        return emit((ShowEvent) obj, (rq3<? super Unit>) rq3Var);
    }
}
