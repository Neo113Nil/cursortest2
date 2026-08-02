package com.vk.newsfeed.api.posting.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.pending.PendingPhotoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collections;
import java.util.List;
import xsna.m900;

/* compiled from: PendingPhotoAttachmentWrapper.kt */
/* loaded from: classes3.dex */
public final class PendingPhotoAttachmentWrapper extends PhotoAttachment {
    public static final Serializer.c<PendingPhotoAttachmentWrapper> CREATOR = new a();
    public final PendingPhotoAttachment y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PendingPhotoAttachmentWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingPhotoAttachmentWrapper a(Serializer serializer) {
            return new PendingPhotoAttachmentWrapper((PendingPhotoAttachment) serializer.G(PendingPhotoAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPhotoAttachmentWrapper[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PendingPhotoAttachmentWrapper(PendingPhotoAttachment pendingPhotoAttachment) {
        super(new Photo(new Image((List<ImageSize>) Collections.singletonList(new ImageSize(r8, r9, r10, r17, r12)))));
        int i = pendingPhotoAttachment.g;
        int i2 = pendingPhotoAttachment.h;
        m900<String, ImageSize> m900Var = ImageSize.e;
        char c = ImageSize.b.c(i, i2);
        String str = pendingPhotoAttachment.f;
        int i3 = pendingPhotoAttachment.g;
        int i4 = pendingPhotoAttachment.h;
        Boolean bool = Boolean.FALSE;
        this.y = pendingPhotoAttachment;
        new Image((List<ImageSize>) Collections.singletonList(new ImageSize(pendingPhotoAttachment.f, pendingPhotoAttachment.g, pendingPhotoAttachment.h, bool, ImageSize.b.c(pendingPhotoAttachment.g, i2))));
        this.l.c = pendingPhotoAttachment.i;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.y);
    }
}
