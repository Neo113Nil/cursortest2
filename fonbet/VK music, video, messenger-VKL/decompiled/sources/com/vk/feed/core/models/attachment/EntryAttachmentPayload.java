package com.vk.feed.core.models.attachment;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: EntryAttachmentPayload.kt */
/* loaded from: classes18.dex */
public abstract class EntryAttachmentPayload implements Serializer.StreamParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
