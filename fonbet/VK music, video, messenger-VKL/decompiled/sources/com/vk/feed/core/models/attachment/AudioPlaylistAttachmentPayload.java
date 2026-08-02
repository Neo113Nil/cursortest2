package com.vk.feed.core.models.attachment;

import com.vk.core.serialize.Serializer;

/* compiled from: EntryAttachmentPayload.kt */
/* loaded from: classes18.dex */
public final class AudioPlaylistAttachmentPayload extends EntryAttachmentPayload {
    public static final Serializer.c<AudioPlaylistAttachmentPayload> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioPlaylistAttachmentPayload> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioPlaylistAttachmentPayload a(Serializer serializer) {
            return new AudioPlaylistAttachmentPayload(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioPlaylistAttachmentPayload[i];
        }
    }

    public AudioPlaylistAttachmentPayload(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }
}
