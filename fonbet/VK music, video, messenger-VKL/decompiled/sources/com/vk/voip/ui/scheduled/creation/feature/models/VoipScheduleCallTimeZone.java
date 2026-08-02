package com.vk.voip.ui.scheduled.creation.feature.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: VoipScheduleCallTimeZone.kt */
/* loaded from: classes7.dex */
public final class VoipScheduleCallTimeZone implements Parcelable {
    public static final Parcelable.Creator<VoipScheduleCallTimeZone> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* compiled from: VoipScheduleCallTimeZone.kt */
    public static final class a implements Parcelable.Creator<VoipScheduleCallTimeZone> {
        @Override // android.os.Parcelable.Creator
        public final VoipScheduleCallTimeZone createFromParcel(Parcel parcel) {
            return new VoipScheduleCallTimeZone(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VoipScheduleCallTimeZone[] newArray(int i) {
            return new VoipScheduleCallTimeZone[i];
        }
    }

    public VoipScheduleCallTimeZone(String str, String str2, String str3, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipScheduleCallTimeZone)) {
            return false;
        }
        VoipScheduleCallTimeZone voipScheduleCallTimeZone = (VoipScheduleCallTimeZone) obj;
        return epx.f(this.b, voipScheduleCallTimeZone.b) && epx.f(this.c, voipScheduleCallTimeZone.c) && epx.f(this.d, voipScheduleCallTimeZone.d) && this.e == voipScheduleCallTimeZone.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipScheduleCallTimeZone(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", offset=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
