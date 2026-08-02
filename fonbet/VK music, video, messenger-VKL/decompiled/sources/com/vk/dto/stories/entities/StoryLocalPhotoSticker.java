package com.vk.dto.stories.entities;

import android.net.Uri;
import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: StoryLocalPhotoSticker.kt */
/* loaded from: classes18.dex */
public final class StoryLocalPhotoSticker implements Serializer.StreamParcelable {
    public static final Serializer.c<StoryLocalPhotoSticker> CREATOR = new a();
    public final Uri b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryLocalPhotoSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryLocalPhotoSticker a(Serializer serializer) {
            return new StoryLocalPhotoSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryLocalPhotoSticker[i];
        }
    }

    public StoryLocalPhotoSticker(Uri uri, int i) {
        this.b = uri;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.toString());
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public StoryLocalPhotoSticker(Serializer serializer) {
        this(Uri.parse(serializer.H()), serializer.u());
    }
}
