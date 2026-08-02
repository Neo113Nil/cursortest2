package com.vk.dto.games;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes18.dex */
public class GameGenre implements Parcelable {
    public static final Parcelable.Creator<GameGenre> CREATOR = new a();
    public final int b;
    public final String c;

    public class a implements Parcelable.Creator<GameGenre> {
        @Override // android.os.Parcelable.Creator
        public final GameGenre createFromParcel(Parcel parcel) {
            return new GameGenre(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GameGenre[] newArray(int i) {
            return new GameGenre[i];
        }
    }

    public GameGenre(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public GameGenre(Parcel parcel) {
        this(parcel.readInt(), parcel.readString());
    }
}
