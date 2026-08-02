package com.vk.storycamera.entity.attach;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.core.serialize.Serializer.StreamParcelable;

/* compiled from: StoryEditorAttach.kt */
/* loaded from: classes6.dex */
public abstract class StoryEditorAttach<T extends Serializer.StreamParcelable> implements Serializer.StreamParcelable {
    public final T b;
    public final StoryEditorAttachPosition c;
    public final boolean d;

    public StoryEditorAttach(T t, StoryEditorAttachPosition storyEditorAttachPosition, boolean z) {
        this.b = t;
        this.c = storyEditorAttachPosition;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
