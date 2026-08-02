package com.vk.feed.core.models.attachment;

import com.vk.core.serialize.Serializer;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public final class FullAttachmentStyle extends AttachmentStyle {
    public static final Serializer.c<FullAttachmentStyle> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FullAttachmentStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FullAttachmentStyle a(Serializer serializer) {
            return new FullAttachmentStyle();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullAttachmentStyle[i];
        }
    }

    public FullAttachmentStyle() {
        super(null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
