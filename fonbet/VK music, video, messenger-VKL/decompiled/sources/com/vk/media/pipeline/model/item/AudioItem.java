package com.vk.media.pipeline.model.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.media.pipeline.model.effect.AudioEffect;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.zcl;
import xsna.zjh0;

/* compiled from: AudioItem.kt */
/* loaded from: classes3.dex */
public final class AudioItem implements PlayableItem {
    public static final Parcelable.Creator<AudioItem> CREATOR = new a();
    public final TrackMediaSource b;
    public final long c;
    public final long d;
    public final double e;
    public final float f;
    public final AudioEffect g;

    /* compiled from: AudioItem.kt */
    public static final class a implements Parcelable.Creator<AudioItem> {
        @Override // android.os.Parcelable.Creator
        public final AudioItem createFromParcel(Parcel parcel) {
            return new AudioItem(TrackMediaSource.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong(), parcel.readDouble(), parcel.readFloat(), AudioEffect.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioItem[] newArray(int i) {
            return new AudioItem[i];
        }
    }

    public AudioItem(TrackMediaSource trackMediaSource, long j, long j2, double d, float f, AudioEffect audioEffect) {
        this.b = trackMediaSource;
        this.c = j;
        this.d = j2;
        this.e = d;
        this.f = f;
        this.g = audioEffect;
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final long O0() {
        return this.c;
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final long W0() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioItem)) {
            return false;
        }
        AudioItem audioItem = (AudioItem) obj;
        return epx.f(this.b, audioItem.b) && this.c == audioItem.c && this.d == audioItem.d && Double.compare(this.e, audioItem.e) == 0 && Float.compare(this.f, audioItem.f) == 0 && this.g == audioItem.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + b.a(this.f, zjh0.b(this.e, bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31);
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final MediaSource t() {
        return this.b;
    }

    public final String toString() {
        return "AudioItem(source=" + this.b + ", startMcs=" + this.c + ", endMcs=" + this.d + ", speed=" + this.e + ", volume=" + this.f + ", audioEffect=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeDouble(this.e);
        parcel.writeFloat(this.f);
        parcel.writeString(this.g.name());
    }

    @Override // com.vk.media.pipeline.model.item.PlayableItem
    public final double z() {
        return this.e;
    }

    public /* synthetic */ AudioItem(TrackMediaSource trackMediaSource, long j, long j2, double d, float f, AudioEffect audioEffect, int i, zcl zclVar) {
        this(trackMediaSource, j, j2, d, f, (i & 32) != 0 ? AudioEffect.DEFAULT : audioEffect);
    }
}
