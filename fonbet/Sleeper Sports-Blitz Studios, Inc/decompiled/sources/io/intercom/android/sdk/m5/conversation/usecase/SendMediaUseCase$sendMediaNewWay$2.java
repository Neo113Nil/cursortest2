package io.intercom.android.sdk.m5.conversation.usecase;

import android.content.Context;
import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.utils.MediaCompressionKt;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SendMediaUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2", f = "SendMediaUseCase.kt", i = {0, 1, 2, 2, 3, 3, 4}, l = {267, 276, 287, 321, 346}, m = "invokeSuspend", n = {"$this$coroutineScope", "compressedMediaData", "compressedMediaData", "thumbnailUpload", "compressedMediaData", UnstructuredDocViewModelExtKt.UPLOAD, "compressedMediaData"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes9.dex */
final class SendMediaUseCase$sendMediaNewWay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableStateFlow<ConversationClientState> $clientState;
    final /* synthetic */ MediaData.Media $mediaData;
    final /* synthetic */ MutableSharedFlow<ConversationUiEffect> $uiEffect;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMediaUseCase$sendMediaNewWay$2(MediaData.Media media, String str, MutableStateFlow<ConversationClientState> mutableStateFlow, SendMediaUseCase sendMediaUseCase, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, Continuation<? super SendMediaUseCase$sendMediaNewWay$2> continuation) {
        super(2, continuation);
        this.$mediaData = media;
        this.$uuid = str;
        this.$clientState = mutableStateFlow;
        this.this$0 = sendMediaUseCase;
        this.$uiEffect = mutableSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SendMediaUseCase$sendMediaNewWay$2 sendMediaUseCase$sendMediaNewWay$2 = new SendMediaUseCase$sendMediaNewWay$2(this.$mediaData, this.$uuid, this.$clientState, this.this$0, this.$uiEffect, continuation);
        sendMediaUseCase$sendMediaNewWay$2.L$0 = obj;
        return sendMediaUseCase$sendMediaNewWay$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SendMediaUseCase$sendMediaNewWay$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x021d, code lost:
    
        if (r3 == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x044e, code lost:
    
        if (r40.this$0.getSendMessageUseCase().invoke(r40.$clientState, kotlin.collections.CollectionsKt.listOf(r2), r40.$uuid, r40) != r1) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0474  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Block.Builder withType;
        Uri uri;
        UserIdentity userIdentity;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMap;
        MediaData.Media.Image image;
        Context context;
        Object compressedMediaData;
        Context context2;
        Function0 function0;
        Deferred async$default;
        Object await;
        MediaData.Media media;
        Deferred deferred;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        LinkedHashMap linkedHashMap2;
        Function0 function02;
        MediaData.Media media2;
        NetworkResponse networkResponse;
        PendingMessage pendingMessage;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        LinkedHashMap linkedHashMap3;
        Upload build;
        Block.Builder withType2;
        NetworkResponse networkResponse2;
        Object await2;
        MediaData.Media media3;
        Upload.Builder builder;
        Upload build2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            MediaData.Media media4 = this.$mediaData;
            if (media4 instanceof MediaData.Media.Image) {
                withType = new Block.Builder().withLocalUri(((MediaData.Media.Image) this.$mediaData).getUri()).withWidth(((MediaData.Media.Image) this.$mediaData).getWidth()).withHeight(((MediaData.Media.Image) this.$mediaData).getHeight()).withType(ShareConstants.IMAGE_URL);
                Intrinsics.checkNotNull(withType);
            } else if (media4 instanceof MediaData.Media.Video) {
                Block.Builder withType3 = new Block.Builder().withLocalUri(((MediaData.Media.Video) this.$mediaData).getUri()).withWidth(((MediaData.Media.Video) this.$mediaData).getWidth()).withHeight(((MediaData.Media.Video) this.$mediaData).getHeight()).withType("VIDEOFILE");
                MediaData.Media.Image thumbnail = ((MediaData.Media.Video) this.$mediaData).getThumbnail();
                withType = withType3.withThumbnailUrl((thumbnail == null || (uri = thumbnail.getUri()) == null) ? null : uri.toString());
                Intrinsics.checkNotNull(withType);
            } else {
                if (!(media4 instanceof MediaData.Media.Other)) {
                    throw new NoWhenBranchMatchedException();
                }
                withType = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withName(((MediaData.Media.Other) this.$mediaData).getFileName()).withUrl(((MediaData.Media.Other) this.$mediaData).getUri().toString()).withContentType(((MediaData.Media.Other) this.$mediaData).getMimeType()).build())).withType("LOCAL_ATTACHMENT");
                Intrinsics.checkNotNull(withType);
            }
            Part build3 = new Part.Builder().withBlocks(CollectionsKt.listOf(withType)).withParticipantIsAdmin(false).withClientAssignedUuid(this.$uuid).build();
            SendMediaUseCase sendMediaUseCase = this.this$0;
            Participant.Builder builder2 = new Participant.Builder();
            userIdentity = sendMediaUseCase.userIdentity;
            build3.setParticipant(builder2.withId(userIdentity.getIntercomId()).build());
            build3.setMessageState(Part.MessageState.SENDING);
            MutableStateFlow<ConversationClientState> mutableStateFlow = this.$clientState;
            String str = this.$uuid;
            do {
                value = mutableStateFlow.getValue();
                conversationClientState = value;
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                Intrinsics.checkNotNull(build3);
                linkedHashMap.put(str, new PendingMessage(build3, false, null));
            } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
            MediaData.Media media5 = this.$mediaData;
            if ((media5 instanceof MediaData.Media.Image) && ((MediaData.Media.Image) media5).getExifData().isEmpty()) {
                context2 = this.this$0.applicationContext;
                image = MediaData.Media.Image.copy$default((MediaData.Media.Image) this.$mediaData, null, 0, 0, 0L, null, null, BitmapUtilsKt.extractExifData(context2, ((MediaData.Media.Image) this.$mediaData).getUri()), 63, null);
            } else {
                image = this.$mediaData;
            }
            context = this.this$0.applicationContext;
            this.L$0 = coroutineScope;
            this.label = 1;
            compressedMediaData = MediaCompressionKt.getCompressedMediaData(image, context, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        deferred = (Deferred) this.L$1;
                        MediaData.Media media6 = (MediaData.Media) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        media = media6;
                        await = obj;
                        networkResponse = (NetworkResponse) await;
                        if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                            pendingMessage = this.$clientState.getValue().getPendingMessages().get(this.$uuid);
                            if (pendingMessage != null) {
                                PendingMessage copy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(this.$uuid, media), 3, null);
                                MutableStateFlow<ConversationClientState> mutableStateFlow2 = this.$clientState;
                                String str2 = this.$uuid;
                                do {
                                    value3 = mutableStateFlow2.getValue();
                                    conversationClientState3 = value3;
                                    linkedHashMap3 = new LinkedHashMap();
                                    linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                                    linkedHashMap3.put(str2, copy$default);
                                } while (!mutableStateFlow2.compareAndSet(value3, ConversationClientState.copy$default(conversationClientState3, linkedHashMap3, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
                            }
                            media2 = media;
                            MediaCompressionKt.deleteCompressedMedia(media2.getUri());
                            return Unit.INSTANCE;
                        }
                        if (!(networkResponse instanceof NetworkResponse.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        build = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                        if (media instanceof MediaData.Media.Image) {
                            MediaData.Media.Image image2 = (MediaData.Media.Image) media;
                            withType2 = new Block.Builder().withUrl(build.getPublicUrl()).withWidth(image2.getWidth()).withHeight(image2.getHeight()).withType(BlockType.IMAGE.getSerializedName());
                        } else if (media instanceof MediaData.Media.Video) {
                            if (deferred != null) {
                                this.L$0 = media;
                                this.L$1 = build;
                                this.label = 4;
                                await2 = deferred.await(this);
                                if (await2 != coroutine_suspended) {
                                    media3 = media;
                                    networkResponse2 = (NetworkResponse) await2;
                                    media = media3;
                                    if (networkResponse2 instanceof NetworkResponse.Success) {
                                    }
                                    if (r2 != null) {
                                    }
                                    Block.Builder withUrl = new Block.Builder().withUrl(build.getPublicUrl());
                                    MediaData.Media.Video video = (MediaData.Media.Video) media;
                                    withType2 = withUrl.withWidth(video.getWidth()).withHeight(video.getHeight()).withDuration(video.getDuration()).withThumbnailUrl(r2).withType(BlockType.VIDEOFILE.getSerializedName());
                                }
                                return coroutine_suspended;
                            }
                            networkResponse2 = null;
                            if (networkResponse2 instanceof NetworkResponse.Success) {
                            }
                            if (r2 != null) {
                            }
                            Block.Builder withUrl2 = new Block.Builder().withUrl(build.getPublicUrl());
                            MediaData.Media.Video video2 = (MediaData.Media.Video) media;
                            withType2 = withUrl2.withWidth(video2.getWidth()).withHeight(video2.getHeight()).withDuration(video2.getDuration()).withThumbnailUrl(r2).withType(BlockType.VIDEOFILE.getSerializedName());
                        } else {
                            if (!(media instanceof MediaData.Media.Other)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            MediaData.Media.Other other = (MediaData.Media.Other) media;
                            withType2 = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withName(other.getFileName()).withId(build.getId()).withSize(other.getSize()).withUrl(build.getPublicUrl()).withContentType(other.getMimeType()).build())).withType(BlockType.ATTACHMENTLIST.getSerializedName());
                        }
                        this.L$0 = media;
                        this.L$1 = null;
                        this.label = 5;
                    } else if (i == 4) {
                        Upload upload = (Upload) this.L$1;
                        media3 = (MediaData.Media) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        build = upload;
                        await2 = obj;
                        networkResponse2 = (NetworkResponse) await2;
                        media = media3;
                        NetworkResponse.Success success = networkResponse2 instanceof NetworkResponse.Success ? (NetworkResponse.Success) networkResponse2 : null;
                        String publicUrl = (success != null || (builder = (Upload.Builder) success.getBody()) == null || (build2 = builder.build()) == null) ? null : build2.getPublicUrl();
                        Block.Builder withUrl22 = new Block.Builder().withUrl(build.getPublicUrl());
                        MediaData.Media.Video video22 = (MediaData.Media.Video) media;
                        withType2 = withUrl22.withWidth(video22.getWidth()).withHeight(video22.getHeight()).withDuration(video22.getDuration()).withThumbnailUrl(publicUrl).withType(BlockType.VIDEOFILE.getSerializedName());
                        this.L$0 = media;
                        this.L$1 = null;
                        this.label = 5;
                    } else if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                media2 = (MediaData.Media) this.L$0;
                ResultKt.throwOnFailure(obj);
                MediaCompressionKt.deleteCompressedMedia(media2.getUri());
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            compressedMediaData = obj;
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        MediaData.Media media7 = (MediaData.Media) compressedMediaData;
        long size = media7.getSize();
        function0 = this.this$0.attachmentSettings;
        if (size > ((AttachmentSettings) function0.invoke()).getUploadSizeLimit()) {
            MutableStateFlow<ConversationClientState> mutableStateFlow3 = this.$clientState;
            String str3 = this.$uuid;
            do {
                value2 = mutableStateFlow3.getValue();
                conversationClientState2 = value2;
                Map<String, PendingMessage> pendingMessages = conversationClientState2.getPendingMessages();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                    if (!Intrinsics.areEqual(str3, entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
            } while (!mutableStateFlow3.compareAndSet(value2, ConversationClientState.copy$default(conversationClientState2, linkedHashMap2, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
            MutableSharedFlow<ConversationUiEffect> mutableSharedFlow = this.$uiEffect;
            function02 = this.this$0.attachmentSettings;
            this.L$0 = media7;
            this.label = 2;
            if (mutableSharedFlow.emit(new ConversationUiEffect.ShowUploadSizeLimitDialog(((AttachmentSettings) function02.invoke()).getUploadSizeLimitMB()), this) != coroutine_suspended) {
                media2 = media7;
                MediaCompressionKt.deleteCompressedMedia(media2.getUri());
                return Unit.INSTANCE;
            }
        } else {
            Deferred async$default2 = (!(media7 instanceof MediaData.Media.Video) || ((MediaData.Media.Video) media7).getThumbnail() == null) ? null : BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SendMediaUseCase$sendMediaNewWay$2$thumbnailUpload$1(this.this$0, media7, null), 3, null);
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(this.this$0, media7, null), 3, null);
            this.L$0 = media7;
            this.L$1 = async$default2;
            this.label = 3;
            await = async$default.await(this);
            if (await != coroutine_suspended) {
                Deferred deferred2 = async$default2;
                media = media7;
                deferred = deferred2;
                networkResponse = (NetworkResponse) await;
                if (!(networkResponse instanceof NetworkResponse.ClientError)) {
                }
                pendingMessage = this.$clientState.getValue().getPendingMessages().get(this.$uuid);
                if (pendingMessage != null) {
                }
                media2 = media;
                MediaCompressionKt.deleteCompressedMedia(media2.getUri());
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
