package com.vk.clips.viewer.edit.presentation.feature.state.ord;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipsEditOrdState.kt */
/* loaded from: classes17.dex */
public interface ClipsEditOrdState extends Parcelable {

    /* compiled from: ClipsEditOrdState.kt */
    public static final class Disabled implements ClipsEditOrdState {
        public static final Disabled b = new Disabled();
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        /* compiled from: ClipsEditOrdState.kt */
        public static final class a implements Parcelable.Creator<Disabled> {
            @Override // android.os.Parcelable.Creator
            public final Disabled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Disabled.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Disabled[] newArray(int i) {
                return new Disabled[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ClipsEditOrdState.kt */
    public static final class Enabled implements ClipsEditOrdState {
        public static final Enabled b = new Enabled();
        public static final Parcelable.Creator<Enabled> CREATOR = new a();

        /* compiled from: ClipsEditOrdState.kt */
        public static final class a implements Parcelable.Creator<Enabled> {
            @Override // android.os.Parcelable.Creator
            public final Enabled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Enabled.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Enabled[] newArray(int i) {
                return new Enabled[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
