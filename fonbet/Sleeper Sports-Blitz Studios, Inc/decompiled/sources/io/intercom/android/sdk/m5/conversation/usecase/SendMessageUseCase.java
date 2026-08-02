package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SendMessageUseCase.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0086B¢\u0006\u0002\u0010\u0017J4\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0086B¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "soundEffectsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "newConversationRequestPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invoke", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "messageText", "", "(Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "clientUUID", "(Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SendMessageUseCase {
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final AtomicBoolean newConversationRequestPending;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.newConversationRequestPending = new AtomicBoolean(false);
    }

    public /* synthetic */ SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, String str, Continuation<? super Unit> continuation) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String str2 = str;
        List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(StringsKt.trim((CharSequence) str2).toString());
        if (str2.length() > 0) {
            Intrinsics.checkNotNull(blocksForText);
            Object invoke = invoke(mutableStateFlow, blocksForText, uuid, continuation);
            return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x02c7, code lost:
    
        if (r1.invoke(r4, r2, r11) == r12) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, List<Block.Builder> list, String str, Continuation<? super Unit> continuation) {
        SendMessageUseCase$invoke$2 sendMessageUseCase$invoke$2;
        int i;
        SendMessageUseCase sendMessageUseCase;
        String str2;
        List<Block.Builder> list2;
        String str3;
        SendMessageUseCase sendMessageUseCase2;
        SendMessageUseCase sendMessageUseCase3;
        ComposerSuggestions composerSuggestions;
        ComposerSuggestions composerSuggestions2;
        NetworkResponse networkResponse;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        ConversationResponse conversationResponse;
        String str4;
        ConversationClientState value;
        Map mutableMap;
        Long l;
        Object obj;
        SendMessageUseCase sendMessageUseCase4;
        MutableStateFlow<ConversationClientState> mutableStateFlow3;
        String str5;
        List<Part> parts;
        Part part;
        NetworkResponse networkResponse2;
        MutableStateFlow<ConversationClientState> mutableStateFlow4 = mutableStateFlow;
        List<Block.Builder> list3 = list;
        String str6 = str;
        if (continuation instanceof SendMessageUseCase$invoke$2) {
            sendMessageUseCase$invoke$2 = (SendMessageUseCase$invoke$2) continuation;
            if ((sendMessageUseCase$invoke$2.label & Integer.MIN_VALUE) != 0) {
                sendMessageUseCase$invoke$2.label -= Integer.MIN_VALUE;
                SendMessageUseCase$invoke$2 sendMessageUseCase$invoke$22 = sendMessageUseCase$invoke$2;
                Object obj2 = sendMessageUseCase$invoke$22.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendMessageUseCase$invoke$22.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    INSTANCE.addBlocksToPendingMessages(mutableStateFlow4, list3, str6, this.userIdentity);
                    if (mutableStateFlow4.getValue().getConversationId() == null && this.newConversationRequestPending.compareAndSet(false, true)) {
                        BotIntro value2 = this.intercomDataLayer.getBotIntro().getValue();
                        String id = !Intrinsics.areEqual(BotIntro.NULL, value2) ? value2.getId() : null;
                        ConversationRepository conversationRepository = this.conversationRepository;
                        ArticleMetadata articleMetadata = mutableStateFlow4.getValue().getArticleMetadata();
                        String id2 = articleMetadata != null ? articleMetadata.getId() : null;
                        String value3 = this.intercomDataLayer.getBotBehaviourId().getValue();
                        OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
                        List<ComposerSuggestions.Suggestion> suggestions = (openResponse == null || (composerSuggestions2 = openResponse.getComposerSuggestions()) == null) ? null : composerSuggestions2.getSuggestions();
                        OpenMessengerResponse openResponse2 = this.intercomDataLayer.getOpenResponse();
                        Long snapshotId = (openResponse2 == null || (composerSuggestions = openResponse2.getComposerSuggestions()) == null) ? null : composerSuggestions.getSnapshotId();
                        OpenMessengerResponse openResponse3 = this.intercomDataLayer.getOpenResponse();
                        String requestId = openResponse3 != null ? openResponse3.getRequestId() : null;
                        sendMessageUseCase$invoke$22.L$0 = this;
                        sendMessageUseCase$invoke$22.L$1 = mutableStateFlow4;
                        sendMessageUseCase$invoke$22.L$2 = str6;
                        sendMessageUseCase$invoke$22.label = 1;
                        obj2 = conversationRepository.createNewConversation(list3, id, id2, value3, suggestions, snapshotId, requestId, str6, sendMessageUseCase$invoke$22);
                        if (obj2 != coroutine_suspended) {
                            sendMessageUseCase3 = this;
                            networkResponse = (NetworkResponse) obj2;
                            if (!(networkResponse instanceof NetworkResponse.ClientError)) {
                            }
                            sendMessageUseCase3.newConversationRequestPending.set(false);
                            sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                            INSTANCE.updateFailedPendingMessages(mutableStateFlow4, str6);
                        }
                    } else {
                        String conversationId = mutableStateFlow4.getValue().getConversationId();
                        if (conversationId == null) {
                            SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(null);
                            sendMessageUseCase$invoke$22.L$0 = this;
                            sendMessageUseCase$invoke$22.L$1 = mutableStateFlow4;
                            sendMessageUseCase$invoke$22.L$2 = list3;
                            sendMessageUseCase$invoke$22.L$3 = str6;
                            sendMessageUseCase$invoke$22.label = 3;
                            obj2 = FlowKt.first(mutableStateFlow4, sendMessageUseCase$invoke$conversationId$1, sendMessageUseCase$invoke$22);
                            if (obj2 != coroutine_suspended) {
                                sendMessageUseCase2 = this;
                                sendMessageUseCase = sendMessageUseCase2;
                                list2 = list3;
                                str3 = str6;
                                str2 = ((ConversationClientState) obj2).getConversationId();
                                if (str2 != null) {
                                }
                            }
                        } else {
                            sendMessageUseCase = this;
                            str2 = conversationId;
                            list2 = list3;
                            str3 = str6;
                            if (str2 != null) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    String str7 = (String) sendMessageUseCase$invoke$22.L$2;
                    MutableStateFlow<ConversationClientState> mutableStateFlow5 = (MutableStateFlow) sendMessageUseCase$invoke$22.L$1;
                    SendMessageUseCase sendMessageUseCase5 = (SendMessageUseCase) sendMessageUseCase$invoke$22.L$0;
                    ResultKt.throwOnFailure(obj2);
                    str6 = str7;
                    mutableStateFlow4 = mutableStateFlow5;
                    sendMessageUseCase3 = sendMessageUseCase5;
                    networkResponse = (NetworkResponse) obj2;
                    if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                        sendMessageUseCase3.newConversationRequestPending.set(false);
                        sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        INSTANCE.updateFailedPendingMessages(mutableStateFlow4, str6);
                    } else {
                        if (!(networkResponse instanceof NetworkResponse.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sendMessageUseCase3.newConversationRequestPending.set(false);
                        sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                        ConversationResponse build = ((ConversationResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                        IntercomDataLayer intercomDataLayer = sendMessageUseCase3.intercomDataLayer;
                        IntercomEvent.NewConversation newConversation = new IntercomEvent.NewConversation(build.getConversation());
                        sendMessageUseCase$invoke$22.L$0 = sendMessageUseCase3;
                        sendMessageUseCase$invoke$22.L$1 = mutableStateFlow4;
                        sendMessageUseCase$invoke$22.L$2 = str6;
                        sendMessageUseCase$invoke$22.L$3 = build;
                        sendMessageUseCase$invoke$22.label = 2;
                        if (intercomDataLayer.emitEvent(newConversation, sendMessageUseCase$invoke$22) != coroutine_suspended) {
                            mutableStateFlow2 = mutableStateFlow4;
                            conversationResponse = build;
                            str4 = str6;
                            IntercomDataLayer intercomDataLayer2 = sendMessageUseCase3.intercomDataLayer;
                            Config config = conversationResponse.getConfig();
                            Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
                            intercomDataLayer2.updateConfig(config);
                            do {
                                value = mutableStateFlow2.getValue();
                                mutableMap = MapsKt.toMutableMap(mutableStateFlow2.getValue().getPendingMessages());
                                mutableMap.remove(str4);
                            } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, mutableMap, conversationResponse.getConversation(), conversationResponse.getConversation().getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194296, null)));
                        }
                        return coroutine_suspended;
                    }
                } else if (i == 2) {
                    conversationResponse = (ConversationResponse) sendMessageUseCase$invoke$22.L$3;
                    str4 = (String) sendMessageUseCase$invoke$22.L$2;
                    mutableStateFlow2 = (MutableStateFlow) sendMessageUseCase$invoke$22.L$1;
                    sendMessageUseCase3 = (SendMessageUseCase) sendMessageUseCase$invoke$22.L$0;
                    ResultKt.throwOnFailure(obj2);
                    IntercomDataLayer intercomDataLayer22 = sendMessageUseCase3.intercomDataLayer;
                    Config config2 = conversationResponse.getConfig();
                    Intrinsics.checkNotNullExpressionValue(config2, "getConfig(...)");
                    intercomDataLayer22.updateConfig(config2);
                    do {
                        value = mutableStateFlow2.getValue();
                        mutableMap = MapsKt.toMutableMap(mutableStateFlow2.getValue().getPendingMessages());
                        mutableMap.remove(str4);
                    } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, mutableMap, conversationResponse.getConversation(), conversationResponse.getConversation().getId(), null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194296, null)));
                } else if (i == 3) {
                    String str8 = (String) sendMessageUseCase$invoke$22.L$3;
                    list3 = (List) sendMessageUseCase$invoke$22.L$2;
                    MutableStateFlow<ConversationClientState> mutableStateFlow6 = (MutableStateFlow) sendMessageUseCase$invoke$22.L$1;
                    sendMessageUseCase2 = (SendMessageUseCase) sendMessageUseCase$invoke$22.L$0;
                    ResultKt.throwOnFailure(obj2);
                    str6 = str8;
                    mutableStateFlow4 = mutableStateFlow6;
                    sendMessageUseCase = sendMessageUseCase2;
                    list2 = list3;
                    str3 = str6;
                    str2 = ((ConversationClientState) obj2).getConversationId();
                    if (str2 != null) {
                        Conversation conversation = mutableStateFlow4.getValue().getConversation();
                        if (conversation != null && (parts = conversation.parts()) != null) {
                            ListIterator<Part> listIterator = parts.listIterator(parts.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    part = null;
                                    break;
                                }
                                part = listIterator.previous();
                                if (part.isAdmin()) {
                                    break;
                                }
                            }
                            Part part2 = part;
                            if (part2 != null) {
                                l = Boxing.boxLong(part2.getCreatedAt());
                                ConversationRepository conversationRepository2 = sendMessageUseCase.conversationRepository;
                                sendMessageUseCase$invoke$22.L$0 = sendMessageUseCase;
                                sendMessageUseCase$invoke$22.L$1 = mutableStateFlow4;
                                sendMessageUseCase$invoke$22.L$2 = str3;
                                obj = null;
                                sendMessageUseCase$invoke$22.L$3 = null;
                                sendMessageUseCase$invoke$22.label = 4;
                                obj2 = conversationRepository2.replyToConversation(str2, str3, list2, l, sendMessageUseCase$invoke$22);
                                if (obj2 != coroutine_suspended) {
                                    sendMessageUseCase4 = sendMessageUseCase;
                                    mutableStateFlow3 = mutableStateFlow4;
                                    str5 = str3;
                                    networkResponse2 = (NetworkResponse) obj2;
                                    if (!(networkResponse2 instanceof NetworkResponse.ClientError)) {
                                    }
                                    sendMessageUseCase4.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                                    INSTANCE.updateFailedPendingMessages(mutableStateFlow3, str5);
                                }
                                return coroutine_suspended;
                            }
                        }
                        l = null;
                        ConversationRepository conversationRepository22 = sendMessageUseCase.conversationRepository;
                        sendMessageUseCase$invoke$22.L$0 = sendMessageUseCase;
                        sendMessageUseCase$invoke$22.L$1 = mutableStateFlow4;
                        sendMessageUseCase$invoke$22.L$2 = str3;
                        obj = null;
                        sendMessageUseCase$invoke$22.L$3 = null;
                        sendMessageUseCase$invoke$22.label = 4;
                        obj2 = conversationRepository22.replyToConversation(str2, str3, list2, l, sendMessageUseCase$invoke$22);
                        if (obj2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } else if (i == 4) {
                    str5 = (String) sendMessageUseCase$invoke$22.L$2;
                    MutableStateFlow<ConversationClientState> mutableStateFlow7 = (MutableStateFlow) sendMessageUseCase$invoke$22.L$1;
                    SendMessageUseCase sendMessageUseCase6 = (SendMessageUseCase) sendMessageUseCase$invoke$22.L$0;
                    ResultKt.throwOnFailure(obj2);
                    sendMessageUseCase4 = sendMessageUseCase6;
                    mutableStateFlow3 = mutableStateFlow7;
                    obj = null;
                    networkResponse2 = (NetworkResponse) obj2;
                    if (!(networkResponse2 instanceof NetworkResponse.ClientError) || (networkResponse2 instanceof NetworkResponse.NetworkError) || (networkResponse2 instanceof NetworkResponse.ServerError)) {
                        sendMessageUseCase4.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        INSTANCE.updateFailedPendingMessages(mutableStateFlow3, str5);
                    } else {
                        if (!(networkResponse2 instanceof NetworkResponse.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sendMessageUseCase4.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                        RefreshConversationUseCase refreshConversationUseCase = sendMessageUseCase4.refreshConversationUseCase;
                        GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                        sendMessageUseCase$invoke$22.L$0 = obj;
                        sendMessageUseCase$invoke$22.L$1 = obj;
                        sendMessageUseCase$invoke$22.L$2 = obj;
                        sendMessageUseCase$invoke$22.label = 5;
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        sendMessageUseCase$invoke$2 = new SendMessageUseCase$invoke$2(this, continuation);
        SendMessageUseCase$invoke$2 sendMessageUseCase$invoke$222 = sendMessageUseCase$invoke$2;
        Object obj22 = sendMessageUseCase$invoke$222.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendMessageUseCase$invoke$222.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object invoke$default(SendMessageUseCase sendMessageUseCase, MutableStateFlow mutableStateFlow, List list, String str, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMessageUseCase.invoke(mutableStateFlow, list, str, continuation);
    }

    /* compiled from: SendMessageUseCase.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0010\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase$Companion;", "", "<init>", "()V", "addBlocksToPendingMessages", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "uuid", "", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "updateFailedPendingMessages", "clientUUID", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void addBlocksToPendingMessages(MutableStateFlow<ConversationClientState> clientState, List<Block.Builder> blocks, String uuid, UserIdentity userIdentity) {
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
            Part build = new Part.Builder().withBlocks(blocks).withCreatedAt(TimeUnit.MILLISECONDS.toSeconds(TimeProvider.SYSTEM.currentTimeMillis())).withParticipantIsAdmin(false).withClientAssignedUuid(uuid).build();
            build.setParticipant(new Participant.Builder().withId(userIdentity.getIntercomId()).build());
            build.setMessageState(Part.MessageState.SENDING);
            while (true) {
                ConversationClientState value = clientState.getValue();
                ConversationClientState conversationClientState = value;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                Intrinsics.checkNotNull(build);
                Part part = build;
                linkedHashMap.put(uuid, new PendingMessage(part, false, null, 4, null));
                if (clientState.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null))) {
                    return;
                } else {
                    build = part;
                }
            }
        }

        public final void updateFailedPendingMessages(MutableStateFlow<ConversationClientState> clientState, String clientUUID) {
            ConversationClientState value;
            ConversationClientState conversationClientState;
            Map mutableMap;
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(clientUUID, "clientUUID");
            do {
                value = clientState.getValue();
                conversationClientState = value;
                mutableMap = MapsKt.toMutableMap(clientState.getValue().getPendingMessages());
                PendingMessage pendingMessage = (PendingMessage) mutableMap.get(clientUUID);
                if (pendingMessage != null) {
                    mutableMap.put(clientUUID, PendingMessage.copy$default(pendingMessage, null, true, null, 5, null));
                }
            } while (!clientState.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, mutableMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
        }
    }
}
