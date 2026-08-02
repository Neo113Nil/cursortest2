package com.braze.ui.inappmessage;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BrazeInAppMessageManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager", f = "BrazeInAppMessageManager.kt", i = {0, 0, 0, 0}, l = {590}, m = "displayInAppMessage$suspendImpl", n = {"$this", "inAppMessage", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "configProvider"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
final class BrazeInAppMessageManager$displayInAppMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BrazeInAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrazeInAppMessageManager$displayInAppMessage$1(BrazeInAppMessageManager brazeInAppMessageManager, Continuation<? super BrazeInAppMessageManager$displayInAppMessage$1> continuation) {
        super(continuation);
        this.this$0 = brazeInAppMessageManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BrazeInAppMessageManager.displayInAppMessage$suspendImpl(this.this$0, null, false, this);
    }
}
