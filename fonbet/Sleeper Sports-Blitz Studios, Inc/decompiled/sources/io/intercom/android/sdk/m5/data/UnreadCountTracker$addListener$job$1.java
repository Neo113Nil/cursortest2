package io.intercom.android.sdk.m5.data;

import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UnreadCountTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1", f = "UnreadCountTracker.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class UnreadCountTracker$addListener$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnreadConversationCountListener $listener;
    int label;
    final /* synthetic */ UnreadCountTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnreadCountTracker$addListener$job$1(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, Continuation<? super UnreadCountTracker$addListener$job$1> continuation) {
        super(2, continuation);
        this.this$0 = unreadCountTracker;
        this.$listener = unreadConversationCountListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnreadCountTracker$addListener$job$1(this.this$0, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnreadCountTracker$addListener$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Set<String>> unreadConversationIds = this.this$0.getDataLayer().getUnreadConversationIds();
            final UnreadConversationCountListener unreadConversationCountListener = this.$listener;
            this.label = 1;
            if (unreadConversationIds.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Set<String>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Set<String> set, Continuation<? super Unit> continuation) {
                    UnreadConversationCountListener.this.onCountUpdate(set.size());
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
