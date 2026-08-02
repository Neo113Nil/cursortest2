package io.intercom.android.sdk.m5.inbox.data;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ConversationsResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InboxRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/MessengerApi;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "ablyManager", "Lio/intercom/android/sdk/AblyManager;", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/AblyManager;)V", "realTimeEvents", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "getConversations", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/ConversationsResponse$Builder;", TtmlNode.ANNOTATION_POSITION_BEFORE, "", "pageSize", "", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InboxRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final MessengerApi api;
    private final NexusClient nexusClient;

    public InboxRepository() {
        this(null, null, null, 7, null);
    }

    public InboxRepository(MessengerApi api, NexusClient nexusClient, AblyManager ablyManager) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        this.api = api;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
    }

    public /* synthetic */ InboxRepository(MessengerApi messengerApi, NexusClient nexusClient, AblyManager ablyManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 4) != 0 ? Injector.get().getAblyManager() : ablyManager);
    }

    public final Flow<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    public static /* synthetic */ Object getConversations$default(InboxRepository inboxRepository, Long l, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return inboxRepository.getConversations(l, i, continuation);
    }

    public final Object getConversations(Long l, int i, Continuation<? super NetworkResponse<ConversationsResponse.Builder>> continuation) {
        Map<String, ? extends Object> mapOf;
        MessengerApi messengerApi = this.api;
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        if (l == null) {
            mapOf = MapsKt.mapOf(TuplesKt.to("per_page", Boxing.boxInt(i)));
        } else {
            mapOf = MapsKt.mapOf(TuplesKt.to("per_page", Boxing.boxInt(i)), TuplesKt.to(TtmlNode.ANNOTATION_POSITION_BEFORE, l));
        }
        return messengerApi.getConversationsSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapOf), continuation);
    }
}
