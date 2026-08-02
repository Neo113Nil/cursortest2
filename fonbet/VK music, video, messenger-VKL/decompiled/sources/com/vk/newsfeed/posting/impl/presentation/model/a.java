package com.vk.newsfeed.posting.impl.presentation.model;

import android.net.Uri;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.VideoUrl;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.newsfeed.api.posting.attachments.PendingPhotoAttachmentWrapper;
import com.vk.newsfeed.api.posting.attachments.PendingVideoAttachmentWrapper;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.SituationalThemeAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import xsna.epx;

/* compiled from: AttachmentDtoPreparer.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final PhotoDto a(PhotoAttachment photoAttachment) {
        return new PhotoDto(photoAttachment.f, photoAttachment, photoAttachment.g, photoAttachment.n, null, 0L, 16, null);
    }

    public static final PostingAttachment b(Attachment attachment) {
        if (attachment == null) {
            return null;
        }
        if (attachment instanceof LocalPhotoAttachment) {
            LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) attachment;
            UploadDto.UploadStep.Idle idle = UploadDto.UploadStep.Idle.b;
            LocalMediaEntry localMediaEntry = localPhotoAttachment.y;
            return new PhotoDto(localPhotoAttachment.f, localPhotoAttachment, localPhotoAttachment.g, localPhotoAttachment.n, new UploadDto.UploadState(idle, localMediaEntry.ba().f().toString(), com.vk.upload.impl.a.d.getAndIncrement(), 0, 0, AttachmentType.PHOTO, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null), localMediaEntry.ba().g());
        }
        if (attachment instanceof LocalVideoAttachment) {
            LocalVideoAttachment localVideoAttachment = (LocalVideoAttachment) attachment;
            return new VideoDto(localVideoAttachment.k.o0(), localVideoAttachment, localVideoAttachment.k.I0(), localVideoAttachment.k.C1(), new UploadDto.UploadState(UploadDto.UploadStep.Idle.b, localVideoAttachment.k.w9().Ab(VideoUrl.EXTERNAL_URL), com.vk.upload.impl.a.d.getAndIncrement(), 0, 0, AttachmentType.VIDEO, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null), localVideoAttachment.p.b.p);
        }
        if (attachment instanceof PendingPhotoAttachmentWrapper) {
            PendingPhotoAttachmentWrapper pendingPhotoAttachmentWrapper = (PendingPhotoAttachmentWrapper) attachment;
            UploadDto.UploadStep.Idle idle2 = UploadDto.UploadStep.Idle.b;
            PendingPhotoAttachment pendingPhotoAttachment = pendingPhotoAttachmentWrapper.y;
            UploadDto.UploadState uploadState = new UploadDto.UploadState(idle2, pendingPhotoAttachment.f, pendingPhotoAttachment.i, 0, 0, AttachmentType.PHOTO, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null);
            return new PhotoDto(pendingPhotoAttachment.i, new LocalPhotoAttachment(new LocalMediaEntry.Image(new MediaStoreImageEntry(uploadState.d, Uri.parse(pendingPhotoAttachment.f), pendingPhotoAttachmentWrapper.l.g, pendingPhotoAttachmentWrapper.r, pendingPhotoAttachmentWrapper.s, -1L, -1L, 1))), pendingPhotoAttachmentWrapper.g, null, uploadState, 0L);
        }
        if (attachment instanceof PendingVideoAttachmentWrapper) {
            PendingVideoAttachmentWrapper pendingVideoAttachmentWrapper = (PendingVideoAttachmentWrapper) attachment;
            UploadDto.UploadStep.Idle idle3 = UploadDto.UploadStep.Idle.b;
            PendingVideoAttachment pendingVideoAttachment = pendingVideoAttachmentWrapper.p;
            return new VideoDto(pendingVideoAttachmentWrapper.k.o0(), new VideoAttachment(pendingVideoAttachmentWrapper.k), pendingVideoAttachmentWrapper.k.I0(), pendingVideoAttachmentWrapper.k.C1(), new UploadDto.UploadState(idle3, pendingVideoAttachment.getUri(), pendingVideoAttachment.p, 0, 0, AttachmentType.VIDEO, null, false, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, null), 0L);
        }
        if (attachment instanceof PhotoAttachment) {
            return a((PhotoAttachment) attachment);
        }
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            return new VideoDto(videoAttachment.k.o0(), videoAttachment, videoAttachment.k.I0(), videoAttachment.k.C1(), null, 0L, 16, null);
        }
        if (attachment instanceof SituationalThemeAttachment) {
            SituationalThemeAttachment situationalThemeAttachment = (SituationalThemeAttachment) attachment;
            return new SituationalTheme(situationalThemeAttachment.f, situationalThemeAttachment);
        }
        if (!(attachment instanceof DocumentAttachment)) {
            return null;
        }
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        if (!epx.f(documentAttachment.i, "gif")) {
            return null;
        }
        int i = documentAttachment.k;
        String str = documentAttachment.f;
        long j = documentAttachment.n;
        return new FileDto.Gif(i, str, null, j, documentAttachment.o, documentAttachment.j, null, documentAttachment, j, 64, null);
    }
}
