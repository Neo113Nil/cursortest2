package io.ktor.network.selector;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.cordova.globalization.Globalization;

/* compiled from: ActorSelectorManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE}, m = "select", n = {Globalization.SELECTOR}, s = {"L$0"})
/* loaded from: classes2.dex */
final class ActorSelectorManager$select$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActorSelectorManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$select$1(ActorSelectorManager actorSelectorManager, Continuation<? super ActorSelectorManager$select$1> continuation) {
        super(continuation);
        this.this$0 = actorSelectorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object select;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        select = this.this$0.select(null, this);
        return select;
    }
}
