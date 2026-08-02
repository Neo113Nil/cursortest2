package io.intercom.android.sdk.m5.conversation.data;

import androidx.media3.common.MimeTypes;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.Gson;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRequestBody;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import io.sentry.clientreport.DiscardedEvent;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.MultipartBody;

/* compiled from: ConversationRepository.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!J<\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0086@¢\u0006\u0002\u0010/Jl\u00100\u001a\b\u0012\u0004\u0012\u0002010%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\b\u00102\u001a\u0004\u0018\u00010(2\b\u00103\u001a\u0004\u0018\u00010(2\b\u00104\u001a\u0004\u0018\u00010(2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010+2\b\u00107\u001a\u0004\u0018\u00010.2\b\u00108\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0002\u00109J$\u0010:\u001a\b\u0012\u0004\u0012\u00020;0%2\u0006\u0010'\u001a\u00020(2\u0006\u0010<\u001a\u00020=H\u0086@¢\u0006\u0002\u0010>J&\u0010?\u001a\b\u0012\u0004\u0012\u00020;0%2\u0006\u0010@\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u00010(H\u0086@¢\u0006\u0002\u0010AJ4\u0010B\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010C\u001a\u00020(2\u0006\u0010'\u001a\u00020(2\u0006\u0010D\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0002\u0010EJ\u0016\u0010F\u001a\u00020G2\u0006\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020J0%2\u0006\u0010K\u001a\u00020(H\u0086@¢\u0006\u0002\u0010HJ\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020M0%2\u0006\u0010N\u001a\u00020OH\u0086@¢\u0006\u0002\u0010PJ<\u0010Q\u001a\b\u0012\u0004\u0012\u00020;0%2\u0006\u0010'\u001a\u00020(2\u0006\u0010R\u001a\u00020(2\u0006\u0010S\u001a\u00020(2\u0006\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020(H\u0086@¢\u0006\u0002\u0010VJ\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020X0%2\u0006\u0010Y\u001a\u00020ZH\u0086@¢\u0006\u0002\u0010[J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\\\u001a\u00020GJ!\u0010]\u001a\u00020G2\u0006\u0010'\u001a\u00020(2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020(0_¢\u0006\u0002\u0010`R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "uploadRepository", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/Api;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "ablyManager", "Lio/intercom/android/sdk/AblyManager;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/m5/upload/data/UploadRepository;Lio/intercom/android/sdk/api/Api;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/AblyManager;Lio/intercom/android/nexus/NexusClient;Lkotlinx/coroutines/CoroutineScope;)V", "getMessengerApi", "()Lio/intercom/android/sdk/api/MessengerApi;", "getApi", "()Lio/intercom/android/sdk/api/Api;", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "getAblyManager", "()Lio/intercom/android/sdk/AblyManager;", "nexusEventsRepository", "Lio/intercom/android/sdk/m5/conversation/data/NexusEventsRepository;", "getNexusEventsRepository", "()Lio/intercom/android/sdk/m5/conversation/data/NexusEventsRepository;", "nexusEventsRepository$delegate", "Lkotlin/Lazy;", "nexusEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "realTimeEvents", "replyToConversation", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Part$Builder;", "conversationId", "", "clientUUID", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "lastAdminPartCreatedAt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewConversation", "Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "botIntroId", "articleId", "botBehaviourId", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "Lio/intercom/android/sdk/models/ComposerSuggestions$Suggestion;", "snapshotId", "openRequestId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversation", "Lio/intercom/android/sdk/models/Conversation;", DiscardedEvent.JsonKeys.REASON, "Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createConversationFromSuggestion", "suggestionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addQuickReplyToConversation", "quickReplyId", "quickReplyPartId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadGifs", "Lio/intercom/android/sdk/models/GifResponse;", "searchQuery", "uploadMedia", "Lio/intercom/android/sdk/models/Upload$Builder;", "imageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitForm", "partId", "identifier", "formValue", "formType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transcribe", "Lio/intercom/android/sdk/models/TranscribedText;", "audioFile", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissPrivacyPolicy", "recordInteractions", "interactions", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final Api api;
    private final MessengerApi messengerApi;
    private final NexusClient nexusClient;
    private final Flow<ParsedNexusEvent> nexusEventFlow;

    /* renamed from: nexusEventsRepository$delegate, reason: from kotlin metadata */
    private final Lazy nexusEventsRepository;
    private final UploadRepository uploadRepository;
    private final UserIdentity userIdentity;

    /* compiled from: ConversationRepository.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetConversationReason.values().length];
            try {
                iArr[GetConversationReason.NEW_COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetConversationReason.NEXUS_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetConversationReason.NETWORK_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetConversationReason.OPEN_CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GetConversationReason.POLLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, AblyManager ablyManager, NexusClient nexusClient, final CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(uploadRepository, "uploadRepository");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.messengerApi = messengerApi;
        this.uploadRepository = uploadRepository;
        this.api = api;
        this.userIdentity = userIdentity;
        this.ablyManager = ablyManager;
        this.nexusClient = nexusClient;
        this.nexusEventsRepository = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.data.ConversationRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NexusEventsRepository nexusEventsRepository_delegate$lambda$0;
                nexusEventsRepository_delegate$lambda$0 = ConversationRepository.nexusEventsRepository_delegate$lambda$0(ConversationRepository.this, scope);
                return nexusEventsRepository_delegate$lambda$0;
            }
        });
        this.nexusEventFlow = CombinedEventAsFlowKt.combinedEventAsFlow(nexusClient, ablyManager);
    }

    public /* synthetic */ ConversationRepository(MessengerApi messengerApi, UploadRepository uploadRepository, Api api, UserIdentity userIdentity, AblyManager ablyManager, NexusClient nexusClient, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i & 4) != 0 ? Injector.get().getApi() : api, (i & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 16) != 0 ? Injector.get().getAblyManager() : ablyManager, (i & 32) != 0 ? Injector.get().getNexusClient() : nexusClient, coroutineScope);
    }

    public final MessengerApi getMessengerApi() {
        return this.messengerApi;
    }

    public final Api getApi() {
        return this.api;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public final AblyManager getAblyManager() {
        return this.ablyManager;
    }

    private final NexusEventsRepository getNexusEventsRepository() {
        return (NexusEventsRepository) this.nexusEventsRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusEventsRepository nexusEventsRepository_delegate$lambda$0(ConversationRepository this$0, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        return new NexusEventsRepository(this$0.nexusClient, this$0.userIdentity, scope);
    }

    public final Flow<ParsedNexusEvent> realTimeEvents() {
        return this.nexusEventFlow;
    }

    public final Object replyToConversation(String str, String str2, List<Block.Builder> list, Long l, Continuation<? super NetworkResponse<Part.Builder>> continuation) {
        Map<String, ? extends Object> createBaseReplyParams = this.api.createBaseReplyParams();
        createBaseReplyParams.put("blocks", list);
        createBaseReplyParams.put("client_assigned_uuid", str2);
        if (l != null) {
            l.longValue();
            createBaseReplyParams.put("last_admin_part_created_at", TimeFormatterExtKt.toISOFormat(l.longValue()));
        }
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Intrinsics.checkNotNull(createBaseReplyParams);
        return this.messengerApi.replyToConversationSuspend(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(createBaseReplyParams), continuation);
    }

    public final Object createNewConversation(List<Block.Builder> list, String str, String str2, String str3, List<ComposerSuggestions.Suggestion> list2, Long l, String str4, String str5, Continuation<? super NetworkResponse<ConversationResponse.Builder>> continuation) {
        Map<String, ? extends Object> baseNewConversationParams = this.api.baseNewConversationParams();
        baseNewConversationParams.put("blocks", list);
        baseNewConversationParams.put("client_assigned_uuid", str5);
        if (str != null) {
            baseNewConversationParams.put("bot_intro", str);
        }
        if (str2 != null) {
            baseNewConversationParams.put("article_id", str2);
        }
        if (str3 != null) {
            baseNewConversationParams.put("resolution_bot_behavior_version_id", str3);
        }
        if (list2 != null) {
            baseNewConversationParams.put(MetricTracker.Object.COMPOSER_SUGGESTIONS, new Gson().toJson(list2));
        }
        if (l != null) {
            baseNewConversationParams.put("snapshot_id", l);
        }
        if (str4 != null) {
            baseNewConversationParams.put("messenger_open_request_id", str4);
        }
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Intrinsics.checkNotNull(baseNewConversationParams);
        return this.messengerApi.startNewConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(baseNewConversationParams), continuation);
    }

    public final Object getConversation(String str, GetConversationReason getConversationReason, Continuation<? super NetworkResponse<Conversation>> continuation) {
        String str2;
        int i = WhenMappings.$EnumSwitchMapping$0[getConversationReason.ordinal()];
        if (i == 1) {
            str2 = "Nexus New Comment";
        } else if (i == 2) {
            str2 = "Nexus Reconnected";
        } else if (i == 3) {
            str2 = "Internet Reconnected";
        } else if (i == 4) {
            str2 = "Click Conversation";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "State Sync";
        }
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("request_origin", str2));
        if (getConversationReason == GetConversationReason.POLLING) {
            mutableMapOf.put("sync", "true");
        }
        return this.messengerApi.getConversationSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mutableMapOf), continuation);
    }

    public final Object createConversationFromSuggestion(String str, String str2, Continuation<? super NetworkResponse<Conversation>> continuation) {
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("id", str);
        if (str2 != null) {
            createMapBuilder.put("messenger_open_request_id", str2);
        }
        return this.messengerApi.triggerInboundConversationSuspend(messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.build(createMapBuilder)), continuation);
    }

    public final Object addQuickReplyToConversation(String str, String str2, String str3, String str4, Continuation<? super NetworkResponse<Part.Builder>> continuation) {
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("reply_option_uuid", str), TuplesKt.to("client_assigned_uuid", str4));
        if (str3.length() > 0) {
            mutableMapOf.put("quick_reply_part_id", str3);
        }
        return this.messengerApi.addConversationQuickReplySuspend(str2, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(mutableMapOf), continuation);
    }

    public final Object markAsRead(String str, Continuation<? super Unit> continuation) {
        Object markAsReadSuspend = this.messengerApi.markAsReadSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("app_id", Injector.get().getAppIdentity().appId()))), continuation);
        return markAsReadSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? markAsReadSuspend : Unit.INSTANCE;
    }

    public final Object loadGifs(String str, Continuation<? super NetworkResponse<? extends GifResponse>> continuation) {
        return this.messengerApi.getGifsSuspended(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(!StringsKt.isBlank(str) ? MapsKt.mapOf(TuplesKt.to(SearchIntents.EXTRA_QUERY, str)) : MapsKt.emptyMap()), continuation);
    }

    public final Object uploadMedia(MediaData.Media media, Continuation<? super NetworkResponse<Upload.Builder>> continuation) {
        return this.uploadRepository.uploadFile(media, continuation);
    }

    public final Object submitForm(String str, String str2, String str3, String str4, String str5, Continuation<? super NetworkResponse<Conversation>> continuation) {
        return this.messengerApi.submitFormSuspend(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("form_params", MapsKt.mapOf(TuplesKt.to("conversation_part_id", str2), TuplesKt.to("identifier", str3), TuplesKt.to("value", str4), TuplesKt.to("type", str5))))), continuation);
    }

    public final Object transcribe(File file, Continuation<? super NetworkResponse<TranscribedText>> continuation) {
        String json;
        String email = this.userIdentity.getEmail();
        Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
        if (email.length() != 0) {
            Map createMapBuilder = MapsKt.createMapBuilder();
            String email2 = this.userIdentity.getEmail();
            Intrinsics.checkNotNullExpressionValue(email2, "getEmail(...)");
            createMapBuilder.put("email", email2);
            String userId = this.userIdentity.getUserId();
            Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
            if (userId.length() != 0) {
                String userId2 = this.userIdentity.getUserId();
                Intrinsics.checkNotNullExpressionValue(userId2, "getUserId(...)");
                createMapBuilder.put("user_id", userId2);
            }
            json = new Gson().toJson(MapsKt.build(createMapBuilder));
        } else {
            json = new Gson().toJson(MapsKt.mapOf(TuplesKt.to(UserIdentity.ANONYMOUS_ID, this.userIdentity.getAnonymousId())));
        }
        MultipartBody.Part createFormData = MultipartBody.Part.INSTANCE.createFormData(MimeTypes.BASE_TYPE_AUDIO, file.getName(), new AudioRequestBody(file));
        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
        Intrinsics.checkNotNull(json);
        MultipartBody.Part createFormData2 = companion.createFormData("user_data", json);
        String appId = Injector.get().getAppIdentity().appId();
        MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
        Intrinsics.checkNotNull(appId);
        return this.messengerApi.transcribeSuspend(createFormData, createFormData2, companion2.createFormData("app_id", appId), MessengerApiHelper.INSTANCE.getDefaultMultipartFields$intercom_sdk_base_release(), continuation);
    }

    public final NexusEventsRepository nexusEventsRepository() {
        return getNexusEventsRepository();
    }

    public final void dismissPrivacyPolicy() {
        this.api.updateUser(UserUpdateRequest.create(false, false, MapsKt.mapOf(TuplesKt.to("dismissed_privacy_policy_notice_at", Long.valueOf(System.currentTimeMillis() / 1000))), true), new IntercomStatusCallback() { // from class: io.intercom.android.sdk.m5.conversation.data.ConversationRepository$dismissPrivacyPolicy$1
            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onFailure(IntercomError intercomError) {
                Intrinsics.checkNotNullParameter(intercomError, "intercomError");
            }

            @Override // io.intercom.android.sdk.IntercomStatusCallback
            public void onSuccess() {
            }
        });
    }

    public final void recordInteractions(String conversationId, String[] interactions) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        this.api.recordInteractions(conversationId, interactions);
    }
}
