package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.realtime.Connection;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.rest.Auth;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Message;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AblyEndpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AblyManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.AblyManager$connect$1", f = "AblyManager.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class AblyManager$connect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AblyManager$connect$1(AblyManager ablyManager, Continuation<? super AblyManager$connect$1> continuation) {
        super(2, continuation);
        this.this$0 = ablyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AblyManager$connect$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AblyManager$connect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Twig twig;
        Twig twig2;
        Triple triple;
        Auth.TokenCallback createAuthCallback;
        AblyRealtime ablyRealtime;
        AblyRealtime ablyRealtime2;
        Channel channel;
        AblyRealtime.Channels channels;
        Connection connection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                twig2 = this.this$0.twig;
                twig2.d("AblyManager: Connecting...", new Object[0]);
                this.label = 1;
                obj = this.this$0.getAblyConfiguration(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            triple = (Triple) obj;
        } catch (Exception e) {
            twig = this.this$0.twig;
            twig.e("AblyManager: Connection error: " + e.getMessage(), new Object[0]);
        }
        if (triple == null) {
            return Unit.INSTANCE;
        }
        String str = (String) triple.component1();
        String str2 = (String) triple.component2();
        List<AblyEndpoint> list = (List) triple.component3();
        ClientOptions clientOptions = new ClientOptions();
        AblyManager ablyManager = this.this$0;
        clientOptions.token = str;
        createAuthCallback = ablyManager.createAuthCallback();
        clientOptions.authCallback = createAuthCallback;
        ArrayList arrayList = new ArrayList();
        for (AblyEndpoint ablyEndpoint : list) {
            List listOf = CollectionsKt.listOf(ablyEndpoint.getEndpoint());
            List<String> fallback = ablyEndpoint.getFallback();
            if (fallback == null) {
                fallback = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) listOf, (Iterable) fallback));
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            clientOptions.fallbackHosts = (String[]) arrayList2.toArray(new String[0]);
        }
        this.this$0.ablyRealtime = new AblyRealtime(clientOptions);
        ablyRealtime = this.this$0.ablyRealtime;
        if (ablyRealtime != null && (connection = ablyRealtime.connection) != null) {
            final AblyManager ablyManager2 = this.this$0;
            connection.on(new ConnectionStateListener() { // from class: io.intercom.android.sdk.AblyManager$connect$1$$ExternalSyntheticLambda0
                @Override // io.ably.lib.realtime.ConnectionStateListener
                public final void onConnectionStateChanged(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
                    AblyManager$connect$1.invokeSuspend$lambda$2(AblyManager.this, connectionStateChange);
                }
            });
        }
        AblyManager ablyManager3 = this.this$0;
        ablyRealtime2 = ablyManager3.ablyRealtime;
        ablyManager3.currentChannel = (ablyRealtime2 == null || (channels = ablyRealtime2.channels) == null) ? null : channels.get(str2);
        channel = this.this$0.currentChannel;
        if (channel != null) {
            final AblyManager ablyManager4 = this.this$0;
            channel.subscribe(new ChannelBase.MessageListener() { // from class: io.intercom.android.sdk.AblyManager$connect$1$$ExternalSyntheticLambda1
                @Override // io.ably.lib.realtime.ChannelBase.MessageListener
                public final void onMessage(Message message) {
                    AblyManager$connect$1.invokeSuspend$lambda$3(AblyManager.this, message);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(AblyManager ablyManager, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
        Twig twig;
        ConnectionStateListener connectionStateListener;
        Twig twig2;
        String name = connectionStateChange.current.name();
        if (Intrinsics.areEqual(name, "connected")) {
            twig2 = ablyManager.twig;
            twig2.d("AblyManager: Connected", new Object[0]);
        } else if (Intrinsics.areEqual(name, MetricTracker.Action.FAILED)) {
            twig = ablyManager.twig;
            twig.e("AblyManager: Connection failed: " + connectionStateChange.reason, new Object[0]);
        }
        connectionStateListener = ablyManager.connectionListener;
        if (connectionStateListener != null) {
            connectionStateListener.onConnectionStateChanged(connectionStateChange);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(AblyManager ablyManager, Message message) {
        Channel.MessageListener messageListener;
        messageListener = ablyManager.messageListener;
        if (messageListener != null) {
            messageListener.onMessage(message);
        }
    }
}
