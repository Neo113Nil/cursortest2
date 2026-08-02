package com.vk.clips.viewer.edit.presentation.feature.state.trends;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: ClipsTrendingHashtagsState.kt */
/* loaded from: classes17.dex */
public interface ClipsTrendingHashtagsState extends Parcelable {

    /* compiled from: ClipsTrendingHashtagsState.kt */
    public static final class Disabled implements ClipsTrendingHashtagsState {
        public static final Disabled b = new Disabled();
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        /* compiled from: ClipsTrendingHashtagsState.kt */
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

    /* compiled from: ClipsTrendingHashtagsState.kt */
    public static final class Enabled implements ClipsTrendingHashtagsState {
        public static final Parcelable.Creator<Enabled> CREATOR = new a();
        public final List<String> b;

        /* compiled from: ClipsTrendingHashtagsState.kt */
        public static final class a implements Parcelable.Creator<Enabled> {
            @Override // android.os.Parcelable.Creator
            public final Enabled createFromParcel(Parcel parcel) {
                return new Enabled(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Enabled[] newArray(int i) {
                return new Enabled[i];
            }
        }

        public Enabled(List<String> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enabled) && epx.f(this.b, ((Enabled) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Enabled(hashtags="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.b);
        }
    }
}
