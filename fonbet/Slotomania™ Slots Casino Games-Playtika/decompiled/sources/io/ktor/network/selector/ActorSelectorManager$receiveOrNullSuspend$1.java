package io.ktor.network.selector;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActorSelectorManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {168}, m = "receiveOrNullSuspend", n = {"$this$receiveOrNullSuspend"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class ActorSelectorManager$receiveOrNullSuspend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActorSelectorManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActorSelectorManager$receiveOrNullSuspend$1(ActorSelectorManager actorSelectorManager, Continuation<? super ActorSelectorManager$receiveOrNullSuspend$1> continuation) {
        super(continuation);
        this.this$0 = actorSelectorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object receiveOrNullSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        receiveOrNullSuspend = this.this$0.receiveOrNullSuspend(null, this);
        return receiveOrNullSuspend;
    }
}
