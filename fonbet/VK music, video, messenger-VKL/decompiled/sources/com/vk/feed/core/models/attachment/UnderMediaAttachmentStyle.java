package com.vk.feed.core.models.attachment;

import com.vk.core.serialize.Serializer;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public final class UnderMediaAttachmentStyle extends AttachmentStyle {
    public static final Serializer.c<UnderMediaAttachmentStyle> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UnderMediaAttachmentStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UnderMediaAttachmentStyle a(Serializer serializer) {
            return new UnderMediaAttachmentStyle();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnderMediaAttachmentStyle[i];
        }
    }

    public UnderMediaAttachmentStyle() {
        super(null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
