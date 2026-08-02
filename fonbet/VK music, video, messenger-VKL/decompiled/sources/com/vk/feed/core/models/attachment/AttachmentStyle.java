package com.vk.feed.core.models.attachment;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public abstract class AttachmentStyle implements Serializer.StreamParcelable {
    public /* synthetic */ AttachmentStyle(zcl zclVar) {
        this();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AttachmentStyle() {
    }
}
