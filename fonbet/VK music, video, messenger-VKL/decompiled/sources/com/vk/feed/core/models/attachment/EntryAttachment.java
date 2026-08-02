package com.vk.feed.core.models.attachment;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import xsna.epx;
import xsna.zcl;

/* compiled from: EntryAttachment.kt */
/* loaded from: classes18.dex */
public final class EntryAttachment implements Serializer.StreamParcelable, Comparable<EntryAttachment> {
    public static final Serializer.c<EntryAttachment> CREATOR = new a();
    public Attachment b;
    public final AttachmentStyle c;
    public final EntryAttachmentMeta d;
    public final EntryAttachmentPayload e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryAttachment a(Serializer serializer) {
            return new EntryAttachment((Attachment) serializer.G(Attachment.class.getClassLoader()), (AttachmentStyle) serializer.G(AttachmentStyle.class.getClassLoader()), (EntryAttachmentMeta) serializer.G(EntryAttachmentMeta.class.getClassLoader()), (EntryAttachmentPayload) serializer.G(EntryAttachmentPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryAttachment[i];
        }
    }

    public EntryAttachment(Attachment attachment, AttachmentStyle attachmentStyle, EntryAttachmentMeta entryAttachmentMeta, EntryAttachmentPayload entryAttachmentPayload) {
        this.b = attachment;
        this.c = attachmentStyle;
        this.d = entryAttachmentMeta;
        this.e = entryAttachmentPayload;
    }

    public static EntryAttachment a(EntryAttachment entryAttachment, Attachment attachment) {
        return new EntryAttachment(attachment, entryAttachment.c, entryAttachment.d, entryAttachment.e);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(EntryAttachment entryAttachment) {
        return this.b.Bb() - entryAttachment.b.Bb();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EntryAttachment) {
            return epx.f(this.b, ((EntryAttachment) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final EntryAttachmentPayload i() {
        return this.e;
    }

    public final AttachmentStyle j() {
        return this.c;
    }

    public final Attachment nb() {
        return this.b;
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ EntryAttachment(Attachment attachment, AttachmentStyle attachmentStyle, EntryAttachmentMeta entryAttachmentMeta, EntryAttachmentPayload entryAttachmentPayload, int i, zcl zclVar) {
        this(attachment, (i & 2) != 0 ? null : attachmentStyle, (i & 4) != 0 ? null : entryAttachmentMeta, (i & 8) != 0 ? null : entryAttachmentPayload);
    }
}
