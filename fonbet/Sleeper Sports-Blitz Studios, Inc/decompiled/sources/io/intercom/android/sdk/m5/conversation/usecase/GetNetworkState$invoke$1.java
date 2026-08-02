package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: GetNetworkState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1", f = "GetNetworkState.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class GetNetworkState$invoke$1 extends SuspendLambda implements Function2<ProducerScope<? super NetworkState>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GetNetworkState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetNetworkState$invoke$1(GetNetworkState getNetworkState, Continuation<? super GetNetworkState$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = getNetworkState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetNetworkState$invoke$1 getNetworkState$invoke$1 = new GetNetworkState$invoke$1(this.this$0, continuation);
        getNetworkState$invoke$1.L$0 = obj;
        return getNetworkState$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super NetworkState> producerScope, Continuation<? super Unit> continuation) {
        return ((GetNetworkState$invoke$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NetworkConnectivityMonitor networkConnectivityMonitor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            networkConnectivityMonitor = this.this$0.networkConnectivityMonitor;
            networkConnectivityMonitor.setListener(new NetworkConnectivityMonitor.ConnectivityEventListener() { // from class: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1.1
                @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                public void onDisconnect() {
                    producerScope.mo9874trySendJP2dKIU(NetworkState.Disconnected.INSTANCE);
                }

                @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                public void onReconnect() {
                    producerScope.mo9874trySendJP2dKIU(NetworkState.Reconnected.INSTANCE);
                }
            });
            final GetNetworkState getNetworkState = this.this$0;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = GetNetworkState$invoke$1.invokeSuspend$lambda$0(GetNetworkState.this);
                    return invokeSuspend$lambda$0;
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(GetNetworkState getNetworkState) {
        NetworkConnectivityMonitor networkConnectivityMonitor;
        networkConnectivityMonitor = getNetworkState.networkConnectivityMonitor;
        networkConnectivityMonitor.setListener(null);
        return Unit.INSTANCE;
    }
}
