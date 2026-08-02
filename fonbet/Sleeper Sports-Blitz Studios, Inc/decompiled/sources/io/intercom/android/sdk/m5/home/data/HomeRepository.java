package io.intercom.android.sdk.m5.home.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: HomeRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeRepository;", "", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/nexus/NexusClient;)V", "realTimeEvents", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "getHomeCards", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HomeRepository {
    public static final int $stable = 8;
    private final MessengerApi messengerApi;
    private final NexusClient nexusClient;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeRepository() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public HomeRepository(MessengerApi messengerApi, NexusClient nexusClient) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        this.messengerApi = messengerApi;
        this.nexusClient = nexusClient;
    }

    public /* synthetic */ HomeRepository(MessengerApi messengerApi, NexusClient nexusClient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getNexusClient() : nexusClient);
    }

    public final Flow<ParsedNexusEvent> realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public final Object getHomeCards(Continuation<? super NetworkResponse<HomeV2Response>> continuation) {
        return MessengerApi.DefaultImpls.getHomeCardsV2Suspend$default(this.messengerApi, null, continuation, 1, null);
    }
}
