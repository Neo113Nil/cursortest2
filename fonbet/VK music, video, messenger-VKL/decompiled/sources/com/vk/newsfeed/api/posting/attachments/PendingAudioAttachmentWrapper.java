package com.vk.newsfeed.api.posting.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.pending.PendingAudioAttachment;

/* compiled from: PendingAudioAttachmentWrapper.kt */
/* loaded from: classes3.dex */
public final class PendingAudioAttachmentWrapper extends Attachment {
    public static final Serializer.c<PendingAudioAttachmentWrapper> CREATOR = new a();
    public final PendingAudioAttachment f;
    public final MusicTrack g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PendingAudioAttachmentWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingAudioAttachmentWrapper a(Serializer serializer) {
            return new PendingAudioAttachmentWrapper((PendingAudioAttachment) serializer.G(PendingAudioAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingAudioAttachmentWrapper[i];
        }
    }

    public PendingAudioAttachmentWrapper(PendingAudioAttachment pendingAudioAttachment) {
        this.f = pendingAudioAttachment;
        MusicTrack musicTrack = pendingAudioAttachment.f;
        musicTrack.Ib();
        String str = musicTrack.d;
        String str2 = musicTrack.e;
        UserId userId = musicTrack.c;
        int i = musicTrack.b;
        this.g = musicTrack;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
    }
}
