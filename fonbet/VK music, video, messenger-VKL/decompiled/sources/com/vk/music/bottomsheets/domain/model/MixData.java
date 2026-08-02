package com.vk.music.bottomsheets.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: MixData.kt */
/* loaded from: classes3.dex */
public final class MixData implements Parcelable {
    public static final Parcelable.Creator<MixData> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final MixSettings g;

    /* compiled from: MixData.kt */
    public static final class a implements Parcelable.Creator<MixData> {
        @Override // android.os.Parcelable.Creator
        public final MixData createFromParcel(Parcel parcel) {
            return new MixData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : MixSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MixData[] newArray(int i) {
            return new MixData[i];
        }
    }

    public MixData(String str, String str2, String str3, String str4, boolean z, MixSettings mixSettings) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = mixSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixData)) {
            return false;
        }
        MixData mixData = (MixData) obj;
        return epx.f(this.b, mixData.b) && epx.f(this.c, mixData.c) && epx.f(this.d, mixData.d) && epx.f(this.e, mixData.e) && this.f == mixData.f && epx.f(this.g, mixData.g);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        MixSettings mixSettings = this.g;
        return b + (mixSettings == null ? 0 : mixSettings.hashCode());
    }

    public final String toString() {
        return "MixData(mixId=" + this.b + ", blockId=" + this.c + ", sectionId=" + this.d + ", title=" + this.e + ", isTunable=" + this.f + ", settings=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        MixSettings mixSettings = this.g;
        if (mixSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mixSettings.writeToParcel(parcel, i);
        }
    }
}
