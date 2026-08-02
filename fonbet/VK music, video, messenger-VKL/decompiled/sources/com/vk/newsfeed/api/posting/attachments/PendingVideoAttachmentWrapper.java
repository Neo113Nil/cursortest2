package com.vk.newsfeed.api.posting.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: PendingVideoAttachmentWrapper.kt */
/* loaded from: classes3.dex */
public final class PendingVideoAttachmentWrapper extends VideoAttachment {
    public static final Serializer.c<PendingVideoAttachmentWrapper> CREATOR = new a();
    public final PendingVideoAttachment p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PendingVideoAttachmentWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingVideoAttachmentWrapper a(Serializer serializer) {
            return new PendingVideoAttachmentWrapper((PendingVideoAttachment) serializer.G(PendingVideoAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingVideoAttachmentWrapper[i];
        }
    }

    public PendingVideoAttachmentWrapper(PendingVideoAttachment pendingVideoAttachment) {
        super(pendingVideoAttachment.k);
        this.p = pendingVideoAttachment;
    }

    @Override // com.vkontakte.android.attachments.VideoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.p);
    }
}
