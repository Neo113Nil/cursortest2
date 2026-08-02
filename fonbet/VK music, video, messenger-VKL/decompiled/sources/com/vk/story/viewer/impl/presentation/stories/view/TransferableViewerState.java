package com.vk.story.viewer.impl.presentation.stories.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.story.viewer.impl.presentation.stories.util.audio.StoryAudioHandler;
import xsna.epx;

/* compiled from: TransferableViewerState.kt */
/* loaded from: classes6.dex */
public final class TransferableViewerState implements Parcelable {
    public static final Parcelable.Creator<TransferableViewerState> CREATOR = new a();
    public final StoryAudioHandler.TransferableState b;

    /* compiled from: TransferableViewerState.kt */
    public static final class a implements Parcelable.Creator<TransferableViewerState> {
        @Override // android.os.Parcelable.Creator
        public final TransferableViewerState createFromParcel(Parcel parcel) {
            return new TransferableViewerState(parcel.readInt() == 0 ? null : StoryAudioHandler.TransferableState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TransferableViewerState[] newArray(int i) {
            return new TransferableViewerState[i];
        }
    }

    public TransferableViewerState(StoryAudioHandler.TransferableState transferableState) {
        this.b = transferableState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransferableViewerState) && epx.f(this.b, ((TransferableViewerState) obj).b);
    }

    public final int hashCode() {
        StoryAudioHandler.TransferableState transferableState = this.b;
        if (transferableState == null) {
            return 0;
        }
        return transferableState.hashCode();
    }

    public final String toString() {
        return "TransferableViewerState(audioState=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StoryAudioHandler.TransferableState transferableState = this.b;
        if (transferableState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferableState.writeToParcel(parcel, i);
        }
    }
}
