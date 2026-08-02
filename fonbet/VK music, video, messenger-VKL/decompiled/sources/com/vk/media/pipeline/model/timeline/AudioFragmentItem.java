package com.vk.media.pipeline.model.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.item.AudioItem;
import xsna.epx;

/* compiled from: Timeline.kt */
/* loaded from: classes3.dex */
public final class AudioFragmentItem implements Parcelable {
    public static final Parcelable.Creator<AudioFragmentItem> CREATOR = new a();
    public final AudioItem b;
    public final long c;

    /* compiled from: Timeline.kt */
    public static final class a implements Parcelable.Creator<AudioFragmentItem> {
        @Override // android.os.Parcelable.Creator
        public final AudioFragmentItem createFromParcel(Parcel parcel) {
            return new AudioFragmentItem(AudioItem.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFragmentItem[] newArray(int i) {
            return new AudioFragmentItem[i];
        }
    }

    public AudioFragmentItem(AudioItem audioItem, long j) {
        this.b = audioItem;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFragmentItem)) {
            return false;
        }
        AudioFragmentItem audioFragmentItem = (AudioFragmentItem) obj;
        return epx.f(this.b, audioFragmentItem.b) && this.c == audioFragmentItem.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("audioItem=");
        AudioItem audioItem = this.b;
        sb.append(audioItem);
        sb.append(", offsetMcs=");
        sb.append(this.c);
        sb.append(", itemStartMcs=");
        sb.append(audioItem.c);
        sb.append(", itemEndMcs=");
        sb.append(audioItem.d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
    }
}
