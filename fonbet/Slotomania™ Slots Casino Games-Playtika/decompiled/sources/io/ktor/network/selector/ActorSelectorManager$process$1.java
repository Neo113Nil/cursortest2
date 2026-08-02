package io.ktor.network.selector;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.cordova.globalization.Globalization;

/* compiled from: ActorSelectorManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0, 1, 1, 2, 2}, l = {Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS_VALUE, 74, 90}, m = "process", n = {"mb", Globalization.SELECTOR, "mb", Globalization.SELECTOR, "mb", Globalization.SELECTOR}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes2.dex */
final class ActorSelectorManager$process$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActorSelectorManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$process$1(ActorSelectorManager actorSelectorManager, Continuation<? super ActorSelectorManager$process$1> continuation) {
        super(continuation);
        this.this$0 = actorSelectorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.process(null, null, this);
    }
}
