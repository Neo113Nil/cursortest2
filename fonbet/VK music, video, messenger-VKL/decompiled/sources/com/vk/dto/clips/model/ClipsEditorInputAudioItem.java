package com.vk.dto.clips.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.xq;
import xsna.zcl;

/* compiled from: ClipsEditorInputAudioItem.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorInputAudioItem implements Parcelable {
    public static final Parcelable.Creator<ClipsEditorInputAudioItem> CREATOR = new a();
    public final ClipsEditorMusicInfo b;
    public final float c;
    public final AudioEffectType d;
    public final float e;

    /* compiled from: ClipsEditorInputAudioItem.kt */
    public static final class a implements Parcelable.Creator<ClipsEditorInputAudioItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEditorInputAudioItem createFromParcel(Parcel parcel) {
            return new ClipsEditorInputAudioItem(ClipsEditorMusicInfo.CREATOR.createFromParcel(parcel), parcel.readFloat(), AudioEffectType.valueOf(parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEditorInputAudioItem[] newArray(int i) {
            return new ClipsEditorInputAudioItem[i];
        }
    }

    public ClipsEditorInputAudioItem(ClipsEditorMusicInfo clipsEditorMusicInfo, float f, AudioEffectType audioEffectType, float f2) {
        this.b = clipsEditorMusicInfo;
        this.c = f;
        this.d = audioEffectType;
        this.e = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorInputAudioItem)) {
            return false;
        }
        ClipsEditorInputAudioItem clipsEditorInputAudioItem = (ClipsEditorInputAudioItem) obj;
        return epx.f(this.b, clipsEditorInputAudioItem.b) && Float.compare(this.c, clipsEditorInputAudioItem.c) == 0 && this.d == clipsEditorInputAudioItem.d && Float.compare(this.e, clipsEditorInputAudioItem.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + b.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorInputAudioItem(audio=");
        sb.append(this.b);
        sb.append(", volume=");
        sb.append(this.c);
        sb.append(", audioEffect=");
        sb.append(this.d);
        sb.append(", speed=");
        return xq.c(')', this.e, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeFloat(this.c);
        parcel.writeString(this.d.name());
        parcel.writeFloat(this.e);
    }

    public /* synthetic */ ClipsEditorInputAudioItem(ClipsEditorMusicInfo clipsEditorMusicInfo, float f, AudioEffectType audioEffectType, float f2, int i, zcl zclVar) {
        this(clipsEditorMusicInfo, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? AudioEffectType.DEFAULT : audioEffectType, (i & 8) != 0 ? 1.0f : f2);
    }
}
