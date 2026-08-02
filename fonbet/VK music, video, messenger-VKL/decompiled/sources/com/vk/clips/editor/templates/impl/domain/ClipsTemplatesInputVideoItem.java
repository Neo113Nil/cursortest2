package com.vk.clips.editor.templates.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.gallery.ClipsProcessedItem;

/* compiled from: ClipsTemplatesInputVideoItem.kt */
/* loaded from: classes16.dex */
public final class ClipsTemplatesInputVideoItem implements Parcelable {
    public static final Parcelable.Creator<ClipsTemplatesInputVideoItem> CREATOR = new a();
    public final ClipsProcessedItem b;
    public final long c;
    public final long d;
    public final int e;
    public final VideoTransform f;

    /* compiled from: ClipsTemplatesInputVideoItem.kt */
    public static final class a implements Parcelable.Creator<ClipsTemplatesInputVideoItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipsTemplatesInputVideoItem createFromParcel(Parcel parcel) {
            return new ClipsTemplatesInputVideoItem((ClipsProcessedItem) parcel.readParcelable(ClipsTemplatesInputVideoItem.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readInt(), (VideoTransform) parcel.readParcelable(ClipsTemplatesInputVideoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsTemplatesInputVideoItem[] newArray(int i) {
            return new ClipsTemplatesInputVideoItem[i];
        }
    }

    public ClipsTemplatesInputVideoItem(ClipsProcessedItem clipsProcessedItem, long j, long j2, int i, VideoTransform videoTransform) {
        this.b = clipsProcessedItem;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = videoTransform;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
    }
}
