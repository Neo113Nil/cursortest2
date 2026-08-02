package com.vk.newsfeed.api.posting.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.pending.PendingDocumentAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: PendingDocumentAttachmentWrapper.kt */
/* loaded from: classes3.dex */
public final class PendingDocumentAttachmentWrapper extends DocumentAttachment {
    public static final Serializer.c<PendingDocumentAttachmentWrapper> CREATOR = new a();
    public final PendingDocumentAttachment v;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PendingDocumentAttachmentWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingDocumentAttachmentWrapper a(Serializer serializer) {
            return new PendingDocumentAttachmentWrapper((PendingDocumentAttachment) serializer.G(PendingDocumentAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingDocumentAttachmentWrapper[i];
        }
    }

    public PendingDocumentAttachmentWrapper(PendingDocumentAttachment pendingDocumentAttachment) {
        super(pendingDocumentAttachment.Jb());
        this.v = pendingDocumentAttachment;
    }

    @Override // com.vkontakte.android.attachments.DocumentAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.v);
    }
}
