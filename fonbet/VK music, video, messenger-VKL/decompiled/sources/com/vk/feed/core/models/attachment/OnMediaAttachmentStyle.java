package com.vk.feed.core.models.attachment;

import com.vk.core.serialize.Serializer;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public final class OnMediaAttachmentStyle extends AttachmentStyle {
    public static final Serializer.c<OnMediaAttachmentStyle> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<OnMediaAttachmentStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OnMediaAttachmentStyle a(Serializer serializer) {
            return new OnMediaAttachmentStyle();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnMediaAttachmentStyle[i];
        }
    }

    public OnMediaAttachmentStyle() {
        super(null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
