package com.vk.music.bottomsheets.audiobook.person.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: AudioBookPersonModel.kt */
/* loaded from: classes3.dex */
public final class AudioBookPersonModel implements Parcelable {
    public static final Parcelable.Creator<AudioBookPersonModel> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: AudioBookPersonModel.kt */
    public static final class a implements Parcelable.Creator<AudioBookPersonModel> {
        @Override // android.os.Parcelable.Creator
        public final AudioBookPersonModel createFromParcel(Parcel parcel) {
            return new AudioBookPersonModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBookPersonModel[] newArray(int i) {
            return new AudioBookPersonModel[i];
        }
    }

    public AudioBookPersonModel(int i, String str, String str2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookPersonModel)) {
            return false;
        }
        AudioBookPersonModel audioBookPersonModel = (AudioBookPersonModel) obj;
        return this.b == audioBookPersonModel.b && epx.f(this.c, audioBookPersonModel.c) && epx.f(this.d, audioBookPersonModel.d) && this.e == audioBookPersonModel.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookPersonModel(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", shareLink=");
        sb.append(this.d);
        sb.append(", isRestrictedInKidsContext=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
