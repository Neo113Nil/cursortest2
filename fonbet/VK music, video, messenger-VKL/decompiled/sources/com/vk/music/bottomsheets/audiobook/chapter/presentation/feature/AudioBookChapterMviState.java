package com.vk.music.bottomsheets.audiobook.chapter.presentation.feature;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import xsna.epx;
import xsna.lm50;

/* compiled from: AudioBookChapterMviState.kt */
/* loaded from: classes3.dex */
public final class AudioBookChapterMviState implements lm50, Parcelable {
    public static final Parcelable.Creator<AudioBookChapterMviState> CREATOR = new a();
    public final AudioBookChapterBottomSheetLaunchPoint b;

    /* compiled from: AudioBookChapterMviState.kt */
    public static final class a implements Parcelable.Creator<AudioBookChapterMviState> {
        @Override // android.os.Parcelable.Creator
        public final AudioBookChapterMviState createFromParcel(Parcel parcel) {
            return new AudioBookChapterMviState((AudioBookChapterBottomSheetLaunchPoint) parcel.readParcelable(AudioBookChapterMviState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBookChapterMviState[] newArray(int i) {
            return new AudioBookChapterMviState[i];
        }
    }

    public AudioBookChapterMviState(AudioBookChapterBottomSheetLaunchPoint audioBookChapterBottomSheetLaunchPoint) {
        this.b = audioBookChapterBottomSheetLaunchPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioBookChapterMviState) && epx.f(this.b, ((AudioBookChapterMviState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AudioBookChapterMviState(launchPoint=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
